package my.example.notifies.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement(name = "requestHeader")
@XmlAccessorType(XmlAccessType.FIELD)
public class RequestHeader {

	private String sourceSystem;

	private String destinationSystem;

	private String options;

	private String ipaddress;

	public RequestHeader() {
		super();
	}

	public RequestHeader(String sourceSystem,
			String destinationSystem, String options, String ipaddress) {
		super();
		this.sourceSystem = sourceSystem;
		this.destinationSystem = destinationSystem;
		this.options = options;
		this.ipaddress = ipaddress;
	}

}
