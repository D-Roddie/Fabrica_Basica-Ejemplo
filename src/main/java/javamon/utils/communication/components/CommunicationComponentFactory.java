package javamon.utils.communication.components;

import javamon.utils.enums.Platform;

public class CommunicationComponentFactory {
	public static CommunicationComponent GetCommunicationComponent (Platform targetPlatform) {
		switch (targetPlatform) {
		case NINTENGO_CLASSIC:
			return new NintengoClassicComunicationComponent();
		case NINTENGO_GAMEBOY:
			return new NintengoGameBoyComunicationComponent();
		default:
			return null;
		}
		
	}

}
