package kotlinx.coroutines.internal;

import java.util.Iterator;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class j {
    public static final void a(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th2) {
        Iterator<kotlinx.coroutines.o0> it = i.b().iterator();
        while (it.hasNext()) {
            try {
                it.next().handleException(coroutineContext, th2);
            } catch (o unused) {
                return;
            } catch (Throwable th3) {
                i.c(kotlinx.coroutines.p0.c(th2, th3));
            }
        }
        try {
            kotlin.p.a(th2, new l(coroutineContext));
        } catch (Throwable unused2) {
        }
        i.c(th2);
    }
}
