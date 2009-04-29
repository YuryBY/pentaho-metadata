/*
 * Copyright 2009 Pentaho Corporation.  All rights reserved.
 * This software was developed by Pentaho Corporation and is provided under the terms
 * of the Mozilla Public License, Version 1.1, or any later version. You may not use
 * this file except in compliance with the license. If you need a copy of the license,
 * please go to http://www.mozilla.org/MPL/MPL-1.1.txt. The Original Code is the Pentaho
 * BI Platform.  The Initial Developer is Pentaho Corporation.
 *
 * Software distributed under the Mozilla Public License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or  implied. Please refer to
 * the license for the specific language governing your rights and limitations.
*/
package org.pentaho.metadata.model.concept.types;

import org.pentaho.pms.messages.Messages;

public enum DataType {
  UNKNOWN(0, "Unknown", Messages.getString("DataType.USER_UNKNOWN_DESC")),
  STRING(1, "String", Messages.getString("DataType.USER_STRING_DESC")),
  DATE(2, "Date", Messages.getString("DataType.USER_DATE_DESC")),
  BOOLEAN(3, "Boolean", Messages.getString("DataType.USER_BOOLEAN_DESC")),
  NUMERIC(4, "Numeric", Messages.getString("DataType.USER_NUMERIC_DESC")),
  BINARY(5, "Binary", Messages.getString("DataType.USER_BINARY_DESC")),
  IMAGE(6, "Image", Messages.getString("DataType.USER_IMAGE_DESC")),
  URL(7, "URL", Messages.getString("DataType.USER_URL_DESC"));
  

  private int type;
  private String name, description;

  private DataType(int type, String name, String description) {
    this.type = type;
    this.name = name;
    this.description = description;
  }

  public int getType() {
    return type;
  }

  public void setType(int type) {
    this.type = type;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

}
