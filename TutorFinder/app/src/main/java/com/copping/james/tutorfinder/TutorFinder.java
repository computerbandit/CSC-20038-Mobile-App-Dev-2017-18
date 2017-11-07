package com.copping.james.tutorfinder;

/**
 * Created by James on 07/11/2017.
 */

public class TutorFinder {

    public static String getInfo(String code) {
        switch (code) {
            case "CHE-20019":
                return "CHE-20019 \tCrime, Science and Investigation \t \n" +
                        "Co-ordinator: \tMiss Susan Shemilt   Tel:+44 1782 7 33045 \t \n" +
                        "Lecture Time: \tSee Timetable... \t \n" +
                        "Level: \tLevel 5 \tCredits: \t15 \tStudy Hours: \t150";

            case "CSC-20037":
                return "CSC-20037 \tProgramming II - Data Structures and Algorithms \t \n" +
                        "Co-ordinator: \tMr D Collins    Room: CR121, Tel:+44 1782 7 33251 \t \n" +
                        "Lecture Time: \tSee Timetable... \t \n" +
                        "Level: \tLevel 5 \tCredits: \t15 \tStudy Hours: \t150 \t \n" +
                        "School Office: \tTel: 01782 733075";

            case "CSC-20038":
                return "CSC-20038 \tMobile Application Development \t \n" +
                        "Co-ordinator: \tDr Theo Kyriacou    Room: CR103, Tel:+44 1782 7 33080 \t \n" +
                        "Lecture Time: \tSee Timetable... \t \n" +
                        "Level: \tLevel 5 \tCredits: \t15 \tStudy Hours: \t150 \t \n" +
                        "School Office: \tTel: 01782 733075";

            case "CSC-20021":
                return "CSC-20021 \tWeb Technologies \t \n" +
                        "Co-ordinator: \tDr Goksel Misirli   Tel:+44 1782 7 34028 \t \n" +
                        "Lecture Time: \tSee Timetable... \t \n" +
                        "Level: \tLevel 5 \tCredits: \t15 \tStudy Hours: \t\t \n" +
                        "School Office: \tTel: 01782 733075";

            default:
                return "The is no content to show for this selection";

        }
    }
}
