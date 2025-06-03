package org.acme.P16;


import static org.acme.Rules6bdaf4db9e6140a28a046b6c98a7c027.*;
import org.acme.*;
import org.acme.DataPerson;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequence16F137315013ED58A953B4B943757AF9 implements org.drools.model.functions.Block1<java.util.List<java.lang.String>>, org.drools.model.functions.HashedExpression {

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
