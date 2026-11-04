package androidx.compose.runtime;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nSnapshotIntState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotMutableIntStateImpl\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,199:1\n2474#2:200\n2391#2,2:201\n1893#2:203\n2393#2,4:205\n2474#2:210\n2474#2:211\n33#3:204\n1#4:209\n*S KotlinDebug\n*F\n+ 1 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotMutableIntStateImpl\n*L\n147#1:200\n149#1:201,2\n149#1:203\n149#1:205,4\n181#1:210\n185#1:211\n149#1:204\n149#1:209\n*E\n"})
public class p6 extends androidx.compose.runtime.snapshots.d1 implements l3, androidx.compose.runtime.snapshots.g0<Integer> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f36315d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private a f36316c;

    private static final class a extends androidx.compose.runtime.snapshots.e1 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f36317d;

        public a(long j10, int i10) {
            super(j10);
            this.f36317d = i10;
        }

        @Override // androidx.compose.runtime.snapshots.e1
        public void b(@NotNull androidx.compose.runtime.snapshots.e1 e1Var) {
            Intrinsics.checkNotNull(e1Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
            this.f36317d = ((a) e1Var).f36317d;
        }

        @Override // androidx.compose.runtime.snapshots.e1
        @NotNull
        public androidx.compose.runtime.snapshots.e1 c() {
            return f(androidx.compose.runtime.snapshots.b0.N().p());
        }

        @Override // androidx.compose.runtime.snapshots.e1
        @NotNull
        public androidx.compose.runtime.snapshots.e1 f(long j10) {
            return new a(j10, this.f36317d);
        }

        public final int k() {
            return this.f36317d;
        }

        public final void l(int i10) {
            this.f36317d = i10;
        }
    }

    public p6(int i10) {
        androidx.compose.runtime.snapshots.m mVarN = androidx.compose.runtime.snapshots.b0.N();
        a aVar = new a(mVarN.p(), i10);
        if (!(mVarN instanceof androidx.compose.runtime.snapshots.c)) {
            aVar.i(new a(androidx.compose.runtime.snapshots.w.s(1), i10));
        }
        this.f36316c = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E(p6 p6Var, int i10) {
        p6Var.j(i10);
        return Unit.f312394a;
    }

    @r2
    public static /* synthetic */ void G() {
    }

    @Override // androidx.compose.runtime.snapshots.c1
    @NotNull
    public androidx.compose.runtime.snapshots.e1 A() {
        return this.f36316c;
    }

    @oj.i(name = "getDebuggerDisplayValue")
    public final int F() {
        return ((a) androidx.compose.runtime.snapshots.b0.L(this.f36316c)).k();
    }

    @Override // androidx.compose.runtime.snapshots.g0
    @NotNull
    public u6<Integer> c() {
        return w6.z();
    }

    @Override // androidx.compose.runtime.n3
    @NotNull
    public Function1<Integer, Unit> component2() {
        return new Function1() { // from class: androidx.compose.runtime.o6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p6.E(this.f36296a, ((Integer) obj).intValue());
            }
        };
    }

    @Override // androidx.compose.runtime.n3
    @NotNull
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Integer component1() {
        return Integer.valueOf(m1());
    }

    @Override // androidx.compose.runtime.l3
    public void j(int i10) {
        androidx.compose.runtime.snapshots.m mVarF;
        a aVar = (a) androidx.compose.runtime.snapshots.b0.L(this.f36316c);
        if (aVar.k() != i10) {
            a aVar2 = this.f36316c;
            synchronized (androidx.compose.runtime.snapshots.b0.Q()) {
                try {
                    mVarF = androidx.compose.runtime.snapshots.m.f36535e.f();
                    ((a) androidx.compose.runtime.snapshots.b0.f0(aVar2, this, mVarF, aVar)).l(i10);
                    Unit unit = Unit.f312394a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            androidx.compose.runtime.snapshots.b0.c0(mVarF, this);
        }
    }

    @Override // androidx.compose.runtime.l3, androidx.compose.runtime.q2
    public int m1() {
        return ((a) androidx.compose.runtime.snapshots.b0.k0(this.f36316c, this)).k();
    }

    @Override // androidx.compose.runtime.snapshots.c1
    public void p(@NotNull androidx.compose.runtime.snapshots.e1 e1Var) {
        Intrinsics.checkNotNull(e1Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.f36316c = (a) e1Var;
    }

    @Override // androidx.compose.runtime.snapshots.c1
    @Nullable
    public androidx.compose.runtime.snapshots.e1 t(@NotNull androidx.compose.runtime.snapshots.e1 e1Var, @NotNull androidx.compose.runtime.snapshots.e1 e1Var2, @NotNull androidx.compose.runtime.snapshots.e1 e1Var3) {
        Intrinsics.checkNotNull(e1Var2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        Intrinsics.checkNotNull(e1Var3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        if (((a) e1Var2).k() == ((a) e1Var3).k()) {
            return e1Var2;
        }
        return null;
    }

    @NotNull
    public String toString() {
        return "MutableIntState(value=" + ((a) androidx.compose.runtime.snapshots.b0.L(this.f36316c)).k() + ")@" + hashCode();
    }
}
