package org.acme;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.DataPerson;
import static org.acme.Rules6bdaf4db9e6140a28a046b6c98a7c027.*;
import static org.acme.Rules6bdaf4db9e6140a28a046b6c98a7c027_HelloWorldUnit.*;

public class Rules6bdaf4db9e6140a28a046b6c98a7c027_HelloWorldUnit_rule_R1 {

    /**
     * Rule name: R1
     */
    public static org.drools.model.Rule rule_R1() {
        final org.drools.model.Variable<java.lang.String> var_$s = D.declarationOf(java.lang.String.class,
                                                                                   DomainClassesMetadata6bdaf4db9e6140a28a046b6c98a7c027.java_lang_String_Metadata_INSTANCE,
                                                                                   "$s",
                                                                                   D.entryPoint("strings"));
        org.drools.model.Rule rule = D.rule("org.acme",
                                            "R1")
                                      .unit(org.acme.HelloWorldUnit.class)
                                      .build(D.pattern(var_$s).expr("GENERATED_6551C70AA50F49BAD87A853885375B66",
                                                                    org.acme.P16.LambdaPredicate164F654319F106A4E4AAD088524FBCDD.INSTANCE,
                                                                    D.alphaIndexedBy(int.class,
                                                                                     org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                     DomainClassesMetadata6bdaf4db9e6140a28a046b6c98a7c027.java_lang_String_Metadata_INSTANCE.getPropertyIndex("length"),
                                                                                     org.acme.PC4.LambdaExtractorC49B831BDDCF532B7AEB277A50B32D8D.INSTANCE,
                                                                                     2)),
                                             D.on(var_dataPersons,
                                                  var_results,
                                                  var_$s).execute(org.acme.P5E.LambdaConsequence5E6EE0BDD7DE3F8FA7994735E6F42A82.INSTANCE));
        return rule;
    }
}
