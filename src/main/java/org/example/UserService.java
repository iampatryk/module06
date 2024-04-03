package org.example;

import java.net.http.HttpResponse;

public class UserService {
    private final UserApiHandler apiHandler;
    public UserService(UserApiHandler apiHandler) {
        this.apiHandler = apiHandler;
    }

    public User getUserById(int id) {

        HttpResponse<String> response = apiHandler.getUserDate(id);
        if(response.statusCode() == 200) {
            return UserMapper.convertJSONToUser(response.body());
        } else {
            throw new RuntimeException();
        }
    }

}
