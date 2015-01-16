package de.ebay.kleinanzeigen.e20_null;

import de.ebay.kleinanzeigen.e20_null.support.User;

import static com.google.common.base.Charsets.UTF_8;
import static com.google.common.hash.Hashing.sha1;
import static java.lang.Long.toHexString;

public class LoginService {


    public static final String EXPECTED_USER = "me@myhost.com";
    public static final String EXPECTED_PASSWORD_HASHED = toHexString(sha1().hashString("i-am-super-cool", UTF_8).asLong());

    public boolean mayLogin(User user) {
        return user.getCredentials().getEmail().equalsIgnoreCase(EXPECTED_USER)
                && user.getCredentials().getHashedPassword().equalsIgnoreCase(EXPECTED_PASSWORD_HASHED);
    }
}
