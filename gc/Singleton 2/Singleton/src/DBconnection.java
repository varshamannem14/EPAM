//Easy initialization
//public class DBconnection {
//    private static DBconnection obj = new DBconnection();//After creating the class it will immidiately creates the instance
//    private DBconnection(){//to restrict the creation of the object make the constructor private
//
//    }
//    public static DBconnection getInstance(){
//        return obj;
//    }

    //Lazy Initialization
//    public class DBconnection {
//        private static DBconnection obj;//Problem with lazy is if simultaneously two threads are are passed then the two objects will be created in the memory then it causes a problem so it is resolved using synchronized
//        private DBconnection(){
//
//        }
//        public static DBconnection getInstance(){
//            if(obj==null)
//            {
//                obj = new DBconnection();
//
//            }
//            return obj;
//        }

//synchronized Initialization

//public class DBconnection {
//    private static DBconnection obj;//Synchronized has also some issues because if simulataneously two threads are passed then usimg this synchronized keyword it locks the thread and only one thread will pass through it
//    private DBconnection(){//If we have mant threads for each thread there will be a lock so it will become more expensive so resolve this we are using double locking mechanism
//
//    }
//    synchronized public static DBconnection getInstance(){
//        if(obj==null)
//        {
//            obj = new DBconnection();
//
//        }
//        return obj;
//    }

//Double Locking
public class DBconnection {
    private static DBconnection obj;//This is the best practice for singleton and all organizations uses this double locking mechanism
    private DBconnection(){

    }
    synchronized public static DBconnection getInstance(){
        if(obj==null)
        {
            synchronized (DBconnection.class){
                if(obj==null)
                {
                    obj = new DBconnection();
                }
            }

        }
        return obj;
    }



}
