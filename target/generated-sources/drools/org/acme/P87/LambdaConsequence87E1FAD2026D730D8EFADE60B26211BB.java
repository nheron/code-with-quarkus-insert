package org.acme.P87;


import static org.acme.Rules034224c04795413190b1306c13b4a3f8.*;
import org.acme.*;
import org.acme.DataPerson;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequence87E1FAD2026D730D8EFADE60B26211BB implements org.drools.model.functions.Block1<java.util.List<java.lang.String>>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "E9AC440D904FDA14D258E990311BBA60";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public void execute(java.util.List<java.lang.String> results) throws java.lang.Exception {
        System.out.println("Coucou");
        results.add("Coucou");
    }
}
