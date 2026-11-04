package androidx.recyclerview.widget;

import android.view.View;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes3.dex */
class k0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int f74365c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int f74366d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int f74367e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final int f74368f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final int f74369g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final int f74370h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final int f74371i = 4;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final int f74372j = 4;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final int f74373k = 16;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final int f74374l = 32;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final int f74375m = 64;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final int f74376n = 8;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final int f74377o = 256;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static final int f74378p = 512;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static final int f74379q = 1024;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    static final int f74380r = 12;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    static final int f74381s = 4096;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final int f74382t = 8192;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    static final int f74383u = 16384;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    static final int f74384v = 7;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final b f74385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    a f74386b = new a();

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f74387a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f74388b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f74389c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f74390d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f74391e;

        a() {
        }

        void a(int i10) {
            this.f74387a = i10 | this.f74387a;
        }

        boolean b() {
            int i10 = this.f74387a;
            if ((i10 & 7) != 0 && (i10 & c(this.f74390d, this.f74388b)) == 0) {
                return false;
            }
            int i11 = this.f74387a;
            if ((i11 & com.planner5d.library.engine.input.f.b.B) != 0 && (i11 & (c(this.f74390d, this.f74389c) << 4)) == 0) {
                return false;
            }
            int i12 = this.f74387a;
            if ((i12 & 1792) != 0 && (i12 & (c(this.f74391e, this.f74388b) << 8)) == 0) {
                return false;
            }
            int i13 = this.f74387a;
            return (i13 & 28672) == 0 || ((c(this.f74391e, this.f74389c) << 12) & i13) != 0;
        }

        int c(int i10, int i11) {
            if (i10 > i11) {
                return 1;
            }
            return i10 == i11 ? 2 : 4;
        }

        void d() {
            this.f74387a = 0;
        }

        void e(int i10, int i11, int i12, int i13) {
            this.f74388b = i10;
            this.f74389c = i11;
            this.f74390d = i12;
            this.f74391e = i13;
        }
    }

    interface b {
        View a(int i10);

        int b();

        int c();

        int d(View view);

        int e(View view);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    k0(b bVar) {
        this.f74385a = bVar;
    }

    View a(int i10, int i11, int i12, int i13) {
        int iB = this.f74385a.b();
        int iC = this.f74385a.c();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        while (i10 != i11) {
            View viewA = this.f74385a.a(i10);
            this.f74386b.e(iB, iC, this.f74385a.d(viewA), this.f74385a.e(viewA));
            if (i12 != 0) {
                this.f74386b.d();
                this.f74386b.a(i12);
                if (this.f74386b.b()) {
                    return viewA;
                }
            }
            if (i13 != 0) {
                this.f74386b.d();
                this.f74386b.a(i13);
                if (this.f74386b.b()) {
                    view = viewA;
                }
            }
            i10 += i14;
        }
        return view;
    }

    boolean b(View view, int i10) {
        this.f74386b.e(this.f74385a.b(), this.f74385a.c(), this.f74385a.d(view), this.f74385a.e(view));
        if (i10 == 0) {
            return false;
        }
        this.f74386b.d();
        this.f74386b.a(i10);
        return this.f74386b.b();
    }
}
