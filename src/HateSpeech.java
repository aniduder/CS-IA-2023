
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.AnalyticsApi;
public class HateSpeech {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");
    AnalyticsApi apiInstance = new AnalyticsApi();
    HateSpeechAnalysisRequest input = new HateSpeechAnalysisRequest(); // HateSpeechAnalysisRequest | Input hate speech analysis request
    try{
            HateSpeechAnalysisResponse result = apiInstance.analyticsHateSpeech(input);
            System.out.println(result);
        } catch(ApiException e){
            System.err.println("Exception when calling AnalyticsApi#analyticsHateSpeech");
            e.printStackTrace();
        }
}