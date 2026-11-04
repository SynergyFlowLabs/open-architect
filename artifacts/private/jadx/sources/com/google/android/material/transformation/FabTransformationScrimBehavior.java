package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.animation.c;
import com.google.android.material.animation.j;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f114468h = 75;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f114469i = 150;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f114470j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final long f114471k = 150;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final j f114472f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final j f114473g;

    class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f114474a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f114475b;

        a(boolean z10, View view) {
            this.f114474a = z10;
            this.f114475b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f114474a) {
                return;
            }
            this.f114475b.setVisibility(4);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f114474a) {
                this.f114475b.setVisibility(0);
            }
        }
    }

    public FabTransformationScrimBehavior() {
        this.f114472f = new j(75L, 150L);
        this.f114473g = new j(0L, 150L);
    }

    private void U(@NonNull View view, boolean z10, boolean z11, @NonNull List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimatorOfFloat;
        j jVar = z10 ? this.f114472f : this.f114473g;
        if (z10) {
            if (!z11) {
                view.setAlpha(0.0f);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f);
        }
        jVar.a(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean L(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
        return super.L(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    @NonNull
    protected AnimatorSet T(@NonNull View view, @NonNull View view2, boolean z10, boolean z11) {
        ArrayList arrayList = new ArrayList();
        U(view2, z10, z11, arrayList, new ArrayList());
        AnimatorSet animatorSet = new AnimatorSet();
        c.a(animatorSet, arrayList);
        animatorSet.addListener(new a(z10, view2));
        return animatorSet;
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean m(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f114472f = new j(75L, 150L);
        this.f114473g = new j(0L, 150L);
    }
}
