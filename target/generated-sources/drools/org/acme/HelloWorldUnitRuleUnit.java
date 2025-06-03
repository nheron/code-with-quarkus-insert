package org.acme;

/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
import org.drools.core.SessionConfiguration;
import org.drools.core.common.ReteEvaluator;
import org.drools.core.impl.InternalRuleBase;
import org.drools.modelcompiler.KieBaseBuilder;
import org.drools.ruleunits.api.RuleUnit;
import org.drools.ruleunits.api.conf.RuleConfig;
import org.drools.ruleunits.api.RuleUnits;
import org.drools.ruleunits.impl.factory.AbstractRuleUnit;
import org.drools.ruleunits.impl.factory.AbstractRuleUnits;
import org.drools.ruleunits.impl.ReteEvaluatorBasedRuleUnitInstance;
import org.drools.ruleunits.impl.sessions.RuleUnitExecutorImpl;

@jakarta.enterprise.context.ApplicationScoped
public class HelloWorldUnitRuleUnit extends AbstractRuleUnit<org.acme.HelloWorldUnit> {

    private static final InternalRuleBase ruleBase = KieBaseBuilder.createKieBaseFromModel(new org.acme.Rules034224c04795413190b1306c13b4a3f8_HelloWorldUnit(),
                                                                                           new org.kie.api.conf.KieBaseOption[] { org.kie.api.conf.EventProcessingOption.CLOUD });

    private static final SessionConfiguration sessionConfiguration = ruleBase.getSessionConfiguration().as(SessionConfiguration.KEY);

    static {
        sessionConfiguration.setOption(org.kie.api.runtime.conf.ClockTypeOption.REALTIME);
    }

    public HelloWorldUnitRuleUnit() {
        this((RuleUnits) null);
    }

    @jakarta.inject.Inject
    public HelloWorldUnitRuleUnit(jakarta.enterprise.inject.Instance<RuleUnits> ruleUnits) {
        this(ruleUnits == null || ruleUnits.isUnsatisfied() ? AbstractRuleUnits.DummyRuleUnits.INSTANCE : ruleUnits.get());
    }

    public HelloWorldUnitRuleUnit(RuleUnits ruleUnits) {
        super(org.acme.HelloWorldUnit.class,
              ruleUnits);
        this.ruleUnits.register(this);
    }

    @Override
    public HelloWorldUnitRuleUnitInstance internalCreateInstance(org.acme.HelloWorldUnit data, RuleConfig ruleConfig) {
        ReteEvaluator reteEvaluator = evaluatorConfigurator.apply(new RuleUnitExecutorImpl(ruleBase,
                                                                                           sessionConfiguration));
        return new HelloWorldUnitRuleUnitInstance(this,
                                                  data,
                                                  reteEvaluator,
                                                  ruleConfig);
    }
}
