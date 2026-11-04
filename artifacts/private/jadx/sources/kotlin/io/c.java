package kotlin.io;

import java.io.Closeable;
import java.io.IOException;
import kotlin.a1;
import kotlin.e1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@oj.i(name = "CloseableKt")
public final class c {
    @a1
    @e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    public static final void a(@Nullable Closeable closeable, @Nullable Throwable th2) throws IOException {
        if (closeable != null) {
            if (th2 == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th3) {
                kotlin.p.a(th2, th3);
            }
        }
    }

    @kotlin.internal.f
    private static final <T extends Closeable, R> R b(T t10, Function1<? super T, ? extends R> block) throws IOException {
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            R rInvoke = block.invoke(t10);
            h0.d(1);
            if (kotlin.internal.m.a(1, 1, 0)) {
                a(t10, null);
            } else if (t10 != null) {
                t10.close();
            }
            h0.c(1);
            return rInvoke;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                h0.d(1);
                if (kotlin.internal.m.a(1, 1, 0)) {
                    a(t10, th2);
                } else if (t10 != null) {
                    try {
                        t10.close();
                    } catch (Throwable unused) {
                    }
                }
                h0.c(1);
                throw th3;
            }
        }
    }
}
