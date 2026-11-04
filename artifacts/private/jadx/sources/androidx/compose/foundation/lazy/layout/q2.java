package androidx.compose.foundation.lazy.layout;

import android.os.Trace;
import androidx.compose.runtime.t5;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@androidx.compose.foundation.b2
public final class q2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f17538f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final i0 f17539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.layout.a3 f17540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final u2 f17541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f17542d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f17543e;

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.foundation.b2
    @SourceDebugExtension({"SMAP\nLazyLayoutPrefetchState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPrefetchState.kt\nandroidx/compose/foundation/lazy/layout/PrefetchHandleProvider$HandleAndRequestImpl\n+ 2 AndroidTrace.android.kt\nandroidx/compose/ui/util/AndroidTrace_androidKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,982:1\n27#2,5:983\n27#2,5:988\n27#2,5:993\n27#2,5:998\n27#2,5:1003\n27#2,5:1008\n97#3,4:1013\n97#3,4:1018\n97#3,4:1022\n109#3,5:1026\n109#3,5:1031\n1#4:1017\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPrefetchState.kt\nandroidx/compose/foundation/lazy/layout/PrefetchHandleProvider$HandleAndRequestImpl\n*L\n605#1:983,5\n654#1:988,5\n660#1:993,5\n674#1:998,5\n687#1:1003,5\n718#1:1008,5\n795#1:1013,4\n810#1:1018,4\n814#1:1022,4\n817#1:1026,5\n827#1:1031,5\n*E\n"})
    final class a implements i1.b, s2, i1.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f17544a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final r2 f17545b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private final w2 f17546c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        private final Function1<i1.c, Unit> f17547d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        private androidx.compose.ui.unit.b f17548e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        private androidx.compose.ui.layout.a3.b f17549f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        private androidx.compose.ui.layout.a3.a f17550g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f17551h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f17552i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f17553j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @Nullable
        private Object f17554k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f17555l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @Nullable
        private C0112a f17556m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f17557n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private long f17558o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private long f17559p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private long f17560q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private boolean f17561r;

        /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.q2$a$a, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nLazyLayoutPrefetchState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPrefetchState.kt\nandroidx/compose/foundation/lazy/layout/PrefetchHandleProvider$HandleAndRequestImpl$NestedPrefetchController\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 3 AndroidTrace.android.kt\nandroidx/compose/ui/util/AndroidTrace_androidKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,982:1\n97#2,4:983\n51#2,4:987\n27#3,3:991\n31#3:999\n27#3,5:1000\n35#4,5:994\n35#4,5:1005\n35#4,5:1010\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPrefetchState.kt\nandroidx/compose/foundation/lazy/layout/PrefetchHandleProvider$HandleAndRequestImpl$NestedPrefetchController\n*L\n857#1:983,4\n869#1:987,4\n876#1:991,3\n876#1:999\n881#1:1000,5\n877#1:994,5\n924#1:1005,5\n933#1:1010,5\n*E\n"})
        private final class C0112a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            private final List<i1> f17563a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            private final List<s2>[] f17564b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f17565c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f17566d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private boolean f17567e;

            public C0112a(List<i1> list) {
                this.f17563a = list;
                this.f17564b = new List[list.size()];
                if (list.isEmpty()) {
                    androidx.compose.foundation.internal.e.g("NestedPrefetchController shouldn't be created with no states");
                }
            }

            public final int a() {
                List<i1> list = this.f17563a;
                int size = list.size();
                int iMin = Integer.MAX_VALUE;
                for (int i10 = 0; i10 < size; i10++) {
                    iMin = Math.min(iMin, list.get(i10).c());
                }
                if (iMin == Integer.MAX_VALUE) {
                    return 0;
                }
                return iMin;
            }

            public final int b() {
                List<i1> list = this.f17563a;
                int size = list.size();
                int iMin = Integer.MAX_VALUE;
                for (int i10 = 0; i10 < size; i10++) {
                    iMin = Math.min(iMin, list.get(i10).d());
                }
                if (iMin == Integer.MAX_VALUE) {
                    return 0;
                }
                return iMin;
            }

            public final boolean c(@NotNull t2 t2Var, int i10, boolean z10) {
                if (this.f17565c >= this.f17563a.size()) {
                    return false;
                }
                if (a.this.f17552i) {
                    androidx.compose.foundation.internal.e.i("Should not execute nested prefetch on canceled request");
                }
                if (androidx.compose.foundation.s1.f18602g) {
                    Trace.beginSection("compose:lazy:prefetch:update_nested_prefetch_count");
                    try {
                        List<i1> list = this.f17563a;
                        int size = list.size();
                        for (int i11 = 0; i11 < size; i11++) {
                            list.get(i11).u(i10);
                        }
                        Unit unit = Unit.f312394a;
                        Trace.endSection();
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
                Trace.beginSection("compose:lazy:prefetch:nested");
                while (this.f17565c < this.f17563a.size()) {
                    try {
                        if (this.f17564b[this.f17565c] == null) {
                            if (t2Var.a() <= 0) {
                                Trace.endSection();
                                return true;
                            }
                            List<s2>[] listArr = this.f17564b;
                            int i12 = this.f17565c;
                            listArr[i12] = this.f17563a.get(i12).b();
                        }
                        List<s2> list2 = this.f17564b[this.f17565c];
                        Intrinsics.checkNotNull(list2);
                        while (this.f17566d < list2.size()) {
                            s2 s2Var = list2.get(this.f17566d);
                            if (z10) {
                                a aVar = s2Var instanceof a ? (a) s2Var : null;
                                if (aVar != null) {
                                    aVar.c();
                                }
                            }
                            this.f17567e = true;
                            if (s2Var.d(t2Var)) {
                                Trace.endSection();
                                return true;
                            }
                            this.f17566d++;
                        }
                        this.f17566d = 0;
                        this.f17565c++;
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
                Unit unit2 = Unit.f312394a;
                Trace.endSection();
                return false;
            }

            public final boolean d() {
                return this.f17567e;
            }

            public final void e(boolean z10) {
                this.f17567e = z10;
            }
        }

        public /* synthetic */ a(q2 q2Var, int i10, long j10, r2 r2Var, w2 w2Var, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
            this(q2Var, i10, j10, r2Var, w2Var, function1);
        }

        private final void h() {
            androidx.compose.ui.layout.a3.a aVar = this.f17550g;
            if (aVar != null) {
                aVar.cancel();
            }
            this.f17550g = null;
            androidx.compose.ui.layout.a3.b bVar = this.f17549f;
            if (bVar != null) {
                bVar.dispose();
            }
            this.f17549f = null;
            this.f17556m = null;
        }

        private final boolean i(t2 t2Var) {
            androidx.compose.ui.util.a.b("compose:lazy:prefetch:execute:item", getIndex());
            l0 l0VarInvoke = q2.this.f17539a.d().invoke();
            if (!this.f17552i) {
                int iA = l0VarInvoke.a();
                int index = getIndex();
                if (index >= 0 && index < iA) {
                    Object objD = l0VarInvoke.d(getIndex());
                    Object obj = this.f17554k;
                    if (obj != null && !Intrinsics.areEqual(objD, obj)) {
                        h();
                        return false;
                    }
                    Object objF = l0VarInvoke.f(getIndex());
                    c cVarA = this.f17545b.a(objF);
                    boolean zJ = j();
                    p(t2Var.a());
                    if (!j()) {
                        if (androidx.compose.foundation.s1.f18601f) {
                            if (s(this.f17558o, cVarA.i() + cVarA.h())) {
                                Trace.beginSection("compose:lazy:prefetch:compose");
                                try {
                                    n(t2Var, objD, objF, cVarA);
                                    Unit unit = Unit.f312394a;
                                    Trace.endSection();
                                } catch (Throwable th2) {
                                    Trace.endSection();
                                    throw th2;
                                }
                            }
                        } else if (s(this.f17558o, cVarA.e())) {
                            Trace.beginSection("compose:lazy:prefetch:compose");
                            try {
                                l(objD, objF);
                                Unit unit2 = Unit.f312394a;
                                Trace.endSection();
                                t();
                                cVarA.k(this.f17559p);
                            } catch (Throwable th3) {
                                Trace.endSection();
                                throw th3;
                            }
                        }
                        if (!j()) {
                            return true;
                        }
                    }
                    if (this.f17550g != null) {
                        if (!s(this.f17558o, cVarA.d())) {
                            return true;
                        }
                        Trace.beginSection("compose:lazy:prefetch:apply");
                        try {
                            k();
                            Unit unit3 = Unit.f312394a;
                            Trace.endSection();
                            t();
                            cVarA.j(this.f17559p);
                        } catch (Throwable th4) {
                            Trace.endSection();
                            throw th4;
                        }
                    }
                    if (!this.f17555l) {
                        if (this.f17558o <= 0) {
                            return true;
                        }
                        Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                        try {
                            this.f17556m = q();
                            this.f17555l = true;
                            Unit unit4 = Unit.f312394a;
                            Trace.endSection();
                        } catch (Throwable th5) {
                            Trace.endSection();
                            throw th5;
                        }
                    }
                    C0112a c0112a = this.f17556m;
                    if (c0112a != null ? c0112a.c(t2Var, cVarA.g(), this.f17557n) : false) {
                        return true;
                    }
                    C0112a c0112a2 = this.f17556m;
                    if (c0112a2 != null && c0112a2.d()) {
                        t();
                        androidx.compose.ui.util.a.b("compose:lazy:prefetch:execute:item", getIndex());
                        C0112a c0112a3 = this.f17556m;
                        if (c0112a3 != null) {
                            c0112a3.e(false);
                        }
                    }
                    androidx.compose.ui.unit.b bVar = this.f17548e;
                    if (!this.f17551h && bVar != null) {
                        if ((q2.this.g() && !zJ) || !s(this.f17558o, cVarA.f())) {
                            return true;
                        }
                        Trace.beginSection("compose:lazy:prefetch:measure");
                        try {
                            m(bVar.x());
                            Unit unit5 = Unit.f312394a;
                            Trace.endSection();
                            t();
                            cVarA.l(this.f17559p);
                            Function1<i1.c, Unit> function1 = this.f17547d;
                            if (function1 != null) {
                                function1.invoke(this);
                            }
                        } catch (Throwable th6) {
                            Trace.endSection();
                            throw th6;
                        }
                    }
                    C0112a c0112a4 = this.f17556m;
                    if (androidx.compose.foundation.s1.f18602g && this.f17551h && this.f17555l && c0112a4 != null) {
                        int iA2 = c0112a4.a();
                        cVarA.m(iA2);
                        if (c0112a4.b() < iA2) {
                            cVarA.c();
                        }
                    }
                    return false;
                }
            }
            h();
            return false;
        }

        private final boolean j() {
            androidx.compose.ui.layout.a3.a aVar;
            return this.f17553j || ((aVar = this.f17550g) != null && aVar.isComplete());
        }

        private final void k() {
            androidx.compose.ui.layout.a3.a aVar = this.f17550g;
            if (aVar == null) {
                throw new IllegalArgumentException("Nothing to apply!");
            }
            this.f17549f = aVar.apply();
            this.f17550g = null;
            this.f17553j = true;
        }

        private final void l(Object obj, Object obj2) {
            if (!(this.f17549f == null)) {
                androidx.compose.foundation.internal.e.g("Request was already composed!");
            }
            Function2<androidx.compose.runtime.c0, Integer, Unit> function2B = q2.this.f17539a.b(getIndex(), obj, obj2);
            this.f17554k = obj;
            this.f17549f = q2.this.f17540b.j(obj, function2B);
            this.f17553j = true;
        }

        private final void m(long j10) {
            if (this.f17552i) {
                androidx.compose.foundation.internal.e.g("Callers should check whether the request is still valid before calling performMeasure()");
            }
            if (this.f17551h) {
                androidx.compose.foundation.internal.e.g("Request was already measured!");
            }
            this.f17551h = true;
            androidx.compose.ui.layout.a3.b bVar = this.f17549f;
            if (bVar == null) {
                androidx.compose.foundation.internal.e.h("performComposition() must be called before performMeasure()");
                throw new kotlin.a0();
            }
            int iB = bVar.b();
            for (int i10 = 0; i10 < iB; i10++) {
                bVar.d(i10, j10);
            }
        }

        private final void n(t2 t2Var, Object obj, Object obj2, final c cVar) {
            androidx.compose.ui.layout.a3.a aVarD = this.f17550g;
            if (aVarD == null) {
                q2 q2Var = q2.this;
                aVarD = q2Var.f17540b.d(obj, q2Var.f17539a.b(getIndex(), obj, obj2));
                this.f17550g = aVarD;
                this.f17554k = obj;
            }
            this.f17561r = false;
            while (!aVarD.isComplete() && !this.f17561r) {
                aVarD.a(new t5() { // from class: androidx.compose.foundation.lazy.layout.p2
                    @Override // androidx.compose.runtime.t5
                    public final boolean a() {
                        return q2.a.o(this.f17525a, cVar);
                    }
                });
            }
            t();
            if (this.f17561r) {
                cVar.n(this.f17559p);
            } else {
                cVar.o(this.f17559p);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean o(a aVar, c cVar) {
            if (!aVar.f17561r) {
                aVar.t();
                cVar.o(aVar.f17559p);
                aVar.f17561r = !aVar.s(aVar.f17558o, cVar.i() + cVar.h());
            }
            return aVar.f17561r;
        }

        private final void p(long j10) {
            this.f17558o = j10;
            this.f17560q = kotlin.time.p.b.f313434b.b();
            this.f17559p = 0L;
            androidx.compose.ui.util.a.b("compose:lazy:prefetch:available_time_nanos", j10);
        }

        private final C0112a q() {
            androidx.compose.ui.layout.a3.b bVar = this.f17549f;
            if (bVar == null) {
                androidx.compose.foundation.internal.e.h("Should precompose before resolving nested prefetch states");
                throw new kotlin.a0();
            }
            final kotlin.jvm.internal.i1.h hVar = new kotlin.jvm.internal.i1.h();
            bVar.c("androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", new Function1() { // from class: androidx.compose.foundation.lazy.layout.o2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return q2.a.r(hVar, (androidx.compose.ui.node.p2) obj);
                }
            });
            List list = (List) hVar.f312751a;
            if (list != null) {
                return new C0112a(list);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final androidx.compose.ui.node.p2.a.EnumC0311a r(kotlin.jvm.internal.i1.h hVar, androidx.compose.ui.node.p2 p2Var) {
            T tMutableListOf;
            Intrinsics.checkNotNull(p2Var, "null cannot be cast to non-null type androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode");
            i1 i1VarV9 = ((a3) p2Var).v9();
            List list = (List) hVar.f312751a;
            if (list != null) {
                list.add(i1VarV9);
                tMutableListOf = list;
            } else {
                tMutableListOf = CollectionsKt.mutableListOf(i1VarV9);
            }
            hVar.f312751a = tMutableListOf;
            return androidx.compose.ui.node.p2.a.EnumC0311a.SkipSubtreeAndContinueTraversal;
        }

        private final boolean s(long j10, long j11) {
            if (this.f17557n) {
                j11 = 0;
            }
            return j10 > j11;
        }

        private final void t() {
            long jB = kotlin.time.p.b.f313434b.b();
            long jH0 = kotlin.time.c.h0(kotlin.time.p.b.a.t(jB, this.f17560q));
            this.f17559p = jH0;
            long j10 = this.f17558o - jH0;
            this.f17558o = j10;
            this.f17560q = jB;
            androidx.compose.ui.util.a.b("compose:lazy:prefetch:available_time_nanos", j10);
        }

        @Override // androidx.compose.foundation.lazy.layout.i1.c
        public long a(int i10) {
            androidx.compose.ui.layout.a3.b bVar = this.f17549f;
            return bVar != null ? bVar.a(i10) : androidx.compose.ui.unit.u.f42720b.a();
        }

        @Override // androidx.compose.foundation.lazy.layout.i1.c
        public int b() {
            androidx.compose.ui.layout.a3.b bVar = this.f17549f;
            if (bVar != null) {
                return bVar.b();
            }
            return 0;
        }

        @Override // androidx.compose.foundation.lazy.layout.i1.b
        public void c() {
            this.f17557n = true;
        }

        @Override // androidx.compose.foundation.lazy.layout.i1.b
        public void cancel() {
            if (this.f17552i) {
                return;
            }
            this.f17552i = true;
            h();
        }

        @Override // androidx.compose.foundation.lazy.layout.s2
        public boolean d(@NotNull t2 t2Var) {
            boolean zI;
            if (!q2.this.f17542d) {
                return false;
            }
            if (this.f17557n) {
                Trace.beginSection("compose:lazy:prefetch:execute:urgent");
                try {
                    zI = i(t2Var);
                    Trace.endSection();
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            } else {
                zI = i(t2Var);
            }
            androidx.compose.ui.util.a.b("compose:lazy:prefetch:execute:item", -1L);
            return zI;
        }

        @Override // androidx.compose.foundation.lazy.layout.i1.c
        public int getIndex() {
            return this.f17544a;
        }

        @NotNull
        public String toString() {
            return "HandleAndRequestImpl { index = " + getIndex() + ", constraints = " + this.f17548e + ", isComposed = " + j() + ", isMeasured = " + this.f17551h + ", isCanceled = " + this.f17552i + " }";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull int i10, @Nullable r2 r2Var, @Nullable w2 w2Var, Function1<? super i1.c, Unit> function1) {
            this.f17544a = i10;
            this.f17545b = r2Var;
            this.f17546c = w2Var;
            this.f17547d = function1;
            this.f17560q = kotlin.time.p.b.f313434b.b();
        }

        private a(q2 q2Var, int i10, long j10, r2 r2Var, w2 w2Var, Function1<? super i1.c, Unit> function1) {
            this(i10, r2Var, w2Var, function1);
            this.f17548e = androidx.compose.ui.unit.b.a(j10);
        }
    }

    public q2(@NotNull i0 i0Var, @NotNull androidx.compose.ui.layout.a3 a3Var, @NotNull u2 u2Var) {
        this.f17539a = i0Var;
        this.f17540b = a3Var;
        this.f17541c = u2Var;
    }

    @androidx.annotation.l1
    public static /* synthetic */ void h() {
    }

    @NotNull
    public final s2 d(int i10, @NotNull r2 r2Var) {
        u2 u2Var = this.f17541c;
        return new a(i10, r2Var, u2Var instanceof w2 ? (w2) u2Var : null, null);
    }

    @NotNull
    public final s2 e(int i10, long j10, @NotNull r2 r2Var) {
        u2 u2Var = this.f17541c;
        return new a(this, i10, j10, r2Var, u2Var instanceof w2 ? (w2) u2Var : null, null, null);
    }

    public final void f(@NotNull u2 u2Var, @NotNull s2 s2Var, boolean z10) {
        if (!(u2Var instanceof w2)) {
            u2Var.a(s2Var);
        } else if (z10) {
            ((w2) u2Var).b(s2Var);
        } else {
            ((w2) u2Var).c(s2Var);
        }
    }

    public final boolean g() {
        return this.f17543e;
    }

    public final void i() {
        this.f17542d = false;
    }

    @NotNull
    public final i1.b j(int i10, boolean z10, @NotNull r2 r2Var) {
        u2 u2Var = this.f17541c;
        a aVar = new a(i10, r2Var, u2Var instanceof w2 ? (w2) u2Var : null, null);
        f(this.f17541c, aVar, z10);
        androidx.compose.ui.util.a.b("compose:lazy:schedule_prefetch:index", i10);
        return aVar;
    }

    @NotNull
    public final i1.b k(int i10, long j10, @NotNull r2 r2Var, boolean z10, @Nullable Function1<? super i1.c, Unit> function1) {
        u2 u2Var = this.f17541c;
        a aVar = new a(this, i10, j10, r2Var, u2Var instanceof w2 ? (w2) u2Var : null, function1, null);
        f(this.f17541c, aVar, z10);
        androidx.compose.ui.util.a.b("compose:lazy:schedule_prefetch:index", i10);
        return aVar;
    }

    public final void l(boolean z10) {
        this.f17543e = z10;
    }
}
