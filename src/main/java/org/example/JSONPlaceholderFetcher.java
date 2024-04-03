package org.example;

import java.net.http.HttpClient;
import java.net.http.HttpResponse;

public class JSONPlaceholderFetcher {

   final HttpClient client = HttpClient.newBuilder().build();

    // używając metody GET, zapytaj o pojedynczy post,
    // używając podanego id przy budowie URI i zwróć ten post;
    public String getSinglePost(int id) {



        return " ";
    }

    // używając metody GET zapytaj o wszystkie posty i zwróć je;

    public String getAllPosts() {
        System.out.println("b : " + "\n");
        return " ";
    }

    // dodaj ciało do swojego zapytania a następnie używając metody POST
    // dodaj nowe dane do istniejącego zasobu. Zwróć true, kiedy operacja
    // zakończy się sukcesem, false, jeśli nie (oprzyj sie o zwrócony kod).

    public boolean addPost(String post){
        System.out.println("c : " + "\n");
        return true;
    }

}
