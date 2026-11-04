package io.ktor.util.cio;

import java.io.InputStream;
import java.nio.ByteBuffer;
import kotlin.b1;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.u2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class i {
    @kotlin.l(message = "Use variant from 'ktor-io' module instead", replaceWith = @b1(expression = "this.toByteReadChannel(context + parent, pool)", imports = {"io.ktor.utils.io.jvm.javaio.toByteReadChannel"}))
    @NotNull
    public static final io.ktor.utils.io.h a(@NotNull InputStream inputStream, @NotNull io.ktor.utils.io.pool.h<ByteBuffer> pool, @NotNull CoroutineContext context, @NotNull p2 parent) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        Intrinsics.checkNotNullParameter(pool, "pool");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(parent, "parent");
        return io.ktor.utils.io.jvm.javaio.c.a(inputStream, context.plus(parent), pool);
    }

    public static /* synthetic */ io.ktor.utils.io.h b(InputStream inputStream, io.ktor.utils.io.pool.h hVar, CoroutineContext coroutineContext, p2 p2Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            hVar = a.a();
        }
        if ((i10 & 2) != 0) {
            coroutineContext = l1.g();
        }
        if ((i10 & 4) != 0) {
            p2Var = u2.c(null, 1, null);
        }
        return a(inputStream, hVar, coroutineContext, p2Var);
    }
}
