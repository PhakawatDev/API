package my.example.notifies.res;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement(name = "responseHeader")
@XmlAccessorType(XmlAccessType.FIELD) 
public class ResponseHeader {
	
	private String sourceSystem;
	
	private String destinationSystem;
	
	private String responseCode;
	
	private String responseMessage;
	
	public ResponseHeader() {
		super();
	}
	
	public ResponseHeader(String sourceSystem, String destinationSystem, String responseCode , String responseMessage ) {
		super();
		this.sourceSystem = sourceSystem;
		this.destinationSystem = destinationSystem;
		this.responseCode = responseCode;
		this.responseMessage = responseMessage;
	}
}
