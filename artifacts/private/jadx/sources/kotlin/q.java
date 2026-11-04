package kotlin;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes11.dex */
public class q {
    @kotlin.internal.e
    @e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    public static void a(@NotNull Throwable th2, @NotNull Throwable exception) throws IllegalAccessException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(th2, "<this>");
        Intrinsics.checkNotNullParameter(exception, "exception");
        if (th2 != exception) {
            kotlin.internal.m.f312513a.a(th2, exception);
        }
    }

    @NotNull
    public static final StackTraceElement[] b(@NotNull Throwable th2) {
        Intrinsics.checkNotNullParameter(th2, "<this>");
        StackTraceElement[] stackTrace = th2.getStackTrace();
        Intrinsics.checkNotNull(stackTrace);
        return stackTrace;
    }

    public static /* synthetic */ void c(Throwable th2) {
    }

    @NotNull
    public static List<Throwable> d(@NotNull Throwable th2) {
        Intrinsics.checkNotNullParameter(th2, "<this>");
        return kotlin.internal.m.f312513a.d(th2);
    }

    @e1(version = "1.4")
    public static /* synthetic */ void e(Throwable th2) {
    }

    @kotlin.internal.f
    private static final void f(Throwable th2) {
        Intrinsics.checkNotNullParameter(th2, "<this>");
        th2.printStackTrace();
    }

    @kotlin.internal.f
    private static final void g(Throwable th2, PrintStream stream) {
        Intrinsics.checkNotNullParameter(th2, "<this>");
        Intrinsics.checkNotNullParameter(stream, "stream");
        th2.printStackTrace(stream);
    }

    @kotlin.internal.f
    private static final void h(Throwable th2, PrintWriter writer) {
        Intrinsics.checkNotNullParameter(th2, "<this>");
        Intrinsics.checkNotNullParameter(writer, "writer");
        th2.printStackTrace(writer);
    }

    @e1(version = "1.4")
    @NotNull
    public static String i(@NotNull Throwable th2) {
        Intrinsics.checkNotNullParameter(th2, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th2.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
