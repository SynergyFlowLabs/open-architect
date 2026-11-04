package io.ktor.util;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class a1 {
    @NotNull
    public static final ByteBuffer a(@NotNull ByteBuffer byteBuffer, int i10) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i10);
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        Intrinsics.checkNotNullExpressionValue(byteBufferSlice, "slice(...)");
        Intrinsics.checkNotNull(byteBufferAllocate);
        h(byteBufferSlice, byteBufferAllocate, 0, 2, null);
        byteBufferAllocate.clear();
        Intrinsics.checkNotNullExpressionValue(byteBufferAllocate, "apply(...)");
        return byteBufferAllocate;
    }

    @NotNull
    public static final ByteBuffer b(@NotNull ByteBuffer byteBuffer, @NotNull io.ktor.utils.io.pool.h<ByteBuffer> pool, int i10) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        Intrinsics.checkNotNullParameter(pool, "pool");
        ByteBuffer byteBufferJc = pool.Jc();
        byteBufferJc.limit(i10);
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        Intrinsics.checkNotNullExpressionValue(byteBufferSlice, "slice(...)");
        h(byteBufferSlice, byteBufferJc, 0, 2, null);
        byteBufferJc.flip();
        return byteBufferJc;
    }

    public static /* synthetic */ ByteBuffer c(ByteBuffer byteBuffer, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = byteBuffer.remaining();
        }
        return a(byteBuffer, i10);
    }

    public static /* synthetic */ ByteBuffer d(ByteBuffer byteBuffer, io.ktor.utils.io.pool.h hVar, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = byteBuffer.remaining();
        }
        return b(byteBuffer, hVar, i10);
    }

    @NotNull
    public static final String e(@NotNull ByteBuffer byteBuffer, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        String string = charset.decode(byteBuffer).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String f(ByteBuffer byteBuffer, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        return e(byteBuffer, charset);
    }

    public static final int g(@NotNull ByteBuffer byteBuffer, @NotNull ByteBuffer destination, int i10) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        int iMin = Math.min(i10, Math.min(byteBuffer.remaining(), destination.remaining()));
        if (iMin == byteBuffer.remaining()) {
            destination.put(byteBuffer);
            return iMin;
        }
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(byteBuffer.position() + iMin);
        destination.put(byteBuffer);
        byteBuffer.limit(iLimit);
        return iMin;
    }

    public static /* synthetic */ int h(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        return g(byteBuffer, byteBuffer2, i10);
    }

    @NotNull
    public static final byte[] i(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return bArr;
    }
}
