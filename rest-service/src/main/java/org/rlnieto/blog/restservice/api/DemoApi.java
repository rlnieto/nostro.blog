package org.rlnieto.blog.restservice.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoApi {

    @GetMapping("/holaMundo")
    public ResponseEntity holaMundo(){
        String respuesta = "Hola mundo";

        return ResponseEntity
                .status(200)
                .body(respuesta);
    }

}
