package androidx.vectordrawable.graphics.drawable;

import android.animation.TypeEvaluator;
import androidx.annotation.b1;

/* JADX INFO: loaded from: classes3.dex */
@b1({b1.a.LIBRARY_GROUP_PREFIX})
public class f implements TypeEvaluator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final f f75895a = new f();

    public static f a() {
        return f75895a;
    }

    @Override // android.animation.TypeEvaluator
    public Object evaluate(float f10, Object obj, Object obj2) {
        int iIntValue = ((Integer) obj).intValue();
        float f11 = ((iIntValue >> 24) & 255) / 255.0f;
        int iIntValue2 = ((Integer) obj2).intValue();
        float fPow = (float) Math.pow(((iIntValue >> 16) & 255) / 255.0f, 2.2d);
        float fPow2 = (float) Math.pow(((iIntValue >> 8) & 255) / 255.0f, 2.2d);
        float fPow3 = (float) Math.pow((iIntValue & 255) / 255.0f, 2.2d);
        float fPow4 = (float) Math.pow(((iIntValue2 >> 16) & 255) / 255.0f, 2.2d);
        float f12 = f11 + (((((iIntValue2 >> 24) & 255) / 255.0f) - f11) * f10);
        float fPow5 = fPow2 + ((((float) Math.pow(((iIntValue2 >> 8) & 255) / 255.0f, 2.2d)) - fPow2) * f10);
        float fPow6 = fPow3 + (f10 * (((float) Math.pow((iIntValue2 & 255) / 255.0f, 2.2d)) - fPow3));
        float fPow7 = ((float) Math.pow(fPow + ((fPow4 - fPow) * f10), 0.45454545454545453d)) * 255.0f;
        float fPow8 = ((float) Math.pow(fPow5, 0.45454545454545453d)) * 255.0f;
        return Integer.valueOf(Math.round(((float) Math.pow(fPow6, 0.45454545454545453d)) * 255.0f) | (Math.round(fPow7) << 16) | (Math.round(f12 * 255.0f) << 24) | (Math.round(fPow8) << 8));
    }
}
