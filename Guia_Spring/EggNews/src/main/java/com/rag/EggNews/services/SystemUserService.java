/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rag.EggNews.services;

import com.rag.EggNews.entities.SystemUser;
import com.rag.EggNews.enums.Role;
import com.rag.EggNews.exceptions.MyException;
import java.util.ArrayList;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import com.rag.EggNews.repositories.SystemUserRepository;

/**
 *
 * @author Usuario
 */
@Service
public class SystemUserService implements UserDetailsService{
    
    @Autowired
    private SystemUserRepository systemUserRepository;
    
    @Transactional
    public void register(String email, String password1, String password2) throws MyException {
        
        validate(email, password1, password2);
        
        SystemUser user = new SystemUser();
        
        user.setEmail(email);
        user.setPassword(new BCryptPasswordEncoder().encode(password1));
        user.setRole(Role.USER);
        
        systemUserRepository.save(user);

    }
    
    private void validate(String email, String password1, String password2) throws MyException {
        
        if (email.isEmpty() || email == null) {
            throw new MyException("E-mail is required.");
        }
        
        if (password1.isEmpty() || password1 == null || password1.length() < 6) {
            throw new MyException("Password must have at least 6 characters.");
        }
        
        if (password2.isEmpty() || password2 == null) {
            throw new MyException("Password must have at least 6 characters.");
        }
        
        if (!password1.equals(password2)) {
            throw new MyException("Both passwords must be the same.");
        }
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        SystemUser systemUser = systemUserRepository.searchByEmail(email);
        
        if (systemUser != null) {
            
            List<GrantedAuthority> permissions = new ArrayList();
            
            GrantedAuthority p = new SimpleGrantedAuthority("ROLE_" + systemUser.getRole().toString());
            
            permissions.add(p);
            
            return new User(systemUser.getEmail(), systemUser.getPassword(), permissions);
        } else {
            return null;
        }
        
    }
}

//            List<GrantedAuthority> permisos = new ArrayList();
//
//            GrantedAuthority p = new SimpleGrantedAuthority("ROLE_" + usuario.getRol().toString());
//
//            permisos.add(p);
//
//            ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
//
//            HttpSession session = attr.getRequest().getSession(true);
//
//            session.setAttribute("usuariosession", usuario);
//
//            return new SystemUser(usuario.getEmail(), usuario.getPassword(), permisos);
