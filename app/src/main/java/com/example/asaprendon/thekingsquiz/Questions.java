package com.example.asaprendon.thekingsquiz;

/**
 * Created by Alyssa Rendon on 11/17/18 for SacHacks
 */

public class Questions {

    public String mQuestions[] = {
        "What name were the Sacramento Kings known at the beginning of their franchise?",
            "What two coaches won the Coach of the Year award?",
            "What was the name of the first player from this franchise to be part of the Hall of Fame?",
            "What year were the Kings officially relocated to Sacramento?",
            "What was the name of the first Home Arena the Sacramento Kings played?",
            "What is the name of the Sacramento Kings mascot?",
            "What season did the Sacramento Kings make it to the playoffs?",
            "What was the name of the player known as “White Chocolate” that was drafted in 1998?",
            "Who was the last one to this day to win the All-star MVP award?",
            "After what season was the Kings-Lakers rivalry commence?",
            "Which player faced a major knee injury during 2002-03 season that turned the tide against the Kings?",
            "What year did the “Dark Years” start for the Sacramento Kings?",
            "Who is the current head coach?",
            "What has been the worst season so far?",
            "In what year did the Sacramento KIngs draft the first NBA player coming from Indian descent?"

    };


    private String mChoices [][] = {
            {"Connecticut Cougars", "Rochester Royals", "SacTown Robbers", "Sacramento Salamanders" },
            {"Phil Johnson\n Cotton Fitzsimmons", "Rick Adelman \n Jerry Reynolds", "Vinny Del Negro\n Bill Russell", "Dick Motta \nEddie Jordan" },
            {"Oscar Rodgers", "Jerry Lucas", "Bob Davies", "Clyde Lovellette"},
            {"1981", "1985", "1983", "1980"},
            {"ARCO Arena 1", "Shell Arena", "Staples Center", "Round Table Arena"},
            {"Sal the Lion", "Slamson the Lion", "Larry the Lion", "Louis the Lion"},
            {"91-92", "93-94", "95-96", "98-99"},
            {"Jason Williams", "Bob Hansen", "Trevor Wilson", "Randy Brown"},
            {"Lionel Simmons","Jerry Lucas", "Bogdan Bogdanovic", "Mitch Richmond"},
            {"2000-01", "2001-02", "2002-03", "2008-09"},
            {"Jon Brockman", "Bogdan Bogdanovic", "Bob Hurley", "Chris Webber"},
            {"2000", "2003", "2006", "2009"},
            {"Dave Joerger", "Mike Malone", "Tyrone Corbin", "George Karl"},
            {"2005-2006", "2008-2009", "2010-2011", "2016-2017"},
            {"2010","2012","2014", "2018"}

    };

    private String mCorrectAnswers[] = {"Rochester Royals","Phil Johnson\n Cotton Fitzsimmons", "Bob Davies","1985",
            "ARCO Arena 1", "Slamson the Lion", "95-96", "Jason Williams", "Mitch Richmond", "2000-01", "Chris Webber",
            "2006", "Dave Joerger", "2008-2009","2014"
    };

    public String getQuestion(int a){
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a){
        String choice = mChoices[a][0];
        return choice;
    }
    public String getChoice2(int a){
        String choice = mChoices[a][1];
        return choice;
    }
    public String getChoice3(int a){
        String choice = mChoices[a][2];
        return choice;
    }
    public String getChoice4(int a){
        String choice = mChoices[a][3];
        return choice;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;

    }


}
