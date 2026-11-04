package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
class g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final boolean f74235d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f74236e = "ChildrenHelper";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final b f74237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final a f74238b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final List<View> f74239c = new ArrayList();

    static class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final int f74240c = 64;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final long f74241d = Long.MIN_VALUE;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f74242a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        a f74243b;

        a() {
        }

        private void c() {
            if (this.f74243b == null) {
                this.f74243b = new a();
            }
        }

        void a(int i10) {
            if (i10 < 64) {
                this.f74242a &= ~(1 << i10);
                return;
            }
            a aVar = this.f74243b;
            if (aVar != null) {
                aVar.a(i10 - 64);
            }
        }

        int b(int i10) {
            a aVar = this.f74243b;
            if (aVar == null) {
                if (i10 >= 64) {
                    return Long.bitCount(this.f74242a);
                }
                return Long.bitCount(((1 << i10) - 1) & this.f74242a);
            }
            if (i10 >= 64) {
                return aVar.b(i10 - 64) + Long.bitCount(this.f74242a);
            }
            return Long.bitCount(((1 << i10) - 1) & this.f74242a);
        }

        boolean d(int i10) {
            if (i10 < 64) {
                return ((1 << i10) & this.f74242a) != 0;
            }
            c();
            return this.f74243b.d(i10 - 64);
        }

        void e(int i10, boolean z10) {
            if (i10 >= 64) {
                c();
                this.f74243b.e(i10 - 64, z10);
                return;
            }
            long j10 = this.f74242a;
            boolean z11 = (Long.MIN_VALUE & j10) != 0;
            long j11 = (1 << i10) - 1;
            this.f74242a = ((j10 & (~j11)) << 1) | (j10 & j11);
            if (z10) {
                h(i10);
            } else {
                a(i10);
            }
            if (z11 || this.f74243b != null) {
                c();
                this.f74243b.e(0, z11);
            }
        }

        boolean f(int i10) {
            if (i10 >= 64) {
                c();
                return this.f74243b.f(i10 - 64);
            }
            long j10 = 1 << i10;
            long j11 = this.f74242a;
            boolean z10 = (j11 & j10) != 0;
            long j12 = j11 & (~j10);
            this.f74242a = j12;
            long j13 = j10 - 1;
            this.f74242a = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
            a aVar = this.f74243b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f74243b.f(0);
            }
            return z10;
        }

        void g() {
            this.f74242a = 0L;
            a aVar = this.f74243b;
            if (aVar != null) {
                aVar.g();
            }
        }

        void h(int i10) {
            if (i10 < 64) {
                this.f74242a |= 1 << i10;
            } else {
                c();
                this.f74243b.h(i10 - 64);
            }
        }

        public String toString() {
            if (this.f74243b == null) {
                return Long.toBinaryString(this.f74242a);
            }
            return this.f74243b.toString() + "xx" + Long.toBinaryString(this.f74242a);
        }
    }

    interface b {
        View a(int i10);

        void b(View view);

        int c();

        RecyclerView.g0 d(View view);

        void e(View view, int i10);

        void f();

        void g(View view, int i10, ViewGroup.LayoutParams layoutParams);

        void h(int i10);

        int i(View view);

        void j(View view);

        void k(int i10);
    }

    g(b bVar) {
        this.f74237a = bVar;
    }

    private int h(int i10) {
        if (i10 < 0) {
            return -1;
        }
        int iC = this.f74237a.c();
        int i11 = i10;
        while (i11 < iC) {
            int iB = i10 - (i11 - this.f74238b.b(i11));
            if (iB == 0) {
                while (this.f74238b.d(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += iB;
        }
        return -1;
    }

    private void l(View view) {
        this.f74239c.add(view);
        this.f74237a.b(view);
    }

    private boolean t(View view) {
        if (!this.f74239c.remove(view)) {
            return false;
        }
        this.f74237a.j(view);
        return true;
    }

    void a(View view, int i10, boolean z10) {
        int iC = i10 < 0 ? this.f74237a.c() : h(i10);
        this.f74238b.e(iC, z10);
        if (z10) {
            l(view);
        }
        this.f74237a.e(view, iC);
    }

    void b(View view, boolean z10) {
        a(view, -1, z10);
    }

    void c(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        int iC = i10 < 0 ? this.f74237a.c() : h(i10);
        this.f74238b.e(iC, z10);
        if (z10) {
            l(view);
        }
        this.f74237a.g(view, iC, layoutParams);
    }

    void d(int i10) {
        int iH = h(i10);
        this.f74238b.f(iH);
        this.f74237a.h(iH);
    }

    View e(int i10) {
        int size = this.f74239c.size();
        for (int i11 = 0; i11 < size; i11++) {
            View view = this.f74239c.get(i11);
            RecyclerView.g0 g0VarD = this.f74237a.d(view);
            if (g0VarD.getLayoutPosition() == i10 && !g0VarD.isInvalid() && !g0VarD.isRemoved()) {
                return view;
            }
        }
        return null;
    }

    View f(int i10) {
        return this.f74237a.a(h(i10));
    }

    int g() {
        return this.f74237a.c() - this.f74239c.size();
    }

    View i(int i10) {
        return this.f74237a.a(i10);
    }

    int j() {
        return this.f74237a.c();
    }

    void k(View view) {
        int i10 = this.f74237a.i(view);
        if (i10 >= 0) {
            this.f74238b.h(i10);
            l(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    int m(View view) {
        int i10 = this.f74237a.i(view);
        if (i10 == -1 || this.f74238b.d(i10)) {
            return -1;
        }
        return i10 - this.f74238b.b(i10);
    }

    boolean n(View view) {
        return this.f74239c.contains(view);
    }

    void o() {
        this.f74238b.g();
        for (int size = this.f74239c.size() - 1; size >= 0; size--) {
            this.f74237a.j(this.f74239c.get(size));
            this.f74239c.remove(size);
        }
        this.f74237a.f();
    }

    void p(View view) {
        int i10 = this.f74237a.i(view);
        if (i10 < 0) {
            return;
        }
        if (this.f74238b.f(i10)) {
            t(view);
        }
        this.f74237a.k(i10);
    }

    void q(int i10) {
        int iH = h(i10);
        View viewA = this.f74237a.a(iH);
        if (viewA == null) {
            return;
        }
        if (this.f74238b.f(iH)) {
            t(viewA);
        }
        this.f74237a.k(iH);
    }

    boolean r(View view) {
        int i10 = this.f74237a.i(view);
        if (i10 == -1) {
            t(view);
            return true;
        }
        if (!this.f74238b.d(i10)) {
            return false;
        }
        this.f74238b.f(i10);
        t(view);
        this.f74237a.k(i10);
        return true;
    }

    void s(View view) {
        int i10 = this.f74237a.i(view);
        if (i10 < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        if (this.f74238b.d(i10)) {
            this.f74238b.a(i10);
            t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.f74238b.toString() + ", hidden list:" + this.f74239c.size();
    }
}
