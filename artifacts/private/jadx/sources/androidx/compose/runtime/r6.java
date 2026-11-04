package androidx.compose.runtime;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nSnapshotLongState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotLongState.kt\nandroidx/compose/runtime/SnapshotMutableLongStateImpl\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,192:1\n2474#2:193\n2391#2,2:194\n1893#2:196\n2393#2,4:198\n2474#2:203\n33#3:197\n1#4:202\n*S KotlinDebug\n*F\n+ 1 SnapshotLongState.kt\nandroidx/compose/runtime/SnapshotMutableLongStateImpl\n*L\n144#1:193\n146#1:194,2\n146#1:196\n146#1:198,4\n178#1:203\n146#1:197\n146#1:202\n*E\n"})
public class r6 extends androidx.compose.runtime.snapshots.d1 implements m3, androidx.compose.runtime.snapshots.g0<Long> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f36338d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private a f36339c;

    private static final class a extends androidx.compose.runtime.snapshots.e1 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f36340d;

        public a(long j10, long j11) {
            super(j10);
            this.f36340d = j11;
        }

        @Override // androidx.compose.runtime.snapshots.e1
        public void b(@NotNull androidx.compose.runtime.snapshots.e1 e1Var) {
            Intrinsics.checkNotNull(e1Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
            this.f36340d = ((a) e1Var).f36340d;
        }

        @Override // androidx.compose.runtime.snapshots.e1
        @NotNull
        public androidx.compose.runtime.snapshots.e1 c() {
            return f(androidx.compose.runtime.snapshots.b0.N().p());
        }

        @Override // androidx.compose.runtime.snapshots.e1
        @NotNull
        public androidx.compose.runtime.snapshots.e1 f(long j10) {
            return new a(j10, this.f36340d);
        }

        public final long k() {
            return this.f36340d;
        }

        public final void l(long j10) {
            this.f36340d = j10;
        }
    }

    public r6(long j10) {
        androidx.compose.runtime.snapshots.m mVarN = androidx.compose.runtime.snapshots.b0.N();
        a aVar = new a(mVarN.p(), j10);
        if (!(mVarN instanceof androidx.compose.runtime.snapshots.c)) {
            aVar.i(new a(androidx.compose.runtime.snapshots.w.s(1), j10));
        }
        this.f36339c = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E(r6 r6Var, long j10) {
        r6Var.C(j10);
        return Unit.f312394a;
    }

    @Override // androidx.compose.runtime.snapshots.c1
    @NotNull
    public androidx.compose.runtime.snapshots.e1 A() {
        return this.f36339c;
    }

    @Override // androidx.compose.runtime.m3
    public void C(long j10) {
        androidx.compose.runtime.snapshots.m mVarF;
        a aVar = (a) androidx.compose.runtime.snapshots.b0.L(this.f36339c);
        if (aVar.k() != j10) {
            a aVar2 = this.f36339c;
            synchronized (androidx.compose.runtime.snapshots.b0.Q()) {
                try {
                    mVarF = androidx.compose.runtime.snapshots.m.f36535e.f();
                    ((a) androidx.compose.runtime.snapshots.b0.f0(aVar2, this, mVarF, aVar)).l(j10);
                    Unit unit = Unit.f312394a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            androidx.compose.runtime.snapshots.b0.c0(mVarF, this);
        }
    }

    @Override // androidx.compose.runtime.snapshots.g0
    @NotNull
    public u6<Long> c() {
        return w6.z();
    }

    @Override // androidx.compose.runtime.n3
    @NotNull
    public Function1<Long, Unit> component2() {
        return new Function1() { // from class: androidx.compose.runtime.q6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return r6.E(this.f36323a, ((Long) obj).longValue());
            }
        };
    }

    @Override // androidx.compose.runtime.m3, androidx.compose.runtime.b3
    public long e() {
        return ((a) androidx.compose.runtime.snapshots.b0.k0(this.f36339c, this)).k();
    }

    @Override // androidx.compose.runtime.n3
    @NotNull
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Long component1() {
        return Long.valueOf(e());
    }

    @Override // androidx.compose.runtime.snapshots.c1
    public void p(@NotNull androidx.compose.runtime.snapshots.e1 e1Var) {
        Intrinsics.checkNotNull(e1Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.f36339c = (a) e1Var;
    }

    @Override // androidx.compose.runtime.snapshots.c1
    @Nullable
    public androidx.compose.runtime.snapshots.e1 t(@NotNull androidx.compose.runtime.snapshots.e1 e1Var, @NotNull androidx.compose.runtime.snapshots.e1 e1Var2, @NotNull androidx.compose.runtime.snapshots.e1 e1Var3) {
        Intrinsics.checkNotNull(e1Var2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        Intrinsics.checkNotNull(e1Var3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        if (((a) e1Var2).k() == ((a) e1Var3).k()) {
            return e1Var2;
        }
        return null;
    }

    @NotNull
    public String toString() {
        return "MutableLongState(value=" + ((a) androidx.compose.runtime.snapshots.b0.L(this.f36339c)).k() + ")@" + hashCode();
    }
}
