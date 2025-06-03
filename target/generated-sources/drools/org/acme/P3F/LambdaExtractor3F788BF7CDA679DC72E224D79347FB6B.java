package org.acme.P3F;


import static org.acme.Rulesa4bffa4772b647d6833a7b52198abed9.*;
import org.acme.*;
import org.acme.DataPerson;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractor3F788BF7CDA679DC72E224D79347FB6B implements org.drools.model.functions.Function1<java.lang.String, Integer>, org.drools.model.functions.HashedExpression {

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
