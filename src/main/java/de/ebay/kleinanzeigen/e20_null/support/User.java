package de.ebay.kleinanzeigen.e20_null.support;

import com.google.common.base.Preconditions;

import java.util.Optional;

public class User {

    private long userId;

    private Credentials credentials;

    private Optional<Address> address;

    public User(long userId, Credentials credentials, Optional<Address> address) {
        Preconditions.checkNotNull(credentials);
        Preconditions.checkNotNull(address);

        this.userId = userId;
        this.credentials = credentials;
        this.address = address;
    }

    public long getUserId() {
        return userId;
    }


    public Credentials getCredentials() {
        return credentials;
    }

    public Optional<Address> getAddress() {
        return address;
    }




    public static class Address {
        private final String street, zip, city;

        public Address(String street, String zip, String city) {
            Preconditions.checkNotNull(street);
            Preconditions.checkNotNull(zip);
            Preconditions.checkNotNull(city);
            this.street = street;
            this.zip = zip;
            this.city = city;
        }

        public String getStreet() {
            return street;
        }


        public String getZip() {
            return zip;
        }


        public String getCity() {
            return city;
        }

    }

    public static class Credentials {
        private final String email;
        private final String hashedPassword;


        public Credentials(String email, String hashedPassword) {
            Preconditions.checkNotNull(email);
            Preconditions.checkNotNull(hashedPassword);
            this.email = email;
            this.hashedPassword = hashedPassword;
        }

        public String getEmail() {
            return email;
        }

        public String getHashedPassword() {
            return hashedPassword;
        }


    }
}
