package spring.eshop.Model;

import java.util.List;

public class Seller extends User
{
    public Seller(String username, String password, List<GrantAuthorityImpl> grantAuthorities)
    {
        super(username, password, grantAuthorities);
    }
}
