package designpattern02day04builderpattern;

/**
 *
 * @author 1999k
 */
public class Test {

    public static void main(String[] args) {

//        User user = new User(1, "Kushada", "kushada@gmail.com", "12345", "Panadura");
//        System.out.println(user);
        User.UserBuilder ub = new User.UserBuilder(1, "Kushada");
//        ub.setId(1);
//        ub.setName("Kushada");
//        ub.setEmail("kushada@gmail.com");
//        ub.setPassword("12345");
//        ub.setCity("Panadura");
        ub.setEmail("kushada@gmail.com").setPassword("12345").setCity("Panadura");
        User user = ub.build();
        System.out.println(user);

    }

}

class User {

    private final int id;
    private final String name;
    private final String email;
    private final String password;
    private final String city;

//    public User(int id, String name, String email, String password, String city) {
//        this.id = id;
//        this.name = name;
//        this.email = email;
//        this.password = password;
//        this.city = city;
//    }
    public User(UserBuilder userBuilder) {
        this.id = userBuilder.id;
        this.name = userBuilder.name;
        this.email = userBuilder.email;
        this.password = userBuilder.password;
        this.city = userBuilder.city;
    }

    public int getId() {
        return id;
    }

//    public void setId(int id) {
//        this.id = id;
//    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public String getEmail() {
        return email;
    }

//    public void setEmail(String email) {
//        this.email = email;
//    }

    public String getPassword() {
        return password;
    }

//    public void setPassword(String password) {
//        this.password = password;
//    }

    public String getCity() {
        return city;
    }

//    public void setCity(String city) {
//        this.city = city;
//    }

    @Override
    public String toString() {  // meka hambenne apita hama class ekema super type wena object class eken apita inherit wena ekak meke specialty eka api class eka athule meka overide nokara api hadapu object eka print karoth apita nknma object eke memeory loocation eka thama print wenene namuth api meka overide karala thibboth apita meka athule dena text eka naththam string value eka api object eka print karana welawedi balaganna puluwan
        String output = "\nId : " + getId() + "\n"
                + "Name : " + getName() + "\n"
                + "Email : " + getEmail() + "\n"
                + "Password : " + getPassword() + "\n"
                + "City : " + getCity() + "\n";

        return output;
    }

    static class UserBuilder {

        private int id;
        private String name;
        private String email;
        private String password;
        private String city;

        public UserBuilder(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public User build() {
//            User user = new User(id, name, email, password, city);
            User user = new User(this);
            return user;
        }

        public UserBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder setPassword(String password) {
            this.password = password;
            return this;
        }

        public UserBuilder setCity(String city) {
            this.city = city;
            return this;
        }

    }

}
