package org.hl7.fhir.instance.model;

/*
  Copyright (c) 2011-2013, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, 
  are permitted provided that the following conditions are met:
  
   * Redistributions of source code must retain the above copyright notice, this 
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, 
     this list of conditions and the following disclaimer in the documentation 
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT 
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
  POSSIBILITY OF SUCH DAMAGE.
  
*/

// Generated on Wed, May 22, 2013 17:49+1000 for FHIR v0.09


import java.math.*;
/**
 * A series of measurements taken by a device, with upper and lower limits. There may be more than one dimension in the data
 */
public class Array extends Type {

    /**
     * The base quantity that a measured value of zero represents. In addition, this provides the units of the entire measurement series
     */
    private Quantity origin;

    /**
     * The length of time between sampling times, measured in milliseconds
     */
    private Decimal period;

    /**
     * A correction factor that is applied to the sampled data points before they are added to the origin
     */
    private Decimal factor;

    /**
     * The lower limit of detection of the measured points. This is needed if any of the data points have the value "L" (lower than detection limit)
     */
    private Decimal lowerLimit;

    /**
     * The upper limit of detection of the measured points. This is needed if any of the data points have the value "U" (higher than detection limit)
     */
    private Decimal upperLimit;

    /**
     * The Number of sample points at each time point. If this value is greater than one, then the dimensions will be interlaced - all the sample points for a point in time will be recorded at once
     */
    private Integer dimensions;

    /**
     * A series of data points separated by a single space (character u20). The special values "E" (error), "L" (below detection limit) and "U" (above detection limit) can also be used
     */
    private String_ data;

    public Quantity getOrigin() { 
      return this.origin;
    }

    public void setOrigin(Quantity value) { 
      this.origin = value;
    }

    public Decimal getPeriod() { 
      return this.period;
    }

    public void setPeriod(Decimal value) { 
      this.period = value;
    }

    public BigDecimal getPeriodSimple() { 
      return this.period == null ? null : this.period.getValue();
    }

    public void setPeriodSimple(BigDecimal value) { 
      if (value == null)
        this.period = null;
      else {
        if (this.period == null)
          this.period = new Decimal();
        this.period.setValue(value);
      }
    }

    public Decimal getFactor() { 
      return this.factor;
    }

    public void setFactor(Decimal value) { 
      this.factor = value;
    }

    public BigDecimal getFactorSimple() { 
      return this.factor == null ? null : this.factor.getValue();
    }

    public void setFactorSimple(BigDecimal value) { 
      if (value == null)
        this.factor = null;
      else {
        if (this.factor == null)
          this.factor = new Decimal();
        this.factor.setValue(value);
      }
    }

    public Decimal getLowerLimit() { 
      return this.lowerLimit;
    }

    public void setLowerLimit(Decimal value) { 
      this.lowerLimit = value;
    }

    public BigDecimal getLowerLimitSimple() { 
      return this.lowerLimit == null ? null : this.lowerLimit.getValue();
    }

    public void setLowerLimitSimple(BigDecimal value) { 
      if (value == null)
        this.lowerLimit = null;
      else {
        if (this.lowerLimit == null)
          this.lowerLimit = new Decimal();
        this.lowerLimit.setValue(value);
      }
    }

    public Decimal getUpperLimit() { 
      return this.upperLimit;
    }

    public void setUpperLimit(Decimal value) { 
      this.upperLimit = value;
    }

    public BigDecimal getUpperLimitSimple() { 
      return this.upperLimit == null ? null : this.upperLimit.getValue();
    }

    public void setUpperLimitSimple(BigDecimal value) { 
      if (value == null)
        this.upperLimit = null;
      else {
        if (this.upperLimit == null)
          this.upperLimit = new Decimal();
        this.upperLimit.setValue(value);
      }
    }

    public Integer getDimensions() { 
      return this.dimensions;
    }

    public void setDimensions(Integer value) { 
      this.dimensions = value;
    }

    public int getDimensionsSimple() { 
      return this.dimensions == null ? null : this.dimensions.getValue();
    }

    public void setDimensionsSimple(int value) { 
      if (value == -1)
        this.dimensions = null;
      else {
        if (this.dimensions == null)
          this.dimensions = new Integer();
        this.dimensions.setValue(value);
      }
    }

    public String_ getData() { 
      return this.data;
    }

    public void setData(String_ value) { 
      this.data = value;
    }

    public String getDataSimple() { 
      return this.data == null ? null : this.data.getValue();
    }

    public void setDataSimple(String value) { 
      if (value == null)
        this.data = null;
      else {
        if (this.data == null)
          this.data = new String_();
        this.data.setValue(value);
      }
    }


}

