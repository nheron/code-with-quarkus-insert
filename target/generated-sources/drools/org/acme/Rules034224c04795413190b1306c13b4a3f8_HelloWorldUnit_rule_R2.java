package org.acme;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.DataPerson;
import static org.acme.Rules034224c04795413190b1306c13b4a3f8.*;
import static org.acme.Rules034224c04795413190b1306c13b4a3f8_HelloWorldUnit.*;

public class Rules034224c04795413190b1306c13b4a3f8_HelloWorldUnit_rule_R2 {

    /**
     * Rule name: R2
     */
    public static org.drools.model.Rule rule_R2() {
        final org.drools.model.Variable<org.acme.DataPerson> var_$d = D.declarationOf(org.acme.DataPerson.class,
                                                                                      DomainClassesMetadata034224c04795413190b1306c13b4a3f8.org_acme_DataPerson_Metadata_INSTANCE,
                                                                                      "$d",
                                                                                      D.entryPoint("dataPersons"));
        org.drools.model.Rule rule = D.rule("org.acme",
                                            "R2")
                                      .unit(org.acme.HelloWorldUnit.class)
                                      .build(D.pattern(var_$d),
                                             D.on(var_results).execute(org.acme.P87.LambdaConsequence87E1FAD2026D730D8EFADE60B26211BB.INSTANCE));
        return rule;
    }
}
