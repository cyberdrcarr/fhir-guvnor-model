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

import java.util.*;

/**
 * An action that is performed on a patient. This can be a physical 'thing' like an operation, or less invasive like counselling or hypnotherapy
 */
public class Procedure extends Resource {

    public enum ProcedureRelationshipType {
        causedMinusby, // 
        caused, // 
        Null; // added to help the parsers
        public static ProcedureRelationshipType fromCode(String codeString) throws Exception {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("caused-by".equals(codeString))
          return causedMinusby;
        if ("caused".equals(codeString))
          return caused;
        throw new Exception("Unknown ProcedureRelationshipType code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case causedMinusby: return "caused-by";
            case caused: return "caused";
            default: return "?";
          }
        }
    }

  public class ProcedureRelationshipTypeEnumFactory implements EnumFactory {
    public Enum<?> fromCode(String codeString) throws Exception {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("caused-by".equals(codeString))
          return ProcedureRelationshipType.causedMinusby;
        if ("caused".equals(codeString))
          return ProcedureRelationshipType.caused;
        throw new Exception("Unknown ProcedureRelationshipType code '"+codeString+"'");
        }
    public String toCode(Enum<?> code) throws Exception {
      if (code == ProcedureRelationshipType.causedMinusby)
        return "caused-by";
      if (code == ProcedureRelationshipType.caused)
        return "caused";
      return "?";
      }
    }

    public class ProcedureDescriptionComponent extends Element {
        /**
         * The specific procedure that is perfromed
         */
        private CodeableConcept type;

        /**
         * Any other notes about the procedure - eg the operative notes
         */
        private String_ notes;

        /**
         * Detailed and structured anatomical location information. Multiple locations are allowed - eg multiple punch biopsies of a lesion
         */
        private List<CodeableConcept> bodySite = new ArrayList<CodeableConcept>();

        public CodeableConcept getType() { 
          return this.type;
        }

        public void setType(CodeableConcept value) { 
          this.type = value;
        }

        public String_ getNotes() { 
          return this.notes;
        }

        public void setNotes(String_ value) { 
          this.notes = value;
        }

        public String getNotesSimple() { 
          return this.notes == null ? null : this.notes.getValue();
        }

        public void setNotesSimple(String value) { 
          if (value == null)
            this.notes = null;
          else {
            if (this.notes == null)
              this.notes = new String_();
            this.notes.setValue(value);
          }
        }

        public List<CodeableConcept> getBodySite() { 
          return this.bodySite;
        }

  }

    public class ProcedurePerformerComponent extends Element {
        /**
         * The practitioner who was involved in the procedure
         */
        private ResourceReference person;

        /**
         * Eg surgeon, anaethetist, endoscopist
         */
        private CodeableConcept role;

        public ResourceReference getPerson() { 
          return this.person;
        }

        public void setPerson(ResourceReference value) { 
          this.person = value;
        }

        public CodeableConcept getRole() { 
          return this.role;
        }

        public void setRole(CodeableConcept value) { 
          this.role = value;
        }

  }

    public class ProcedureRelatedItemComponent extends Element {
        /**
         * The nature of the relationship
         */
        private Enumeration<ProcedureRelationshipType> type;

        /**
         * The related item - eg a procedure
         */
        private ResourceReference target;

        public Enumeration<ProcedureRelationshipType> getType() { 
          return this.type;
        }

        public void setType(Enumeration<ProcedureRelationshipType> value) { 
          this.type = value;
        }

        public ProcedureRelationshipType getTypeSimple() { 
          return this.type == null ? null : this.type.getValue();
        }

        public void setTypeSimple(ProcedureRelationshipType value) { 
          if (value == null)
            this.type = null;
          else {
            if (this.type == null)
              this.type = new Enumeration<ProcedureRelationshipType>();
            this.type.setValue(value);
          }
        }

        public ResourceReference getTarget() { 
          return this.target;
        }

        public void setTarget(ResourceReference value) { 
          this.target = value;
        }

  }

    /**
     * The person on whom the procedure was performed
     */
    private ResourceReference subject;

    /**
     * Describes the procedure that was performed
     */
    private ProcedureDescriptionComponent description;

    /**
     * The reason why the procedure was performed. This may be due to a problem, may be coded entity of some type, or may simply be present as text
     */
    private String_ indication;

    /**
     * This is limited to 'real' people rather than equipment
     */
    private List<ProcedurePerformerComponent> performer = new ArrayList<ProcedurePerformerComponent>();

    /**
     * The dates over which the period was perfromed. Allows a period to support complex procedures that span more that one date, and also allows for the length of the procedure to be captured.
     */
    private Period date;

    /**
     * The visit during which the procedure was performed
     */
    private ResourceReference visit;

    /**
     * What was the outcome of the procedure - did it resolve reasons why the procedure was performed?
     */
    private String_ outcome;

    /**
     * This could be a histology result. There could potentially be multiple reports - eg if this was a procedure that made multiple biopsies
     */
    private List<ResourceReference> report = new ArrayList<ResourceReference>();

    /**
     * Any complications that occurred during the procedure, or in the immediate post-operative period. These are generally tracked separately from the notes, whicg typically will describe the procedure itself rather than any 'post procedure' issues
     */
    private String_ complication;

    /**
     * If the procedure required specific follow up - eg removal of sutures. The followup may be represented as a simple note, or potentially could be more complex in which case the CarePlan resource can be used
     */
    private String_ followUp;

    /**
     * Procedures may be related to other items such as procedures or medciations. For example treating wound dehiscence following a previous procedure
     */
    private List<ProcedureRelatedItemComponent> relatedItem = new ArrayList<ProcedureRelatedItemComponent>();

    public ResourceReference getSubject() { 
      return this.subject;
    }

    public void setSubject(ResourceReference value) { 
      this.subject = value;
    }

    public ProcedureDescriptionComponent getDescription() { 
      return this.description;
    }

    public void setDescription(ProcedureDescriptionComponent value) { 
      this.description = value;
    }

    public String_ getIndication() { 
      return this.indication;
    }

    public void setIndication(String_ value) { 
      this.indication = value;
    }

    public String getIndicationSimple() { 
      return this.indication == null ? null : this.indication.getValue();
    }

    public void setIndicationSimple(String value) { 
      if (value == null)
        this.indication = null;
      else {
        if (this.indication == null)
          this.indication = new String_();
        this.indication.setValue(value);
      }
    }

    public List<ProcedurePerformerComponent> getPerformer() { 
      return this.performer;
    }

    public Period getDate() { 
      return this.date;
    }

    public void setDate(Period value) { 
      this.date = value;
    }

    public ResourceReference getVisit() { 
      return this.visit;
    }

    public void setVisit(ResourceReference value) { 
      this.visit = value;
    }

    public String_ getOutcome() { 
      return this.outcome;
    }

    public void setOutcome(String_ value) { 
      this.outcome = value;
    }

    public String getOutcomeSimple() { 
      return this.outcome == null ? null : this.outcome.getValue();
    }

    public void setOutcomeSimple(String value) { 
      if (value == null)
        this.outcome = null;
      else {
        if (this.outcome == null)
          this.outcome = new String_();
        this.outcome.setValue(value);
      }
    }

    public List<ResourceReference> getReport() { 
      return this.report;
    }

    public String_ getComplication() { 
      return this.complication;
    }

    public void setComplication(String_ value) { 
      this.complication = value;
    }

    public String getComplicationSimple() { 
      return this.complication == null ? null : this.complication.getValue();
    }

    public void setComplicationSimple(String value) { 
      if (value == null)
        this.complication = null;
      else {
        if (this.complication == null)
          this.complication = new String_();
        this.complication.setValue(value);
      }
    }

    public String_ getFollowUp() { 
      return this.followUp;
    }

    public void setFollowUp(String_ value) { 
      this.followUp = value;
    }

    public String getFollowUpSimple() { 
      return this.followUp == null ? null : this.followUp.getValue();
    }

    public void setFollowUpSimple(String value) { 
      if (value == null)
        this.followUp = null;
      else {
        if (this.followUp == null)
          this.followUp = new String_();
        this.followUp.setValue(value);
      }
    }

    public List<ProcedureRelatedItemComponent> getRelatedItem() { 
      return this.relatedItem;
    }

  @Override
  public ResourceType getResourceType() {
    return ResourceType.Procedure;
   }


}

