package org.jbehave.eclipse.step;


import fj.F;

public final class TransformByPriority extends F<StepCandidate, Integer> {

    @Override
    public Integer f(StepCandidate pStep) {
        return pStep.priority;
    }
}