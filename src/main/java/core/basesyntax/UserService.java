package core.basesyntax;

import core.basesyntax.exception.UserNotFoundException;

public class UserService {
    public int getUserScore(String[] records, String email) {
        for (String user : records) {
            String [] emailAndScoreForUser = user.split(":");
            if (emailAndScoreForUser.length == 2 && emailAndScoreForUser[0].equals(email)) {
                return Integer.parseInt(emailAndScoreForUser[1]);
            }
        }
        throw new UserNotFoundException("User with given email doesn't exist");
    }
}
