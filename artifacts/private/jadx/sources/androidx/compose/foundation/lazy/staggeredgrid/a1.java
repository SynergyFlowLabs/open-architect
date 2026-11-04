package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.q3;
import androidx.compose.foundation.gestures.v3;
import androidx.compose.foundation.gestures.v4;
import androidx.compose.foundation.gestures.x4;
import androidx.compose.foundation.gestures.z3;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.h1;
import androidx.compose.foundation.lazy.layout.i1;
import androidx.compose.foundation.lazy.layout.k1;
import androidx.compose.foundation.lazy.layout.m1;
import androidx.compose.foundation.lazy.layout.n2;
import androidx.compose.foundation.lazy.layout.p1;
import androidx.compose.foundation.lazy.layout.u2;
import androidx.compose.runtime.d7;
import androidx.compose.runtime.k7;
import androidx.compose.runtime.n3;
import androidx.compose.runtime.w6;
import androidx.compose.ui.layout.p2;
import androidx.compose.ui.layout.q2;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@k7
@SourceDebugExtension({"SMAP\nLazyStaggeredGridState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridState.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,644:1\n85#2:645\n117#2,2:646\n85#2:648\n117#2,2:649\n85#2:651\n51#3,4:652\n97#3,4:658\n1863#4,2:656\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridState.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState\n*L\n159#1:645\n159#1:646,2\n162#1:648\n162#1:649,2\n237#1:651\n269#1:652,4\n603#1:658,4\n540#1:656,2\n*E\n"})
public final class a1 implements v4 {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f17714z = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f17715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private k0 f17716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final q0 f17717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final n3<k0> f17718d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final b0 f17719e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final n3 f17720f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final n3 f17721g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private p2 f17722h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final q2 f17723i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.lazy.layout.d f17724j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.lazy.layout.q f17725k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f17726l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final i1 f17727m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final v4 f17728n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f17729o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f17730p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f17731q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    private final Map<Integer, i1.b> f17732r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.interaction.j f17733s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private final h1 f17734t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    private final LazyLayoutItemAnimator<n0> f17735u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private final n3<Unit> f17736v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private final n3<Unit> f17737w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    private final k1 f17738x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public static final a f17713y = new a(null);

    @NotNull
    private static final androidx.compose.runtime.saveable.c0<a1, Object> A = androidx.compose.runtime.saveable.b.b(new Function2() { // from class: androidx.compose.foundation.lazy.staggeredgrid.x0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return a1.p((androidx.compose.runtime.saveable.g0) obj, (a1) obj2);
        }
    }, new Function1() { // from class: androidx.compose.foundation.lazy.staggeredgrid.y0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return a1.q((List) obj);
        }
    });

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final androidx.compose.runtime.saveable.c0<a1, Object> a() {
            return a1.A;
        }

        private a() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$animateScrollToItem$2", f = "LazyStaggeredGridState.kt", i = {}, l = {366}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<z3, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f17739a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f17740b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f17742d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f17743e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f17744f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ k0 f17745g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10, int i11, int i12, k0 k0Var, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f17742d = i10;
            this.f17743e = i11;
            this.f17744f = i12;
            this.f17745g = k0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = a1.this.new b(this.f17742d, this.f17743e, this.f17744f, this.f17745g, dVar);
            bVar.f17740b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f17739a;
            if (i10 == 0) {
                ResultKt.m(obj);
                m1 m1VarA = s0.a(a1.this, (z3) this.f17740b);
                int i11 = this.f17742d;
                int i12 = this.f17743e;
                int i13 = this.f17744f;
                androidx.compose.ui.unit.d dVarO = this.f17745g.o();
                this.f17739a = 1;
                if (p1.c(m1VarA, i11, i12, i13, dVarO, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(z3 z3Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(z3Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public static final class c implements q2 {
        c() {
        }

        @Override // androidx.compose.ui.layout.q2
        public void q6(p2 p2Var) {
            a1.this.f17722h = p2Var;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$requestScrollToItem$1", f = "LazyStaggeredGridState.kt", i = {}, l = {390}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f17747a;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return a1.this.new d(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f17747a;
            if (i10 == 0) {
                ResultKt.m(obj);
                a1 a1Var = a1.this;
                this.f17747a = 1;
                if (v3.j(a1Var, null, this, 1, null) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState", f = "LazyStaggeredGridState.kt", i = {0, 0}, l = {com.planner5d.library.engine.input.f.b.W1, com.planner5d.library.engine.input.f.b.X1}, m = "scroll", n = {"scrollPriority", "block"}, s = {"L$0", "L$1"})
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f17749a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f17750b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f17751c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f17753e;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f17751c = obj;
            this.f17753e |= Integer.MIN_VALUE;
            return a1.this.c(null, null, this);
        }
    }

    /* synthetic */ class f extends kotlin.jvm.internal.g0 implements Function2<Integer, Integer, int[]> {
        f(Object obj) {
            super(2, obj, a1.class, "fillNearestIndices", "fillNearestIndices(II)[I", 0);
        }

        public final int[] X(int i10, int i11) {
            return ((a1) this.receiver).A(i10, i11);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ int[] invoke(Integer num, Integer num2) {
            return X(num.intValue(), num2.intValue());
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scrollToItem$2", f = "LazyStaggeredGridState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class g extends kotlin.coroutines.jvm.internal.o implements Function2<z3, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f17754a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f17756c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f17757d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(int i10, int i11, kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
            this.f17756c = i10;
            this.f17757d = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return a1.this.new g(this.f17756c, this.f17757d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f17754a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            a1.this.m0(this.f17756c, this.f17757d, true);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(z3 z3Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((g) create(z3Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public a1(@NotNull int[] iArr, @NotNull int[] iArr2, @Nullable u2 u2Var) {
        q0 q0Var = new q0(iArr, iArr2, new f(this));
        this.f17717c = q0Var;
        this.f17718d = w6.k(m0.d(), w6.o());
        this.f17719e = new b0();
        Boolean bool = Boolean.FALSE;
        this.f17720f = d7.g(bool, null, 2, null);
        this.f17721g = d7.g(bool, null, 2, null);
        this.f17723i = new c();
        this.f17724j = new androidx.compose.foundation.lazy.layout.d();
        this.f17725k = new androidx.compose.foundation.lazy.layout.q();
        this.f17726l = true;
        this.f17727m = new i1(u2Var, null, 2, null);
        this.f17728n = x4.b(new Function1() { // from class: androidx.compose.foundation.lazy.staggeredgrid.z0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Float.valueOf(a1.h0(this.f18041a, ((Float) obj).floatValue()));
            }
        });
        this.f17731q = -1;
        this.f17732r = new LinkedHashMap();
        this.f17733s = androidx.compose.foundation.interaction.i.a();
        this.f17734t = new h1();
        this.f17735u = new LazyLayoutItemAnimator<>();
        q0Var.e();
        this.f17736v = n2.d(null, 1, null);
        this.f17737w = n2.d(null, 1, null);
        this.f17738x = new k1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int[] A(int i10, int i11) {
        int[] iArr = new int[i11];
        if (this.f17718d.getValue().v().b(i10)) {
            ArraysKt.fill$default(iArr, i10, 0, 0, 6, (Object) null);
            return iArr;
        }
        this.f17719e.d(i10 + i11);
        int iH = this.f17719e.h(i10);
        int iMin = 0;
        if (iH != -2 && iH != -1) {
            if ((iH >= 0 ? 1 : 0) == 0) {
                androidx.compose.foundation.internal.e.g("Expected positive lane number, got " + iH + " instead.");
            }
            iMin = Math.min(iH, i11);
        }
        int i12 = iMin;
        int iF = i10;
        for (int i13 = i12 - 1; -1 < i13; i13--) {
            iF = this.f17719e.f(iF, i13);
            iArr[i13] = iF;
            if (iF == -1) {
                ArraysKt.fill$default(iArr, -1, 0, i13, 2, (Object) null);
                break;
            }
        }
        iArr[i12] = i10;
        for (int i14 = i12 + 1; i14 < i11; i14++) {
            i10 = this.f17719e.e(i10, i14);
            iArr[i14] = i10;
        }
        return iArr;
    }

    private static Object Q(a1 a1Var) {
        return a1Var.f17717c.e();
    }

    private final void Z(float f10, k0 k0Var) {
        int i10;
        if (!this.f17726l || k0Var.h().isEmpty()) {
            return;
        }
        boolean z10 = f10 < 0.0f;
        int index = z10 ? ((n0) CollectionsKt.last((List) k0Var.h())).getIndex() : ((n0) CollectionsKt.first((List) k0Var.h())).getIndex();
        if (index == this.f17731q) {
            return;
        }
        this.f17731q = index;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        v0 v0VarU = k0Var.u();
        int length = v0VarU.b().length;
        int i11 = 0;
        while (i11 < length) {
            int iE = z10 ? this.f17719e.e(index, i11) : this.f17719e.f(index, i11);
            if (iE < 0 || iE >= k0Var.c() || linkedHashSet.contains(Integer.valueOf(iE))) {
                break;
            }
            linkedHashSet.add(Integer.valueOf(iE));
            if (!this.f17732r.containsKey(Integer.valueOf(iE))) {
                boolean zB = k0Var.v().b(iE);
                int i12 = zB ? 0 : i11;
                int i13 = zB ? length : 1;
                if (i13 == 1) {
                    i10 = v0VarU.b()[i12];
                } else {
                    int i14 = v0VarU.a()[i12];
                    int i15 = (i12 + i13) - 1;
                    i10 = (v0VarU.a()[i15] + v0VarU.b()[i15]) - i14;
                }
                this.f17732r.put(Integer.valueOf(iE), i1.n(this.f17727m, iE, k0Var.getOrientation() == q3.Vertical ? androidx.compose.ui.unit.b.f42658b.e(i10) : androidx.compose.ui.unit.b.f42658b.d(i10), null, 4, null));
            }
            i11++;
            index = iE;
        }
        z(linkedHashSet);
    }

    static /* synthetic */ void a0(a1 a1Var, float f10, k0 k0Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            k0Var = a1Var.f17718d.getValue();
        }
        a1Var.Z(f10, k0Var);
    }

    private final float b0(float f10) {
        k0 k0Var;
        if ((f10 < 0.0f && !f()) || (f10 > 0.0f && !k())) {
            return 0.0f;
        }
        if (!(Math.abs(this.f17729o) <= 0.5f)) {
            androidx.compose.foundation.internal.e.i("entered drag with non-zero pending scroll");
        }
        float f11 = this.f17729o + f10;
        this.f17729o = f11;
        if (Math.abs(f11) > 0.5f) {
            float f12 = this.f17729o;
            int iL0 = kotlin.math.b.L0(f12);
            k0 k0VarI = this.f17718d.getValue().i(iL0, !this.f17715a);
            if (k0VarI != null && (k0Var = this.f17716b) != null) {
                k0 k0VarI2 = k0Var != null ? k0Var.i(iL0, true) : null;
                if (k0VarI2 != null) {
                    this.f17716b = k0VarI2;
                } else {
                    k0VarI = null;
                }
            }
            if (k0VarI != null) {
                w(k0VarI, this.f17715a, true);
                n2.h(this.f17736v);
                Z(f12 - this.f17729o, k0VarI);
            } else {
                p2 p2Var = this.f17722h;
                if (p2Var != null) {
                    p2Var.h();
                }
                a0(this, f12 - this.f17729o, null, 2, null);
            }
        }
        if (Math.abs(this.f17729o) <= 0.5f) {
            return f10;
        }
        float f13 = f10 - this.f17729o;
        this.f17729o = 0.0f;
        return f13;
    }

    public static /* synthetic */ void d0(a1 a1Var, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        a1Var.c0(i10, i11);
    }

    public static /* synthetic */ Object g0(a1 a1Var, int i10, int i11, kotlin.coroutines.d dVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return a1Var.f0(i10, i11, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float h0(a1 a1Var, float f10) {
        return -a1Var.b0(-f10);
    }

    private void i0(boolean z10) {
        this.f17721g.setValue(Boolean.valueOf(z10));
    }

    private void j0(boolean z10) {
        this.f17720f.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List p(androidx.compose.runtime.saveable.g0 g0Var, a1 a1Var) {
        return CollectionsKt.listOf((Object[]) new int[][]{a1Var.f17717c.d(), a1Var.f17717c.g()});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a1 q(List list) {
        return new a1((int[]) list.get(0), (int[]) list.get(1), null);
    }

    public static /* synthetic */ Object v(a1 a1Var, int i10, int i11, kotlin.coroutines.d dVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return a1Var.u(i10, i11, dVar);
    }

    public static /* synthetic */ void x(a1 a1Var, k0 k0Var, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        a1Var.w(k0Var, z10, z11);
    }

    private final void y(c0 c0Var) {
        List<q> listH = c0Var.h();
        if (this.f17731q == -1 || listH.isEmpty()) {
            return;
        }
        int index = ((q) CollectionsKt.first((List) listH)).getIndex();
        int index2 = ((q) CollectionsKt.last((List) listH)).getIndex();
        int i10 = this.f17731q;
        if (index > i10 || i10 > index2) {
            this.f17731q = -1;
            Iterator<T> it = this.f17732r.values().iterator();
            while (it.hasNext()) {
                ((i1.b) it.next()).cancel();
            }
            this.f17732r.clear();
        }
    }

    private final void z(Set<Integer> set) {
        Iterator<Map.Entry<Integer, i1.b>> it = this.f17732r.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, i1.b> next = it.next();
            if (!set.contains(next.getKey())) {
                next.getValue().cancel();
                it.remove();
            }
        }
    }

    @Nullable
    public final k0 B() {
        return this.f17716b;
    }

    @NotNull
    public final androidx.compose.foundation.lazy.layout.d C() {
        return this.f17724j;
    }

    @NotNull
    public final androidx.compose.foundation.lazy.layout.q D() {
        return this.f17725k;
    }

    public final int E() {
        return this.f17717c.c();
    }

    public final int F() {
        return this.f17717c.f();
    }

    public final boolean G() {
        return this.f17715a;
    }

    @NotNull
    public final androidx.compose.foundation.interaction.h H() {
        return this.f17733s;
    }

    @NotNull
    public final LazyLayoutItemAnimator<n0> I() {
        return this.f17735u;
    }

    public final int J() {
        return this.f17718d.getValue().u().b().length;
    }

    @NotNull
    public final b0 K() {
        return this.f17719e;
    }

    @NotNull
    public final c0 L() {
        return this.f17718d.getValue();
    }

    public final int M() {
        return this.f17730p;
    }

    @NotNull
    public final n3<Unit> N() {
        return this.f17737w;
    }

    @NotNull
    public final androidx.compose.foundation.interaction.j O() {
        return this.f17733s;
    }

    @NotNull
    public final IntRange P() {
        return this.f17717c.e().getValue();
    }

    @NotNull
    public final h1 R() {
        return this.f17734t;
    }

    @NotNull
    public final n3<Unit> S() {
        return this.f17736v;
    }

    @NotNull
    public final i1 T() {
        return this.f17727m;
    }

    public final boolean U() {
        return this.f17726l;
    }

    @Nullable
    public final p2 V() {
        return this.f17722h;
    }

    @NotNull
    public final q2 W() {
        return this.f17723i;
    }

    public final float X() {
        return this.f17738x.c();
    }

    @NotNull
    public final q0 Y() {
        return this.f17717c;
    }

    @Override // androidx.compose.foundation.gestures.v4
    public boolean a() {
        return this.f17728n.a();
    }

    @Override // androidx.compose.foundation.gestures.v4
    public float b(float f10) {
        return this.f17728n.b(f10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006e, code lost:
    
        if (r6.c(r7, r8, r0) == r1) goto L22;
     */
    @Override // androidx.compose.foundation.gestures.v4
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(@org.jetbrains.annotations.NotNull androidx.compose.foundation.q3 r7, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.compose.foundation.gestures.z3, ? super kotlin.coroutines.d<? super kotlin.Unit>, ? extends java.lang.Object> r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof androidx.compose.foundation.lazy.staggeredgrid.a1.e
            if (r0 == 0) goto L15
            r0 = r9
            r0 = r9
            androidx.compose.foundation.lazy.staggeredgrid.a1$e r0 = (androidx.compose.foundation.lazy.staggeredgrid.a1.e) r0
            int r1 = r0.f17753e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 1
            r3 = r1 & r2
            if (r3 == 0) goto L15
            int r1 = r1 - r2
            r0.f17753e = r1
            goto L1a
        L15:
            androidx.compose.foundation.lazy.staggeredgrid.a1$e r0 = new androidx.compose.foundation.lazy.staggeredgrid.a1$e
            r0.<init>(r9)
        L1a:
            java.lang.Object r9 = r0.f17751c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f17753e
            r3 = 2
            r5 = 7
            r4 = 1
            if (r2 == 0) goto L4a
            r5 = 0
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L31
            kotlin.ResultKt.m(r9)
            r5 = 2
            goto L71
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r5 = 1
            r6.<init>(r7)
            throw r6
        L3a:
            java.lang.Object r7 = r0.f17750b
            r8 = r7
            r8 = r7
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            r5 = 6
            java.lang.Object r7 = r0.f17749a
            androidx.compose.foundation.q3 r7 = (androidx.compose.foundation.q3) r7
            kotlin.ResultKt.m(r9)
            r5 = 3
            goto L5f
        L4a:
            r5 = 6
            kotlin.ResultKt.m(r9)
            androidx.compose.foundation.lazy.layout.d r9 = r6.f17724j
            r0.f17749a = r7
            r0.f17750b = r8
            r0.f17753e = r4
            r5 = 4
            java.lang.Object r9 = r9.b(r0)
            if (r9 != r1) goto L5f
            r5 = 6
            goto L70
        L5f:
            androidx.compose.foundation.gestures.v4 r6 = r6.f17728n
            r5 = 1
            r9 = 0
            r0.f17749a = r9
            r5 = 1
            r0.f17750b = r9
            r0.f17753e = r3
            java.lang.Object r6 = r6.c(r7, r8, r0)
            if (r6 != r1) goto L71
        L70:
            return r1
        L71:
            kotlin.Unit r6 = kotlin.Unit.f312394a
            r5 = 2
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.a1.c(androidx.compose.foundation.q3, kotlin.jvm.functions.Function2, kotlin.coroutines.d):java.lang.Object");
    }

    public final void c0(@androidx.annotation.g0(from = 0) int i10, int i11) {
        if (a()) {
            kotlinx.coroutines.k.f(this.f17718d.getValue().n(), null, null, new d(null), 3, null);
        }
        m0(i10, i11, false);
    }

    public final float e0(boolean z10) {
        if (!z10 && this.f17715a) {
            return X();
        }
        return this.f17729o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.gestures.v4
    public boolean f() {
        return ((Boolean) this.f17720f.getValue()).booleanValue();
    }

    @Nullable
    public final Object f0(int i10, int i11, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objH = v4.h(this, null, new g(i10, i11, null), dVar, 1, null);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }

    @Override // androidx.compose.foundation.gestures.v4
    public boolean g() {
        return this.f17728n.g();
    }

    @Override // androidx.compose.foundation.gestures.v4
    public boolean j() {
        return this.f17728n.j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.gestures.v4
    public boolean k() {
        return ((Boolean) this.f17721g.getValue()).booleanValue();
    }

    public final void k0(int i10) {
        this.f17730p = i10;
    }

    public final void l0(boolean z10) {
        this.f17726l = z10;
    }

    public final void m0(int i10, int i11, boolean z10) {
        boolean z11 = (this.f17717c.c() == i10 && this.f17717c.f() == i11) ? false : true;
        if (z11) {
            this.f17735u.p();
        }
        k0 value = this.f17718d.getValue();
        q qVarB = m0.b(value, i10);
        if (qVarB == null || !z11) {
            this.f17717c.h(i10, i11);
        } else {
            int iP = (value.getOrientation() == q3.Vertical ? androidx.compose.ui.unit.q.p(qVarB.g()) : androidx.compose.ui.unit.q.n(qVarB.g())) + i11;
            int length = value.q().length;
            int[] iArr = new int[length];
            for (int i12 = 0; i12 < length; i12++) {
                iArr[i12] = value.q()[i12] + iP;
            }
            this.f17717c.m(iArr);
        }
        if (!z10) {
            n2.h(this.f17737w);
            return;
        }
        p2 p2Var = this.f17722h;
        if (p2Var != null) {
            p2Var.h();
        }
    }

    @NotNull
    public final int[] n0(@NotNull androidx.compose.foundation.lazy.layout.l0 l0Var, @NotNull int[] iArr) {
        return this.f17717c.n(l0Var, iArr);
    }

    @Nullable
    public final Object u(int i10, int i11, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        k0 value = this.f17718d.getValue();
        Object objH = v4.h(this, null, new b(i10, i11, value.u().b().length * 100, value, null), dVar, 1, null);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }

    public final void w(@NotNull k0 k0Var, boolean z10, boolean z11) {
        if (!z10 && this.f17715a) {
            this.f17716b = k0Var;
            return;
        }
        if (z10) {
            this.f17715a = true;
        }
        this.f17729o -= k0Var.m();
        this.f17718d.setValue(k0Var);
        if (z11) {
            this.f17717c.m(k0Var.q());
        } else {
            this.f17717c.l(k0Var);
            y(k0Var);
        }
        i0(k0Var.k());
        j0(k0Var.l());
        if (z10) {
            this.f17738x.g(k0Var.t(), k0Var.o(), k0Var.n());
        }
        this.f17730p++;
    }

    public /* synthetic */ a1(int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11);
    }

    public a1(int i10, int i11) {
        this(new int[]{i10}, new int[]{i11}, null);
    }
}
