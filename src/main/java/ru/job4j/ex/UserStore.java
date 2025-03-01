package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User found = null;
        for (User user : users) {
            if (user != null && login.equals(user.getUsername())) {
                found = user;
                break;
            }
        }
        if (found == null) {
            throw new UserNotFoundException("User not found!");
        }
        return found;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getUsername().length() < 3) {
            throw new UserInvalidException("User is not valid or its username contains less than 3 characters!");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true),
        };
        try {
            User user = findUser(users, "Petr Arsentev");
            validate(user);
        } catch (UserInvalidException ex) {
            System.out.println("User is not valid!");
        } catch (UserNotFoundException ex) {
            System.out.println("User is not found!");
        }
    }
}