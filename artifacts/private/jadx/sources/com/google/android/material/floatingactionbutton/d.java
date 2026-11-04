package com.google.android.material.floatingactionbutton;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.core.util.t;
import androidx.core.view.u1;
import com.google.android.material.internal.a0;
import com.google.android.material.shape.p;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
class d {
    static final long E = 100;
    static final long F = 100;
    static final int G = 0;
    static final int H = 1;
    static final int I = 2;
    static final float J = 1.5f;
    private static final float K = 0.0f;
    private static final float L = 0.4f;
    private static final float M = 0.4f;
    private static final float N = 1.0f;
    private static final float O = 1.0f;
    private static final float P = 1.0f;
    private static final float Q = 0.0f;
    private static final float R = 0.0f;

    @p0
    private ViewTreeObserver.OnPreDrawListener C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    p f112641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    com.google.android.material.shape.k f112642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    Drawable f112643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    com.google.android.material.floatingactionbutton.c f112644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    Drawable f112645e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f112646f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    float f112648h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    float f112649i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    float f112650j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f112651k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    private final a0 f112652l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @p0
    private Animator f112653m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @p0
    private com.google.android.material.animation.i f112654n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @p0
    private com.google.android.material.animation.i f112655o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f112656p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f112658r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ArrayList<Animator.AnimatorListener> f112660t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ArrayList<Animator.AnimatorListener> f112661u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private ArrayList<j> f112662v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    final FloatingActionButton f112663w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    final com.google.android.material.shadow.c f112664x;
    static final TimeInterpolator D = com.google.android.material.animation.b.f111045c;
    private static final int S = r6.a.c.Fd;
    private static final int T = r6.a.c.Vd;
    private static final int U = r6.a.c.Id;
    private static final int V = r6.a.c.Td;
    static final int[] W = {R.attr.state_pressed, R.attr.state_enabled};
    static final int[] X = {R.attr.state_hovered, R.attr.state_focused, R.attr.state_enabled};
    static final int[] Y = {R.attr.state_focused, R.attr.state_enabled};
    static final int[] Z = {R.attr.state_hovered, R.attr.state_enabled};

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    static final int[] f112639a0 = {R.attr.state_enabled};

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    static final int[] f112640b0 = new int[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f112647g = true;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f112657q = 1.0f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f112659s = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final Rect f112665y = new Rect();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final RectF f112666z = new RectF();
    private final RectF A = new RectF();
    private final Matrix B = new Matrix();

    class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f112667a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f112668b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ k f112669c;

        a(boolean z10, k kVar) {
            this.f112668b = z10;
            this.f112669c = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f112667a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            int i10 = 6 ^ 0;
            d.this.f112659s = 0;
            d.this.f112653m = null;
            if (this.f112667a) {
                return;
            }
            FloatingActionButton floatingActionButton = d.this.f112663w;
            boolean z10 = this.f112668b;
            floatingActionButton.c(z10 ? 8 : 4, z10);
            k kVar = this.f112669c;
            if (kVar != null) {
                kVar.b();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            d.this.f112663w.c(0, this.f112668b);
            d.this.f112659s = 1;
            d.this.f112653m = animator;
            this.f112667a = false;
        }
    }

    class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f112671a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k f112672b;

        b(boolean z10, k kVar) {
            this.f112671a = z10;
            this.f112672b = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            d.this.f112659s = 0;
            d.this.f112653m = null;
            k kVar = this.f112672b;
            if (kVar != null) {
                kVar.a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            d.this.f112663w.c(0, this.f112671a);
            d.this.f112659s = 2;
            d.this.f112653m = animator;
        }
    }

    class c extends com.google.android.material.animation.h {
        c() {
        }

        @Override // com.google.android.material.animation.h, android.animation.TypeEvaluator
        /* JADX INFO: renamed from: a */
        public Matrix evaluate(float f10, @NonNull Matrix matrix, @NonNull Matrix matrix2) {
            d.this.f112657q = f10;
            return super.evaluate(f10, matrix, matrix2);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.d$d, reason: collision with other inner class name */
    class C0986d implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f112675a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f112676b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f112677c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f112678d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f112679e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f112680f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f112681g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Matrix f112682h;

        C0986d(float f10, float f11, float f12, float f13, float f14, float f15, float f16, Matrix matrix) {
            this.f112675a = f10;
            this.f112676b = f11;
            this.f112677c = f12;
            this.f112678d = f13;
            this.f112679e = f14;
            this.f112680f = f15;
            this.f112681g = f16;
            this.f112682h = matrix;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            d.this.f112663w.setAlpha(com.google.android.material.animation.b.b(this.f112675a, this.f112676b, 0.0f, 0.2f, fFloatValue));
            d.this.f112663w.setScaleX(com.google.android.material.animation.b.a(this.f112677c, this.f112678d, fFloatValue));
            d.this.f112663w.setScaleY(com.google.android.material.animation.b.a(this.f112679e, this.f112678d, fFloatValue));
            d.this.f112657q = com.google.android.material.animation.b.a(this.f112680f, this.f112681g, fFloatValue);
            d.this.h(com.google.android.material.animation.b.a(this.f112680f, this.f112681g, fFloatValue), this.f112682h);
            d.this.f112663w.setImageMatrix(this.f112682h);
        }
    }

    class e implements TypeEvaluator<Float> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        FloatEvaluator f112684a = new FloatEvaluator();

        e() {
        }

        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float evaluate(float f10, Float f11, Float f12) {
            float fFloatValue = this.f112684a.evaluate(f10, (Number) f11, (Number) f12).floatValue();
            if (fFloatValue < 0.1f) {
                fFloatValue = 0.0f;
            }
            return Float.valueOf(fFloatValue);
        }
    }

    class f implements ViewTreeObserver.OnPreDrawListener {
        f() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            d.this.I();
            return true;
        }
    }

    private class g extends m {
        g() {
            super(d.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.d.m
        protected float a() {
            return 0.0f;
        }
    }

    private class h extends m {
        h() {
            super(d.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.d.m
        protected float a() {
            d dVar = d.this;
            return dVar.f112648h + dVar.f112649i;
        }
    }

    private class i extends m {
        i() {
            super(d.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.d.m
        protected float a() {
            d dVar = d.this;
            return dVar.f112648h + dVar.f112650j;
        }
    }

    interface j {
        void a();

        void b();
    }

    interface k {
        void a();

        void b();
    }

    private class l extends m {
        l() {
            super(d.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.d.m
        protected float a() {
            return d.this.f112648h;
        }
    }

    private abstract class m extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f112691a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f112692b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f112693c;

        private m() {
        }

        protected abstract float a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            d.this.k0((int) this.f112693c);
            this.f112691a = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            if (!this.f112691a) {
                com.google.android.material.shape.k kVar = d.this.f112642b;
                this.f112692b = kVar == null ? 0.0f : kVar.y();
                this.f112693c = a();
                this.f112691a = true;
            }
            d dVar = d.this;
            float f10 = this.f112692b;
            dVar.k0((int) (f10 + ((this.f112693c - f10) * valueAnimator.getAnimatedFraction())));
        }

        /* synthetic */ m(d dVar, a aVar) {
            this();
        }
    }

    d(FloatingActionButton floatingActionButton, com.google.android.material.shadow.c cVar) {
        this.f112663w = floatingActionButton;
        this.f112664x = cVar;
        a0 a0Var = new a0();
        this.f112652l = a0Var;
        a0Var.a(W, k(new i()));
        a0Var.a(X, k(new h()));
        a0Var.a(Y, k(new h()));
        a0Var.a(Z, k(new h()));
        a0Var.a(f112639a0, k(new l()));
        a0Var.a(f112640b0, k(new g()));
        this.f112656p = floatingActionButton.getRotation();
    }

    private boolean e0() {
        return u1.Y0(this.f112663w) && !this.f112663w.isInEditMode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(float f10, @NonNull Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f112663w.getDrawable();
        if (drawable == null || this.f112658r == 0) {
            return;
        }
        RectF rectF = this.f112666z;
        RectF rectF2 = this.A;
        rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        int i10 = this.f112658r;
        rectF2.set(0.0f, 0.0f, i10, i10);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i11 = this.f112658r;
        matrix.postScale(f10, f10, i11 / 2.0f, i11 / 2.0f);
    }

    @NonNull
    private AnimatorSet i(@NonNull com.google.android.material.animation.i iVar, float f10, float f11, float f12) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f112663w, (Property<FloatingActionButton, Float>) View.ALPHA, f10);
        iVar.h("opacity").a(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f112663w, (Property<FloatingActionButton, Float>) View.SCALE_X, f11);
        iVar.h("scale").a(objectAnimatorOfFloat2);
        l0(objectAnimatorOfFloat2);
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f112663w, (Property<FloatingActionButton, Float>) View.SCALE_Y, f11);
        iVar.h("scale").a(objectAnimatorOfFloat3);
        l0(objectAnimatorOfFloat3);
        arrayList.add(objectAnimatorOfFloat3);
        h(f12, this.B);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(this.f112663w, new com.google.android.material.animation.g(), new c(), new Matrix(this.B));
        iVar.h("iconScale").a(objectAnimatorOfObject);
        arrayList.add(objectAnimatorOfObject);
        AnimatorSet animatorSet = new AnimatorSet();
        com.google.android.material.animation.c.a(animatorSet, arrayList);
        return animatorSet;
    }

    private AnimatorSet j(float f10, float f11, float f12, int i10, int i11) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new C0986d(this.f112663w.getAlpha(), f10, this.f112663w.getScaleX(), f11, this.f112663w.getScaleY(), this.f112657q, f12, new Matrix(this.B)));
        arrayList.add(valueAnimatorOfFloat);
        com.google.android.material.animation.c.a(animatorSet, arrayList);
        animatorSet.setDuration(com.google.android.material.motion.j.f(this.f112663w.getContext(), i10, this.f112663w.getContext().getResources().getInteger(r6.a.i.M)));
        animatorSet.setInterpolator(com.google.android.material.motion.j.g(this.f112663w.getContext(), i11, com.google.android.material.animation.b.f111044b));
        return animatorSet;
    }

    @NonNull
    private ValueAnimator k(@NonNull m mVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(D);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(mVar);
        valueAnimator.addUpdateListener(mVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    private void l0(ObjectAnimator objectAnimator) {
    }

    @NonNull
    private ViewTreeObserver.OnPreDrawListener r() {
        if (this.C == null) {
            this.C = new f();
        }
        return this.C;
    }

    boolean A() {
        if (this.f112663w.getVisibility() != 0) {
            return this.f112659s == 2;
        }
        return this.f112659s != 1;
    }

    void B() {
        this.f112652l.c();
    }

    void C() {
        com.google.android.material.shape.k kVar = this.f112642b;
        if (kVar != null) {
            com.google.android.material.shape.l.f(this.f112663w, kVar);
        }
        if (O()) {
            this.f112663w.getViewTreeObserver().addOnPreDrawListener(r());
        }
    }

    void D() {
    }

    void E() {
        ViewTreeObserver viewTreeObserver = this.f112663w.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.C;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.C = null;
        }
    }

    void F(int[] iArr) {
        this.f112652l.d(iArr);
    }

    void G(float f10, float f11, float f12) {
        B();
        j0();
        k0(f10);
    }

    void H(@NonNull Rect rect) {
        t.m(this.f112645e, "Didn't initialize content background");
        if (!d0()) {
            this.f112664x.b(this.f112645e);
        } else {
            this.f112664x.b(new InsetDrawable(this.f112645e, rect.left, rect.top, rect.right, rect.bottom));
        }
    }

    void I() {
        float rotation = this.f112663w.getRotation();
        if (this.f112656p != rotation) {
            this.f112656p = rotation;
            h0();
        }
    }

    void J() {
        ArrayList<j> arrayList = this.f112662v;
        if (arrayList != null) {
            Iterator<j> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    void K() {
        ArrayList<j> arrayList = this.f112662v;
        if (arrayList != null) {
            Iterator<j> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    public void L(@NonNull Animator.AnimatorListener animatorListener) {
        ArrayList<Animator.AnimatorListener> arrayList = this.f112661u;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(animatorListener);
    }

    void M(@NonNull Animator.AnimatorListener animatorListener) {
        ArrayList<Animator.AnimatorListener> arrayList = this.f112660t;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(animatorListener);
    }

    void N(@NonNull j jVar) {
        ArrayList<j> arrayList = this.f112662v;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(jVar);
    }

    boolean O() {
        return true;
    }

    void P(@p0 ColorStateList colorStateList) {
        com.google.android.material.shape.k kVar = this.f112642b;
        if (kVar != null) {
            kVar.setTintList(colorStateList);
        }
        com.google.android.material.floatingactionbutton.c cVar = this.f112644d;
        if (cVar != null) {
            cVar.d(colorStateList);
        }
    }

    void Q(@p0 PorterDuff.Mode mode) {
        com.google.android.material.shape.k kVar = this.f112642b;
        if (kVar != null) {
            kVar.setTintMode(mode);
        }
    }

    final void R(float f10) {
        if (this.f112648h != f10) {
            this.f112648h = f10;
            G(f10, this.f112649i, this.f112650j);
        }
    }

    void S(boolean z10) {
        this.f112646f = z10;
    }

    final void T(@p0 com.google.android.material.animation.i iVar) {
        this.f112655o = iVar;
    }

    final void U(float f10) {
        if (this.f112649i != f10) {
            this.f112649i = f10;
            G(this.f112648h, f10, this.f112650j);
        }
    }

    final void V(float f10) {
        this.f112657q = f10;
        Matrix matrix = this.B;
        h(f10, matrix);
        this.f112663w.setImageMatrix(matrix);
    }

    final void W(int i10) {
        if (this.f112658r != i10) {
            this.f112658r = i10;
            i0();
        }
    }

    void X(int i10) {
        this.f112651k = i10;
    }

    final void Y(float f10) {
        if (this.f112650j != f10) {
            this.f112650j = f10;
            G(this.f112648h, this.f112649i, f10);
        }
    }

    void Z(@p0 ColorStateList colorStateList) {
        Drawable drawable = this.f112643c;
        if (drawable != null) {
            androidx.core.graphics.drawable.c.o(drawable, com.google.android.material.ripple.b.e(colorStateList));
        }
    }

    void a0(boolean z10) {
        this.f112647g = z10;
        j0();
    }

    final void b0(@NonNull p pVar) {
        this.f112641a = pVar;
        com.google.android.material.shape.k kVar = this.f112642b;
        if (kVar != null) {
            kVar.setShapeAppearanceModel(pVar);
        }
        Object obj = this.f112643c;
        if (obj instanceof com.google.android.material.shape.t) {
            ((com.google.android.material.shape.t) obj).setShapeAppearanceModel(pVar);
        }
        com.google.android.material.floatingactionbutton.c cVar = this.f112644d;
        if (cVar != null) {
            cVar.g(pVar);
        }
    }

    final void c0(@p0 com.google.android.material.animation.i iVar) {
        this.f112654n = iVar;
    }

    boolean d0() {
        return true;
    }

    public void e(@NonNull Animator.AnimatorListener animatorListener) {
        if (this.f112661u == null) {
            this.f112661u = new ArrayList<>();
        }
        this.f112661u.add(animatorListener);
    }

    void f(@NonNull Animator.AnimatorListener animatorListener) {
        if (this.f112660t == null) {
            this.f112660t = new ArrayList<>();
        }
        this.f112660t.add(animatorListener);
    }

    final boolean f0() {
        return !this.f112646f || this.f112663w.getSizeDimension() >= this.f112651k;
    }

    void g(@NonNull j jVar) {
        if (this.f112662v == null) {
            this.f112662v = new ArrayList<>();
        }
        this.f112662v.add(jVar);
    }

    void g0(@p0 k kVar, boolean z10) {
        if (A()) {
            return;
        }
        Animator animator = this.f112653m;
        if (animator != null) {
            animator.cancel();
        }
        boolean z11 = this.f112654n == null;
        if (!e0()) {
            this.f112663w.c(0, z10);
            this.f112663w.setAlpha(1.0f);
            this.f112663w.setScaleY(1.0f);
            this.f112663w.setScaleX(1.0f);
            V(1.0f);
            if (kVar != null) {
                kVar.a();
                return;
            }
            return;
        }
        if (this.f112663w.getVisibility() != 0) {
            this.f112663w.setAlpha(0.0f);
            this.f112663w.setScaleY(z11 ? 0.4f : 0.0f);
            this.f112663w.setScaleX(z11 ? 0.4f : 0.0f);
            V(z11 ? 0.4f : 0.0f);
        }
        com.google.android.material.animation.i iVar = this.f112654n;
        AnimatorSet animatorSetI = iVar != null ? i(iVar, 1.0f, 1.0f, 1.0f) : j(1.0f, 1.0f, 1.0f, S, T);
        animatorSetI.addListener(new b(z10, kVar));
        ArrayList<Animator.AnimatorListener> arrayList = this.f112660t;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetI.addListener(it.next());
            }
        }
        animatorSetI.start();
    }

    void h0() {
        com.google.android.material.shape.k kVar = this.f112642b;
        if (kVar != null) {
            kVar.x0((int) this.f112656p);
        }
    }

    final void i0() {
        V(this.f112657q);
    }

    final void j0() {
        Rect rect = this.f112665y;
        s(rect);
        H(rect);
        this.f112664x.a(rect.left, rect.top, rect.right, rect.bottom);
    }

    void k0(float f10) {
        com.google.android.material.shape.k kVar = this.f112642b;
        if (kVar != null) {
            kVar.o0(f10);
        }
    }

    com.google.android.material.shape.k l() {
        return new com.google.android.material.shape.k((p) t.l(this.f112641a));
    }

    @p0
    final Drawable m() {
        return this.f112645e;
    }

    float n() {
        return this.f112648h;
    }

    boolean o() {
        return this.f112646f;
    }

    @p0
    final com.google.android.material.animation.i p() {
        return this.f112655o;
    }

    float q() {
        return this.f112649i;
    }

    void s(@NonNull Rect rect) {
        int iW = w();
        float fN = this.f112647g ? n() + this.f112650j : 0.0f;
        int iMax = Math.max(iW, (int) Math.ceil(fN));
        int iMax2 = Math.max(iW, (int) Math.ceil(fN * J));
        rect.set(iMax, iMax2, iMax, iMax2);
    }

    float t() {
        return this.f112650j;
    }

    @p0
    final p u() {
        return this.f112641a;
    }

    @p0
    final com.google.android.material.animation.i v() {
        return this.f112654n;
    }

    int w() {
        if (this.f112646f) {
            return Math.max((this.f112651k - this.f112663w.getSizeDimension()) / 2, 0);
        }
        return 0;
    }

    void x(@p0 k kVar, boolean z10) {
        d dVar;
        AnimatorSet animatorSetJ;
        if (!z()) {
            Animator animator = this.f112653m;
            if (animator != null) {
                animator.cancel();
            }
            if (e0()) {
                com.google.android.material.animation.i iVar = this.f112655o;
                if (iVar != null) {
                    animatorSetJ = i(iVar, 0.0f, 0.0f, 0.0f);
                    dVar = this;
                } else {
                    dVar = this;
                    animatorSetJ = dVar.j(0.0f, 0.4f, 0.4f, U, V);
                }
                animatorSetJ.addListener(dVar.new a(z10, kVar));
                ArrayList<Animator.AnimatorListener> arrayList = dVar.f112661u;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        animatorSetJ.addListener(it.next());
                    }
                }
                animatorSetJ.start();
                return;
            }
            this.f112663w.c(z10 ? 8 : 4, z10);
            if (kVar != null) {
                kVar.b();
            }
        }
    }

    void y(ColorStateList colorStateList, @p0 PorterDuff.Mode mode, ColorStateList colorStateList2, int i10) {
        com.google.android.material.shape.k kVarL = l();
        this.f112642b = kVarL;
        kVarL.setTintList(colorStateList);
        if (mode != null) {
            this.f112642b.setTintMode(mode);
        }
        this.f112642b.w0(-12303292);
        this.f112642b.a0(this.f112663w.getContext());
        com.google.android.material.ripple.a aVar = new com.google.android.material.ripple.a(this.f112642b.getShapeAppearanceModel());
        aVar.setTintList(com.google.android.material.ripple.b.e(colorStateList2));
        this.f112643c = aVar;
        this.f112645e = new LayerDrawable(new Drawable[]{(Drawable) t.l(this.f112642b), aVar});
    }

    boolean z() {
        int i10 = 6 << 1;
        if (this.f112663w.getVisibility() == 0) {
            return this.f112659s == 1;
        }
        return this.f112659s != 2;
    }
}
