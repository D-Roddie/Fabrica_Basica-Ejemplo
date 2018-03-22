package javamon.utils.serialization;

import javamon.entities.Javamon;

public class SerializatorXML extends JavamonSerializator {

	@Override
	public String serialize(Javamon pJavamon) {
		StringBuilder output = new StringBuilder();
        output.append("<javamon>");
        output.append("<name>");
        output.append(pJavamon.getName());
        output.append("</name>");
        output.append("<element>");
        output.append(pJavamon.getElement());
        output.append("</element>");
        output.append("<experience>");
        output.append(pJavamon.getExperienceLevel());
        output.append("</experience>");
        output.append("<attack>");
        output.append("<high>");
        output.append(pJavamon.getHighAttack());
        output.append("</high>");
        output.append("<middle>");
        output.append(pJavamon.getMiddleAttack());
        output.append(pJavamon.getLowAttack());
        output.append("</middle>");
        output.append("<low>");
        output.append(pJavamon.getMiddleAttack());
        output.append(pJavamon.getLowAttack());        
        output.append("</low>");
        output.append("</attack>");
        output.append("<defence>");
        output.append("<high>");
        output.append(pJavamon.getHighDefense());
        output.append("</high>");
        output.append("<middle>");
        output.append(pJavamon.getMiddleDefense());
        output.append("</middle>");
        output.append("<low>");
        output.append(pJavamon.getLowDefense());
        output.append("</low>");
        output.append("</defence>");
        output.append("</javamon>");
		return output.toString();
	}

}
