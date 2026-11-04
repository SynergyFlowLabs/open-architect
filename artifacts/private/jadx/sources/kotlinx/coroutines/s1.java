package kotlinx.coroutines;

import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoop\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,547:1\n1#2:548\n*E\n"})
public abstract class s1 extends n0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f315434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f315435c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private ArrayDeque<i1<?>> f315436d;

    public static /* synthetic */ void O0(s1 s1Var, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        s1Var.M0(z10);
    }

    private final long R0(boolean z10) {
        return z10 ? 4294967296L : 1L;
    }

    public static /* synthetic */ void g1(s1 s1Var, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        s1Var.e1(z10);
    }

    public final void M0(boolean z10) {
        long jR0 = this.f315434b - R0(z10);
        this.f315434b = jR0;
        if (jR0 <= 0 && this.f315435c) {
            shutdown();
        }
    }

    public final void T0(@NotNull i1<?> i1Var) {
        ArrayDeque<i1<?>> arrayDeque = this.f315436d;
        if (arrayDeque == null) {
            arrayDeque = new ArrayDeque<>();
            this.f315436d = arrayDeque;
        }
        arrayDeque.addLast(i1Var);
    }

    protected long U0() {
        ArrayDeque<i1<?>> arrayDeque = this.f315436d;
        return (arrayDeque == null || arrayDeque.isEmpty()) ? Long.MAX_VALUE : 0L;
    }

    @Override // kotlinx.coroutines.n0
    @NotNull
    public final n0 Y(int i10, @Nullable String str) {
        kotlinx.coroutines.internal.a0.a(i10);
        return kotlinx.coroutines.internal.a0.b(this, str);
    }

    public final void e1(boolean z10) {
        this.f315434b += R0(z10);
        if (!z10) {
            this.f315435c = true;
        }
    }

    protected boolean h1() {
        return p1();
    }

    public final boolean isActive() {
        return this.f315434b > 0;
    }

    public final boolean j1() {
        return this.f315434b >= R0(true);
    }

    public final boolean p1() {
        ArrayDeque<i1<?>> arrayDeque = this.f315436d;
        if (arrayDeque != null) {
            return arrayDeque.isEmpty();
        }
        return true;
    }

    public long s1() {
        return !u1() ? Long.MAX_VALUE : 0L;
    }

    public void shutdown() {
    }

    public final boolean u1() {
        i1<?> i1VarRemoveFirstOrNull;
        ArrayDeque<i1<?>> arrayDeque = this.f315436d;
        if (arrayDeque == null || (i1VarRemoveFirstOrNull = arrayDeque.removeFirstOrNull()) == null) {
            return false;
        }
        i1VarRemoveFirstOrNull.run();
        return true;
    }

    public boolean w1() {
        return false;
    }
}
