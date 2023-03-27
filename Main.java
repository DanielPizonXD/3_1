class Main {
  public static void main(String[] args) {
String symbol="*";
    for(int x=0;x<7;x++){
      for(int y=0;y<13;y++){
        if(y<(6-x) || y>(6+x)){
          System.out.print(" ");
        }
      else
        System.out.print(symbol);
      }
      System.out.println();
    }
        for(int x=3;x<7;x++){
      for(int y=0;y<13;y++){
        if(y<(6-x) || y>(6+x)){
          System.out.print(" ");
        }
        else
           System.out.print(symbol);
      }
      System.out.println();
    }
            for(int x=3;x<7;x++){
      for(int y=0;y<13;y++){
        if(y<(6-x) || y>(6+x)){
          System.out.print(" ");
        }
        else
           System.out.print(symbol);
      }
      System.out.println();
    }
  }
}