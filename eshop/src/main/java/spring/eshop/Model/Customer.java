package spring.eshop.Model;

import java.util.List;

public class Customer extends User
{
    public Customer(String username, String password, List<GrantAuthorityImpl> grantAuthorities)
    {
        super(username, password, grantAuthorities);
    }
}
