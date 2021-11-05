package HospitalManagementSystem.Common;

// import something.SQLLibrary

import HospitalManagementSystem.Config;

public class SQLDB {
    private String path;
    private static SQLDB instance;
    private Object DB;

    private SQLDB() {
        path = Config.getPathToDB();
    }

    public static SQLDB getInstance() {
        if (instance == null) {
            instance = new SQLDB();
        }
        return instance;
    }

    public boolean query(String sql) {
        // DB = SQLLibrary.open(path);
        // if (DB.query(sql)) {
        // DB.close();
        // return true;
        // }
        // DB.close();
        return false;
    }
}
