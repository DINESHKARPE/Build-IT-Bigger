package com.udacity.jokes;

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

public class Joke {

    private String setupline;
    private String punchline;


        public Joke(String setupline, String punchline) {
            this.setupline = setupline;
            this.punchline = punchline;
        }


        public String getSetupline() {
            return setupline;
        }

        public void setSetupline(String setupline) {
            this.setupline = setupline;
        }

        public String getPunchline() {
            return punchline;
        }

        public void setPunchline(String punchline) {
            this.punchline = punchline;
        }
}
