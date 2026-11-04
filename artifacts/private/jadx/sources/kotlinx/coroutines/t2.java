package kotlinx.coroutines;

import java.util.concurrent.Future;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
final /* synthetic */ class t2 {
    @kotlin.l(level = kotlin.n.WARNING, message = "This function does not do what its name implies: it will not cancel the future if just cancel() was called.", replaceWith = @kotlin.b1(expression = "this.invokeOnCancellation { future.cancel(false) }", imports = {}))
    public static final void a(@NotNull n<?> nVar, @NotNull Future<?> future) {
        r.c(nVar, new h3(future));
    }
}
