package androidx.transition;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public class d0 extends g1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f75553d = 3.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f75554e = 80;

    /* JADX WARN: Code duplicated, block: B:6:0x0014  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    private int h(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        int i18 = this.f75554e;
        if (i18 == 8388611) {
            if (view.getLayoutDirection() == 1) {
                i18 = 5;
            } else {
                i18 = 3;
            }
        } else if (i18 == 8388613) {
            if (view.getLayoutDirection() == 1) {
                i18 = 3;
            } else {
                i18 = 5;
            }
        }
        if (i18 == 3) {
            return (i16 - i10) + Math.abs(i13 - i11);
        }
        if (i18 == 5) {
            return (i10 - i14) + Math.abs(i13 - i11);
        }
        if (i18 == 48) {
            return (i17 - i11) + Math.abs(i12 - i10);
        }
        if (i18 != 80) {
            return 0;
        }
        return (i11 - i15) + Math.abs(i12 - i10);
    }

    private int i(ViewGroup viewGroup) {
        int i10 = this.f75554e;
        return (i10 == 3 || i10 == 5 || i10 == 8388611 || i10 == 8388613) ? viewGroup.getWidth() : viewGroup.getHeight();
    }

    @Override // androidx.transition.q0
    public long c(@NonNull ViewGroup viewGroup, @NonNull g0 g0Var, @androidx.annotation.p0 u0 u0Var, @androidx.annotation.p0 u0 u0Var2) {
        int i10;
        int i11;
        int iCenterY;
        int i12;
        u0 u0Var3 = u0Var;
        if (u0Var3 == null && u0Var2 == null) {
            return 0L;
        }
        Rect rectL = g0Var.L();
        if (u0Var2 == null || e(u0Var3) == 0) {
            i10 = -1;
        } else {
            u0Var3 = u0Var2;
            i10 = 1;
        }
        int iF = f(u0Var3);
        int iG = g(u0Var3);
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        int iRound = iArr[0] + Math.round(viewGroup.getTranslationX());
        int iRound2 = iArr[1] + Math.round(viewGroup.getTranslationY());
        int width = viewGroup.getWidth() + iRound;
        int height = viewGroup.getHeight() + iRound2;
        if (rectL != null) {
            int iCenterX = rectL.centerX();
            i12 = iRound2;
            iCenterY = rectL.centerY();
            i11 = iCenterX;
        } else {
            i11 = (iRound + width) / 2;
            iCenterY = (iRound2 + height) / 2;
            i12 = iRound2;
        }
        float fH = h(viewGroup, iF, iG, i11, iCenterY, iRound, i12, width, height) / i(viewGroup);
        long jK = g0Var.K();
        if (jK < 0) {
            jK = 300;
        }
        return Math.round(((jK * ((long) i10)) / this.f75553d) * fH);
    }

    public void j(float f10) {
        if (f10 == 0.0f) {
            throw new IllegalArgumentException("propagationSpeed may not be 0");
        }
        this.f75553d = f10;
    }

    public void k(int i10) {
        this.f75554e = i10;
    }
}
