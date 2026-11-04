package io.ktor.utils.io.jvm.javaio;

import io.ktor.utils.io.h;
import java.io.InputStream;
import java.nio.ByteBuffer;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.l1;
import kotlinx.io.l;
import oj.i;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class c {
    @NotNull
    public static final h a(@NotNull InputStream inputStream, @NotNull CoroutineContext context, @NotNull io.ktor.utils.io.pool.h<ByteBuffer> pool) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pool, "pool");
        return new b(l.b(inputStream), context);
    }

    public static /* synthetic */ h b(InputStream inputStream, CoroutineContext coroutineContext, io.ktor.utils.io.pool.h hVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = l1.c();
        }
        return a(inputStream, coroutineContext, hVar);
    }

    @i(name = "toByteReadChannelWithArrayPool")
    @NotNull
    public static final h c(@NotNull InputStream inputStream, @NotNull CoroutineContext context, @NotNull io.ktor.utils.io.pool.h<byte[]> pool) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pool, "pool");
        return new b(l.b(inputStream), context);
    }

    public static /* synthetic */ h d(InputStream inputStream, CoroutineContext coroutineContext, io.ktor.utils.io.pool.h hVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = l1.c();
        }
        if ((i10 & 2) != 0) {
            hVar = io.ktor.utils.io.pool.a.a();
        }
        return c(inputStream, coroutineContext, hVar);
    }
}
