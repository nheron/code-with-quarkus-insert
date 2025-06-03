package org.acme;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.DataPerson;
import static org.acme.Rulesa4bffa4772b647d6833a7b52198abed9.*;
import static org.acme.Rulesa4bffa4772b647d6833a7b52198abed9_HelloWorldUnit.*;

public class Rulesa4bffa4772b647d6833a7b52198abed9_HelloWorldUnit_rule_R1 {

    /**
     * Rule name: R1
     */
    public static org.drools.model.Rule rule_R1() {
        final org.drools.model.Variable<java.lang.String> var_$s = D.declarationOf(java.lang.String.class,
                                                                                   DomainClassesMetadataa4bffa4772b647d6833a7b52198abed9.java_lang_String_Metadata_INSTANCE,
                                                                                   "$s",
                                                                                   D.entryPoint("strings"));
        org.drools.model.Rule rule = D.rule("org.acme",
                                            "R1")
                                      .unit(org.acme.HelloWorldUnit.class)
                                      .build(D.pattern(var_$s).expr("GENERATED_6551C70AA50F49BAD87A853885375B66",
                                                                    org.acme.PDD.LambdaPredicateDD94BE0CD4FD36E386317D02A80EA515.INSTANCE,
                                                                    D.alphaIndexedBy(int.class,
                                                                                     org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                     DomainClassesMetadataa4bffa4772b647d6833a7b52198abed9.java_lang_String_Metadata_INSTANCE.getPropertyIndex("length"),
                                                                                     org.acme.P3F.LambdaExtractor3F788BF7CDA679DC72E224D79347FB6B.INSTANCE,
                                                                                     2)),
                                             D.on(var_dataPersons,
                                                  var_results,
                                                  var_$s).execute(org.acme.P91.LambdaConsequence91253E231D979A6A528AA9E10D08B387.INSTANCE));
        return rule;
    }
}
