package org.example;

import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) {

//        UserApiHandler apiHandler = new UserApiHandler();
//        HttpResponse<String> response = apiHandler.getUserDate(1);
//
//        System.out.println(response.statusCode());
//        System.out.println(response.body());
//        System.out.println(response.headers());



//        UserApiHandler apiHandler = new UserApiHandler();
//        HttpResponse<String> response = apiHandler.postUserData(" {\n" +
//                "    \"id\": 1,\n" +
//                "    \"name\": \"Leanne Graham\",\n" +
//                "    \"username\": \"Bret\",\n" +
//                "    \"email\": \"Sincere@april.biz\",\n" +
//                "    \"address\": {\n" +
//                "      \"street\": \"Kulas Light\",\n" +
//                "      \"suite\": \"Apt. 556\",\n" +
//                "      \"city\": \"Gwenborough\",\n" +
//                "      \"zipcode\": \"92998-3874\",\n" +
//                "      \"geo\": {\n" +
//                "        \"lat\": \"-37.3159\",\n" +
//                "        \"lng\": \"81.1496\"\n" +
//                "      }\n" +
//                "    },\n" +
//                "    \"phone\": \"1-770-736-8031 x56442\",\n" +
//                "    \"website\": \"hildegard.org\",\n" +
//                "    \"company\": {\n" +
//                "      \"name\": \"Romaguera-Crona\",\n" +
//                "      \"catchPhrase\": \"Multi-layered client-server neural-net\",\n" +
//                "      \"bs\": \"harness real-time e-markets\"\n" +
//                "    }\n" +
//                "  }");
//
//        System.out.println(response.statusCode());
//        System.out.println(response.body());
//        System.out.println(response.headers());


//
//                UserApiHandler apiHandler = new UserApiHandler();
//                HttpResponse<String> response = apiHandler.getUserDate(1);
//
//                User user = UserMapper.convertJSONToUser(response.body());
//                System.out.println(user);


        UserApiHandler apiHandler = new UserApiHandler();
        UserService userService = new UserService(apiHandler);

        System.out.println(userService.getUserById(1));


    }
}