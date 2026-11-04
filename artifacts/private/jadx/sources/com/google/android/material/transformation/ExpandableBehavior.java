package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.annotation.i;
import androidx.annotation.p0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.u1;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.c<View> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f114439b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f114440c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f114441d = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f114442a;

    class a implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f114443a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f114444b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ x6.b f114445c;

        a(View view, int i10, x6.b bVar) {
            this.f114443a = view;
            this.f114444b = i10;
            this.f114445c = bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f114443a.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f114442a == this.f114444b) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                x6.b bVar = this.f114445c;
                expandableBehavior.R((View) bVar, this.f114443a, bVar.b(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.f114442a = 0;
    }

    private boolean O(boolean z10) {
        if (!z10) {
            return this.f114442a == 1;
        }
        int i10 = this.f114442a;
        return i10 == 0 || i10 == 2;
    }

    @p0
    public static <T extends ExpandableBehavior> T Q(@NonNull View view, @NonNull Class<T> cls) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.g)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.c cVarF = ((CoordinatorLayout.g) layoutParams).f();
        if (cVarF instanceof ExpandableBehavior) {
            return cls.cast(cVarF);
        }
        throw new IllegalArgumentException("The view is not associated with ExpandableBehavior");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @p0
    protected x6.b P(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view) {
        List<View> listW = coordinatorLayout.w(view);
        int size = listW.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = listW.get(i10);
            if (m(coordinatorLayout, view, view2)) {
                return (x6.b) view2;
            }
        }
        return null;
    }

    protected abstract boolean R(View view, View view2, boolean z10, boolean z11);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public abstract boolean m(CoordinatorLayout coordinatorLayout, View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    @i
    public boolean p(CoordinatorLayout coordinatorLayout, View view, View view2) {
        x6.b bVar = (x6.b) view2;
        if (!O(bVar.b())) {
            return false;
        }
        this.f114442a = bVar.b() ? 1 : 2;
        return R((View) bVar, view, bVar.b(), true);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    @i
    public boolean t(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i10) {
        x6.b bVarP;
        if (!u1.Y0(view) && (bVarP = P(coordinatorLayout, view)) != null && O(bVarP.b())) {
            int i11 = bVarP.b() ? 1 : 2;
            this.f114442a = i11;
            view.getViewTreeObserver().addOnPreDrawListener(new a(view, i11, bVarP));
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f114442a = 0;
    }
}
