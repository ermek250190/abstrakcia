package com.company;

public class Main {

    public static void main(String[] args) {

          Sheep sheep1=new Sheep("mitis","kochkor",2,100);
          Sheep sheep2=new Sheep("gissar","koi",3,200);
          Sheep sheep3=new Sheep("romanovskiy","alakochkor",1,30);
          Sheep sheep4=new Sheep("romanovskiy","alakochkor",1,30);
          Sheep[]sheeps={sheep1,sheep2,sheep3};
          Sheep[]sheeps2={sheep4};

          Cow cow1=new Cow("  alaui  ","buka   ",2,350);
          Cow cow2=new Cow("  karaui   ","  urgachi  ",3,400);
          Cow cow3=new Cow("  bozui  ","  buka  ",2,300);
          Cow cow4=new Cow("  alatorpok  ","  buka  ",1,250);
          Cow cow5=new Cow("  alaui  ","  ui  ,",2,300);
          Cow cow6=new Cow("  alaui  ","  ui  ,",2,300);
          Cow []cows={cow1,cow2,cow3,cow4,cow5};
          Cow []cows2={cow6};

          Horse horse1=new Horse("  ulakAt  ","  aigyr  ",3,400,"  kara  ");
          Horse horse2=new Horse("  ishat  ","  bee  ",3,400,"  kuron  ");
          Horse horse3=new Horse("  ishat  ","  bee  ",3,400,"  kuron  ");
          Horse [] horses={horse1,horse2};
          Horse [] horses2={horse3};

          Farm farm1=new Farm("  KYRGYZ KOCHOSU 5 kyrgyz chek  -","-kygyz charba farm1",cows, horses, sheeps);
          Farm farm2=new Farm("KYRGYZ KOCHOSU 5 kygyz chek2","kygyz charba farm2",cows2, horses2, sheeps2);
          farm1.getmethod();
          System.out.println("\n");
          farm2.getmethod();





    }
}
//address, cows, horses, sheep, OwnerName)
//        адрес, коровы, лошади, овцы, имя владельца)






