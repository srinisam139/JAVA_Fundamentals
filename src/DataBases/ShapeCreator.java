package DataBases;


import java.sql.*;
import java.util.*;

public class ShapeCreator{
    private static int j=0;
    private static final String databaseURL = "jdbc:mysql://localhost:3306/shapedb";
    private static final String user = "root";
    private static final String password = "";

    /**
     * This method is used to create the table for circle, Playing_with_Objects.Interface.Rectangle and Triangle.
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public static void createTables() throws SQLException, ClassNotFoundException {

        Connection conn = DriverManager.getConnection(databaseURL,user,password);

        Statement stmt  = conn.createStatement();
            //String sql = "CREATE TABLE Playing_with_Objects.Interface.Circle (id INTEGER not NULL,  Playing_with_Objects.Interface.Position double, Area DOUBLE, Perimeter DOUBLE, Radius DOUBLE,  Color VARCHAR(255),  line_Color VARCHAR(255),  PRIMARY KEY ( id ))".formatted();
            //String sql="ALTER TABLE Triangle ADD Position_Y DOUBLE";
            //String sql = "CREATE TABLE Playing_with_Objects.Interface.Rectangle (id INTEGER not NULL,  Playing_with_Objects.Interface.Position double, Area DOUBLE, Perimeter DOUBLE, width DOUBLE, height DOUBLE,  Color VARCHAR(255),  line_Color VARCHAR(255),  PRIMARY KEY ( id ))".formatted();
            String sql = "CREATE TABLE Triangle (id INTEGER not NULL,  Playing_with_Objects.Interface.Position double, Area DOUBLE, Perimeter DOUBLE, Length DOUBLE,  Color VARCHAR(255),  line_Color VARCHAR(255),  PRIMARY KEY ( id ))";

            stmt.executeUpdate(sql);
            System.out.println("Created table in given database...");
            conn.close();
    }

    /**
     * This method is used to insert the values on the table for the random objects an fields created using circle,rectangle and triangle.
     * @throws SQLException
     */
    public static void populateTables() throws SQLException {

        Connection conn = DriverManager.getConnection(databaseURL,user,password);
        conn.setAutoCommit(true);
        Random ran = new Random();//Random object is created
        Scanner scan = new Scanner(System.in);
        System.out.println("Give the array size between 2 and 20");
        int n = scan.nextInt();//input from the user is received
        Shape[] arr = new Shape[n];
        String[] color = {"red", "Purple", "Orange", "Green", "Yellow", "White", "violet"};//Fill Color is stored in an array.
        String[] line_col = {"red", "Purple", "Orange", "Green", "Yellow", "White", "violet", "black"};//Line color is stored in an array.
        for (int i = 0; i < n; i++) {
            int ob = ran.nextInt(2);
            int ch = ran.nextInt(6);//String color
            int lnc = ran.nextInt(7);//String Line color
            int len = ran.nextInt(20);//Length of the triangle
            Position p = new Position(ran.nextInt(20), ran.nextInt(20));//Creating the value for position
            int rad = ran.nextInt(20);//Radius
            int width = ran.nextInt(20);// Width
            int height = ran.nextInt(20);//Height

            switch (ob) {//Switch case is created to generate random objects
                case 0 -> arr[i] = new Triangle(p, len, color[ch], line_col[lnc]);
                case 1 -> arr[i] = new Rectangle(p, width, height, color[ch], line_col[lnc]);
                case 2 -> arr[i] = new Circle(p, color[ch], line_col[lnc], rad);

            }

            if(arr[i] instanceof Circle){
                PreparedStatement insert = conn.prepareStatement("INSERT INTO Playing_with_Objects.Interface.Circle(Radius,Playing_with_Objects.Interface.Position,Area,Perimeter,Position_Y,Color,line_Color)" + "VALUES(?,?,?,?,?,?,?)");

                insert.setDouble(1,((Circle) arr[i]).getRadius());
                insert.setDouble(2,arr[i].getPos().getX());
                insert.setDouble(3,arr[i].area());
                insert.setDouble(4,arr[i].perimeter());
                insert.setDouble(5,arr[i].getPos().getY());
                insert.setString(6,arr[i].getFillColor());
                insert.setString(7,arr[i].getLineColor());
                System.out.println("Playing_with_Objects.Interface.Circle table is updated");
                insert.addBatch();
                try{
                    insert.executeBatch();
                } catch(Exception e){
                    System.out.println(e.getMessage());
                }
            } else if(arr[i] instanceof Rectangle){
                PreparedStatement insert = conn.prepareStatement("INSERT INTO Playing_with_Objects.Interface.Rectangle(Playing_with_Objects.Interface.Position,Area,Perimeter,width,height,Color,line_Color,Position_Y)" + "VALUES(?,?,?,?,?,?,?,?)");

                insert.setDouble(1,(arr[i]).getPos().getX());
                insert.setDouble(2,arr[i].area());
                insert.setDouble(3,arr[i].perimeter());
                insert.setDouble(4,((Rectangle) arr[i]).getWidth());
                insert.setDouble(5,((Rectangle) arr[i]).getHeight());
                insert.setString(6,arr[i].getFillColor());
                insert.setString(7,arr[i].getLineColor());
                insert.setDouble(8,arr[i].getPos().getY());
                System.out.println("Playing_with_Objects.Interface.Rectangle table is updated");
                insert.addBatch();
                try{
                    insert.executeBatch();
                } catch(Exception e){
                    System.out.println(e.getMessage());
                }
            } else {
                PreparedStatement insert = conn.prepareStatement("INSERT INTO Triangle(Playing_with_Objects.Interface.Position,Area,Perimeter,Length,Color,line_Color,Position_Y)" + "VALUES(?,?,?,?,?,?,?)");

                insert.setDouble(1,arr[i].getPos().getX());
                insert.setDouble(2,arr[i].area());
                insert.setDouble(3,arr[i].perimeter());
                insert.setDouble(4,((Triangle)arr[i]).getLength());
                insert.setString(5,arr[i].getFillColor());
                insert.setString(6,arr[i].getLineColor());
                insert.setDouble(7,arr[i].getPos().getY());
                System.out.println("Triangle table is updated");
                insert.addBatch();
                try{
                    insert.executeBatch();
                } catch(Exception e){
                    System.out.println(e.getMessage());
                }
            }
        }
        conn.close();
    }

    /**
     * This method creates the table and columns for overlap.
     * @throws SQLException
     */
    public static void createOverlap() throws SQLException {
        Connection conn = DriverManager.getConnection(databaseURL,user,password);
        Statement stmt  = conn.createStatement();
        //String sql = "CREATE TABLE Overlap(id INTEGER not NULL AUTO_INCREMENT, Overlap VARCHAR(255), PRIMARY KEY( id ))";
        String sql="ALTER TABLE Overlap ADD Shape1 VARCHAR(255), ADD Shape2 VARCHAR(255)";
        stmt.executeUpdate(sql);
        System.out.println("Created Overlap table in SQL");
        stmt.close();
        conn.close();
    }

    /**
     * This method is used to test the shapes are overlapping or not by retrieving the data from the database and storing it in arraylist.
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public static void testOverlap() throws ClassNotFoundException,SQLException{
        Connection conn = DriverManager.getConnection(databaseURL,user,password);
        PreparedStatement p = null;
        ResultSet rs;
        Shape[] array = new Shape[100];
        ArrayList<Shape> arr = new ArrayList<>(100);
        try {
            String sql = "select * from Playing_with_Objects.Interface.Circle";
            p = conn.prepareStatement(sql);
            rs = p.executeQuery();

            while (rs.next()) {
                double position_x = rs.getDouble("Playing_with_Objects.Interface.Position");
                double radius = rs.getDouble("Radius");
                String Color = rs.getString("Color");
                String line_color = rs.getString("Color");
                double position_y = rs.getDouble("Position_Y");
                array[j++] = new Circle(new Position(position_x, position_y), Color, line_color, radius);
                arr.add(array[j - 1]);
            }
            arr.add(array[j]);
            sql = "select * from Playing_with_Objects.Interface.Rectangle";
            p = conn.prepareStatement(sql);
            rs = p.executeQuery();
            while (rs.next()) {
                double position_x = rs.getDouble("Playing_with_Objects.Interface.Position");
                double width = rs.getDouble("width");
                double height = rs.getDouble("height");
                String Color = rs.getString("Color");
                String line_color = rs.getString("Color");
                double position_y = rs.getDouble("Position_Y");
                array[j++] = new Rectangle(new Position(position_x, position_y), width, height, Color, line_color);
                arr.add(array[j - 1]);
            }
            arr.add(array[j]);
            sql = "select * from Triangle";
            p = conn.prepareStatement(sql);
            rs = p.executeQuery();
            while (rs.next()) {
                double position_x = rs.getDouble("Playing_with_Objects.Interface.Position");
                double length = rs.getDouble("Length");
                String Color = rs.getString("Color");
                String line_color = rs.getString("Color");
                double position_y = rs.getDouble("Position_Y");
                array[j++] = new Triangle(new Position(position_x, position_y), length, Color, line_color);
                arr.add(array[j - 1]);
            }
        } catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
        Collections.shuffle(arr);
        System.out.println("check");
       for(int i=0;i<arr.size();i++){
           for(int k=1;k<arr.size()-1;k++){
               if(arr.get(i) instanceof Circle){
                   String sql= ("INSERT INTO Overlap(Overlap,Shape1,Shape2)"+"VALUES(?,?,?)");
                   p=conn.prepareStatement(sql);
                   p.setString(1,String.valueOf(arr.get(i).overlaps(arr.get(k))));
                   p.setString(2,"Playing_with_Objects.Interface.Circle");
                   if(arr.get(k) instanceof Circle){
                       p.setString(3,"Playing_with_Objects.Interface.Circle");
                   } else if(arr.get(k) instanceof Rectangle){
                       p.setString(3,"Playing_with_Objects.Interface.Rectangle");
                   } else {
                       p.setString(3,"Triangle");
                   }
                   p.addBatch();
                   p.executeBatch();
               } else if(arr.get(i) instanceof Rectangle){
                   String sql= ("INSERT INTO Overlap(Overlap,Shape1,Shape2)"+"VALUES(?,?,?)");
                   p=conn.prepareStatement(sql);
                   p.setString(1,String.valueOf(arr.get(i).overlaps(arr.get(k))));
                   p.setString(2,"Playing_with_Objects.Interface.Rectangle");
                   if(arr.get(k) instanceof Circle){
                       p.setString(3,"Playing_with_Objects.Interface.Circle");
                   } else if(arr.get(k) instanceof Rectangle){
                       p.setString(3,"Playing_with_Objects.Interface.Rectangle");
                   } else {
                       p.setString(3,"Triangle");
                   }
                   p.addBatch();
                   p.executeBatch();
               } else if(arr.get(i) instanceof Triangle){
                   String sql= ("INSERT INTO Overlap(Overlap,Shape1,Shape2)" + "VALUES(?,?,?)");
                   p=conn.prepareStatement(sql);
                   p.setString(1,String.valueOf(arr.get(i).overlaps(arr.get(k))));
                   p.setString(2,"Triangle");
                   if(arr.get(k) instanceof Circle){
                       p.setString(3,"Playing_with_Objects.Interface.Circle");
                   } else if(arr.get(k) instanceof Rectangle){
                       p.setString(3,"Playing_with_Objects.Interface.Rectangle");
                   } else {
                       p.setString(3,"Triangle");
                   }
                   p.addBatch();
                   p.executeBatch();
               }
           }
       }
        assert p != null;
        p.close();
        conn.close();
    }
    public static void displayShapes() throws SQLException {
        Connection conn = DriverManager.getConnection(databaseURL,user,password);
        Statement st =conn.createStatement();
        ResultSet rs = st.executeQuery("select * from Overlap");
        ResultSetMetaData rsd = rs.getMetaData();
        int ColumnNumber = rsd.getColumnCount();
        while(rs.next()){
            for(int i=1;i<=ColumnNumber;i++){
                System.out.print(rs.getString(i)+" ");
            }
            System.out.println();
        }
        st.close();
        rs.close();
        conn.close();
    }

    /**
     * This is the Graph.main methos it is used to call all the methods and test the condition. Four of the below methods are
     * commented to prevent error while re-running the program.
     * @param args
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        try{
            //createTables();
            //populateTables();
            //createOverlap();
            //testOverlap();
            displayShapes();
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
