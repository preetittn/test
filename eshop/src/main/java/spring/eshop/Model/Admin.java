package spring.eshop.Model;

import java.util.List;

public class Admin extends User
{
    public Admin(String username, String password, List<GrantAuthorityImpl> grantAuthorities)
    {
        super(username, password, grantAuthorities);
    }
}
