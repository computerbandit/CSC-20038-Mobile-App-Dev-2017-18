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

    public static String getDetailedInfo(String code) {
        switch (code) {
            case "CHE-20019":
                return "Description for 2017/18\n" +
                        "\n" +
                        "This module provides both an overview and highlights of techniques in forensic investigation together with more in-depth study of crime scene investigation. It aims to inform and educate a general audience in the application of scientific principles and methods to the investigation of crime. It is designed for students who are not studying forensic science as a degree subject yet are interested in acquiring an understanding of the principles and practice of the scientific investigation of crime and the strategies employed by the professionals in its implementation. It will therefore appeal to both science and non-science degree students.\n" +
                        "\n" +
                        "Talis Aspire Reading List\n" +
                        "Any reading lists will be provided by the start of the course.\n" +
                        "\n" +
                        "http://lists.lib.keele.ac.uk/modules/che-20019/lists\n" +
                        "\n" +
                        "Aims\n" +
                        "\n" +
                        "This module provides both an overview and highlights of techniques in forensic investigation together with more in-depth study of crime scene investigation. It aims to inform and educate a general audience in the application of scientific principles and methods to the investigation of crime. It is designed for students who are not studying forensic science as a degree subject yet are interested in acquiring an understanding of the principles and practice of the scientific investigation of crime and the strategies employed by the professionals in its implementation.\n" +
                        "\n" +
                        "\n" +
                        "Intended Learning Outcomes\n" +
                        "\n" +
                        "demonstrate understanding and critically evaluate the role and operation of forensic science in the investigation of crime: 1,3,\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "describe and explain the scientific principles underpinning selected areas of forensic science: 1,2,\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "demonstrate competent practical skills in forensic measurement and critically report findings: 2,\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "analyse a crime scene scenario and be able to formulate strategies for its successful forensic investigation: 3,\n";

            case "CSC-20037":
                return " \n" +
                        "Programme/Approved Electives for\n" +
                        "\n" +
                        "Computer Science Dual Honours (Level 5)\n" +
                        "Computer Science Major (Level 5)\n" +
                        "Computer Science Minor (Level 5)\n" +
                        "\n" +
                        "Available as a Free Standing Elective\n" +
                        "\n" +
                        "No\n" +
                        "\n" +
                        "Barred Combinations\n" +
                        "\n" +
                        "None\n" +
                        "\n" +
                        "Prerequisites\n" +
                        "\n" +
                        "Programming I (or equivalent experience)\n" +
                        "\n" +
                        "Description for 2017/18\n" +
                        "\n" +
                        "In this module students learn about the important properties of some data structures and algorithms that are of foundational importance to modern computer science and IT. As they do so, there is ample opportunity to develop and practice their general purpose computer programming skills so that in the future they are able to develop their own software solutions to straightforward problems.\n" +
                        "\n" +
                        "The module develops the following Keele Graduate attributes:\n" +
                        "1. Opening and questioning approach to ideas, demonstrating curiosity, independence of thought and the ability to appreciate a range of perspectives on the natural and social worlds;\n" +
                        "4. The ability creatively to solve problems using a range of different approaches and techniques, and to determine which techniques are appropriate for the issue at hand;\n" +
                        "6. The ability to communicate clearly and effectively in written and verbal forms for different purposes and to a variety of audiences;\n" +
                        "7. The knowledge, skills, self-confidence and self-awareness actively to pursue your future goals;\n" +
                        "9. Professional and reflective approach, including qualities of leadership, responsibility, personal integrity, empathy, care and respect for others, accountability and self-regulation;\n" +
                        "10. The flexibility to thrive in rapidly changing and uncertain external environments and to update skills and knowledge as circumstances require.\n" +
                        "\n" +
                        "\n" +
                        "Aims\n" +
                        "\n" +
                        "To develop new programming skills as part of an exploration of several important data structures and algorithms used in Computer Science.\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Intended Learning Outcomes\n" +
                        "\n" +
                        "write a program that demonstrates important features of computer programming using an object oriented programming language; will be achieved by assessments: 1\n" +
                        "select class, data and control structures for program-based problem-solving; will be achieved by assessments: 1 and 2\n" +
                        "describe, explain and evaluate the principles and operation of several data structures that are widely used in computer science; will be achieved by assessments: 2\n" +
                        "use a programming language to operate, test and evaluate one or more of the widely used computer science data structures. will be achieved by assessments: 1\n" +
                        "\n" +
                        "\n" +
                        "Study hours\n" +
                        "\n" +
                        "24 hours lectures\n" +
                        "19 hours practical lab classes\n" +
                        "8 hours small group tutorial work\n" +
                        "97 hours self study, tutorial and assignment preparation\n" +
                        "2 hours unseen examination\n" +
                        "\n" +
                        "\n" +
                        "Description of Module Assessment\n" +
                        "\n" +
                        "01: Assignment weighted 50%\n" +
                        "Computer programming coursework.\n" +
                        "Program an effective test-plan for a common Computer Science data structure\n" +
                        "\n" +
                        "02: Unseen Exam weighted 50%\n" +
                        "2 Hour Unseen Exam\n" +
                        "Two hour closed-book, end of semester, unseen examination. Answer 2 questions from 3.\n" +
                        "\n" +
                        "Version: (1.07) Updated: 06/Nov/2017\n" +
                        "\n" +
                        "This document is the definitive current source of information about this module and supersedes any other information. ";

            case "CSC-20038":
                return "Programme/Approved Electives for\n" +
                        "\n" +
                        "Computer Science Dual Honours (Level 5)\n" +
                        "Computer Science Major (Level 5)\n" +
                        "Computer Science Minor (Level 5)\n" +
                        "\n" +
                        "Available as a Free Standing Elective\n" +
                        "\n" +
                        "No\n" +
                        "\n" +
                        "Barred Combinations\n" +
                        "\n" +
                        "None\n" +
                        "\n" +
                        "Prerequisites\n" +
                        "\n" +
                        "CSC-10024 Programming I (or equivalent experience).\n" +
                        "\n" +
                        "Description for 2017/18\n" +
                        "\n" +
                        "Mobile Application Development has become one of the key areas of growth in the technology industry, and an essential employability skill for a computer science graduate. This module provides a practical understanding of the development lifecycle for mobile applications and aims to cover areas such as HCI design principles for mobile devices, mobile application development techniques and technologies, and testing and evaluation of mobile applications. Students will be given the experience of successfully developing an application for a mobile device, such as an Android-based mobile phone.\n" +
                        "\n" +
                        "The module develops the following Keele Graduate attributes:\n" +
                        "\n" +
                        "2. An appreciation of the development and value of your chosen subjects of study, awareness of their contexts, the links between them, and awareness of the provisional and dynamic nature of knowledge.\n" +
                        "\n" +
                        "4. The ability creatively to solve problems using a range of different approaches and techniques, and to determine which techniques are appropriate for the issue at hand.\n" +
                        "\n" +
                        "6. The ability to communicate clearly and effectively in written and verbal forms for different purposes and to a variety of audiences.\n" +
                        "\n" +
                        "7. The knowledge, skills, self-confidence and self-awareness actively to pursue your future goals.\n" +
                        "\n" +
                        "10. The flexibility to thrive in rapidly changing and uncertain external environments and to update skills and knowledge as circumstances require.\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Aims\n" +
                        "\n" +
                        "This module provides a practical understanding of the development lifecycle for mobile applications and aims to cover areas such as HCI design principles for mobile devices, mobile application development techniques and technologies, and testing and evaluation of mobile applications. Students will be given the experience of successfully developing an application for a mobile device, such as an Android-based mobile phone.\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Intended Learning Outcomes\n" +
                        "\n" +
                        "discuss the key design and development issues for mobile applications; will be achieved by assessments: 01\n" +
                        "distinguish the unique aspects of mobile user interfaces and context awareness, and their use in developing user experiences; will be achieved by assessments: 01\n" +
                        "identify the requirements for mobile platforms and apply their appropriate strategies for development and deployment; will be achieved by assessments: 01\n" +
                        "apply the underlying concepts and principles of mobile application development in a novel situation; will be achieved by assessments: 01\n" +
                        "carry out appropriate evaluation and testing utilising a range of mobile platforms. will be achieved by assessments: 01\n" +
                        "\n" +
                        "\n" +
                        "Study hours\n" +
                        "\n" +
                        "22 hours Lectures\n" +
                        "11 hours Practical Classes\n" +
                        "117 hours Private Study\n" +
                        "\n" +
                        "\n" +
                        "Description of Module Assessment\n" +
                        "\n" +
                        "01: Coursework weighted 100%\n" +
                        "Design, development and evaluation of a simple mobile application.\n" +
                        "Students will be required to design, develop and evaluate a simple mobile application for the Android platform. A scenario will be supplied and students will be required to gather requirements and design and implement appropriate functionality, using standard mobile development techniques covered during the module. Each student will submit the code for a simple mobile application (equivalent to a 3000 word report) together with a demonstration of the final product where they discuss the key design and development issues that they have faced and the results of a suitable evaluation e.g. via a \"recorded screencast\" or \"live demo\" (equivalent to a 2000 word report). Students will be given mid-semester formative feedback on their draft mobile application designs related to the user interface and user experience.\n" +
                        "\n" +
                        "Version: (1.07) Updated: 06/Nov/2017\n" +
                        "\n" +
                        "This document is the definitive current source of information about this module and supersedes any other information. ";

            case "CSC-20021":
                return "Programme/Approved Electives for\n" +
                        "\n" +
                        "Computer Science Dual Honours (Level 5)\n" +
                        "Computer Science Major (Level 5)\n" +
                        "Computer Science Minor (Level 5)\n" +
                        "\n" +
                        "Available as a Free Standing Elective\n" +
                        "\n" +
                        "Yes\n" +
                        "\n" +
                        "Prerequisites\n" +
                        "\n" +
                        "CSC-10024 (Programming 1) - or equivalent.\n" +
                        "\n" +
                        "Barred Combinations\n" +
                        "\n" +
                        "None\n" +
                        "\n" +
                        "Description for 2017/18\n" +
                        "\n" +
                        "This module provides the knowledge and skills necessary to enable students to develop multi-tier web applications and configure the servers on which these applications rely.\n" +
                        "\n" +
                        "Aims\n" +
                        "\n" +
                        "* to provide an understanding of Internet communication architectures (such as client-server) with reference to standard protocols\n" +
                        "* to enable the development of multi-tier web applications and the configuration of the servers on which they rely\n" +
                        "\n" +
                        "\n" +
                        "Intended Learning Outcomes\n" +
                        "\n" +
                        "design and code multi-tier web applications using contemporary languages, systems and tools;: 1,\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "describe the technical, social and security issues involved in developing and maintaining web-based content;: 1,\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "effectively apply techniques for configuring and administrating web servers.: 1,\n" +
                        "\n";

            default:
                return "The is no content to show for this selection";
        }
    }
}

