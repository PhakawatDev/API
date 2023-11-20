package my.example.notifies.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement(name = "licenseInfo")
@XmlAccessorType(XmlAccessType.FIELD)
public class LicenseInfo {

	private String licBook;

	private String licNo;

	private String licTypeCode;

	private String licTypeDesc;

	private String licFormCode;

	private String licProductCode;

	private String licProductDesc;

	private String licCusId;

	private String licCusName;

	private String licCusTin;

	private String licStatusCode;

	private String licStatusDesc;

	public LicenseInfo() {
		super();
	}

	public LicenseInfo(String licBook, String licNo, String licTypeCode, String licTypeDesc, String licFormCode,
			String licProductCode, String licProductDesc, String licCusId, String licCusName, String licCusTin,
			String licStatusCode, String licStatusDesc) {
		super();
		this.licBook = licBook;
		this.licNo = licNo;
		this.licTypeCode = licTypeCode;
		this.licTypeDesc = licTypeDesc;
		this.licFormCode = licFormCode;
		this.licProductCode = licProductCode;
		this.licProductDesc = licProductDesc;
		this.licCusId = licCusId;
		this.licCusName = licCusName;
		this.licCusTin = licCusTin;
		this.licStatusCode = licStatusCode;
		this.licStatusDesc = licStatusDesc;
	}
}
