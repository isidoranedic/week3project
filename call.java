import okhttp3.*;
import org.json.JSONException;

import java.io.IOException;
public class call {
    public static void getBeefRecipe() {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        Request request = new Request.Builder()
                .url("https://api.edamam.com/api/recipes/v2?type=public&q=\"beef\"&app_id=a996d1c3&app_key=786732eee8f1ca80ab44b863d196a43f")
                .build();
        try {
            Response response = client.newCall(request).execute();
            System.out.println(response);

        } catch (IOException | JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        getBeefRecipe();
    }
}
