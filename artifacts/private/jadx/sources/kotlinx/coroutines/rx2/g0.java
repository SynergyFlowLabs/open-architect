package kotlinx.coroutines.rx2;

import io.reactivex.j0;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.c1;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.o1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nRxScheduler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RxScheduler.kt\nkotlinx/coroutines/rx2/SchedulerCoroutineDispatcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,178:1\n1#2:179\n*E\n"})
public final class g0 extends n0 implements c1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final j0 f315347b;

    public g0(@NotNull j0 j0Var) {
        this.f315347b = j0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T0(io.reactivex.disposables.c cVar) {
        cVar.dispose();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U0(kotlinx.coroutines.n nVar, g0 g0Var) {
        nVar.n0(g0Var, Unit.f312394a);
    }

    @NotNull
    public final j0 R0() {
        return this.f315347b;
    }

    @Override // kotlinx.coroutines.c1
    public void b(long j10, @NotNull final kotlinx.coroutines.n<? super Unit> nVar) {
        h.q(nVar, this.f315347b.f(new Runnable() { // from class: kotlinx.coroutines.rx2.f0
            @Override // java.lang.Runnable
            public final void run() {
                g0.U0(nVar, this);
            }
        }, j10, TimeUnit.MILLISECONDS));
    }

    @Override // kotlinx.coroutines.c1
    @NotNull
    public o1 d(long j10, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext) {
        final io.reactivex.disposables.c cVarF = this.f315347b.f(runnable, j10, TimeUnit.MILLISECONDS);
        return new o1() { // from class: kotlinx.coroutines.rx2.e0
            @Override // kotlinx.coroutines.o1
            public final void dispose() {
                g0.T0(cVarF);
            }
        };
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof g0) && ((g0) obj).f315347b == this.f315347b;
    }

    @Override // kotlinx.coroutines.c1
    @kotlin.l(level = kotlin.n.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    @Nullable
    public Object g(long j10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        return c1.a.a(this, j10, dVar);
    }

    @Override // kotlinx.coroutines.n0
    public void h(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        this.f315347b.e(runnable);
    }

    public int hashCode() {
        return System.identityHashCode(this.f315347b);
    }

    @Override // kotlinx.coroutines.n0
    @NotNull
    public String toString() {
        return this.f315347b.toString();
    }
}
