package com.manti;

import java.util.ArrayList;

public class CommaArraySplitter {
    public void split(ArrayList<String> cities){
        StringBuilder outputBuilder = new StringBuilder();
        for (int i = 0; i < cities.size(); i++){
            outputBuilder.append(cities.get(i));
            outputBuilder.append(", ");
        }
        String output = outputBuilder.toString();
        System.out.println(output.substring(0, output.length()-2) + ".");
    }
}
