package javamon.utils.communication;

import javamon.entities.Javamon;
import javamon.utils.communication.components.CommunicationComponent;
import javamon.utils.communication.components.CommunicationComponentFactory;

import javamon.utils.communication.components.NintengoClassicComunicationComponent;
import javamon.utils.enums.Platform;
import javamon.utils.serialization.JavamonSerializator;
import javamon.utils.serialization.SerializatorXML;
import javamon.utils.serialization.SerializerFactory;

public class CommunicationManager {

	public void SendJavamon(Javamon pJavamon, Platform targetPlatform) {
		// JavamonSerializator serializer = new SerializatorXML();
		JavamonSerializator serializer = SerializerFactory.GetSerializer(targetPlatform);
		String output = serializer.serialize(pJavamon);
		CommunicationComponent communicationComponent = CommunicationComponentFactory
				.GetCommunicationComponent(targetPlatform);
		communicationComponent.sendJavamon(output);
	}

}
