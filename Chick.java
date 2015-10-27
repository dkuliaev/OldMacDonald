class Chick implements Animal 
{     
     private String myType;     
     private String mySound;  
     private int chickSound = (int)(Math.random() * 2);     
     public Chick(String type, String sound)    
     {         
         myType = type;         
         mySound = sound;
          
     }     
     public Chick()     {         
        myType = "Chick";
        if(chickSound == 0)       
            mySound = "Cluck!";
        if(chickSound == 1)
            mySound = "Cheep!";
     }      
     public String getSound(){return mySound;}     
     public String getType(){return myType;}
}