package com.pk.spring;

/**
 * Created by pkumar on 14/12/17.
 */
public class OutputHelper {

    IOutputGenerator outputGenerator;

    public void generateOutput(){
        outputGenerator.generateOutput();
    }

    public void setOutputGenerator(IOutputGenerator outputGenerator) {
        this.outputGenerator = outputGenerator;
    }
}
