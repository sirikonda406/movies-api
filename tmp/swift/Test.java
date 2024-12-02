package swift;

import org.apache.commons.lang3.StringUtils;

public class Test {

    public static void main(String[] args) {

        System.out.println("hello");

        //String newString=StringUtils.replace("jdbc:postgresql://postgres:5432/pulsewsc5a2fefc168142378135b3eb62366e6a","postgres","localhost");

        String database = StringUtils.replace("jdbc:postgresql://localhost:53872/tenant1?loggerLevel=OFF", "tenant1", "test");
        //String database= String.format("jdbc:postgresql://localhost:53872/tenant1?loggerLevel=OFF","test");

        //String db="\"pulsewsc5a2fefc168142378135b3eb62366e6a\"";
        String db="pulsewsc5a2fefc168142378135b3eb62366e6a";
        db=String.format("CREATE DATABASE %s", String.format("\"%s\"", db));
        //System.out.println("new Driver name::::::" + db.replaceAll("\"", ""));

        System.out.println(db);
    }
}
