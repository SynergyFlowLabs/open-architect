package androidx.compose.runtime;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 2)
@SourceDebugExtension({"SMAP\nSnapshotState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotState.kt\nandroidx/compose/runtime/SnapshotMutableStateImpl\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,337:1\n2474#2:338\n2391#2,2:339\n1893#2:341\n2393#2,4:343\n2474#2:349\n2474#2:350\n33#3:342\n1#4:347\n1#4:348\n*S KotlinDebug\n*F\n+ 1 SnapshotState.kt\nandroidx/compose/runtime/SnapshotMutableStateImpl\n*L\n144#1:338\n146#1:339,2\n146#1:341\n146#1:343,4\n189#1:349\n226#1:350\n146#1:342\n146#1:347\n*E\n"})
public class t6<T> extends androidx.compose.runtime.snapshots.d1 implements androidx.compose.runtime.snapshots.g0<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f36661e = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final u6<T> f36662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private a<T> f36663d;

    private static final class a<T> extends androidx.compose.runtime.snapshots.e1 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private T f36664d;

        public a(long j10, T t10) {
            super(j10);
            this.f36664d = t10;
        }

        @Override // androidx.compose.runtime.snapshots.e1
        public void b(@NotNull androidx.compose.runtime.snapshots.e1 e1Var) {
            Intrinsics.checkNotNull(e1Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>");
            this.f36664d = ((a) e1Var).f36664d;
        }

        @Override // androidx.compose.runtime.snapshots.e1
        @NotNull
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public a<T> c() {
            return new a<>(androidx.compose.runtime.snapshots.b0.N().p(), this.f36664d);
        }

        @Override // androidx.compose.runtime.snapshots.e1
        @NotNull
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public a<T> f(long j10) {
            return new a<>(androidx.compose.runtime.snapshots.b0.N().p(), this.f36664d);
        }

        public final T m() {
            return this.f36664d;
        }

        public final void n(T t10) {
            this.f36664d = t10;
        }
    }

    public t6(T t10, @NotNull u6<T> u6Var) {
        this.f36662c = u6Var;
        androidx.compose.runtime.snapshots.m mVarN = androidx.compose.runtime.snapshots.b0.N();
        a<T> aVar = new a<>(mVarN.p(), t10);
        if (!(mVarN instanceof androidx.compose.runtime.snapshots.c)) {
            aVar.i(new a(androidx.compose.runtime.snapshots.w.s(1), t10));
        }
        this.f36663d = aVar;
    }

    public static /* synthetic */ void F() {
    }

    public static /* synthetic */ void G() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(t6 t6Var, Object obj) {
        t6Var.setValue(obj);
        return Unit.f312394a;
    }

    @Override // androidx.compose.runtime.snapshots.c1
    @NotNull
    public androidx.compose.runtime.snapshots.e1 A() {
        return this.f36663d;
    }

    @oj.i(name = "getDebuggerDisplayValue")
    public final T E() {
        return (T) ((a) androidx.compose.runtime.snapshots.b0.L(this.f36663d)).m();
    }

    @Override // androidx.compose.runtime.snapshots.g0
    @NotNull
    public u6<T> c() {
        return this.f36662c;
    }

    @Override // androidx.compose.runtime.n3
    public T component1() {
        return getValue();
    }

    @Override // androidx.compose.runtime.n3
    @NotNull
    public Function1<T, Unit> component2() {
        return new Function1() { // from class: androidx.compose.runtime.s6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t6.h(this.f36378a, obj);
            }
        };
    }

    @Override // androidx.compose.runtime.n3, androidx.compose.runtime.n7
    public T getValue() {
        return (T) ((a) androidx.compose.runtime.snapshots.b0.k0(this.f36663d, this)).m();
    }

    @Override // androidx.compose.runtime.snapshots.c1
    public void p(@NotNull androidx.compose.runtime.snapshots.e1 e1Var) {
        Intrinsics.checkNotNull(e1Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        this.f36663d = (a) e1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.n3
    public void setValue(T t10) {
        androidx.compose.runtime.snapshots.m mVarF;
        a aVar = (a) androidx.compose.runtime.snapshots.b0.L(this.f36663d);
        if (c().b(aVar.m(), t10)) {
            return;
        }
        a<T> aVar2 = this.f36663d;
        synchronized (androidx.compose.runtime.snapshots.b0.Q()) {
            try {
                mVarF = androidx.compose.runtime.snapshots.m.f36535e.f();
                ((a) androidx.compose.runtime.snapshots.b0.f0(aVar2, this, mVarF, aVar)).n(t10);
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        androidx.compose.runtime.snapshots.b0.c0(mVarF, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.snapshots.c1
    @Nullable
    public androidx.compose.runtime.snapshots.e1 t(@NotNull androidx.compose.runtime.snapshots.e1 e1Var, @NotNull androidx.compose.runtime.snapshots.e1 e1Var2, @NotNull androidx.compose.runtime.snapshots.e1 e1Var3) {
        Intrinsics.checkNotNull(e1Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        a aVar = (a) e1Var;
        Intrinsics.checkNotNull(e1Var2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        a aVar2 = (a) e1Var2;
        Intrinsics.checkNotNull(e1Var3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        a aVar3 = (a) e1Var3;
        if (c().b(aVar2.m(), aVar3.m())) {
            return e1Var2;
        }
        Object objC = c().c(aVar.m(), aVar2.m(), aVar3.m());
        if (objC == null) {
            return null;
        }
        a aVarF = aVar3.f(aVar3.h());
        aVarF.n(objC);
        return aVarF;
    }

    @NotNull
    public String toString() {
        return "MutableState(value=" + ((a) androidx.compose.runtime.snapshots.b0.L(this.f36663d)).m() + ")@" + hashCode();
    }
}
