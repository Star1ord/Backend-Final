package com.nurzhasisthegreatest.final_goi_mynau;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.io.Serial;
import java.util.Collection;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PersonAuthDTO extends User {

    @Serial
    private static final long serialVersionUID = 2221224012277831993L;

    Long userId;

    String email;

    public PersonAuthDTO(Long userId, String username, String password, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities);
        this.email = username;
        this.userId = userId;
    }
}