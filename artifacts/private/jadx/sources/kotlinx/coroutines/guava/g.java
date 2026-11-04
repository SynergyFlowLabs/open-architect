package kotlinx.coroutines.guava;

import com.google.common.util.concurrent.f3;
import com.google.common.util.concurrent.t1;
import java.util.concurrent.ExecutionException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlinx.coroutines.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
final class g<T> implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final t1<T> f315030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final n<T> f315031b;

    /* JADX WARN: Multi-variable type inference failed */
    public g(@NotNull t1<T> t1Var, @NotNull n<? super T> nVar) {
        this.f315030a = t1Var;
        this.f315031b = nVar;
    }

    @NotNull
    public final n<T> a() {
        return this.f315031b;
    }

    @NotNull
    public final t1<T> b() {
        return this.f315030a;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f315030a.isCancelled()) {
            n.a.a(this.f315031b, null, 1, null);
            return;
        }
        try {
            n<T> nVar = this.f315031b;
            Result.a aVar = Result.Companion;
            nVar.resumeWith(Result.m785constructorimpl(f3.f(this.f315030a)));
        } catch (ExecutionException e10) {
            n<T> nVar2 = this.f315031b;
            Result.a aVar2 = Result.Companion;
            nVar2.resumeWith(Result.m785constructorimpl(ResultKt.createFailure(f.k(e10))));
        }
    }
}
