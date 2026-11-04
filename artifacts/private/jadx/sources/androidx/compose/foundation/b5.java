package androidx.compose.foundation;

import androidx.compose.runtime.e6;
import androidx.compose.runtime.k7;
import androidx.compose.runtime.n7;
import androidx.compose.runtime.w6;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@k7
@SourceDebugExtension({"SMAP\nScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scroll.kt\nandroidx/compose/foundation/ScrollState\n+ 2 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,485:1\n78#2:486\n111#2,2:487\n78#2:496\n111#2,2:497\n604#3,7:489\n85#4:499\n85#4:500\n26#5:501\n*S KotlinDebug\n*F\n+ 1 Scroll.kt\nandroidx/compose/foundation/ScrollState\n*L\n90#1:486\n90#1:487,2\n109#1:496\n109#1:497,2\n98#1:489,7\n153#1:499\n155#1:500\n135#1:501\n*E\n"})
public final class b5 implements androidx.compose.foundation.gestures.v4 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f13919j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.l3 f13921a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f13925e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final a f13918i = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.runtime.saveable.c0<b5, ?> f13920k = androidx.compose.runtime.saveable.f0.e(new Function2() { // from class: androidx.compose.foundation.z4
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return b5.r((androidx.compose.runtime.saveable.g0) obj, (b5) obj2);
        }
    }, new Function1() { // from class: androidx.compose.foundation.a5
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return b5.s(((Integer) obj).intValue());
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.l3 f13922b = e6.b(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.interaction.j f13923c = androidx.compose.foundation.interaction.i.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private androidx.compose.runtime.l3 f13924d = e6.b(Integer.MAX_VALUE);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.gestures.v4 f13926f = androidx.compose.foundation.gestures.x4.b(new Function1() { // from class: androidx.compose.foundation.w4
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return Float.valueOf(b5.E(this.f21875a, ((Float) obj).floatValue()));
        }
    });

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final n7 f13927g = w6.e(new Function0() { // from class: androidx.compose.foundation.x4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(b5.x(this.f21894a));
        }
    });

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final n7 f13928h = w6.e(new Function0() { // from class: androidx.compose.foundation.y4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(b5.w(this.f21921a));
        }
    });

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final androidx.compose.runtime.saveable.c0<b5, ?> a() {
            return b5.f13920k;
        }

        private a() {
        }
    }

    public b5(int i10) {
        this.f13921a = e6.b(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float E(b5 b5Var, float f10) {
        float fB = b5Var.B() + f10 + b5Var.f13925e;
        float fH = kotlin.ranges.r.H(fB, 0.0f, b5Var.A());
        boolean z10 = fB == fH;
        float fB2 = fH - b5Var.B();
        int iRound = Math.round(fB2);
        b5Var.G(b5Var.B() + iRound);
        b5Var.f13925e = fB2 - iRound;
        return !z10 ? fB2 : f10;
    }

    private final void G(int i10) {
        this.f13921a.j(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer r(androidx.compose.runtime.saveable.g0 g0Var, b5 b5Var) {
        return Integer.valueOf(b5Var.B());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b5 s(int i10) {
        return new b5(i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object v(b5 b5Var, int i10, androidx.compose.animation.core.o oVar, kotlin.coroutines.d dVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            oVar = new androidx.compose.animation.core.q2(0.0f, 0.0f, null, 7, null);
        }
        return b5Var.u(i10, oVar, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean w(b5 b5Var) {
        return b5Var.B() > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean x(b5 b5Var) {
        return b5Var.B() < b5Var.A();
    }

    public final int A() {
        return this.f13924d.m1();
    }

    public final int B() {
        return this.f13921a.m1();
    }

    public final int C() {
        return this.f13922b.m1();
    }

    @Nullable
    public final Object D(int i10, @NotNull kotlin.coroutines.d<? super Float> dVar) {
        return androidx.compose.foundation.gestures.v3.e(this, i10 - B(), dVar);
    }

    public final void F(int i10) {
        this.f13924d.j(i10);
        androidx.compose.runtime.snapshots.m.a aVar = androidx.compose.runtime.snapshots.m.f36535e;
        androidx.compose.runtime.snapshots.m mVarG = aVar.g();
        Function1<Object, Unit> function1L = mVarG != null ? mVarG.l() : null;
        androidx.compose.runtime.snapshots.m mVarM = aVar.m(mVarG);
        try {
            if (B() > i10) {
                G(i10);
            }
            Unit unit = Unit.f312394a;
            aVar.x(mVarG, mVarM, function1L);
        } catch (Throwable th2) {
            aVar.x(mVarG, mVarM, function1L);
            throw th2;
        }
    }

    public final void H(int i10) {
        this.f13922b.j(i10);
    }

    @Override // androidx.compose.foundation.gestures.v4
    public boolean a() {
        return this.f13926f.a();
    }

    @Override // androidx.compose.foundation.gestures.v4
    public float b(float f10) {
        return this.f13926f.b(f10);
    }

    @Override // androidx.compose.foundation.gestures.v4
    @Nullable
    public Object c(@NotNull q3 q3Var, @NotNull Function2<? super androidx.compose.foundation.gestures.z3, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objC = this.f13926f.c(q3Var, function2, dVar);
        return objC == kotlin.coroutines.intrinsics.b.l() ? objC : Unit.f312394a;
    }

    @Override // androidx.compose.foundation.gestures.v4
    public boolean f() {
        return ((Boolean) this.f13927g.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.v4
    public boolean g() {
        return this.f13926f.g();
    }

    @Override // androidx.compose.foundation.gestures.v4
    public boolean j() {
        return this.f13926f.j();
    }

    @Override // androidx.compose.foundation.gestures.v4
    public boolean k() {
        return ((Boolean) this.f13928h.getValue()).booleanValue();
    }

    @Nullable
    public final Object u(int i10, @NotNull androidx.compose.animation.core.o<Float> oVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objA = androidx.compose.foundation.gestures.v3.a(this, i10 - B(), oVar, dVar);
        return objA == kotlin.coroutines.intrinsics.b.l() ? objA : Unit.f312394a;
    }

    @NotNull
    public final androidx.compose.foundation.interaction.h y() {
        return this.f13923c;
    }

    @NotNull
    public final androidx.compose.foundation.interaction.j z() {
        return this.f13923c;
    }
}
