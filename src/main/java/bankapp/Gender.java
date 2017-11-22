package bankapp;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum Gender {
    MALE("Mr."), FEMALE("Ms.");

    @Getter
    private String greeting;
}
