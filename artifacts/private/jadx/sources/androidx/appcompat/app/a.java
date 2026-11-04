package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SpinnerAdapter;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.f1;
import androidx.annotation.p0;
import androidx.fragment.app.t0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final int f10267a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final int f10268b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final int f10269c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f10270d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f10271e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f10272f = 4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f10273g = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f10274h = 16;

    /* JADX INFO: renamed from: androidx.appcompat.app.a$a, reason: collision with other inner class name */
    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public @interface InterfaceC0029a {
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public @interface c {
    }

    public interface d {
        void onMenuVisibilityChanged(boolean z10);
    }

    @Deprecated
    public interface e {
        boolean onNavigationItemSelected(int i10, long j10);
    }

    @Deprecated
    public static abstract class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f10276a = -1;

        public abstract CharSequence a();

        public abstract View b();

        public abstract Drawable c();

        public abstract int d();

        public abstract Object e();

        public abstract CharSequence f();

        public abstract void g();

        public abstract f h(@f1 int i10);

        public abstract f i(CharSequence charSequence);

        public abstract f j(int i10);

        public abstract f k(View view);

        public abstract f l(@androidx.annotation.v int i10);

        public abstract f m(Drawable drawable);

        public abstract f n(g gVar);

        public abstract f o(Object obj);

        public abstract f p(int i10);

        public abstract f q(CharSequence charSequence);
    }

    @Deprecated
    public interface g {
        void a(f fVar, t0 t0Var);

        void b(f fVar, t0 t0Var);

        void c(f fVar, t0 t0Var);
    }

    @p0
    public abstract CharSequence A();

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void A0(CharSequence charSequence) {
    }

    public abstract void B();

    public abstract void B0();

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public boolean C() {
        return false;
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public androidx.appcompat.view.b C0(androidx.appcompat.view.b.a aVar) {
        return null;
    }

    public boolean D() {
        return false;
    }

    public abstract boolean E();

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public boolean F() {
        return false;
    }

    @Deprecated
    public abstract f G();

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void H(Configuration configuration) {
    }

    void I() {
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public boolean J(int i10, KeyEvent keyEvent) {
        return false;
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public boolean K(KeyEvent keyEvent) {
        return false;
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public boolean L() {
        return false;
    }

    @Deprecated
    public abstract void M();

    public abstract void N(d dVar);

    @Deprecated
    public abstract void O(f fVar);

    @Deprecated
    public abstract void P(int i10);

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    boolean Q() {
        return false;
    }

    @Deprecated
    public abstract void R(f fVar);

    public abstract void S(@p0 Drawable drawable);

    public abstract void T(int i10);

    public abstract void U(View view);

    public abstract void V(View view, b bVar);

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void W(boolean z10) {
    }

    public abstract void X(boolean z10);

    public abstract void Y(int i10);

    public abstract void Z(int i10, int i11);

    public abstract void a0(boolean z10);

    public abstract void b0(boolean z10);

    public abstract void c0(boolean z10);

    public abstract void d0(boolean z10);

    public void e0(float f10) {
        if (f10 != 0.0f) {
            throw new UnsupportedOperationException("Setting a non-zero elevation is not supported in this action bar configuration.");
        }
    }

    public abstract void f(d dVar);

    public void f0(int i10) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Setting an explicit action bar hide offset is not supported in this action bar configuration.");
        }
    }

    @Deprecated
    public abstract void g(f fVar);

    public void g0(boolean z10) {
        if (z10) {
            throw new UnsupportedOperationException("Hide on content scroll is not supported in this action bar configuration.");
        }
    }

    @Deprecated
    public abstract void h(f fVar, int i10);

    public void h0(@f1 int i10) {
    }

    @Deprecated
    public abstract void i(f fVar, int i10, boolean z10);

    public void i0(@p0 CharSequence charSequence) {
    }

    @Deprecated
    public abstract void j(f fVar, boolean z10);

    public void j0(@androidx.annotation.v int i10) {
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public boolean k() {
        return false;
    }

    public void k0(@p0 Drawable drawable) {
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public boolean l() {
        return false;
    }

    public void l0(boolean z10) {
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void m(boolean z10) {
    }

    public abstract void m0(@androidx.annotation.v int i10);

    public abstract View n();

    public abstract void n0(Drawable drawable);

    public abstract int o();

    @Deprecated
    public abstract void o0(SpinnerAdapter spinnerAdapter, e eVar);

    public float p() {
        return 0.0f;
    }

    public abstract void p0(@androidx.annotation.v int i10);

    public abstract int q();

    public abstract void q0(Drawable drawable);

    public int r() {
        return 0;
    }

    @Deprecated
    public abstract void r0(int i10);

    @Deprecated
    public abstract int s();

    @Deprecated
    public abstract void s0(int i10);

    @Deprecated
    public abstract int t();

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void t0(boolean z10) {
    }

    @Deprecated
    public abstract int u();

    public void u0(Drawable drawable) {
    }

    @p0
    @Deprecated
    public abstract f v();

    public void v0(Drawable drawable) {
    }

    @p0
    public abstract CharSequence w();

    public abstract void w0(int i10);

    @Deprecated
    public abstract f x(int i10);

    public abstract void x0(CharSequence charSequence);

    @Deprecated
    public abstract int y();

    public abstract void y0(@f1 int i10);

    public Context z() {
        return null;
    }

    public abstract void z0(CharSequence charSequence);

    public static class b extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f10275a;

        public b(@NonNull Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f10275a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.a.m.E);
            this.f10275a = typedArrayObtainStyledAttributes.getInt(i.a.m.F, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public b(int i10, int i11) {
            super(i10, i11);
            this.f10275a = 8388627;
        }

        public b(int i10, int i11, int i12) {
            super(i10, i11);
            this.f10275a = i12;
        }

        public b(int i10) {
            this(-2, -1, i10);
        }

        public b(b bVar) {
            super((ViewGroup.MarginLayoutParams) bVar);
            this.f10275a = 0;
            this.f10275a = bVar.f10275a;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f10275a = 0;
        }
    }
}
