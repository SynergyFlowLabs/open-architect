package com.nineoldandroids.animation;

/* JADX INFO: loaded from: classes5.dex */
public class f implements p<Number> {
    @Override // com.nineoldandroids.animation.p
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Float evaluate(float f10, Number number, Number number2) {
        float fFloatValue = number.floatValue();
        return Float.valueOf(fFloatValue + (f10 * (number2.floatValue() - fFloatValue)));
    }
}
