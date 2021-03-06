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
 * A request for a diagnostic investigation service to be performed
 */
public class DiagnosticOrder extends Resource {

    public enum DiagnosticOrderStatus {
        requested, // The request has been placed
        received, // The receiving system has received the order, but not yet decided whether it will be performed
        accepted, // The receiving system has accepted the order, but work has not yet commenced
        inprogress, // The work to fulfill the order is happening
        review, // The work is complete, and the outcomes are being reviewed for approval
        complete, // The work has been complete, the report(s) released, and no further work is planned
        suspended, // The request has been held by originating system/user request
        rejected, // The receiving system has declined to fulfill the request
        failed, // The diagnostic investigation was attempted, but due to some procedural error, it could not be completed
        Null; // added to help the parsers
        public static DiagnosticOrderStatus fromCode(String codeString) throws Exception {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("requested".equals(codeString))
          return requested;
        if ("received".equals(codeString))
          return received;
        if ("accepted".equals(codeString))
          return accepted;
        if ("inprogress".equals(codeString))
          return inprogress;
        if ("review".equals(codeString))
          return review;
        if ("complete".equals(codeString))
          return complete;
        if ("suspended".equals(codeString))
          return suspended;
        if ("rejected".equals(codeString))
          return rejected;
        if ("failed".equals(codeString))
          return failed;
        throw new Exception("Unknown DiagnosticOrderStatus code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case requested: return "requested";
            case received: return "received";
            case accepted: return "accepted";
            case inprogress: return "inprogress";
            case review: return "review";
            case complete: return "complete";
            case suspended: return "suspended";
            case rejected: return "rejected";
            case failed: return "failed";
            default: return "?";
          }
        }
    }

  public class DiagnosticOrderStatusEnumFactory implements EnumFactory {
    public Enum<?> fromCode(String codeString) throws Exception {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("requested".equals(codeString))
          return DiagnosticOrderStatus.requested;
        if ("received".equals(codeString))
          return DiagnosticOrderStatus.received;
        if ("accepted".equals(codeString))
          return DiagnosticOrderStatus.accepted;
        if ("inprogress".equals(codeString))
          return DiagnosticOrderStatus.inprogress;
        if ("review".equals(codeString))
          return DiagnosticOrderStatus.review;
        if ("complete".equals(codeString))
          return DiagnosticOrderStatus.complete;
        if ("suspended".equals(codeString))
          return DiagnosticOrderStatus.suspended;
        if ("rejected".equals(codeString))
          return DiagnosticOrderStatus.rejected;
        if ("failed".equals(codeString))
          return DiagnosticOrderStatus.failed;
        throw new Exception("Unknown DiagnosticOrderStatus code '"+codeString+"'");
        }
    public String toCode(Enum<?> code) throws Exception {
      if (code == DiagnosticOrderStatus.requested)
        return "requested";
      if (code == DiagnosticOrderStatus.received)
        return "received";
      if (code == DiagnosticOrderStatus.accepted)
        return "accepted";
      if (code == DiagnosticOrderStatus.inprogress)
        return "inprogress";
      if (code == DiagnosticOrderStatus.review)
        return "review";
      if (code == DiagnosticOrderStatus.complete)
        return "complete";
      if (code == DiagnosticOrderStatus.suspended)
        return "suspended";
      if (code == DiagnosticOrderStatus.rejected)
        return "rejected";
      if (code == DiagnosticOrderStatus.failed)
        return "failed";
      return "?";
      }
    }

    public class DiagnosticOrderEventComponent extends Element {
        /**
         * The status for the event
         */
        private Enumeration<DiagnosticOrderStatus> status;

        /**
         * The date/time at which the event occurred
         */
        private DateTime date;

        /**
         * The person who was responsible for performing or recording the action
         */
        private ResourceReference actor;

        public Enumeration<DiagnosticOrderStatus> getStatus() { 
          return this.status;
        }

        public void setStatus(Enumeration<DiagnosticOrderStatus> value) { 
          this.status = value;
        }

        public DiagnosticOrderStatus getStatusSimple() { 
          return this.status == null ? null : this.status.getValue();
        }

        public void setStatusSimple(DiagnosticOrderStatus value) { 
            if (this.status == null)
              this.status = new Enumeration<DiagnosticOrderStatus>();
            this.status.setValue(value);
        }

        public DateTime getDate() { 
          return this.date;
        }

        public void setDate(DateTime value) { 
          this.date = value;
        }

        public String getDateSimple() { 
          return this.date == null ? null : this.date.getValue();
        }

        public void setDateSimple(String value) { 
            if (this.date == null)
              this.date = new DateTime();
            this.date.setValue(value);
        }

        public ResourceReference getActor() { 
          return this.actor;
        }

        public void setActor(ResourceReference value) { 
          this.actor = value;
        }

  }

    public class DiagnosticOrderItemComponent extends Element {
        /**
         * A code that identifies a particular diagnostic investigation that has been requested
         */
        private CodeableConcept code;

        /**
         * If the item is related to a specific speciment
         */
        private List<ResourceReference> specimen = new ArrayList<ResourceReference>();

        /**
         * Anatomical location where the request test should be performed
         */
        private CodeableConcept bodySite;

        /**
         * The status of this individual item within the order
         */
        private Enumeration<DiagnosticOrderStatus> status;

        /**
         * A summary of the events of interest that have occurred as this item of the request is processed
         */
        private List<DiagnosticOrderEventComponent> event = new ArrayList<DiagnosticOrderEventComponent>();

        public CodeableConcept getCode() { 
          return this.code;
        }

        public void setCode(CodeableConcept value) { 
          this.code = value;
        }

        public List<ResourceReference> getSpecimen() { 
          return this.specimen;
        }

        public CodeableConcept getBodySite() { 
          return this.bodySite;
        }

        public void setBodySite(CodeableConcept value) { 
          this.bodySite = value;
        }

        public Enumeration<DiagnosticOrderStatus> getStatus() { 
          return this.status;
        }

        public void setStatus(Enumeration<DiagnosticOrderStatus> value) { 
          this.status = value;
        }

        public DiagnosticOrderStatus getStatusSimple() { 
          return this.status == null ? null : this.status.getValue();
        }

        public void setStatusSimple(DiagnosticOrderStatus value) { 
          if (value == null)
            this.status = null;
          else {
            if (this.status == null)
              this.status = new Enumeration<DiagnosticOrderStatus>();
            this.status.setValue(value);
          }
        }

        public List<DiagnosticOrderEventComponent> getEvent() { 
          return this.event;
        }

  }

    /**
     * Who or what the investigation is to be performed on. This is usually a human patient, but diagnostic tests can also be requested on animals, groups of humans or animals, devices such as dialysis machines, or even locations (typically for environmental scans)
     */
    private ResourceReference subject;

    /**
     * The practitioner that holds legal responsibility for ordering the investigation
     */
    private ResourceReference orderer;

    /**
     * Identifiers assigned to this order by the order or by the receiver
     */
    private List<Identifier> identifier = new ArrayList<Identifier>();

    /**
     * A visit that provides additional informaton about the healthcare context in which this request is made
     */
    private ResourceReference visit;

    /**
     * An explanation or justification for why this diagnostic investigation is being requested
     */
    private String_ clinicalNotes;

    /**
     * One or more specimens that the diagnostic investigation is about
     */
    private List<ResourceReference> specimen = new ArrayList<ResourceReference>();

    /**
     * The status of the order
     */
    private Enumeration<DiagnosticOrderStatus> status;

    /**
     * A summary of the events of interest that have occurred as the request is processed
     */
    private List<DiagnosticOrderEventComponent> event = new ArrayList<DiagnosticOrderEventComponent>();

    /**
     * The specific diagnostic investigations that are requested as part of this request. Sometimes, there can only be one item per request, but in most contexts, more than one investigation can be requested
     */
    private List<DiagnosticOrderItemComponent> item = new ArrayList<DiagnosticOrderItemComponent>();

    public ResourceReference getSubject() { 
      return this.subject;
    }

    public void setSubject(ResourceReference value) { 
      this.subject = value;
    }

    public ResourceReference getOrderer() { 
      return this.orderer;
    }

    public void setOrderer(ResourceReference value) { 
      this.orderer = value;
    }

    public List<Identifier> getIdentifier() { 
      return this.identifier;
    }

    public ResourceReference getVisit() { 
      return this.visit;
    }

    public void setVisit(ResourceReference value) { 
      this.visit = value;
    }

    public String_ getClinicalNotes() { 
      return this.clinicalNotes;
    }

    public void setClinicalNotes(String_ value) { 
      this.clinicalNotes = value;
    }

    public String getClinicalNotesSimple() { 
      return this.clinicalNotes == null ? null : this.clinicalNotes.getValue();
    }

    public void setClinicalNotesSimple(String value) { 
      if (value == null)
        this.clinicalNotes = null;
      else {
        if (this.clinicalNotes == null)
          this.clinicalNotes = new String_();
        this.clinicalNotes.setValue(value);
      }
    }

    public List<ResourceReference> getSpecimen() { 
      return this.specimen;
    }

    public Enumeration<DiagnosticOrderStatus> getStatus() { 
      return this.status;
    }

    public void setStatus(Enumeration<DiagnosticOrderStatus> value) { 
      this.status = value;
    }

    public DiagnosticOrderStatus getStatusSimple() { 
      return this.status == null ? null : this.status.getValue();
    }

    public void setStatusSimple(DiagnosticOrderStatus value) { 
      if (value == null)
        this.status = null;
      else {
        if (this.status == null)
          this.status = new Enumeration<DiagnosticOrderStatus>();
        this.status.setValue(value);
      }
    }

    public List<DiagnosticOrderEventComponent> getEvent() { 
      return this.event;
    }

    public List<DiagnosticOrderItemComponent> getItem() { 
      return this.item;
    }

  @Override
  public ResourceType getResourceType() {
    return ResourceType.DiagnosticOrder;
   }


}

