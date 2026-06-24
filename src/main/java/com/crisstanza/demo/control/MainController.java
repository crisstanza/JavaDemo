package com.crisstanza.demo.control;

import com.crisstanza.demo.constants.Endpoints;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public final class MainController {

    @GetMapping(path = Endpoints.HEALTH)
    public String health() {
        return """
                    { "status": "ok" }
                """;
    }

}
