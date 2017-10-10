package text2speech;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import com.ibm.watson.developer_cloud.text_to_speech.v1.TextToSpeech;
import com.ibm.watson.developer_cloud.text_to_speech.v1.model.AudioFormat;
import com.ibm.watson.developer_cloud.text_to_speech.v1.model.Voice;
import com.ibm.watson.developer_cloud.text_to_speech.v1.util.WaveUtils;

public class TextToSpeechTest0 {
	public static void main(String[] args) {
		TextToSpeech service = new TextToSpeech();
		service.setUsernameAndPassword("af1a2b59-4af4-43ce-b653-62b6451bc3b1", "SkzS3u4egqCC");
		  
		List<Voice> voices = service.getVoices().execute();
//		System.out.println(voices);
//		System.out.println(voices.size());

//		Voice voice = service.getVoice("en-US_AllisonVoice").execute();
//		System.out.println(voice);
		try {
			  String text = "Hello world";
			  InputStream stream = service.synthesize(text, Voice.EN_ALLISON,
			    AudioFormat.WAV).execute();
			  InputStream in = WaveUtils.reWriteWaveHeader(stream);
			  OutputStream out = new FileOutputStream("hello_world.wav");
			  byte[] buffer = new byte[1024];
			  int length;
			  while ((length = in.read(buffer)) > 0) {
			    out.write(buffer, 0, length);
			  }
			  out.close();
			  in.close();
			  stream.close();
			}
			catch (Exception e) {
			  e.printStackTrace();
			}		
	
	}
}
