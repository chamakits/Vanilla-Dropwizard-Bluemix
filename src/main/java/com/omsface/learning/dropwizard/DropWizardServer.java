package com.omsface.learning.dropwizard;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

/**
 * Created by Omar on 4/11/2015.
 */
public class DropWizardServer extends Application<DropWizardConfiguration> {

    public static void main(String[] args) throws Exception {
//        (new DropWizardServer()).run(args);
        (new DropWizardServer()).run("server");
    }

    @Override
    public void initialize(Bootstrap<DropWizardConfiguration> bootstrap) {
        // nothing yet
    }

    @Override
    public void run(DropWizardConfiguration configuration,
                    Environment environment) throws Exception
    {
        DropWizardResource resource = new DropWizardResource();
        environment.jersey().register(resource);
    }
}
