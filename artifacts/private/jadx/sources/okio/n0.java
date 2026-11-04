package okio;

import java.io.Closeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
final /* synthetic */ class n0 {
    @oj.i(name = "blackhole")
    @NotNull
    public static final z0 a() {
        return new k();
    }

    @NotNull
    public static final m b(@NotNull z0 z0Var) {
        Intrinsics.checkNotNullParameter(z0Var, "<this>");
        return new u0(z0Var);
    }

    @NotNull
    public static final n c(@NotNull b1 b1Var) {
        Intrinsics.checkNotNullParameter(b1Var, "<this>");
        return new v0(b1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    public static final <T extends Closeable, R> R d(T t10, @NotNull Function1<? super T, ? extends R> block) {
        ?? r10;
        Intrinsics.checkNotNullParameter(block, "block");
        R th2 = null;
        try {
            R rInvoke = block.invoke(t10);
            kotlin.jvm.internal.h0.d(1);
            if (t10 != null) {
                try {
                    t10.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
            kotlin.jvm.internal.h0.c(1);
            R r11 = th2;
            th2 = rInvoke;
            r10 = r11;
        } catch (Throwable th4) {
            kotlin.jvm.internal.h0.d(1);
            if (t10 != null) {
                try {
                    t10.close();
                } catch (Throwable th5) {
                    kotlin.p.a(th4, th5);
                }
            }
            kotlin.jvm.internal.h0.c(1);
            r10 = th4;
        }
        if (r10 == 0) {
            return th2;
        }
        throw r10;
    }
}
