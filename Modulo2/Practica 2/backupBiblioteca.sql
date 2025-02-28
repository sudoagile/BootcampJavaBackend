PGDMP       '                |            biblioteca.sql    16.2    16.2 '    5           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            6           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            7           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            8           1262    16715    biblioteca.sql    DATABASE     r   CREATE DATABASE "biblioteca.sql" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'C';
     DROP DATABASE "biblioteca.sql";
                postgres    false            �            1259    16797    autores    TABLE     b   CREATE TABLE public.autores (
    autor_id integer NOT NULL,
    nombre character varying(100)
);
    DROP TABLE public.autores;
       public         heap    postgres    false            �            1259    16836    autores_libros    TABLE     o   CREATE TABLE public.autores_libros (
    autor_id integer NOT NULL,
    isbn character varying(20) NOT NULL
);
 "   DROP TABLE public.autores_libros;
       public         heap    postgres    false            �            1259    16802 
   categorias    TABLE     i   CREATE TABLE public.categorias (
    categoria_id integer NOT NULL,
    nombre character varying(100)
);
    DROP TABLE public.categorias;
       public         heap    postgres    false            �            1259    16813    lectores    TABLE     d   CREATE TABLE public.lectores (
    lector_id integer NOT NULL,
    nombre character varying(100)
);
    DROP TABLE public.lectores;
       public         heap    postgres    false            �            1259    16812    lectores_lector_id_seq    SEQUENCE     �   CREATE SEQUENCE public.lectores_lector_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 -   DROP SEQUENCE public.lectores_lector_id_seq;
       public          postgres    false    219            9           0    0    lectores_lector_id_seq    SEQUENCE OWNED BY     Q   ALTER SEQUENCE public.lectores_lector_id_seq OWNED BY public.lectores.lector_id;
          public          postgres    false    218            �            1259    16807    libros    TABLE     n   CREATE TABLE public.libros (
    isbn character varying(20) NOT NULL,
    "título" character varying(200)
);
    DROP TABLE public.libros;
       public         heap    postgres    false            �            1259    16851    libros_categorias    TABLE     v   CREATE TABLE public.libros_categorias (
    isbn character varying(20) NOT NULL,
    categoria_id integer NOT NULL
);
 %   DROP TABLE public.libros_categorias;
       public         heap    postgres    false            �            1259    16820 	   prestamos    TABLE     �   CREATE TABLE public.prestamos (
    prestamo_id integer NOT NULL,
    fecha_prestamo date,
    fecha_devolucion_esperada date,
    isbn character varying(20),
    lector_id integer
);
    DROP TABLE public.prestamos;
       public         heap    postgres    false            �            1259    16819    prestamos_prestamo_id_seq    SEQUENCE     �   CREATE SEQUENCE public.prestamos_prestamo_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 0   DROP SEQUENCE public.prestamos_prestamo_id_seq;
       public          postgres    false    221            :           0    0    prestamos_prestamo_id_seq    SEQUENCE OWNED BY     W   ALTER SEQUENCE public.prestamos_prestamo_id_seq OWNED BY public.prestamos.prestamo_id;
          public          postgres    false    220            �           2604    16816    lectores lector_id    DEFAULT     x   ALTER TABLE ONLY public.lectores ALTER COLUMN lector_id SET DEFAULT nextval('public.lectores_lector_id_seq'::regclass);
 A   ALTER TABLE public.lectores ALTER COLUMN lector_id DROP DEFAULT;
       public          postgres    false    219    218    219            �           2604    16823    prestamos prestamo_id    DEFAULT     ~   ALTER TABLE ONLY public.prestamos ALTER COLUMN prestamo_id SET DEFAULT nextval('public.prestamos_prestamo_id_seq'::regclass);
 D   ALTER TABLE public.prestamos ALTER COLUMN prestamo_id DROP DEFAULT;
       public          postgres    false    220    221    221            *          0    16797    autores 
   TABLE DATA           3   COPY public.autores (autor_id, nombre) FROM stdin;
    public          postgres    false    215   �,       1          0    16836    autores_libros 
   TABLE DATA           8   COPY public.autores_libros (autor_id, isbn) FROM stdin;
    public          postgres    false    222   u-       +          0    16802 
   categorias 
   TABLE DATA           :   COPY public.categorias (categoria_id, nombre) FROM stdin;
    public          postgres    false    216   �-       .          0    16813    lectores 
   TABLE DATA           5   COPY public.lectores (lector_id, nombre) FROM stdin;
    public          postgres    false    219   �-       ,          0    16807    libros 
   TABLE DATA           1   COPY public.libros (isbn, "título") FROM stdin;
    public          postgres    false    217   W.       2          0    16851    libros_categorias 
   TABLE DATA           ?   COPY public.libros_categorias (isbn, categoria_id) FROM stdin;
    public          postgres    false    223   k/       0          0    16820 	   prestamos 
   TABLE DATA           l   COPY public.prestamos (prestamo_id, fecha_prestamo, fecha_devolucion_esperada, isbn, lector_id) FROM stdin;
    public          postgres    false    221   �/       ;           0    0    lectores_lector_id_seq    SEQUENCE SET     E   SELECT pg_catalog.setval('public.lectores_lector_id_seq', 10, true);
          public          postgres    false    218            <           0    0    prestamos_prestamo_id_seq    SEQUENCE SET     H   SELECT pg_catalog.setval('public.prestamos_prestamo_id_seq', 10, true);
          public          postgres    false    220            �           2606    16840 "   autores_libros autores_libros_pkey 
   CONSTRAINT     l   ALTER TABLE ONLY public.autores_libros
    ADD CONSTRAINT autores_libros_pkey PRIMARY KEY (autor_id, isbn);
 L   ALTER TABLE ONLY public.autores_libros DROP CONSTRAINT autores_libros_pkey;
       public            postgres    false    222    222            �           2606    16801    autores autores_pkey 
   CONSTRAINT     X   ALTER TABLE ONLY public.autores
    ADD CONSTRAINT autores_pkey PRIMARY KEY (autor_id);
 >   ALTER TABLE ONLY public.autores DROP CONSTRAINT autores_pkey;
       public            postgres    false    215            �           2606    16806    categorias categorias_pkey 
   CONSTRAINT     b   ALTER TABLE ONLY public.categorias
    ADD CONSTRAINT categorias_pkey PRIMARY KEY (categoria_id);
 D   ALTER TABLE ONLY public.categorias DROP CONSTRAINT categorias_pkey;
       public            postgres    false    216            �           2606    16818    lectores lectores_pkey 
   CONSTRAINT     [   ALTER TABLE ONLY public.lectores
    ADD CONSTRAINT lectores_pkey PRIMARY KEY (lector_id);
 @   ALTER TABLE ONLY public.lectores DROP CONSTRAINT lectores_pkey;
       public            postgres    false    219            �           2606    16855 (   libros_categorias libros_categorias_pkey 
   CONSTRAINT     v   ALTER TABLE ONLY public.libros_categorias
    ADD CONSTRAINT libros_categorias_pkey PRIMARY KEY (isbn, categoria_id);
 R   ALTER TABLE ONLY public.libros_categorias DROP CONSTRAINT libros_categorias_pkey;
       public            postgres    false    223    223            �           2606    16811    libros libros_pkey 
   CONSTRAINT     R   ALTER TABLE ONLY public.libros
    ADD CONSTRAINT libros_pkey PRIMARY KEY (isbn);
 <   ALTER TABLE ONLY public.libros DROP CONSTRAINT libros_pkey;
       public            postgres    false    217            �           2606    16825    prestamos prestamos_pkey 
   CONSTRAINT     _   ALTER TABLE ONLY public.prestamos
    ADD CONSTRAINT prestamos_pkey PRIMARY KEY (prestamo_id);
 B   ALTER TABLE ONLY public.prestamos DROP CONSTRAINT prestamos_pkey;
       public            postgres    false    221            �           2606    16841 +   autores_libros autores_libros_autor_id_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.autores_libros
    ADD CONSTRAINT autores_libros_autor_id_fkey FOREIGN KEY (autor_id) REFERENCES public.autores(autor_id);
 U   ALTER TABLE ONLY public.autores_libros DROP CONSTRAINT autores_libros_autor_id_fkey;
       public          postgres    false    3464    215    222            �           2606    16846 '   autores_libros autores_libros_isbn_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.autores_libros
    ADD CONSTRAINT autores_libros_isbn_fkey FOREIGN KEY (isbn) REFERENCES public.libros(isbn);
 Q   ALTER TABLE ONLY public.autores_libros DROP CONSTRAINT autores_libros_isbn_fkey;
       public          postgres    false    217    222    3468            �           2606    16861 5   libros_categorias libros_categorias_categoria_id_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.libros_categorias
    ADD CONSTRAINT libros_categorias_categoria_id_fkey FOREIGN KEY (categoria_id) REFERENCES public.categorias(categoria_id);
 _   ALTER TABLE ONLY public.libros_categorias DROP CONSTRAINT libros_categorias_categoria_id_fkey;
       public          postgres    false    216    3466    223            �           2606    16856 -   libros_categorias libros_categorias_isbn_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.libros_categorias
    ADD CONSTRAINT libros_categorias_isbn_fkey FOREIGN KEY (isbn) REFERENCES public.libros(isbn);
 W   ALTER TABLE ONLY public.libros_categorias DROP CONSTRAINT libros_categorias_isbn_fkey;
       public          postgres    false    223    3468    217            �           2606    16826    prestamos prestamos_isbn_fkey    FK CONSTRAINT     |   ALTER TABLE ONLY public.prestamos
    ADD CONSTRAINT prestamos_isbn_fkey FOREIGN KEY (isbn) REFERENCES public.libros(isbn);
 G   ALTER TABLE ONLY public.prestamos DROP CONSTRAINT prestamos_isbn_fkey;
       public          postgres    false    3468    217    221            �           2606    16831 "   prestamos prestamos_lector_id_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.prestamos
    ADD CONSTRAINT prestamos_lector_id_fkey FOREIGN KEY (lector_id) REFERENCES public.lectores(lector_id);
 L   ALTER TABLE ONLY public.prestamos DROP CONSTRAINT prestamos_lector_id_fkey;
       public          postgres    false    219    3470    221            *   �   x�-�1nA�z|
� ��� �"��h��f�hv�x�nCIAE�v.��(-}��nMw��:\E��nT���5�	>�R�|C�ډ���5u0rE<(ׂ3=W����m�Kc�L�j7��G��P�Y>MkG�V��/W�JGj̏5GiHa��椶慆|=�O���k�o�E�ݢ������M.�����{ ���M�      1      x������ � �      +   K   x�3�t�LN�<�9�ˈ�9�������b.cN�̒ԢĒҢD��Ԣ�ļD.N��Լ��)�k^qbe>W� 8GV      .   Z   x�3��*M��2��M,:�6�˘3 5�(�˄�1/�˔ӧ4��ˌ�'��(�˜�9�('��˂38?�ܒ�%35=��Ѐ�5'�#F��� ��      ,     x�M��N� @��+�4�P����i�7/�c7,4tk���W�c��j�����xG7R����1�8��2�k-s�/��^Ke�C�ӒC�8��4��1�T����V욢~��Z^ב���F4�P��|uM\�4.�j��[�in{�b�H�}���!E�J�}��k���5�5�s��k�z���/�Vi�+���>Bb��8��98�g���)�dI��%�s�<����>BB�֋��aƒ�v΅s+|����<�m�      2      x������ � �      0   �   x�M�Kn1�5�e"��|���c:���K~`�����r��92�/C�8A
��B�A�qC�+?�5w"�Sy`)�Xx�/�p2�4	=�c>���tgLB��B.�Z�9U��Z��q/ci��.)�0[s'&<Wb�b��������]Fa+���!�ͺ�L��T�oCI�     