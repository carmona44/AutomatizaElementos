package pruebas;
import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class FormateaXml {
	
	public FormateaXml() {
		
	}

	private String formatear(String texto, String sangria) {
		
		Source xmlInput = new StreamSource(new StringReader(texto));
		StringWriter stringWriter = new StringWriter();
		
		try {
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer.setOutputProperty(OutputKeys.DOCTYPE_PUBLIC, "yes");
			transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", sangria);
			transformer.transform(xmlInput, new StreamResult(stringWriter));

			return stringWriter.toString().trim();
			
		} catch (Exception e) {
			
			throw new RuntimeException(e);
			
		}
		
	}
	
	public String getXmlFormateado(String texto, String ind) {	
		return formatear(texto, ind);
	}
}
