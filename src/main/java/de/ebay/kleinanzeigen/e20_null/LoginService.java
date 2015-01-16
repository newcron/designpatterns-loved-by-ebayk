package de.ebay.kleinanzeigen.e20_null;

import de.ebay.kleinanzeigen.e20_null.support.User;

import static com.google.common.base.Charsets.UTF_8;
import static com.google.common.hash.Hashing.sha1;
import static java.lang.Long.toHexString;

public class LoginService {


    public boolean mayLogin(User user) {
        if (user.getCredentials() == null) {
            return false;
        }
        return "me@myhost.com".equalsIgnoreCase(user.getCredentials().getEmail())
                && toHexString(sha1().hashString("i-am-super-cool", UTF_8).asLong()).equalsIgnoreCase(user.getCredentials().getHashedPassword());
    }
}
