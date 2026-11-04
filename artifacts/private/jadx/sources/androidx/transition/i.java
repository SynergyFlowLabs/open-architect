package androidx.transition;

import android.graphics.Rect;
import android.view.ViewGroup;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public class i extends g1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f75709d = 3.0f;

    private static float h(float f10, float f11, float f12, float f13) {
        float f14 = f12 - f10;
        float f15 = f13 - f11;
        return (float) Math.sqrt((f14 * f14) + (f15 * f15));
    }

    @Override // androidx.transition.q0
    public long c(@NonNull ViewGroup viewGroup, @NonNull g0 g0Var, @androidx.annotation.p0 u0 u0Var, @androidx.annotation.p0 u0 u0Var2) {
        int i10;
        int iRound;
        int iCenterX;
        if (u0Var == null && u0Var2 == null) {
            return 0L;
        }
        if (u0Var2 == null || e(u0Var) == 0) {
            i10 = -1;
        } else {
            u0Var = u0Var2;
            i10 = 1;
        }
        int iF = f(u0Var);
        int iG = g(u0Var);
        Rect rectL = g0Var.L();
        if (rectL != null) {
            iCenterX = rectL.centerX();
            iRound = rectL.centerY();
        } else {
            int[] iArr = new int[2];
            viewGroup.getLocationOnScreen(iArr);
            int iRound2 = Math.round(iArr[0] + (viewGroup.getWidth() / 2) + viewGroup.getTranslationX());
            iRound = Math.round(iArr[1] + (viewGroup.getHeight() / 2) + viewGroup.getTranslationY());
            iCenterX = iRound2;
        }
        float fH = h(iF, iG, iCenterX, iRound) / h(0.0f, 0.0f, viewGroup.getWidth(), viewGroup.getHeight());
        long jK = g0Var.K();
        if (jK < 0) {
            jK = 300;
        }
        return Math.round(((jK * ((long) i10)) / this.f75709d) * fH);
    }

    public void i(float f10) {
        if (f10 == 0.0f) {
            throw new IllegalArgumentException("propagationSpeed may not be 0");
        }
        this.f75709d = f10;
    }
}
