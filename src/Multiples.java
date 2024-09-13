public class Multiples {
    public static void main(String[] args) {
        int number_so_far = 0;
        for (int i = 1; i < 1000; i++){
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;
            if(divisibleBy5 && divisibleBy3){
                number_so_far += 1;
            }
            else if(divisibleBy5) {
                number_so_far += 1;
            }
            else if(divisibleBy3){
                number_so_far += 1;
            }


        }
        System.out.println(number_so_far);
    }
}
