package com.nineoldandroids.animation;

/* JADX INFO: loaded from: classes5.dex */
public class h implements p<Integer> {
    @Override // com.nineoldandroids.animation.p
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer evaluate(float f10, Integer num, Integer num2) {
        int iIntValue = num.intValue();
        return Integer.valueOf((int) (iIntValue + (f10 * (num2.intValue() - iIntValue))));
    }
}
