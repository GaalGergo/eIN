package com.github.gaalgergo.ein.app.spring;

import com.github.gaalgergo.ein.app.entity.FelhasznaloEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

@Data
@EqualsAndHashCode(callSuper = true)
public class SpringEinFelhasznalo extends User {
    private FelhasznaloEntity felhasznaloEntity;

    public SpringEinFelhasznalo(
            final String username,
            final String password,
            final Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities);
    }
}
