public class Array {
    public static void main(String[] args) {

//       1. 배열 만들기
//       - 배열 변수 선언과 배열 인덱스 칸의 개수 그리고 데이터 값!

//        2. 멀티배열 만들기

//        int[][] multiArray = new int[2][3];
//
//        multiArray[0][0] = 0;
//        multiArray[0][1] = 1;
//        multiArray[0][2] = 2;
//        multiArray[1][0] = 0;
//        multiArray[1][1] = 1;
//        multiArray[1][2] = 2;
//
//        System.out.println(multiArray[0][0]);
//        System.out.println(multiArray[1][1]);


//      Quiz 1

        String dna = "GATCCGCCCGCCTCGGCCTCCCAAAGTGCTGGGATTACAGGTGTGAGCCA"
                + "CCACGCCCGGCTAATTTTTATTTATTTATTTAAAGACAGAGTCTCACTCT"
                + "GTCACTCAGGCTAGAGTGCAGTGGCACCATCTCAGCTCACTGCAGCCTTG"
                + "ACCTCCCTGGGCTCCGGTGATTTCACCCTCCCAAGTAGCTAGGACTACAG"
                + "GCACATGCCACGACACCCAGCTAATTTTTTATTTTCTGTGAAGTCAAGGT"
                + "CTTGCTACGTTGCCCATGCTGGTATCAAACCCCTGGGCTCAATCAATCCT"
                + "TCCACCTCAGCCTCCCCAAGTATTGGGGTTACAGGCATGAGCTACCACAC"
                + "TCAGCCCTAGCCTACTTGAAACGTGTTCAGAGCATTTAAGTTACCCTACA"
                + "GTTGGGCAAAGTCATCTAACACAAAGCCCTTTTTATAGTAATAAAATGTT"
                + "GTATATCTCATGTGATTTATTGAATATTGTTACTGAAAGTGAGAAACAGC"
                + "ATGGTTGCATGAAAGGAGGCACAGTCGAGCCAGGCACAGCCTGGGCGCAG"
                + "AGCGAGACTCAAAAAAAGAAAAGGCCAGGCGCACTGGCTCACGCCTGTAA"
                + "TCCCAGCATTTCGGGAGGCTGAGGCGGGTGGATCACCTGAGGTCAGGAGT"
                + "TCAAGACCAGCCTAGCCAACATGGTGAAACCCCGTCTCTACTAAAATACA"
                + "AAAATTAACCGGGCGTGATGGCAGGTGCCTGTAATCCCAGCTACTTGGGA"
                + "GGCTGAGGCAGGAGAATCGCTTGAACCAGGAGGCGGAGGTTGCAGGGAGC"
                + "CAAGATGGCGCCACTGCACTCCAGCCTGGGCGATAGAGTGAGACTCCGTC"
                + "TCAGAAAAAAAAGAAAAGAAACGAGGCACAGTCGCATGCACATGTAGTCC"
                + "CAGTTACTTGAGAGGCTAAGGCAGGAGGATCTCTTGAGCCCAAGAGTTTG"
                + "AGTCCAGCCTGAACAACATAGCAAGACATCATCTCTAAAATTTAAAAAAG"
                + "GGCCGGGCACAGTGGCTCACACCTGTAATCCCAGCACTTTGGGAGGTGGA"
                + "GGTGGGTAGATCACCTGACGTCAGGAGTTGGAAACCAGCCTGGCTAACAT";

//      찾아야 하는 키워드

        int tagg = 0, ccag = 0, agcc = 0;

//      키워드 찾기

//      1. String을 문자배열로 변환
        char[] charArray = dna.toCharArray();

//      2. char배열로 나누어진 dna데이터를 char배열[4]씩 나눈다(정답)

//      첫번째, char배열 생성
        char[] word = new char[4];

//      두번째, 반복문을 이용해 변수에 담기
        for (int i = 0; i < charArray.length - 3; i++) {
            for (int j = 0; j < word.length; j++) {
                word[j] = charArray[i + j];
            }

            String text = new String(word);

//            if (text == "TAGG") {
//                tagg ++;
//            }
//
//            if (text == "CCAG") {
//                ccag++;
//            }
//
//            if (text == "AGCC") {
//                agcc++;
//            }

            switch (text) {
                case "TAGG":
                    tagg++;
                    break;
                case "CCAG":
                    ccag++;
                    break;
                case "AGCC":
                    agcc++;
                    break;
            }
        }

        System.out.println(tagg);
        System.out.println(ccag);
        System.out.println(agcc);


    }
}
////      2. 반복문 및 조건문 이용(오답)
//
//        for (int i = 0; i < charArray.length; i++) {
//            if (charArray[i] == 'T') {
//                if (charArray[i + 1] == 'A') {
//                    if (charArray[i + 2] == 'G') {
//                        if (charArray[i + 3] == 'G') {
////                            TAGG = +1 ;
//                        }
//                    }
//                }
//            }
//
//            if (charArray[i] == 'C') {
//                if (charArray[i + 1] == 'C') {
//                    if (charArray[i + 2] == 'A') {
//                        if (charArray[i + 3] == 'G') {
////                            CCAG = +1 ;
//                        }
//                    }
//                }
//            }
//
//            if (charArray[i] == 'A') {
//                if (charArray[i + 1] == 'G') {
//                    if (charArray[i + 2] == 'C') {
//                        if (charArray[i + 3] == 'C') {
////                            AGCC = +1 ;
//                        }
//                    }
//                }
//            }
//        }


// {} 열고 닫는거 잘 활용할 것 !
// 'dan.length -3' 이해할 것 !

// 과제 사항
// 1. 등호 string에서 == 이해하기
// 2. 배열에서 인덱스 앞에 ex)int[4] 의미 파악하기. (0)
