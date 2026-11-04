package androidx.compose.animation;

import androidx.compose.runtime.d7;
import androidx.compose.runtime.n3;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.w6;
import androidx.compose.ui.layout.i2;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nSharedElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedElement.kt\nandroidx/compose/animation/SharedElement\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,418:1\n103#2:419\n35#2,5:420\n104#2:425\n118#2:438\n35#2,5:439\n119#2:444\n103#2:445\n35#2,5:446\n104#2:451\n103#2:452\n35#2,5:453\n104#2:458\n85#3:426\n117#3,2:427\n85#3:429\n117#3,2:430\n85#3:432\n117#3,2:433\n85#3:435\n117#3,2:436\n295#4,2:459\n*S KotlinDebug\n*F\n+ 1 SharedElement.kt\nandroidx/compose/animation/SharedElement\n*L\n43#1:419\n43#1:420,5\n43#1:425\n129#1:438\n129#1:439,5\n129#1:444\n148#1:445\n148#1:446,5\n148#1:451\n233#1:452\n233#1:453,5\n233#1:458\n65#1:426\n65#1:427,2\n77#1:429\n77#1:430,2\n92#1:432\n92#1:433,2\n110#1:435\n110#1:436,2\n244#1:459,2\n*E\n"})
public final class x0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f13776n = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Object f13777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final b1 f13778b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private r f13782f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private r f13783g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f13785i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f13786j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final n3 f13779c = d7.g(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final n3 f13780d = d7.g(null, null, 2, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final n3 f13781e = d7.g(null, null, 2, null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final n3 f13784h = d7.g(0, null, 2, null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final SnapshotStateList<y0> f13787k = w6.g();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final Function1<x0, Unit> f13788l = new b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f13789m = new a();

    static final class a extends kotlin.jvm.internal.l0 implements Function0<Unit> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            x0.this.m();
        }
    }

    static final class b extends kotlin.jvm.internal.l0 implements Function1<x0, Unit> {
        b() {
            super(1);
        }

        public final void c(x0 x0Var) {
            x0.this.A();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(x0 x0Var) {
            c(x0Var);
            return Unit.f312394a;
        }
    }

    public x0(@NotNull Object obj, @NotNull b1 b1Var) {
        this.f13777a = obj;
        this.f13778b = b1Var;
    }

    private final void B() {
        y0 y0Var;
        if (j() != this.f13785i) {
            SnapshotStateList<y0> snapshotStateList = this.f13787k;
            int size = snapshotStateList.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    y0Var = null;
                    break;
                }
                y0Var = snapshotStateList.get(i10);
                if (y0Var.s()) {
                    break;
                } else {
                    i10++;
                }
            }
            y0 y0Var2 = y0Var;
            if (y0Var2 == null) {
                y0Var2 = (y0) CollectionsKt.firstOrNull((List) this.f13787k);
            }
            r rVarE = y0Var2 != null ? y0Var2.e() : null;
            if (!Intrinsics.areEqual(rVarE, this.f13783g)) {
                this.f13782f = this.f13783g;
                v(rVarE);
                this.f13786j = true;
            }
            if (rVarE == null) {
                v(null);
            }
            this.f13785i = j();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int j() {
        return ((Number) this.f13784h.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final o1 l() {
        return (o1) this.f13780d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean m() {
        SnapshotStateList<y0> snapshotStateList = this.f13787k;
        int size = snapshotStateList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (snapshotStateList.get(i10).d().f()) {
                int i11 = 7 >> 1;
                return true;
            }
        }
        return false;
    }

    private final n0.j p() {
        if (this.f13782f != null) {
            SnapshotStateList<y0> snapshotStateList = this.f13787k;
            int size = snapshotStateList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (Intrinsics.areEqual(snapshotStateList.get(i10).e(), this.f13782f)) {
                    r rVar = this.f13782f;
                    if (rVar != null) {
                        return rVar.D7();
                    }
                    return null;
                }
            }
        }
        return null;
    }

    private final void u(boolean z10) {
        this.f13779c.setValue(Boolean.valueOf(z10));
    }

    private final void v(r rVar) {
        if (!Intrinsics.areEqual(this.f13783g, rVar)) {
            this.f13782f = this.f13783g;
        }
        this.f13783g = rVar;
    }

    private final void w(int i10) {
        this.f13784h.setValue(Integer.valueOf(i10));
    }

    private final void y(o1 o1Var) {
        this.f13780d.setValue(o1Var);
    }

    public final void A() {
        boolean zM = m();
        if (this.f13787k.size() > 1 && zM) {
            u(true);
        } else if (!this.f13778b.I() || !zM) {
            u(false);
        }
        if (!this.f13787k.isEmpty()) {
            this.f13778b.p(this, this.f13788l, this.f13789m);
        }
        n();
    }

    public final void b(@NotNull y0 y0Var) {
        this.f13787k.add(y0Var);
        this.f13778b.p(this, this.f13788l, this.f13789m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final n0.j c() {
        return (n0.j) this.f13781e.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean d() {
        return ((Boolean) this.f13779c.getValue()).booleanValue();
    }

    @NotNull
    public final Object e() {
        return this.f13777a;
    }

    @Nullable
    public final r f() {
        return this.f13782f;
    }

    @NotNull
    public final b1 g() {
        return this.f13778b;
    }

    @NotNull
    public final SnapshotStateList<y0> h() {
        return this.f13787k;
    }

    @Nullable
    public final r i() {
        return this.f13783g;
    }

    @Nullable
    public final o1 k() {
        if (d()) {
            return l();
        }
        return null;
    }

    public final void n() {
        y0 next;
        Iterator<y0> it = this.f13787k.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!next.s());
        y0 y0Var = next;
        if (y0Var == null && this.f13783g == null) {
            return;
        }
        if (Intrinsics.areEqual(y0Var != null ? y0Var.e() : null, this.f13783g)) {
            return;
        }
        w(this.f13785i + 1);
    }

    public final boolean o() {
        SnapshotStateList<y0> snapshotStateList = this.f13787k;
        int size = snapshotStateList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (snapshotStateList.get(i10).d().j()) {
                if (d()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void q(@NotNull i2.a aVar, @NotNull y0 y0Var) {
        androidx.compose.ui.layout.g0 g0VarN;
        long j10;
        long j11;
        B();
        if (d() && y0Var.d().f() && (g0VarN = aVar.n()) != null) {
            long jH = androidx.compose.ui.unit.v.h(g0VarN.a());
            long jZ = androidx.compose.ui.layout.w0.Z(y0Var.o().f13778b, y0Var.o().f13778b.k(), g0VarN, 0L, false, 6, null);
            b1 b1Var = y0Var.o().f13778b;
            long jA0 = androidx.compose.ui.layout.g0.A0(y0Var.o().f13778b.k(), g0VarN, 0L, false, 2, null);
            o1 o1VarK = k();
            if (o1VarK == null) {
                j10 = jH;
                j11 = jA0;
                o1VarK = new o1(j10, n0.g.v(jZ, jA0), j11, null);
            } else {
                j10 = jH;
                j11 = jA0;
            }
            if (!n0.g.l(o1VarK.d(), j11) || !n0.n.k(o1VarK.c(), j10) || this.f13786j) {
                o1VarK.g(j10);
                o1VarK.h(j11);
                if (this.f13786j) {
                    o1VarK.f(n0.g.v(n0.g.v(jZ, j11), n0.g.v(o1VarK.a(), o1VarK.b())));
                }
                if (c() == null) {
                    n0.j jVarP = p();
                    if (jVarP == null) {
                        jVarP = n0.k.c(jZ, j10);
                    }
                    t(jVarP);
                }
            }
            o1VarK.e(n0.g.v(jZ, j11));
            x(o1VarK);
            this.f13786j = false;
        }
    }

    public final void r() {
        u(this.f13787k.size() > 1 && m());
        this.f13782f = null;
        y(null);
    }

    public final void s(@NotNull y0 y0Var) {
        this.f13787k.remove(y0Var);
        if (!this.f13787k.isEmpty()) {
            this.f13778b.p(this, this.f13788l, this.f13789m);
        } else {
            A();
            this.f13778b.g(this);
        }
    }

    public final void t(@Nullable n0.j jVar) {
        this.f13781e.setValue(jVar);
    }

    public final void x(@Nullable o1 o1Var) {
        if (d()) {
            y(o1Var);
        }
    }

    @Nullable
    public final n0.j z() {
        if (!d()) {
            return null;
        }
        B();
        if (c() == null) {
            t(p());
        }
        return c();
    }
}
