package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class g1 extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Throwable f315016a;

    public g1(@NotNull Throwable th2, @NotNull n0 n0Var, @NotNull CoroutineContext coroutineContext) {
        super("Coroutine dispatcher " + n0Var + " threw an exception, context = " + coroutineContext, th2);
        this.f315016a = th2;
    }

    @Override // java.lang.Throwable
    @NotNull
    public Throwable getCause() {
        return this.f315016a;
    }
}
