package text2speech;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ibm.watson.developer_cloud.text_to_speech.v1.TextToSpeech;
import com.ibm.watson.developer_cloud.text_to_speech.v1.model.Voice;


@Component //이것으로 Text2SpeechServiceImpl text2SpeechServiceImpl = new Text2SpeechServiceImpl();
// container화 해주는 거다!! 
// @Component(service) //이것으로 Text2SpeechServiceImpl service = new Text2SpeechServiceImpl();
public class Text2SpeechServiceImpl 
				extends TextToSpeech 
				implements TextToSpeechService {

	public Text2SpeechServiceImpl() {
		setUsernameAndPassword("af1a2b59-4af4-43ce-b653-62b6451bc3b1", 
							   "SkzS3u4egqCC"); // 생성자에서 인증과정을 끝낼수 있다.
	}
	
	public List<Voice> getVoiceList() throws Exception {
		List<Voice> voices = getVoices().execute();
		return voices;
		
	}
}
