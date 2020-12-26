public class answer {
    public static void main(String[] args) {
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

        char[] charArray = dna.toCharArray();

        // TAGG, CCAG, AGCC

        int tagg = 0;
        int ccag = 0;
        int agcc = 0;

//        2. 반복문 및 조건문 이용(오답)
//
        for (int i = 0; i < charArray.length -3; i++) {
            if (charArray[i] == 'T') {
                if (charArray[i + 1] == 'A') {
                    if (charArray[i + 2] == 'G') {
                        if (charArray[i + 3] == 'G') {
                            tagg++;
                        }
                    }
                }
            }

            if (charArray[i] == 'C') {
                if (charArray[i + 1] == 'C') {
                    if (charArray[i + 2] == 'A') {
                        if (charArray[i + 3] == 'G') {
                             ccag++;
                        }
                    }
                }
            }

            if (charArray[i] == 'A') {
                if (charArray[i + 1] == 'G') {
                    if (charArray[i + 2] == 'C') {
                        if (charArray[i + 3] == 'C') {
                            agcc++;
                        }
                    }
                }
            }
        }

        // 테스트
        System.out.println("TAGG: " + tagg);
        System.out.println("CCAG: " + ccag);
        System.out.println("AGCC: " + agcc);
    }
}
