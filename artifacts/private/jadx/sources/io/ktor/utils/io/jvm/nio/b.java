package io.ktor.utils.io.jvm.nio;

import io.ktor.utils.io.h;
import java.nio.channels.ReadableByteChannel;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.l1;
import kotlinx.io.p;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class b {
    @NotNull
    public static final p a(@NotNull ReadableByteChannel readableByteChannel) {
        Intrinsics.checkNotNullParameter(readableByteChannel, "<this>");
        return new a(readableByteChannel);
    }

    @NotNull
    public static final h b(@NotNull ReadableByteChannel readableByteChannel, @NotNull CoroutineContext context) {
        Intrinsics.checkNotNullParameter(readableByteChannel, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        return new io.ktor.utils.io.jvm.javaio.b(a(readableByteChannel), context);
    }

    public static /* synthetic */ h c(ReadableByteChannel readableByteChannel, CoroutineContext coroutineContext, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = l1.c();
        }
        return b(readableByteChannel, coroutineContext);
    }
}
