public class thread {
     public class  MyThred extends  Thread{

         @Override
         public void run() {
             for (int i = 10 ;i>=1;i--){
                 System.out.println("i value " +i);
                 try{
                     Thread.sleep(1000);
                 }catch (Exception e){
                     System.out.println(e);
                 }
                 super.run();
             }
         }
     }
}
