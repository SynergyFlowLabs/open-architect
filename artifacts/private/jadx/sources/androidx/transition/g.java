package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public class g extends g0 {
    private static final String I3 = "android:changeScroll:x";
    private static final String J3 = "android:changeScroll:y";
    private static final String[] K3 = {I3, J3};

    public g() {
    }

    private void N0(u0 u0Var) {
        u0Var.f75775a.put(I3, Integer.valueOf(u0Var.f75776b.getScrollX()));
        u0Var.f75775a.put(J3, Integer.valueOf(u0Var.f75776b.getScrollY()));
    }

    @Override // androidx.transition.g0
    @androidx.annotation.p0
    public String[] b0() {
        return K3;
    }

    @Override // androidx.transition.g0
    public boolean e0() {
        return true;
    }

    @Override // androidx.transition.g0
    public void l(@NonNull u0 u0Var) {
        N0(u0Var);
    }

    @Override // androidx.transition.g0
    public void p(@NonNull u0 u0Var) {
        N0(u0Var);
    }

    @Override // androidx.transition.g0
    @androidx.annotation.p0
    public Animator t(@NonNull ViewGroup viewGroup, @androidx.annotation.p0 u0 u0Var, @androidx.annotation.p0 u0 u0Var2) {
        ObjectAnimator objectAnimatorOfInt;
        ObjectAnimator objectAnimatorOfInt2 = null;
        if (u0Var == null || u0Var2 == null) {
            return null;
        }
        View view = u0Var2.f75776b;
        int iIntValue = ((Integer) u0Var.f75775a.get(I3)).intValue();
        int iIntValue2 = ((Integer) u0Var2.f75775a.get(I3)).intValue();
        int iIntValue3 = ((Integer) u0Var.f75775a.get(J3)).intValue();
        int iIntValue4 = ((Integer) u0Var2.f75775a.get(J3)).intValue();
        if (iIntValue != iIntValue2) {
            view.setScrollX(iIntValue);
            objectAnimatorOfInt = ObjectAnimator.ofInt(view, "scrollX", iIntValue, iIntValue2);
        } else {
            objectAnimatorOfInt = null;
        }
        if (iIntValue3 != iIntValue4) {
            view.setScrollY(iIntValue3);
            objectAnimatorOfInt2 = ObjectAnimator.ofInt(view, "scrollY", iIntValue3, iIntValue4);
        }
        return t0.c(objectAnimatorOfInt, objectAnimatorOfInt2);
    }

    public g(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
