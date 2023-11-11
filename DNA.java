public class DNA {
  /*This code determines whether there is a protein in a stand of DNA
  or not. To be a protein, it must start with "ATG" and end with "TGA". Also, the length of the sequence should be divisible by 3.*/

  public static void main(String[] args) {
             
    //  -. .-.   .-. .-.   .
    //    \   \ /   \   \ / 
    //   / \   \   / \   \  
    //  ~   `-~ `-`   `-~ `-

    String dna1 = "ATGCGATACGCTTGA";
    String dna2 = "ATGCGATACGTGA";
    String dna3 = "ATTAATATGTACTGA";

    String dna = dna3;

    int start = dna.indexOf("ATG");
    System.out.println("Start: " + start);

    int stop = dna.indexOf("TGA");
    System.out.println("Stop: " +stop);

    if (start != -1 && stop != -1 && (stop - start) % 3 == 0) {
      String protein = dna.substring(start, stop+3);
      System.out.println("Condition 1 and 2 and 3 are satisfied.");
    } else {
      System.out.println("No protein.");
    }
  }
  
}
