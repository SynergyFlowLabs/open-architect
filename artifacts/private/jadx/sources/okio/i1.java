package okio;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class i1 {
    @NotNull
    public static final byte[] a(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return bytes;
    }

    @NotNull
    public static final ReentrantLock b() {
        return new ReentrantLock();
    }

    @NotNull
    public static final String c(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return new String(bArr, Charsets.UTF_8);
    }

    public static final <T> T d(@NotNull ReentrantLock reentrantLock, @NotNull Function0<? extends T> action) {
        Intrinsics.checkNotNullParameter(reentrantLock, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        reentrantLock.lock();
        try {
            T tInvoke = action.invoke();
            kotlin.jvm.internal.h0.d(1);
            reentrantLock.unlock();
            kotlin.jvm.internal.h0.c(1);
            return tInvoke;
        } catch (Throwable th2) {
            kotlin.jvm.internal.h0.d(1);
            reentrantLock.unlock();
            kotlin.jvm.internal.h0.c(1);
            throw th2;
        }
    }
}
