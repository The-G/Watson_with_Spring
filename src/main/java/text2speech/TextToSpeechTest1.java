package text2speech;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ibm.watson.developer_cloud.service.WatsonService;
import com.ibm.watson.developer_cloud.text_to_speech.v1.TextToSpeech;
import com.ibm.watson.developer_cloud.text_to_speech.v1.model.AudioFormat;
import com.ibm.watson.developer_cloud.text_to_speech.v1.model.Voice;
import com.ibm.watson.developer_cloud.text_to_speech.v1.util.WaveUtils;

public class TextToSpeechTest1 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("text2speech/beaninit.xml");
		Text2SpeechServiceImpl service = (Text2SpeechServiceImpl) context.getBean("text2SpeechServiceImpl");
//		Text2SpeechServiceImpl service = new Text2SpeechServiceImpl(); // 위와 같다! 
		try {
			System.out.println(service.getVoiceList());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
