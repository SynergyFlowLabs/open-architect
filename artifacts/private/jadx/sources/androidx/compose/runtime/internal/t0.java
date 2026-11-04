package androidx.compose.runtime.internal;

import androidx.collection.b3;
import androidx.collection.c3;
import androidx.collection.d3;
import androidx.collection.k2;
import androidx.collection.l2;
import androidx.compose.runtime.l5;
import androidx.compose.runtime.m5;
import androidx.compose.runtime.m7;
import androidx.compose.runtime.n5;
import androidx.compose.runtime.s4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nRememberEventDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RememberEventDispatcher.kt\nandroidx/compose/runtime/internal/RememberEventDispatcher\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Trace.kt\nandroidx/compose/runtime/internal/TraceKt\n*L\n1#1,293:1\n287#1,4:315\n291#1:320\n287#1,4:333\n291#1:338\n1107#2:294\n1085#2,2:295\n1107#2:297\n1085#2,2:298\n1107#2:300\n1085#2,2:301\n4802#3,4:303\n643#4,2:307\n519#4:310\n472#4:314\n519#4:322\n424#4,5:328\n429#4,3:339\n519#4:342\n424#4,8:346\n424#4,8:360\n1#5:309\n1#5:319\n1#5:337\n45#6,3:311\n49#6:321\n45#6,5:323\n45#6,3:343\n49#6:354\n45#6,5:355\n*S KotlinDebug\n*F\n+ 1 RememberEventDispatcher.kt\nandroidx/compose/runtime/internal/RememberEventDispatcher\n*L\n204#1:315,4\n204#1:320\n253#1:333,4\n253#1:338\n64#1:294\n64#1:295,2\n67#1:297\n67#1:298,2\n68#1:300\n68#1:301,2\n131#1:303,4\n146#1:307,2\n199#1:310\n203#1:314\n224#1:322\n250#1:328,5\n250#1:339,3\n258#1:342\n260#1:346,8\n120#1:360,8\n204#1:319\n253#1:337\n200#1:311,3\n200#1:321\n225#1:323,5\n259#1:343,3\n259#1:354\n269#1:355,5\n*E\n"})
public final class t0 implements l5 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f36114l = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private Set<m5> f36115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private androidx.compose.runtime.tooling.h f36116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.collection.d<n5> f36117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private l2<n5> f36118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private androidx.compose.runtime.collection.d<n5> f36119e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.collection.d<Object> f36120f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.collection.d<Function0<Unit>> f36121g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private l2<androidx.compose.runtime.x> f36122h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private k2<s4, o0> f36123i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private ArrayList<Object> f36124j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private c3<n5> f36125k;

    public t0() {
        androidx.compose.runtime.collection.d<n5> dVar = new androidx.compose.runtime.collection.d<>(new n5[16], 0);
        this.f36117c = dVar;
        this.f36118d = d3.b();
        this.f36119e = dVar;
        this.f36120f = new androidx.compose.runtime.collection.d<>(new Object[16], 0);
        this.f36121g = new androidx.compose.runtime.collection.d<>(new Function0[16], 0);
    }

    private final void l(androidx.compose.runtime.collection.d<n5> dVar) {
        Set<m5> set = this.f36115a;
        if (set != null) {
            n5[] n5VarArr = dVar.f35552a;
            int iR = dVar.R();
            for (int i10 = 0; i10 < iR; i10++) {
                n5 n5Var = n5VarArr[i10];
                m5 m5VarB = n5Var.b();
                set.remove(m5VarB);
                try {
                    m5VarB.i();
                    Unit unit = Unit.f312394a;
                } catch (Throwable th2) {
                    androidx.compose.runtime.tooling.h hVar = this.f36116b;
                    if (hVar != null) {
                        hVar.a(th2, n5Var);
                    }
                    throw th2;
                }
            }
        }
    }

    private static final boolean p(n5 n5Var, androidx.compose.runtime.collection.d<n5> dVar) {
        n5[] n5VarArr = dVar.f35552a;
        int iR = dVar.R();
        for (int i10 = 0; i10 < iR; i10++) {
            m5 m5VarB = n5VarArr[i10].b();
            if (m5VarB instanceof o0) {
                androidx.compose.runtime.collection.d<n5> dVarA = ((o0) m5VarB).a();
                if (dVarA.n0(n5Var) || p(n5Var, dVarA)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void s(Object obj) {
        this.f36120f.d(obj);
    }

    private final <T> T u(Object obj, Function0<? extends T> function0) {
        try {
            return function0.invoke();
        } catch (Throwable th2) {
            androidx.compose.runtime.tooling.h hVar = this.f36116b;
            if (hVar != null) {
                hVar.a(th2, obj);
            }
            throw th2;
        }
    }

    @Override // androidx.compose.runtime.l5
    public void a(@NotNull Function0<Unit> function0) {
        this.f36121g.d(function0);
    }

    @Override // androidx.compose.runtime.l5
    public void b(@NotNull androidx.compose.runtime.x xVar) {
        s(xVar);
    }

    @Override // androidx.compose.runtime.l5
    public void c(@NotNull s4 s4Var) {
        k2<s4, o0> k2Var = this.f36123i;
        o0 o0VarP = k2Var != null ? k2Var.p(s4Var) : null;
        if (o0VarP != null) {
            ArrayList<Object> arrayListD = this.f36124j;
            if (arrayListD == null) {
                arrayListD = m7.d(null, 1, null);
                this.f36124j = arrayListD;
            }
            m7.n(arrayListD, this.f36119e);
            this.f36119e = o0VarP.a();
        }
    }

    @Override // androidx.compose.runtime.l5
    public void d(@NotNull n5 n5Var) {
        if (this.f36118d.e(n5Var)) {
            this.f36118d.g0(n5Var);
            if (!this.f36119e.n0(n5Var) && !this.f36117c.n0(n5Var)) {
                p(n5Var, this.f36117c);
            }
            Set<m5> set = this.f36115a;
            if (set == null) {
                return;
            } else {
                set.add(n5Var.b());
            }
        }
        c3<n5> c3Var = this.f36125k;
        if (c3Var != null && c3Var.e(n5Var)) {
            return;
        }
        s(n5Var);
    }

    @Override // androidx.compose.runtime.l5
    public void e(@NotNull n5 n5Var) {
        this.f36119e.d(n5Var);
        this.f36118d.C(n5Var);
    }

    @Override // androidx.compose.runtime.l5
    public void f(@NotNull androidx.compose.runtime.x xVar) {
        l2<androidx.compose.runtime.x> l2VarB = this.f36122h;
        if (l2VarB == null) {
            l2VarB = d3.b();
            this.f36122h = l2VarB;
        }
        l2VarB.d0(xVar);
        s(xVar);
    }

    @Override // androidx.compose.runtime.l5
    public void g(@NotNull s4 s4Var) {
        Set<m5> set = this.f36115a;
        if (set == null) {
            return;
        }
        o0 o0Var = new o0(set);
        k2<s4, o0> k2VarU = this.f36123i;
        if (k2VarU == null) {
            k2VarU = b3.u();
            this.f36123i = k2VarU;
        }
        k2VarU.q0(s4Var, o0Var);
        this.f36119e.d(new n5(o0Var, null));
    }

    @Override // androidx.compose.runtime.l5
    public void h(@NotNull s4 s4Var) {
        androidx.compose.runtime.collection.d<n5> dVar;
        k2<s4, o0> k2Var = this.f36123i;
        if (k2Var == null || k2Var.p(s4Var) == null) {
            return;
        }
        ArrayList<Object> arrayList = this.f36124j;
        if (arrayList != null && (dVar = (androidx.compose.runtime.collection.d) m7.m(arrayList)) != null) {
            this.f36119e = dVar;
        }
        k2Var.l0(s4Var);
    }

    public final void i() {
        this.f36115a = null;
        this.f36116b = null;
        this.f36117c.r();
        this.f36118d.L();
        this.f36119e = this.f36117c;
        this.f36120f.r();
        this.f36121g.r();
        this.f36122h = null;
        this.f36123i = null;
        this.f36124j = null;
    }

    public final void j() {
        Set<m5> set = this.f36115a;
        if (set == null || set.isEmpty()) {
            return;
        }
        Object objA = b1.f35891a.a("Compose:abandons");
        try {
            Iterator<m5> it = set.iterator();
            while (it.hasNext()) {
                m5 next = it.next();
                it.remove();
                next.j();
            }
            Unit unit = Unit.f312394a;
            b1 b1Var = b1.f35891a;
        } finally {
            b1.f35891a.b(objA);
        }
    }

    public final void k(@NotNull androidx.compose.runtime.x xVar) {
        if (this.f36120f.n0(xVar)) {
            xVar.g();
        }
    }

    public final void m() {
        Set<m5> set = this.f36115a;
        if (set == null) {
            return;
        }
        this.f36125k = null;
        if (this.f36120f.R() != 0) {
            Object objA = b1.f35891a.a("Compose:onForgotten");
            try {
                l2<androidx.compose.runtime.x> l2Var = this.f36122h;
                for (int iR = this.f36120f.R() - 1; -1 < iR; iR--) {
                    Object obj = this.f36120f.f35552a[iR];
                    try {
                        if (obj instanceof n5) {
                            m5 m5VarB = ((n5) obj).b();
                            set.remove(m5VarB);
                            m5VarB.k();
                        }
                        if (obj instanceof androidx.compose.runtime.x) {
                            if (l2Var == null || !l2Var.e((androidx.compose.runtime.x) obj)) {
                                ((androidx.compose.runtime.x) obj).g();
                            } else {
                                ((androidx.compose.runtime.x) obj).c();
                            }
                        }
                        Unit unit = Unit.f312394a;
                    } catch (Throwable th2) {
                        androidx.compose.runtime.tooling.h hVar = this.f36116b;
                        if (hVar != null) {
                            hVar.a(th2, obj);
                        }
                        throw th2;
                    }
                }
                Unit unit2 = Unit.f312394a;
                b1.f35891a.b(objA);
            } catch (Throwable th3) {
                b1.f35891a.b(objA);
                throw th3;
            }
        }
        if (this.f36117c.R() != 0) {
            Object objA2 = b1.f35891a.a("Compose:onRemembered");
            try {
                l(this.f36117c);
                Unit unit3 = Unit.f312394a;
            } finally {
                b1.f35891a.b(objA2);
            }
        }
    }

    public final void n() {
        if (this.f36121g.R() != 0) {
            Object objA = b1.f35891a.a("Compose:sideeffects");
            try {
                androidx.compose.runtime.collection.d<Function0<Unit>> dVar = this.f36121g;
                Function0<Unit>[] function0Arr = dVar.f35552a;
                int iR = dVar.R();
                for (int i10 = 0; i10 < iR; i10++) {
                    function0Arr[i10].invoke();
                }
                this.f36121g.r();
                Unit unit = Unit.f312394a;
                b1.f35891a.b(objA);
            } catch (Throwable th2) {
                b1.f35891a.b(objA);
                throw th2;
            }
        }
    }

    @Nullable
    public final c3<n5> o() {
        if (!this.f36118d.s()) {
            return null;
        }
        l2<n5> l2Var = this.f36118d;
        this.f36118d = d3.b();
        this.f36117c.r();
        return l2Var;
    }

    public final void q(@NotNull c3<n5> c3Var) {
        this.f36125k = c3Var;
    }

    public final void r(@NotNull Set<m5> set, @Nullable androidx.compose.runtime.tooling.h hVar) {
        i();
        this.f36115a = set;
        this.f36116b = hVar;
    }

    public final void t(@NotNull Set<m5> set, @Nullable androidx.compose.runtime.tooling.h hVar, @NotNull Function1<? super t0, Unit> function1) {
        try {
            r(set, hVar);
            function1.invoke(this);
            kotlin.jvm.internal.h0.d(1);
        } finally {
            kotlin.jvm.internal.h0.d(1);
            i();
            kotlin.jvm.internal.h0.c(1);
        }
    }
}
