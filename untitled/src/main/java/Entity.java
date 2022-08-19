import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Entity {
    public <T> List<T> getAll() throws SQLException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        List<T> resultList = new ArrayList<>();

//        SELECT * FROM table
//        ResultSet -> tip * nume coloane din db (se potrivesc cu cele din clasa)
//        Pentru fiecare element din resultSet
//        Se afla tipul obiectului T
//        Se construieste obiect de tip T
//        Se seteaza pe obiectul creat toate valorile descoperite in ResultSet

//        1. Numele tabelei - se ia din annotation

        Class<Entity> myClass = (Class<Entity>)this.getClass(); // reflection
        ActiveRecord annotation = myClass.getAnnotation(ActiveRecord.class); // reflection
        String tableName = annotation.tabelName();
        String primaryKeyName = annotation.primaryKeyName();

//        2. Rulam SELECT

        Connection connection = DBUtils.getConnection();

        if(connection == null){
            return null;
        }

        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM " +tableName);

//        metadatele din ResultSet
        ResultSetMetaData metaData = rs.getMetaData();
        int noColumns = metaData.getColumnCount();

//        3. Interpretam obiecte de tip T

        while(rs.next()){
            T obj = (T) myClass.getDeclaredConstructor().newInstance(); // reflection
            for(int i=1 ; i<=noColumns ; i++){
                String columnName = metaData.getColumnName(i); // acelasi cu atributul din java
                Field f = myClass.getDeclaredField(columnName); //campul din java

                if(f.getType() == int.class){
                    int value = rs.getInt(columnName);
                    f.setInt(obj, value);
                }
                else if(f.getType() == String.class){
                    String value = rs.getString(columnName);
                    f.set(obj, value);
                }
                else if(f.getType() == Date.class){
                    Date value = rs.getDate(columnName);
                    f.set(obj, value);
                }
            }
            resultList.add(obj);
        }

        return resultList;
    }
    public void insert() throws SQLException, IllegalAccessException {
//        INSERT INTO tableName (campuri ....) VALUES (? ? ?);

        //        1. Numele tabelei - se ia din annotation

        Class<Entity> myClass = (Class<Entity>)this.getClass(); // reflection
        ActiveRecord annotation = myClass.getAnnotation(ActiveRecord.class); // reflection
        String tableName = annotation.tabelName();
        String primaryKeyName = annotation.primaryKeyName();

        //        2. Rulam SELECT

        Connection connection = DBUtils.getConnection();

        if(connection == null){
            System.exit(0);
        }
        String sql = "INSERT INTO " + tableName + " (";
        Field[] f = myClass.getDeclaredFields();

        for(Field field : f){
//            if(field.getName() != primaryKeyName){
            sql += field.getName();
            sql += ", ";
//            }
        }
        sql = sql.substring(0, sql.length()-2);
        sql += ") VALUES(";
        for(int i=0 ; i< f.length ; i++){
            sql += "?, ";
        }
        sql = sql.substring(0, sql.length()-2);
        sql += ");";
        System.out.println(sql);

        PreparedStatement ps = connection.prepareStatement(sql);

        for(int i=0 ; i< f.length ; i++){

            if (!f[i].getName().equals(primaryKeyName)) {
                if(f[i].getType() == int.class){
                    ps.setInt(i+1, f[i].getInt(this));
                }
                else if(f[i].getType() == String.class){
                    ps.setString(i+1, (String)f[i].get(this));
                }
                else if(f[i].getType() == Date.class){
                    ps.setDate(i+1, (Date)f[i].get(this));
                }
            }
            else {
                ps.setNull(i+1, Types.INTEGER);
            }
        }
        ps.executeUpdate();
    }
}
