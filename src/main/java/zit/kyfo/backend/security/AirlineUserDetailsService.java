package zit.kyfo.backend.security;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import zit.kyfo.backend.dao.entity.AirlinesEntity;
import zit.kyfo.backend.dao.repository.AirlinesRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AirlineUserDetailsService implements UserDetailsService {

    private static final String AIRLINE_ROLE = "ROLE_AIRLINE";

    private final AirlinesRepository airlinesRepository;

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        AirlinesEntity airline = airlinesRepository.findByLogin(login)
                .orElseThrow(() -> new UsernameNotFoundException("Airline not found: " + login));
        return new User(
                airline.getLogin(),
                airline.getPasswordHash(),
                List.of(new SimpleGrantedAuthority(AIRLINE_ROLE))
        );
    }
}
