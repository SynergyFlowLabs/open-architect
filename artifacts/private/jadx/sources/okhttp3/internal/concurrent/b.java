package okhttp3.internal.concurrent;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.q1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class b {
    @NotNull
    public static final String b(long j10) {
        String str;
        if (j10 <= -999500000) {
            str = ((j10 - ((long) 500000000)) / ((long) 1000000000)) + " s ";
        } else if (j10 <= -999500) {
            str = ((j10 - ((long) 500000)) / ((long) 1000000)) + " ms";
        } else if (j10 <= 0) {
            str = ((j10 - ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j10 < 999500) {
            str = ((j10 + ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j10 < 999500000) {
            str = ((j10 + ((long) 500000)) / ((long) 1000000)) + " ms";
        } else {
            str = ((j10 + ((long) 500000000)) / ((long) 1000000000)) + " s ";
        }
        q1 q1Var = q1.f312784a;
        String str2 = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(a aVar, c cVar, String str) {
        Logger loggerA = d.f334057h.a();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(cVar.h());
        sb2.append(' ');
        q1 q1Var = q1.f312784a;
        String str2 = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
        sb2.append(str2);
        sb2.append(": ");
        sb2.append(aVar.b());
        loggerA.fine(sb2.toString());
    }

    public static final <T> T d(@NotNull a task, @NotNull c queue, @NotNull Function0<? extends T> block) {
        long jA;
        Intrinsics.checkNotNullParameter(task, "task");
        Intrinsics.checkNotNullParameter(queue, "queue");
        Intrinsics.checkNotNullParameter(block, "block");
        boolean zIsLoggable = d.f334057h.a().isLoggable(Level.FINE);
        if (zIsLoggable) {
            jA = queue.k().h().a();
            c(task, queue, "starting");
        } else {
            jA = -1;
        }
        try {
            T tInvoke = block.invoke();
            h0.d(1);
            if (zIsLoggable) {
                c(task, queue, "finished run in " + b(queue.k().h().a() - jA));
            }
            h0.c(1);
            return tInvoke;
        } catch (Throwable th2) {
            h0.d(1);
            if (zIsLoggable) {
                c(task, queue, "failed a run in " + b(queue.k().h().a() - jA));
            }
            h0.c(1);
            throw th2;
        }
    }

    public static final void e(@NotNull a task, @NotNull c queue, @NotNull Function0<String> messageBlock) {
        Intrinsics.checkNotNullParameter(task, "task");
        Intrinsics.checkNotNullParameter(queue, "queue");
        Intrinsics.checkNotNullParameter(messageBlock, "messageBlock");
        if (d.f334057h.a().isLoggable(Level.FINE)) {
            c(task, queue, messageBlock.invoke());
        }
    }
}
