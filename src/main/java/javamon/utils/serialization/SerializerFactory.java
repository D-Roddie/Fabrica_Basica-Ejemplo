package javamon.utils.serialization;

import javamon.utils.enums.Platform;

public class SerializerFactory {

	public static JavamonSerializator GetSerializer(Platform targetPlatform) {
		switch(targetPlatform) {
		case NINTENGO_CLASSIC:
			return new SerializatorXML();
			
		case NINTENGO_GAMEBOY:
			return new SerializatorJSON();
		default:
		return null;
	}
	}



}
