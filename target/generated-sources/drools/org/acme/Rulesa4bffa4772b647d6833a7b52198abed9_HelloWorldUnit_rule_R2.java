package org.acme;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.DataPerson;
import static org.acme.Rulesa4bffa4772b647d6833a7b52198abed9.*;
import static org.acme.Rulesa4bffa4772b647d6833a7b52198abed9_HelloWorldUnit.*;

public class Rulesa4bffa4772b647d6833a7b52198abed9_HelloWorldUnit_rule_R2 {

    /**
     * Rule name: R2
     */
    public static org.drools.model.Rule rule_R2() {
        final org.drools.model.Variable<org.acme.DataPerson> var_$d = D.declarationOf(org.acme.DataPerson.class,
                                                                                      DomainClassesMetadataa4bffa4772b647d6833a7b52198abed9.org_acme_DataPerson_Metadata_INSTANCE,
                                                                                      "$d",
                                                                                      D.entryPoint("dataPersons"));
        org.drools.model.Rule rule = D.rule("org.acme",
                                            "R2")
                                      .unit(org.acme.HelloWorldUnit.class)
                                      .build(D.pattern(var_$d),
                                             D.on(var_results).execute(org.acme.PD4.LambdaConsequenceD48F9C6CE5DC1BD86DF65F7C104AA79A.INSTANCE));
        return rule;
    }
}
