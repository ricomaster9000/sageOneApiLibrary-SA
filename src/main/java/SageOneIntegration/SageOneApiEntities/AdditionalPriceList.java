/**
 Licensed to the Apache Software Foundation (ASF) under one
 or more contributor license agreements.  See the NOTICE file
 distributed with this work for additional information
 regarding copyright ownership.  The ASF licenses this file
 to you under the Apache License, Version 2.0 (the
 "License"); you may not use this file except in compliance
 with the License.  You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing,
 software distributed under the License is distributed on an
 "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 KIND, either express or implied.  See the License for the
 specific language governing permissions and limitations
 under the License.
 **/
package SageOneIntegration.SageOneApiEntities;
/**
 * Created by brent on 2017/05/31.
 */
public final class AdditionalPriceList extends MainEntity {
    //String length: inclusive between 0 and 100
    private String Description;
    private boolean IsDefault;

    public AdditionalPriceList() {
        this.setInitialized(true);


    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public boolean isDefault() {
        return IsDefault;
    }

    public void setDefault(boolean aDefault) {
        IsDefault = aDefault;
    }


    @Override
    public String toString() {
        return "AdditionalPriceList{" +
                "Description='" + Description + '\'' +
                ", IsDefault=" + IsDefault +
                '}';
    }
}