class animal{}
class dog3 extends animal{
    static void method(animal a){
        if (a instanceof dog3){
            dog3 d=(dog3)a;
            System.out.println("ok downcasting performed");
        }
    }
}
//downcasting

   /*public static void main(String args[]){
        animal a=new dog3();
        dog3.method(a);
    }
} */
