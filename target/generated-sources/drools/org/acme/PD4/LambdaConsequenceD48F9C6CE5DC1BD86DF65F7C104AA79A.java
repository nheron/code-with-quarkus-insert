package org.acme.PD4;


import static org.acme.Rulesa4bffa4772b647d6833a7b52198abed9.*;
import org.acme.*;
import org.acme.DataPerson;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequenceD48F9C6CE5DC1BD86DF65F7C104AA79A implements org.drools.model.functions.Block1<java.util.List<java.lang.String>>, org.drools.model.functions.HashedExpression {

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
