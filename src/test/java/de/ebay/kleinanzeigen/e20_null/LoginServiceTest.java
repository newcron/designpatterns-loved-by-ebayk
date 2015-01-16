package de.ebay.kleinanzeigen.e20_null;

import de.ebay.kleinanzeigen.e20_null.support.User;
import de.ebay.kleinanzeigen.e20_null.support.User.Credentials;
import org.junit.Test;

import java.util.Optional;

import static com.google.common.base.Charsets.UTF_8;
import static com.google.common.hash.Hashing.sha1;
import static java.lang.Long.toHexString;
import static org.assertj.core.api.Assertions.assertThat;

public class LoginServiceTest  {


    @Test
    public void successfullyAuthenticates() {
        User user = new User(123l, new Credentials("me@myhost.com", toHexString(sha1().hashString("i-am-super-cool", UTF_8).asLong())), Optional.empty());

        assertThat(new LoginService().mayLogin(user)).isTrue();
    }
}
