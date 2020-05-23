object question2 {
  def main(args:Array[String]){
    
    //Radius is 5
    var value = calculateVolume(5);
    println("Volume of a sphere with raius is 5 = " + value);
    
  }
  
  def calculateVolume(r:Int):Double={
    
    var volume = (4 * 22 * r * r * r)/21;
    return volume;
    
  }
}