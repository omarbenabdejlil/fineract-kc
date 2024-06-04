/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */

package org.apache.fineract.avro.generic.v1;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class EnumOptionDataV1 extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord, org.apache.fineract.avro.generator.ByteBufferSerializable {
  private static final long serialVersionUID = 3073635852883298757L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"EnumOptionDataV1\",\"namespace\":\"org.apache.fineract.avro.generic.v1\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"code\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"value\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<EnumOptionDataV1> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<EnumOptionDataV1> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<EnumOptionDataV1> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<EnumOptionDataV1> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<EnumOptionDataV1> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this EnumOptionDataV1 to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  @Override
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a EnumOptionDataV1 from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a EnumOptionDataV1 instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static EnumOptionDataV1 fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.Integer id;
  private java.lang.String code;
  private java.lang.String value;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public EnumOptionDataV1() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param code The new value for code
   * @param value The new value for value
   */
  public EnumOptionDataV1(java.lang.Integer id, java.lang.String code, java.lang.String value) {
    this.id = id;
    this.code = code;
    this.value = value;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return code;
    case 2: return value;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.Integer)value$; break;
    case 1: code = value$ != null ? value$.toString() : null; break;
    case 2: value = value$ != null ? value$.toString() : null; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public java.lang.Integer getId() {
    return id;
  }


  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.Integer value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'code' field.
   * @return The value of the 'code' field.
   */
  public java.lang.String getCode() {
    return code;
  }


  /**
   * Sets the value of the 'code' field.
   * @param value the value to set.
   */
  public void setCode(java.lang.String value) {
    this.code = value;
  }

  /**
   * Gets the value of the 'value' field.
   * @return The value of the 'value' field.
   */
  public java.lang.String getValue() {
    return value;
  }


  /**
   * Sets the value of the 'value' field.
   * @param value the value to set.
   */
  public void setValue(java.lang.String value) {
    this.value = value;
  }

  /**
   * Creates a new EnumOptionDataV1 RecordBuilder.
   * @return A new EnumOptionDataV1 RecordBuilder
   */
  public static org.apache.fineract.avro.generic.v1.EnumOptionDataV1.Builder newBuilder() {
    return new org.apache.fineract.avro.generic.v1.EnumOptionDataV1.Builder();
  }

  /**
   * Creates a new EnumOptionDataV1 RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new EnumOptionDataV1 RecordBuilder
   */
  public static org.apache.fineract.avro.generic.v1.EnumOptionDataV1.Builder newBuilder(org.apache.fineract.avro.generic.v1.EnumOptionDataV1.Builder other) {
    if (other == null) {
      return new org.apache.fineract.avro.generic.v1.EnumOptionDataV1.Builder();
    } else {
      return new org.apache.fineract.avro.generic.v1.EnumOptionDataV1.Builder(other);
    }
  }

  /**
   * Creates a new EnumOptionDataV1 RecordBuilder by copying an existing EnumOptionDataV1 instance.
   * @param other The existing instance to copy.
   * @return A new EnumOptionDataV1 RecordBuilder
   */
  public static org.apache.fineract.avro.generic.v1.EnumOptionDataV1.Builder newBuilder(org.apache.fineract.avro.generic.v1.EnumOptionDataV1 other) {
    if (other == null) {
      return new org.apache.fineract.avro.generic.v1.EnumOptionDataV1.Builder();
    } else {
      return new org.apache.fineract.avro.generic.v1.EnumOptionDataV1.Builder(other);
    }
  }

  /**
   * RecordBuilder for EnumOptionDataV1 instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<EnumOptionDataV1>
    implements org.apache.avro.data.RecordBuilder<EnumOptionDataV1> {

    private java.lang.Integer id;
    private java.lang.String code;
    private java.lang.String value;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.apache.fineract.avro.generic.v1.EnumOptionDataV1.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.code)) {
        this.code = data().deepCopy(fields()[1].schema(), other.code);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.value)) {
        this.value = data().deepCopy(fields()[2].schema(), other.value);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
    }

    /**
     * Creates a Builder by copying an existing EnumOptionDataV1 instance
     * @param other The existing instance to copy.
     */
    private Builder(org.apache.fineract.avro.generic.v1.EnumOptionDataV1 other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.code)) {
        this.code = data().deepCopy(fields()[1].schema(), other.code);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.value)) {
        this.value = data().deepCopy(fields()[2].schema(), other.value);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public java.lang.Integer getId() {
      return id;
    }


    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public org.apache.fineract.avro.generic.v1.EnumOptionDataV1.Builder setId(java.lang.Integer value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public org.apache.fineract.avro.generic.v1.EnumOptionDataV1.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'code' field.
      * @return The value.
      */
    public java.lang.String getCode() {
      return code;
    }


    /**
      * Sets the value of the 'code' field.
      * @param value The value of 'code'.
      * @return This builder.
      */
    public org.apache.fineract.avro.generic.v1.EnumOptionDataV1.Builder setCode(java.lang.String value) {
      validate(fields()[1], value);
      this.code = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'code' field has been set.
      * @return True if the 'code' field has been set, false otherwise.
      */
    public boolean hasCode() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'code' field.
      * @return This builder.
      */
    public org.apache.fineract.avro.generic.v1.EnumOptionDataV1.Builder clearCode() {
      code = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'value' field.
      * @return The value.
      */
    public java.lang.String getValue() {
      return value;
    }


    /**
      * Sets the value of the 'value' field.
      * @param value The value of 'value'.
      * @return This builder.
      */
    public org.apache.fineract.avro.generic.v1.EnumOptionDataV1.Builder setValue(java.lang.String value) {
      validate(fields()[2], value);
      this.value = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'value' field has been set.
      * @return True if the 'value' field has been set, false otherwise.
      */
    public boolean hasValue() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'value' field.
      * @return This builder.
      */
    public org.apache.fineract.avro.generic.v1.EnumOptionDataV1.Builder clearValue() {
      value = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public EnumOptionDataV1 build() {
      try {
        EnumOptionDataV1 record = new EnumOptionDataV1();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.Integer) defaultValue(fields()[0]);
        record.code = fieldSetFlags()[1] ? this.code : (java.lang.String) defaultValue(fields()[1]);
        record.value = fieldSetFlags()[2] ? this.value : (java.lang.String) defaultValue(fields()[2]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<EnumOptionDataV1>
    WRITER$ = (org.apache.avro.io.DatumWriter<EnumOptionDataV1>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<EnumOptionDataV1>
    READER$ = (org.apache.avro.io.DatumReader<EnumOptionDataV1>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    if (this.id == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeInt(this.id);
    }

    if (this.code == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.code);
    }

    if (this.value == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.value);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (in.readIndex() != 1) {
        in.readNull();
        this.id = null;
      } else {
        this.id = in.readInt();
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.code = null;
      } else {
        this.code = in.readString();
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.value = null;
      } else {
        this.value = in.readString();
      }

    } else {
      for (int i = 0; i < 3; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (in.readIndex() != 1) {
            in.readNull();
            this.id = null;
          } else {
            this.id = in.readInt();
          }
          break;

        case 1:
          if (in.readIndex() != 1) {
            in.readNull();
            this.code = null;
          } else {
            this.code = in.readString();
          }
          break;

        case 2:
          if (in.readIndex() != 1) {
            in.readNull();
            this.value = null;
          } else {
            this.value = in.readString();
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}









