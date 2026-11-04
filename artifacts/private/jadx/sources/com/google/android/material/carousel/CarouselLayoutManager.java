package com.google.android.material.carousel;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.core.util.t;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class CarouselLayoutManager extends RecyclerView.p implements com.google.android.material.carousel.b, RecyclerView.b0.b {
    private static final String H = "CarouselLayoutManager";
    public static final int I = 0;
    public static final int J = 1;
    public static final int K = 0;
    public static final int L = 1;
    private int A;

    @p0
    private Map<Integer, k> B;
    private com.google.android.material.carousel.e C;
    private final View.OnLayoutChangeListener D;
    private int E;
    private int F;
    private int G;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @l1
    int f111715s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @l1
    int f111716t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @l1
    int f111717u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f111718v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final c f111719w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NonNull
    private g f111720x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @p0
    private l f111721y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @p0
    private k f111722z;

    class a extends androidx.recyclerview.widget.s {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.b0
        @p0
        public PointF a(int i10) {
            return CarouselLayoutManager.this.c(i10);
        }

        @Override // androidx.recyclerview.widget.s
        public int u(View view, int i10) {
            if (CarouselLayoutManager.this.f111721y == null || !CarouselLayoutManager.this.i()) {
                return 0;
            }
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return carouselLayoutManager.E2(carouselLayoutManager.w0(view));
        }

        @Override // androidx.recyclerview.widget.s
        public int v(View view, int i10) {
            if (CarouselLayoutManager.this.f111721y != null && !CarouselLayoutManager.this.i()) {
                CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
                return carouselLayoutManager.E2(carouselLayoutManager.w0(view));
            }
            return 0;
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final View f111724a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final float f111725b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final float f111726c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final d f111727d;

        b(View view, float f10, float f11, d dVar) {
            this.f111724a = view;
            this.f111725b = f10;
            this.f111726c = f11;
            this.f111727d = dVar;
        }
    }

    private static class c extends RecyclerView.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Paint f111728a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<k.c> f111729b;

        c() {
            Paint paint = new Paint();
            this.f111728a = paint;
            this.f111729b = Collections.unmodifiableList(new ArrayList());
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        void f(List<k.c> list) {
            this.f111729b = Collections.unmodifiableList(list);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.c0 c0Var) {
            super.onDrawOver(canvas, recyclerView, c0Var);
            this.f111728a.setStrokeWidth(recyclerView.getResources().getDimension(r6.a.f.D3));
            for (k.c cVar : this.f111729b) {
                this.f111728a.setColor(androidx.core.graphics.h.j(-65281, -16776961, cVar.f111777c));
                if (((CarouselLayoutManager) recyclerView.getLayoutManager()).i()) {
                    canvas.drawLine(cVar.f111776b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).Z2(), cVar.f111776b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).U2(), this.f111728a);
                } else {
                    canvas.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).W2(), cVar.f111776b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).X2(), cVar.f111776b, this.f111728a);
                }
            }
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final k.c f111730a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final k.c f111731b;

        d(k.c cVar, k.c cVar2) {
            t.a(cVar.f111775a <= cVar2.f111775a);
            this.f111730a = cVar;
            this.f111731b = cVar2;
        }
    }

    private static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final int f111732a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int f111733b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f111734c = Integer.MIN_VALUE;

        private e() {
        }
    }

    public CarouselLayoutManager() {
        this(new q());
    }

    private void A2(RecyclerView.x xVar, int i10) {
        float fC2 = C2(i10);
        while (i10 >= 0) {
            b bVarI3 = i3(xVar, fC2, i10);
            if (g3(bVarI3.f111726c, bVarI3.f111727d)) {
                break;
            }
            fC2 = x2(fC2, this.f111722z.f());
            if (!f3(bVarI3.f111726c, bVarI3.f111727d)) {
                v2(bVarI3.f111724a, 0, bVarI3);
            }
            i10--;
        }
    }

    private float B2(View view, float f10, d dVar) {
        k.c cVar = dVar.f111730a;
        float f11 = cVar.f111776b;
        k.c cVar2 = dVar.f111731b;
        float fB = com.google.android.material.animation.b.b(f11, cVar2.f111776b, cVar.f111775a, cVar2.f111775a, f10);
        if (dVar.f111731b != this.f111722z.c() && dVar.f111730a != this.f111722z.j()) {
            return fB;
        }
        float f12 = this.C.f((RecyclerView.q) view.getLayoutParams()) / this.f111722z.f();
        k.c cVar3 = dVar.f111731b;
        return fB + ((f10 - cVar3.f111775a) * ((1.0f - cVar3.f111777c) + f12));
    }

    private float C2(int i10) {
        return w2(Y2() - this.f111715s, this.f111722z.f() * i10);
    }

    private int D2(RecyclerView.c0 c0Var, l lVar) {
        boolean zE3 = e3();
        k kVarL = zE3 ? lVar.l() : lVar.h();
        k.c cVarA = zE3 ? kVarL.a() : kVarL.h();
        int iD = (int) (((((c0Var.d() - 1) * kVarL.f()) * (zE3 ? -1.0f : 1.0f)) - (cVarA.f111775a - Y2())) + (V2() - cVarA.f111775a) + (zE3 ? -cVarA.f111781g : cVarA.f111782h));
        return zE3 ? Math.min(0, iD) : Math.max(0, iD);
    }

    private static int F2(int i10, int i11, int i12, int i13) {
        int i14 = i11 + i10;
        if (i14 < i12) {
            return i12 - i11;
        }
        return i14 > i13 ? i13 - i11 : i10;
    }

    private int G2(@NonNull l lVar) {
        boolean zE3 = e3();
        k kVarH = zE3 ? lVar.h() : lVar.l();
        return (int) (Y2() - x2((zE3 ? kVarH.h() : kVarH.a()).f111775a, kVarH.f() / 2.0f));
    }

    private int H2(int i10) {
        int iT2 = T2();
        if (i10 == 1) {
            return -1;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 17) {
            if (iT2 == 0) {
                return e3() ? 1 : -1;
            }
            return Integer.MIN_VALUE;
        }
        if (i10 == 33) {
            return iT2 == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i10 == 66) {
            if (iT2 == 0) {
                return e3() ? -1 : 1;
            }
            return Integer.MIN_VALUE;
        }
        if (i10 == 130 && iT2 == 1) {
            return 1;
        }
        return Integer.MIN_VALUE;
    }

    private void I2(RecyclerView.x xVar, RecyclerView.c0 c0Var) {
        m3(xVar);
        if (V() == 0) {
            A2(xVar, this.A - 1);
            z2(xVar, c0Var, this.A);
        } else {
            int iW0 = w0(U(0));
            int iW1 = w0(U(V() - 1));
            A2(xVar, iW0 - 1);
            z2(xVar, c0Var, iW1 + 1);
        }
        x3();
    }

    private View J2() {
        return U(e3() ? 0 : V() - 1);
    }

    private View K2() {
        return U(e3() ? V() - 1 : 0);
    }

    private int L2() {
        return i() ? d() : b();
    }

    private float M2(View view) {
        Rect rect = new Rect();
        super.c0(view, rect);
        return i() ? rect.centerX() : rect.centerY();
    }

    private int N2() {
        int i10;
        int i11;
        if (V() <= 0) {
            return 0;
        }
        RecyclerView.q qVar = (RecyclerView.q) U(0).getLayoutParams();
        if (this.C.f111746a == 0) {
            i10 = ((ViewGroup.MarginLayoutParams) qVar).leftMargin;
            i11 = ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        } else {
            i10 = ((ViewGroup.MarginLayoutParams) qVar).topMargin;
            i11 = ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }
        return i10 + i11;
    }

    private k O2(int i10) {
        k kVar;
        Map<Integer, k> map = this.B;
        return (map == null || (kVar = map.get(Integer.valueOf(n1.a.e(i10, 0, Math.max(0, a() + (-1)))))) == null) ? this.f111721y.g() : kVar;
    }

    private int P2() {
        if (Z() || !this.f111720x.f()) {
            return 0;
        }
        return T2() == 1 ? v0() : s0();
    }

    private float Q2(float f10, d dVar) {
        k.c cVar = dVar.f111730a;
        float f11 = cVar.f111778d;
        k.c cVar2 = dVar.f111731b;
        return com.google.android.material.animation.b.b(f11, cVar2.f111778d, cVar.f111776b, cVar2.f111776b, f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int U2() {
        return this.C.h();
    }

    private int V2() {
        return this.C.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int W2() {
        return this.C.j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int X2() {
        return this.C.k();
    }

    private int Y2() {
        return this.C.l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int Z2() {
        return this.C.m();
    }

    private int a3() {
        if (!Z() && this.f111720x.f()) {
            return T2() == 1 ? q0() : t0();
        }
        return 0;
    }

    private int b3(int i10, k kVar) {
        return (int) (e3() ? ((L2() - kVar.h().f111775a) - (i10 * kVar.f())) - (kVar.f() / 2.0f) : ((i10 * kVar.f()) - kVar.a().f111775a) + (kVar.f() / 2.0f));
    }

    private int c3(int i10, @NonNull k kVar) {
        int i11 = Integer.MAX_VALUE;
        for (k.c cVar : kVar.e()) {
            float f10 = (i10 * kVar.f()) + (kVar.f() / 2.0f);
            int iL2 = (e3() ? (int) ((L2() - cVar.f111775a) - f10) : (int) (f10 - cVar.f111775a)) - this.f111715s;
            if (Math.abs(i11) > Math.abs(iL2)) {
                i11 = iL2;
            }
        }
        return i11;
    }

    private static d d3(List<k.c> list, float f10, boolean z10) {
        float f11 = Float.MAX_VALUE;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        float f12 = -3.4028235E38f;
        float f13 = Float.MAX_VALUE;
        float f14 = Float.MAX_VALUE;
        for (int i14 = 0; i14 < list.size(); i14++) {
            k.c cVar = list.get(i14);
            float f15 = z10 ? cVar.f111776b : cVar.f111775a;
            float fAbs = Math.abs(f15 - f10);
            if (f15 <= f10 && fAbs <= f11) {
                i10 = i14;
                f11 = fAbs;
            }
            if (f15 > f10 && fAbs <= f13) {
                i12 = i14;
                f13 = fAbs;
            }
            if (f15 <= f14) {
                i11 = i14;
                f14 = f15;
            }
            if (f15 > f12) {
                i13 = i14;
                f12 = f15;
            }
        }
        if (i10 == -1) {
            i10 = i11;
        }
        if (i12 == -1) {
            i12 = i13;
        }
        return new d(list.get(i10), list.get(i12));
    }

    private boolean f3(float f10, d dVar) {
        float fX2 = x2(f10, Q2(f10, dVar) / 2.0f);
        int i10 = 2 ^ 1;
        if (e3()) {
            return fX2 < 0.0f;
        }
        return fX2 > ((float) L2());
    }

    private boolean g3(float f10, d dVar) {
        float fW2 = w2(f10, Q2(f10, dVar) / 2.0f);
        if (e3()) {
            return fW2 > ((float) L2());
        }
        return fW2 < 0.0f;
    }

    private void h3() {
        if (this.f111718v && Log.isLoggable(H, 3)) {
            for (int i10 = 0; i10 < V(); i10++) {
                View viewU = U(i10);
                M2(viewU);
                w0(viewU);
            }
        }
    }

    private b i3(RecyclerView.x xVar, float f10, int i10) {
        View viewP = xVar.p(i10);
        V0(viewP, 0, 0);
        float fW2 = w2(f10, this.f111722z.f() / 2.0f);
        d dVarD3 = d3(this.f111722z.g(), fW2, false);
        return new b(viewP, fW2, B2(viewP, fW2, dVarD3), dVarD3);
    }

    private float j3(View view, float f10, float f11, Rect rect) {
        float fW2 = w2(f10, f11);
        d dVarD3 = d3(this.f111722z.g(), fW2, false);
        float fB2 = B2(view, fW2, dVarD3);
        super.c0(view, rect);
        u3(view, fW2, dVarD3);
        this.C.p(view, rect, f11, fB2);
        return fB2;
    }

    private void k3(RecyclerView.x xVar) {
        View viewP = xVar.p(0);
        V0(viewP, 0, 0);
        k kVarG = this.f111720x.g(this, viewP);
        if (e3()) {
            kVarG = k.n(kVarG, L2());
        }
        this.f111721y = l.f(this, kVarG, N2(), P2(), a3());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l3() {
        this.f111721y = null;
        R1();
    }

    private void m3(RecyclerView.x xVar) {
        while (V() > 0) {
            View viewU = U(0);
            float fM2 = M2(viewU);
            if (!g3(fM2, d3(this.f111722z.g(), fM2, true))) {
                break;
            } else {
                J1(viewU, xVar);
            }
        }
        while (V() - 1 >= 0) {
            View viewU2 = U(V() - 1);
            float fM3 = M2(viewU2);
            if (!f3(fM3, d3(this.f111722z.g(), fM3, true))) {
                break;
            } else {
                J1(viewU2, xVar);
            }
        }
    }

    private int n3(int i10, RecyclerView.x xVar, RecyclerView.c0 c0Var) {
        if (V() == 0 || i10 == 0) {
            return 0;
        }
        if (this.f111721y == null) {
            k3(xVar);
        }
        int iF2 = F2(i10, this.f111715s, this.f111716t, this.f111717u);
        this.f111715s += iF2;
        v3(this.f111721y);
        float f10 = this.f111722z.f() / 2.0f;
        float fC2 = C2(w0(U(0)));
        Rect rect = new Rect();
        float f11 = e3() ? this.f111722z.h().f111776b : this.f111722z.a().f111776b;
        float f12 = Float.MAX_VALUE;
        for (int i11 = 0; i11 < V(); i11++) {
            View viewU = U(i11);
            float fAbs = Math.abs(f11 - j3(viewU, fC2, f10, rect));
            if (viewU != null && fAbs < f12) {
                this.F = w0(viewU);
                f12 = fAbs;
            }
            fC2 = w2(fC2, this.f111722z.f());
        }
        I2(xVar, c0Var);
        return iF2;
    }

    private void o3(RecyclerView recyclerView, int i10) {
        if (i()) {
            recyclerView.scrollBy(i10, 0);
        } else {
            recyclerView.scrollBy(0, i10);
        }
    }

    public static /* synthetic */ void p2(final CarouselLayoutManager carouselLayoutManager, View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        carouselLayoutManager.getClass();
        if (i10 == i14 && i11 == i15 && i12 == i16 && i13 == i17) {
            return;
        }
        view.post(new Runnable() { // from class: com.google.android.material.carousel.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f111744a.l3();
            }
        });
    }

    private void q3(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r6.a.o.f361629b6);
            p3(typedArrayObtainStyledAttributes.getInt(r6.a.o.f361654c6, 0));
            t3(typedArrayObtainStyledAttributes.getInt(r6.a.o.cs, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void u3(View view, float f10, d dVar) {
        if (view instanceof m) {
            k.c cVar = dVar.f111730a;
            float f11 = cVar.f111777c;
            k.c cVar2 = dVar.f111731b;
            float fB = com.google.android.material.animation.b.b(f11, cVar2.f111777c, cVar.f111775a, cVar2.f111775a, f10);
            float height = view.getHeight();
            float width = view.getWidth();
            RectF rectFG = this.C.g(height, width, com.google.android.material.animation.b.b(0.0f, height / 2.0f, 0.0f, 1.0f, fB), com.google.android.material.animation.b.b(0.0f, width / 2.0f, 0.0f, 1.0f, fB));
            float fB2 = B2(view, f10, dVar);
            RectF rectF = new RectF(fB2 - (rectFG.width() / 2.0f), fB2 - (rectFG.height() / 2.0f), fB2 + (rectFG.width() / 2.0f), (rectFG.height() / 2.0f) + fB2);
            RectF rectF2 = new RectF(W2(), Z2(), X2(), U2());
            if (this.f111720x.f()) {
                this.C.a(rectFG, rectF, rectF2);
            }
            this.C.o(rectFG, rectF, rectF2);
            ((m) view).setMaskRectF(rectFG);
        }
    }

    private void v2(View view, int i10, b bVar) {
        float f10 = this.f111722z.f() / 2.0f;
        k(view, i10);
        float f11 = bVar.f111726c;
        this.C.n(view, (int) (f11 - f10), (int) (f11 + f10));
        u3(view, bVar.f111725b, bVar.f111727d);
    }

    private void v3(@NonNull l lVar) {
        int i10 = this.f111717u;
        int i11 = this.f111716t;
        if (i10 <= i11) {
            this.f111722z = e3() ? lVar.h() : lVar.l();
        } else {
            this.f111722z = lVar.j(this.f111715s, i11, i10);
        }
        this.f111719w.f(this.f111722z.g());
    }

    private float w2(float f10, float f11) {
        return e3() ? f10 - f11 : f10 + f11;
    }

    private void w3() {
        int iA = a();
        int i10 = this.E;
        if (iA == i10 || this.f111721y == null) {
            return;
        }
        if (this.f111720x.j(this, i10)) {
            l3();
        }
        this.E = iA;
    }

    private float x2(float f10, float f11) {
        return e3() ? f10 + f11 : f10 - f11;
    }

    private void x3() {
        if (this.f111718v && V() >= 1) {
            int i10 = 0;
            while (i10 < V() - 1) {
                int iW0 = w0(U(i10));
                int i11 = i10 + 1;
                int iW1 = w0(U(i11));
                if (iW0 > iW1) {
                    h3();
                    throw new IllegalStateException("Detected invalid child order. Child at index [" + i10 + "] had adapter position [" + iW0 + "] and child at index [" + i11 + "] had adapter position [" + iW1 + "].");
                }
                i10 = i11;
            }
        }
    }

    private void y2(@NonNull RecyclerView.x xVar, int i10, int i11) {
        if (i10 >= 0 && i10 < a()) {
            b bVarI3 = i3(xVar, C2(i10), i10);
            v2(bVarI3.f111724a, i11, bVarI3);
        }
    }

    private void z2(RecyclerView.x xVar, RecyclerView.c0 c0Var, int i10) {
        float fC2 = C2(i10);
        while (i10 < c0Var.d()) {
            b bVarI3 = i3(xVar, fC2, i10);
            if (f3(bVarI3.f111726c, bVarI3.f111727d)) {
                return;
            }
            fC2 = w2(fC2, this.f111722z.f());
            if (!g3(bVarI3.f111726c, bVarI3.f111727d)) {
                v2(bVarI3.f111724a, -1, bVarI3);
            }
            i10++;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int A(@NonNull RecyclerView.c0 c0Var) {
        return this.f111717u - this.f111716t;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int B(@NonNull RecyclerView.c0 c0Var) {
        if (V() != 0 && this.f111721y != null && a() > 1) {
            return (int) (j0() * (this.f111721y.g().f() / D(c0Var)));
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int C(@NonNull RecyclerView.c0 c0Var) {
        return this.f111715s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int D(@NonNull RecyclerView.c0 c0Var) {
        return this.f111717u - this.f111716t;
    }

    int E2(int i10) {
        return (int) (this.f111715s - b3(i10, O2(i10)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean J0() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q P() {
        return new RecyclerView.q(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean Q1(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z10, boolean z11) {
        int iC3;
        if (this.f111721y == null || (iC3 = c3(w0(view), O2(w0(view)))) == 0) {
            return false;
        }
        o3(recyclerView, c3(w0(view), this.f111721y.j(this.f111715s + F2(iC3, this.f111715s, this.f111716t, this.f111717u), this.f111716t, this.f111717u)));
        return true;
    }

    int R2(int i10, @NonNull k kVar) {
        return b3(i10, kVar) - this.f111715s;
    }

    int S2(int i10, boolean z10) {
        int iR2 = R2(i10, this.f111721y.k(this.f111715s, this.f111716t, this.f111717u, true));
        int iR3 = this.B != null ? R2(i10, O2(i10)) : iR2;
        return (!z10 || Math.abs(iR3) >= Math.abs(iR2)) ? iR2 : iR3;
    }

    public int T2() {
        return this.C.f111746a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int U1(int i10, RecyclerView.x xVar, RecyclerView.c0 c0Var) {
        if (s()) {
            return n3(i10, xVar, c0Var);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void V0(@NonNull View view, int i10, int i11) {
        if (!(view instanceof m)) {
            throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        }
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        Rect rect = new Rect();
        r(view, rect);
        int i12 = i10 + rect.left + rect.right;
        int i13 = i11 + rect.top + rect.bottom;
        l lVar = this.f111721y;
        float f10 = (lVar == null || this.C.f111746a != 0) ? ((ViewGroup.MarginLayoutParams) qVar).width : lVar.g().f();
        l lVar2 = this.f111721y;
        view.measure(RecyclerView.p.W(D0(), E0(), s0() + t0() + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin + i12, (int) f10, s()), RecyclerView.p.W(j0(), k0(), v0() + q0() + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin + i13, (int) ((lVar2 == null || this.C.f111746a != 1) ? ((ViewGroup.MarginLayoutParams) qVar).height : lVar2.g().f()), t()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void V1(int i10) {
        this.F = i10;
        if (this.f111721y == null) {
            return;
        }
        this.f111715s = b3(i10, O2(i10));
        this.A = n1.a.e(i10, 0, Math.max(0, a() - 1));
        v3(this.f111721y);
        R1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int W1(int i10, RecyclerView.x xVar, RecyclerView.c0 c0Var) {
        if (t()) {
            return n3(i10, xVar, c0Var);
        }
        return 0;
    }

    @Override // com.google.android.material.carousel.b
    public int b() {
        return j0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void b1(RecyclerView recyclerView) {
        super.b1(recyclerView);
        this.f111720x.e(recyclerView.getContext());
        l3();
        recyclerView.addOnLayoutChangeListener(this.D);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.b0.b
    @p0
    public PointF c(int i10) {
        if (this.f111721y == null) {
            return null;
        }
        int iR2 = R2(i10, O2(i10));
        return i() ? new PointF(iR2, 0.0f) : new PointF(0.0f, iR2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void c0(@NonNull View view, @NonNull Rect rect) {
        super.c0(view, rect);
        float fCenterY = rect.centerY();
        if (i()) {
            fCenterY = rect.centerX();
        }
        float fQ2 = Q2(fCenterY, d3(this.f111722z.g(), fCenterY, true));
        float fHeight = 0.0f;
        float fWidth = i() ? (rect.width() - fQ2) / 2.0f : 0.0f;
        if (!i()) {
            fHeight = (rect.height() - fQ2) / 2.0f;
        }
        rect.set((int) (rect.left + fWidth), (int) (rect.top + fHeight), (int) (rect.right - fWidth), (int) (rect.bottom - fHeight));
    }

    @Override // com.google.android.material.carousel.b
    public int d() {
        return D0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void d1(RecyclerView recyclerView, RecyclerView.x xVar) {
        super.d1(recyclerView, xVar);
        recyclerView.removeOnLayoutChangeListener(this.D);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @p0
    public View e1(@NonNull View view, int i10, @NonNull RecyclerView.x xVar, @NonNull RecyclerView.c0 c0Var) {
        int iH2;
        if (V() == 0 || (iH2 = H2(i10)) == Integer.MIN_VALUE) {
            return null;
        }
        if (iH2 == -1) {
            if (w0(view) == 0) {
                return null;
            }
            y2(xVar, w0(U(0)) - 1, 0);
            return K2();
        }
        if (w0(view) == a() - 1) {
            return null;
        }
        y2(xVar, w0(U(V() - 1)) + 1, -1);
        return J2();
    }

    boolean e3() {
        return i() && m0() == 1;
    }

    @Override // com.google.android.material.carousel.b
    public int f() {
        return this.G;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void f1(@NonNull AccessibilityEvent accessibilityEvent) {
        super.f1(accessibilityEvent);
        if (V() > 0) {
            accessibilityEvent.setFromIndex(w0(U(0)));
            accessibilityEvent.setToIndex(w0(U(V() - 1)));
        }
    }

    @Override // com.google.android.material.carousel.b
    public boolean i() {
        return this.C.f111746a == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void j2(RecyclerView recyclerView, RecyclerView.c0 c0Var, int i10) {
        a aVar = new a(recyclerView.getContext());
        aVar.q(i10);
        k2(aVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void m1(@NonNull RecyclerView recyclerView, int i10, int i11) {
        super.m1(recyclerView, i10, i11);
        w3();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void p1(@NonNull RecyclerView recyclerView, int i10, int i11) {
        super.p1(recyclerView, i10, i11);
        w3();
    }

    public void p3(int i10) {
        this.G = i10;
        l3();
    }

    public void r3(@NonNull g gVar) {
        this.f111720x = gVar;
        l3();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean s() {
        return i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void s1(RecyclerView.x xVar, RecyclerView.c0 c0Var) {
        if (c0Var.d() <= 0 || L2() <= 0.0f) {
            H1(xVar);
            this.A = 0;
            return;
        }
        boolean zE3 = e3();
        boolean z10 = this.f111721y == null;
        if (z10) {
            k3(xVar);
        }
        int iG2 = G2(this.f111721y);
        int iD2 = D2(c0Var, this.f111721y);
        this.f111716t = zE3 ? iD2 : iG2;
        if (zE3) {
            iD2 = iG2;
        }
        this.f111717u = iD2;
        if (z10) {
            this.f111715s = iG2;
            this.B = this.f111721y.i(a(), this.f111716t, this.f111717u, e3());
            int i10 = this.F;
            if (i10 != -1) {
                this.f111715s = b3(i10, O2(i10));
            }
        }
        int i11 = this.f111715s;
        this.f111715s = i11 + F2(0, i11, this.f111716t, this.f111717u);
        this.A = n1.a.e(this.A, 0, c0Var.d());
        v3(this.f111721y);
        E(xVar);
        I2(xVar, c0Var);
        this.E = a();
    }

    @b1({b1.a.LIBRARY_GROUP})
    public void s3(@NonNull RecyclerView recyclerView, boolean z10) {
        this.f111718v = z10;
        recyclerView.y1(this.f111719w);
        if (z10) {
            recyclerView.n(this.f111719w);
        }
        recyclerView.O0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean t() {
        return !i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void t1(RecyclerView.c0 c0Var) {
        super.t1(c0Var);
        if (V() == 0) {
            this.A = 0;
        } else {
            this.A = w0(U(0));
        }
        x3();
    }

    public void t3(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i10);
        }
        n(null);
        com.google.android.material.carousel.e eVar = this.C;
        if (eVar == null || i10 != eVar.f111746a) {
            this.C = com.google.android.material.carousel.e.c(this, i10);
            l3();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int y(@NonNull RecyclerView.c0 c0Var) {
        if (V() != 0 && this.f111721y != null && a() > 1) {
            return (int) (D0() * (this.f111721y.g().f() / A(c0Var)));
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int z(@NonNull RecyclerView.c0 c0Var) {
        return this.f111715s;
    }

    public CarouselLayoutManager(@NonNull g gVar) {
        this(gVar, 0);
    }

    public CarouselLayoutManager(@NonNull g gVar, int i10) {
        this.f111718v = false;
        this.f111719w = new c();
        this.A = 0;
        this.D = new View.OnLayoutChangeListener() { // from class: com.google.android.material.carousel.d
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                CarouselLayoutManager.p2(this.f111745a, view, i11, i12, i13, i14, i15, i16, i17, i18);
            }
        };
        this.F = -1;
        this.G = 0;
        r3(gVar);
        t3(i10);
    }

    @e.a({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f111718v = false;
        this.f111719w = new c();
        this.A = 0;
        this.D = new View.OnLayoutChangeListener() { // from class: com.google.android.material.carousel.d
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                CarouselLayoutManager.p2(this.f111745a, view, i12, i13, i14, i15, i16, i17, i18, i19);
            }
        };
        this.F = -1;
        this.G = 0;
        r3(new q());
        q3(context, attributeSet);
    }
}
