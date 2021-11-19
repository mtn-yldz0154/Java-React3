public class Maind {


    public static void main(String[] args) {
        
   user us= new user();

   us.setuserName("mtnyldzx");
   us.seteMail("myildix76@gmail.com");
   us.setPassword(123456789);

  us.add(us);
   

    student stu=new student();

    stu.setId(123);
    stu.setName("Metin");
    stu.setSurname("Yıldız");

     stu.add(stu);
   
    instactor ins=new instactor();

    ins.setId(456);
    ins.setName("Engin Demiroğ");
    ins.setWork("Halkbank");
   
     ins.add(ins);

   





    }
    
}

