public class PalindromicNumberFinder {
    private int num;

    // constructor
    public PalindromicNumberFinder(int num){
        this.num = num;
    }

    // accessor/getter method
    public int getNum(){
        return this.num;
    }

    //this method should find the next palindromic number
    public int searchForPalindromicNum(int num){
     int ogNum = num;
      
    
        
        int nextPalindrome = 0;
        for (var i = num + 1; i >num; i++) {
        
        if (i == reverseNum(i)) {
          nextPalindrome = i;
          System.out.println(nextPalindrome);
          return nextPalindrome;
          }
          
          }
          System.out.println(nextPalindrome-ogNum);
          return nextPalindrome-ogNum;
        
        
        }

    // this is a helper method for searchForPalindromicNum. It's purpose is to test if a number is actually a palindrome
    public boolean testPalindromicNum(int num){
      boolean isPal = false;
      if(num == reverseNum(num)){
        isPal = true;
      }
      else{
        isPal = false;
      }
      return isPal;
    }


    // this is a helper method for testPalindromicNum. It should reverse the number and return it.
    public int reverseNum(int num){
      int reversed = 0;
      while(num != 0){
        int digit = num % 10;
        reversed = reversed * 10 + digit;
        num /= 10;      
      }
      return reversed;


    }


    @Override
    public String toString(){
        return "You'd have to drive " + searchForPalindromicNum(this.num) + " miles";
    }
}
