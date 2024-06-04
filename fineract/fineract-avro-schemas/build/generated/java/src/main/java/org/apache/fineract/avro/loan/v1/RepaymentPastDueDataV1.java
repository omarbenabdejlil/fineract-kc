/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */

package org.apache.fineract.avro.loan.v1;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class RepaymentPastDueDataV1 extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord, org.apache.fineract.avro.generator.ByteBufferSerializable {
  private static final long serialVersionUID = 4328848051642197493L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"RepaymentPastDueDataV1\",\"namespace\":\"org.apache.fineract.avro.loan.v1\",\"fields\":[{\"name\":\"totalAmount\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":20,\"scale\":8}],\"default\":null},{\"name\":\"principalAmount\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":20,\"scale\":8}],\"default\":null},{\"name\":\"interestAmount\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":20,\"scale\":8}],\"default\":null},{\"name\":\"feeAmount\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":20,\"scale\":8}],\"default\":null},{\"name\":\"penaltyAmount\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":20,\"scale\":8}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();
  static {
    MODEL$.addLogicalTypeConversion(new org.apache.avro.Conversions.DecimalConversion());
  }

  private static final BinaryMessageEncoder<RepaymentPastDueDataV1> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<RepaymentPastDueDataV1> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<RepaymentPastDueDataV1> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<RepaymentPastDueDataV1> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<RepaymentPastDueDataV1> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this RepaymentPastDueDataV1 to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  @Override
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a RepaymentPastDueDataV1 from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a RepaymentPastDueDataV1 instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static RepaymentPastDueDataV1 fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.math.BigDecimal totalAmount;
  private java.math.BigDecimal principalAmount;
  private java.math.BigDecimal interestAmount;
  private java.math.BigDecimal feeAmount;
  private java.math.BigDecimal penaltyAmount;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public RepaymentPastDueDataV1() {}

  /**
   * All-args constructor.
   * @param totalAmount The new value for totalAmount
   * @param principalAmount The new value for principalAmount
   * @param interestAmount The new value for interestAmount
   * @param feeAmount The new value for feeAmount
   * @param penaltyAmount The new value for penaltyAmount
   */
  public RepaymentPastDueDataV1(java.math.BigDecimal totalAmount, java.math.BigDecimal principalAmount, java.math.BigDecimal interestAmount, java.math.BigDecimal feeAmount, java.math.BigDecimal penaltyAmount) {
    this.totalAmount = totalAmount;
    this.principalAmount = principalAmount;
    this.interestAmount = interestAmount;
    this.feeAmount = feeAmount;
    this.penaltyAmount = penaltyAmount;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return totalAmount;
    case 1: return principalAmount;
    case 2: return interestAmount;
    case 3: return feeAmount;
    case 4: return penaltyAmount;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: totalAmount = (java.math.BigDecimal)value$; break;
    case 1: principalAmount = (java.math.BigDecimal)value$; break;
    case 2: interestAmount = (java.math.BigDecimal)value$; break;
    case 3: feeAmount = (java.math.BigDecimal)value$; break;
    case 4: penaltyAmount = (java.math.BigDecimal)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'totalAmount' field.
   * @return The value of the 'totalAmount' field.
   */
  public java.math.BigDecimal getTotalAmount() {
    return totalAmount;
  }


  /**
   * Sets the value of the 'totalAmount' field.
   * @param value the value to set.
   */
  public void setTotalAmount(java.math.BigDecimal value) {
    this.totalAmount = value;
  }

  /**
   * Gets the value of the 'principalAmount' field.
   * @return The value of the 'principalAmount' field.
   */
  public java.math.BigDecimal getPrincipalAmount() {
    return principalAmount;
  }


  /**
   * Sets the value of the 'principalAmount' field.
   * @param value the value to set.
   */
  public void setPrincipalAmount(java.math.BigDecimal value) {
    this.principalAmount = value;
  }

  /**
   * Gets the value of the 'interestAmount' field.
   * @return The value of the 'interestAmount' field.
   */
  public java.math.BigDecimal getInterestAmount() {
    return interestAmount;
  }


  /**
   * Sets the value of the 'interestAmount' field.
   * @param value the value to set.
   */
  public void setInterestAmount(java.math.BigDecimal value) {
    this.interestAmount = value;
  }

  /**
   * Gets the value of the 'feeAmount' field.
   * @return The value of the 'feeAmount' field.
   */
  public java.math.BigDecimal getFeeAmount() {
    return feeAmount;
  }


  /**
   * Sets the value of the 'feeAmount' field.
   * @param value the value to set.
   */
  public void setFeeAmount(java.math.BigDecimal value) {
    this.feeAmount = value;
  }

  /**
   * Gets the value of the 'penaltyAmount' field.
   * @return The value of the 'penaltyAmount' field.
   */
  public java.math.BigDecimal getPenaltyAmount() {
    return penaltyAmount;
  }


  /**
   * Sets the value of the 'penaltyAmount' field.
   * @param value the value to set.
   */
  public void setPenaltyAmount(java.math.BigDecimal value) {
    this.penaltyAmount = value;
  }

  /**
   * Creates a new RepaymentPastDueDataV1 RecordBuilder.
   * @return A new RepaymentPastDueDataV1 RecordBuilder
   */
  public static org.apache.fineract.avro.loan.v1.RepaymentPastDueDataV1.Builder newBuilder() {
    return new org.apache.fineract.avro.loan.v1.RepaymentPastDueDataV1.Builder();
  }

  /**
   * Creates a new RepaymentPastDueDataV1 RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new RepaymentPastDueDataV1 RecordBuilder
   */
  public static org.apache.fineract.avro.loan.v1.RepaymentPastDueDataV1.Builder newBuilder(org.apache.fineract.avro.loan.v1.RepaymentPastDueDataV1.Builder other) {
    if (other == null) {
      return new org.apache.fineract.avro.loan.v1.RepaymentPastDueDataV1.Builder();
    } else {
      return new org.apache.fineract.avro.loan.v1.RepaymentPastDueDataV1.Builder(other);
    }
  }

  /**
   * Creates a new RepaymentPastDueDataV1 RecordBuilder by copying an existing RepaymentPastDueDataV1 instance.
   * @param other The existing instance to copy.
   * @return A new RepaymentPastDueDataV1 RecordBuilder
   */
  public static org.apache.fineract.avro.loan.v1.RepaymentPastDueDataV1.Builder newBuilder(org.apache.fineract.avro.loan.v1.RepaymentPastDueDataV1 other) {
    if (other == null) {
      return new org.apache.fineract.avro.loan.v1.RepaymentPastDueDataV1.Builder();
    } else {
      return new org.apache.fineract.avro.loan.v1.RepaymentPastDueDataV1.Builder(other);
    }
  }

  /**
   * RecordBuilder for RepaymentPastDueDataV1 instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<RepaymentPastDueDataV1>
    implements org.apache.avro.data.RecordBuilder<RepaymentPastDueDataV1> {

    private java.math.BigDecimal totalAmount;
    private java.math.BigDecimal principalAmount;
    private java.math.BigDecimal interestAmount;
    private java.math.BigDecimal feeAmount;
    private java.math.BigDecimal penaltyAmount;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.apache.fineract.avro.loan.v1.RepaymentPastDueDataV1.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.totalAmount)) {
        this.totalAmount = data().deepCopy(fields()[0].schema(), other.totalAmount);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.principalAmount)) {
        this.principalAmount = data().deepCopy(fields()[1].schema(), other.principalAmount);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.interestAmount)) {
        this.interestAmount = data().deepCopy(fields()[2].schema(), other.interestAmount);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.feeAmount)) {
        this.feeAmount = data().deepCopy(fields()[3].schema(), other.feeAmount);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.penaltyAmount)) {
        this.penaltyAmount = data().deepCopy(fields()[4].schema(), other.penaltyAmount);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
    }

    /**
     * Creates a Builder by copying an existing RepaymentPastDueDataV1 instance
     * @param other The existing instance to copy.
     */
    private Builder(org.apache.fineract.avro.loan.v1.RepaymentPastDueDataV1 other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.totalAmount)) {
        this.totalAmount = data().deepCopy(fields()[0].schema(), other.totalAmount);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.principalAmount)) {
        this.principalAmount = data().deepCopy(fields()[1].schema(), other.principalAmount);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.interestAmount)) {
        this.interestAmount = data().deepCopy(fields()[2].schema(), other.interestAmount);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.feeAmount)) {
        this.feeAmount = data().deepCopy(fields()[3].schema(), other.feeAmount);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.penaltyAmount)) {
        this.penaltyAmount = data().deepCopy(fields()[4].schema(), other.penaltyAmount);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'totalAmount' field.
      * @return The value.
      */
    public java.math.BigDecimal getTotalAmount() {
      return totalAmount;
    }


    /**
      * Sets the value of the 'totalAmount' field.
      * @param value The value of 'totalAmount'.
      * @return This builder.
      */
    public org.apache.fineract.avro.loan.v1.RepaymentPastDueDataV1.Builder setTotalAmount(java.math.BigDecimal value) {
      validate(fields()[0], value);
      this.totalAmount = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'totalAmount' field has been set.
      * @return True if the 'totalAmount' field has been set, false otherwise.
      */
    public boolean hasTotalAmount() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'totalAmount' field.
      * @return This builder.
      */
    public org.apache.fineract.avro.loan.v1.RepaymentPastDueDataV1.Builder clearTotalAmount() {
      totalAmount = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'principalAmount' field.
      * @return The value.
      */
    public java.math.BigDecimal getPrincipalAmount() {
      return principalAmount;
    }


    /**
      * Sets the value of the 'principalAmount' field.
      * @param value The value of 'principalAmount'.
      * @return This builder.
      */
    public org.apache.fineract.avro.loan.v1.RepaymentPastDueDataV1.Builder setPrincipalAmount(java.math.BigDecimal value) {
      validate(fields()[1], value);
      this.principalAmount = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'principalAmount' field has been set.
      * @return True if the 'principalAmount' field has been set, false otherwise.
      */
    public boolean hasPrincipalAmount() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'principalAmount' field.
      * @return This builder.
      */
    public org.apache.fineract.avro.loan.v1.RepaymentPastDueDataV1.Builder clearPrincipalAmount() {
      principalAmount = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'interestAmount' field.
      * @return The value.
      */
    public java.math.BigDecimal getInterestAmount() {
      return interestAmount;
    }


    /**
      * Sets the value of the 'interestAmount' field.
      * @param value The value of 'interestAmount'.
      * @return This builder.
      */
    public org.apache.fineract.avro.loan.v1.RepaymentPastDueDataV1.Builder setInterestAmount(java.math.BigDecimal value) {
      validate(fields()[2], value);
      this.interestAmount = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'interestAmount' field has been set.
      * @return True if the 'interestAmount' field has been set, false otherwise.
      */
    public boolean hasInterestAmount() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'interestAmount' field.
      * @return This builder.
      */
    public org.apache.fineract.avro.loan.v1.RepaymentPastDueDataV1.Builder clearInterestAmount() {
      interestAmount = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'feeAmount' field.
      * @return The value.
      */
    public java.math.BigDecimal getFeeAmount() {
      return feeAmount;
    }


    /**
      * Sets the value of the 'feeAmount' field.
      * @param value The value of 'feeAmount'.
      * @return This builder.
      */
    public org.apache.fineract.avro.loan.v1.RepaymentPastDueDataV1.Builder setFeeAmount(java.math.BigDecimal value) {
      validate(fields()[3], value);
      this.feeAmount = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'feeAmount' field has been set.
      * @return True if the 'feeAmount' field has been set, false otherwise.
      */
    public boolean hasFeeAmount() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'feeAmount' field.
      * @return This builder.
      */
    public org.apache.fineract.avro.loan.v1.RepaymentPastDueDataV1.Builder clearFeeAmount() {
      feeAmount = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'penaltyAmount' field.
      * @return The value.
      */
    public java.math.BigDecimal getPenaltyAmount() {
      return penaltyAmount;
    }


    /**
      * Sets the value of the 'penaltyAmount' field.
      * @param value The value of 'penaltyAmount'.
      * @return This builder.
      */
    public org.apache.fineract.avro.loan.v1.RepaymentPastDueDataV1.Builder setPenaltyAmount(java.math.BigDecimal value) {
      validate(fields()[4], value);
      this.penaltyAmount = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'penaltyAmount' field has been set.
      * @return True if the 'penaltyAmount' field has been set, false otherwise.
      */
    public boolean hasPenaltyAmount() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'penaltyAmount' field.
      * @return This builder.
      */
    public org.apache.fineract.avro.loan.v1.RepaymentPastDueDataV1.Builder clearPenaltyAmount() {
      penaltyAmount = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public RepaymentPastDueDataV1 build() {
      try {
        RepaymentPastDueDataV1 record = new RepaymentPastDueDataV1();
        record.totalAmount = fieldSetFlags()[0] ? this.totalAmount : (java.math.BigDecimal) defaultValue(fields()[0]);
        record.principalAmount = fieldSetFlags()[1] ? this.principalAmount : (java.math.BigDecimal) defaultValue(fields()[1]);
        record.interestAmount = fieldSetFlags()[2] ? this.interestAmount : (java.math.BigDecimal) defaultValue(fields()[2]);
        record.feeAmount = fieldSetFlags()[3] ? this.feeAmount : (java.math.BigDecimal) defaultValue(fields()[3]);
        record.penaltyAmount = fieldSetFlags()[4] ? this.penaltyAmount : (java.math.BigDecimal) defaultValue(fields()[4]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<RepaymentPastDueDataV1>
    WRITER$ = (org.apache.avro.io.DatumWriter<RepaymentPastDueDataV1>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<RepaymentPastDueDataV1>
    READER$ = (org.apache.avro.io.DatumReader<RepaymentPastDueDataV1>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}










