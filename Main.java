import java.util.Scanner;

class Main {
  public static void main(String[] args) 
  {
//This string is just going to talk about welcome to the store 

Scanner scan = new Scanner(System.in);
    System.out.println( "Welcome to my shoe design store. I sell personal designed shoes for prople. My brand is called ARJ. I also accept trades with costumers as well.");
//This will save the amount of t-shirts they want to buy so then later one we can calculate the price 
    System.out.println("How many custoum shoes do you plan on buying today or how many do you plan on trading");
//This next string is about to ask what kind of design would they look on their shirt 
  int numShoes = scan.nextInt();
  System.out.println("Which design would you like on your shoe;)xiiiooooppppjkjkjkk : $105.55,or $89.09 for the other two 龴ↀ◡*+ :                  ¦̵̱ ̵̱ ̵̱ ̵̱ ̵̱(̢ ̡͇̅└͇͇̅=͇+͇ (@8כ−◦ , please choose style 1,2 or 3 ");
  int design = scan.nextInt();
  



  if (design == 1){
    System.out.println( "That shoe would be $105.55 ");
  }else{
  System.out.println(" That shirt will be $89.09");
  } 
  System.out.println("What is the Price of the shoe you would like to buy from here again?");
   double shoeBuy = scan.nextDouble();
    System.out.println("Would you like to comapre the prices? True or false");
  boolean tradingArj = scan.nextBoolean();
  System.out.println("How much was your orignal shoe");
  double orignalPrice = scan.nextDouble();

  double comparison = tradingShoe(shoeBuy, orignalPrice);
  System.out.println("Your shoe's new price will be " + comparison + " that's your final price, if it's 0 you can trade it in with 0 cost if it's positive you need to pay the diffrence and if its negative we pay you that money" );
 

  

  }

  //Here I'm making another method 

static double tradingShoe(double shoeBuy, double orignalPrice ){
    double  newPrice = shoeBuy - orignalPrice;
    return newPrice;}
}