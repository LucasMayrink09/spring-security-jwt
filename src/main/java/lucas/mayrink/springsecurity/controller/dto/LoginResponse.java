package lucas.mayrink.springsecurity.controller.dto;

public record LoginResponse(String accessToken, Long expiresIn) {
}
