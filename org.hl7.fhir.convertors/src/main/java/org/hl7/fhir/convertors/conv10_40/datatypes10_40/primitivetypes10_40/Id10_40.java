package org.hl7.fhir.convertors.conv10_40.datatypes10_40.primitivetypes10_40;

import org.hl7.fhir.convertors.conv10_40.datatypes10_40.Element10_40;
import org.hl7.fhir.exceptions.FHIRException; import org.hl7.fhir.convertors.context.ConversionContext10_40;

public class Id10_40 {
  public static org.hl7.fhir.r4.model.IdType convertId(org.hl7.fhir.dstu2.model.IdType src) throws FHIRException {
    org.hl7.fhir.r4.model.IdType tgt = src.hasValue() ? new org.hl7.fhir.r4.model.IdType(src.getValue()) : new org.hl7.fhir.r4.model.IdType();
    ConversionContext10_40.INSTANCE.getVersionConvertor_10_40().copyElement(src, tgt);
    return tgt;
  }

  public static org.hl7.fhir.dstu2.model.IdType convertId(org.hl7.fhir.r4.model.IdType src) throws FHIRException {
    org.hl7.fhir.dstu2.model.IdType tgt = src.hasValue() ? new org.hl7.fhir.dstu2.model.IdType(src.getValue()) : new org.hl7.fhir.dstu2.model.IdType();
    ConversionContext10_40.INSTANCE.getVersionConvertor_10_40().copyElement(src, tgt);
    return tgt;
  }
}
