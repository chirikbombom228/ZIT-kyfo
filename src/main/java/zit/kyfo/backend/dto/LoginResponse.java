package zit.kyfo.backend.dto;

public record LoginResponse(
        Integer id,
        String name,
        String login,
        boolean authenticated
) {
}
