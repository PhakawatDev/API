package my.example.notifies.res;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement(name = "responseH")
@XmlAccessorType(XmlAccessType.FIELD)
public class ResponseH {

	@XmlElement(name = "responseHeader")
	private ResponseHeader responseHeader;

	public ResponseH() {
		super();
	}

	public ResponseH(ResponseHeader responseHeader) {
		super();
		this.responseHeader = responseHeader;
	}
}
