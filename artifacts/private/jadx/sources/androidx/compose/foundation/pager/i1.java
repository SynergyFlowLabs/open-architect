package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.q3;
import androidx.compose.foundation.gestures.v3;
import androidx.compose.foundation.gestures.v4;
import androidx.compose.foundation.gestures.x4;
import androidx.compose.foundation.gestures.z3;
import androidx.compose.foundation.lazy.layout.m2;
import androidx.compose.foundation.lazy.layout.n2;
import androidx.compose.foundation.lazy.layout.u2;
import androidx.compose.runtime.d7;
import androidx.compose.runtime.e6;
import androidx.compose.runtime.k7;
import androidx.compose.runtime.l3;
import androidx.compose.runtime.n3;
import androidx.compose.runtime.n7;
import androidx.compose.runtime.w6;
import androidx.compose.ui.layout.p2;
import androidx.compose.ui.layout.q2;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@k7
@SourceDebugExtension({"SMAP\nPagerState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerState\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 PagerState.kt\nandroidx/compose/foundation/pager/PagerStateKt\n+ 5 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 8 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 9 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 10 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,999:1\n97#2,4:1000\n97#2,4:1031\n97#2,4:1072\n85#3:1004\n117#3,2:1005\n85#3:1025\n85#3:1026\n85#3:1027\n117#3,2:1028\n85#3:1030\n85#3:1035\n117#3,2:1036\n85#3:1038\n117#3,2:1039\n902#4,4:1007\n902#4,4:1011\n902#4,4:1015\n902#4,4:1041\n902#4,4:1045\n902#4,4:1050\n78#5:1019\n111#5,2:1020\n78#5:1022\n111#5,2:1023\n1#6:1049\n604#7,7:1054\n604#7,7:1076\n604#7,7:1083\n69#8:1061\n65#8:1064\n65#8:1067\n69#8:1070\n70#9:1062\n60#9:1065\n60#9:1068\n70#9:1071\n22#10:1063\n22#10:1066\n22#10:1069\n*S KotlinDebug\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerState\n*L\n180#1:1000,4\n613#1:1031,4\n834#1:1072,4\n187#1:1004\n187#1:1005,2\n400#1:1025\n418#1:1026\n473#1:1027\n473#1:1028,2\n490#1:1030\n654#1:1035\n654#1:1036,2\n657#1:1038\n657#1:1039,2\n221#1:1007,4\n278#1:1011,4\n288#1:1015,4\n682#1:1041,4\n686#1:1045,4\n704#1:1050,4\n386#1:1019\n386#1:1020,2\n388#1:1022\n388#1:1023,2\n711#1:1054,7\n847#1:1076,7\n458#1:1083,7\n731#1:1061\n733#1:1064\n737#1:1067\n737#1:1070\n731#1:1062\n733#1:1065\n737#1:1068\n737#1:1071\n731#1:1063\n733#1:1066\n737#1:1069\n*E\n"})
public abstract class i1 implements v4 {
    public static final int L = 0;

    @NotNull
    private final androidx.compose.foundation.lazy.layout.d A;

    @NotNull
    private final n3 B;

    @NotNull
    private final q2 C;
    private long D;

    @NotNull
    private final androidx.compose.foundation.lazy.layout.h1 E;

    @NotNull
    private final n3<Unit> F;

    @NotNull
    private final n3<Unit> G;

    @NotNull
    private final n3 H;

    @NotNull
    private final n3 I;

    @NotNull
    private final n3<Boolean> J;

    @NotNull
    private final n3<Boolean> K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f18277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private u0 f18278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final n3 f18279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final x0 f18280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f18281e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f18282f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f18283g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f18284h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f18285i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f18286j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final v4 f18287k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f18288l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f18289m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f18290n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f18291o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    private androidx.compose.foundation.lazy.layout.i1.b f18292p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f18293q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    private n3<u0> f18294r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.unit.d f18295s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.interaction.j f18296t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    private final l3 f18297u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private final l3 f18298v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private final n7 f18299w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    private final n7 f18300x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.lazy.layout.i1 f18301y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.lazy.layout.q f18302z;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.pager.PagerState", f = "PagerState.kt", i = {0, 0, 0}, l = {androidx.constraintlayout.core.motion.utils.v.e.B, 619}, m = "animateScrollToPage", n = {"animationSpec", net.openid.appauth.f.c.f332989a, "pageOffsetFraction"}, s = {"L$0", "I$0", "F$0"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f18303a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f18304b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f18305c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f18306d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f18308f;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f18306d = obj;
            this.f18308f |= Integer.MIN_VALUE;
            int i10 = 0 >> 0;
            return i1.this.t(0, 0.0f, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.pager.PagerState$animateScrollToPage$3", f = "PagerState.kt", i = {}, l = {621}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<z3, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f18309a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f18310b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f18312d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f18313e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.o<Float> f18314f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10, float f10, androidx.compose.animation.core.o<Float> oVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f18312d = i10;
            this.f18313e = f10;
            this.f18314f = oVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit n(i1 i1Var, z3 z3Var, int i10) {
            i1Var.Q0(z3Var, i10);
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = i1.this.new b(this.f18312d, this.f18313e, this.f18314f, dVar);
            bVar.f18310b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f18309a;
            if (i10 == 0) {
                ResultKt.m(obj);
                androidx.compose.foundation.lazy.layout.m1 m1VarA = z0.a(i1.this, (z3) this.f18310b);
                int i11 = this.f18312d;
                float f10 = this.f18313e;
                androidx.compose.animation.core.o<Float> oVar = this.f18314f;
                final i1 i1Var = i1.this;
                Function2 function2 = new Function2() { // from class: androidx.compose.foundation.pager.j1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return i1.b.n(i1Var, (z3) obj2, ((Integer) obj3).intValue());
                    }
                };
                this.f18309a = 1;
                if (m1.h(m1VarA, i11, f10, oVar, function2, this) == objL) {
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
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(z3 z3Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(z3Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public static final class c implements q2 {
        c() {
        }

        @Override // androidx.compose.ui.layout.q2
        public void q6(p2 p2Var) {
            i1.this.H0(p2Var);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.pager.PagerState$requestScrollToPage$1", f = "PagerState.kt", i = {}, l = {583}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f18316a;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return i1.this.new d(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f18316a;
            if (i10 == 0) {
                ResultKt.m(obj);
                i1 i1Var = i1.this;
                this.f18316a = 1;
                if (v3.j(i1Var, null, this, 1, null) == objL) {
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

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.pager.PagerState", f = "PagerState.kt", i = {0, 0, 0, 1}, l = {638, 643}, m = "scroll$suspendImpl", n = {"$this", "scrollPriority", "block", "$this"}, s = {"L$0", "L$1", "L$2", "L$0"})
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f18318a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f18319b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f18320c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f18321d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f18323f;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f18321d = obj;
            this.f18323f |= Integer.MIN_VALUE;
            return i1.v0(i1.this, null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.pager.PagerState$scrollToPage$2", f = "PagerState.kt", i = {}, l = {509}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nPagerState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerState$scrollToPage$2\n+ 2 PagerState.kt\nandroidx/compose/foundation/pager/PagerStateKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,999:1\n902#2,4:1000\n97#3,4:1004\n*S KotlinDebug\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerState$scrollToPage$2\n*L\n508#1:1000,4\n510#1:1004,4\n*E\n"})
    static final class f extends kotlin.coroutines.jvm.internal.o implements Function2<z3, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f18324a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f18326c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f18327d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(float f10, int i10, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f18326c = f10;
            this.f18327d = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return i1.this.new f(this.f18326c, this.f18327d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f18324a;
            if (i10 == 0) {
                ResultKt.m(obj);
                i1 i1Var = i1.this;
                this.f18324a = 1;
                if (i1Var.x(this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            float f10 = this.f18326c;
            double d10 = f10;
            boolean z10 = false;
            if (-0.5d <= d10 && d10 <= 0.5d) {
                z10 = true;
            }
            if (!z10) {
                androidx.compose.foundation.internal.e.g("pageOffsetFraction " + f10 + " is not within the range -0.5 to 0.5");
            }
            i1.this.L0(i1.this.A(this.f18327d), this.f18326c, true);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(z3 z3Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(z3Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public i1() {
        this(0, 0.0f, null, 7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int A(int i10) {
        if (V() > 0) {
            return kotlin.ranges.r.I(i10, 0, V() - 1);
        }
        return 0;
    }

    private final void A0(boolean z10) {
        this.H.setValue(Boolean.valueOf(z10));
    }

    private final void G0(int i10) {
        this.f18297u.j(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H0(p2 p2Var) {
        this.B.setValue(p2Var);
    }

    private final void I0(int i10) {
        this.f18298v.j(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int K0(i1 i1Var) {
        return i1Var.a() ? i1Var.j0() : i1Var.E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int M0(i1 i1Var) {
        int iE;
        if (!i1Var.a()) {
            iE = i1Var.E();
        } else if (i1Var.f0() != -1) {
            iE = i1Var.f0();
        } else if (Math.abs(i1Var.F()) >= Math.abs(i1Var.b0())) {
            iE = i1Var.j() ? i1Var.f18281e + 1 : i1Var.f18281e;
        } else {
            iE = i1Var.E();
        }
        return i1Var.A(iE);
    }

    private final void N0(u0 u0Var) {
        androidx.compose.runtime.snapshots.m.a aVar = androidx.compose.runtime.snapshots.m.f36535e;
        androidx.compose.runtime.snapshots.m mVarG = aVar.g();
        Function1<Object, Unit> function1L = mVarG != null ? mVarG.l() : null;
        androidx.compose.runtime.snapshots.m mVarM = aVar.m(mVarG);
        try {
            if (!this.f18290n) {
                aVar.x(mVarG, mVarM, function1L);
                return;
            }
            if (u0Var.y1() >= V()) {
                aVar.x(mVarG, mVarM, function1L);
                return;
            }
            if (Math.abs(this.f18286j) <= 0.5f) {
                aVar.x(mVarG, mVarM, function1L);
            } else {
                if (!m0(this.f18286j)) {
                    aVar.x(mVarG, mVarM, function1L);
                    return;
                }
                q0(this.f18286j, u0Var);
                Unit unit = Unit.f312394a;
                aVar.x(mVarG, mVarM, function1L);
            }
        } catch (Throwable th2) {
            aVar.x(mVarG, mVarM, function1L);
            throw th2;
        }
    }

    public static /* synthetic */ void P0(i1 i1Var, z3 z3Var, int i10, float f10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateCurrentPage");
        }
        if ((i11 & 2) != 0) {
            f10 = 0.0f;
        }
        i1Var.O0(z3Var, i10, f10);
    }

    private static Object S(i1 i1Var) {
        return i1Var.f18280d.d();
    }

    private final int f0() {
        return this.f18297u.m1();
    }

    private final int j0() {
        return this.f18298v.m1();
    }

    private final boolean m0(float f10) {
        if (M().getOrientation() != q3.Vertical ? Math.signum(f10) != Math.signum(-Float.intBitsToFloat((int) (l0() >> 32))) : Math.signum(f10) != Math.signum(-Float.intBitsToFloat((int) (l0() & com.rabbitmq.client.k0.f265952a)))) {
            if (!n0()) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ int p0(i1 i1Var, l0 l0Var, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: matchScrollPositionWithKey");
        }
        if ((i11 & 2) != 0) {
            androidx.compose.runtime.snapshots.m.a aVar = androidx.compose.runtime.snapshots.m.f36535e;
            androidx.compose.runtime.snapshots.m mVarG = aVar.g();
            Function1<Object, Unit> function1L = mVarG != null ? mVarG.l() : null;
            androidx.compose.runtime.snapshots.m mVarM = aVar.m(mVarG);
            try {
                int iB = i1Var.f18280d.b();
                aVar.x(mVarG, mVarM, function1L);
                i10 = iB;
            } catch (Throwable th2) {
                aVar.x(mVarG, mVarM, function1L);
                throw th2;
            }
        }
        return i1Var.o0(l0Var, i10);
    }

    private final void q0(float f10, h0 h0Var) {
        androidx.compose.foundation.lazy.layout.i1.b bVar;
        androidx.compose.foundation.lazy.layout.i1.b bVar2;
        androidx.compose.foundation.lazy.layout.i1.b bVar3;
        if (this.f18290n && !h0Var.w1().isEmpty()) {
            boolean z10 = f10 > 0.0f;
            int iY = y(z10, h0Var);
            if (iY < 0 || iY >= V()) {
                return;
            }
            if (iY != this.f18291o) {
                if (this.f18293q != z10 && (bVar3 = this.f18292p) != null) {
                    bVar3.cancel();
                }
                this.f18293q = z10;
                this.f18291o = iY;
                this.f18292p = androidx.compose.foundation.lazy.layout.i1.n(this.f18301y, iY, this.D, null, 4, null);
            }
            if (z10) {
                if ((((o) CollectionsKt.last((List) h0Var.w1())).getOffset() + (h0Var.t1() + h0Var.x1())) - h0Var.e() >= f10 || (bVar2 = this.f18292p) == null) {
                    return;
                }
                bVar2.c();
                return;
            }
            if (h0Var.d() - ((o) CollectionsKt.first((List) h0Var.w1())).getOffset() >= (-f10) || (bVar = this.f18292p) == null) {
                return;
            }
            bVar.c();
        }
    }

    private final float r0(float f10) {
        u0 u0Var;
        long jA = y0.a(this);
        float f11 = this.f18285i + f10;
        long jN0 = kotlin.math.b.N0(f11);
        this.f18285i = f11 - jN0;
        if (Math.abs(f10) < 1.0E-4f) {
            return f10;
        }
        long j10 = jA + jN0;
        long jK = kotlin.ranges.r.K(j10, this.f18284h, this.f18283g);
        int i10 = 6 << 0;
        boolean z10 = j10 != jK;
        long j11 = jK - jA;
        float f12 = j11;
        this.f18286j = f12;
        if (Math.abs(j11) != 0) {
            this.J.setValue(Boolean.valueOf(f12 > 0.0f));
            this.K.setValue(Boolean.valueOf(f12 < 0.0f));
        }
        int i11 = (int) j11;
        int i12 = -i11;
        u0 u0VarC = this.f18294r.getValue().c(i12);
        if (u0VarC != null && (u0Var = this.f18278b) != null) {
            u0 u0VarC2 = u0Var != null ? u0Var.c(i12) : null;
            if (u0VarC2 != null) {
                this.f18278b = u0VarC2;
            } else {
                u0VarC = null;
            }
        }
        if (u0VarC != null) {
            v(u0VarC, this.f18277a, true);
            n2.h(this.F);
            this.f18289m++;
        } else {
            this.f18280d.a(i11);
            p2 p2VarG0 = g0();
            if (p2VarG0 != null) {
                p2VarG0.h();
            }
            this.f18288l++;
        }
        return (z10 ? Long.valueOf(j11) : Float.valueOf(f10)).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s0(i1 i1Var, m2 m2Var) {
        androidx.compose.runtime.snapshots.m.a aVar = androidx.compose.runtime.snapshots.m.f36535e;
        androidx.compose.runtime.snapshots.m mVarG = aVar.g();
        Function1<Object, Unit> function1L = mVarG != null ? mVarG.l() : null;
        androidx.compose.runtime.snapshots.m mVarM = aVar.m(mVarG);
        try {
            m2Var.d(i1Var.f18281e);
            Unit unit = Unit.f312394a;
            aVar.x(mVarG, mVarM, function1L);
            return unit;
        } catch (Throwable th2) {
            aVar.x(mVarG, mVarM, function1L);
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object u(i1 i1Var, int i10, float f10, androidx.compose.animation.core.o oVar, kotlin.coroutines.d dVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateScrollToPage");
        }
        if ((i11 & 2) != 0) {
            f10 = 0.0f;
        }
        if ((i11 & 4) != 0) {
            oVar = androidx.compose.animation.core.p.r(0.0f, 0.0f, null, 7, null);
        }
        return i1Var.t(i10, f10, oVar, dVar);
    }

    public static /* synthetic */ void u0(i1 i1Var, int i10, float f10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestScrollToPage");
        }
        if ((i11 & 2) != 0) {
            f10 = 0.0f;
        }
        i1Var.t0(i10, f10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0089, code lost:
    
        if (r9.c(r7, r8, r0) == r1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object v0(androidx.compose.foundation.pager.i1 r6, androidx.compose.foundation.q3 r7, kotlin.jvm.functions.Function2<? super androidx.compose.foundation.gestures.z3, ? super kotlin.coroutines.d<? super kotlin.Unit>, ? extends java.lang.Object> r8, kotlin.coroutines.d<? super kotlin.Unit> r9) {
        /*
            r5 = 6
            boolean r0 = r9 instanceof androidx.compose.foundation.pager.i1.e
            r5 = 5
            if (r0 == 0) goto L18
            r0 = r9
            r5 = 1
            androidx.compose.foundation.pager.i1$e r0 = (androidx.compose.foundation.pager.i1.e) r0
            r5 = 6
            int r1 = r0.f18323f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r5 = 5
            r0.f18323f = r1
            goto L1d
        L18:
            androidx.compose.foundation.pager.i1$e r0 = new androidx.compose.foundation.pager.i1$e
            r0.<init>(r9)
        L1d:
            java.lang.Object r9 = r0.f18321d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f18323f
            r3 = 2
            r4 = 1
            r5 = 3
            if (r2 == 0) goto L56
            r5 = 6
            if (r2 == r4) goto L41
            if (r2 != r3) goto L38
            r5 = 5
            java.lang.Object r6 = r0.f18318a
            androidx.compose.foundation.pager.i1 r6 = (androidx.compose.foundation.pager.i1) r6
            kotlin.ResultKt.m(r9)
            goto L8d
        L38:
            r5 = 4
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L41:
            java.lang.Object r6 = r0.f18320c
            r8 = r6
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            r5 = 3
            java.lang.Object r6 = r0.f18319b
            r7 = r6
            r5 = 6
            androidx.compose.foundation.q3 r7 = (androidx.compose.foundation.q3) r7
            java.lang.Object r6 = r0.f18318a
            r5 = 2
            androidx.compose.foundation.pager.i1 r6 = (androidx.compose.foundation.pager.i1) r6
            kotlin.ResultKt.m(r9)
            goto L6b
        L56:
            r5 = 4
            kotlin.ResultKt.m(r9)
            r0.f18318a = r6
            r0.f18319b = r7
            r0.f18320c = r8
            r0.f18323f = r4
            r5 = 2
            java.lang.Object r9 = r6.x(r0)
            r5 = 5
            if (r9 != r1) goto L6b
            goto L8b
        L6b:
            boolean r9 = r6.a()
            if (r9 != 0) goto L78
            int r9 = r6.E()
            r6.I0(r9)
        L78:
            androidx.compose.foundation.gestures.v4 r9 = r6.f18287k
            r0.f18318a = r6
            r2 = 0
            r0.f18319b = r2
            r0.f18320c = r2
            r5 = 7
            r0.f18323f = r3
            r5 = 1
            java.lang.Object r7 = r9.c(r7, r8, r0)
            if (r7 != r1) goto L8d
        L8b:
            r5 = 6
            return r1
        L8d:
            r7 = -1
            r5 = 3
            r6.G0(r7)
            r5 = 0
            kotlin.Unit r6 = kotlin.Unit.f312394a
            r5 = 5
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.i1.v0(androidx.compose.foundation.pager.i1, androidx.compose.foundation.q3, kotlin.jvm.functions.Function2, kotlin.coroutines.d):java.lang.Object");
    }

    public static /* synthetic */ void w(i1 i1Var, u0 u0Var, boolean z10, boolean z11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyMeasureResult");
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        i1Var.v(u0Var, z10, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object x(kotlin.coroutines.d<? super Unit> dVar) throws Throwable {
        Object objB = this.A.b(dVar);
        return objB == kotlin.coroutines.intrinsics.b.l() ? objB : Unit.f312394a;
    }

    public static /* synthetic */ Object x0(i1 i1Var, int i10, float f10, kotlin.coroutines.d dVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scrollToPage");
        }
        if ((i11 & 2) != 0) {
            f10 = 0.0f;
        }
        return i1Var.w0(i10, f10, dVar);
    }

    private final int y(boolean z10, h0 h0Var) {
        if (!z10) {
            return (((o) CollectionsKt.first((List) h0Var.w1())).getIndex() - h0Var.y1()) - 1;
        }
        int iY1 = h0Var.y1() + 1;
        if (iY1 < 0) {
            return Integer.MAX_VALUE;
        }
        return ((o) CollectionsKt.last((List) h0Var.w1())).getIndex() + iY1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float y0(i1 i1Var, float f10) {
        return i1Var.r0(f10);
    }

    private final void z(h0 h0Var) {
        if (this.f18291o == -1 || h0Var.w1().isEmpty()) {
            return;
        }
        if (this.f18291o != y(this.f18293q, h0Var)) {
            this.f18291o = -1;
            androidx.compose.foundation.lazy.layout.i1.b bVar = this.f18292p;
            if (bVar != null) {
                bVar.cancel();
            }
            this.f18292p = null;
        }
    }

    private final void z0(boolean z10) {
        this.I.setValue(Boolean.valueOf(z10));
    }

    @Nullable
    public final u0 B() {
        return this.f18278b;
    }

    public final void B0(@NotNull androidx.compose.ui.unit.d dVar) {
        this.f18295s = dVar;
    }

    @NotNull
    public final androidx.compose.foundation.lazy.layout.d C() {
        return this.A;
    }

    public final void C0(long j10) {
        this.f18283g = j10;
    }

    @NotNull
    public final androidx.compose.foundation.lazy.layout.q D() {
        return this.f18302z;
    }

    public final void D0(long j10) {
        this.f18284h = j10;
    }

    public final int E() {
        return this.f18280d.b();
    }

    public final void E0(boolean z10) {
        this.f18290n = z10;
    }

    public final float F() {
        return this.f18280d.c();
    }

    public final void F0(long j10) {
        this.D = j10;
    }

    @NotNull
    public final androidx.compose.ui.unit.d G() {
        return this.f18295s;
    }

    public final int H() {
        return this.f18281e;
    }

    public final int I() {
        return this.f18282f;
    }

    public final boolean J() {
        return this.f18277a;
    }

    public final void J0(long j10) {
        this.f18279c.setValue(n0.g.d(j10));
    }

    @NotNull
    public final androidx.compose.foundation.interaction.h K() {
        return this.f18296t;
    }

    @NotNull
    public final androidx.compose.foundation.interaction.j L() {
        return this.f18296t;
    }

    public final void L0(int i10, float f10, boolean z10) {
        this.f18280d.g(i10, f10);
        if (!z10) {
            n2.h(this.G);
            return;
        }
        p2 p2VarG0 = g0();
        if (p2VarG0 != null) {
            p2VarG0.h();
        }
    }

    @NotNull
    public final h0 M() {
        return this.f18294r.getValue();
    }

    public final int N() {
        return this.f18288l;
    }

    public final long O() {
        return this.f18283g;
    }

    public final void O0(@NotNull z3 z3Var, int i10, @androidx.annotation.x(from = -0.5d, to = 0.5d) float f10) {
        L0(i10, f10, true);
    }

    @NotNull
    public final n3<Unit> P() {
        return this.G;
    }

    public final long Q() {
        return this.f18284h;
    }

    public final void Q0(@NotNull z3 z3Var, int i10) {
        G0(A(i10));
    }

    @NotNull
    public final IntRange R() {
        return this.f18280d.d().getValue();
    }

    public final int T() {
        return this.f18288l + this.f18289m;
    }

    public final float U(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= V()) {
            z10 = true;
            int i11 = 7 & 1;
        }
        if (!z10) {
            androidx.compose.foundation.internal.e.g("page " + i10 + " is not within the range 0 to " + V());
        }
        return (i10 - E()) - F();
    }

    public abstract int V();

    public final int W() {
        return this.f18294r.getValue().t1();
    }

    public final int X() {
        return W() + Y();
    }

    public final int Y() {
        return this.f18294r.getValue().x1();
    }

    @NotNull
    public final androidx.compose.foundation.lazy.layout.h1 Z() {
        return this.E;
    }

    @Override // androidx.compose.foundation.gestures.v4
    public boolean a() {
        return this.f18287k.a();
    }

    @NotNull
    public final n3<Unit> a0() {
        return this.F;
    }

    @Override // androidx.compose.foundation.gestures.v4
    public float b(float f10) {
        return this.f18287k.b(f10);
    }

    public final float b0() {
        return Math.min(this.f18295s.S7(m1.o()), W() / 2.0f) / W();
    }

    @Override // androidx.compose.foundation.gestures.v4
    @Nullable
    public Object c(@NotNull androidx.compose.foundation.q3 q3Var, @NotNull Function2<? super z3, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        return v0(this, q3Var, function2, dVar);
    }

    @NotNull
    public final androidx.compose.foundation.lazy.layout.i1 c0() {
        return this.f18301y;
    }

    public final boolean d0() {
        return this.f18290n;
    }

    public final long e0() {
        return this.D;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.gestures.v4
    public final boolean f() {
        return ((Boolean) this.H.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.v4
    public boolean g() {
        return this.K.getValue().booleanValue();
    }

    @Nullable
    public final p2 g0() {
        return (p2) this.B.getValue();
    }

    @NotNull
    public final q2 h0() {
        return this.C;
    }

    public final int i0() {
        return ((Number) this.f18299w.getValue()).intValue();
    }

    @Override // androidx.compose.foundation.gestures.v4
    public boolean j() {
        return this.J.getValue().booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.gestures.v4
    public final boolean k() {
        return ((Boolean) this.I.getValue()).booleanValue();
    }

    public final int k0() {
        return ((Number) this.f18300x.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long l0() {
        return ((n0.g) this.f18279c.getValue()).B();
    }

    public final boolean n0() {
        return ((int) Float.intBitsToFloat((int) (l0() >> 32))) == 0 && ((int) Float.intBitsToFloat((int) (l0() & com.rabbitmq.client.k0.f265952a))) == 0;
    }

    public final int o0(@NotNull l0 l0Var, int i10) {
        return this.f18280d.f(l0Var, i10);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bc, code lost:
    
        if (androidx.compose.foundation.gestures.v4.h(r11, null, r3, r4, 1, null) == r0) goto L40;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(int r12, @androidx.annotation.x(from = -0.5d, to = 0.5d) float r13, @org.jetbrains.annotations.NotNull androidx.compose.animation.core.o<java.lang.Float> r14, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof androidx.compose.foundation.pager.i1.a
            if (r0 == 0) goto L15
            r0 = r15
            androidx.compose.foundation.pager.i1$a r0 = (androidx.compose.foundation.pager.i1.a) r0
            int r1 = r0.f18308f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L15
            int r1 = r1 - r2
            r0.f18308f = r1
        L12:
            r4 = r0
            r4 = r0
            goto L1b
        L15:
            androidx.compose.foundation.pager.i1$a r0 = new androidx.compose.foundation.pager.i1$a
            r0.<init>(r15)
            goto L12
        L1b:
            java.lang.Object r15 = r4.f18306d
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r4.f18308f
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L46
            if (r1 == r3) goto L38
            if (r1 != r2) goto L30
            kotlin.ResultKt.m(r15)
            goto Lbf
        L30:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L38:
            float r13 = r4.f18304b
            int r12 = r4.f18303a
            java.lang.Object r14 = r4.f18305c
            androidx.compose.animation.core.o r14 = (androidx.compose.animation.core.o) r14
            kotlin.ResultKt.m(r15)
        L43:
            r9 = r14
            r9 = r14
            goto L70
        L46:
            kotlin.ResultKt.m(r15)
            int r15 = r11.E()
            if (r12 != r15) goto L58
            float r15 = r11.F()
            int r15 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r15 != 0) goto L58
            goto L5e
        L58:
            int r15 = r11.V()
            if (r15 != 0) goto L61
        L5e:
            kotlin.Unit r11 = kotlin.Unit.f312394a
            return r11
        L61:
            r4.f18305c = r14
            r4.f18303a = r12
            r4.f18304b = r13
            r4.f18308f = r3
            java.lang.Object r15 = r11.x(r4)
            if (r15 != r0) goto L43
            goto Lbe
        L70:
            double r14 = (double) r13
            r5 = -4620693217682128896(0xbfe0000000000000, double:-0.5)
            int r1 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            r5 = 0
            if (r1 > 0) goto L7f
            r6 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r14 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r14 > 0) goto L7f
            goto L81
        L7f:
            r3 = r5
            r3 = r5
        L81:
            if (r3 != 0) goto L9c
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "pageOffsetFraction "
            r14.append(r15)
            r14.append(r13)
            java.lang.String r15 = " is not within the range -0.5 to 0.5"
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            androidx.compose.foundation.internal.e.g(r14)
        L9c:
            int r7 = r11.A(r12)
            int r12 = r11.X()
            float r12 = (float) r12
            float r8 = r13 * r12
            androidx.compose.foundation.pager.i1$b r3 = new androidx.compose.foundation.pager.i1$b
            r10 = 0
            r6 = r11
            r5 = r3
            r5.<init>(r7, r8, r9, r10)
            r1 = r6
            r11 = 0
            r4.f18305c = r11
            r4.f18308f = r2
            r2 = 0
            r5 = 1
            r6 = 0
            java.lang.Object r11 = androidx.compose.foundation.gestures.v4.h(r1, r2, r3, r4, r5, r6)
            if (r11 != r0) goto Lbf
        Lbe:
            return r0
        Lbf:
            kotlin.Unit r11 = kotlin.Unit.f312394a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.i1.t(int, float, androidx.compose.animation.core.o, kotlin.coroutines.d):java.lang.Object");
    }

    public final void t0(@androidx.annotation.g0(from = 0) int i10, @androidx.annotation.x(from = -0.5d, to = 0.5d) float f10) {
        if (a()) {
            kotlinx.coroutines.k.f(this.f18294r.getValue().k(), null, null, new d(null), 3, null);
        }
        L0(i10, f10, false);
    }

    public final void v(@NotNull u0 u0Var, boolean z10, boolean z11) {
        this.f18301y.q(u0Var.w1().size());
        if (!z10 && this.f18277a) {
            this.f18278b = u0Var;
            return;
        }
        if (z10) {
            this.f18277a = true;
        }
        if (z11) {
            this.f18280d.k(u0Var.m());
        } else {
            this.f18280d.l(u0Var);
            z(u0Var);
        }
        this.f18294r.setValue(u0Var);
        A0(u0Var.h());
        z0(u0Var.g());
        m mVarP = u0Var.p();
        if (mVarP != null) {
            this.f18281e = mVarP.getIndex();
        }
        this.f18282f = u0Var.q();
        N0(u0Var);
        this.f18283g = m1.l(u0Var, V());
        this.f18284h = m1.m(u0Var, V());
    }

    @Nullable
    public final Object w0(int i10, @androidx.annotation.x(from = -0.5d, to = 0.5d) float f10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        int i11 = 3 | 0;
        Object objH = v4.h(this, null, new f(f10, i10, null), dVar, 1, null);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }

    public i1(int i10, @androidx.annotation.x(from = -0.5d, to = 0.5d) float f10, @Nullable u2 u2Var) {
        double d10 = f10;
        boolean z10 = false;
        if (-0.5d <= d10 && d10 <= 0.5d) {
            z10 = true;
        }
        if (!z10) {
            androidx.compose.foundation.internal.e.g("currentPageOffsetFraction " + f10 + " is not within the range -0.5 to 0.5");
        }
        this.f18279c = d7.g(n0.g.d(n0.g.f332700b.e()), null, 2, null);
        x0 x0Var = new x0(i10, f10, this);
        this.f18280d = x0Var;
        this.f18281e = i10;
        this.f18283g = Long.MAX_VALUE;
        this.f18287k = x4.b(new Function1() { // from class: androidx.compose.foundation.pager.e1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Float.valueOf(i1.y0(this.f18227a, ((Float) obj).floatValue()));
            }
        });
        this.f18290n = true;
        this.f18291o = -1;
        this.f18294r = w6.k(m1.p(), w6.o());
        this.f18295s = m1.f18381e;
        this.f18296t = androidx.compose.foundation.interaction.i.a();
        this.f18297u = e6.b(-1);
        this.f18298v = e6.b(i10);
        this.f18299w = w6.d(w6.z(), new Function0() { // from class: androidx.compose.foundation.pager.f1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(i1.K0(this.f18247a));
            }
        });
        this.f18300x = w6.d(w6.z(), new Function0() { // from class: androidx.compose.foundation.pager.g1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(i1.M0(this.f18253a));
            }
        });
        this.f18301y = new androidx.compose.foundation.lazy.layout.i1(u2Var, new Function1() { // from class: androidx.compose.foundation.pager.h1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return i1.s0(this.f18273a, (m2) obj);
            }
        });
        this.f18302z = new androidx.compose.foundation.lazy.layout.q();
        this.A = new androidx.compose.foundation.lazy.layout.d();
        this.B = d7.g(null, null, 2, null);
        this.C = new c();
        int i11 = 2 ^ 0;
        this.D = androidx.compose.ui.unit.c.b(0, 0, 0, 0, 15, null);
        this.E = new androidx.compose.foundation.lazy.layout.h1();
        x0Var.d();
        this.F = n2.d(null, 1, null);
        this.G = n2.d(null, 1, null);
        Boolean bool = Boolean.FALSE;
        this.H = d7.g(bool, null, 2, null);
        this.I = d7.g(bool, null, 2, null);
        this.J = d7.g(bool, null, 2, null);
        this.K = d7.g(bool, null, 2, null);
    }

    public /* synthetic */ i1(int i10, float f10, u2 u2Var, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10, (i11 & 2) != 0 ? 0.0f : f10, (i11 & 4) != 0 ? null : u2Var);
    }

    public /* synthetic */ i1(int i10, float f10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10, (i11 & 2) != 0 ? 0.0f : f10);
    }

    public i1(int i10, @androidx.annotation.x(from = -0.5d, to = 0.5d) float f10) {
        this(i10, f10, null);
    }
}
