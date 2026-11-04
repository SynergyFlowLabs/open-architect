package androidx.recyclerview.widget;

import androidx.annotation.p0;
import androidx.core.os.q0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
final class n implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final ThreadLocal<n> f74453e = new ThreadLocal<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static Comparator<c> f74454f = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    long f74456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    long f74457c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ArrayList<RecyclerView> f74455a = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ArrayList<c> f74458d = new ArrayList<>();

    class a implements Comparator<c> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            RecyclerView recyclerView = cVar.f74466d;
            if ((recyclerView == null) != (cVar2.f74466d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z10 = cVar.f74463a;
            if (z10 != cVar2.f74463a) {
                return z10 ? -1 : 1;
            }
            int i10 = cVar2.f74464b - cVar.f74464b;
            if (i10 != 0) {
                return i10;
            }
            int i11 = cVar.f74465c - cVar2.f74465c;
            if (i11 != 0) {
                return i11;
            }
            return 0;
        }
    }

    @e.a({"VisibleForTests"})
    static class b implements RecyclerView.p.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f74459a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f74460b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int[] f74461c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f74462d;

        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p.c
        public void a(int i10, int i11) {
            if (i10 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i11 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i12 = this.f74462d;
            int i13 = i12 * 2;
            int[] iArr = this.f74461c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f74461c = iArr2;
                int i14 = 3 | (-1);
                Arrays.fill(iArr2, -1);
            } else if (i13 >= iArr.length) {
                int[] iArr3 = new int[i12 * 4];
                this.f74461c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f74461c;
            iArr4[i13] = i10;
            iArr4[i13 + 1] = i11;
            this.f74462d++;
        }

        void b() {
            int[] iArr = this.f74461c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f74462d = 0;
        }

        void c(RecyclerView recyclerView, boolean z10) {
            this.f74462d = 0;
            int[] iArr = this.f74461c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.p pVar = recyclerView.f73926n;
            if (recyclerView.f73924m == null || pVar == null || !pVar.M0()) {
                return;
            }
            if (z10) {
                if (!recyclerView.f73905e.q()) {
                    pVar.x(recyclerView.f73924m.getItemCount(), this);
                }
            } else if (!recyclerView.H0()) {
                pVar.w(this.f74459a, this.f74460b, recyclerView.P3, this);
            }
            int i10 = this.f74462d;
            if (i10 > pVar.f74035m) {
                pVar.f74035m = i10;
                pVar.f74036n = z10;
                recyclerView.f73901c.Q();
            }
        }

        boolean d(int i10) {
            if (this.f74461c != null) {
                int i11 = this.f74462d * 2;
                for (int i12 = 0; i12 < i11; i12 += 2) {
                    if (this.f74461c[i12] == i10) {
                        return true;
                    }
                }
            }
            return false;
        }

        void e(int i10, int i11) {
            this.f74459a = i10;
            this.f74460b = i11;
        }
    }

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f74463a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f74464b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f74465c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public RecyclerView f74466d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f74467e;

        c() {
        }

        public void a() {
            this.f74463a = false;
            this.f74464b = 0;
            this.f74465c = 0;
            this.f74466d = null;
            this.f74467e = 0;
        }
    }

    n() {
    }

    private void b() {
        c cVar;
        int size = this.f74455a.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView = this.f74455a.get(i11);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.O3.c(recyclerView, false);
                i10 += recyclerView.O3.f74462d;
            }
        }
        this.f74458d.ensureCapacity(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView recyclerView2 = this.f74455a.get(i13);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.O3;
                int iAbs = Math.abs(bVar.f74459a) + Math.abs(bVar.f74460b);
                for (int i14 = 0; i14 < bVar.f74462d * 2; i14 += 2) {
                    if (i12 >= this.f74458d.size()) {
                        cVar = new c();
                        this.f74458d.add(cVar);
                    } else {
                        cVar = this.f74458d.get(i12);
                    }
                    int[] iArr = bVar.f74461c;
                    int i15 = iArr[i14 + 1];
                    cVar.f74463a = i15 <= iAbs;
                    cVar.f74464b = iAbs;
                    cVar.f74465c = i15;
                    cVar.f74466d = recyclerView2;
                    cVar.f74467e = iArr[i14];
                    i12++;
                }
            }
        }
        Collections.sort(this.f74458d, f74454f);
    }

    private void c(c cVar, long j10) {
        RecyclerView.g0 g0VarI = i(cVar.f74466d, cVar.f74467e, cVar.f74463a ? Long.MAX_VALUE : j10);
        if (g0VarI != null && g0VarI.mNestedRecyclerView != null && g0VarI.isBound() && !g0VarI.isInvalid()) {
            h(g0VarI.mNestedRecyclerView.get(), j10);
        }
    }

    private void d(long j10) {
        for (int i10 = 0; i10 < this.f74458d.size(); i10++) {
            c cVar = this.f74458d.get(i10);
            if (cVar.f74466d == null) {
                break;
            }
            c(cVar, j10);
            cVar.a();
        }
    }

    static boolean e(RecyclerView recyclerView, int i10) {
        int iJ = recyclerView.f73907f.j();
        for (int i11 = 0; i11 < iJ; i11++) {
            RecyclerView.g0 g0VarX0 = RecyclerView.x0(recyclerView.f73907f.i(i11));
            if (g0VarX0.mPosition == i10 && !g0VarX0.isInvalid()) {
                return true;
            }
        }
        return false;
    }

    private void h(@p0 RecyclerView recyclerView, long j10) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.f73929o3 && recyclerView.f73907f.j() != 0) {
            recyclerView.w1();
        }
        b bVar = recyclerView.O3;
        bVar.c(recyclerView, true);
        if (bVar.f74462d != 0) {
            try {
                q0.b("RV Nested Prefetch");
                recyclerView.P3.k(recyclerView.f73924m);
                for (int i10 = 0; i10 < bVar.f74462d * 2; i10 += 2) {
                    i(recyclerView, bVar.f74461c[i10], j10);
                }
                q0.d();
            } catch (Throwable th2) {
                q0.d();
                throw th2;
            }
        }
    }

    private RecyclerView.g0 i(RecyclerView recyclerView, int i10, long j10) {
        if (e(recyclerView, i10)) {
            return null;
        }
        RecyclerView.x xVar = recyclerView.f73901c;
        try {
            recyclerView.g1();
            RecyclerView.g0 g0VarO = xVar.O(i10, false, j10);
            if (g0VarO != null) {
                if (!g0VarO.isBound() || g0VarO.isInvalid()) {
                    xVar.a(g0VarO, false);
                } else {
                    xVar.H(g0VarO.itemView);
                }
            }
            return g0VarO;
        } finally {
            recyclerView.i1(false);
        }
    }

    public void a(RecyclerView recyclerView) {
        this.f74455a.add(recyclerView);
    }

    void f(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.isAttachedToWindow() && this.f74456b == 0) {
            this.f74456b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.O3.e(i10, i11);
    }

    void g(long j10) {
        b();
        d(j10);
    }

    public void j(RecyclerView recyclerView) {
        this.f74455a.remove(recyclerView);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            q0.b("RV Prefetch");
            if (!this.f74455a.isEmpty()) {
                int size = this.f74455a.size();
                long jMax = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    RecyclerView recyclerView = this.f74455a.get(i10);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    g(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f74457c);
                }
            }
        } finally {
            this.f74456b = 0L;
            q0.d();
        }
    }
}
