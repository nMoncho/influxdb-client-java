/*
 * InfluxDB OSS API Service
 * The InfluxDB v2 API provides a programmatic interface for all interactions with InfluxDB. Access the InfluxDB API using the `/api/v2/` endpoint. 
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.influxdb.client.domain;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets ScriptLanguage
 */
@JsonAdapter(ScriptLanguage.Adapter.class)
public enum ScriptLanguage {
  
  FLUX("flux");

  private String value;

  ScriptLanguage(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ScriptLanguage fromValue(String text) {
    for (ScriptLanguage b : ScriptLanguage.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ScriptLanguage> {
    @Override
    public void write(final JsonWriter jsonWriter, final ScriptLanguage enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ScriptLanguage read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ScriptLanguage.fromValue(String.valueOf(value));
    }
  }
}
