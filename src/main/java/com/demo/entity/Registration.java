package com.demo.entity;

import com.demo.Enum.enums.*;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
@Document(collection = "Registration")
public class Registration {
	@Id
	private int reg_ID;
	private String idProofNumber;
	private IdProofType idProofType;
	private String registrationDate;
	private int registrationID;
	private String sellerId;
	private SetupBox setupBox;

}
