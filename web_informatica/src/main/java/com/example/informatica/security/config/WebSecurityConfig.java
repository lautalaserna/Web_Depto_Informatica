package com.example.informatica.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.example.informatica.user.UsuarioDetailsService;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{

	@Autowired
	@Qualifier("usuarioDetailsService")
	private UsuarioDetailsService usuarioDetailsService;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.cors().and().csrf().disable()
			.authorizeRequests()
			.antMatchers("/js/**", "/css/**", "/img/**", "/img/novedades/**", "/img/docentes/**").permitAll()
			.antMatchers("/login*").permitAll()
			.antMatchers("/api/**").permitAll()
			.antMatchers("/admin","/admin/").authenticated()
			
			//Roles (Authorities)
			.antMatchers("/admin/usuarios/**").hasAnyAuthority("admin")
			
			.antMatchers("/admin/autoridades/**").hasAnyAuthority("admin","autoridades")
			.antMatchers("/admin/calendario/**").hasAnyAuthority("admin","calendario")
			.antMatchers("/admin/elecciones/**").hasAnyAuthority("admin","elecciones")
			.antMatchers("/admin/graduados/**").hasAnyAuthority("admin","graduados")
			
			.antMatchers("/admin/investigacion/**").hasAnyAuthority("admin","investigacion")
			.antMatchers("/admin/novedades/**").hasAnyAuthority("admin","novedades")
			.antMatchers("/admin/pps/**").hasAnyAuthority("admin","pps")
			.antMatchers("/admin/trabajosfinales/**").hasAnyAuthority("admin","trabajosfinales")
			
			.antMatchers("/admin/areas/**").hasAnyAuthority("admin","areas")
			.antMatchers("/admin/asignaturas/**").hasAnyAuthority("admin","asignaturas")
			.antMatchers("/admin/cargos/**").hasAnyAuthority("admin","cargos")
			.antMatchers("/admin/carreras/**").hasAnyAuthority("admin","carreras")
			
			.antMatchers("/admin/correlativas/**").hasAnyAuthority("admin","correlativas")
			.antMatchers("/admin/dedicacion/**").hasAnyAuthority("admin","dedicacion")
			.antMatchers("/admin/docentes/**").hasAnyAuthority("admin","docentes")
			.antMatchers("/admin/optativas/**").hasAnyAuthority("admin","optativas")
			
			.antMatchers("/admin/planestudio/**").hasAnyAuthority("admin","planestudio")
			.antMatchers("/admin/tipocargo/**").hasAnyAuthority("admin","tipocargo")
			.antMatchers("/admin/tipocarrera/**").hasAnyAuthority("admin","tipocarrera")
		
			.and()
			.formLogin()
			.loginPage("/login")
			.defaultSuccessUrl("/",true)
			.permitAll()
			.and()
			.logout()
			.logoutSuccessUrl("/")
			.permitAll();
	}
	
	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception{
		auth.userDetailsService(usuarioDetailsService).passwordEncoder(passwordEncoder());
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	
}
