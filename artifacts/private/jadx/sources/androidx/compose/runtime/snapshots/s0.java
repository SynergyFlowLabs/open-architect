package androidx.compose.runtime.snapshots;

import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSnapshotStateSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateSet.kt\nandroidx/compose/runtime/snapshots/SnapshotStateSetKt\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,253:1\n112#1:254\n118#1,5:266\n123#1:272\n112#1:273\n124#1,7:275\n108#1:282\n132#1:291\n112#1:293\n108#1:295\n112#1:306\n108#1:308\n108#1:318\n2474#2:255\n2364#2,2:256\n1893#2:258\n2366#2,4:260\n2474#2:265\n2474#2:274\n2364#2,2:283\n1893#2:285\n2366#2,4:286\n2474#2:294\n2364#2,2:296\n1893#2:298\n2366#2,4:300\n2474#2:307\n2364#2,2:309\n1893#2:311\n2366#2,4:313\n2364#2,2:319\n1893#2:321\n2366#2,2:323\n2369#2:326\n33#3:259\n33#3:271\n33#3:292\n33#3:299\n33#3:305\n33#3:312\n33#3:322\n33#3:325\n33#3:328\n25#3,5:329\n1#4:264\n1#4:290\n1#4:304\n1#4:317\n1#4:327\n*S KotlinDebug\n*F\n+ 1 SnapshotStateSet.kt\nandroidx/compose/runtime/snapshots/SnapshotStateSetKt\n*L\n101#1:254\n115#1:266,5\n115#1:272\n115#1:273\n115#1:275,7\n115#1:282\n115#1:291\n123#1:293\n130#1:295\n143#1:306\n152#1:308\n162#1:318\n101#1:255\n108#1:256,2\n108#1:258\n108#1:260,4\n112#1:265\n115#1:274\n115#1:283,2\n115#1:285\n115#1:286,4\n123#1:294\n130#1:296,2\n130#1:298\n130#1:300,4\n143#1:307\n152#1:309,2\n152#1:311\n152#1:313,4\n162#1:319,2\n162#1:321\n162#1:323,2\n162#1:326\n108#1:259\n115#1:271\n122#1:292\n130#1:299\n142#1:305\n152#1:312\n162#1:322\n163#1:325\n175#1:328\n204#1:329,5\n108#1:264\n115#1:290\n130#1:304\n152#1:317\n162#1:327\n*E\n"})
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Object f36588a = new Object();

    public static final <T> boolean b(@NotNull g1<T> g1Var, int i10, @NotNull androidx.compose.runtime.external.kotlinx.collections.immutable.i<? extends T> iVar) {
        boolean z10;
        synchronized (f36588a) {
            if (g1Var.k() == i10) {
                g1Var.n(iVar);
                z10 = true;
                g1Var.m(g1Var.k() + 1);
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public static final <T> void c(@NotNull SnapshotStateSet<T> snapshotStateSet) {
        m mVarF;
        e1 e1VarA = snapshotStateSet.A();
        Intrinsics.checkNotNull(e1VarA, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.writable>");
        g1 g1Var = (g1) e1VarA;
        synchronized (b0.Q()) {
            try {
                mVarF = m.f36535e.f();
                g1 g1Var2 = (g1) b0.A0(g1Var, snapshotStateSet, mVarF);
                synchronized (f36588a) {
                    try {
                        g1Var2.n(androidx.compose.runtime.external.kotlinx.collections.immutable.a.K());
                        g1Var2.m(g1Var2.k() + 1);
                        kotlin.jvm.internal.h0.d(1);
                    } catch (Throwable th2) {
                        kotlin.jvm.internal.h0.d(1);
                        kotlin.jvm.internal.h0.c(1);
                        throw th2;
                    }
                }
                kotlin.jvm.internal.h0.c(1);
                kotlin.jvm.internal.h0.d(1);
            } catch (Throwable th3) {
                kotlin.jvm.internal.h0.d(1);
                kotlin.jvm.internal.h0.c(1);
                throw th3;
            }
        }
        kotlin.jvm.internal.h0.c(1);
        b0.c0(mVarF, snapshotStateSet);
    }

    public static final <T> boolean d(@NotNull SnapshotStateSet<T> snapshotStateSet, @NotNull Function1<? super androidx.compose.runtime.external.kotlinx.collections.immutable.i<? extends T>, ? extends androidx.compose.runtime.external.kotlinx.collections.immutable.i<? extends T>> function1) {
        int iK;
        androidx.compose.runtime.external.kotlinx.collections.immutable.i<T> iVarL;
        m mVarF;
        boolean zB;
        do {
            synchronized (f36588a) {
                try {
                    e1 e1VarA = snapshotStateSet.A();
                    Intrinsics.checkNotNull(e1VarA, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.withCurrent>");
                    g1 g1Var = (g1) b0.L((g1) e1VarA);
                    iK = g1Var.k();
                    iVarL = g1Var.l();
                    Unit unit = Unit.f312394a;
                    kotlin.jvm.internal.h0.d(1);
                } catch (Throwable th2) {
                    kotlin.jvm.internal.h0.d(1);
                    kotlin.jvm.internal.h0.c(1);
                    throw th2;
                }
            }
            kotlin.jvm.internal.h0.c(1);
            Intrinsics.checkNotNull(iVarL);
            androidx.compose.runtime.external.kotlinx.collections.immutable.i<? extends T> iVarInvoke = function1.invoke(iVarL);
            if (Intrinsics.areEqual(iVarInvoke, iVarL)) {
                return false;
            }
            e1 e1VarA2 = snapshotStateSet.A();
            Intrinsics.checkNotNull(e1VarA2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.writable>");
            g1 g1Var2 = (g1) e1VarA2;
            synchronized (b0.Q()) {
                try {
                    mVarF = m.f36535e.f();
                    zB = b((g1) b0.A0(g1Var2, snapshotStateSet, mVarF), iK, iVarInvoke);
                    kotlin.jvm.internal.h0.d(1);
                } catch (Throwable th3) {
                    kotlin.jvm.internal.h0.d(1);
                    kotlin.jvm.internal.h0.c(1);
                    throw th3;
                }
            }
            kotlin.jvm.internal.h0.c(1);
            b0.c0(mVarF, snapshotStateSet);
        } while (!zB);
        return true;
    }

    public static final <T> int e(@NotNull SnapshotStateSet<T> snapshotStateSet) {
        e1 e1VarA = snapshotStateSet.A();
        Intrinsics.checkNotNull(e1VarA, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.withCurrent>");
        return ((g1) b0.L((g1) e1VarA)).k();
    }

    @NotNull
    public static final <T> g1<T> f(@NotNull SnapshotStateSet<T> snapshotStateSet) {
        e1 e1VarA = snapshotStateSet.A();
        Intrinsics.checkNotNull(e1VarA, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.<get-readable>>");
        return (g1) b0.k0((g1) e1VarA, snapshotStateSet);
    }

    public static /* synthetic */ void g(SnapshotStateSet snapshotStateSet) {
    }

    public static final <R, T> R h(@NotNull SnapshotStateSet<T> snapshotStateSet, @NotNull Function1<? super Set<T>, ? extends R> function1) {
        int iK;
        androidx.compose.runtime.external.kotlinx.collections.immutable.i<T> iVarL;
        androidx.compose.runtime.external.kotlinx.collections.immutable.i.a<T> aVarBuilder;
        R rInvoke;
        m mVarF;
        boolean zB;
        do {
            synchronized (f36588a) {
                try {
                    e1 e1VarA = snapshotStateSet.A();
                    Intrinsics.checkNotNull(e1VarA, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.withCurrent>");
                    g1 g1Var = (g1) b0.L((g1) e1VarA);
                    iK = g1Var.k();
                    iVarL = g1Var.l();
                    Unit unit = Unit.f312394a;
                    kotlin.jvm.internal.h0.d(1);
                } catch (Throwable th2) {
                    kotlin.jvm.internal.h0.d(1);
                    kotlin.jvm.internal.h0.c(1);
                    throw th2;
                }
            }
            kotlin.jvm.internal.h0.c(1);
            if (iVarL != null && (aVarBuilder = iVarL.builder()) != null) {
                rInvoke = function1.invoke(aVarBuilder);
                androidx.compose.runtime.external.kotlinx.collections.immutable.i<T> iVarBuild = aVarBuilder.build();
                if (Intrinsics.areEqual(iVarBuild, iVarL)) {
                    break;
                }
                e1 e1VarA2 = snapshotStateSet.A();
                Intrinsics.checkNotNull(e1VarA2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.writable>");
                g1 g1Var2 = (g1) e1VarA2;
                synchronized (b0.Q()) {
                    try {
                        mVarF = m.f36535e.f();
                        zB = b((g1) b0.A0(g1Var2, snapshotStateSet, mVarF), iK, iVarBuild);
                        kotlin.jvm.internal.h0.d(1);
                    } catch (Throwable th3) {
                        kotlin.jvm.internal.h0.d(1);
                        kotlin.jvm.internal.h0.c(1);
                        throw th3;
                    }
                }
                kotlin.jvm.internal.h0.c(1);
                b0.c0(mVarF, snapshotStateSet);
            } else {
                throw new IllegalStateException("No set to mutate");
            }
        } while (!zB);
        return rInvoke;
    }

    public static final <T> boolean i(@NotNull SnapshotStateSet<T> snapshotStateSet, @NotNull Function1<? super Set<T>, Boolean> function1) {
        int iK;
        androidx.compose.runtime.external.kotlinx.collections.immutable.i<T> iVarL;
        androidx.compose.runtime.external.kotlinx.collections.immutable.i.a<T> aVarBuilder;
        Boolean boolInvoke;
        m mVarF;
        boolean zB;
        do {
            synchronized (f36588a) {
                try {
                    e1 e1VarA = snapshotStateSet.A();
                    Intrinsics.checkNotNull(e1VarA, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.withCurrent>");
                    g1 g1Var = (g1) b0.L((g1) e1VarA);
                    iK = g1Var.k();
                    iVarL = g1Var.l();
                    Unit unit = Unit.f312394a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (iVarL != null && (aVarBuilder = iVarL.builder()) != null) {
                boolInvoke = function1.invoke(aVarBuilder);
                androidx.compose.runtime.external.kotlinx.collections.immutable.i<T> iVarBuild = aVarBuilder.build();
                if (Intrinsics.areEqual(iVarBuild, iVarL)) {
                    break;
                }
                e1 e1VarA2 = snapshotStateSet.A();
                Intrinsics.checkNotNull(e1VarA2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.writable>");
                g1 g1Var2 = (g1) e1VarA2;
                synchronized (b0.Q()) {
                    mVarF = m.f36535e.f();
                    zB = b((g1) b0.A0(g1Var2, snapshotStateSet, mVarF), iK, iVarBuild);
                }
                b0.c0(mVarF, snapshotStateSet);
            } else {
                throw new IllegalStateException("No set to mutate");
            }
        } while (!zB);
        return boolInvoke.booleanValue();
    }

    @NotNull
    public static final <T> e1 j(@NotNull SnapshotStateSet<T> snapshotStateSet, @NotNull androidx.compose.runtime.external.kotlinx.collections.immutable.i<? extends T> iVar) {
        g1 g1Var = new g1(b0.N().p(), iVar);
        if (m.f36535e.l()) {
            g1Var.i(new g1(w.s(1), iVar));
        }
        return g1Var;
    }

    public static final <R, T> R k(@NotNull SnapshotStateSet<T> snapshotStateSet, @NotNull Function1<? super g1<T>, ? extends R> function1) {
        e1 e1VarA = snapshotStateSet.A();
        Intrinsics.checkNotNull(e1VarA, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.withCurrent>");
        return function1.invoke(b0.L((g1) e1VarA));
    }

    public static final <R, T> R l(@NotNull SnapshotStateSet<T> snapshotStateSet, @NotNull Function1<? super g1<T>, ? extends R> function1) {
        m mVarF;
        R rInvoke;
        e1 e1VarA = snapshotStateSet.A();
        Intrinsics.checkNotNull(e1VarA, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.writable>");
        g1 g1Var = (g1) e1VarA;
        synchronized (b0.Q()) {
            try {
                mVarF = m.f36535e.f();
                rInvoke = function1.invoke(b0.A0(g1Var, snapshotStateSet, mVarF));
                kotlin.jvm.internal.h0.d(1);
            } catch (Throwable th2) {
                kotlin.jvm.internal.h0.d(1);
                kotlin.jvm.internal.h0.c(1);
                throw th2;
            }
        }
        kotlin.jvm.internal.h0.c(1);
        b0.c0(mVarF, snapshotStateSet);
        return rInvoke;
    }
}
