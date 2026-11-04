package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.u1;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.g0;
import com.google.android.material.shape.p;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.b {
    private static final int C3 = 0;
    private static final int D3 = 1;
    private static final int E3 = 2;
    private static final int F3 = 0;
    private static final int G3 = 1;
    private static final int H3 = 2;
    private static final int I3 = 3;
    private static final int J3 = 0;
    private static final int K3 = 1;
    private static final int L3 = 2;
    private final int A3;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    private int f112541k3;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private final com.google.android.material.floatingactionbutton.a f112542l3;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    @NonNull
    private final com.google.android.material.floatingactionbutton.f f112543m3;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    @NonNull
    private final com.google.android.material.floatingactionbutton.f f112544n3;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    private final com.google.android.material.floatingactionbutton.f f112545o3;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private final com.google.android.material.floatingactionbutton.f f112546p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private final int f112547q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    private int f112548r3;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    private int f112549s3;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    @NonNull
    private final CoordinatorLayout.c<ExtendedFloatingActionButton> f112550t3;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    private boolean f112551u3;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    private boolean f112552v3;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    private boolean f112553w3;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    @NonNull
    protected ColorStateList f112554x3;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    private int f112555y3;

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    private int f112556z3;
    private static final int B3 = r6.a.n.f361243jj;
    static final Property<View, Float> M3 = new f(Float.class, "width");
    static final Property<View, Float> N3 = new g(Float.class, "height");
    static final Property<View, Float> O3 = new h(Float.class, "paddingStart");
    static final Property<View, Float> P3 = new i(Float.class, "paddingEnd");

    class a implements n {
        a() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int a() {
            return ExtendedFloatingActionButton.this.getCollapsedPadding();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public ViewGroup.LayoutParams b() {
            return new ViewGroup.LayoutParams(getWidth(), getHeight());
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int c() {
            return ExtendedFloatingActionButton.this.getCollapsedPadding();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getHeight() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getWidth() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }
    }

    class b implements n {
        b() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int a() {
            return ExtendedFloatingActionButton.this.f112549s3;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public ViewGroup.LayoutParams b() {
            return new ViewGroup.LayoutParams(-2, -2);
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int c() {
            return ExtendedFloatingActionButton.this.f112548r3;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getHeight() {
            return ExtendedFloatingActionButton.this.getMeasuredHeight();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getWidth() {
            return (ExtendedFloatingActionButton.this.getMeasuredWidth() - (ExtendedFloatingActionButton.this.getCollapsedPadding() * 2)) + ExtendedFloatingActionButton.this.f112548r3 + ExtendedFloatingActionButton.this.f112549s3;
        }
    }

    class c implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f112566a;

        c(n nVar) {
            this.f112566a = nVar;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int a() {
            return ExtendedFloatingActionButton.this.f112549s3;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public ViewGroup.LayoutParams b() {
            return new ViewGroup.LayoutParams(-1, ExtendedFloatingActionButton.this.f112556z3 == 0 ? -2 : ExtendedFloatingActionButton.this.f112556z3);
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int c() {
            return ExtendedFloatingActionButton.this.f112548r3;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getHeight() {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            if (ExtendedFloatingActionButton.this.f112556z3 != -1) {
                if (ExtendedFloatingActionButton.this.f112556z3 != 0 && ExtendedFloatingActionButton.this.f112556z3 != -2) {
                    return ExtendedFloatingActionButton.this.f112556z3;
                }
                return this.f112566a.getHeight();
            }
            if (!(ExtendedFloatingActionButton.this.getParent() instanceof View)) {
                return this.f112566a.getHeight();
            }
            View view = (View) ExtendedFloatingActionButton.this.getParent();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null || layoutParams.height != -2) {
                return (view.getHeight() - ((!(ExtendedFloatingActionButton.this.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) ExtendedFloatingActionButton.this.getLayoutParams()) == null) ? 0 : marginLayoutParams.topMargin + marginLayoutParams.bottomMargin)) - (view.getPaddingTop() + view.getPaddingBottom());
            }
            return this.f112566a.getHeight();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getWidth() {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            if (!(ExtendedFloatingActionButton.this.getParent() instanceof View)) {
                return this.f112566a.getWidth();
            }
            View view = (View) ExtendedFloatingActionButton.this.getParent();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null || layoutParams.width != -2) {
                return (view.getWidth() - ((!(ExtendedFloatingActionButton.this.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) ExtendedFloatingActionButton.this.getLayoutParams()) == null) ? 0 : marginLayoutParams.leftMargin + marginLayoutParams.rightMargin)) - (view.getPaddingLeft() + view.getPaddingRight());
            }
            return this.f112566a.getWidth();
        }
    }

    class d implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f112568a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f112569b;

        d(n nVar, n nVar2) {
            this.f112568a = nVar;
            this.f112569b = nVar2;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int a() {
            return ExtendedFloatingActionButton.this.f112549s3;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public ViewGroup.LayoutParams b() {
            return new ViewGroup.LayoutParams(ExtendedFloatingActionButton.this.f112555y3 == 0 ? -2 : ExtendedFloatingActionButton.this.f112555y3, ExtendedFloatingActionButton.this.f112556z3 != 0 ? ExtendedFloatingActionButton.this.f112556z3 : -2);
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int c() {
            return ExtendedFloatingActionButton.this.f112548r3;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getHeight() {
            if (ExtendedFloatingActionButton.this.f112556z3 == -1) {
                return this.f112568a.getHeight();
            }
            return (ExtendedFloatingActionButton.this.f112556z3 == 0 || ExtendedFloatingActionButton.this.f112556z3 == -2) ? this.f112569b.getHeight() : ExtendedFloatingActionButton.this.f112556z3;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getWidth() {
            if (ExtendedFloatingActionButton.this.f112555y3 == -1) {
                return this.f112568a.getWidth();
            }
            return (ExtendedFloatingActionButton.this.f112555y3 == 0 || ExtendedFloatingActionButton.this.f112555y3 == -2) ? this.f112569b.getWidth() : ExtendedFloatingActionButton.this.f112555y3;
        }
    }

    class e extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f112571a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.google.android.material.floatingactionbutton.f f112572b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l f112573c;

        e(com.google.android.material.floatingactionbutton.f fVar, l lVar) {
            this.f112572b = fVar;
            this.f112573c = lVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f112571a = true;
            this.f112572b.b();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f112572b.a();
            if (this.f112571a) {
                return;
            }
            this.f112572b.j(this.f112573c);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f112572b.onAnimationStart(animator);
            this.f112571a = false;
        }
    }

    class f extends Property<View, Float> {
        f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(@NonNull View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(@NonNull View view, @NonNull Float f10) {
            view.getLayoutParams().width = f10.intValue();
            view.requestLayout();
        }
    }

    class g extends Property<View, Float> {
        g(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(@NonNull View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(@NonNull View view, @NonNull Float f10) {
            view.getLayoutParams().height = f10.intValue();
            view.requestLayout();
        }
    }

    class h extends Property<View, Float> {
        h(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(@NonNull View view) {
            return Float.valueOf(u1.n0(view));
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(@NonNull View view, @NonNull Float f10) {
            u1.m2(view, f10.intValue(), view.getPaddingTop(), u1.m0(view), view.getPaddingBottom());
        }
    }

    class i extends Property<View, Float> {
        i(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(@NonNull View view) {
            return Float.valueOf(u1.m0(view));
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(@NonNull View view, @NonNull Float f10) {
            u1.m2(view, u1.n0(view), view.getPaddingTop(), f10.intValue(), view.getPaddingBottom());
        }
    }

    class j extends com.google.android.material.floatingactionbutton.b {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final n f112575g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f112576h;

        j(com.google.android.material.floatingactionbutton.a aVar, n nVar, boolean z10) {
            super(ExtendedFloatingActionButton.this, aVar);
            this.f112575g = nVar;
            this.f112576h = z10;
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        public void a() {
            super.a();
            ExtendedFloatingActionButton.this.f112552v3 = false;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(false);
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            layoutParams.width = this.f112575g.b().width;
            layoutParams.height = this.f112575g.b().height;
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public boolean f() {
            return this.f112576h == ExtendedFloatingActionButton.this.f112551u3 || ExtendedFloatingActionButton.this.getIcon() == null || TextUtils.isEmpty(ExtendedFloatingActionButton.this.getText());
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public int h() {
            return this.f112576h ? r6.a.b.A : r6.a.b.f359116z;
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        @NonNull
        public AnimatorSet i() {
            com.google.android.material.animation.i iVarC = c();
            if (iVarC.j("width")) {
                PropertyValuesHolder[] propertyValuesHolderArrG = iVarC.g("width");
                propertyValuesHolderArrG[0].setFloatValues(ExtendedFloatingActionButton.this.getWidth(), this.f112575g.getWidth());
                iVarC.l("width", propertyValuesHolderArrG);
            }
            if (iVarC.j("height")) {
                PropertyValuesHolder[] propertyValuesHolderArrG2 = iVarC.g("height");
                propertyValuesHolderArrG2[0].setFloatValues(ExtendedFloatingActionButton.this.getHeight(), this.f112575g.getHeight());
                iVarC.l("height", propertyValuesHolderArrG2);
            }
            if (iVarC.j("paddingStart")) {
                PropertyValuesHolder[] propertyValuesHolderArrG3 = iVarC.g("paddingStart");
                propertyValuesHolderArrG3[0].setFloatValues(u1.n0(ExtendedFloatingActionButton.this), this.f112575g.c());
                iVarC.l("paddingStart", propertyValuesHolderArrG3);
            }
            if (iVarC.j("paddingEnd")) {
                PropertyValuesHolder[] propertyValuesHolderArrG4 = iVarC.g("paddingEnd");
                propertyValuesHolderArrG4[0].setFloatValues(u1.m0(ExtendedFloatingActionButton.this), this.f112575g.a());
                iVarC.l("paddingEnd", propertyValuesHolderArrG4);
            }
            if (iVarC.j("labelOpacity")) {
                PropertyValuesHolder[] propertyValuesHolderArrG5 = iVarC.g("labelOpacity");
                boolean z10 = this.f112576h;
                propertyValuesHolderArrG5[0].setFloatValues(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f);
                iVarC.l("labelOpacity", propertyValuesHolderArrG5);
            }
            return super.o(iVarC);
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public void j(@p0 l lVar) {
            if (lVar == null) {
                return;
            }
            if (this.f112576h) {
                lVar.a(ExtendedFloatingActionButton.this);
            } else {
                lVar.d(ExtendedFloatingActionButton.this);
            }
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public void k() {
            ExtendedFloatingActionButton.this.f112551u3 = this.f112576h;
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            if (!this.f112576h) {
                ExtendedFloatingActionButton.this.f112555y3 = layoutParams.width;
                ExtendedFloatingActionButton.this.f112556z3 = layoutParams.height;
            }
            layoutParams.width = this.f112575g.b().width;
            layoutParams.height = this.f112575g.b().height;
            u1.m2(ExtendedFloatingActionButton.this, this.f112575g.c(), ExtendedFloatingActionButton.this.getPaddingTop(), this.f112575g.a(), ExtendedFloatingActionButton.this.getPaddingBottom());
            ExtendedFloatingActionButton.this.requestLayout();
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton.this.f112551u3 = this.f112576h;
            ExtendedFloatingActionButton.this.f112552v3 = true;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(true);
        }
    }

    class k extends com.google.android.material.floatingactionbutton.b {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f112578g;

        public k(com.google.android.material.floatingactionbutton.a aVar) {
            super(ExtendedFloatingActionButton.this, aVar);
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        public void a() {
            super.a();
            ExtendedFloatingActionButton.this.f112541k3 = 0;
            if (this.f112578g) {
                return;
            }
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        public void b() {
            super.b();
            this.f112578g = true;
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public boolean f() {
            return ExtendedFloatingActionButton.this.K();
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public int h() {
            return r6.a.b.B;
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public void j(@p0 l lVar) {
            if (lVar != null) {
                lVar.b(ExtendedFloatingActionButton.this);
            }
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public void k() {
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.f112578g = false;
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.f112541k3 = 1;
        }
    }

    public static abstract class l {
        public void a(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        public void b(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        public void c(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        public void d(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }
    }

    class m extends com.google.android.material.floatingactionbutton.b {
        public m(com.google.android.material.floatingactionbutton.a aVar) {
            super(ExtendedFloatingActionButton.this, aVar);
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        public void a() {
            super.a();
            ExtendedFloatingActionButton.this.f112541k3 = 0;
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public boolean f() {
            return ExtendedFloatingActionButton.this.L();
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public int h() {
            return r6.a.b.C;
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public void j(@p0 l lVar) {
            if (lVar != null) {
                lVar.c(ExtendedFloatingActionButton.this);
            }
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public void k() {
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.setAlpha(1.0f);
            ExtendedFloatingActionButton.this.setScaleY(1.0f);
            ExtendedFloatingActionButton.this.setScaleX(1.0f);
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.f112541k3 = 2;
        }
    }

    interface n {
        int a();

        ViewGroup.LayoutParams b();

        int c();

        int getHeight();

        int getWidth();
    }

    public ExtendedFloatingActionButton(@NonNull Context context) {
        this(context, null);
    }

    private n G(int i10) {
        b bVar = new b();
        c cVar = new c(bVar);
        d dVar = new d(cVar, bVar);
        if (i10 != 1) {
            return i10 != 2 ? dVar : cVar;
        }
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean K() {
        if (getVisibility() == 0) {
            return this.f112541k3 == 1;
        }
        return this.f112541k3 != 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean L() {
        if (getVisibility() != 0) {
            return this.f112541k3 == 2;
        }
        return this.f112541k3 != 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M(int i10, @p0 l lVar) {
        com.google.android.material.floatingactionbutton.f fVar;
        if (i10 == 0) {
            fVar = this.f112545o3;
        } else if (i10 == 1) {
            fVar = this.f112546p3;
        } else if (i10 == 2) {
            fVar = this.f112543m3;
        } else {
            if (i10 != 3) {
                throw new IllegalStateException("Unknown strategy type: " + i10);
            }
            fVar = this.f112544n3;
        }
        if (fVar.f()) {
            return;
        }
        if (!S()) {
            fVar.k();
            fVar.j(lVar);
            return;
        }
        if (i10 == 2) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                this.f112555y3 = layoutParams.width;
                this.f112556z3 = layoutParams.height;
            } else {
                this.f112555y3 = getWidth();
                this.f112556z3 = getHeight();
            }
        }
        measure(0, 0);
        AnimatorSet animatorSetI = fVar.i();
        animatorSetI.addListener(new e(fVar, lVar));
        Iterator<Animator.AnimatorListener> it = fVar.d().iterator();
        while (it.hasNext()) {
            animatorSetI.addListener(it.next());
        }
        animatorSetI.start();
    }

    private void R() {
        this.f112554x3 = getTextColors();
    }

    private boolean S() {
        return (u1.Y0(this) || (!L() && this.f112553w3)) && !isInEditMode();
    }

    public void A(@NonNull Animator.AnimatorListener animatorListener) {
        this.f112544n3.l(animatorListener);
    }

    public void B(@NonNull Animator.AnimatorListener animatorListener) {
        this.f112546p3.l(animatorListener);
    }

    public void C(@NonNull Animator.AnimatorListener animatorListener) {
        this.f112545o3.l(animatorListener);
    }

    public void D(@NonNull Animator.AnimatorListener animatorListener) {
        this.f112543m3.l(animatorListener);
    }

    public void E() {
        M(3, null);
    }

    public void F(@NonNull l lVar) {
        M(3, lVar);
    }

    public void H() {
        M(1, null);
    }

    public void I(@NonNull l lVar) {
        M(1, lVar);
    }

    public final boolean J() {
        return this.f112551u3;
    }

    public void N(@NonNull Animator.AnimatorListener animatorListener) {
        this.f112544n3.g(animatorListener);
    }

    public void O(@NonNull Animator.AnimatorListener animatorListener) {
        this.f112546p3.g(animatorListener);
    }

    public void P(@NonNull Animator.AnimatorListener animatorListener) {
        this.f112545o3.g(animatorListener);
    }

    public void Q(@NonNull Animator.AnimatorListener animatorListener) {
        this.f112543m3.g(animatorListener);
    }

    public void T() {
        M(0, null);
    }

    public void U(@NonNull l lVar) {
        M(0, lVar);
    }

    public void V() {
        M(2, null);
    }

    public void W(@NonNull l lVar) {
        M(2, lVar);
    }

    protected void X(@NonNull ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @NonNull
    public CoordinatorLayout.c<ExtendedFloatingActionButton> getBehavior() {
        return this.f112550t3;
    }

    int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    @l1
    int getCollapsedSize() {
        int i10 = this.f112547q3;
        return i10 < 0 ? (Math.min(u1.n0(this), u1.m0(this)) * 2) + getIconSize() : i10;
    }

    @p0
    public com.google.android.material.animation.i getExtendMotionSpec() {
        return this.f112544n3.e();
    }

    @p0
    public com.google.android.material.animation.i getHideMotionSpec() {
        return this.f112546p3.e();
    }

    @p0
    public com.google.android.material.animation.i getShowMotionSpec() {
        return this.f112545o3.e();
    }

    @p0
    public com.google.android.material.animation.i getShrinkMotionSpec() {
        return this.f112543m3.e();
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f112551u3 && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.f112551u3 = false;
            this.f112543m3.k();
        }
    }

    public void setAnimateShowBeforeLayout(boolean z10) {
        this.f112553w3 = z10;
    }

    public void setExtendMotionSpec(@p0 com.google.android.material.animation.i iVar) {
        this.f112544n3.m(iVar);
    }

    public void setExtendMotionSpecResource(@androidx.annotation.b int i10) {
        setExtendMotionSpec(com.google.android.material.animation.i.d(getContext(), i10));
    }

    public void setExtended(boolean z10) {
        if (this.f112551u3 == z10) {
            return;
        }
        com.google.android.material.floatingactionbutton.f fVar = z10 ? this.f112544n3 : this.f112543m3;
        if (fVar.f()) {
            return;
        }
        fVar.k();
    }

    public void setHideMotionSpec(@p0 com.google.android.material.animation.i iVar) {
        this.f112546p3.m(iVar);
    }

    public void setHideMotionSpecResource(@androidx.annotation.b int i10) {
        setHideMotionSpec(com.google.android.material.animation.i.d(getContext(), i10));
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        super.setPadding(i10, i11, i12, i13);
        if (this.f112551u3 && !this.f112552v3) {
            this.f112548r3 = u1.n0(this);
            this.f112549s3 = u1.m0(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
        super.setPaddingRelative(i10, i11, i12, i13);
        if (this.f112551u3 && !this.f112552v3) {
            this.f112548r3 = i10;
            this.f112549s3 = i12;
        }
    }

    public void setShowMotionSpec(@p0 com.google.android.material.animation.i iVar) {
        this.f112545o3.m(iVar);
    }

    public void setShowMotionSpecResource(@androidx.annotation.b int i10) {
        setShowMotionSpec(com.google.android.material.animation.i.d(getContext(), i10));
    }

    public void setShrinkMotionSpec(@p0 com.google.android.material.animation.i iVar) {
        this.f112543m3.m(iVar);
    }

    public void setShrinkMotionSpecResource(@androidx.annotation.b int i10) {
        setShrinkMotionSpec(com.google.android.material.animation.i.d(getContext(), i10));
    }

    @Override // android.widget.TextView
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        R();
    }

    public ExtendedFloatingActionButton(@NonNull Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, r6.a.c.f359377l7);
    }

    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.c<T> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final boolean f112557f = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final boolean f112558g = true;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Rect f112559a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        private l f112560b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @p0
        private l f112561c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f112562d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f112563e;

        public ExtendedFloatingActionButtonBehavior() {
            this.f112562d = false;
            this.f112563e = true;
        }

        private static boolean R(@NonNull View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.g) {
                return ((CoordinatorLayout.g) layoutParams).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private boolean Y(@NonNull View view, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton) {
            return (this.f112562d || this.f112563e) && ((CoordinatorLayout.g) extendedFloatingActionButton.getLayoutParams()).e() == view.getId();
        }

        private boolean a0(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!Y(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f112559a == null) {
                this.f112559a = new Rect();
            }
            Rect rect = this.f112559a;
            com.google.android.material.internal.d.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                Z(extendedFloatingActionButton);
                return true;
            }
            N(extendedFloatingActionButton);
            return true;
        }

        private boolean b0(@NonNull View view, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!Y(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.g) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                Z(extendedFloatingActionButton);
            } else {
                N(extendedFloatingActionButton);
            }
            return true;
        }

        protected void N(@NonNull ExtendedFloatingActionButton extendedFloatingActionButton) {
            boolean z10 = this.f112563e;
            extendedFloatingActionButton.M(z10 ? 3 : 0, z10 ? this.f112561c : this.f112560b);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public boolean i(@NonNull CoordinatorLayout coordinatorLayout, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton, @NonNull Rect rect) {
            return super.i(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        public boolean P() {
            return this.f112562d;
        }

        public boolean Q() {
            return this.f112563e;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
        public boolean p(CoordinatorLayout coordinatorLayout, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                a0(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            }
            if (!R(view)) {
                return false;
            }
            b0(view, extendedFloatingActionButton);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
        public boolean t(@NonNull CoordinatorLayout coordinatorLayout, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton, int i10) {
            List<View> listW = coordinatorLayout.w(extendedFloatingActionButton);
            int size = listW.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view = listW.get(i11);
                if (!(view instanceof AppBarLayout)) {
                    if (R(view) && b0(view, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (a0(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.N(extendedFloatingActionButton, i10);
            return true;
        }

        public void U(boolean z10) {
            this.f112562d = z10;
        }

        public void V(boolean z10) {
            this.f112563e = z10;
        }

        @l1
        void W(@p0 l lVar) {
            this.f112560b = lVar;
        }

        @l1
        void X(@p0 l lVar) {
            this.f112561c = lVar;
        }

        protected void Z(@NonNull ExtendedFloatingActionButton extendedFloatingActionButton) {
            boolean z10 = this.f112563e;
            extendedFloatingActionButton.M(z10 ? 2 : 1, z10 ? this.f112561c : this.f112560b);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void o(@NonNull CoordinatorLayout.g gVar) {
            if (gVar.f46855h == 0) {
                gVar.f46855h = 80;
            }
        }

        public ExtendedFloatingActionButtonBehavior(@NonNull Context context, @p0 AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r6.a.o.f361857kg);
            this.f112562d = typedArrayObtainStyledAttributes.getBoolean(r6.a.o.f361881lg, false);
            this.f112563e = typedArrayObtainStyledAttributes.getBoolean(r6.a.o.f361905mg, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ExtendedFloatingActionButton(@NonNull Context context, @p0 AttributeSet attributeSet, int i10) {
        int i11 = B3;
        super(a7.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f112541k3 = 0;
        com.google.android.material.floatingactionbutton.a aVar = new com.google.android.material.floatingactionbutton.a();
        this.f112542l3 = aVar;
        m mVar = new m(aVar);
        this.f112545o3 = mVar;
        k kVar = new k(aVar);
        this.f112546p3 = kVar;
        this.f112551u3 = true;
        this.f112552v3 = false;
        this.f112553w3 = false;
        Context context2 = getContext();
        this.f112550t3 = new ExtendedFloatingActionButtonBehavior(context2, attributeSet);
        TypedArray typedArrayK = g0.k(context2, attributeSet, r6.a.o.f361664cg, i10, i11, new int[0]);
        com.google.android.material.animation.i iVarC = com.google.android.material.animation.i.c(context2, typedArrayK, r6.a.o.f361808ig);
        com.google.android.material.animation.i iVarC2 = com.google.android.material.animation.i.c(context2, typedArrayK, r6.a.o.f361785hg);
        com.google.android.material.animation.i iVarC3 = com.google.android.material.animation.i.c(context2, typedArrayK, r6.a.o.f361737fg);
        com.google.android.material.animation.i iVarC4 = com.google.android.material.animation.i.c(context2, typedArrayK, r6.a.o.f361833jg);
        this.f112547q3 = typedArrayK.getDimensionPixelSize(r6.a.o.f361689dg, -1);
        int i12 = typedArrayK.getInt(r6.a.o.f361761gg, 1);
        this.A3 = i12;
        this.f112548r3 = u1.n0(this);
        this.f112549s3 = u1.m0(this);
        com.google.android.material.floatingactionbutton.a aVar2 = new com.google.android.material.floatingactionbutton.a();
        j jVar = new j(aVar2, G(i12), true);
        this.f112544n3 = jVar;
        j jVar2 = new j(aVar2, new a(), false);
        this.f112543m3 = jVar2;
        mVar.m(iVarC);
        kVar.m(iVarC2);
        jVar.m(iVarC3);
        jVar2.m(iVarC4);
        typedArrayK.recycle();
        setShapeAppearanceModel(p.g(context2, attributeSet, i10, i11, p.f113595m).m());
        R();
    }

    @Override // android.widget.TextView
    public void setTextColor(@NonNull ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        R();
    }
}
