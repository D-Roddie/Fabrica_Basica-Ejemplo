package javamon.utils.serialization;

import javamon.entities.Javamon;

public class SerializatorJSON extends JavamonSerializator {

	@Override
	public String serialize(Javamon pJavamon) {
		return "{ \"javamon\":" + pJavamon.hashCode() + "}";
	}

}
