package my.example.notifies.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement(name = "request")
@XmlAccessorType(XmlAccessType.FIELD)
public class Request {
	private String uid;
	
	@XmlElement(name = "requestHeader")
	private RequestHeader requestHeader;
	
	@XmlElement(name = "requestData")
	private RequestData requestData;

	public Request() {
		super();
	}

	public Request(RequestHeader requestHeader , RequestData requestData) {
		super();
		this.requestHeader = requestHeader;
		this.requestData = requestData;
	}
}
