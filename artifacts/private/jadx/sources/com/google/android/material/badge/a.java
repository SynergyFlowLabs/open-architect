package com.google.android.material.badge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.f;
import androidx.annotation.f1;
import androidx.annotation.g1;
import androidx.annotation.l;
import androidx.annotation.n1;
import androidx.annotation.p0;
import androidx.annotation.r0;
import androidx.annotation.s0;
import androidx.annotation.t0;
import androidx.core.view.u1;
import com.google.android.material.internal.d0;
import com.google.android.material.internal.g0;
import com.google.android.material.resources.d;
import com.google.android.material.shape.k;
import com.google.android.material.shape.p;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
@r0(markerClass = {c.class})
public class a extends Drawable implements d0.b {
    static final int H1 = -1;
    static final String Y = "+";
    static final String Z = "…";

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private static final float f111258g3 = 0.3f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f111259n = "Badge";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f111260o = 8388661;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    static final int f111261p0 = 0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    static final int f111262p1 = 1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public static final int f111263p2 = -2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f111264s = 8388659;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Deprecated
    public static final int f111265t = 8388693;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Deprecated
    public static final int f111266v = 8388691;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final WeakReference<Context> f111268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final k f111269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private final d0 f111270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    private final Rect f111271d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    private final BadgeState f111272e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f111273f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f111274g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f111275h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f111276i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f111277j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f111278k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @p0
    private WeakReference<View> f111279l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @p0
    private WeakReference<FrameLayout> f111280m;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @g1
    private static final int f111267w = r6.a.n.f361572yi;

    @f
    private static final int X = r6.a.c.E0;

    /* JADX INFO: renamed from: com.google.android.material.badge.a$a, reason: collision with other inner class name */
    class RunnableC0978a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f111281a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ FrameLayout f111282b;

        RunnableC0978a(View view, FrameLayout frameLayout) {
            this.f111281a = view;
            this.f111282b = frameLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.P0(this.f111281a, this.f111282b);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    private a(@NonNull Context context, @n1 int i10, @f int i11, @g1 int i12, @p0 BadgeState.State state) {
        this.f111268a = new WeakReference<>(context);
        g0.c(context);
        this.f111271d = new Rect();
        d0 d0Var = new d0(this);
        this.f111270c = d0Var;
        d0Var.g().setTextAlign(Paint.Align.CENTER);
        BadgeState badgeState = new BadgeState(context, i10, i11, i12, state);
        this.f111272e = badgeState;
        this.f111269b = new k(p.b(context, R() ? badgeState.o() : badgeState.k(), R() ? badgeState.n() : badgeState.j()).m());
        g0();
    }

    @NonNull
    private String D() {
        if (this.f111275h != -2 && C() > this.f111275h) {
            Context context = this.f111268a.get();
            return context == null ? "" : String.format(this.f111272e.z(), context.getString(r6.a.m.f360945b1), Integer.valueOf(this.f111275h), "+");
        }
        return NumberFormat.getInstance(this.f111272e.z()).format(C());
    }

    @p0
    private String E() {
        Context context;
        if (this.f111272e.s() == 0 || (context = this.f111268a.get()) == null) {
            return null;
        }
        return (this.f111275h == -2 || C() <= this.f111275h) ? context.getResources().getQuantityString(this.f111272e.s(), C(), Integer.valueOf(C())) : context.getString(this.f111272e.p(), Integer.valueOf(this.f111275h));
    }

    private float F(View view, float f10) {
        if (!(view.getParent() instanceof View)) {
            return 0.0f;
        }
        return ((this.f111273f + this.f111277j) - (((View) view.getParent()).getWidth() - view.getX())) + f10;
    }

    @p0
    private String I() {
        String strH = H();
        int iA = A();
        if (iA == -2 || strH == null || strH.length() <= iA) {
            return strH;
        }
        Context context = this.f111268a.get();
        if (context == null) {
            return "";
        }
        return String.format(context.getString(r6.a.m.f360944b0), strH.substring(0, iA - 1), Z);
    }

    @p0
    private CharSequence J() {
        CharSequence charSequenceQ = this.f111272e.q();
        return charSequenceQ != null ? charSequenceQ : H();
    }

    private float K(View view, float f10) {
        return (this.f111274g - this.f111278k) + view.getY() + f10;
    }

    private int L() {
        int iT = R() ? this.f111272e.t() : this.f111272e.u();
        if (this.f111272e.f111229k == 1) {
            iT += R() ? this.f111272e.f111228j : this.f111272e.f111227i;
        }
        return iT + this.f111272e.d();
    }

    private void L0(View view) {
        WeakReference<FrameLayout> weakReference;
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if ((viewGroup == null || viewGroup.getId() != r6.a.h.f360667g3) && ((weakReference = this.f111280m) == null || weakReference.get() != viewGroup)) {
            M0(view);
            FrameLayout frameLayout = new FrameLayout(view.getContext());
            frameLayout.setId(r6.a.h.f360667g3);
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            frameLayout.setLayoutParams(view.getLayoutParams());
            frameLayout.setMinimumWidth(view.getWidth());
            frameLayout.setMinimumHeight(view.getHeight());
            int iIndexOfChild = viewGroup.indexOfChild(view);
            viewGroup.removeViewAt(iIndexOfChild);
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            frameLayout.addView(view);
            viewGroup.addView(frameLayout, iIndexOfChild);
            this.f111280m = new WeakReference<>(frameLayout);
            frameLayout.post(new RunnableC0978a(view, frameLayout));
        }
    }

    private int M() {
        int iE = this.f111272e.E();
        if (R()) {
            iE = this.f111272e.D();
            Context context = this.f111268a.get();
            if (context != null) {
                iE = com.google.android.material.animation.b.c(iE, iE - this.f111272e.v(), com.google.android.material.animation.b.b(0.0f, 1.0f, f111258g3, 1.0f, com.google.android.material.resources.c.f(context) - 1.0f));
            }
        }
        if (this.f111272e.f111229k == 0) {
            iE -= Math.round(this.f111278k);
        }
        return iE + this.f111272e.e();
    }

    private static void M0(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }

    private void Q0() {
        Context context = this.f111268a.get();
        WeakReference<View> weakReference = this.f111279l;
        View view = weakReference != null ? weakReference.get() : null;
        if (context != null && view != null) {
            Rect rect = new Rect();
            rect.set(this.f111271d);
            Rect rect2 = new Rect();
            view.getDrawingRect(rect2);
            WeakReference<FrameLayout> weakReference2 = this.f111280m;
            FrameLayout frameLayout = weakReference2 != null ? weakReference2.get() : null;
            if (frameLayout != null || com.google.android.material.badge.b.f111284a) {
                if (frameLayout == null) {
                    frameLayout = (ViewGroup) view.getParent();
                }
                frameLayout.offsetDescendantRectToMyCoords(view, rect2);
            }
            c(rect2, view);
            com.google.android.material.badge.b.o(this.f111271d, this.f111273f, this.f111274g, this.f111277j, this.f111278k);
            float f10 = this.f111276i;
            if (f10 != -1.0f) {
                this.f111269b.l0(f10);
            }
            if (rect.equals(this.f111271d)) {
                return;
            }
            this.f111269b.setBounds(this.f111271d);
        }
    }

    private boolean R() {
        return T() || S();
    }

    private void R0() {
        if (A() != -2) {
            this.f111275h = ((int) Math.pow(10.0d, ((double) A()) - 1.0d)) - 1;
        } else {
            this.f111275h = B();
        }
    }

    private boolean U() {
        FrameLayout frameLayoutS = s();
        return frameLayoutS != null && frameLayoutS.getId() == r6.a.h.f360667g3;
    }

    private void V() {
        this.f111270c.g().setAlpha(getAlpha());
        invalidateSelf();
    }

    private void W() {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(this.f111272e.g());
        if (this.f111269b.z() != colorStateListValueOf) {
            this.f111269b.p0(colorStateListValueOf);
            invalidateSelf();
        }
    }

    private void X() {
        this.f111270c.m(true);
        Z();
        Q0();
        invalidateSelf();
    }

    private void Y() {
        WeakReference<View> weakReference = this.f111279l;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = this.f111279l.get();
        WeakReference<FrameLayout> weakReference2 = this.f111280m;
        P0(view, weakReference2 != null ? weakReference2.get() : null);
    }

    private void Z() {
        Context context = this.f111268a.get();
        if (context == null) {
            return;
        }
        this.f111269b.setShapeAppearanceModel(p.b(context, R() ? this.f111272e.o() : this.f111272e.k(), R() ? this.f111272e.n() : this.f111272e.j()).m());
        invalidateSelf();
    }

    private void a0() {
        d dVar;
        Context context = this.f111268a.get();
        if (context == null || this.f111270c.e() == (dVar = new d(context, this.f111272e.C()))) {
            return;
        }
        this.f111270c.l(dVar, context);
        b0();
        Q0();
        invalidateSelf();
    }

    private void b(@NonNull View view) {
        float y10;
        float x10;
        View viewS = s();
        if (viewS == null) {
            if (!(view.getParent() instanceof View)) {
                return;
            }
            float y11 = view.getY();
            x10 = view.getX();
            viewS = (View) view.getParent();
            y10 = y11;
        } else if (!U()) {
            y10 = 0.0f;
            x10 = 0.0f;
        } else {
            if (!(viewS.getParent() instanceof View)) {
                return;
            }
            y10 = viewS.getY();
            x10 = viewS.getX();
            viewS = (View) viewS.getParent();
        }
        float fK = K(viewS, y10);
        float fZ = z(viewS, x10);
        float fQ = q(viewS, y10);
        float F = F(viewS, x10);
        if (fK < 0.0f) {
            this.f111274g += Math.abs(fK);
        }
        if (fZ < 0.0f) {
            this.f111273f += Math.abs(fZ);
        }
        if (fQ > 0.0f) {
            this.f111274g -= Math.abs(fQ);
        }
        if (F > 0.0f) {
            this.f111273f -= Math.abs(F);
        }
    }

    private void b0() {
        this.f111270c.g().setColor(this.f111272e.l());
        invalidateSelf();
    }

    private void c(@NonNull Rect rect, @NonNull View view) {
        float f10 = R() ? this.f111272e.f111222d : this.f111272e.f111221c;
        this.f111276i = f10;
        if (f10 != -1.0f) {
            this.f111277j = f10;
            this.f111278k = f10;
        } else {
            this.f111277j = Math.round((R() ? this.f111272e.f111225g : this.f111272e.f111223e) / 2.0f);
            this.f111278k = Math.round((R() ? this.f111272e.f111226h : this.f111272e.f111224f) / 2.0f);
        }
        if (R()) {
            String strM = m();
            this.f111277j = Math.max(this.f111277j, (this.f111270c.h(strM) / 2.0f) + this.f111272e.i());
            float fMax = Math.max(this.f111278k, (this.f111270c.f(strM) / 2.0f) + this.f111272e.m());
            this.f111278k = fMax;
            this.f111277j = Math.max(this.f111277j, fMax);
        }
        int iM = M();
        int iH = this.f111272e.h();
        if (iH == 8388691 || iH == 8388693) {
            this.f111274g = rect.bottom - iM;
        } else {
            this.f111274g = rect.top + iM;
        }
        int iL = L();
        int iH2 = this.f111272e.h();
        if (iH2 == 8388659 || iH2 == 8388691) {
            this.f111273f = u1.c0(view) == 0 ? (rect.left - this.f111277j) + iL : (rect.right + this.f111277j) - iL;
        } else {
            this.f111273f = u1.c0(view) == 0 ? (rect.right + this.f111277j) - iL : (rect.left - this.f111277j) + iL;
        }
        if (this.f111272e.H()) {
            b(view);
        }
    }

    private void c0() {
        R0();
        int i10 = 2 ^ 1;
        this.f111270c.m(true);
        Q0();
        invalidateSelf();
    }

    private void d0() {
        if (T()) {
            return;
        }
        X();
    }

    private void e0() {
        X();
    }

    @NonNull
    public static a f(@NonNull Context context) {
        return new a(context, 0, X, f111267w, null);
    }

    private void f0() {
        boolean zI = this.f111272e.I();
        setVisible(zI, false);
        if (!com.google.android.material.badge.b.f111284a || s() == null || zI) {
            return;
        }
        ((ViewGroup) s().getParent()).invalidate();
    }

    @NonNull
    public static a g(@NonNull Context context, @n1 int i10) {
        return new a(context, i10, X, f111267w, null);
    }

    private void g0() {
        Z();
        a0();
        c0();
        X();
        V();
        W();
        b0();
        Y();
        Q0();
        f0();
    }

    @NonNull
    static a h(@NonNull Context context, @NonNull BadgeState.State state) {
        return new a(context, 0, X, f111267w, state);
    }

    private void i(Canvas canvas) {
        String strM = m();
        if (strM != null) {
            Rect rect = new Rect();
            this.f111270c.g().getTextBounds(strM, 0, strM.length(), rect);
            float fExactCenterY = this.f111274g - rect.exactCenterY();
            canvas.drawText(strM, this.f111273f, rect.bottom <= 0 ? (int) fExactCenterY : Math.round(fExactCenterY), this.f111270c.g());
        }
    }

    @p0
    private String m() {
        if (T()) {
            return I();
        }
        if (S()) {
            return D();
        }
        return null;
    }

    private float q(View view, float f10) {
        if (!(view.getParent() instanceof View)) {
            return 0.0f;
        }
        return ((this.f111274g + this.f111278k) - (((View) view.getParent()).getHeight() - view.getY())) + f10;
    }

    private CharSequence t() {
        return this.f111272e.r();
    }

    private float z(View view, float f10) {
        return (this.f111273f - this.f111277j) + view.getX() + f10;
    }

    public int A() {
        return this.f111272e.w();
    }

    public void A0(@t0 int i10) {
        this.f111272e.d0(i10);
        Q0();
    }

    public int B() {
        return this.f111272e.x();
    }

    public void B0(int i10) {
        if (this.f111272e.w() != i10) {
            this.f111272e.e0(i10);
            c0();
        }
    }

    public int C() {
        if (this.f111272e.F()) {
            return this.f111272e.y();
        }
        return 0;
    }

    public void C0(int i10) {
        if (this.f111272e.x() != i10) {
            this.f111272e.f0(i10);
            c0();
        }
    }

    public void D0(int i10) {
        int iMax = Math.max(0, i10);
        if (this.f111272e.y() != iMax) {
            this.f111272e.g0(iMax);
            d0();
        }
    }

    public void E0(@p0 String str) {
        if (!TextUtils.equals(this.f111272e.B(), str)) {
            this.f111272e.i0(str);
            e0();
        }
    }

    public void F0(@g1 int i10) {
        this.f111272e.j0(i10);
        a0();
    }

    @NonNull
    BadgeState.State G() {
        return this.f111272e.A();
    }

    public void G0(int i10) {
        I0(i10);
        H0(i10);
    }

    @p0
    public String H() {
        return this.f111272e.B();
    }

    public void H0(@t0 int i10) {
        this.f111272e.k0(i10);
        Q0();
    }

    public void I0(@t0 int i10) {
        this.f111272e.l0(i10);
        Q0();
    }

    public void J0(@t0 int i10) {
        if (i10 != this.f111272e.m()) {
            this.f111272e.U(i10);
            Q0();
        }
    }

    public void K0(boolean z10) {
        this.f111272e.m0(z10);
        f0();
    }

    public int N() {
        return this.f111272e.E();
    }

    public void N0(@NonNull View view) {
        P0(view, null);
    }

    @t0
    public int O() {
        return this.f111272e.D();
    }

    @Deprecated
    public void O0(@NonNull View view, @p0 ViewGroup viewGroup) {
        if (!(viewGroup instanceof FrameLayout)) {
            throw new IllegalArgumentException("customBadgeParent must be a FrameLayout");
        }
        P0(view, (FrameLayout) viewGroup);
    }

    @t0
    public int P() {
        return this.f111272e.E();
    }

    public void P0(@NonNull View view, @p0 FrameLayout frameLayout) {
        this.f111279l = new WeakReference<>(view);
        boolean z10 = com.google.android.material.badge.b.f111284a;
        if (z10 && frameLayout == null) {
            L0(view);
        } else {
            this.f111280m = new WeakReference<>(frameLayout);
        }
        if (!z10) {
            M0(view);
        }
        Q0();
        invalidateSelf();
    }

    @t0
    public int Q() {
        return this.f111272e.m();
    }

    public boolean S() {
        return !this.f111272e.G() && this.f111272e.F();
    }

    public boolean T() {
        return this.f111272e.G();
    }

    @Override // com.google.android.material.internal.d0.b
    @b1({b1.a.LIBRARY_GROUP})
    public void a() {
        invalidateSelf();
    }

    public void d() {
        if (this.f111272e.F()) {
            this.f111272e.a();
            d0();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        if (!getBounds().isEmpty() && getAlpha() != 0 && isVisible()) {
            this.f111269b.draw(canvas);
            if (R()) {
                i(canvas);
            }
        }
    }

    public void e() {
        if (this.f111272e.G()) {
            this.f111272e.b();
            e0();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f111272e.f();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f111271d.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f111271d.width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    void h0(int i10) {
        this.f111272e.K(i10);
        Q0();
    }

    void i0(@t0 int i10) {
        this.f111272e.L(i10);
        Q0();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    int j() {
        return this.f111272e.d();
    }

    public void j0(boolean z10) {
        if (this.f111272e.H() == z10) {
            return;
        }
        this.f111272e.N(z10);
        WeakReference<View> weakReference = this.f111279l;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        b(this.f111279l.get());
    }

    @t0
    int k() {
        return this.f111272e.e();
    }

    public void k0(@l int i10) {
        this.f111272e.O(i10);
        W();
    }

    @l
    public int l() {
        return this.f111269b.z().getDefaultColor();
    }

    public void l0(int i10) {
        if (i10 != 8388691) {
        }
        if (this.f111272e.h() != i10) {
            this.f111272e.P(i10);
            Y();
        }
    }

    public void m0(@NonNull Locale locale) {
        if (locale.equals(this.f111272e.z())) {
            return;
        }
        this.f111272e.h0(locale);
        invalidateSelf();
    }

    public int n() {
        return this.f111272e.h();
    }

    public void n0(@l int i10) {
        if (this.f111270c.g().getColor() != i10) {
            this.f111272e.T(i10);
            b0();
        }
    }

    @NonNull
    public Locale o() {
        return this.f111272e.z();
    }

    public void o0(@g1 int i10) {
        this.f111272e.W(i10);
        Z();
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.d0.b
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @l
    public int p() {
        return this.f111270c.g().getColor();
    }

    public void p0(@g1 int i10) {
        this.f111272e.V(i10);
        Z();
    }

    public void q0(@g1 int i10) {
        this.f111272e.S(i10);
        Z();
    }

    @p0
    public CharSequence r() {
        if (!isVisible()) {
            return null;
        }
        if (T()) {
            return J();
        }
        return S() ? E() : t();
    }

    public void r0(@g1 int i10) {
        this.f111272e.R(i10);
        Z();
    }

    @p0
    public FrameLayout s() {
        WeakReference<FrameLayout> weakReference = this.f111280m;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public void s0(@f1 int i10) {
        this.f111272e.X(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f111272e.M(i10);
        V();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void t0(@p0 CharSequence charSequence) {
        this.f111272e.Y(charSequence);
    }

    public int u() {
        return this.f111272e.u();
    }

    public void u0(CharSequence charSequence) {
        this.f111272e.Z(charSequence);
    }

    @t0
    public int v() {
        return this.f111272e.t();
    }

    public void v0(@s0 int i10) {
        this.f111272e.a0(i10);
    }

    @t0
    public int w() {
        return this.f111272e.u();
    }

    public void w0(int i10) {
        y0(i10);
        x0(i10);
    }

    @t0
    public int x() {
        return this.f111272e.i();
    }

    public void x0(@t0 int i10) {
        this.f111272e.b0(i10);
        Q0();
    }

    @t0
    public int y() {
        return this.f111272e.v();
    }

    public void y0(@t0 int i10) {
        this.f111272e.c0(i10);
        Q0();
    }

    public void z0(@t0 int i10) {
        if (i10 != this.f111272e.i()) {
            this.f111272e.Q(i10);
            Q0();
        }
    }
}
