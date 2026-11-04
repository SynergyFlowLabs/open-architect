package kotlinx.coroutines.rx2;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.p0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class j {
    public static final void a(@NotNull Throwable th2, @NotNull CoroutineContext coroutineContext) {
        if (th2 instanceof CancellationException) {
            return;
        }
        try {
            io.reactivex.plugins.a.Y(th2);
        } catch (Throwable th3) {
            kotlin.p.a(th2, th3);
            p0.b(coroutineContext, th2);
        }
    }
}
