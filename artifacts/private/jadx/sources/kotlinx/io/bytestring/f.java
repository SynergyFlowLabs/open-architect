package kotlinx.io.bytestring;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nByteStringJvmExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteStringJvmExt.kt\nkotlinx/io/bytestring/ByteStringJvmExtKt\n+ 2 UnsafeByteStringOperations.kt\nkotlinx/io/bytestring/unsafe/UnsafeByteStringOperations\n*L\n1#1,137:1\n42#2,2:138\n42#2,2:140\n*S KotlinDebug\n*F\n+ 1 ByteStringJvmExt.kt\nkotlinx/io/bytestring/ByteStringJvmExtKt\n*L\n37#1:138,2\n101#1:140,2\n*E\n"})
public final class f {
    @NotNull
    public static final ByteBuffer a(@NotNull c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        ek.b bVar = ek.b.f274886a;
        ByteBuffer byteBufferAsReadOnlyBuffer = ByteBuffer.wrap(cVar.q()).asReadOnlyBuffer();
        Intrinsics.checkNotNullExpressionValue(byteBufferAsReadOnlyBuffer, "asReadOnlyBuffer(...)");
        return byteBufferAsReadOnlyBuffer;
    }

    private static final void b(ByteBuffer byteBuffer, int i10, int i11) {
        if (i10 < 0 || i10 >= byteBuffer.limit()) {
            throw new IndexOutOfBoundsException("Index " + i10 + " is out of this ByteBuffer's bounds: [0, " + byteBuffer.limit() + ')');
        }
        if (i11 < 0) {
            throw new IndexOutOfBoundsException("length should be non-negative (was " + i11 + ')');
        }
        if (i10 + i11 <= byteBuffer.limit()) {
            return;
        }
        throw new IndexOutOfBoundsException("There's not enough space to put ByteString of length " + i11 + " starting from index " + i10);
    }

    @NotNull
    public static final String c(@NotNull c cVar, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new String(cVar.q(), charset);
    }

    @NotNull
    public static final c d(@NotNull String str, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        c.a aVar = c.f315746c;
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return aVar.b(bytes);
    }

    @NotNull
    public static final c e(@NotNull ByteBuffer byteBuffer, int i10) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("length should be non-negative (was " + i10 + ')');
        }
        if (byteBuffer.remaining() >= i10) {
            byte[] bArr = new byte[i10];
            byteBuffer.get(bArr);
            return ek.b.f274886a.b(bArr);
        }
        throw new IndexOutOfBoundsException("length (" + i10 + ") exceeds remaining bytes count ({" + byteBuffer.remaining() + "})");
    }

    @NotNull
    public static final c f(@NotNull ByteBuffer byteBuffer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        b(byteBuffer, i10, i11);
        byte[] bArr = new byte[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            bArr[i12] = byteBuffer.get(i10 + i12);
        }
        return ek.b.f274886a.b(bArr);
    }

    public static /* synthetic */ c g(ByteBuffer byteBuffer, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = byteBuffer.remaining();
        }
        return e(byteBuffer, i10);
    }

    public static final void h(@NotNull ByteBuffer byteBuffer, int i10, @NotNull c string) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        b(byteBuffer, i10, string.r());
        IntRange intRangeI = g.i(string);
        int iL = intRangeI.l();
        int iM = intRangeI.m();
        if (iL <= iM) {
            while (true) {
                byteBuffer.put(i10 + iL, string.p(iL));
                if (iL == iM) {
                    break;
                } else {
                    iL++;
                }
            }
        }
    }

    public static final void i(@NotNull ByteBuffer byteBuffer, @NotNull c string) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        ek.b bVar = ek.b.f274886a;
        byteBuffer.put(string.q());
    }
}
