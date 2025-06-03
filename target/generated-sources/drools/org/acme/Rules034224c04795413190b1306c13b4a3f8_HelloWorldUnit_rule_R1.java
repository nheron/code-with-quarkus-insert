package org.acme;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.DataPerson;
import static org.acme.Rules034224c04795413190b1306c13b4a3f8.*;
import static org.acme.Rules034224c04795413190b1306c13b4a3f8_HelloWorldUnit.*;

public class Rules034224c04795413190b1306c13b4a3f8_HelloWorldUnit_rule_R1 {

    /**
     * Rule name: R1
     */
    public static org.drools.model.Rule rule_R1() {
        final org.drools.model.Variable<java.lang.String> var_$s = D.declarationOf(java.lang.String.class,
                                                                                   DomainClassesMetadata034224c04795413190b1306c13b4a3f8.java_lang_String_Metadata_INSTANCE,
                                                                                   "$s",
                                                                                   D.entryPoint("strings"));
        org.drools.model.Rule rule = D.rule("org.acme",
                                            "R1")
                                      .unit(org.acme.HelloWorldUnit.class)
                                      .build(D.pattern(var_$s).expr("GENERATED_6551C70AA50F49BAD87A853885375B66",
                                                                    org.acme.PA3.LambdaPredicateA3D49C2803ED5E273776EA0214127490.INSTANCE,
                                                                    D.alphaIndexedBy(int.class,
                                                                                     org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                     DomainClassesMetadata034224c04795413190b1306c13b4a3f8.java_lang_String_Metadata_INSTANCE.getPropertyIndex("length"),
                                                                                     org.acme.P4E.LambdaExtractor4ED436DEA8D1F1EDD45575544EAA11B2.INSTANCE,
                                                                                     2)),
                                             D.on(var_dataPersons,
                                                  var_results,
                                                  var_$s).execute(org.acme.PAE.LambdaConsequenceAE1DB1ED4A1D9A473EB42EEB1DE12BCA.INSTANCE));
        return rule;
    }
}
