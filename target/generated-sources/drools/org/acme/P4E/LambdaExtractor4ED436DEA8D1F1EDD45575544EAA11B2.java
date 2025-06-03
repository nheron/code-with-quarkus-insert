package org.acme.P4E;


import static org.acme.Rules034224c04795413190b1306c13b4a3f8.*;
import org.acme.*;
import org.acme.DataPerson;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractor4ED436DEA8D1F1EDD45575544EAA11B2 implements org.drools.model.functions.Function1<java.lang.String, Integer>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "BFDA8757F160D1C28B20226B9FE83511";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public Integer apply(java.lang.String _this) {
        return _this.length();
    }
}
