package com.omsface.learning.dropwizard;

import com.codahale.metrics.health.HealthCheck;

/**
 * Created by Omar on 4/11/2015.
 */
public class DropWizardHealthCheck extends HealthCheck {
    @Override
    protected Result check() throws Exception {
        return Result.healthy();
    }
}
