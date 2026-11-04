package com.nineoldandroids.animation;

/* JADX INFO: loaded from: classes5.dex */
public class e implements p {
    @Override // com.nineoldandroids.animation.p
    public Object evaluate(float f10, Object obj, Object obj2) {
        int iIntValue = ((Integer) obj).intValue();
        int i10 = iIntValue >> 24;
        int i11 = (iIntValue >> 16) & 255;
        int i12 = (iIntValue >> 8) & 255;
        int i13 = iIntValue & 255;
        int iIntValue2 = ((Integer) obj2).intValue();
        return Integer.valueOf((i13 + ((int) (f10 * ((iIntValue2 & 255) - i13)))) | ((i10 + ((int) (((iIntValue2 >> 24) - i10) * f10))) << 24) | ((i11 + ((int) ((((iIntValue2 >> 16) & 255) - i11) * f10))) << 16) | ((i12 + ((int) ((((iIntValue2 >> 8) & 255) - i12) * f10))) << 8));
    }
}
