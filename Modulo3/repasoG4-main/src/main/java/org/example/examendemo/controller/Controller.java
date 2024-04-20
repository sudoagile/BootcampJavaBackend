package org.example.examendemo.controller;

import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class Controller {
    @GetMapping("/hola")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "HTTTP STATUS 200 significa registro exitoso",
                    content = @Content(mediaType = "application/json")
            ),
            @ApiResponse(
                    responseCode = "201",
                    description = "HTTTP STATUS 201 significa que se creó  de manera exitosa",
                    content = @Content(mediaType = "application/json")
            ),
            @ApiResponse(
                    responseCode = "400",
                    description = "HTTTP STATUS 400 significa que tu REQUEST esta MALLLLL",
                    content = @Content(mediaType = "application/json")
            )
    })
    public String hola()
    {
        return "Hola";
    }
}
