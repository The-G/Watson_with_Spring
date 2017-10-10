package text2speech;

import java.util.List;

import com.ibm.watson.developer_cloud.text_to_speech.v1.model.Voice;

public interface TextToSpeechService {
	
	public List<Voice> getVoiceList() throws Exception;

}
