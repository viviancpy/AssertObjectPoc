import com.chan.vivian.JsonFileLoader;
import com.chan.vivian.TargetObject;
import com.google.gson.Gson;
import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;

import java.io.IOException;

public class AssertObjectPocTest {

    @Test
    public void testStrictlyEqual() throws IOException, JSONException {
        shouldEqual("strictlyEqual.json");
    }

    @Test
    public void testListOrderMismatch() throws IOException, JSONException {
        shouldEqual("listOrderMismatch.json");
    }

    @Test
    public void testKeyOrderMismatch() throws IOException, JSONException {
        shouldEqual("keyOrderMismatch.json");
    }

    @Test
    public void testPropertyNameCaseMismatch() throws IOException, JSONException {
        shouldNotEqual("propertyNameCaseMismatch.json");
    }

    @Test
    public void testTargetObjectOrder() throws IOException, JSONException {
        shouldEqual("targetObjectOrder.json");
    }

    @Test
    public void testListExtraItem() throws IOException, JSONException {
        shouldNotEqual("listExtraItem.json");
    }


    private void shouldEqual(String resourceFilePath) throws IOException, JSONException {
        String jsonFromFile = JsonFileLoader.readFromJsonFile(resourceFilePath);
        System.out.println(jsonFromFile);

        Gson gson = new Gson();
        String jsonFromObject = gson.toJson(new TargetObject());
        System.out.println(jsonFromObject);

        JSONAssert.assertEquals("NON_EXTENSIBLE", jsonFromFile, jsonFromObject, JSONCompareMode.NON_EXTENSIBLE);
        JSONAssert.assertEquals("LENIENT", jsonFromFile, jsonFromObject, JSONCompareMode.LENIENT);
    }

    private void shouldNotEqual(String resourceFilePath) throws IOException, JSONException {
        String jsonFromFile = JsonFileLoader.readFromJsonFile(resourceFilePath);
        System.out.println(jsonFromFile);

        Gson gson = new Gson();
        String jsonFromObject = gson.toJson(new TargetObject());
        System.out.println(jsonFromObject);

        JSONAssert.assertNotEquals("NON_EXTENSIBLE", jsonFromFile, jsonFromObject, JSONCompareMode.NON_EXTENSIBLE);
        JSONAssert.assertNotEquals("LENIENT", jsonFromFile, jsonFromObject, JSONCompareMode.LENIENT);
    }
}
