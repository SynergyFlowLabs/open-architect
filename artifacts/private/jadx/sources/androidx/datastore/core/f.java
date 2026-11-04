package androidx.datastore.core;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class f {
    public static final <T extends e, R> R a(@NotNull T t10, @NotNull Function1<? super T, ? extends R> block) throws Throwable {
        Intrinsics.checkNotNullParameter(t10, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            R rInvoke = block.invoke(t10);
            kotlin.jvm.internal.h0.d(1);
            try {
                t10.close();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
            if (th != null) {
                throw th;
            }
            kotlin.jvm.internal.h0.c(1);
            return rInvoke;
        } catch (Throwable th3) {
            kotlin.jvm.internal.h0.d(1);
            try {
                t10.close();
            } catch (Throwable th4) {
                kotlin.p.a(th3, th4);
            }
            throw th3;
        }
    }
}
