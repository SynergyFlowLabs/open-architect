package androidx.compose.runtime.snapshots;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSnapshotStateList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SnapshotStateListKt\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,511:1\n121#1,5:522\n126#1:528\n115#1:529\n127#1,9:531\n111#1:540\n137#1,3:549\n115#1:553\n111#1:555\n163#1,6:565\n169#1:572\n115#1:573\n170#1,9:575\n111#1:584\n179#1,6:593\n163#1,7:599\n115#1:606\n170#1,9:608\n111#1:617\n179#1,6:625\n111#1:631\n115#1:642\n111#1:644\n115#1:655\n111#1:657\n115#1:667\n2364#2,2:512\n1893#2:514\n2366#2,4:516\n2474#2:521\n2474#2:530\n2364#2,2:541\n1893#2:543\n2366#2,4:544\n2474#2:554\n2364#2,2:556\n1893#2:558\n2366#2,4:560\n2474#2:574\n2364#2,2:585\n1893#2:587\n2366#2,4:588\n2474#2:607\n2364#2,2:618\n1893#2:620\n2366#2,4:621\n2364#2,2:632\n1893#2:634\n2366#2,2:636\n2369#2:639\n2474#2:643\n2364#2,2:645\n1893#2:647\n2366#2,4:649\n2474#2:656\n2364#2,2:658\n1893#2:660\n2366#2,4:662\n2474#2:668\n33#3:515\n33#3:527\n33#3:552\n33#3:559\n33#3:571\n33#3:635\n33#3:638\n33#3:641\n33#3:648\n33#3:654\n33#3:661\n33#3:666\n25#3,5:669\n1#4:520\n1#4:548\n1#4:564\n1#4:592\n1#4:640\n1#4:653\n*S KotlinDebug\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SnapshotStateListKt\n*L\n118#1:522,5\n118#1:528\n118#1:529\n118#1:531,9\n118#1:540\n118#1:549,3\n126#1:553\n135#1:555\n146#1:565,6\n146#1:572\n146#1:573\n146#1:575,9\n146#1:584\n146#1:593,6\n146#1:599,7\n146#1:606\n146#1:608,9\n146#1:617\n146#1:625,6\n151#1:631\n169#1:642\n178#1:644\n169#1:655\n178#1:657\n211#1:667\n111#1:512,2\n111#1:514\n111#1:516,4\n115#1:521\n118#1:530\n118#1:541,2\n118#1:543\n118#1:544,4\n126#1:554\n135#1:556,2\n135#1:558\n135#1:560,4\n146#1:574\n146#1:585,2\n146#1:587\n146#1:588,4\n146#1:607\n146#1:618,2\n146#1:620\n146#1:621,4\n151#1:632,2\n151#1:634\n151#1:636,2\n151#1:639\n169#1:643\n178#1:645,2\n178#1:647\n178#1:649,4\n169#1:656\n178#1:658,2\n178#1:660\n178#1:662,4\n211#1:668\n111#1:515\n118#1:527\n125#1:552\n135#1:559\n146#1:571\n151#1:635\n152#1:638\n168#1:641\n178#1:648\n168#1:654\n178#1:661\n192#1:666\n271#1:669,5\n111#1:520\n118#1:548\n135#1:564\n146#1:592\n151#1:640\n178#1:653\n*E\n"})
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Object f36525a = new Object();

    @NotNull
    public static final <T> SnapshotStateList<T> a(int i10, @NotNull Function1<? super Integer, ? extends T> function1) {
        if (i10 == 0) {
            return new SnapshotStateList<>();
        }
        androidx.compose.runtime.external.kotlinx.collections.immutable.g.a aVarBuilder = androidx.compose.runtime.external.kotlinx.collections.immutable.a.G().builder();
        for (int i11 = 0; i11 < i10; i11++) {
            aVarBuilder.add(function1.invoke(Integer.valueOf(i11)));
        }
        return new SnapshotStateList<>(aVarBuilder.build());
    }

    public static final <T> boolean f(@NotNull x0<T> x0Var, int i10, @NotNull androidx.compose.runtime.external.kotlinx.collections.immutable.g<? extends T> gVar, boolean z10) {
        boolean z11;
        synchronized (f36525a) {
            try {
                if (x0Var.l() == i10) {
                    x0Var.n(gVar);
                    z11 = true;
                    if (z10) {
                        x0Var.p(x0Var.m() + 1);
                    }
                    x0Var.o(x0Var.l() + 1);
                } else {
                    z11 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    public static final <T> void g(@NotNull SnapshotStateList<T> snapshotStateList) {
        m mVarF;
        e1 e1VarA = snapshotStateList.A();
        Intrinsics.checkNotNull(e1VarA, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
        x0 x0Var = (x0) e1VarA;
        synchronized (b0.Q()) {
            try {
                mVarF = m.f36535e.f();
                x0 x0Var2 = (x0) b0.A0(x0Var, snapshotStateList, mVarF);
                synchronized (f36525a) {
                    try {
                        x0Var2.n(androidx.compose.runtime.external.kotlinx.collections.immutable.a.G());
                        x0Var2.o(x0Var2.l() + 1);
                        x0Var2.p(x0Var2.m() + 1);
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
        b0.c0(mVarF, snapshotStateList);
    }

    public static final <T> boolean h(@NotNull SnapshotStateList<T> snapshotStateList, boolean z10, @NotNull Function1<? super androidx.compose.runtime.external.kotlinx.collections.immutable.g<? extends T>, ? extends androidx.compose.runtime.external.kotlinx.collections.immutable.g<? extends T>> function1) {
        int iL;
        androidx.compose.runtime.external.kotlinx.collections.immutable.g<T> gVarK;
        m mVarF;
        boolean zF;
        do {
            synchronized (f36525a) {
                try {
                    e1 e1VarA = snapshotStateList.A();
                    Intrinsics.checkNotNull(e1VarA, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                    x0 x0Var = (x0) b0.L((x0) e1VarA);
                    iL = x0Var.l();
                    gVarK = x0Var.k();
                    Unit unit = Unit.f312394a;
                    kotlin.jvm.internal.h0.d(1);
                } catch (Throwable th2) {
                    kotlin.jvm.internal.h0.d(1);
                    kotlin.jvm.internal.h0.c(1);
                    throw th2;
                }
            }
            kotlin.jvm.internal.h0.c(1);
            Intrinsics.checkNotNull(gVarK);
            androidx.compose.runtime.external.kotlinx.collections.immutable.g<? extends T> gVarInvoke = function1.invoke(gVarK);
            if (Intrinsics.areEqual(gVarInvoke, gVarK)) {
                return false;
            }
            e1 e1VarA2 = snapshotStateList.A();
            Intrinsics.checkNotNull(e1VarA2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            x0 x0Var2 = (x0) e1VarA2;
            synchronized (b0.Q()) {
                try {
                    mVarF = m.f36535e.f();
                    zF = f((x0) b0.A0(x0Var2, snapshotStateList, mVarF), iL, gVarInvoke, z10);
                    kotlin.jvm.internal.h0.d(1);
                } catch (Throwable th3) {
                    kotlin.jvm.internal.h0.d(1);
                    kotlin.jvm.internal.h0.c(1);
                    throw th3;
                }
            }
            kotlin.jvm.internal.h0.c(1);
            b0.c0(mVarF, snapshotStateList);
        } while (!zF);
        return true;
    }

    public static /* synthetic */ boolean i(SnapshotStateList snapshotStateList, boolean z10, Function1 function1, int i10, Object obj) {
        int iL;
        androidx.compose.runtime.external.kotlinx.collections.immutable.g gVarK;
        m mVarF;
        boolean zF;
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        do {
            synchronized (f36525a) {
                try {
                    e1 e1VarA = snapshotStateList.A();
                    Intrinsics.checkNotNull(e1VarA, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                    x0 x0Var = (x0) b0.L((x0) e1VarA);
                    iL = x0Var.l();
                    gVarK = x0Var.k();
                    Unit unit = Unit.f312394a;
                    kotlin.jvm.internal.h0.d(1);
                } catch (Throwable th2) {
                    kotlin.jvm.internal.h0.d(1);
                    kotlin.jvm.internal.h0.c(1);
                    throw th2;
                }
            }
            kotlin.jvm.internal.h0.c(1);
            Intrinsics.checkNotNull(gVarK);
            androidx.compose.runtime.external.kotlinx.collections.immutable.g gVar = (androidx.compose.runtime.external.kotlinx.collections.immutable.g) function1.invoke(gVarK);
            if (Intrinsics.areEqual(gVar, gVarK)) {
                return false;
            }
            e1 e1VarA2 = snapshotStateList.A();
            Intrinsics.checkNotNull(e1VarA2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            x0 x0Var2 = (x0) e1VarA2;
            synchronized (b0.Q()) {
                try {
                    mVarF = m.f36535e.f();
                    zF = f((x0) b0.A0(x0Var2, snapshotStateList, mVarF), iL, gVar, z10);
                    kotlin.jvm.internal.h0.d(1);
                } catch (Throwable th3) {
                    kotlin.jvm.internal.h0.d(1);
                    kotlin.jvm.internal.h0.c(1);
                    throw th3;
                }
            }
            kotlin.jvm.internal.h0.c(1);
            b0.c0(mVarF, snapshotStateList);
        } while (!zF);
        return true;
    }

    @NotNull
    public static final <T> x0<T> j(@NotNull SnapshotStateList<T> snapshotStateList) {
        e1 e1VarA = snapshotStateList.A();
        Intrinsics.checkNotNull(e1VarA, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.<get-readable>>");
        return (x0) b0.k0((x0) e1VarA, snapshotStateList);
    }

    public static /* synthetic */ void k(SnapshotStateList snapshotStateList) {
    }

    public static final <T> int l(@NotNull SnapshotStateList<T> snapshotStateList) {
        e1 e1VarA = snapshotStateList.A();
        Intrinsics.checkNotNull(e1VarA, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
        return ((x0) b0.L((x0) e1VarA)).m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void m() {
        throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void n() {
        throw new IllegalStateException("Cannot modify a state list through an iterator");
    }

    public static final <R, T> R o(@NotNull SnapshotStateList<T> snapshotStateList, @NotNull Function1<? super List<T>, ? extends R> function1) {
        int iL;
        androidx.compose.runtime.external.kotlinx.collections.immutable.g<T> gVarK;
        R rInvoke;
        m mVarF;
        boolean zF;
        do {
            synchronized (f36525a) {
                try {
                    e1 e1VarA = snapshotStateList.A();
                    Intrinsics.checkNotNull(e1VarA, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                    x0 x0Var = (x0) b0.L((x0) e1VarA);
                    iL = x0Var.l();
                    gVarK = x0Var.k();
                    Unit unit = Unit.f312394a;
                    kotlin.jvm.internal.h0.d(1);
                } catch (Throwable th2) {
                    kotlin.jvm.internal.h0.d(1);
                    kotlin.jvm.internal.h0.c(1);
                    throw th2;
                }
            }
            kotlin.jvm.internal.h0.c(1);
            Intrinsics.checkNotNull(gVarK);
            androidx.compose.runtime.external.kotlinx.collections.immutable.g.a<T> aVarBuilder = gVarK.builder();
            rInvoke = function1.invoke(aVarBuilder);
            androidx.compose.runtime.external.kotlinx.collections.immutable.g<T> gVarBuild = aVarBuilder.build();
            if (Intrinsics.areEqual(gVarBuild, gVarK)) {
                break;
            }
            e1 e1VarA2 = snapshotStateList.A();
            Intrinsics.checkNotNull(e1VarA2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            x0 x0Var2 = (x0) e1VarA2;
            synchronized (b0.Q()) {
                try {
                    mVarF = m.f36535e.f();
                    zF = f((x0) b0.A0(x0Var2, snapshotStateList, mVarF), iL, gVarBuild, true);
                    kotlin.jvm.internal.h0.d(1);
                } catch (Throwable th3) {
                    kotlin.jvm.internal.h0.d(1);
                    kotlin.jvm.internal.h0.c(1);
                    throw th3;
                }
            }
            kotlin.jvm.internal.h0.c(1);
            b0.c0(mVarF, snapshotStateList);
        } while (!zF);
        return rInvoke;
    }

    public static final <T> boolean p(@NotNull SnapshotStateList<T> snapshotStateList, @NotNull Function1<? super List<T>, Boolean> function1) {
        int iL;
        androidx.compose.runtime.external.kotlinx.collections.immutable.g<T> gVarK;
        Boolean boolInvoke;
        m mVarF;
        boolean zF;
        do {
            synchronized (f36525a) {
                e1 e1VarA = snapshotStateList.A();
                Intrinsics.checkNotNull(e1VarA, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                x0 x0Var = (x0) b0.L((x0) e1VarA);
                iL = x0Var.l();
                gVarK = x0Var.k();
                Unit unit = Unit.f312394a;
            }
            Intrinsics.checkNotNull(gVarK);
            androidx.compose.runtime.external.kotlinx.collections.immutable.g.a<T> aVarBuilder = gVarK.builder();
            boolInvoke = function1.invoke(aVarBuilder);
            androidx.compose.runtime.external.kotlinx.collections.immutable.g<T> gVarBuild = aVarBuilder.build();
            if (Intrinsics.areEqual(gVarBuild, gVarK)) {
                break;
            }
            e1 e1VarA2 = snapshotStateList.A();
            Intrinsics.checkNotNull(e1VarA2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            x0 x0Var2 = (x0) e1VarA2;
            synchronized (b0.Q()) {
                try {
                    mVarF = m.f36535e.f();
                    zF = f((x0) b0.A0(x0Var2, snapshotStateList, mVarF), iL, gVarBuild, true);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            b0.c0(mVarF, snapshotStateList);
        } while (!zF);
        return boolInvoke.booleanValue();
    }

    @NotNull
    public static final <T> e1 q(@NotNull SnapshotStateList<T> snapshotStateList, @NotNull androidx.compose.runtime.external.kotlinx.collections.immutable.g<? extends T> gVar) {
        m mVarN = b0.N();
        x0 x0Var = new x0(mVarN.p(), gVar);
        if (!(mVarN instanceof c)) {
            x0Var.i(new x0(w.s(1), gVar));
        }
        return x0Var;
    }

    public static final <T> void r(@NotNull SnapshotStateList<T> snapshotStateList, boolean z10, @NotNull Function1<? super androidx.compose.runtime.external.kotlinx.collections.immutable.g<? extends T>, ? extends androidx.compose.runtime.external.kotlinx.collections.immutable.g<? extends T>> function1) {
        int iL;
        androidx.compose.runtime.external.kotlinx.collections.immutable.g<T> gVarK;
        m mVarF;
        boolean zF;
        do {
            synchronized (f36525a) {
                try {
                    e1 e1VarA = snapshotStateList.A();
                    Intrinsics.checkNotNull(e1VarA, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                    x0 x0Var = (x0) b0.L((x0) e1VarA);
                    iL = x0Var.l();
                    gVarK = x0Var.k();
                    Unit unit = Unit.f312394a;
                    kotlin.jvm.internal.h0.d(1);
                } catch (Throwable th2) {
                    kotlin.jvm.internal.h0.d(1);
                    kotlin.jvm.internal.h0.c(1);
                    throw th2;
                }
            }
            kotlin.jvm.internal.h0.c(1);
            Intrinsics.checkNotNull(gVarK);
            androidx.compose.runtime.external.kotlinx.collections.immutable.g<? extends T> gVarInvoke = function1.invoke(gVarK);
            if (Intrinsics.areEqual(gVarInvoke, gVarK)) {
                return;
            }
            e1 e1VarA2 = snapshotStateList.A();
            Intrinsics.checkNotNull(e1VarA2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            x0 x0Var2 = (x0) e1VarA2;
            synchronized (b0.Q()) {
                try {
                    mVarF = m.f36535e.f();
                    zF = f((x0) b0.A0(x0Var2, snapshotStateList, mVarF), iL, gVarInvoke, z10);
                    kotlin.jvm.internal.h0.d(1);
                } catch (Throwable th3) {
                    kotlin.jvm.internal.h0.d(1);
                    kotlin.jvm.internal.h0.c(1);
                    throw th3;
                }
            }
            kotlin.jvm.internal.h0.c(1);
            b0.c0(mVarF, snapshotStateList);
        } while (!zF);
    }

    public static /* synthetic */ void s(SnapshotStateList snapshotStateList, boolean z10, Function1 function1, int i10, Object obj) {
        int iL;
        androidx.compose.runtime.external.kotlinx.collections.immutable.g gVarK;
        m mVarF;
        boolean zF;
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        do {
            synchronized (f36525a) {
                try {
                    e1 e1VarA = snapshotStateList.A();
                    Intrinsics.checkNotNull(e1VarA, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                    x0 x0Var = (x0) b0.L((x0) e1VarA);
                    iL = x0Var.l();
                    gVarK = x0Var.k();
                    Unit unit = Unit.f312394a;
                    kotlin.jvm.internal.h0.d(1);
                } catch (Throwable th2) {
                    kotlin.jvm.internal.h0.d(1);
                    kotlin.jvm.internal.h0.c(1);
                    throw th2;
                }
            }
            kotlin.jvm.internal.h0.c(1);
            Intrinsics.checkNotNull(gVarK);
            androidx.compose.runtime.external.kotlinx.collections.immutable.g gVar = (androidx.compose.runtime.external.kotlinx.collections.immutable.g) function1.invoke(gVarK);
            if (Intrinsics.areEqual(gVar, gVarK)) {
                return;
            }
            e1 e1VarA2 = snapshotStateList.A();
            Intrinsics.checkNotNull(e1VarA2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            x0 x0Var2 = (x0) e1VarA2;
            synchronized (b0.Q()) {
                try {
                    mVarF = m.f36535e.f();
                    zF = f((x0) b0.A0(x0Var2, snapshotStateList, mVarF), iL, gVar, z10);
                    kotlin.jvm.internal.h0.d(1);
                } catch (Throwable th3) {
                    kotlin.jvm.internal.h0.d(1);
                    kotlin.jvm.internal.h0.c(1);
                    throw th3;
                }
            }
            kotlin.jvm.internal.h0.c(1);
            b0.c0(mVarF, snapshotStateList);
        } while (!zF);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(int i10, int i11) {
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException("index (" + i10 + ") is out of bound of [0, " + i11 + ')');
        }
    }

    public static final <R, T> R u(@NotNull SnapshotStateList<T> snapshotStateList, @NotNull Function1<? super x0<T>, ? extends R> function1) {
        e1 e1VarA = snapshotStateList.A();
        Intrinsics.checkNotNull(e1VarA, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
        return function1.invoke(b0.L((x0) e1VarA));
    }

    public static final <R, T> R v(@NotNull SnapshotStateList<T> snapshotStateList, @NotNull Function1<? super x0<T>, ? extends R> function1) {
        m mVarF;
        R rInvoke;
        e1 e1VarA = snapshotStateList.A();
        Intrinsics.checkNotNull(e1VarA, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
        x0 x0Var = (x0) e1VarA;
        synchronized (b0.Q()) {
            try {
                mVarF = m.f36535e.f();
                rInvoke = function1.invoke(b0.A0(x0Var, snapshotStateList, mVarF));
                kotlin.jvm.internal.h0.d(1);
            } catch (Throwable th2) {
                kotlin.jvm.internal.h0.d(1);
                kotlin.jvm.internal.h0.c(1);
                throw th2;
            }
        }
        kotlin.jvm.internal.h0.c(1);
        b0.c0(mVarF, snapshotStateList);
        return rInvoke;
    }
}
