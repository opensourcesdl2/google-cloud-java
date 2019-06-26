/*
 * Copyright 2019 The Grafeas Authors. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grafeas/v1/package.proto

package io.grafeas.v1;

/**
 *
 *
 * <pre>
 * Details on how a particular software package was installed on a system.
 * </pre>
 *
 * Protobuf type {@code grafeas.v1.PackageOccurrence}
 */
public final class PackageOccurrence extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:grafeas.v1.PackageOccurrence)
    PackageOccurrenceOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use PackageOccurrence.newBuilder() to construct.
  private PackageOccurrence(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private PackageOccurrence() {
    name_ = "";
    location_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private PackageOccurrence(
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
              java.lang.String s = input.readStringRequireUtf8();

              name_ = s;
              break;
            }
          case 18:
            {
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                location_ = new java.util.ArrayList<io.grafeas.v1.Location>();
                mutable_bitField0_ |= 0x00000002;
              }
              location_.add(input.readMessage(io.grafeas.v1.Location.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        location_ = java.util.Collections.unmodifiableList(location_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return io.grafeas.v1.Package.internal_static_grafeas_v1_PackageOccurrence_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grafeas.v1.Package.internal_static_grafeas_v1_PackageOccurrence_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grafeas.v1.PackageOccurrence.class, io.grafeas.v1.PackageOccurrence.Builder.class);
  }

  private int bitField0_;
  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   *
   *
   * <pre>
   * Output only. The name of the installed package.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. The name of the installed package.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LOCATION_FIELD_NUMBER = 2;
  private java.util.List<io.grafeas.v1.Location> location_;
  /**
   *
   *
   * <pre>
   * Required. All of the places within the filesystem versions of this package
   * have been found.
   * </pre>
   *
   * <code>repeated .grafeas.v1.Location location = 2;</code>
   */
  public java.util.List<io.grafeas.v1.Location> getLocationList() {
    return location_;
  }
  /**
   *
   *
   * <pre>
   * Required. All of the places within the filesystem versions of this package
   * have been found.
   * </pre>
   *
   * <code>repeated .grafeas.v1.Location location = 2;</code>
   */
  public java.util.List<? extends io.grafeas.v1.LocationOrBuilder> getLocationOrBuilderList() {
    return location_;
  }
  /**
   *
   *
   * <pre>
   * Required. All of the places within the filesystem versions of this package
   * have been found.
   * </pre>
   *
   * <code>repeated .grafeas.v1.Location location = 2;</code>
   */
  public int getLocationCount() {
    return location_.size();
  }
  /**
   *
   *
   * <pre>
   * Required. All of the places within the filesystem versions of this package
   * have been found.
   * </pre>
   *
   * <code>repeated .grafeas.v1.Location location = 2;</code>
   */
  public io.grafeas.v1.Location getLocation(int index) {
    return location_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Required. All of the places within the filesystem versions of this package
   * have been found.
   * </pre>
   *
   * <code>repeated .grafeas.v1.Location location = 2;</code>
   */
  public io.grafeas.v1.LocationOrBuilder getLocationOrBuilder(int index) {
    return location_.get(index);
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
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    for (int i = 0; i < location_.size(); i++) {
      output.writeMessage(2, location_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    for (int i = 0; i < location_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, location_.get(i));
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
    if (!(obj instanceof io.grafeas.v1.PackageOccurrence)) {
      return super.equals(obj);
    }
    io.grafeas.v1.PackageOccurrence other = (io.grafeas.v1.PackageOccurrence) obj;

    if (!getName().equals(other.getName())) return false;
    if (!getLocationList().equals(other.getLocationList())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (getLocationCount() > 0) {
      hash = (37 * hash) + LOCATION_FIELD_NUMBER;
      hash = (53 * hash) + getLocationList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grafeas.v1.PackageOccurrence parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1.PackageOccurrence parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1.PackageOccurrence parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1.PackageOccurrence parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1.PackageOccurrence parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1.PackageOccurrence parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1.PackageOccurrence parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.grafeas.v1.PackageOccurrence parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static io.grafeas.v1.PackageOccurrence parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static io.grafeas.v1.PackageOccurrence parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static io.grafeas.v1.PackageOccurrence parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.grafeas.v1.PackageOccurrence parseFrom(
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

  public static Builder newBuilder(io.grafeas.v1.PackageOccurrence prototype) {
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
   * Details on how a particular software package was installed on a system.
   * </pre>
   *
   * Protobuf type {@code grafeas.v1.PackageOccurrence}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:grafeas.v1.PackageOccurrence)
      io.grafeas.v1.PackageOccurrenceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.grafeas.v1.Package.internal_static_grafeas_v1_PackageOccurrence_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grafeas.v1.Package.internal_static_grafeas_v1_PackageOccurrence_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grafeas.v1.PackageOccurrence.class, io.grafeas.v1.PackageOccurrence.Builder.class);
    }

    // Construct using io.grafeas.v1.PackageOccurrence.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getLocationFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      name_ = "";

      if (locationBuilder_ == null) {
        location_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        locationBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return io.grafeas.v1.Package.internal_static_grafeas_v1_PackageOccurrence_descriptor;
    }

    @java.lang.Override
    public io.grafeas.v1.PackageOccurrence getDefaultInstanceForType() {
      return io.grafeas.v1.PackageOccurrence.getDefaultInstance();
    }

    @java.lang.Override
    public io.grafeas.v1.PackageOccurrence build() {
      io.grafeas.v1.PackageOccurrence result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grafeas.v1.PackageOccurrence buildPartial() {
      io.grafeas.v1.PackageOccurrence result = new io.grafeas.v1.PackageOccurrence(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.name_ = name_;
      if (locationBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          location_ = java.util.Collections.unmodifiableList(location_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.location_ = location_;
      } else {
        result.location_ = locationBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof io.grafeas.v1.PackageOccurrence) {
        return mergeFrom((io.grafeas.v1.PackageOccurrence) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grafeas.v1.PackageOccurrence other) {
      if (other == io.grafeas.v1.PackageOccurrence.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (locationBuilder_ == null) {
        if (!other.location_.isEmpty()) {
          if (location_.isEmpty()) {
            location_ = other.location_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureLocationIsMutable();
            location_.addAll(other.location_);
          }
          onChanged();
        }
      } else {
        if (!other.location_.isEmpty()) {
          if (locationBuilder_.isEmpty()) {
            locationBuilder_.dispose();
            locationBuilder_ = null;
            location_ = other.location_;
            bitField0_ = (bitField0_ & ~0x00000002);
            locationBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getLocationFieldBuilder()
                    : null;
          } else {
            locationBuilder_.addAllMessages(other.location_);
          }
        }
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
      io.grafeas.v1.PackageOccurrence parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grafeas.v1.PackageOccurrence) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Output only. The name of the installed package.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The name of the installed package.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The name of the installed package.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      name_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The name of the installed package.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder clearName() {

      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The name of the installed package.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      name_ = value;
      onChanged();
      return this;
    }

    private java.util.List<io.grafeas.v1.Location> location_ = java.util.Collections.emptyList();

    private void ensureLocationIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        location_ = new java.util.ArrayList<io.grafeas.v1.Location>(location_);
        bitField0_ |= 0x00000002;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            io.grafeas.v1.Location, io.grafeas.v1.Location.Builder, io.grafeas.v1.LocationOrBuilder>
        locationBuilder_;

    /**
     *
     *
     * <pre>
     * Required. All of the places within the filesystem versions of this package
     * have been found.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Location location = 2;</code>
     */
    public java.util.List<io.grafeas.v1.Location> getLocationList() {
      if (locationBuilder_ == null) {
        return java.util.Collections.unmodifiableList(location_);
      } else {
        return locationBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. All of the places within the filesystem versions of this package
     * have been found.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Location location = 2;</code>
     */
    public int getLocationCount() {
      if (locationBuilder_ == null) {
        return location_.size();
      } else {
        return locationBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. All of the places within the filesystem versions of this package
     * have been found.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Location location = 2;</code>
     */
    public io.grafeas.v1.Location getLocation(int index) {
      if (locationBuilder_ == null) {
        return location_.get(index);
      } else {
        return locationBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Required. All of the places within the filesystem versions of this package
     * have been found.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Location location = 2;</code>
     */
    public Builder setLocation(int index, io.grafeas.v1.Location value) {
      if (locationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLocationIsMutable();
        location_.set(index, value);
        onChanged();
      } else {
        locationBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. All of the places within the filesystem versions of this package
     * have been found.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Location location = 2;</code>
     */
    public Builder setLocation(int index, io.grafeas.v1.Location.Builder builderForValue) {
      if (locationBuilder_ == null) {
        ensureLocationIsMutable();
        location_.set(index, builderForValue.build());
        onChanged();
      } else {
        locationBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. All of the places within the filesystem versions of this package
     * have been found.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Location location = 2;</code>
     */
    public Builder addLocation(io.grafeas.v1.Location value) {
      if (locationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLocationIsMutable();
        location_.add(value);
        onChanged();
      } else {
        locationBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. All of the places within the filesystem versions of this package
     * have been found.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Location location = 2;</code>
     */
    public Builder addLocation(int index, io.grafeas.v1.Location value) {
      if (locationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLocationIsMutable();
        location_.add(index, value);
        onChanged();
      } else {
        locationBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. All of the places within the filesystem versions of this package
     * have been found.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Location location = 2;</code>
     */
    public Builder addLocation(io.grafeas.v1.Location.Builder builderForValue) {
      if (locationBuilder_ == null) {
        ensureLocationIsMutable();
        location_.add(builderForValue.build());
        onChanged();
      } else {
        locationBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. All of the places within the filesystem versions of this package
     * have been found.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Location location = 2;</code>
     */
    public Builder addLocation(int index, io.grafeas.v1.Location.Builder builderForValue) {
      if (locationBuilder_ == null) {
        ensureLocationIsMutable();
        location_.add(index, builderForValue.build());
        onChanged();
      } else {
        locationBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. All of the places within the filesystem versions of this package
     * have been found.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Location location = 2;</code>
     */
    public Builder addAllLocation(java.lang.Iterable<? extends io.grafeas.v1.Location> values) {
      if (locationBuilder_ == null) {
        ensureLocationIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, location_);
        onChanged();
      } else {
        locationBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. All of the places within the filesystem versions of this package
     * have been found.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Location location = 2;</code>
     */
    public Builder clearLocation() {
      if (locationBuilder_ == null) {
        location_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        locationBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. All of the places within the filesystem versions of this package
     * have been found.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Location location = 2;</code>
     */
    public Builder removeLocation(int index) {
      if (locationBuilder_ == null) {
        ensureLocationIsMutable();
        location_.remove(index);
        onChanged();
      } else {
        locationBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. All of the places within the filesystem versions of this package
     * have been found.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Location location = 2;</code>
     */
    public io.grafeas.v1.Location.Builder getLocationBuilder(int index) {
      return getLocationFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Required. All of the places within the filesystem versions of this package
     * have been found.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Location location = 2;</code>
     */
    public io.grafeas.v1.LocationOrBuilder getLocationOrBuilder(int index) {
      if (locationBuilder_ == null) {
        return location_.get(index);
      } else {
        return locationBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Required. All of the places within the filesystem versions of this package
     * have been found.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Location location = 2;</code>
     */
    public java.util.List<? extends io.grafeas.v1.LocationOrBuilder> getLocationOrBuilderList() {
      if (locationBuilder_ != null) {
        return locationBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(location_);
      }
    }
    /**
     *
     *
     * <pre>
     * Required. All of the places within the filesystem versions of this package
     * have been found.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Location location = 2;</code>
     */
    public io.grafeas.v1.Location.Builder addLocationBuilder() {
      return getLocationFieldBuilder().addBuilder(io.grafeas.v1.Location.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Required. All of the places within the filesystem versions of this package
     * have been found.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Location location = 2;</code>
     */
    public io.grafeas.v1.Location.Builder addLocationBuilder(int index) {
      return getLocationFieldBuilder()
          .addBuilder(index, io.grafeas.v1.Location.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Required. All of the places within the filesystem versions of this package
     * have been found.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Location location = 2;</code>
     */
    public java.util.List<io.grafeas.v1.Location.Builder> getLocationBuilderList() {
      return getLocationFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            io.grafeas.v1.Location, io.grafeas.v1.Location.Builder, io.grafeas.v1.LocationOrBuilder>
        getLocationFieldBuilder() {
      if (locationBuilder_ == null) {
        locationBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                io.grafeas.v1.Location,
                io.grafeas.v1.Location.Builder,
                io.grafeas.v1.LocationOrBuilder>(
                location_, ((bitField0_ & 0x00000002) != 0), getParentForChildren(), isClean());
        location_ = null;
      }
      return locationBuilder_;
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

    // @@protoc_insertion_point(builder_scope:grafeas.v1.PackageOccurrence)
  }

  // @@protoc_insertion_point(class_scope:grafeas.v1.PackageOccurrence)
  private static final io.grafeas.v1.PackageOccurrence DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new io.grafeas.v1.PackageOccurrence();
  }

  public static io.grafeas.v1.PackageOccurrence getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PackageOccurrence> PARSER =
      new com.google.protobuf.AbstractParser<PackageOccurrence>() {
        @java.lang.Override
        public PackageOccurrence parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new PackageOccurrence(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<PackageOccurrence> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PackageOccurrence> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grafeas.v1.PackageOccurrence getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
