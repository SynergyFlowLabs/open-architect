package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.transition.u0;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public class e0 extends androidx.transition.g0 {
    private static final String I3 = "android:textscale:scale";

    class a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextView f112841a;

        a(TextView textView) {
            this.f112841a = textView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f112841a.setScaleX(fFloatValue);
            this.f112841a.setScaleY(fFloatValue);
        }
    }

    private void N0(@NonNull u0 u0Var) {
        View view = u0Var.f75776b;
        if (view instanceof TextView) {
            u0Var.f75775a.put(I3, Float.valueOf(((TextView) view).getScaleX()));
        }
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
    public Animator t(@NonNull ViewGroup viewGroup, @androidx.annotation.p0 u0 u0Var, @androidx.annotation.p0 u0 u0Var2) {
        if (u0Var == null || u0Var2 == null || !(u0Var.f75776b instanceof TextView)) {
            return null;
        }
        View view = u0Var2.f75776b;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        Map<String, Object> map = u0Var.f75775a;
        Map<String, Object> map2 = u0Var2.f75775a;
        float fFloatValue = map.get(I3) != null ? ((Float) map.get(I3)).floatValue() : 1.0f;
        float fFloatValue2 = map2.get(I3) != null ? ((Float) map2.get(I3)).floatValue() : 1.0f;
        if (fFloatValue == fFloatValue2) {
            return null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, fFloatValue2);
        valueAnimatorOfFloat.addUpdateListener(new a(textView));
        return valueAnimatorOfFloat;
    }
}
