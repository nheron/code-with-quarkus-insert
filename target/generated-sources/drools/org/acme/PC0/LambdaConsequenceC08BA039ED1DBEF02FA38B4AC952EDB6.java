package org.acme.PC0;


import static org.acme.Rules034224c04795413190b1306c13b4a3f8.*;
import org.acme.*;
import org.acme.DataPerson;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequenceC08BA039ED1DBEF02FA38B4AC952EDB6 implements org.drools.model.functions.Block1<java.util.List<java.lang.String>>, org.drools.model.functions.HashedExpression {

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
