package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.i;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private AnimatorSet f114447e;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ExpandableTransformationBehavior.this.f114447e = null;
        }
    }

    public ExpandableTransformationBehavior() {
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior
    @i
    protected boolean R(View view, View view2, boolean z10, boolean z11) {
        AnimatorSet animatorSet = this.f114447e;
        boolean z12 = animatorSet != null;
        if (z12) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSetT = T(view, view2, z10, z12);
        this.f114447e = animatorSetT;
        animatorSetT.addListener(new a());
        this.f114447e.start();
        if (!z11) {
            this.f114447e.end();
        }
        return true;
    }

    @NonNull
    protected abstract AnimatorSet T(View view, View view2, boolean z10, boolean z11);

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
