package spring.eshop.Model;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Repository
public class UserDao {

    PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    List<User> userList = Arrays.asList(
            new User("customer", passwordEncoder.encode("pass"),
                    Arrays.asList(new GrantAuthorityImpl("ROLE_CUSTOMER"))),
            new User("admin", passwordEncoder.encode("pass"),
                    Arrays.asList(new GrantAuthorityImpl("ROLE_ADMIN"))),
            new User("seller",passwordEncoder.encode("pass"),
                    Arrays.asList(new GrantAuthorityImpl("ROLE_SELLER")))
            );

    User loadUserByUsername(String username) {
        User user = null;
        Optional<User> userOptional = userList.stream().filter(e -> e.getUsername().equals(username)).findFirst();
        if(userOptional.isPresent()){
            user= userOptional.get();
        }else {
            throw new RuntimeException("User not found");
        }

        return user;
    }
}

