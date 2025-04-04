// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SystemService.proto

package generated.smarttransportation.system;

/**
 * Protobuf type {@code SystemService.Pricing}
 */
public  final class Pricing extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:SystemService.Pricing)
    PricingOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Pricing.newBuilder() to construct.
  private Pricing(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Pricing() {
    zoneId_ = "";
    baseRate_ = 0F;
    multiplier_ = 0F;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Pricing(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            zoneId_ = s;
            break;
          }
          case 21: {

            baseRate_ = input.readFloat();
            break;
          }
          case 29: {

            multiplier_ = input.readFloat();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return generated.smarttransportation.system.SystemServiceImpl.internal_static_SystemService_Pricing_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return generated.smarttransportation.system.SystemServiceImpl.internal_static_SystemService_Pricing_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            generated.smarttransportation.system.Pricing.class, generated.smarttransportation.system.Pricing.Builder.class);
  }

  public static final int ZONEID_FIELD_NUMBER = 1;
  private volatile java.lang.Object zoneId_;
  /**
   * <code>string zoneId = 1;</code>
   */
  public java.lang.String getZoneId() {
    java.lang.Object ref = zoneId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      zoneId_ = s;
      return s;
    }
  }
  /**
   * <code>string zoneId = 1;</code>
   */
  public com.google.protobuf.ByteString
      getZoneIdBytes() {
    java.lang.Object ref = zoneId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      zoneId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BASERATE_FIELD_NUMBER = 2;
  private float baseRate_;
  /**
   * <code>float baseRate = 2;</code>
   */
  public float getBaseRate() {
    return baseRate_;
  }

  public static final int MULTIPLIER_FIELD_NUMBER = 3;
  private float multiplier_;
  /**
   * <code>float multiplier = 3;</code>
   */
  public float getMultiplier() {
    return multiplier_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getZoneIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, zoneId_);
    }
    if (baseRate_ != 0F) {
      output.writeFloat(2, baseRate_);
    }
    if (multiplier_ != 0F) {
      output.writeFloat(3, multiplier_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getZoneIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, zoneId_);
    }
    if (baseRate_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, baseRate_);
    }
    if (multiplier_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, multiplier_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof generated.smarttransportation.system.Pricing)) {
      return super.equals(obj);
    }
    generated.smarttransportation.system.Pricing other = (generated.smarttransportation.system.Pricing) obj;

    boolean result = true;
    result = result && getZoneId()
        .equals(other.getZoneId());
    result = result && (
        java.lang.Float.floatToIntBits(getBaseRate())
        == java.lang.Float.floatToIntBits(
            other.getBaseRate()));
    result = result && (
        java.lang.Float.floatToIntBits(getMultiplier())
        == java.lang.Float.floatToIntBits(
            other.getMultiplier()));
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ZONEID_FIELD_NUMBER;
    hash = (53 * hash) + getZoneId().hashCode();
    hash = (37 * hash) + BASERATE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getBaseRate());
    hash = (37 * hash) + MULTIPLIER_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getMultiplier());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static generated.smarttransportation.system.Pricing parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.smarttransportation.system.Pricing parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.smarttransportation.system.Pricing parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.smarttransportation.system.Pricing parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.smarttransportation.system.Pricing parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.smarttransportation.system.Pricing parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.smarttransportation.system.Pricing parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static generated.smarttransportation.system.Pricing parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static generated.smarttransportation.system.Pricing parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static generated.smarttransportation.system.Pricing parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static generated.smarttransportation.system.Pricing parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static generated.smarttransportation.system.Pricing parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(generated.smarttransportation.system.Pricing prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code SystemService.Pricing}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:SystemService.Pricing)
      generated.smarttransportation.system.PricingOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return generated.smarttransportation.system.SystemServiceImpl.internal_static_SystemService_Pricing_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return generated.smarttransportation.system.SystemServiceImpl.internal_static_SystemService_Pricing_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              generated.smarttransportation.system.Pricing.class, generated.smarttransportation.system.Pricing.Builder.class);
    }

    // Construct using generated.smarttransportation.system.Pricing.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      zoneId_ = "";

      baseRate_ = 0F;

      multiplier_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return generated.smarttransportation.system.SystemServiceImpl.internal_static_SystemService_Pricing_descriptor;
    }

    @java.lang.Override
    public generated.smarttransportation.system.Pricing getDefaultInstanceForType() {
      return generated.smarttransportation.system.Pricing.getDefaultInstance();
    }

    @java.lang.Override
    public generated.smarttransportation.system.Pricing build() {
      generated.smarttransportation.system.Pricing result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public generated.smarttransportation.system.Pricing buildPartial() {
      generated.smarttransportation.system.Pricing result = new generated.smarttransportation.system.Pricing(this);
      result.zoneId_ = zoneId_;
      result.baseRate_ = baseRate_;
      result.multiplier_ = multiplier_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof generated.smarttransportation.system.Pricing) {
        return mergeFrom((generated.smarttransportation.system.Pricing)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(generated.smarttransportation.system.Pricing other) {
      if (other == generated.smarttransportation.system.Pricing.getDefaultInstance()) return this;
      if (!other.getZoneId().isEmpty()) {
        zoneId_ = other.zoneId_;
        onChanged();
      }
      if (other.getBaseRate() != 0F) {
        setBaseRate(other.getBaseRate());
      }
      if (other.getMultiplier() != 0F) {
        setMultiplier(other.getMultiplier());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      generated.smarttransportation.system.Pricing parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (generated.smarttransportation.system.Pricing) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object zoneId_ = "";
    /**
     * <code>string zoneId = 1;</code>
     */
    public java.lang.String getZoneId() {
      java.lang.Object ref = zoneId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        zoneId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string zoneId = 1;</code>
     */
    public com.google.protobuf.ByteString
        getZoneIdBytes() {
      java.lang.Object ref = zoneId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        zoneId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string zoneId = 1;</code>
     */
    public Builder setZoneId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      zoneId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string zoneId = 1;</code>
     */
    public Builder clearZoneId() {
      
      zoneId_ = getDefaultInstance().getZoneId();
      onChanged();
      return this;
    }
    /**
     * <code>string zoneId = 1;</code>
     */
    public Builder setZoneIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      zoneId_ = value;
      onChanged();
      return this;
    }

    private float baseRate_ ;
    /**
     * <code>float baseRate = 2;</code>
     */
    public float getBaseRate() {
      return baseRate_;
    }
    /**
     * <code>float baseRate = 2;</code>
     */
    public Builder setBaseRate(float value) {
      
      baseRate_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float baseRate = 2;</code>
     */
    public Builder clearBaseRate() {
      
      baseRate_ = 0F;
      onChanged();
      return this;
    }

    private float multiplier_ ;
    /**
     * <code>float multiplier = 3;</code>
     */
    public float getMultiplier() {
      return multiplier_;
    }
    /**
     * <code>float multiplier = 3;</code>
     */
    public Builder setMultiplier(float value) {
      
      multiplier_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float multiplier = 3;</code>
     */
    public Builder clearMultiplier() {
      
      multiplier_ = 0F;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:SystemService.Pricing)
  }

  // @@protoc_insertion_point(class_scope:SystemService.Pricing)
  private static final generated.smarttransportation.system.Pricing DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new generated.smarttransportation.system.Pricing();
  }

  public static generated.smarttransportation.system.Pricing getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Pricing>
      PARSER = new com.google.protobuf.AbstractParser<Pricing>() {
    @java.lang.Override
    public Pricing parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Pricing(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Pricing> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Pricing> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public generated.smarttransportation.system.Pricing getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

