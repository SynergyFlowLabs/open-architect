package ui;

import java.io.Closeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class m {
    @kotlin.l(message = "Use stdlib implementation instead. Remove import of this function")
    public static final <T extends Closeable, R> R a(T t10, @NotNull Function1<? super T, ? extends R> block) throws Exception {
        Intrinsics.checkNotNullParameter(block, "block");
        int i10 = 6 & 1;
        try {
            R rInvoke = block.invoke(t10);
            h0.d(1);
            kotlin.jdk7.a.c(t10, null);
            h0.c(1);
            return rInvoke;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                h0.d(1);
                kotlin.jdk7.a.c(t10, th2);
                h0.c(1);
                throw th3;
            }
        }
    }
}
