package my.example.notifies.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement(name = "requestInfo")
@XmlAccessorType(XmlAccessType.FIELD)
public class RequestInfo {

	private String reqReceiveNo;

	private String reqTypeCode;

	private String reqTypeDesc;

	private String reqFormCode;

	private String reqProductCode;

	private String reqProductDesc;

	private String reqChannelCode;

	private String reqChannelDesc;

	private String reqCusId;

	private String reqCusName;

	private String reqCusTin;

	private String reqStatusCode;

	private String reqStatusDesc;

	public RequestInfo() {
		super();
	}

	public RequestInfo(String reqReceiveNo, String reqTypeCode, String reqTypeDesc, String reqFormCode,
			String reqProductCode, String reqProductDesc, String reqChannelCode, String reqChannelDesc, String reqCusId,
			String reqCusName, String reqCusTin, String reqStatusCode, String reqStatusDesc) {
		super();
		this.reqReceiveNo = reqReceiveNo;
		this.reqTypeCode = reqTypeCode;
		this.reqTypeDesc = reqTypeDesc;
		this.reqFormCode = reqFormCode;
		this.reqProductCode = reqProductCode;
		this.reqProductDesc = reqProductDesc;
		this.reqChannelCode = reqChannelCode;
		this.reqChannelDesc = reqChannelDesc;
		this.reqCusId = reqCusId;
		this.reqCusName = reqCusName;
		this.reqCusTin = reqCusTin;
		this.reqStatusCode = reqStatusCode;
		this.reqStatusDesc = reqStatusDesc;
	}
}
