package com.github.gaalgergo.ein.app.spring;

import com.github.gaalgergo.ein.app.entity.FelhasznaloEntity;
import com.github.gaalgergo.ein.app.repository.FelhasznaloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class EinUserDetailsService implements UserDetailsService {

    @Autowired
    private FelhasznaloRepository repository;

    @Override
    public UserDetails loadUserByUsername(final String username) throws UsernameNotFoundException {
        FelhasznaloEntity felhasznaloEntity = repository.findByFelhasznaloNev(username);
        if (felhasznaloEntity == null) {
            throw new UsernameNotFoundException("a felhasznalo nem található!");
        }
        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
        grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_" + felhasznaloEntity.getTipus().name()));
        return new User(felhasznaloEntity.getFelhasznaloNev(), felhasznaloEntity.getJelszo(), grantedAuthorities);
    }
}
