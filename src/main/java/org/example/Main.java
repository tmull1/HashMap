package org.example;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String, String> nameToNickname = new HashMap<>();

        // Store the names and nicknames in the HashMap
        nameToNickname.put("matthew", "matt");
        nameToNickname.put("michael", "mix");
        nameToNickname.put("arthur", "artie");


        String matthewsNickname = nameToNickname.get("matthew");
        System.out.println("Matthew's nickname is: " + matthewsNickname);
    }
}

