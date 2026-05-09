package br.com.fiap.checkPoint05.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
@Tag(name = "Health Check", description = "Verifica se a aplicação está no ar")
public class HealthController {

    @GetMapping
    @Operation(
        summary = "Verifica o status da aplicação",
        description = "Retorna uma mensagem confirmando que a API está disponível",
        responses = {
            @ApiResponse(
                responseCode = "200",
                description = "Aplicação está no ar",
                content = @Content(schema = @Schema(example = "Estou de pé"))
            )
        }
    )
    public ResponseEntity<String> health() {
        return ResponseEntity.ok("Estou de pé");
    }
}
