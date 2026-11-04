package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.k7;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@k7
@SourceDebugExtension({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,416:1\n186#1:418\n150#1:419\n187#1,2:421\n154#1:423\n189#1:433\n157#1,5:434\n162#1:440\n150#1:441\n163#1,7:443\n154#1:450\n171#1:459\n157#1,5:460\n162#1:466\n150#1:467\n163#1,7:469\n154#1:476\n171#1:485\n157#1,5:486\n162#1:492\n150#1:493\n163#1,7:495\n154#1:502\n171#1:511\n157#1,5:514\n162#1:520\n150#1:521\n163#1,7:523\n154#1:530\n171#1:539\n150#1:540\n150#1:553\n154#1:555\n150#1:566\n154#1:568\n2474#2:417\n2474#2:420\n2364#2,2:424\n1893#2:426\n2366#2,4:428\n2474#2:442\n2364#2,2:451\n1893#2:453\n2366#2,4:454\n2474#2:468\n2364#2,2:477\n1893#2:479\n2366#2,4:480\n2474#2:494\n2364#2,2:503\n1893#2:505\n2366#2,4:506\n2474#2:522\n2364#2,2:531\n1893#2:533\n2366#2,4:534\n2474#2:541\n2474#2:542\n2364#2,2:543\n1893#2:545\n2366#2,4:547\n2474#2:554\n2364#2,2:556\n1893#2:558\n2366#2,4:560\n2474#2:567\n2364#2,2:569\n1893#2:571\n2366#2,4:573\n33#3:427\n33#3:439\n33#3:465\n33#3:491\n33#3:519\n33#3:546\n33#3:552\n33#3:559\n33#3:565\n33#3:572\n33#3:578\n1#4:432\n1#4:458\n1#4:484\n1#4:510\n1#4:538\n1#4:551\n1#4:564\n1#4:577\n295#5,2:512\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap\n*L\n90#1:418\n90#1:419\n90#1:421,2\n90#1:423\n90#1:433\n92#1:434,5\n92#1:440\n92#1:441\n92#1:443,7\n92#1:450\n92#1:459\n94#1:460,5\n94#1:466\n94#1:467\n94#1:469,7\n94#1:476\n94#1:485\n96#1:486,5\n96#1:492\n96#1:493\n96#1:495,7\n96#1:502\n96#1:511\n115#1:514,5\n115#1:520\n115#1:521\n115#1:523,7\n115#1:530\n115#1:539\n146#1:540\n162#1:553\n169#1:555\n186#1:566\n188#1:568\n86#1:417\n90#1:420\n90#1:424,2\n90#1:426\n90#1:428,4\n92#1:442\n92#1:451,2\n92#1:453\n92#1:454,4\n94#1:468\n94#1:477,2\n94#1:479\n94#1:480,4\n96#1:494\n96#1:503,2\n96#1:505\n96#1:506,4\n115#1:522\n115#1:531,2\n115#1:533\n115#1:534,4\n146#1:541\n150#1:542\n154#1:543,2\n154#1:545\n154#1:547,4\n162#1:554\n169#1:556,2\n169#1:558\n169#1:560,4\n186#1:567\n188#1:569,2\n188#1:571\n188#1:573,4\n90#1:427\n92#1:439\n94#1:465\n96#1:491\n115#1:519\n154#1:546\n161#1:552\n169#1:559\n178#1:565\n188#1:572\n193#1:578\n90#1:432\n92#1:458\n94#1:484\n96#1:510\n115#1:538\n154#1:551\n169#1:564\n188#1:577\n103#1:512,2\n*E\n"})
public final class l0<K, V> implements c1, Map<K, V>, qj.g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f36527e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private e1 f36528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Set<Map.Entry<K, V>> f36529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Set<K> f36530c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Collection<V> f36531d;

    @androidx.compose.runtime.internal.w0(parameters = 0)
    @SourceDebugExtension({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap$StateMapStateRecord\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n*L\n1#1,416:1\n33#2:417\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap$StateMapStateRecord\n*L\n206#1:417\n*E\n"})
    public static final class a<K, V> extends e1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f36532f = 8;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private androidx.compose.runtime.external.kotlinx.collections.immutable.h<K, ? extends V> f36533d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f36534e;

        public a(long j10, @NotNull androidx.compose.runtime.external.kotlinx.collections.immutable.h<K, ? extends V> hVar) {
            super(j10);
            this.f36533d = hVar;
        }

        @Override // androidx.compose.runtime.snapshots.e1
        public void b(@NotNull e1 e1Var) {
            Intrinsics.checkNotNull(e1Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord, V of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord>");
            a aVar = (a) e1Var;
            synchronized (m0.f36542a) {
                try {
                    this.f36533d = aVar.f36533d;
                    this.f36534e = aVar.f36534e;
                    Unit unit = Unit.f312394a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.compose.runtime.snapshots.e1
        @NotNull
        public e1 c() {
            return new a(b0.N().p(), this.f36533d);
        }

        @Override // androidx.compose.runtime.snapshots.e1
        @NotNull
        public e1 f(long j10) {
            return new a(j10, this.f36533d);
        }

        @NotNull
        public final androidx.compose.runtime.external.kotlinx.collections.immutable.h<K, V> k() {
            return this.f36533d;
        }

        public final int l() {
            return this.f36534e;
        }

        public final void m(@NotNull androidx.compose.runtime.external.kotlinx.collections.immutable.h<K, ? extends V> hVar) {
            this.f36533d = hVar;
        }

        public final void n(int i10) {
            this.f36534e = i10;
        }
    }

    public l0() {
        androidx.compose.runtime.external.kotlinx.collections.immutable.h hVarC = androidx.compose.runtime.external.kotlinx.collections.immutable.a.C();
        m mVarN = b0.N();
        a aVar = new a(mVarN.p(), hVarC);
        if (!(mVarN instanceof c)) {
            aVar.i(new a(w.s(1), hVarC));
        }
        this.f36528a = aVar;
        this.f36529b = new c0(this);
        this.f36530c = new d0(this);
        this.f36531d = new f0(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean d(a<K, V> aVar, int i10, androidx.compose.runtime.external.kotlinx.collections.immutable.h<K, ? extends V> hVar) {
        boolean z10;
        synchronized (m0.f36542a) {
            try {
                if (aVar.l() == i10) {
                    aVar.m(hVar);
                    z10 = true;
                    aVar.n(aVar.l() + 1);
                } else {
                    z10 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    private final int e(a<K, V> aVar, androidx.compose.runtime.external.kotlinx.collections.immutable.h<K, ? extends V> hVar) {
        int iL;
        synchronized (m0.f36542a) {
            aVar.m(hVar);
            iL = aVar.l();
            aVar.n(iL + 1);
        }
        return iL;
    }

    public static /* synthetic */ void g() {
    }

    public static /* synthetic */ void l() {
    }

    private final <R> R o(Function1<? super Map<K, V>, ? extends R> function1) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.h<K, V> hVarK;
        int iL;
        R rInvoke;
        m mVarF;
        boolean zD;
        do {
            synchronized (m0.f36542a) {
                try {
                    e1 e1VarA = A();
                    Intrinsics.checkNotNull(e1VarA, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                    a aVar = (a) b0.L((a) e1VarA);
                    hVarK = aVar.k();
                    iL = aVar.l();
                    Unit unit = Unit.f312394a;
                    kotlin.jvm.internal.h0.d(1);
                } catch (Throwable th2) {
                    kotlin.jvm.internal.h0.d(1);
                    kotlin.jvm.internal.h0.c(1);
                    throw th2;
                }
            }
            kotlin.jvm.internal.h0.c(1);
            Intrinsics.checkNotNull(hVarK);
            androidx.compose.runtime.external.kotlinx.collections.immutable.h.a<K, V> aVarBuilder = hVarK.builder();
            rInvoke = function1.invoke(aVarBuilder);
            androidx.compose.runtime.external.kotlinx.collections.immutable.h<K, V> hVarBuild = aVarBuilder.build();
            if (Intrinsics.areEqual(hVarBuild, hVarK)) {
                break;
            }
            e1 e1VarA2 = A();
            Intrinsics.checkNotNull(e1VarA2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            a aVar2 = (a) e1VarA2;
            synchronized (b0.Q()) {
                try {
                    mVarF = m.f36535e.f();
                    zD = d((a) b0.A0(aVar2, this, mVarF), iL, hVarBuild);
                    kotlin.jvm.internal.h0.d(1);
                } catch (Throwable th3) {
                    kotlin.jvm.internal.h0.d(1);
                    kotlin.jvm.internal.h0.c(1);
                    throw th3;
                }
            }
            kotlin.jvm.internal.h0.c(1);
            b0.c0(mVarF, this);
        } while (!zD);
        return rInvoke;
    }

    private final void w(Function1<? super androidx.compose.runtime.external.kotlinx.collections.immutable.h<K, ? extends V>, ? extends androidx.compose.runtime.external.kotlinx.collections.immutable.h<K, ? extends V>> function1) {
        m mVarF;
        e1 e1VarA = A();
        Intrinsics.checkNotNull(e1VarA, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        a aVar = (a) b0.L((a) e1VarA);
        androidx.compose.runtime.external.kotlinx.collections.immutable.h<K, ? extends V> hVarInvoke = function1.invoke(aVar.k());
        if (hVarInvoke != aVar.k()) {
            e1 e1VarA2 = A();
            Intrinsics.checkNotNull(e1VarA2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            a aVar2 = (a) e1VarA2;
            synchronized (b0.Q()) {
                try {
                    mVarF = m.f36535e.f();
                    e((a) b0.A0(aVar2, this, mVarF), hVarInvoke);
                    kotlin.jvm.internal.h0.d(1);
                } catch (Throwable th2) {
                    kotlin.jvm.internal.h0.d(1);
                    kotlin.jvm.internal.h0.c(1);
                    throw th2;
                }
            }
            kotlin.jvm.internal.h0.c(1);
            b0.c0(mVarF, this);
        }
    }

    private final <R> R x(Function1<? super a<K, V>, ? extends R> function1) {
        e1 e1VarA = A();
        Intrinsics.checkNotNull(e1VarA, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return function1.invoke(b0.L((a) e1VarA));
    }

    private final <R> R y(Function1<? super a<K, V>, ? extends R> function1) {
        m mVarF;
        R rInvoke;
        e1 e1VarA = A();
        Intrinsics.checkNotNull(e1VarA, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        a aVar = (a) e1VarA;
        synchronized (b0.Q()) {
            try {
                mVarF = m.f36535e.f();
                rInvoke = function1.invoke(b0.A0(aVar, this, mVarF));
                kotlin.jvm.internal.h0.d(1);
            } catch (Throwable th2) {
                kotlin.jvm.internal.h0.d(1);
                kotlin.jvm.internal.h0.c(1);
                throw th2;
            }
        }
        kotlin.jvm.internal.h0.c(1);
        b0.c0(mVarF, this);
        return rInvoke;
    }

    @Override // androidx.compose.runtime.snapshots.c1
    @NotNull
    public e1 A() {
        return this.f36528a;
    }

    public final boolean b(@NotNull Function1<? super Map.Entry<? extends K, ? extends V>, Boolean> function1) {
        Iterator<E> it = ((androidx.compose.runtime.external.kotlinx.collections.immutable.e) k().k().entrySet()).iterator();
        while (it.hasNext()) {
            if (!function1.invoke((Map.Entry) it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public final boolean c(@NotNull Function1<? super Map.Entry<? extends K, ? extends V>, Boolean> function1) {
        Iterator<E> it = ((androidx.compose.runtime.external.kotlinx.collections.immutable.e) k().k().entrySet()).iterator();
        while (it.hasNext()) {
            if (function1.invoke((Map.Entry) it.next()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public void clear() {
        m mVarF;
        e1 e1VarA = A();
        Intrinsics.checkNotNull(e1VarA, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        a aVar = (a) b0.L((a) e1VarA);
        aVar.k();
        androidx.compose.runtime.external.kotlinx.collections.immutable.h<K, ? extends V> hVarC = androidx.compose.runtime.external.kotlinx.collections.immutable.a.C();
        if (hVarC != aVar.k()) {
            e1 e1VarA2 = A();
            Intrinsics.checkNotNull(e1VarA2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            a aVar2 = (a) e1VarA2;
            synchronized (b0.Q()) {
                try {
                    mVarF = m.f36535e.f();
                    e((a) b0.A0(aVar2, this, mVarF), hVarC);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            b0.c0(mVarF, this);
        }
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return k().k().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return k().k().containsValue(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return h();
    }

    @oj.i(name = "getDebuggerDisplayValue")
    @NotNull
    public final Map<K, V> f() {
        e1 e1VarA = A();
        Intrinsics.checkNotNull(e1VarA, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return ((a) b0.L((a) e1VarA)).k();
    }

    @Override // java.util.Map
    @Nullable
    public V get(Object obj) {
        return k().k().get(obj);
    }

    @NotNull
    public Set<Map.Entry<K, V>> h() {
        return this.f36529b;
    }

    @NotNull
    public Set<K> i() {
        return this.f36530c;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return k().k().isEmpty();
    }

    public final int j() {
        return k().l();
    }

    @NotNull
    public final a<K, V> k() {
        e1 e1VarA = A();
        Intrinsics.checkNotNull(e1VarA, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return (a) b0.k0((a) e1VarA, this);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return i();
    }

    public int m() {
        return k().k().size();
    }

    @NotNull
    public Collection<V> n() {
        return this.f36531d;
    }

    @Override // androidx.compose.runtime.snapshots.c1
    public void p(@NotNull e1 e1Var) {
        Intrinsics.checkNotNull(e1Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        this.f36528a = (a) e1Var;
    }

    @Override // java.util.Map
    @Nullable
    public V put(K k10, V v10) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.h<K, V> hVarK;
        int iL;
        V vPut;
        m mVarF;
        boolean zD;
        do {
            synchronized (m0.f36542a) {
                try {
                    e1 e1VarA = A();
                    Intrinsics.checkNotNull(e1VarA, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                    a aVar = (a) b0.L((a) e1VarA);
                    hVarK = aVar.k();
                    iL = aVar.l();
                    Unit unit = Unit.f312394a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Intrinsics.checkNotNull(hVarK);
            androidx.compose.runtime.external.kotlinx.collections.immutable.h.a<K, V> aVarBuilder = hVarK.builder();
            vPut = aVarBuilder.put(k10, v10);
            androidx.compose.runtime.external.kotlinx.collections.immutable.h<K, V> hVarBuild = aVarBuilder.build();
            if (Intrinsics.areEqual(hVarBuild, hVarK)) {
                break;
            }
            e1 e1VarA2 = A();
            Intrinsics.checkNotNull(e1VarA2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            a aVar2 = (a) e1VarA2;
            synchronized (b0.Q()) {
                mVarF = m.f36535e.f();
                zD = d((a) b0.A0(aVar2, this, mVarF), iL, hVarBuild);
            }
            b0.c0(mVarF, this);
        } while (!zD);
        return vPut;
    }

    @Override // java.util.Map
    public void putAll(@NotNull Map<? extends K, ? extends V> map) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.h<K, V> hVarK;
        int iL;
        m mVarF;
        boolean zD;
        do {
            synchronized (m0.f36542a) {
                try {
                    e1 e1VarA = A();
                    Intrinsics.checkNotNull(e1VarA, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                    a aVar = (a) b0.L((a) e1VarA);
                    hVarK = aVar.k();
                    iL = aVar.l();
                    Unit unit = Unit.f312394a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Intrinsics.checkNotNull(hVarK);
            androidx.compose.runtime.external.kotlinx.collections.immutable.h.a<K, V> aVarBuilder = hVarK.builder();
            aVarBuilder.putAll(map);
            androidx.compose.runtime.external.kotlinx.collections.immutable.h<K, V> hVarBuild = aVarBuilder.build();
            if (Intrinsics.areEqual(hVarBuild, hVarK)) {
                return;
            }
            e1 e1VarA2 = A();
            Intrinsics.checkNotNull(e1VarA2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            a aVar2 = (a) e1VarA2;
            synchronized (b0.Q()) {
                mVarF = m.f36535e.f();
                zD = d((a) b0.A0(aVar2, this, mVarF), iL, hVarBuild);
            }
            b0.c0(mVarF, this);
        } while (!zD);
    }

    public final boolean q(@NotNull Function1<? super Map.Entry<K, V>, Boolean> function1) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.h<K, V> hVarK;
        int iL;
        m mVarF;
        boolean zD;
        boolean z10 = false;
        do {
            synchronized (m0.f36542a) {
                try {
                    e1 e1VarA = A();
                    Intrinsics.checkNotNull(e1VarA, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                    a aVar = (a) b0.L((a) e1VarA);
                    hVarK = aVar.k();
                    iL = aVar.l();
                    Unit unit = Unit.f312394a;
                    kotlin.jvm.internal.h0.d(1);
                } catch (Throwable th2) {
                    kotlin.jvm.internal.h0.d(1);
                    kotlin.jvm.internal.h0.c(1);
                    throw th2;
                }
            }
            kotlin.jvm.internal.h0.c(1);
            Intrinsics.checkNotNull(hVarK);
            androidx.compose.runtime.external.kotlinx.collections.immutable.h.a<K, V> aVarBuilder = hVarK.builder();
            for (Map.Entry<K, V> entry : entrySet()) {
                if (function1.invoke(entry).booleanValue()) {
                    aVarBuilder.remove(entry.getKey());
                    z10 = true;
                }
            }
            Unit unit2 = Unit.f312394a;
            androidx.compose.runtime.external.kotlinx.collections.immutable.h<K, V> hVarBuild = aVarBuilder.build();
            if (Intrinsics.areEqual(hVarBuild, hVarK)) {
                break;
            }
            e1 e1VarA2 = A();
            Intrinsics.checkNotNull(e1VarA2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            a aVar2 = (a) e1VarA2;
            synchronized (b0.Q()) {
                try {
                    mVarF = m.f36535e.f();
                    zD = d((a) b0.A0(aVar2, this, mVarF), iL, hVarBuild);
                    kotlin.jvm.internal.h0.d(1);
                } catch (Throwable th3) {
                    kotlin.jvm.internal.h0.d(1);
                    kotlin.jvm.internal.h0.c(1);
                    throw th3;
                }
            }
            kotlin.jvm.internal.h0.c(1);
            b0.c0(mVarF, this);
        } while (!zD);
        return z10;
    }

    @Override // java.util.Map
    @Nullable
    public V remove(Object obj) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.h<K, V> hVarK;
        int iL;
        V vRemove;
        m mVarF;
        boolean zD;
        do {
            synchronized (m0.f36542a) {
                try {
                    e1 e1VarA = A();
                    Intrinsics.checkNotNull(e1VarA, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                    a aVar = (a) b0.L((a) e1VarA);
                    hVarK = aVar.k();
                    iL = aVar.l();
                    Unit unit = Unit.f312394a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Intrinsics.checkNotNull(hVarK);
            androidx.compose.runtime.external.kotlinx.collections.immutable.h.a<K, V> aVarBuilder = hVarK.builder();
            vRemove = aVarBuilder.remove(obj);
            androidx.compose.runtime.external.kotlinx.collections.immutable.h<K, V> hVarBuild = aVarBuilder.build();
            if (Intrinsics.areEqual(hVarBuild, hVarK)) {
                break;
            }
            e1 e1VarA2 = A();
            Intrinsics.checkNotNull(e1VarA2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            a aVar2 = (a) e1VarA2;
            synchronized (b0.Q()) {
                mVarF = m.f36535e.f();
                zD = d((a) b0.A0(aVar2, this, mVarF), iL, hVarBuild);
            }
            b0.c0(mVarF, this);
        } while (!zD);
        return vRemove;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return m();
    }

    @NotNull
    public String toString() {
        e1 e1VarA = A();
        Intrinsics.checkNotNull(e1VarA, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return "SnapshotStateMap(value=" + ((a) b0.L((a) e1VarA)).k() + ")@" + hashCode();
    }

    public final boolean u(V v10) {
        Object next;
        Iterator<T> it = entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((Map.Entry) next).getValue(), v10));
        Map.Entry entry = (Map.Entry) next;
        if (entry == null) {
            return false;
        }
        remove(entry.getKey());
        return true;
    }

    @NotNull
    public final Map<K, V> v() {
        return k().k();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return n();
    }
}
