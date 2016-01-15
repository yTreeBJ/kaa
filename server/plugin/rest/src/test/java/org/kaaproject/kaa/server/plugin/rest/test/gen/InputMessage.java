/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.kaaproject.kaa.server.plugin.rest.test.gen;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class InputMessage extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"InputMessage\",\"namespace\":\"org.kaaproject.kaa.server.plugin.rest.test.gen\",\"fields\":[{\"name\":\"body\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   private java.lang.String body;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}. 
   */
  public InputMessage() {}

  /**
   * All-args constructor.
   */
  public InputMessage(java.lang.String body) {
    this.body = body;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return body;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: body = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'body' field.
   */
  public java.lang.String getBody() {
    return body;
  }

  /**
   * Sets the value of the 'body' field.
   * @param value the value to set.
   */
  public void setBody(java.lang.String value) {
    this.body = value;
  }

  /** Creates a new InputMessage RecordBuilder */
  public static org.kaaproject.kaa.server.plugin.rest.test.gen.InputMessage.Builder newBuilder() {
    return new org.kaaproject.kaa.server.plugin.rest.test.gen.InputMessage.Builder();
  }
  
  /** Creates a new InputMessage RecordBuilder by copying an existing Builder */
  public static org.kaaproject.kaa.server.plugin.rest.test.gen.InputMessage.Builder newBuilder(org.kaaproject.kaa.server.plugin.rest.test.gen.InputMessage.Builder other) {
    return new org.kaaproject.kaa.server.plugin.rest.test.gen.InputMessage.Builder(other);
  }
  
  /** Creates a new InputMessage RecordBuilder by copying an existing InputMessage instance */
  public static org.kaaproject.kaa.server.plugin.rest.test.gen.InputMessage.Builder newBuilder(org.kaaproject.kaa.server.plugin.rest.test.gen.InputMessage other) {
    return new org.kaaproject.kaa.server.plugin.rest.test.gen.InputMessage.Builder(other);
  }
  
  /**
   * RecordBuilder for InputMessage instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<InputMessage>
    implements org.apache.avro.data.RecordBuilder<InputMessage> {

    private java.lang.String body;

    /** Creates a new Builder */
    private Builder() {
      super(org.kaaproject.kaa.server.plugin.rest.test.gen.InputMessage.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.kaaproject.kaa.server.plugin.rest.test.gen.InputMessage.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.body)) {
        this.body = data().deepCopy(fields()[0].schema(), other.body);
        fieldSetFlags()[0] = true;
      }
    }
    
    /** Creates a Builder by copying an existing InputMessage instance */
    private Builder(org.kaaproject.kaa.server.plugin.rest.test.gen.InputMessage other) {
            super(org.kaaproject.kaa.server.plugin.rest.test.gen.InputMessage.SCHEMA$);
      if (isValidValue(fields()[0], other.body)) {
        this.body = data().deepCopy(fields()[0].schema(), other.body);
        fieldSetFlags()[0] = true;
      }
    }

    /** Gets the value of the 'body' field */
    public java.lang.String getBody() {
      return body;
    }
    
    /** Sets the value of the 'body' field */
    public org.kaaproject.kaa.server.plugin.rest.test.gen.InputMessage.Builder setBody(java.lang.String value) {
      validate(fields()[0], value);
      this.body = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'body' field has been set */
    public boolean hasBody() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'body' field */
    public org.kaaproject.kaa.server.plugin.rest.test.gen.InputMessage.Builder clearBody() {
      body = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    public InputMessage build() {
      try {
        InputMessage record = new InputMessage();
        record.body = fieldSetFlags()[0] ? this.body : (java.lang.String) defaultValue(fields()[0]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}