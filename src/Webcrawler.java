import java.io.*;
import java.net.*;
import java.util.regex.*;

public class Webcrawler {
    public static int count = 0;
    public static String[] URLs = new String[999];

    public static void ImageCrawler() throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter website URL: ");
        String url = br.readLine();

        // Connect to the website and get the HTML content
        URL website = new URL(url);
        URLConnection connection = website.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));

        // Use regex pattern to find image URLs in HTML content
        String inputLine;
        String pattern = "<img[^>]+src\\s*=\\s*['\"]([^'\"]+)['\"][^>]*>";
        Pattern r = Pattern.compile(pattern);
        while ((inputLine = in.readLine()) != null) {
            Matcher m = r.matcher(inputLine);
            while (m.find()) {
                String imageUrl = m.group(1);
                System.out.println(imageUrl);
                URLs[count] = imageUrl;
                count += 1;
            }
        }
        in.close();
    }
}