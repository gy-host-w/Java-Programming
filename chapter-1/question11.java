public class question11 {
    public static void main(String[] args) {
         double population = 312032486;
         double seconds = 365 * 24 * 60 * 60;
         double birth,death,immigrant;
         birth = seconds / 7.0;
         death = seconds / 13.0;
         immigrant = seconds / 45.0;
         for(int i = 1; i <= 5; i ++){
             population += (birth - death + immigrant);
             System.out.println(i + ": " + population);
         }
    }
}
