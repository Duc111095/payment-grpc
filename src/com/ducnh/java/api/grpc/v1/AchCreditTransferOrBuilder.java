package com.ducnh.java.api.grpc.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface AchCreditTransferOrBuilder extends MessageOrBuilder{
	String getAccountNumber();
	ByteString getAccountNumberBytes();
	String getRoutingNumber();
	ByteString getRoutingNumberBytes();
	String getFingerprint();
	ByteString getFingerprintBytes();
	String getBankName();
	ByteString getBankNameBytes();
	String getSwiftCode();
	ByteString getSwiftCodeBytes();
}
