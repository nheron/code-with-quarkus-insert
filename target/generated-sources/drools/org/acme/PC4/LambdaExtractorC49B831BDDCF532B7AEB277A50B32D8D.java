package org.acme.PC4;


import static org.acme.Rules6bdaf4db9e6140a28a046b6c98a7c027.*;
import org.acme.*;
import org.acme.DataPerson;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractorC49B831BDDCF532B7AEB277A50B32D8D implements org.drools.model.functions.Function1<java.lang.String, Integer>, org.drools.model.functions.HashedExpression {

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
