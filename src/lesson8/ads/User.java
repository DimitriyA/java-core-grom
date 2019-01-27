package lesson8.ads;

    public class User extends BaseEntity{
    int id;
        String userName;
        String location;

        public User(int id, String userName, String location) {
            super(id);
            this.userName = userName;
            this.location = location;
        }
    }
