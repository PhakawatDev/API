package my.example.notifies.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement(name = "requestData")
@XmlAccessorType(XmlAccessType.FIELD)
public class RequestData {

	@XmlElement(name="licenseInfo") 
	private LicenseInfo licenseInfo;
	
	@XmlElement(name="requestInfo") 
	private RequestInfo requestInfo;

	private String notiDateTime;

	private String notiTypeCode;

	private String notiTypeDesc;

	private String notiSubject;
	
	private String notiMessage;

	public RequestData() {
		super();
	}

	public RequestData(LicenseInfo licenseInfo,RequestInfo requestInfo , String notiMessage, String notiSubject, String notiTypeDesc,
			String notiTypeCode, String notiDateTime) {
		super();
		this.notiDateTime = notiDateTime;
		this.notiTypeCode = notiTypeCode;
		this.notiTypeDesc = notiTypeDesc;
		this.notiSubject = notiSubject;
		this.notiMessage = notiMessage;
		this.licenseInfo = licenseInfo;
		this.requestInfo = requestInfo;
		
	}
}
