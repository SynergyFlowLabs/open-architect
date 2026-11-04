package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.collection.b1;
import androidx.collection.h3;

/* JADX INFO: loaded from: classes3.dex */
class l0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f74399c = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @l1
    final h3<RecyclerView.g0, a> f74400a = new h3<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @l1
    final b1<RecyclerView.g0> f74401b = new b1<>();

    static class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final int f74402d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final int f74403e = 2;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final int f74404f = 4;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final int f74405g = 8;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        static final int f74406h = 3;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        static final int f74407i = 12;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        static final int f74408j = 14;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        static androidx.core.util.s.a<a> f74409k = new androidx.core.util.s.b(20);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f74410a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        RecyclerView.m.d f74411b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @p0
        RecyclerView.m.d f74412c;

        private a() {
        }

        static void a() {
            while (f74409k.acquire() != null) {
            }
        }

        static a b() {
            a aVarAcquire = f74409k.acquire();
            return aVarAcquire == null ? new a() : aVarAcquire;
        }

        static void c(a aVar) {
            aVar.f74410a = 0;
            aVar.f74411b = null;
            aVar.f74412c = null;
            f74409k.a(aVar);
        }
    }

    interface b {
        void a(RecyclerView.g0 g0Var, @p0 RecyclerView.m.d dVar, RecyclerView.m.d dVar2);

        void b(RecyclerView.g0 g0Var);

        void c(RecyclerView.g0 g0Var, @NonNull RecyclerView.m.d dVar, @p0 RecyclerView.m.d dVar2);

        void d(RecyclerView.g0 g0Var, @NonNull RecyclerView.m.d dVar, @NonNull RecyclerView.m.d dVar2);
    }

    l0() {
    }

    private RecyclerView.m.d l(RecyclerView.g0 g0Var, int i10) {
        a aVarK;
        RecyclerView.m.d dVar;
        int iE = this.f74400a.e(g0Var);
        if (iE >= 0 && (aVarK = this.f74400a.k(iE)) != null) {
            int i11 = aVarK.f74410a;
            if ((i11 & i10) != 0) {
                int i12 = (~i10) & i11;
                aVarK.f74410a = i12;
                if (i10 == 4) {
                    dVar = aVarK.f74411b;
                } else {
                    if (i10 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    dVar = aVarK.f74412c;
                }
                if ((i12 & 12) == 0) {
                    this.f74400a.i(iE);
                    a.c(aVarK);
                }
                return dVar;
            }
        }
        return null;
    }

    void a(RecyclerView.g0 g0Var, RecyclerView.m.d dVar) {
        a aVarB = this.f74400a.get(g0Var);
        if (aVarB == null) {
            aVarB = a.b();
            this.f74400a.put(g0Var, aVarB);
        }
        aVarB.f74410a |= 2;
        aVarB.f74411b = dVar;
    }

    void b(RecyclerView.g0 g0Var) {
        a aVarB = this.f74400a.get(g0Var);
        if (aVarB == null) {
            aVarB = a.b();
            this.f74400a.put(g0Var, aVarB);
        }
        aVarB.f74410a |= 1;
    }

    void c(long j10, RecyclerView.g0 g0Var) {
        this.f74401b.n(j10, g0Var);
    }

    void d(RecyclerView.g0 g0Var, RecyclerView.m.d dVar) {
        a aVarB = this.f74400a.get(g0Var);
        if (aVarB == null) {
            aVarB = a.b();
            this.f74400a.put(g0Var, aVarB);
        }
        aVarB.f74412c = dVar;
        aVarB.f74410a |= 8;
    }

    void e(RecyclerView.g0 g0Var, RecyclerView.m.d dVar) {
        a aVarB = this.f74400a.get(g0Var);
        if (aVarB == null) {
            aVarB = a.b();
            this.f74400a.put(g0Var, aVarB);
        }
        aVarB.f74411b = dVar;
        aVarB.f74410a |= 4;
    }

    void f() {
        this.f74400a.clear();
        this.f74401b.b();
    }

    RecyclerView.g0 g(long j10) {
        return this.f74401b.g(j10);
    }

    boolean h(RecyclerView.g0 g0Var) {
        a aVar = this.f74400a.get(g0Var);
        return (aVar == null || (aVar.f74410a & 1) == 0) ? false : true;
    }

    boolean i(RecyclerView.g0 g0Var) {
        a aVar = this.f74400a.get(g0Var);
        return (aVar == null || (aVar.f74410a & 4) == 0) ? false : true;
    }

    void j() {
        a.a();
    }

    public void k(RecyclerView.g0 g0Var) {
        p(g0Var);
    }

    @p0
    RecyclerView.m.d m(RecyclerView.g0 g0Var) {
        return l(g0Var, 8);
    }

    @p0
    RecyclerView.m.d n(RecyclerView.g0 g0Var) {
        return l(g0Var, 4);
    }

    void o(b bVar) {
        for (int size = this.f74400a.size() - 1; size >= 0; size--) {
            RecyclerView.g0 g0VarG = this.f74400a.g(size);
            a aVarI = this.f74400a.i(size);
            int i10 = aVarI.f74410a;
            if ((i10 & 3) == 3) {
                bVar.b(g0VarG);
            } else if ((i10 & 1) != 0) {
                RecyclerView.m.d dVar = aVarI.f74411b;
                if (dVar == null) {
                    bVar.b(g0VarG);
                } else {
                    bVar.c(g0VarG, dVar, aVarI.f74412c);
                }
            } else if ((i10 & 14) == 14) {
                bVar.a(g0VarG, aVarI.f74411b, aVarI.f74412c);
            } else if ((i10 & 12) == 12) {
                bVar.d(g0VarG, aVarI.f74411b, aVarI.f74412c);
            } else if ((i10 & 4) != 0) {
                bVar.c(g0VarG, aVarI.f74411b, null);
            } else if ((i10 & 8) != 0) {
                bVar.a(g0VarG, aVarI.f74411b, aVarI.f74412c);
            }
            a.c(aVarI);
        }
    }

    void p(RecyclerView.g0 g0Var) {
        a aVar = this.f74400a.get(g0Var);
        if (aVar == null) {
            return;
        }
        aVar.f74410a &= -2;
    }

    void q(RecyclerView.g0 g0Var) {
        int size = this.f74401b.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (g0Var == this.f74401b.w(size)) {
                this.f74401b.s(size);
                break;
            }
        }
        a aVarRemove = this.f74400a.remove(g0Var);
        if (aVarRemove != null) {
            a.c(aVarRemove);
        }
    }
}
