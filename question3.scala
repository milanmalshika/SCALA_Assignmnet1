object question3 {
  def main(args:Array[String]){
    
    //We give the number of books = 60
    calculateTotalCost(60);
    
  }
  
  def calculateTotalCost(numberOfBooks:Int):Unit={
    var coverPriceOfBook = 24.95;
    
    var totalCoverPrice = coverPriceOfBook * numberOfBooks;
    
    if(numberOfBooks>50){
      var x = numberOfBooks - 50;
      
      var y = x * 0.75;
      
      var z = 3 + y; 
      
      var total = z + totalCoverPrice;
      
      var discount = total * 40/100;
      
      var totalCost= discount + total;
      
      println("Total wholesale cost is " + totalCost);
    }
    else{
      var total = totalCoverPrice + 3;
      
      var discount = total * 40/100;
      
      var totalCost= discount + total;
      
      println("Total wholesale cost is " + totalCost);
    }
  }
}