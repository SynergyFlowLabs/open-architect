package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.d7;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nSelectionRegistrarImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionRegistrarImpl.kt\nandroidx/compose/foundation/text/selection/SelectionRegistrarImpl\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,217:1\n85#2:218\n117#2,2:219\n97#3,4:221\n97#3,4:225\n69#4:229\n65#4:232\n69#4:235\n70#5:230\n60#5:233\n70#5:236\n22#6:231\n22#6:234\n22#6:237\n*S KotlinDebug\n*F\n+ 1 SelectionRegistrarImpl.kt\nandroidx/compose/foundation/text/selection/SelectionRegistrarImpl\n*L\n100#1:218\n100#1:219,2\n103#1:221,4\n106#1:225,4\n155#1:229\n156#1:232\n158#1:235\n155#1:230\n156#1:233\n158#1:236\n155#1:231\n156#1:234\n158#1:237\n*E\n"})
public final class i3 implements d3 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public static final a f21160o = new a(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f21161p = 8;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.runtime.saveable.c0<i3, Long> f21162q = androidx.compose.runtime.saveable.f0.e(new Function2() { // from class: androidx.compose.foundation.text.selection.e3
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return i3.o((androidx.compose.runtime.saveable.g0) obj, (i3) obj2);
        }
    }, new Function1() { // from class: androidx.compose.foundation.text.selection.f3
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return i3.p(((Long) obj).longValue());
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f21163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final List<e0> f21164d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final androidx.collection.a2<e0> f21165e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private AtomicLong f21166f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private Function1<? super Long, Unit> f21167g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private pj.o<? super Boolean, ? super androidx.compose.ui.layout.g0, ? super n0.g, ? super n0, Unit> f21168h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private Function2<? super Boolean, ? super Long, Unit> f21169i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private pj.q<? super Boolean, ? super androidx.compose.ui.layout.g0, ? super n0.g, ? super n0.g, ? super Boolean, ? super n0, Boolean> f21170j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private Function0<Unit> f21171k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private Function1<? super Long, Unit> f21172l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    private Function1<? super Long, Unit> f21173m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f21174n;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final androidx.compose.runtime.saveable.c0<i3, Long> a() {
            return i3.f21162q;
        }

        private a() {
        }
    }

    private i3(long j10) {
        this.f21164d = new ArrayList();
        this.f21165e = androidx.collection.y0.j();
        this.f21166f = new AtomicLong(j10);
        this.f21174n = d7.g(androidx.collection.y0.c(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int L(androidx.compose.ui.layout.g0 g0Var, e0 e0Var, e0 e0Var2) {
        androidx.compose.ui.layout.g0 g0VarM = e0Var.M();
        androidx.compose.ui.layout.g0 g0VarM2 = e0Var2.M();
        long jR0 = g0VarM != null ? g0Var.r0(g0VarM, n0.g.f332700b.e()) : n0.g.f332700b.e();
        long jR1 = g0VarM2 != null ? g0Var.r0(g0VarM2, n0.g.f332700b.e()) : n0.g.f332700b.e();
        int i10 = (int) (jR0 & com.rabbitmq.client.k0.f265952a);
        float fIntBitsToFloat = Float.intBitsToFloat(i10);
        int i11 = (int) (com.rabbitmq.client.k0.f265952a & jR1);
        return fIntBitsToFloat == Float.intBitsToFloat(i11) ? kotlin.comparisons.a.l(Float.valueOf(Float.intBitsToFloat((int) (jR0 >> 32))), Float.valueOf(Float.intBitsToFloat((int) (jR1 >> 32)))) : kotlin.comparisons.a.l(Float.valueOf(Float.intBitsToFloat(i10)), Float.valueOf(Float.intBitsToFloat(i11)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int M(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long o(androidx.compose.runtime.saveable.g0 g0Var, i3 i3Var) {
        return Long.valueOf(i3Var.f21166f.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i3 p(long j10) {
        return new i3(j10);
    }

    public final boolean A() {
        return this.f21163c;
    }

    public final void B(@Nullable Function1<? super Long, Unit> function1) {
        this.f21173m = function1;
    }

    public final void C(@Nullable Function1<? super Long, Unit> function1) {
        this.f21167g = function1;
    }

    public final void D(@Nullable Function1<? super Long, Unit> function1) {
        this.f21172l = function1;
    }

    public final void E(@Nullable pj.q<? super Boolean, ? super androidx.compose.ui.layout.g0, ? super n0.g, ? super n0.g, ? super Boolean, ? super n0, Boolean> qVar) {
        this.f21170j = qVar;
    }

    public final void F(@Nullable Function0<Unit> function0) {
        this.f21171k = function0;
    }

    public final void G(@Nullable Function2<? super Boolean, ? super Long, Unit> function2) {
        this.f21169i = function2;
    }

    public final void H(@Nullable pj.o<? super Boolean, ? super androidx.compose.ui.layout.g0, ? super n0.g, ? super n0, Unit> oVar) {
        this.f21168h = oVar;
    }

    public final void I(boolean z10) {
        this.f21163c = z10;
    }

    public void J(@NotNull androidx.collection.x0<h0> x0Var) {
        this.f21174n.setValue(x0Var);
    }

    @NotNull
    public final List<e0> K(@NotNull final androidx.compose.ui.layout.g0 g0Var) {
        if (!this.f21163c) {
            List<e0> list = this.f21164d;
            final Function2 function2 = new Function2() { // from class: androidx.compose.foundation.text.selection.g3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Integer.valueOf(i3.L(g0Var, (e0) obj, (e0) obj2));
                }
            };
            CollectionsKt.sortWith(list, new Comparator() { // from class: androidx.compose.foundation.text.selection.h3
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return i3.M(function2, obj, obj2);
                }
            });
            this.f21163c = true;
        }
        return z();
    }

    @Override // androidx.compose.foundation.text.selection.d3
    public void a(long j10) {
        this.f21163c = false;
        Function1<? super Long, Unit> function1 = this.f21167g;
        if (function1 != null) {
            function1.invoke(Long.valueOf(j10));
        }
    }

    @Override // androidx.compose.foundation.text.selection.d3
    public void b(@NotNull e0 e0Var) {
        if (this.f21165e.e(e0Var.o())) {
            this.f21164d.remove(e0Var);
            this.f21165e.e0(e0Var.o());
            Function1<? super Long, Unit> function1 = this.f21173m;
            if (function1 != null) {
                function1.invoke(Long.valueOf(e0Var.o()));
            }
        }
    }

    @Override // androidx.compose.foundation.text.selection.d3
    public boolean c(@NotNull androidx.compose.ui.layout.g0 g0Var, long j10, long j11, boolean z10, @NotNull n0 n0Var, boolean z11) {
        pj.q<? super Boolean, ? super androidx.compose.ui.layout.g0, ? super n0.g, ? super n0.g, ? super Boolean, ? super n0, Boolean> qVar = this.f21170j;
        if (qVar != null) {
            return qVar.H(Boolean.valueOf(z11), g0Var, n0.g.d(j10), n0.g.d(j11), Boolean.valueOf(z10), n0Var).booleanValue();
        }
        return true;
    }

    @Override // androidx.compose.foundation.text.selection.d3
    public void d() {
        Function0<Unit> function0 = this.f21171k;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // androidx.compose.foundation.text.selection.d3
    public long e() {
        long andIncrement = this.f21166f.getAndIncrement();
        while (andIncrement == 0) {
            andIncrement = this.f21166f.getAndIncrement();
        }
        return andIncrement;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.text.selection.d3
    @NotNull
    public androidx.collection.x0<h0> f() {
        return (androidx.collection.x0) this.f21174n.getValue();
    }

    @Override // androidx.compose.foundation.text.selection.d3
    public void g(long j10) {
        Function1<? super Long, Unit> function1 = this.f21172l;
        if (function1 != null) {
            function1.invoke(Long.valueOf(j10));
        }
    }

    @Override // androidx.compose.foundation.text.selection.d3
    @NotNull
    public e0 h(@NotNull e0 e0Var) {
        if (!(e0Var.o() != 0)) {
            androidx.compose.foundation.internal.e.g("The selectable contains an invalid id: " + e0Var.o());
        }
        if (this.f21165e.e(e0Var.o())) {
            androidx.compose.foundation.internal.e.g("Another selectable with the id: " + e0Var + ".selectableId has already subscribed.");
        }
        this.f21165e.j0(e0Var.o(), e0Var);
        this.f21164d.add(e0Var);
        this.f21163c = false;
        return e0Var;
    }

    @Override // androidx.compose.foundation.text.selection.d3
    public void i(@NotNull androidx.compose.ui.layout.g0 g0Var, long j10, @NotNull n0 n0Var, boolean z10) {
        pj.o<? super Boolean, ? super androidx.compose.ui.layout.g0, ? super n0.g, ? super n0, Unit> oVar = this.f21168h;
        if (oVar != null) {
            oVar.invoke(Boolean.valueOf(z10), g0Var, n0.g.d(j10), n0Var);
        }
    }

    @Override // androidx.compose.foundation.text.selection.d3
    public void j(long j10, boolean z10) {
        Function2<? super Boolean, ? super Long, Unit> function2 = this.f21169i;
        if (function2 != null) {
            function2.invoke(Boolean.valueOf(z10), Long.valueOf(j10));
        }
    }

    @Nullable
    public final Function1<Long, Unit> r() {
        return this.f21173m;
    }

    @Nullable
    public final Function1<Long, Unit> s() {
        return this.f21167g;
    }

    @Nullable
    public final Function1<Long, Unit> t() {
        return this.f21172l;
    }

    @Nullable
    public final pj.q<Boolean, androidx.compose.ui.layout.g0, n0.g, n0.g, Boolean, n0, Boolean> u() {
        return this.f21170j;
    }

    @Nullable
    public final Function0<Unit> v() {
        return this.f21171k;
    }

    @Nullable
    public final Function2<Boolean, Long, Unit> w() {
        return this.f21169i;
    }

    @Nullable
    public final pj.o<Boolean, androidx.compose.ui.layout.g0, n0.g, n0, Unit> x() {
        return this.f21168h;
    }

    @NotNull
    public final androidx.collection.x0<e0> y() {
        return this.f21165e;
    }

    @NotNull
    public final List<e0> z() {
        return this.f21164d;
    }

    public i3() {
        this(1L);
    }
}
