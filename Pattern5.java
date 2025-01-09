class Pattern5{
    public static void main(String[] args){
        for(int i=0; i<5; i++){
            for(int j=0; j<3; j++){
                if(i==0||i==2||i==4 || i==1&&j==0 || i==3&&j==2)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0; i<5; i++){
            for(int j=0; j<3; j++){
                if(j==0||j==2||i==2)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0; i<5; i++){
            for(int j=0; j<3; j++){
                if(j==0||i==0||i==2 || i==3&&j==1 || i==4&&j==2 || i==1&&j==2)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0; i<5; i++){
            for(int j=0; j<3; j++){
                if(j==0||j==2||i==4)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0; i<5; i++){
            for(int j=0; j<3; j++){
                if(i==0||j==1)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0; i<5; i++){
            for(int j=0; j<3; j++){
                if(i==0||i==4||j==1)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
        // for(int i=0; i<5; i++){
        //     for(int j=0; j<3; j++){
        //         if(i==0||i==2||i==4 || i==1&&j==0 || i==3&&j==2)
        //         System.out.print("*");
        //         else
        //         System.out.print(" ");
        //     }
        //     System.out.println();
        // }
    }
    public static void s(){
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void h(){
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(j==0 || j==2 || i==1){
                    System.out.print("*");
                }
            }
            System.out.println();
        }            
    }
}