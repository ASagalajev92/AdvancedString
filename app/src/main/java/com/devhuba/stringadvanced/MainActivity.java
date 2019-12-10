package com.devhuba.stringadvanced;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.PathEffect;
import android.os.Bundle;
import android.util.Log;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Splitting of a string array.//

        String nameString = "Bob, Marci, Charley, Alex, Brock, Man";
        String[] names = nameString.split(", ");
        for (String name : names) {
            Log.i("MyName",name);
        }


        // Substring method in string

        String geometry = "Geometry";
        String meter = geometry.substring(3,7);
        Log.i("Meter", meter);


        // Long string searching with patterns and matchers + while cycle

        String url = "<div class=\"image\">\n" +
                "\t\t\t\t\t\t<img src=\"http://cdn.posh24.se/images/:profile/04e3e4db7b764c66b5437de543f1c652c\" alt=\"Kylie Jenner\"/>\n" +
                "\t\t\t\t\t</div>";
        Pattern patternImg = Pattern.compile("<img src=\"(.*?)\""); // Creating pattern object for url
        Pattern patternName = Pattern.compile("alt=\"(.*?)\"/>"); // Creating pattern object for name
        Matcher matcherImage = patternImg.matcher(url); // Creating tool that checks all text to matches for pattern
        Matcher matcherName = patternName.matcher(url); // Creating tool that checks all text to matches for pattern
        while (matcherImage.find() & matcherName.find()) {
            Log.i("MyName",matcherImage.group(1));
            Log.i("MyName",matcherName.group(1));

        }
    }

