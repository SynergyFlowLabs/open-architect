package kotlinx.coroutines.future;

import java.util.concurrent.CompletionException;
import java.util.function.BiFunction;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
final class c<T> implements BiFunction<T, Throwable, Unit> {

    @oj.f
    @Nullable
    public volatile kotlin.coroutines.d<? super T> cont;

    public c(@Nullable kotlin.coroutines.d<? super T> dVar) {
        this.cont = dVar;
    }

    public void a(@Nullable T t10, @Nullable Throwable th2) {
        Throwable cause;
        kotlin.coroutines.d<? super T> dVar = this.cont;
        if (dVar == null) {
            return;
        }
        if (th2 == null) {
            Result.a aVar = Result.Companion;
            dVar.resumeWith(Result.m785constructorimpl(t10));
            return;
        }
        CompletionException completionException = th2 instanceof CompletionException ? (CompletionException) th2 : null;
        if (completionException != null && (cause = completionException.getCause()) != null) {
            th2 = cause;
        }
        Result.a aVar2 = Result.Companion;
        dVar.resumeWith(Result.m785constructorimpl(ResultKt.createFailure(th2)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.function.BiFunction
    public /* bridge */ /* synthetic */ Unit apply(Object obj, Throwable th2) {
        a(obj, th2);
        return Unit.f312394a;
    }
}
