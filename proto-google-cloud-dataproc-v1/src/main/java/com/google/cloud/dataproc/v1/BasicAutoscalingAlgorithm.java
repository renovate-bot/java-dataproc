// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1/autoscaling_policies.proto

package com.google.cloud.dataproc.v1;

/**
 *
 *
 * <pre>
 * Basic algorithm for autoscaling.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataproc.v1.BasicAutoscalingAlgorithm}
 */
public final class BasicAutoscalingAlgorithm extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataproc.v1.BasicAutoscalingAlgorithm)
    BasicAutoscalingAlgorithmOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use BasicAutoscalingAlgorithm.newBuilder() to construct.
  private BasicAutoscalingAlgorithm(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BasicAutoscalingAlgorithm() {}

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private BasicAutoscalingAlgorithm(
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
          case 10:
            {
              com.google.cloud.dataproc.v1.BasicYarnAutoscalingConfig.Builder subBuilder = null;
              if (yarnConfig_ != null) {
                subBuilder = yarnConfig_.toBuilder();
              }
              yarnConfig_ =
                  input.readMessage(
                      com.google.cloud.dataproc.v1.BasicYarnAutoscalingConfig.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(yarnConfig_);
                yarnConfig_ = subBuilder.buildPartial();
              }

              break;
            }
          case 18:
            {
              com.google.protobuf.Duration.Builder subBuilder = null;
              if (cooldownPeriod_ != null) {
                subBuilder = cooldownPeriod_.toBuilder();
              }
              cooldownPeriod_ =
                  input.readMessage(com.google.protobuf.Duration.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(cooldownPeriod_);
                cooldownPeriod_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dataproc.v1.AutoscalingPoliciesProto
        .internal_static_google_cloud_dataproc_v1_BasicAutoscalingAlgorithm_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataproc.v1.AutoscalingPoliciesProto
        .internal_static_google_cloud_dataproc_v1_BasicAutoscalingAlgorithm_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataproc.v1.BasicAutoscalingAlgorithm.class,
            com.google.cloud.dataproc.v1.BasicAutoscalingAlgorithm.Builder.class);
  }

  public static final int YARN_CONFIG_FIELD_NUMBER = 1;
  private com.google.cloud.dataproc.v1.BasicYarnAutoscalingConfig yarnConfig_;
  /**
   *
   *
   * <pre>
   * Required. YARN autoscaling configuration.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.BasicYarnAutoscalingConfig yarn_config = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  public boolean hasYarnConfig() {
    return yarnConfig_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. YARN autoscaling configuration.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.BasicYarnAutoscalingConfig yarn_config = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  public com.google.cloud.dataproc.v1.BasicYarnAutoscalingConfig getYarnConfig() {
    return yarnConfig_ == null
        ? com.google.cloud.dataproc.v1.BasicYarnAutoscalingConfig.getDefaultInstance()
        : yarnConfig_;
  }
  /**
   *
   *
   * <pre>
   * Required. YARN autoscaling configuration.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.BasicYarnAutoscalingConfig yarn_config = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  public com.google.cloud.dataproc.v1.BasicYarnAutoscalingConfigOrBuilder getYarnConfigOrBuilder() {
    return getYarnConfig();
  }

  public static final int COOLDOWN_PERIOD_FIELD_NUMBER = 2;
  private com.google.protobuf.Duration cooldownPeriod_;
  /**
   *
   *
   * <pre>
   * Optional. Duration between scaling events. A scaling period starts after
   * the update operation from the previous event has completed.
   * Bounds: [2m, 1d]. Default: 2m.
   * </pre>
   *
   * <code>.google.protobuf.Duration cooldown_period = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  public boolean hasCooldownPeriod() {
    return cooldownPeriod_ != null;
  }
  /**
   *
   *
   * <pre>
   * Optional. Duration between scaling events. A scaling period starts after
   * the update operation from the previous event has completed.
   * Bounds: [2m, 1d]. Default: 2m.
   * </pre>
   *
   * <code>.google.protobuf.Duration cooldown_period = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  public com.google.protobuf.Duration getCooldownPeriod() {
    return cooldownPeriod_ == null
        ? com.google.protobuf.Duration.getDefaultInstance()
        : cooldownPeriod_;
  }
  /**
   *
   *
   * <pre>
   * Optional. Duration between scaling events. A scaling period starts after
   * the update operation from the previous event has completed.
   * Bounds: [2m, 1d]. Default: 2m.
   * </pre>
   *
   * <code>.google.protobuf.Duration cooldown_period = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  public com.google.protobuf.DurationOrBuilder getCooldownPeriodOrBuilder() {
    return getCooldownPeriod();
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (yarnConfig_ != null) {
      output.writeMessage(1, getYarnConfig());
    }
    if (cooldownPeriod_ != null) {
      output.writeMessage(2, getCooldownPeriod());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (yarnConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getYarnConfig());
    }
    if (cooldownPeriod_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getCooldownPeriod());
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
    if (!(obj instanceof com.google.cloud.dataproc.v1.BasicAutoscalingAlgorithm)) {
      return super.equals(obj);
    }
    com.google.cloud.dataproc.v1.BasicAutoscalingAlgorithm other =
        (com.google.cloud.dataproc.v1.BasicAutoscalingAlgorithm) obj;

    if (hasYarnConfig() != other.hasYarnConfig()) return false;
    if (hasYarnConfig()) {
      if (!getYarnConfig().equals(other.getYarnConfig())) return false;
    }
    if (hasCooldownPeriod() != other.hasCooldownPeriod()) return false;
    if (hasCooldownPeriod()) {
      if (!getCooldownPeriod().equals(other.getCooldownPeriod())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasYarnConfig()) {
      hash = (37 * hash) + YARN_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getYarnConfig().hashCode();
    }
    if (hasCooldownPeriod()) {
      hash = (37 * hash) + COOLDOWN_PERIOD_FIELD_NUMBER;
      hash = (53 * hash) + getCooldownPeriod().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataproc.v1.BasicAutoscalingAlgorithm parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1.BasicAutoscalingAlgorithm parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.BasicAutoscalingAlgorithm parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1.BasicAutoscalingAlgorithm parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.BasicAutoscalingAlgorithm parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1.BasicAutoscalingAlgorithm parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.BasicAutoscalingAlgorithm parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1.BasicAutoscalingAlgorithm parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.BasicAutoscalingAlgorithm parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1.BasicAutoscalingAlgorithm parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.BasicAutoscalingAlgorithm parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1.BasicAutoscalingAlgorithm parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.dataproc.v1.BasicAutoscalingAlgorithm prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Basic algorithm for autoscaling.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataproc.v1.BasicAutoscalingAlgorithm}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataproc.v1.BasicAutoscalingAlgorithm)
      com.google.cloud.dataproc.v1.BasicAutoscalingAlgorithmOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dataproc.v1.AutoscalingPoliciesProto
          .internal_static_google_cloud_dataproc_v1_BasicAutoscalingAlgorithm_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataproc.v1.AutoscalingPoliciesProto
          .internal_static_google_cloud_dataproc_v1_BasicAutoscalingAlgorithm_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataproc.v1.BasicAutoscalingAlgorithm.class,
              com.google.cloud.dataproc.v1.BasicAutoscalingAlgorithm.Builder.class);
    }

    // Construct using com.google.cloud.dataproc.v1.BasicAutoscalingAlgorithm.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (yarnConfigBuilder_ == null) {
        yarnConfig_ = null;
      } else {
        yarnConfig_ = null;
        yarnConfigBuilder_ = null;
      }
      if (cooldownPeriodBuilder_ == null) {
        cooldownPeriod_ = null;
      } else {
        cooldownPeriod_ = null;
        cooldownPeriodBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dataproc.v1.AutoscalingPoliciesProto
          .internal_static_google_cloud_dataproc_v1_BasicAutoscalingAlgorithm_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.BasicAutoscalingAlgorithm getDefaultInstanceForType() {
      return com.google.cloud.dataproc.v1.BasicAutoscalingAlgorithm.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.BasicAutoscalingAlgorithm build() {
      com.google.cloud.dataproc.v1.BasicAutoscalingAlgorithm result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.BasicAutoscalingAlgorithm buildPartial() {
      com.google.cloud.dataproc.v1.BasicAutoscalingAlgorithm result =
          new com.google.cloud.dataproc.v1.BasicAutoscalingAlgorithm(this);
      if (yarnConfigBuilder_ == null) {
        result.yarnConfig_ = yarnConfig_;
      } else {
        result.yarnConfig_ = yarnConfigBuilder_.build();
      }
      if (cooldownPeriodBuilder_ == null) {
        result.cooldownPeriod_ = cooldownPeriod_;
      } else {
        result.cooldownPeriod_ = cooldownPeriodBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.dataproc.v1.BasicAutoscalingAlgorithm) {
        return mergeFrom((com.google.cloud.dataproc.v1.BasicAutoscalingAlgorithm) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataproc.v1.BasicAutoscalingAlgorithm other) {
      if (other == com.google.cloud.dataproc.v1.BasicAutoscalingAlgorithm.getDefaultInstance())
        return this;
      if (other.hasYarnConfig()) {
        mergeYarnConfig(other.getYarnConfig());
      }
      if (other.hasCooldownPeriod()) {
        mergeCooldownPeriod(other.getCooldownPeriod());
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
      com.google.cloud.dataproc.v1.BasicAutoscalingAlgorithm parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.dataproc.v1.BasicAutoscalingAlgorithm) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.dataproc.v1.BasicYarnAutoscalingConfig yarnConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dataproc.v1.BasicYarnAutoscalingConfig,
            com.google.cloud.dataproc.v1.BasicYarnAutoscalingConfig.Builder,
            com.google.cloud.dataproc.v1.BasicYarnAutoscalingConfigOrBuilder>
        yarnConfigBuilder_;
    /**
     *
     *
     * <pre>
     * Required. YARN autoscaling configuration.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.BasicYarnAutoscalingConfig yarn_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public boolean hasYarnConfig() {
      return yarnConfigBuilder_ != null || yarnConfig_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. YARN autoscaling configuration.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.BasicYarnAutoscalingConfig yarn_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.dataproc.v1.BasicYarnAutoscalingConfig getYarnConfig() {
      if (yarnConfigBuilder_ == null) {
        return yarnConfig_ == null
            ? com.google.cloud.dataproc.v1.BasicYarnAutoscalingConfig.getDefaultInstance()
            : yarnConfig_;
      } else {
        return yarnConfigBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. YARN autoscaling configuration.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.BasicYarnAutoscalingConfig yarn_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setYarnConfig(com.google.cloud.dataproc.v1.BasicYarnAutoscalingConfig value) {
      if (yarnConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        yarnConfig_ = value;
        onChanged();
      } else {
        yarnConfigBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. YARN autoscaling configuration.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.BasicYarnAutoscalingConfig yarn_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setYarnConfig(
        com.google.cloud.dataproc.v1.BasicYarnAutoscalingConfig.Builder builderForValue) {
      if (yarnConfigBuilder_ == null) {
        yarnConfig_ = builderForValue.build();
        onChanged();
      } else {
        yarnConfigBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. YARN autoscaling configuration.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.BasicYarnAutoscalingConfig yarn_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeYarnConfig(com.google.cloud.dataproc.v1.BasicYarnAutoscalingConfig value) {
      if (yarnConfigBuilder_ == null) {
        if (yarnConfig_ != null) {
          yarnConfig_ =
              com.google.cloud.dataproc.v1.BasicYarnAutoscalingConfig.newBuilder(yarnConfig_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          yarnConfig_ = value;
        }
        onChanged();
      } else {
        yarnConfigBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. YARN autoscaling configuration.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.BasicYarnAutoscalingConfig yarn_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearYarnConfig() {
      if (yarnConfigBuilder_ == null) {
        yarnConfig_ = null;
        onChanged();
      } else {
        yarnConfig_ = null;
        yarnConfigBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. YARN autoscaling configuration.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.BasicYarnAutoscalingConfig yarn_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.dataproc.v1.BasicYarnAutoscalingConfig.Builder getYarnConfigBuilder() {

      onChanged();
      return getYarnConfigFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. YARN autoscaling configuration.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.BasicYarnAutoscalingConfig yarn_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.dataproc.v1.BasicYarnAutoscalingConfigOrBuilder
        getYarnConfigOrBuilder() {
      if (yarnConfigBuilder_ != null) {
        return yarnConfigBuilder_.getMessageOrBuilder();
      } else {
        return yarnConfig_ == null
            ? com.google.cloud.dataproc.v1.BasicYarnAutoscalingConfig.getDefaultInstance()
            : yarnConfig_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. YARN autoscaling configuration.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.BasicYarnAutoscalingConfig yarn_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dataproc.v1.BasicYarnAutoscalingConfig,
            com.google.cloud.dataproc.v1.BasicYarnAutoscalingConfig.Builder,
            com.google.cloud.dataproc.v1.BasicYarnAutoscalingConfigOrBuilder>
        getYarnConfigFieldBuilder() {
      if (yarnConfigBuilder_ == null) {
        yarnConfigBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.dataproc.v1.BasicYarnAutoscalingConfig,
                com.google.cloud.dataproc.v1.BasicYarnAutoscalingConfig.Builder,
                com.google.cloud.dataproc.v1.BasicYarnAutoscalingConfigOrBuilder>(
                getYarnConfig(), getParentForChildren(), isClean());
        yarnConfig_ = null;
      }
      return yarnConfigBuilder_;
    }

    private com.google.protobuf.Duration cooldownPeriod_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration,
            com.google.protobuf.Duration.Builder,
            com.google.protobuf.DurationOrBuilder>
        cooldownPeriodBuilder_;
    /**
     *
     *
     * <pre>
     * Optional. Duration between scaling events. A scaling period starts after
     * the update operation from the previous event has completed.
     * Bounds: [2m, 1d]. Default: 2m.
     * </pre>
     *
     * <code>
     * .google.protobuf.Duration cooldown_period = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public boolean hasCooldownPeriod() {
      return cooldownPeriodBuilder_ != null || cooldownPeriod_ != null;
    }
    /**
     *
     *
     * <pre>
     * Optional. Duration between scaling events. A scaling period starts after
     * the update operation from the previous event has completed.
     * Bounds: [2m, 1d]. Default: 2m.
     * </pre>
     *
     * <code>
     * .google.protobuf.Duration cooldown_period = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.protobuf.Duration getCooldownPeriod() {
      if (cooldownPeriodBuilder_ == null) {
        return cooldownPeriod_ == null
            ? com.google.protobuf.Duration.getDefaultInstance()
            : cooldownPeriod_;
      } else {
        return cooldownPeriodBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Duration between scaling events. A scaling period starts after
     * the update operation from the previous event has completed.
     * Bounds: [2m, 1d]. Default: 2m.
     * </pre>
     *
     * <code>
     * .google.protobuf.Duration cooldown_period = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder setCooldownPeriod(com.google.protobuf.Duration value) {
      if (cooldownPeriodBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        cooldownPeriod_ = value;
        onChanged();
      } else {
        cooldownPeriodBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Duration between scaling events. A scaling period starts after
     * the update operation from the previous event has completed.
     * Bounds: [2m, 1d]. Default: 2m.
     * </pre>
     *
     * <code>
     * .google.protobuf.Duration cooldown_period = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder setCooldownPeriod(com.google.protobuf.Duration.Builder builderForValue) {
      if (cooldownPeriodBuilder_ == null) {
        cooldownPeriod_ = builderForValue.build();
        onChanged();
      } else {
        cooldownPeriodBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Duration between scaling events. A scaling period starts after
     * the update operation from the previous event has completed.
     * Bounds: [2m, 1d]. Default: 2m.
     * </pre>
     *
     * <code>
     * .google.protobuf.Duration cooldown_period = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder mergeCooldownPeriod(com.google.protobuf.Duration value) {
      if (cooldownPeriodBuilder_ == null) {
        if (cooldownPeriod_ != null) {
          cooldownPeriod_ =
              com.google.protobuf.Duration.newBuilder(cooldownPeriod_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          cooldownPeriod_ = value;
        }
        onChanged();
      } else {
        cooldownPeriodBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Duration between scaling events. A scaling period starts after
     * the update operation from the previous event has completed.
     * Bounds: [2m, 1d]. Default: 2m.
     * </pre>
     *
     * <code>
     * .google.protobuf.Duration cooldown_period = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder clearCooldownPeriod() {
      if (cooldownPeriodBuilder_ == null) {
        cooldownPeriod_ = null;
        onChanged();
      } else {
        cooldownPeriod_ = null;
        cooldownPeriodBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Duration between scaling events. A scaling period starts after
     * the update operation from the previous event has completed.
     * Bounds: [2m, 1d]. Default: 2m.
     * </pre>
     *
     * <code>
     * .google.protobuf.Duration cooldown_period = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.protobuf.Duration.Builder getCooldownPeriodBuilder() {

      onChanged();
      return getCooldownPeriodFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Optional. Duration between scaling events. A scaling period starts after
     * the update operation from the previous event has completed.
     * Bounds: [2m, 1d]. Default: 2m.
     * </pre>
     *
     * <code>
     * .google.protobuf.Duration cooldown_period = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.protobuf.DurationOrBuilder getCooldownPeriodOrBuilder() {
      if (cooldownPeriodBuilder_ != null) {
        return cooldownPeriodBuilder_.getMessageOrBuilder();
      } else {
        return cooldownPeriod_ == null
            ? com.google.protobuf.Duration.getDefaultInstance()
            : cooldownPeriod_;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Duration between scaling events. A scaling period starts after
     * the update operation from the previous event has completed.
     * Bounds: [2m, 1d]. Default: 2m.
     * </pre>
     *
     * <code>
     * .google.protobuf.Duration cooldown_period = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration,
            com.google.protobuf.Duration.Builder,
            com.google.protobuf.DurationOrBuilder>
        getCooldownPeriodFieldBuilder() {
      if (cooldownPeriodBuilder_ == null) {
        cooldownPeriodBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Duration,
                com.google.protobuf.Duration.Builder,
                com.google.protobuf.DurationOrBuilder>(
                getCooldownPeriod(), getParentForChildren(), isClean());
        cooldownPeriod_ = null;
      }
      return cooldownPeriodBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.dataproc.v1.BasicAutoscalingAlgorithm)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataproc.v1.BasicAutoscalingAlgorithm)
  private static final com.google.cloud.dataproc.v1.BasicAutoscalingAlgorithm DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataproc.v1.BasicAutoscalingAlgorithm();
  }

  public static com.google.cloud.dataproc.v1.BasicAutoscalingAlgorithm getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BasicAutoscalingAlgorithm> PARSER =
      new com.google.protobuf.AbstractParser<BasicAutoscalingAlgorithm>() {
        @java.lang.Override
        public BasicAutoscalingAlgorithm parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new BasicAutoscalingAlgorithm(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<BasicAutoscalingAlgorithm> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BasicAutoscalingAlgorithm> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataproc.v1.BasicAutoscalingAlgorithm getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}