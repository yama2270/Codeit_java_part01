public class Array {
    public static void main(String[] args) {

//#################################################################################################################
//#################################################################################################################
//#################################################################################################################


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


//#################################################################################################################
//#################################################################################################################
//#################################################################################################################
//#################################################################################################################


//#################################################################################################################
//#################################################################################################################
//#################################################################################################################

//                                      QUIZ 01. 'DNA'찾기

//#################################################################################################################
//#################################################################################################################
//#################################################################################################################


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

//#################################################################################################################
//#################################################################################################################

//                                      본인 풀이

//#################################################################################################################
//#################################################################################################################


//#################################################################################################################

//                  2. charArray를 조건문과 반복문을 이용하여 문자열 하나하나에 접근하여 찾아낸다.

//#################################################################################################################

//        for (int i = 0; i < charArray.length - 3; i++) {
//            if (charArray[i] == 'T') {
//                if (charArray[i + 1] == 'A') {
//                    if (charArray[i + 2] == 'G') {
//                        if (charArray[i + 3] == 'G') {
//                            tagg++;
//                        }
//                    }
//                }
//            }
//
//            if (charArray[i] == 'C') {
//                if (charArray[i + 1] == 'C') {
//                    if (charArray[i + 2] == 'A') {
//                        if (charArray[i + 3] == 'G') {
//                            ccag++;
//                        }
//                    }
//                }
//            }
//
//            if (charArray[i] == 'A') {
//                if (charArray[i + 1] == 'G') {
//                    if (charArray[i + 2] == 'C') {
//                        if (charArray[i + 3] == 'C') {
//                            agcc++;
//                        }
//                    }
//                }
//            }
//        }

//#################################################################################################################
//#################################################################################################################

//                                      정답 풀이

//#################################################################################################################
//#################################################################################################################





//#################################################################################################################

//                2. 크기가 [4]인 배열을 하나 생성하여 글자를 4개씩 담고 'TAGG','CCAG','AGCC'를 비교한다.

//#################################################################################################################


////      첫번째, char배열 생성
        char[] word = new char[4];
//
////      두번째, 반복문을 이용해 변수에 담기
        for (int i = 0; i < charArray.length - 3; i++) {
            for (int j = 0; j < word.length; j++) {
                word[j] = charArray[i + j];
            }

            String text = new String(word);

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


//#################################################################################################################
//#################################################################################################################

//                                      해설

//#################################################################################################################
//#################################################################################################################
// {} 열고 닫는거 잘 활용할 것 ! 즉,코드 번호 152~154에서 반복문 사용시 코드 실행순서 주의하기
// 'dan.length -3' 이해할 것 !

// 과제 사항
// 1. 등호 string에서 == 이해하기
// 2. 배열에서 인덱스 앞에 ex)int[4] 의미 파악하기. (0)
