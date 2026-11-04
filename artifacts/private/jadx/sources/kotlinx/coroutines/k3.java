package kotlinx.coroutines;

import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nExecutors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Executors.kt\nkotlinx/coroutines/ResumeUndispatchedRunnable\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,212:1\n1#2:213\n*E\n"})
final class k3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final n0 f315164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final n<Unit> f315165b;

    /* JADX WARN: Multi-variable type inference failed */
    public k3(@NotNull n0 n0Var, @NotNull n<? super Unit> nVar) {
        this.f315164a = n0Var;
        this.f315165b = nVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f315165b.n0(this.f315164a, Unit.f312394a);
    }
}
