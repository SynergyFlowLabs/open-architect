package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public class j extends f1 {
    private static final TimeInterpolator Q3 = new DecelerateInterpolator();
    private static final TimeInterpolator R3 = new AccelerateInterpolator();
    private static final String S3 = "android:explode:screenBounds";
    private int[] P3;

    public j() {
        this.P3 = new int[2];
        J0(new i());
    }

    private void N0(u0 u0Var) {
        View view = u0Var.f75776b;
        view.getLocationOnScreen(this.P3);
        int[] iArr = this.P3;
        int i10 = iArr[0];
        int i11 = iArr[1];
        u0Var.f75775a.put(S3, new Rect(i10, i11, view.getWidth() + i10, view.getHeight() + i11));
    }

    private static float W0(float f10, float f11) {
        return (float) Math.sqrt((f10 * f10) + (f11 * f11));
    }

    private static float X0(View view, int i10, int i11) {
        return W0(Math.max(i10, view.getWidth() - i10), Math.max(i11, view.getHeight() - i11));
    }

    private void Y0(View view, Rect rect, int[] iArr) {
        int iCenterY;
        int width;
        view.getLocationOnScreen(this.P3);
        int[] iArr2 = this.P3;
        int i10 = iArr2[0];
        int i11 = iArr2[1];
        Rect rectL = L();
        if (rectL == null) {
            width = (view.getWidth() / 2) + i10 + Math.round(view.getTranslationX());
            iCenterY = (view.getHeight() / 2) + i11 + Math.round(view.getTranslationY());
        } else {
            int iCenterX = rectL.centerX();
            iCenterY = rectL.centerY();
            width = iCenterX;
        }
        float fCenterX = rect.centerX() - width;
        float fCenterY = rect.centerY() - iCenterY;
        if (fCenterX == 0.0f && fCenterY == 0.0f) {
            fCenterX = ((float) (Math.random() * 2.0d)) - 1.0f;
            fCenterY = ((float) (Math.random() * 2.0d)) - 1.0f;
        }
        float fW0 = W0(fCenterX, fCenterY);
        float fX0 = X0(view, width - i10, iCenterY - i11);
        iArr[0] = Math.round((fCenterX / fW0) * fX0);
        iArr[1] = Math.round(fX0 * (fCenterY / fW0));
    }

    @Override // androidx.transition.f1
    @androidx.annotation.p0
    public Animator R0(@NonNull ViewGroup viewGroup, @NonNull View view, @androidx.annotation.p0 u0 u0Var, @androidx.annotation.p0 u0 u0Var2) {
        if (u0Var2 == null) {
            return null;
        }
        Rect rect = (Rect) u0Var2.f75775a.get(S3);
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        Y0(viewGroup, rect, this.P3);
        int[] iArr = this.P3;
        return w0.a(view, u0Var2, rect.left, rect.top, translationX + iArr[0], translationY + iArr[1], translationX, translationY, Q3, this);
    }

    @Override // androidx.transition.f1
    @androidx.annotation.p0
    public Animator T0(@NonNull ViewGroup viewGroup, @NonNull View view, @androidx.annotation.p0 u0 u0Var, @androidx.annotation.p0 u0 u0Var2) {
        float f10;
        float f11;
        if (u0Var == null) {
            return null;
        }
        Rect rect = (Rect) u0Var.f75775a.get(S3);
        int i10 = rect.left;
        int i11 = rect.top;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) u0Var.f75776b.getTag(a0.a.f75503k);
        if (iArr != null) {
            int i12 = iArr[0];
            f10 = (i12 - rect.left) + translationX;
            int i13 = iArr[1];
            f11 = (i13 - rect.top) + translationY;
            rect.offsetTo(i12, i13);
        } else {
            f10 = translationX;
            f11 = translationY;
        }
        Y0(viewGroup, rect, this.P3);
        int[] iArr2 = this.P3;
        return w0.a(view, u0Var, i10, i11, translationX, translationY, f10 + iArr2[0], f11 + iArr2[1], R3, this);
    }

    @Override // androidx.transition.g0
    public boolean e0() {
        return true;
    }

    @Override // androidx.transition.f1, androidx.transition.g0
    public void l(@NonNull u0 u0Var) {
        super.l(u0Var);
        N0(u0Var);
    }

    @Override // androidx.transition.f1, androidx.transition.g0
    public void p(@NonNull u0 u0Var) {
        super.p(u0Var);
        N0(u0Var);
    }

    public j(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.P3 = new int[2];
        J0(new i());
    }
}
