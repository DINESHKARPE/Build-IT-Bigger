/*
 * Copyright 2016.  Dinesh Karpe <contact@dineshkarpe.me>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.udacity.jokes;

import java.util.Random;

public class LaughFactory {


    public static String randomJoke() {

        Random rand = new Random();
        int randomNum = rand.nextInt((jokeArray.length));
        return jokeArray[randomNum].getSetupline()+"\n"+"\n"+jokeArray[randomNum].getPunchline();
    }

    private static Joke[] jokeArray =  {
            new Joke("A guy walks into a bar and asks for 1.014 root beers.\n\n" +
                    "The bartender says, \"I\'ll have to charge you extra, that's a root beer float\"",
                    "So the guy says, \"In that case, better make it a double.\""),
            new Joke("There are 10 kinds of people in this world." ,
                    "Those who understand binary, those who don't"),
            new Joke("An SEO expert walks into a bar, pub, public house, inn, restaurant, club." ,
                    "That's the joke"),
            new Joke("Why is it that women find C to be more attractive than Java?" ,
                    "Because C doesn’t treat them like objects."),

            new Joke("How do you know the moon is going broke?",
                    "It's down to it's last quarter"),
            new Joke("Why can't you trust atoms?",
                    "They make up everything"),
            new Joke("A neutron walks into a bar, and asks the bartender \"How much for a drink?\"",
                    "For you, no charge"),
            new Joke("What does a subatomic duck say?" ,
                    "Quark"),
            new Joke("What do you call an educated tube?" ,
                    "A graduated cylinder"),
            new Joke("What do you call a Divinely Shaped Wave?" ,
                    "A Sine from God"),
            new Joke("Do you know any good jokes about Sodium?" ,
                    "Na"),
            new Joke("Tell me a joke about Potassium." ,
                    "K"),
    };

}
