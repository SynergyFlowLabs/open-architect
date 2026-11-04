package androidx.compose.runtime.snapshots;

import androidx.collection.l2;
import androidx.compose.runtime.f4;
import androidx.compose.runtime.r2;
import java.util.Collection;
import java.util.Set;
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
@SourceDebugExtension({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 2 SnapshotId.jvm.kt\nandroidx/compose/runtime/snapshots/SnapshotId_jvmKt\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 4 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 5 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2486:1\n46#2:2487\n1893#3:2488\n1893#3:2494\n33#4:2489\n33#4:2495\n49#5,4:2490\n34#5,4:2496\n1#6:2500\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n81#1:2487\n113#1:2488\n245#1:2494\n113#1:2489\n245#1:2495\n190#1:2490,4\n274#1:2496,4\n*E\n"})
public abstract class m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f36535e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f36536f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f36537g = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private v f36538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f36539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f36540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f36541d;

    @SourceDebugExtension({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 4 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n*L\n1#1,2486:1\n547#1:2492\n547#1:2498\n550#1:2499\n149#2,5:2487\n149#2,5:2493\n1893#3:2500\n1893#3:2502\n1893#3:2504\n1893#3:2506\n1893#3:2508\n33#4:2501\n33#4:2503\n33#4:2505\n33#4:2507\n33#4:2509\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n*L\n493#1:2492\n555#1:2498\n559#1:2499\n456#1:2487,5\n528#1:2493,5\n624#1:2500\n645#1:2502\n679#1:2504\n625#1:2506\n648#1:2508\n624#1:2501\n645#1:2503\n679#1:2505\n625#1:2507\n648#1:2509\n*E\n"})
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ e A(a aVar, Function1 function1, Function1 function2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                function1 = null;
            }
            if ((i10 & 2) != 0) {
                function2 = null;
            }
            return aVar.z(function1, function2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ m C(a aVar, Function1 function1, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                function1 = null;
            }
            return aVar.B(function1);
        }

        private final boolean d(i1 i1Var) {
            return i1Var.l0() == androidx.compose.runtime.internal.a1.a();
        }

        private final boolean e(j1 j1Var) {
            return j1Var.O() == androidx.compose.runtime.internal.a1.a();
        }

        @kotlin.a1
        public static /* synthetic */ void h() {
        }

        public static /* synthetic */ void i() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object p(a aVar, Function1 function1, Function1 function2, Function0 function0, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                function1 = null;
            }
            if ((i10 & 2) != 0) {
                function2 = null;
            }
            return aVar.o(function1, function2, function0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void s(Function2 function2) {
            synchronized (b0.Q()) {
                try {
                    b0.f36450i = CollectionsKt.minus(b0.f36450i, function2);
                    Unit unit = Unit.f312394a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void u(Function1 function1) {
            synchronized (b0.Q()) {
                b0.f36451j = CollectionsKt.minus(b0.f36451j, function1);
                Unit unit = Unit.f312394a;
            }
            b0.H();
        }

        @NotNull
        public final m B(@Nullable Function1<Object, Unit> function1) {
            return b0.N().G(function1);
        }

        public final <R> R D(@NotNull Function0<? extends R> function0) {
            e eVarA = A(this, null, null, 3, null);
            try {
                m mVarU = eVarA.u();
                try {
                    R rInvoke = function0.invoke();
                    kotlin.jvm.internal.h0.d(1);
                    eVarA.B(mVarU);
                    kotlin.jvm.internal.h0.c(1);
                    kotlin.jvm.internal.h0.d(1);
                    eVarA.P().a();
                    eVarA.d();
                    return rInvoke;
                } finally {
                    kotlin.jvm.internal.h0.d(1);
                    eVarA.B(mVarU);
                    kotlin.jvm.internal.h0.c(1);
                }
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    kotlin.jvm.internal.h0.d(1);
                    eVarA.d();
                    kotlin.jvm.internal.h0.c(1);
                    throw th3;
                }
            }
        }

        public final <T> T E(@NotNull Function0<? extends T> function0) {
            m mVarG = g();
            Function1<Object, Unit> function1L = mVarG != null ? mVarG.l() : null;
            m mVarM = m(mVarG);
            try {
                T tInvoke = function0.invoke();
                kotlin.jvm.internal.h0.d(1);
                x(mVarG, mVarM, function1L);
                kotlin.jvm.internal.h0.c(1);
                return tInvoke;
            } catch (Throwable th2) {
                kotlin.jvm.internal.h0.d(1);
                x(mVarG, mVarM, function1L);
                kotlin.jvm.internal.h0.c(1);
                throw th2;
            }
        }

        @kotlin.a1
        @NotNull
        public final m c() {
            int i10 = 7 | 0;
            return b0.K((m) b0.f36444c.a(), null, false, 6, null);
        }

        @NotNull
        public final m f() {
            return b0.N();
        }

        @Nullable
        public final m g() {
            return (m) b0.f36444c.a();
        }

        public final <T> T j(@NotNull Function0<? extends T> function0) {
            m mVarV = v();
            try {
                T tInvoke = function0.invoke();
                kotlin.jvm.internal.h0.d(1);
                w(mVarV);
                kotlin.jvm.internal.h0.c(1);
                return tInvoke;
            } catch (Throwable th2) {
                kotlin.jvm.internal.h0.d(1);
                w(mVarV);
                kotlin.jvm.internal.h0.c(1);
                throw th2;
            }
        }

        public final boolean k() {
            return b0.f36454m.get() > 0;
        }

        public final boolean l() {
            return b0.f36444c.a() != null;
        }

        @kotlin.a1
        @NotNull
        public final m m(@Nullable m mVar) {
            if (mVar instanceof i1) {
                i1 i1Var = (i1) mVar;
                if (i1Var.l0() == androidx.compose.runtime.internal.a1.a()) {
                    i1Var.o0(null);
                    return mVar;
                }
            }
            if (mVar instanceof j1) {
                j1 j1Var = (j1) mVar;
                if (j1Var.O() == androidx.compose.runtime.internal.a1.a()) {
                    j1Var.S(null);
                    return mVar;
                }
            }
            m mVarK = b0.K(mVar, null, false, 6, null);
            mVarK.u();
            return mVarK;
        }

        public final void n() {
            b0.N().x();
        }

        public final <T> T o(@Nullable Function1<Object, Unit> function1, @Nullable Function1<Object, Unit> function2, @NotNull Function0<? extends T> function0) {
            m i1Var;
            if (function1 == null && function2 == null) {
                return function0.invoke();
            }
            m mVar = (m) b0.f36444c.a();
            if (mVar instanceof i1) {
                i1 i1Var2 = (i1) mVar;
                if (i1Var2.l0() == androidx.compose.runtime.internal.a1.a()) {
                    Function1<Object, Unit> function1U = i1Var2.l();
                    Function1<Object, Unit> function1R = i1Var2.r();
                    try {
                        ((i1) mVar).o0(b0.V(function1, function1U, false, 4, null));
                        ((i1) mVar).p0(b0.X(function2, function1R));
                        T tInvoke = function0.invoke();
                        i1Var2.o0(function1U);
                        return tInvoke;
                    } finally {
                        i1Var2.o0(function1U);
                        i1Var2.p0(function1R);
                    }
                }
            }
            if (mVar == null || (mVar instanceof e)) {
                i1Var = new i1(mVar instanceof e ? (e) mVar : null, function1, function2, true, false);
            } else {
                if (function1 == null) {
                    return function0.invoke();
                }
                i1Var = mVar.G(function1);
            }
            try {
                m mVarU = i1Var.u();
                try {
                    T tInvoke2 = function0.invoke();
                    i1Var.B(mVarU);
                    i1Var.d();
                    return tInvoke2;
                } catch (Throwable th2) {
                    i1Var.B(mVarU);
                    throw th2;
                }
            } catch (Throwable th3) {
                i1Var.d();
                throw th3;
            }
        }

        @r2
        public final int q() {
            return CollectionsKt.toList(b0.f36446e).size();
        }

        @NotNull
        public final h r(@NotNull final Function2<? super Set<? extends Object>, ? super m, Unit> function2) {
            b0.G(b0.f36442a);
            synchronized (b0.Q()) {
                try {
                    b0.f36450i = CollectionsKt.plus((Collection<? extends Function2<? super Set<? extends Object>, ? super m, Unit>>) b0.f36450i, function2);
                    Unit unit = Unit.f312394a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return new h() { // from class: androidx.compose.runtime.snapshots.k
                @Override // androidx.compose.runtime.snapshots.h
                public final void dispose() {
                    m.a.s(function2);
                }
            };
        }

        @NotNull
        public final h t(@NotNull final Function1<Object, Unit> function1) {
            synchronized (b0.Q()) {
                try {
                    b0.f36451j = CollectionsKt.plus((Collection<? extends Function1<Object, Unit>>) b0.f36451j, function1);
                    Unit unit = Unit.f312394a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            b0.H();
            return new h() { // from class: androidx.compose.runtime.snapshots.l
                @Override // androidx.compose.runtime.snapshots.h
                public final void dispose() {
                    m.a.u(function1);
                }
            };
        }

        @kotlin.a1
        @Nullable
        public final m v() {
            m mVar = (m) b0.f36444c.a();
            if (mVar != null) {
                b0.f36444c.b(null);
            }
            return mVar;
        }

        @kotlin.a1
        public final void w(@Nullable m mVar) {
            if (mVar != null) {
                b0.f36444c.b(mVar);
            }
        }

        @kotlin.a1
        public final void x(@Nullable m mVar, @NotNull m mVar2, @Nullable Function1<Object, Unit> function1) {
            if (mVar != mVar2) {
                mVar2.B(mVar);
                mVar2.d();
            } else if (mVar instanceof i1) {
                ((i1) mVar).o0(function1);
            } else {
                if (mVar instanceof j1) {
                    ((j1) mVar).S(function1);
                    return;
                }
                throw new IllegalStateException(("Non-transparent snapshot was reused: " + mVar).toString());
            }
        }

        public final void y() {
            boolean zS;
            synchronized (b0.Q()) {
                try {
                    zS = b0.f36452k.s();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (zS) {
                b0.H();
            }
        }

        @NotNull
        public final e z(@Nullable Function1<Object, Unit> function1, @Nullable Function1<Object, Unit> function2) {
            e eVarG0;
            m mVarN = b0.N();
            e eVar = mVarN instanceof e ? (e) mVarN : null;
            if (eVar == null || (eVarG0 = eVar.g0(function1, function2)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            return eVarG0;
        }

        private a() {
        }
    }

    public /* synthetic */ m(int i10, v vVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, vVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ m H(m mVar, Function1 function1, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: takeNestedSnapshot");
        }
        if ((i10 & 1) != 0) {
            function1 = null;
        }
        return mVar.G(function1);
    }

    @kotlin.l(message = "Use snapshotId instead", replaceWith = @kotlin.b1(expression = "snapshotId", imports = {}))
    public static /* synthetic */ void h() {
    }

    private static /* synthetic */ void k() {
    }

    @kotlin.a1
    public static /* synthetic */ void m() {
    }

    public void A() {
        z();
    }

    @kotlin.a1
    public void B(@Nullable m mVar) {
        b0.f36444c.b(mVar);
    }

    public final void C(boolean z10) {
        this.f36540c = z10;
    }

    public void D(@NotNull v vVar) {
        this.f36538a = vVar;
    }

    public void E(long j10) {
        this.f36539b = j10;
    }

    public void F(int i10) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    @NotNull
    public abstract m G(@Nullable Function1<Object, Unit> function1);

    public final int I() {
        int i10 = this.f36541d;
        this.f36541d = -1;
        return i10;
    }

    @Nullable
    public final m J() {
        return u();
    }

    public final void K(@Nullable m mVar) {
        if (!(b0.f36444c.a() == this)) {
            f4.e("Cannot leave snapshot; " + this + " is not the current snapshot");
        }
        B(mVar);
    }

    public final void L() {
        if (this.f36540c) {
            f4.d("Cannot use a disposed snapshot");
        }
    }

    public final void b() {
        synchronized (b0.Q()) {
            try {
                c();
                A();
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void c() {
        b0.f36446e = b0.f36446e.s(p());
    }

    public void d() {
        this.f36540c = true;
        synchronized (b0.Q()) {
            try {
                z();
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final <T> T e(@NotNull Function0<? extends T> function0) {
        m mVarU = u();
        try {
            return function0.invoke();
        } finally {
            kotlin.jvm.internal.h0.d(1);
            B(mVarU);
            kotlin.jvm.internal.h0.c(1);
        }
    }

    public final boolean f() {
        return this.f36540c;
    }

    public int g() {
        return (int) p();
    }

    @NotNull
    public v i() {
        return this.f36538a;
    }

    @Nullable
    public abstract l2<c1> j();

    @Nullable
    public abstract Function1<Object, Unit> l();

    public abstract boolean n();

    @NotNull
    public abstract m o();

    public long p() {
        return this.f36539b;
    }

    public int q() {
        return 0;
    }

    @Nullable
    public abstract Function1<Object, Unit> r();

    public abstract boolean s();

    public final boolean t() {
        return this.f36541d >= 0;
    }

    @kotlin.a1
    @Nullable
    public m u() {
        m mVar = (m) b0.f36444c.a();
        b0.f36444c.b(this);
        return mVar;
    }

    public abstract void v(@NotNull m mVar);

    public abstract void w(@NotNull m mVar);

    public abstract void x();

    public abstract void y(@NotNull c1 c1Var);

    public final void z() {
        int i10 = this.f36541d;
        if (i10 >= 0) {
            b0.m0(i10);
            this.f36541d = -1;
        }
    }

    public /* synthetic */ m(long j10, v vVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, vVar);
    }

    private m(long j10, v vVar) {
        this.f36538a = vVar;
        this.f36539b = j10;
        this.f36541d = j10 != b0.f36443b ? b0.s0(j10, i()) : -1;
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Use id: Long constructor instead")
    private /* synthetic */ m(int i10, v vVar) {
        this(w.s(i10), vVar, (DefaultConstructorMarker) null);
    }
}
