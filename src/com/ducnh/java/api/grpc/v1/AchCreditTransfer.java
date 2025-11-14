package com.ducnh.java.api.grpc.v1;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Descriptors.OneofDescriptor;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;

public final class AchCreditTransfer extends GeneratedMessageV3 implements AchCreditTransferOrBuilder{
	
	private static final long serialVersionUID = 0L;
	private AchCreditTransfer(GeneratedMessageV3.Builder<?> builder) {
		super(builder);
	}
	
	private AchCreditTransfer() {
		accountNumber_ = "";
		routingNumber_ = "";
		fingerprint_ = "";
		bankName_ = "";
		swiftCode_ = "";
	}
	
	@Override
	protected Object newInstance(
			UnusedPrivateParameter unused) {
		return new AchCreditTransfer();
	}
	
	public final UnknownFieldSet getUnknownFields() {
		return this.unknownFields;
	}
	
	private AchCreditTransfer(CodedInputStream input, ExtensionRegistryLite extensionRegistry) 
		throws InvalidProtocolBufferException {
		this();
		if (extensionRegistry == null) {
			throw new NullPointerException();
		}
		UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
		try {
			boolean done = false;
			while (!done) {
				int tag = input.readTag();
				switch (tag) {
				case 0: { 
					done = true;
					break;
				}
				case 10: {
					String s = input.readStringRequireUtf8();
					accountNumber_ = s;
					break;
				}
				case 18: {
					String s = input.readStringRequireUtf8();
					routingNumber_ = s;
					break;
				}
				case 26: {
					String s = input.readStringRequireUtf8();
					fingerprint_ = s;
					break;
				}
				case 34: {
					String s = input.readStringRequireUtf8();
					swiftCode_ = s;
					break;
				}
				default: {
					if (!parseUnknownField(
						input, unknownFields, extensionRegistry, tag)) {
					done = true;
					}
					break;	
				}
				}
			} 
		}catch (InvalidProtocolBufferException e) {
			throw e.setUnfinishedMessage(this);
		} catch (IOException e) {
			throw new InvalidProtocolBufferException(e).setUnfinishedMessage(this);
		} finally {
			this.unknownFields = unknownFields.build();
			makeExtensionsImmutable();
		}
	} 
	
	public static final Descriptor getDescriptor() {
		return PaymentGatewayService.internal_static_com_packtpub_v1_AchCreditTransfer_descriptor;
	}
		
	@Override
	protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
		return PaymentGatewayService.internal_static_com_packtpub_v1_AchCreditTransfer_fieldAccesstorTable
				.ensureFieldAccessorsInitialized(AchCreditTransfer.class, AchCreditTransfer.Builder.class);
	}
	
	public static final int ACCOUNTNUMBER_FIELD_NUMBER = 1;
	private volatile Object accountNumber_;
	
	@Override
	public String getAccountNumber() {
		Object ref = accountNumber_;
		if (ref instanceof String) {
			return (String) ref;
		} else {
			ByteString bs = (ByteString) ref;
			String s = bs.toStringUtf8();
			accountNumber_ = s;
			return s;
		}
	}
	
	@Override
	public ByteString getAccountNumberBytes() {
		Object ref = accountNumber_;
		if (ref instanceof String) {
			ByteString b = ByteString.copyFromUtf8((String) ref);
			accountNumber_ = b;
			return b;
		} else {
			return (ByteString) ref;
		}
	}
	
	public static final int ROUTINGNUMBER_FIELD_NUMBER = 2;
	private volatile Object routingNumber_;
	
	@Override
	public String getRoutingNumber() {
		Object ref = routingNumber_;
		if (ref instanceof String) {
			return (String) ref;
		} else {
			String s = ((ByteString) ref).toStringUtf8();
			routingNumber_ = s;
			return s;
		}
	}
	
	@Override
	public ByteString getRoutingNumberBytes() {
		Object ref = routingNumber_;
		if (ref instanceof String) {
			ByteString b = ByteString.copyFromUtf8((String) ref);
			routingNumber_ = b;
			return b;
		} else {
			return (ByteString) ref;
		}
	} 
	
	public static final int FINGERPRINT_FIELD_NUMBER = 3;
	private volatile Object fingerprint_;
	
	@Override
	public String getFingerprint() {
		Object ref = fingerprint_;
		if (ref instanceof String) {
			return (String) ref;
		} else {
			String s = ((ByteString) ref).toStringUtf8();
			fingerprint_ = s;
			return s;
		}
	}
	
	@Override
	public ByteString getFingerprintBytes() {
		Object ref = fingerprint_;
		if (ref instanceof String) {
			ByteString b = ByteString.copyFromUtf8((String) fingerprint_);
			fingerprint_ = b;
			return b;
		} else {
			return (ByteString) ref;
		}
	}
	
	public static final int BANKNAME_FIELD_NUMBER = 4;
	private volatile Object bankName_;
	
	@Override
	public String getBankName() {
		Object ref = bankName_;
		if (ref instanceof String) {
			return (String) ref;
		} else {
			String s = ((ByteString) ref).toStringUtf8();
			bankName_ = s;
			return s;
		}
	}
	
	@Override
	public ByteString getBankNameBytes() {
		Object ref = bankName_;
		if (ref instanceof String) {
			ByteString b = ByteString.copyFromUtf8((String) ref);
			bankName_ = b;
			return b;
		} else {
			return (ByteString) ref;
		}
	}
	
	public static final int SWIFTCODE_FIELD_NUMBER = 5;
	private volatile Object swiftCode_;
	
	@Override
	public String getSwiftCode() {
		Object ref = swiftCode_;
		if (ref instanceof String) {
			return (String) ref;
		} else {
			String s = ((ByteString) ref).toStringUtf8();
			swiftCode_ = s;
			return s;
		}
	}
	
	@Override
	public ByteString getSwiftCodeBytes() {
		Object ref = swiftCode_;
		if (ref instanceof String) {
			ByteString b = ByteString.copyFromUtf8((String) ref);
			swiftCode_ = b;
			return b;
		} else {
			return (ByteString) ref;
		}
	}
	
	private byte memorizedIsInitialized = -1;
	
	@Override
	public final boolean isInitialized() {
		byte isInitialized = memorizedIsInitialized;
		if (isInitialized == 1) return true;
		if (isInitialized == 0) return false;
		
		memorizedIsInitialized = 1;
		return true;
	}
	
	@Override
	public void writeTo(CodedOutputStream output) throws IOException {
		if (!getAccountNumberBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, ACCOUNTNUMBER_FIELD_NUMBER, accountNumber_);
		} 
		if (!getRoutingNumberBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, ROUTINGNUMBER_FIELD_NUMBER, routingNumber_);
		}
		if (!getFingerprintBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, FINGERPRINT_FIELD_NUMBER, fingerprint_);
		}
		if (!getBankNameBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, BANKNAME_FIELD_NUMBER, bankName_);
		}
		if (!getSwiftCodeBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, SWIFTCODE_FIELD_NUMBER, swiftCode_);
		}
		unknownFields.writeTo(output);
	}
	
	@Override
	public int getSerializedSize() {
		int size = memoizedSize;
		if (size != -1) return size;
		
		size = 0;
		if (!getAccountNumberBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(ACCOUNTNUMBER_FIELD_NUMBER, accountNumber_);
		}
		if (!getRoutingNumberBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(ROUTINGNUMBER_FIELD_NUMBER, routingNumber_);
		}
		if (!getFingerprintBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(FINGERPRINT_FIELD_NUMBER, fingerprint_);
		}
		if (!getBankNameBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(BANKNAME_FIELD_NUMBER, bankName_);
		}
		if (!getSwiftCodeBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(SWIFTCODE_FIELD_NUMBER, swiftCode_);
		}
		size += unknownFields.getSerializedSize();
		memoizedSize = size;
		return size;
	}
	
	@Override
	public boolean equals(final Object obj) {
		if (obj == this) {
			return true;
		}
		
		if (!(obj instanceof AchCreditTransfer)) {
			return super.equals(obj);
		}
		
		AchCreditTransfer other = (AchCreditTransfer) obj;
		
		if (!getAccountNumber().equals(other.getAccountNumber())) return false;
		if (!getRoutingNumber().equals(other.getRoutingNumber())) return false;
		if (!getFingerprint().equals(other.getFingerprint())) return false;
		if (!getBankName().equals(other.getBankName())) return false;
		if (!getSwiftCode().equals(other.getSwiftCode())) return false;
		if (!unknownFields.equals(other.unknownFields)) return false;
		return true;
	}
	
	@Override
	public int hashCode() {
		if (memoizedHashCode != 0) {
			return memoizedHashCode;
		}
		int hash = 41;
		hash = (19 * hash) + getDescriptor().hashCode();
		hash = (37 * hash) + ACCOUNTNUMBER_FIELD_NUMBER;
		hash = (53 * hash) + getAccountNumber().hashCode();
		hash = (37 * hash) + ROUTINGNUMBER_FIELD_NUMBER;
		hash = (53 * hash) + getRoutingNumber().hashCode();
		hash = (37 * hash) + FINGERPRINT_FIELD_NUMBER;
		hash = (53 * hash) + getFingerprint().hashCode();
		hash = (37 * hash) + BANKNAME_FIELD_NUMBER;
		hash = (53 * hash) + getBankName().hashCode();
		hash = (37 * hash) + SWIFTCODE_FIELD_NUMBER;
		hash = (53 * hash) + getSwiftCode().hashCode();
		hash = (29 * hash) + unknownFields.hashCode();
		memoizedHashCode = hash;
		return hash;
	}
	
	public static AchCreditTransfer parseFrom(
			ByteBuffer data) throws InvalidProtocolBufferException{
		return PARSER.parseFrom(data);
	}
	
	public static AchCreditTransfer parseFrom(ByteBuffer data,
			ExtensionRegistryLite extensionRegistry) 
		throws InvalidProtocolBufferException {
		return PARSER.parseFrom(data, extensionRegistry);
	}
	
	public static AchCreditTransfer parseFrom(ByteString data) throws InvalidProtocolBufferException {
		return PARSER.parseFrom(data);
	}
	
	public static AchCreditTransfer parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry)
		throws InvalidProtocolBufferException {
		return PARSER.parseFrom(data, extensionRegistry);
	}
	
	public static AchCreditTransfer parseFrom(byte[] data) throws InvalidProtocolBufferException {
		return PARSER.parseFrom(data);
	}
	
	public static AchCreditTransfer parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry)
		throws InvalidProtocolBufferException {
		return PARSER.parseFrom(data, extensionRegistry);
	}
	
	public static AchCreditTransfer parseFrom(InputStream input) throws IOException {
		return GeneratedMessageV3.parseWithIOException(PARSER, input);
	}
	
	public static AchCreditTransfer parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry)
		throws IOException {
		return GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
	}
	
	public static AchCreditTransfer parseDelimitedFrom(InputStream input) 
		throws IOException {
		return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
	}
	
	public static AchCreditTransfer parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry)
		throws IOException {
		return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
	}

	public static AchCreditTransfer parseFrom(CodedInputStream input) 
		throws IOException {
		return GeneratedMessageV3.parseWithIOException(PARSER, input);
	}
	
	public static AchCreditTransfer parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) 
		throws IOException{
		return GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
	}
	
	@Override
	public Builder newBuilderForType() {return newBuilder();}
	
	public static Builder newBuilder() {
		return DEFAULT_INSTANCE.toBuilder();
	}
	
	public static Builder newBuilder(AchCreditTransfer prototype) {
		return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
	}
	
	@Override
	public Builder toBuilder() {
		return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
	}
	
	@Override
	protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
		Builder builder = new Builder(parent);
		return builder;
	}
	
	public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AchCreditTransferOrBuilder {
		public static final Descriptors.Descriptor getDescriptor() {
			return PaymentGatewayService.internal_static_com_packtpub_v1_AchCreditTransfer_descriptor;
		}
		
		@Override
		protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
			return PaymentGatewayService.internal_static_com_packtpub_v1_AchCreditTransfer_fieldAccessorTable
					.ensureFieldAccessorsInitialized(
							AchCreditTransfer.class, AchCreditTransfer.Builder.class);
		}
		
		private Builder() {
			maybeForceBuilderInitialization();
		}
		
		private Builder(BuilderParent parent) {
			super(parent);
			maybeForceBuilderInitialization();
		}
		
		private void maybeForceBuilderInitialization() {
			if (GeneratedMessageV3.alwaysUseFieldBuilders) {
				
			}
		}
		
		@Override
		public Builder clear() {
			super.clear();
			accountNumber_ = "";
			routingNumber_ = "";
			fingerprint_ = "";
			bankName_ = "";
			swiftCode_ = "";
			return this;
		}
		
		@Override
		public Descriptors.Descriptor getDescriptorForType() {
			return PaymentGatewayService.internal_static_com_packtpub_v1_AchCreditTransfer_descriptor;
		}
		
		@Override
		public AchCreditTransfer getDefaultInstanceForType() {
			return AchCreditTransfer.getDefaultInstance();
		}
		
		@Override
		public AchCreditTransfer build() {
			AchCreditTransfer result = buildPartial();
			if (!result.isInitialized()) {
				throw newUninitializedMessageException(result);
			}
			return result;
		}
		
		@Override
		public AchCreditTransfer buildPartial() {
			AchCreditTransfer result = new AchCreditTransfer(this);
			result.accountNumber_ = accountNumber_;
			result.routingNumber_ = routingNumber_;
			result.bankName_ = bankName_;
			result.fingerprint_ = fingerprint_;
			result.swiftCode_ = swiftCode_;
			onBuilt();
			return result;
		}
		
		@Override
		public Builder clone() {
			return super.clone();
		}
		
		@Override
		public Builder setField(FieldDescriptor field, Object value) {
			return super.setField(field, value);
		}
		
		@Override
		public Builder clearField(FieldDescriptor field) {
			return super.clearField(field);
		}
		
		@Override
		public Builder clearOneof(OneofDescriptor oneof) {
			return super.clearOneof(oneof);
		}
		
		@Override
		public Builder setRepeatedField(FieldDescriptor field, int index, Object value) {
			return super.setRepeatedField(field, index, value);
		}
		
		@Override
		public Builder addRepeatedField(FieldDescriptor field, Object value) {
			return super.addRepeatedField(field, value);
		}
		
		@Override
		public Builder mergeFrom(Message other) {
			if (other instanceof AchCreditTransfer) {
				return mergeFrom((AchCreditTransfer) other);
			} else {
				super.mergeFrom(other);
				return this;
			}
		}
		
		public Builder mergeFrom(AchCreditTransfer other) {
			if (other == AchCreditTransfer.getDefaultInstance()) return this;
			if (!other.getAccountNumber().isEmpty()) {
				accountNumber_ = other.accountNumber_;
				onChanged();
			}
			if (!other.getRoutingNumber().isEmpty()) {
				routingNumber_ = other.routingNumber_;
				onChanged();
			}
			if (!other.getFingerprint().isEmpty()) {
				fingerprint_ = other.fingerprint_;
				onChanged();
			}
			if (!other.getBankName().isEmpty()) {
				bankName_ = other.bankName_;
				onChanged();
			}
			if (!other.getSwiftCode().isEmpty()) {
				swiftCode_ = other.swiftCode_;
				onChanged();
			}
			this.mergeUnknownFields(other.unknownFields);
			onChanged();
			return this;
		}
		
		@Override
		public final boolean isInitialized() {
			return true;
		}
		
		@Override
		public Builder mergeFrom(
			CodedInputStream input,
			ExtensionRegistryLite extensionRegistry) 
			throws IOException {
			AchCreditTransfer parsedMessage = null;
			try {
				parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
			} catch (InvalidProtocolBufferException e) {
				parsedMessage = (AchCreditTransfer) e.getUnfinishedMessage();
				throw e.unwrapIOException();
			} finally {
				if (parsedMessage != null) {
					mergeFrom(parsedMessage);
				}
			}
			return this;
		}
		
		private Object accountNumber_ = "";
		
		public String getAccountNumber() {
			Object ref = accountNumber_;
			if (!(ref instanceof String)) {
				ByteString bs = (ByteString) ref;
				String s = bs.toStringUtf8();
				accountNumber_ = s;
				return s;
			} else {
				return (String) ref;
			}
		}
		
		public ByteString getAccountNumberBytes() {
			Object ref = accountNumber_;
			if (ref instanceof String) {
				ByteString b = ByteString.copyFromUtf8((String) ref);
				accountNumber_ = b;
				return b;
			} else {
				return (ByteString) ref;
			}
		}
		
		public Builder setAccountNumber(String value) {
			if (value == null) {
				throw new NullPointerException();
			}
			accountNumber_ = value;
			onChanged();
			return this;
		}
		
		public Builder clearAccountNumber() {
			accountNumber_ = getDefaultInstance().getAccountNumber();
			onChanged();
			return this;
		}
		
		public Builder setAccountNumberBytes(
			ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			checkByteStringIsUtf8(value);
			accountNumber_ = value;
			onChanged();
			return this;
		}
		
		private Object routingNumber_ = "";
		public String getRoutingNumber() {
			Object ref = routingNumber_;
			if (!(ref instanceof String)) {
				ByteString bs = (ByteString) ref;
				String s = bs.toStringUtf8();
				routingNumber_ = s;
				return s;
			} else {
				return (String) ref;
			}
		}
		
		public ByteString getRoutingNumberBytes() {
			Object ref = routingNumber_;
			if (ref instanceof String) {
				ByteString b = ByteString.copyFromUtf8((String) ref);
				routingNumber_ = b;
				return b;
			} else {
				return (ByteString) ref;
			}
		}
		
		public Builder setRoutingNumber(String value) {
			if (value == null) {
				throw new NullPointerException();
			}
			routingNumber_ = value;
			onChanged();
			return this;
		}
		
		public Builder clearRoutingNumber() {
			routingNumber_ = getDefaultInstance().getRoutingNumber();
			onChanged();
			return this;
		}
		
		public Builder setRoutingNumberBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			checkByteStringIsUtf8(value);
			routingNumber_ = value;
			onChanged();
			return this;
		}
		
		private Object fingerprint_ = "";
		public String getFingerprint() {
			Object ref = fingerprint_;
			if (!(ref instanceof String)) {
				ByteString bs = (ByteString) ref;
				String s = bs.toStringUtf8();
				fingerprint_ = s;
				return s;
			} else {
				return (String) ref;
			}
		}
		
		public ByteString getFingerprintBytes() {
			Object ref = fingerprint_;
			if (ref instanceof String) {
				ByteString bs = ByteString.copyFromUtf8((String) ref);
				fingerprint_ = bs;
				return bs;
			} else {
				return (ByteString) ref;
			}
		}
		
		public Builder setFingerprint(String value) {
			if (value == null) {
				throw new NullPointerException();
			}
			fingerprint_ = value;
			onChanged();
			return this;
		}
		
		public Builder clearFingerprint() {
			fingerprint_ = getDefaultInstance().getFingerprint();
			onChanged();
			return this;
		}
		
		public Builder setFingerprintBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			checkByteStringIsUtf8(value);
			fingerprint_ = value;
			onChanged();
			return this;
		}
		
		private Object bankName_ = "";
		public String getBankName() {
			Object ref = bankName_;
			if (!(ref instanceof String)) {
				ByteString bs = (ByteString) ref;
				String s = bs.toStringUtf8();
				bankName_ = s;
				return s;
			} else {
				return (String) ref;
			}
		}
		
		public ByteString getBankNameBytes() {
			Object ref = bankName_;
			if (ref instanceof String) {
				ByteString b = ByteString.copyFromUtf8((String) ref);
				bankName_ = b;
				return b;
			} else {
				return (ByteString) ref;
			}
		}
		
		public Builder setBankName(String value) {
			if (value == null) {
				throw new NullPointerException();
			}
			bankName_ = value;
			onChanged();
			return this;
		}
		
		public Builder clearBankName() {
			bankName_ = getDefaultInstance().getBankName();
			onChanged();
			return this;
		}
		
		public Builder setBankNameBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			checkByteStringIsUtf8(value);
			bankName_ = value;
			onChanged();
			return this;
		}
		
		private Object swiftCode_ = "";
		
		public String getSwiftCode() {
			Object ref = swiftCode_;
			if (!(ref instanceof String)) {
				ByteString bs = (ByteString) ref;
				String s = bs.toStringUtf8();
				swiftCode_ = s;
				return s;
			} else {
				return (String) ref;
			}
		}
		
		public ByteString getSwiftCodeBytes() {
			Object ref = swiftCode_;
			if (ref instanceof String) {
				ByteString b = ByteString.copyFromUtf8((String) ref);
				swiftCode_ = b;
				return b;
			} else {
				return (ByteString) ref;
			}
		}
		
		public Builder setSwiftCode(String value) {
			if (value == null) {
				throw new NullPointerException();
			}
			swiftCode_ = value;
			onChanged();
			return this;
		}
		
		public Builder clearSwiftCode() {
			swiftCode_ = getDefaultInstance().getSwiftCode();
			onChanged();
			return this;
		}
		
		public Builder setSwiftCodeBytes(
			ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			checkByteStringIsUtf8(value);
			swiftCode_ = value;
			onChanged();
			return this;
		}
		
		@Override
		public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
			return super.setUnknownFields(unknownFields);
		}
		
		@Override
		public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
			return super.mergeUnknownFields(unknownFields);
		}
			
	}	 
	private static final AchCreditTransfer DEFAULT_INSTANCE;
	
	static {
		DEFAULT_INSTANCE = new AchCreditTransfer();
	}
	
	private static AchCreditTransfer getDefaultInstance() {
		return DEFAULT_INSTANCE;
	}
	
	private static final Parser<AchCreditTransfer> PARSER = new AbstractParser<AchCreditTransfer>(){
		@Override
		public AchCreditTransfer parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) 
			throws InvalidProtocolBufferException {
			return new AchCreditTransfer(input, extensionRegistry);
		}
	};
	
	public static Parser<AchCreditTransfer> parser() {
		return PARSER;
	}
	
	@Override
	public Parser<AchCreditTransfer> getParserForType() {
		return PARSER;
	}
	
	@Override
	public AchCreditTransfer getDefaultInstanceForType() {
		return DEFAULT_INSTANCE;
	}
}
