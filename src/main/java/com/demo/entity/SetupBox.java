package com.demo.entity;

import com.demo.Enum.enums.*;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
@Document(collection = "SetupBox")
public class SetupBox {
	private String ipAddress;
	private SetupBoxType setBoxType;
	private String setBoxId;
	private String software;
	private Status status;
	private String version;
}
