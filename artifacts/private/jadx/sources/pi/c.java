package pi;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class c {
    public static final void a(@NotNull org.slf4j.c cVar, @NotNull Throwable exception) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(exception, "exception");
        String message = exception.getMessage();
        if (message == null) {
            message = "Exception of type " + j1.d(exception.getClass());
        }
        cVar.c(message, exception);
    }

    public static final void b(@NotNull org.slf4j.c cVar, @NotNull Function0<String> message) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(message, "message");
        if (b.a(cVar)) {
            cVar.J(message.invoke());
        }
    }
}
