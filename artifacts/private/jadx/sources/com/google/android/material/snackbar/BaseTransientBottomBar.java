package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.d0;
import androidx.annotation.g0;
import androidx.annotation.j0;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.b1;
import androidx.core.view.g3;
import androidx.core.view.u1;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.internal.r0;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {
    public static final int A = 0;
    public static final int B = 1;
    public static final int C = -2;
    public static final int D = -1;
    public static final int E = 0;
    static final int F = 250;
    static final int G = 180;
    private static final int I = 150;
    private static final int J = 75;
    private static final float M = 0.8f;
    static final int O = 0;
    static final int P = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f113855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f113856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f113857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TimeInterpolator f113858d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final TimeInterpolator f113859e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final TimeInterpolator f113860f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    private final ViewGroup f113861g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Context f113862h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    protected final w f113863i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    private final com.google.android.material.snackbar.a f113864j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f113865k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f113866l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @p0
    private q f113867m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f113868n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @w0(29)
    private final Runnable f113869o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f113870p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f113871q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f113872r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f113873s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f113874t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f113875u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f113876v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private List<s<B>> f113877w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Behavior f113878x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @p0
    private final AccessibilityManager f113879y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NonNull
    com.google.android.material.snackbar.c.b f113880z;
    private static final TimeInterpolator H = com.google.android.material.animation.b.f111044b;
    private static final TimeInterpolator K = com.google.android.material.animation.b.f111043a;
    private static final TimeInterpolator L = com.google.android.material.animation.b.f111046d;
    private static final boolean Q = false;
    private static final int[] R = {r6.a.c.Jg};
    private static final String S = BaseTransientBottomBar.class.getSimpleName();

    @NonNull
    static final Handler N = new Handler(Looper.getMainLooper(), new h());

    public static class Behavior extends SwipeDismissBehavior<View> {

        @NonNull
        private final t Y = new t(this);

        /* JADX INFO: Access modifiers changed from: private */
        public void d0(@NonNull BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.Y.c(baseTransientBottomBar);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean O(View view) {
            return this.Y.a(view);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean s(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
            this.Y.b(coordinatorLayout, view, motionEvent);
            return super.s(coordinatorLayout, view, motionEvent);
        }
    }

    class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f113881a;

        a(int i10) {
            this.f113881a = i10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.Y(this.f113881a);
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.f113863i.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    class c implements ValueAnimator.AnimatorUpdateListener {
        c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BaseTransientBottomBar.this.f113863i.setScaleX(fFloatValue);
            BaseTransientBottomBar.this.f113863i.setScaleY(fFloatValue);
        }
    }

    class d extends AnimatorListenerAdapter {
        d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.Z();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f113864j.a(BaseTransientBottomBar.this.f113857c - BaseTransientBottomBar.this.f113855a, BaseTransientBottomBar.this.f113855a);
        }
    }

    class e implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f113886a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f113887b;

        e(int i10) {
            this.f113887b = i10;
            this.f113886a = i10;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.Q) {
                u1.i1(BaseTransientBottomBar.this.f113863i, iIntValue - this.f113886a);
            } else {
                BaseTransientBottomBar.this.f113863i.setTranslationY(iIntValue);
            }
            this.f113886a = iIntValue;
        }
    }

    class f extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f113889a;

        f(int i10) {
            this.f113889a = i10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.Y(this.f113889a);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f113864j.b(0, BaseTransientBottomBar.this.f113856b);
        }
    }

    class g implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f113891a = 0;

        g() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.Q) {
                u1.i1(BaseTransientBottomBar.this.f113863i, iIntValue - this.f113891a);
            } else {
                BaseTransientBottomBar.this.f113863i.setTranslationY(iIntValue);
            }
            this.f113891a = iIntValue;
        }
    }

    class h implements Handler.Callback {
        h() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(@NonNull Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                ((BaseTransientBottomBar) message.obj).n0();
                return true;
            }
            if (i10 != 1) {
                return false;
            }
            ((BaseTransientBottomBar) message.obj).P(message.arg1);
            return true;
        }
    }

    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.f113863i == null || baseTransientBottomBar.f113862h == null) {
                return;
            }
            int iHeight = (r0.b(BaseTransientBottomBar.this.f113862h).height() - BaseTransientBottomBar.this.N()) + ((int) BaseTransientBottomBar.this.f113863i.getTranslationY());
            if (iHeight >= BaseTransientBottomBar.this.f113874t) {
                BaseTransientBottomBar baseTransientBottomBar2 = BaseTransientBottomBar.this;
                baseTransientBottomBar2.f113875u = baseTransientBottomBar2.f113874t;
                return;
            }
            ViewGroup.LayoutParams layoutParams = BaseTransientBottomBar.this.f113863i.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                String unused = BaseTransientBottomBar.S;
                return;
            }
            BaseTransientBottomBar baseTransientBottomBar3 = BaseTransientBottomBar.this;
            baseTransientBottomBar3.f113875u = baseTransientBottomBar3.f113874t;
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += BaseTransientBottomBar.this.f113874t - iHeight;
            BaseTransientBottomBar.this.f113863i.requestLayout();
        }
    }

    class j implements b1 {
        j() {
        }

        @Override // androidx.core.view.b1
        @NonNull
        public g3 b(View view, @NonNull g3 g3Var) {
            BaseTransientBottomBar.this.f113870p = g3Var.o();
            BaseTransientBottomBar.this.f113871q = g3Var.p();
            BaseTransientBottomBar.this.f113872r = g3Var.q();
            BaseTransientBottomBar.this.t0();
            return g3Var;
        }
    }

    class k extends androidx.core.view.a {
        k() {
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, @NonNull androidx.core.view.accessibility.j jVar) {
            super.onInitializeAccessibilityNodeInfo(view, jVar);
            jVar.a(1048576);
            jVar.r1(true);
        }

        @Override // androidx.core.view.a
        public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            if (i10 != 1048576) {
                return super.performAccessibilityAction(view, i10, bundle);
            }
            BaseTransientBottomBar.this.A();
            return true;
        }
    }

    class l implements com.google.android.material.snackbar.c.b {
        l() {
        }

        @Override // com.google.android.material.snackbar.c.b
        public void a() {
            Handler handler = BaseTransientBottomBar.N;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }

        @Override // com.google.android.material.snackbar.c.b
        public void b(int i10) {
            Handler handler = BaseTransientBottomBar.N;
            handler.sendMessage(handler.obtainMessage(1, i10, 0, BaseTransientBottomBar.this));
        }
    }

    class m implements Runnable {
        m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseTransientBottomBar.this.Y(3);
        }
    }

    class n implements SwipeDismissBehavior.c {
        n() {
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.c
        public void a(@NonNull View view) {
            if (view.getParent() != null) {
                view.setVisibility(8);
            }
            BaseTransientBottomBar.this.B(0);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.c
        public void b(int i10) {
            if (i10 == 0) {
                com.google.android.material.snackbar.c.c().l(BaseTransientBottomBar.this.f113880z);
            } else if (i10 == 1 || i10 == 2) {
                com.google.android.material.snackbar.c.c().k(BaseTransientBottomBar.this.f113880z);
            }
        }
    }

    class o implements Runnable {
        o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            w wVar = BaseTransientBottomBar.this.f113863i;
            if (wVar == null) {
                return;
            }
            if (wVar.getParent() != null) {
                BaseTransientBottomBar.this.f113863i.setVisibility(0);
            }
            if (BaseTransientBottomBar.this.f113863i.getAnimationMode() == 1) {
                BaseTransientBottomBar.this.p0();
            } else {
                BaseTransientBottomBar.this.r0();
            }
        }
    }

    class p extends AnimatorListenerAdapter {
        p() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.Z();
        }
    }

    static class q implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        private final WeakReference<BaseTransientBottomBar> f113901a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        private final WeakReference<View> f113902b;

        private q(@NonNull BaseTransientBottomBar baseTransientBottomBar, @NonNull View view) {
            this.f113901a = new WeakReference<>(baseTransientBottomBar);
            this.f113902b = new WeakReference<>(view);
        }

        static q a(@NonNull BaseTransientBottomBar baseTransientBottomBar, @NonNull View view) {
            q qVar = new q(baseTransientBottomBar, view);
            if (u1.R0(view)) {
                com.google.android.material.internal.p0.b(view, qVar);
            }
            view.addOnAttachStateChangeListener(qVar);
            return qVar;
        }

        private boolean d() {
            if (this.f113901a.get() != null) {
                return false;
            }
            c();
            return true;
        }

        @p0
        View b() {
            return this.f113902b.get();
        }

        void c() {
            if (this.f113902b.get() != null) {
                this.f113902b.get().removeOnAttachStateChangeListener(this);
                com.google.android.material.internal.p0.u(this.f113902b.get(), this);
            }
            this.f113902b.clear();
            this.f113901a.clear();
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (d() || !this.f113901a.get().f113868n) {
                return;
            }
            this.f113901a.get().a0();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            if (d()) {
                return;
            }
            com.google.android.material.internal.p0.b(view, this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (d()) {
                return;
            }
            com.google.android.material.internal.p0.u(view, this);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public @interface r {
    }

    public static abstract class s<B> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f113903a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f113904b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f113905c = 2;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f113906d = 3;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f113907e = 4;

        @Retention(RetentionPolicy.SOURCE)
        @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
        public @interface a {
        }

        public void a(B b10, int i10) {
        }

        public void b(B b10) {
        }
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public static class t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.google.android.material.snackbar.c.b f113908a;

        public t(@NonNull SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.Z(0.1f);
            swipeDismissBehavior.W(0.6f);
            swipeDismissBehavior.a0(0);
        }

        public boolean a(View view) {
            return view instanceof w;
        }

        public void b(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (coordinatorLayout.G(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                    com.google.android.material.snackbar.c.c().k(this.f113908a);
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                com.google.android.material.snackbar.c.c().l(this.f113908a);
            }
        }

        public void c(@NonNull BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f113908a = baseTransientBottomBar.f113880z;
        }
    }

    @Deprecated
    public interface u extends com.google.android.material.snackbar.a {
    }

    @g0(from = -2)
    @Retention(RetentionPolicy.SOURCE)
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public @interface v {
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    protected static class w extends FrameLayout {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final View.OnTouchListener f113909l = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @p0
        private BaseTransientBottomBar<?> f113910a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        com.google.android.material.shape.p f113911b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f113912c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f113913d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f113914e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f113915f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f113916g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private ColorStateList f113917h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private PorterDuff.Mode f113918i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @p0
        private Rect f113919j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f113920k;

        class a implements View.OnTouchListener {
            a() {
            }

            @Override // android.view.View.OnTouchListener
            @e.a({"ClickableViewAccessibility"})
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        protected w(@NonNull Context context) {
            this(context, null);
        }

        @NonNull
        private Drawable d() {
            int iV = com.google.android.material.color.u.v(this, r6.a.c.f359214e4, r6.a.c.I3, getBackgroundOverlayColorAlpha());
            com.google.android.material.shape.p pVar = this.f113911b;
            Drawable drawableZ = pVar != null ? BaseTransientBottomBar.z(iV, pVar) : BaseTransientBottomBar.y(iV, getResources());
            if (this.f113917h == null) {
                return androidx.core.graphics.drawable.c.r(drawableZ);
            }
            Drawable drawableR = androidx.core.graphics.drawable.c.r(drawableZ);
            androidx.core.graphics.drawable.c.o(drawableR, this.f113917h);
            return drawableR;
        }

        private void e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.f113919j = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBaseTransientBottomBar(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f113910a = baseTransientBottomBar;
        }

        void c(ViewGroup viewGroup) {
            this.f113920k = true;
            viewGroup.addView(this);
            this.f113920k = false;
        }

        float getActionTextColorAlpha() {
            return this.f113914e;
        }

        int getAnimationMode() {
            return this.f113912c;
        }

        float getBackgroundOverlayColorAlpha() {
            return this.f113913d;
        }

        int getMaxInlineActionWidth() {
            return this.f113916g;
        }

        int getMaxWidth() {
            return this.f113915f;
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f113910a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.V();
            }
            u1.A1(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f113910a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.W();
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f113910a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.X();
            }
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (this.f113915f > 0) {
                int measuredWidth = getMeasuredWidth();
                int i12 = this.f113915f;
                if (measuredWidth > i12) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
                }
            }
        }

        void setAnimationMode(int i10) {
            this.f113912c = i10;
        }

        @Override // android.view.View
        public void setBackground(@p0 Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(@p0 Drawable drawable) {
            if (drawable != null && this.f113917h != null) {
                drawable = androidx.core.graphics.drawable.c.r(drawable.mutate());
                androidx.core.graphics.drawable.c.o(drawable, this.f113917h);
                androidx.core.graphics.drawable.c.p(drawable, this.f113918i);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(@p0 ColorStateList colorStateList) {
            this.f113917h = colorStateList;
            if (getBackground() != null) {
                Drawable drawableR = androidx.core.graphics.drawable.c.r(getBackground().mutate());
                androidx.core.graphics.drawable.c.o(drawableR, colorStateList);
                androidx.core.graphics.drawable.c.p(drawableR, this.f113918i);
                if (drawableR != getBackground()) {
                    super.setBackgroundDrawable(drawableR);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(@p0 PorterDuff.Mode mode) {
            this.f113918i = mode;
            if (getBackground() != null) {
                Drawable drawableR = androidx.core.graphics.drawable.c.r(getBackground().mutate());
                androidx.core.graphics.drawable.c.p(drawableR, mode);
                if (drawableR != getBackground()) {
                    super.setBackgroundDrawable(drawableR);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (this.f113920k || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                return;
            }
            e((ViewGroup.MarginLayoutParams) layoutParams);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f113910a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.t0();
            }
        }

        @Override // android.view.View
        public void setOnClickListener(@p0 View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f113909l);
            super.setOnClickListener(onClickListener);
        }

        protected w(@NonNull Context context, AttributeSet attributeSet) {
            super(a7.a.c(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, r6.a.o.Au);
            if (typedArrayObtainStyledAttributes.hasValue(r6.a.o.Hu)) {
                u1.U1(this, typedArrayObtainStyledAttributes.getDimensionPixelSize(r6.a.o.Hu, 0));
            }
            this.f113912c = typedArrayObtainStyledAttributes.getInt(r6.a.o.Du, 0);
            if (typedArrayObtainStyledAttributes.hasValue(r6.a.o.Ju) || typedArrayObtainStyledAttributes.hasValue(r6.a.o.Ku)) {
                this.f113911b = com.google.android.material.shape.p.e(context2, attributeSet, 0, 0).m();
            }
            this.f113913d = typedArrayObtainStyledAttributes.getFloat(r6.a.o.Eu, 1.0f);
            setBackgroundTintList(com.google.android.material.resources.c.a(context2, typedArrayObtainStyledAttributes, r6.a.o.Fu));
            setBackgroundTintMode(com.google.android.material.internal.p0.t(typedArrayObtainStyledAttributes.getInt(r6.a.o.Gu, -1), PorterDuff.Mode.SRC_IN));
            this.f113914e = typedArrayObtainStyledAttributes.getFloat(r6.a.o.Cu, 1.0f);
            this.f113915f = typedArrayObtainStyledAttributes.getDimensionPixelSize(r6.a.o.Bu, -1);
            this.f113916g = typedArrayObtainStyledAttributes.getDimensionPixelSize(r6.a.o.Iu, -1);
            typedArrayObtainStyledAttributes.recycle();
            setOnTouchListener(f113909l);
            setFocusable(true);
            if (getBackground() == null) {
                u1.O1(this, d());
            }
        }
    }

    protected BaseTransientBottomBar(@NonNull ViewGroup viewGroup, @NonNull View view, @NonNull com.google.android.material.snackbar.a aVar) {
        this(viewGroup.getContext(), viewGroup, view, aVar);
    }

    private ValueAnimator C(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f113858d);
        valueAnimatorOfFloat.addUpdateListener(new b());
        return valueAnimatorOfFloat;
    }

    private ValueAnimator J(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f113860f);
        valueAnimatorOfFloat.addUpdateListener(new c());
        return valueAnimatorOfFloat;
    }

    private int L() {
        int height = this.f113863i.getHeight();
        ViewGroup.LayoutParams layoutParams = this.f113863i.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int N() {
        int[] iArr = new int[2];
        this.f113863i.getLocationInWindow(iArr);
        return iArr[1] + this.f113863i.getHeight();
    }

    private boolean U() {
        ViewGroup.LayoutParams layoutParams = this.f113863i.getLayoutParams();
        return (layoutParams instanceof CoordinatorLayout.g) && (((CoordinatorLayout.g) layoutParams).f() instanceof SwipeDismissBehavior);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0() {
        this.f113873s = x();
        t0();
    }

    private void j0(CoordinatorLayout.g gVar) {
        SwipeDismissBehavior<? extends View> swipeDismissBehaviorI = this.f113878x;
        if (swipeDismissBehaviorI == null) {
            swipeDismissBehaviorI = I();
        }
        if (swipeDismissBehaviorI instanceof Behavior) {
            ((Behavior) swipeDismissBehaviorI).d0(this);
        }
        swipeDismissBehaviorI.X(new n());
        gVar.q(swipeDismissBehaviorI);
        if (D() == null) {
            gVar.f46854g = 80;
        }
    }

    private boolean l0() {
        return this.f113874t > 0 && !this.f113866l && U();
    }

    private void o0() {
        if (k0()) {
            v();
            return;
        }
        if (this.f113863i.getParent() != null) {
            this.f113863i.setVisibility(0);
        }
        Z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p0() {
        ValueAnimator valueAnimatorC = C(0.0f, 1.0f);
        ValueAnimator valueAnimatorJ = J(0.8f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorC, valueAnimatorJ);
        animatorSet.setDuration(this.f113855a);
        animatorSet.addListener(new p());
        animatorSet.start();
    }

    private void q0(int i10) {
        ValueAnimator valueAnimatorC = C(1.0f, 0.0f);
        valueAnimatorC.setDuration(this.f113856b);
        valueAnimatorC.addListener(new a(i10));
        valueAnimatorC.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r0() {
        int iL = L();
        if (Q) {
            u1.i1(this.f113863i, iL);
        } else {
            this.f113863i.setTranslationY(iL);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(iL, 0);
        valueAnimator.setInterpolator(this.f113859e);
        valueAnimator.setDuration(this.f113857c);
        valueAnimator.addListener(new d());
        valueAnimator.addUpdateListener(new e(iL));
        valueAnimator.start();
    }

    private void s0(int i10) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(0, L());
        valueAnimator.setInterpolator(this.f113859e);
        valueAnimator.setDuration(this.f113857c);
        valueAnimator.addListener(new f(i10));
        valueAnimator.addUpdateListener(new g());
        valueAnimator.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t0() {
        ViewGroup.LayoutParams layoutParams = this.f113863i.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || this.f113863i.f113919j == null || this.f113863i.getParent() == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i10 = this.f113863i.f113919j.bottom + (D() != null ? this.f113873s : this.f113870p);
        int i11 = this.f113863i.f113919j.left + this.f113871q;
        int i12 = this.f113863i.f113919j.right + this.f113872r;
        int i13 = this.f113863i.f113919j.top;
        boolean z10 = (marginLayoutParams.bottomMargin == i10 && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12 && marginLayoutParams.topMargin == i13) ? false : true;
        if (z10) {
            marginLayoutParams.bottomMargin = i10;
            marginLayoutParams.leftMargin = i11;
            marginLayoutParams.rightMargin = i12;
            marginLayoutParams.topMargin = i13;
            this.f113863i.requestLayout();
        }
        if ((z10 || this.f113875u != this.f113874t) && l0()) {
            this.f113863i.removeCallbacks(this.f113869o);
            this.f113863i.post(this.f113869o);
        }
    }

    private void w(int i10) {
        if (this.f113863i.getAnimationMode() == 1) {
            q0(i10);
        } else {
            s0(i10);
        }
    }

    private int x() {
        if (D() == null) {
            return 0;
        }
        int[] iArr = new int[2];
        D().getLocationOnScreen(iArr);
        int i10 = iArr[1];
        int[] iArr2 = new int[2];
        this.f113861g.getLocationOnScreen(iArr2);
        return (iArr2[1] + this.f113861g.getHeight()) - i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public static GradientDrawable y(@androidx.annotation.l int i10, @NonNull Resources resources) {
        float dimension = resources.getDimension(r6.a.f.f360510zd);
        GradientDrawable gradientDrawable = new GradientDrawable();
        int i11 = 0 << 0;
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(dimension);
        gradientDrawable.setColor(i10);
        return gradientDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public static com.google.android.material.shape.k z(@androidx.annotation.l int i10, @NonNull com.google.android.material.shape.p pVar) {
        com.google.android.material.shape.k kVar = new com.google.android.material.shape.k(pVar);
        kVar.p0(ColorStateList.valueOf(i10));
        return kVar;
    }

    public void A() {
        B(3);
    }

    protected void B(int i10) {
        com.google.android.material.snackbar.c.c().b(this.f113880z, i10);
    }

    @p0
    public View D() {
        q qVar = this.f113867m;
        if (qVar == null) {
            return null;
        }
        return qVar.b();
    }

    public int E() {
        return this.f113863i.getAnimationMode();
    }

    public Behavior F() {
        return this.f113878x;
    }

    @NonNull
    public Context G() {
        return this.f113862h;
    }

    public int H() {
        return this.f113865k;
    }

    @NonNull
    protected SwipeDismissBehavior<? extends View> I() {
        return new Behavior();
    }

    @j0
    protected int K() {
        return O() ? r6.a.k.E0 : r6.a.k.F;
    }

    @NonNull
    public View M() {
        return this.f113863i;
    }

    protected boolean O() {
        TypedArray typedArrayObtainStyledAttributes = this.f113862h.obtainStyledAttributes(R);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != -1;
    }

    final void P(int i10) {
        if (k0() && this.f113863i.getVisibility() == 0) {
            w(i10);
        } else {
            Y(i10);
        }
    }

    public boolean Q() {
        return this.f113868n;
    }

    public boolean R() {
        return this.f113866l;
    }

    public boolean S() {
        return com.google.android.material.snackbar.c.c().e(this.f113880z);
    }

    public boolean T() {
        return com.google.android.material.snackbar.c.c().f(this.f113880z);
    }

    void V() {
        WindowInsets rootWindowInsets = this.f113863i.getRootWindowInsets();
        if (rootWindowInsets != null) {
            this.f113874t = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
            t0();
        }
    }

    void W() {
        if (T()) {
            N.post(new m());
        }
    }

    void X() {
        if (this.f113876v) {
            o0();
            this.f113876v = false;
        }
    }

    void Y(int i10) {
        com.google.android.material.snackbar.c.c().i(this.f113880z);
        List<s<B>> list = this.f113877w;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f113877w.get(size).a(this, i10);
            }
        }
        ViewParent parent = this.f113863i.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f113863i);
        }
    }

    void Z() {
        com.google.android.material.snackbar.c.c().j(this.f113880z);
        List<s<B>> list = this.f113877w;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f113877w.get(size).b(this);
            }
        }
    }

    @NonNull
    public B b0(@p0 s<B> sVar) {
        List<s<B>> list;
        if (sVar != null && (list = this.f113877w) != null) {
            list.remove(sVar);
            return this;
        }
        return this;
    }

    @NonNull
    public B c0(@d0 int i10) {
        View viewFindViewById = this.f113861g.findViewById(i10);
        if (viewFindViewById != null) {
            return (B) d0(viewFindViewById);
        }
        throw new IllegalArgumentException("Unable to find anchor view with id: " + i10);
    }

    @NonNull
    public B d0(@p0 View view) {
        q qVar = this.f113867m;
        if (qVar != null) {
            qVar.c();
        }
        this.f113867m = view == null ? null : q.a(this, view);
        return this;
    }

    public void e0(boolean z10) {
        this.f113868n = z10;
    }

    @NonNull
    public B f0(int i10) {
        this.f113863i.setAnimationMode(i10);
        return this;
    }

    @NonNull
    public B g0(Behavior behavior) {
        this.f113878x = behavior;
        return this;
    }

    @NonNull
    public B h0(int i10) {
        this.f113865k = i10;
        return this;
    }

    @NonNull
    public B i0(boolean z10) {
        this.f113866l = z10;
        return this;
    }

    boolean k0() {
        AccessibilityManager accessibilityManager = this.f113879y;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }

    public void m0() {
        com.google.android.material.snackbar.c.c().n(H(), this.f113880z);
    }

    final void n0() {
        if (this.f113863i.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.f113863i.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.g) {
                j0((CoordinatorLayout.g) layoutParams);
            }
            this.f113863i.c(this.f113861g);
            a0();
            this.f113863i.setVisibility(4);
        }
        if (u1.Y0(this.f113863i)) {
            o0();
        } else {
            this.f113876v = true;
        }
    }

    @NonNull
    public B u(@p0 s<B> sVar) {
        if (sVar == null) {
            return this;
        }
        if (this.f113877w == null) {
            this.f113877w = new ArrayList();
        }
        this.f113877w.add(sVar);
        return this;
    }

    void v() {
        this.f113863i.post(new o());
    }

    protected BaseTransientBottomBar(@NonNull Context context, @NonNull ViewGroup viewGroup, @NonNull View view, @NonNull com.google.android.material.snackbar.a aVar) {
        this.f113868n = false;
        this.f113869o = new i();
        this.f113880z = new l();
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        }
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.f113861g = viewGroup;
        this.f113864j = aVar;
        this.f113862h = context;
        com.google.android.material.internal.g0.a(context);
        w wVar = (w) LayoutInflater.from(context).inflate(K(), viewGroup, false);
        this.f113863i = wVar;
        wVar.setBaseTransientBottomBar(this);
        if (view instanceof SnackbarContentLayout) {
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) view;
            snackbarContentLayout.c(wVar.getActionTextColorAlpha());
            snackbarContentLayout.setMaxInlineActionWidth(wVar.getMaxInlineActionWidth());
        }
        wVar.addView(view);
        u1.I1(wVar, 1);
        u1.Y1(wVar, 1);
        u1.V1(wVar, true);
        u1.j2(wVar, new j());
        u1.G1(wVar, new k());
        this.f113879y = (AccessibilityManager) context.getSystemService("accessibility");
        this.f113857c = com.google.android.material.motion.j.f(context, r6.a.c.Fd, 250);
        this.f113855a = com.google.android.material.motion.j.f(context, r6.a.c.Fd, 150);
        this.f113856b = com.google.android.material.motion.j.f(context, r6.a.c.Id, 75);
        this.f113858d = com.google.android.material.motion.j.g(context, r6.a.c.Vd, K);
        this.f113860f = com.google.android.material.motion.j.g(context, r6.a.c.Vd, L);
        this.f113859e = com.google.android.material.motion.j.g(context, r6.a.c.Vd, H);
    }
}
