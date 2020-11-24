package pl.domanski.equipy.components.user;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.CONFLICT, reason = "Użytkownik z takim peselem nie istenieje")
public class DuplicatePeselException extends RuntimeException {
}
