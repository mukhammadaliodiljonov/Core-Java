interface DBDriver{//SUN Microsystems
    public void RegisterDriver();
    public void connect();
}

class OracleDriver implements DBDriver{
    public void RegisterDriver(){
        System.out.println("Oracle Driver registered");
    }
    public void connect(){
        System.out.println("Oracle Driver connected");
    }
}

class MySQLDriver implements DBDriver{
    public void RegisterDriver(){
        System.out.println("MySQL Driver registered");
    }
    public void connect(){
        System.out.println("MySQL Driver connected");
    }
}

class Db2Driver implements DBDriver{
    public void RegisterDriver(){
        System.out.println("Db2 Driver registered");
    }
    public void connect(){
        System.out.println("Db2 Driver connected");
    }
}
public class InterfaceWithDriver {
    public static void main(String[] args) {
        DBDriver oracle = new OracleDriver();
        oracle.RegisterDriver();
        oracle.connect();
        System.out.println();
        DBDriver mysql = new MySQLDriver();
        mysql.RegisterDriver();
        mysql.connect();
        System.out.println();
        DBDriver db2 = new Db2Driver();
        db2.RegisterDriver();
        db2.connect();
        System.out.println();

    }
}
