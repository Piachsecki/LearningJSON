import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;



public class JsonParser {
    public static String getJSONFromFile(String filename) {
        String jsonText = "";
        try {
            BufferedReader bufferedReader =
                    new BufferedReader(new FileReader(filename));

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                jsonText += line + "\n";
            }

            bufferedReader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return jsonText;
    }


    public static void main(String[] args) {
        String strJson = getJSONFromFile("/home/kacper/IdeaProjects/LearningJSON/src/temp.json");


        System.out.println(strJson);
        try {
            JSONParser parser = new JSONParser();
            Object object = parser.parse(strJson);
            JSONObject mainJsonObject = (JSONObject) object;

            /*************** sport even id ****************/
            String id = (String) mainJsonObject.get("sport_event_id");
            System.out.println("sport_event_id : " + id);

//            /*************** Last Name ****************/
//            String lastName = (String) mainJsonObject.get("lastName");
//            System.out.println("Last Name : " + lastName);
//
//            /*************** Age ****************/
//            long age = (long) mainJsonObject.get("age");
//            System.out.println("Age : " + age);
//
//
//            /*************** Address ****************/
//            JSONObject jsonObjectAddress = (JSONObject) mainJsonObject.get("address");
//            System.out.println("Address : ");
//
//            String streetAddress = (String) jsonObjectAddress.get("streetAddress");
//            System.out.println("      Street Address : " + streetAddress);
//
//            String city = (String) jsonObjectAddress.get("city");
//            System.out.println("      City : " + city);
//
//            String state = (String) jsonObjectAddress.get("state");
//            System.out.println("      State : " + state);
//
//            long postalCode = (long) jsonObjectAddress.get("postalCode");
//            System.out.println("      Postal Code : " + postalCode);
//
//
//
//            /*************** Phone Numbers ****************/
//            JSONArray jsonArrayPhoneNumbers = (JSONArray) mainJsonObject.get("phoneNumbers");
//            System.out.println("Phone Numbers : ");
//
//            for (int i = 0; i < jsonArrayPhoneNumbers.size(); i++) {
//                JSONObject jsonPhoneNumber = (JSONObject) jsonArrayPhoneNumbers.get(i);
//                System.out.println("      Phone Number " + (i + 1));
//
//                String type = (String) jsonPhoneNumber.get("type");
//                System.out.println("      Type : " + type);
//
//                String number = (String) jsonPhoneNumber.get("number");
//                System.out.println("      Number : " + number);
//            }
        }
        catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}