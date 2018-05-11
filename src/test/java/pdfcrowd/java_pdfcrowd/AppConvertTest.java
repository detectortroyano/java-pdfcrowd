package pdfcrowd.java_pdfcrowd;

import java.io.IOException;

import com.pdfcrowd.Pdfcrowd;

import org.junit.Test;

public class AppConvertTest {

	@Test
	public void test() {
		testConvertedPdfcrowd();
	}

	public void testConvertedPdfcrowd(){
		System.out.println( "Start process" );
		String outDirectory = "C:\\Users\\detectortroyano\\Downloads\\";
        try {
            // create the API client instance
        	Pdfcrowd.HtmlToPdfClient client = new Pdfcrowd.HtmlToPdfClient("angelricardo", "apiKey");

            // run the conversion and write the result to a file
            client.convertUrlToFile("https://www.google.com/", outDirectory+"google-pdfcrowd.pdf");
            System.out.println( "Completed process" );
        }catch(Pdfcrowd.Error why) {
            // report the error to the standard error stream
            System.err.println("Pdfcrowd Error: " + why);
        }catch(IOException why) {
            // report the error to the standard error stream
            System.err.println("IO Error: " + why.getMessage());
        }
	}

}
