package org.acme.PD6;


import static org.acme.Rulesa4bffa4772b647d6833a7b52198abed9.*;
import org.acme.*;
import org.acme.DataPerson;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequenceD6079400CE79C055FCA93CA9068D2F28 implements org.drools.model.functions.Block1<java.util.List<java.lang.String>>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "3CBD887CD7E64E54501DC7D231851872";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public void execute(java.util.List<java.lang.String> results) throws java.lang.Exception {
        System.out.println("Coucou");
        results.add("Coucou2");
    }
}
