public class grades{
        public String grade(int mark){
            if(mark>=90){
               return "A";
            }
            else if(mark>=75 && mark<=89){
                return "B";

            }
            else if(mark>=50 && mark<=74){
                return "C";

            }
            else{
                return "Fail";
            }

            }

        }
    

