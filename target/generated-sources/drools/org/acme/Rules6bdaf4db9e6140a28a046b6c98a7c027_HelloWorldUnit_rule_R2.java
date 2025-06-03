package org.acme;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.DataPerson;
import static org.acme.Rules6bdaf4db9e6140a28a046b6c98a7c027.*;
import static org.acme.Rules6bdaf4db9e6140a28a046b6c98a7c027_HelloWorldUnit.*;

public class Rules6bdaf4db9e6140a28a046b6c98a7c027_HelloWorldUnit_rule_R2 {

    /**
     * Rule name: R2
     */
    public static org.drools.model.Rule rule_R2() {
        final org.drools.model.Variable<org.acme.DataPerson> var_$d = D.declarationOf(org.acme.DataPerson.class,
                                                                                      DomainClassesMetadata6bdaf4db9e6140a28a046b6c98a7c027.org_acme_DataPerson_Metadata_INSTANCE,
                                                                                      "$d",
                                                                                      D.entryPoint("dataPersons"));
        org.drools.model.Rule rule = D.rule("org.acme",
                                            "R2")
                                      .unit(org.acme.HelloWorldUnit.class)
                                      .build(D.pattern(var_$d),
                                             D.on(var_results).execute(org.acme.P16.LambdaConsequence16F137315013ED58A953B4B943757AF9.INSTANCE));
        return rule;
    }
}
