package pl.domanski.equipy.components.inventory.asset;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason="Brak wypożyczenia o takim ID")
public class AssetNotFoundException extends RuntimeException{
}
