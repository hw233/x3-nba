// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FirstRecharge.proto

package com.ftkj.proto;

public final class FirstRechargePB {
  private FirstRechargePB() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface FirstRechargeDataOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // repeated int32 status = 1;
    java.util.List<java.lang.Integer> getStatusList();
    int getStatusCount();
    int getStatus(int index);
  }
  public static final class FirstRechargeData extends
      com.google.protobuf.GeneratedMessage
      implements FirstRechargeDataOrBuilder {
    // Use FirstRechargeData.newBuilder() to construct.
    private FirstRechargeData(Builder builder) {
      super(builder);
    }
    private FirstRechargeData(boolean noInit) {}
    
    private static final FirstRechargeData defaultInstance;
    public static FirstRechargeData getDefaultInstance() {
      return defaultInstance;
    }
    
    public FirstRechargeData getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ftkj.proto.FirstRechargePB.internal_static_com_ftkj_proto_FirstRechargeData_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ftkj.proto.FirstRechargePB.internal_static_com_ftkj_proto_FirstRechargeData_fieldAccessorTable;
    }
    
    // repeated int32 status = 1;
    public static final int STATUS_FIELD_NUMBER = 1;
    private java.util.List<java.lang.Integer> status_;
    public java.util.List<java.lang.Integer>
        getStatusList() {
      return status_;
    }
    public int getStatusCount() {
      return status_.size();
    }
    public int getStatus(int index) {
      return status_.get(index);
    }
    
    private void initFields() {
      status_ = java.util.Collections.emptyList();;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      for (int i = 0; i < status_.size(); i++) {
        output.writeInt32(1, status_.get(i));
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < status_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(status_.get(i));
        }
        size += dataSize;
        size += 1 * getStatusList().size();
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static com.ftkj.proto.FirstRechargePB.FirstRechargeData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.ftkj.proto.FirstRechargePB.FirstRechargeData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.ftkj.proto.FirstRechargePB.FirstRechargeData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.ftkj.proto.FirstRechargePB.FirstRechargeData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.ftkj.proto.FirstRechargePB.FirstRechargeData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.ftkj.proto.FirstRechargePB.FirstRechargeData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.ftkj.proto.FirstRechargePB.FirstRechargeData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.ftkj.proto.FirstRechargePB.FirstRechargeData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.ftkj.proto.FirstRechargePB.FirstRechargeData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.ftkj.proto.FirstRechargePB.FirstRechargeData parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.ftkj.proto.FirstRechargePB.FirstRechargeData prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.ftkj.proto.FirstRechargePB.FirstRechargeDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.ftkj.proto.FirstRechargePB.internal_static_com_ftkj_proto_FirstRechargeData_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.ftkj.proto.FirstRechargePB.internal_static_com_ftkj_proto_FirstRechargeData_fieldAccessorTable;
      }
      
      // Construct using com.ftkj.proto.FirstRechargePB.FirstRechargeData.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        status_ = java.util.Collections.emptyList();;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.ftkj.proto.FirstRechargePB.FirstRechargeData.getDescriptor();
      }
      
      public com.ftkj.proto.FirstRechargePB.FirstRechargeData getDefaultInstanceForType() {
        return com.ftkj.proto.FirstRechargePB.FirstRechargeData.getDefaultInstance();
      }
      
      public com.ftkj.proto.FirstRechargePB.FirstRechargeData build() {
        com.ftkj.proto.FirstRechargePB.FirstRechargeData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.ftkj.proto.FirstRechargePB.FirstRechargeData buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.ftkj.proto.FirstRechargePB.FirstRechargeData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.ftkj.proto.FirstRechargePB.FirstRechargeData buildPartial() {
        com.ftkj.proto.FirstRechargePB.FirstRechargeData result = new com.ftkj.proto.FirstRechargePB.FirstRechargeData(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          status_ = java.util.Collections.unmodifiableList(status_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.status_ = status_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.ftkj.proto.FirstRechargePB.FirstRechargeData) {
          return mergeFrom((com.ftkj.proto.FirstRechargePB.FirstRechargeData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.ftkj.proto.FirstRechargePB.FirstRechargeData other) {
        if (other == com.ftkj.proto.FirstRechargePB.FirstRechargeData.getDefaultInstance()) return this;
        if (!other.status_.isEmpty()) {
          if (status_.isEmpty()) {
            status_ = other.status_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureStatusIsMutable();
            status_.addAll(other.status_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 8: {
              ensureStatusIsMutable();
              status_.add(input.readInt32());
              break;
            }
            case 10: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              while (input.getBytesUntilLimit() > 0) {
                addStatus(input.readInt32());
              }
              input.popLimit(limit);
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // repeated int32 status = 1;
      private java.util.List<java.lang.Integer> status_ = java.util.Collections.emptyList();;
      private void ensureStatusIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          status_ = new java.util.ArrayList<java.lang.Integer>(status_);
          bitField0_ |= 0x00000001;
         }
      }
      public java.util.List<java.lang.Integer>
          getStatusList() {
        return java.util.Collections.unmodifiableList(status_);
      }
      public int getStatusCount() {
        return status_.size();
      }
      public int getStatus(int index) {
        return status_.get(index);
      }
      public Builder setStatus(
          int index, int value) {
        ensureStatusIsMutable();
        status_.set(index, value);
        onChanged();
        return this;
      }
      public Builder addStatus(int value) {
        ensureStatusIsMutable();
        status_.add(value);
        onChanged();
        return this;
      }
      public Builder addAllStatus(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureStatusIsMutable();
        super.addAll(values, status_);
        onChanged();
        return this;
      }
      public Builder clearStatus() {
        status_ = java.util.Collections.emptyList();;
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.ftkj.proto.FirstRechargeData)
    }
    
    static {
      defaultInstance = new FirstRechargeData(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.ftkj.proto.FirstRechargeData)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_ftkj_proto_FirstRechargeData_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_ftkj_proto_FirstRechargeData_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023FirstRecharge.proto\022\016com.ftkj.proto\"#\n" +
      "\021FirstRechargeData\022\016\n\006status\030\001 \003(\005B\021B\017Fi" +
      "rstRechargePB"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_ftkj_proto_FirstRechargeData_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_ftkj_proto_FirstRechargeData_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_ftkj_proto_FirstRechargeData_descriptor,
              new java.lang.String[] { "Status", },
              com.ftkj.proto.FirstRechargePB.FirstRechargeData.class,
              com.ftkj.proto.FirstRechargePB.FirstRechargeData.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
