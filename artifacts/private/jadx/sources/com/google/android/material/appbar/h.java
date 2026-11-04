package com.google.android.material.appbar;

import android.R;
import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.NonNull;
import androidx.annotation.w0;
import com.google.android.material.internal.g0;

/* JADX INFO: loaded from: classes4.dex */
@w0(21)
class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f111217a = {R.attr.stateListAnimator};

    h() {
    }

    static void a(@NonNull View view) {
        view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

    static void b(@NonNull View view, float f10) {
        int integer = view.getResources().getInteger(r6.a.i.f360827c);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j10 = integer;
        stateListAnimator.addState(new int[]{R.attr.state_enabled, r6.a.c.f359273gh, -r6.a.c.f359296hh}, ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(j10));
        stateListAnimator.addState(new int[]{R.attr.state_enabled}, ObjectAnimator.ofFloat(view, "elevation", f10).setDuration(j10));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }

    static void c(@NonNull View view, AttributeSet attributeSet, int i10, int i11) {
        Context context = view.getContext();
        TypedArray typedArrayK = g0.k(context, attributeSet, f111217a, i10, i11, new int[0]);
        try {
            if (typedArrayK.hasValue(0)) {
                view.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, typedArrayK.getResourceId(0, 0)));
            }
        } finally {
            typedArrayK.recycle();
        }
    }
}
