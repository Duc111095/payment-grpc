package api.grpc.v1;

import com.google.protobuf.MessageOrBuilder;

public interface AchCreditTransferOrBuilder extends MessageOrBuilder{

	/**
	 * Account Number to transfer funds to.
	 * 
	 * @return the accountNumber
	 */
	String getAccountNumber();
	
	/**
	 * Account number to transfer funds to.
	 * @return the bytes for accountNumber
	 */
	ByteString getAccountNumberBytes();
	
	/**
	 * Routing transit number for the bank account to transfer funds to
	 * @return the routingNumber.
	 */
	String getRoutingNumber();
	
	/**
	 * Routing transit number for the bank account to transfer funds to
	 * 
	 * @return the bytes for routingNumber;
	 */
	ByteString getRoutingNumberBytes();
}
