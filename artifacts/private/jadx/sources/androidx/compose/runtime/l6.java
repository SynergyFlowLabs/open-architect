package androidx.compose.runtime;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nSnapshotDoubleState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotDoubleState.kt\nandroidx/compose/runtime/SnapshotMutableDoubleStateImpl\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 FloatingPointEquality.android.kt\nandroidx/compose/runtime/internal/FloatingPointEquality_androidKt\n+ 4 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,194:1\n2474#2:195\n2391#2,2:201\n1893#2:203\n2393#2,4:205\n2474#2:215\n49#3,5:196\n49#3,5:210\n33#4:204\n1#5:209\n*S KotlinDebug\n*F\n+ 1 SnapshotDoubleState.kt\nandroidx/compose/runtime/SnapshotMutableDoubleStateImpl\n*L\n146#1:195\n148#1:201,2\n148#1:203\n148#1:205,4\n180#1:215\n147#1:196,5\n172#1:210,5\n148#1:204\n148#1:209\n*E\n"})
public class l6 extends androidx.compose.runtime.snapshots.d1 implements j3, androidx.compose.runtime.snapshots.g0<Double> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f36218d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private a f36219c;

    private static final class a extends androidx.compose.runtime.snapshots.e1 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private double f36220d;

        public a(long j10, double d10) {
            super(j10);
            this.f36220d = d10;
        }

        @Override // androidx.compose.runtime.snapshots.e1
        public void b(@NotNull androidx.compose.runtime.snapshots.e1 e1Var) {
            Intrinsics.checkNotNull(e1Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord");
            this.f36220d = ((a) e1Var).f36220d;
        }

        @Override // androidx.compose.runtime.snapshots.e1
        @NotNull
        public androidx.compose.runtime.snapshots.e1 c() {
            return f(h());
        }

        @Override // androidx.compose.runtime.snapshots.e1
        @NotNull
        public androidx.compose.runtime.snapshots.e1 f(long j10) {
            return new a(j10, this.f36220d);
        }

        public final double k() {
            return this.f36220d;
        }

        public final void l(double d10) {
            this.f36220d = d10;
        }
    }

    public l6(double d10) {
        androidx.compose.runtime.snapshots.m mVarN = androidx.compose.runtime.snapshots.b0.N();
        a aVar = new a(mVarN.p(), d10);
        if (!(mVarN instanceof androidx.compose.runtime.snapshots.c)) {
            aVar.i(new a(androidx.compose.runtime.snapshots.w.s(1), d10));
        }
        this.f36219c = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E(l6 l6Var, double d10) {
        l6Var.x(d10);
        return Unit.f312394a;
    }

    @Override // androidx.compose.runtime.snapshots.c1
    @NotNull
    public androidx.compose.runtime.snapshots.e1 A() {
        return this.f36219c;
    }

    @Override // androidx.compose.runtime.j3, androidx.compose.runtime.x1
    public double X() {
        return ((a) androidx.compose.runtime.snapshots.b0.k0(this.f36219c, this)).k();
    }

    @Override // androidx.compose.runtime.snapshots.g0
    @NotNull
    public u6<Double> c() {
        return w6.z();
    }

    @Override // androidx.compose.runtime.n3
    @NotNull
    public Function1<Double, Unit> component2() {
        return new Function1() { // from class: androidx.compose.runtime.k6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l6.E(this.f36187a, ((Double) obj).doubleValue());
            }
        };
    }

    @Override // androidx.compose.runtime.n3
    @NotNull
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Double component1() {
        return Double.valueOf(X());
    }

    @Override // androidx.compose.runtime.snapshots.c1
    public void p(@NotNull androidx.compose.runtime.snapshots.e1 e1Var) {
        Intrinsics.checkNotNull(e1Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord");
        this.f36219c = (a) e1Var;
    }

    @Override // androidx.compose.runtime.snapshots.c1
    @Nullable
    public androidx.compose.runtime.snapshots.e1 t(@NotNull androidx.compose.runtime.snapshots.e1 e1Var, @NotNull androidx.compose.runtime.snapshots.e1 e1Var2, @NotNull androidx.compose.runtime.snapshots.e1 e1Var3) {
        Intrinsics.checkNotNull(e1Var2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord");
        Intrinsics.checkNotNull(e1Var3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord");
        if (((a) e1Var2).k() == ((a) e1Var3).k()) {
            return e1Var2;
        }
        return null;
    }

    @NotNull
    public String toString() {
        return "MutableDoubleState(value=" + ((a) androidx.compose.runtime.snapshots.b0.L(this.f36219c)).k() + ")@" + hashCode();
    }

    @Override // androidx.compose.runtime.j3
    public void x(double d10) {
        androidx.compose.runtime.snapshots.m mVarF;
        a aVar = (a) androidx.compose.runtime.snapshots.b0.L(this.f36219c);
        if (aVar.k() == d10) {
            return;
        }
        a aVar2 = this.f36219c;
        synchronized (androidx.compose.runtime.snapshots.b0.Q()) {
            mVarF = androidx.compose.runtime.snapshots.m.f36535e.f();
            ((a) androidx.compose.runtime.snapshots.b0.f0(aVar2, this, mVarF, aVar)).l(d10);
            Unit unit = Unit.f312394a;
        }
        androidx.compose.runtime.snapshots.b0.c0(mVarF, this);
    }
}
