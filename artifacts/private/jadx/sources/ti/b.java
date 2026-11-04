package ti;

import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.io.c0;
import kotlinx.io.x;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nEncoding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Encoding.kt\nio/ktor/utils/io/charsets/EncodingKt\n+ 2 Builder.kt\nio/ktor/utils/io/core/BuilderKt\n*L\n1#1,126:1\n21#2,3:127\n*S KotlinDebug\n*F\n+ 1 Encoding.kt\nio/ktor/utils/io/charsets/EncodingKt\n*L\n54#1:127,3\n*E\n"})
public final class b {
    @NotNull
    public static final String a(@NotNull CharsetDecoder charsetDecoder, @NotNull c0 input, int i10) {
        Intrinsics.checkNotNullParameter(charsetDecoder, "<this>");
        Intrinsics.checkNotNullParameter(input, "input");
        StringBuilder sb2 = new StringBuilder((int) Math.min(i10, input.n().j()));
        a.b(charsetDecoder, input, sb2, i10);
        return sb2.toString();
    }

    public static /* synthetic */ String b(CharsetDecoder charsetDecoder, c0 c0Var, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        return a(charsetDecoder, c0Var, i10);
    }

    @NotNull
    public static final c0 c(@NotNull CharsetEncoder charsetEncoder, @NotNull CharSequence input, int i10, int i11) {
        Intrinsics.checkNotNullParameter(charsetEncoder, "<this>");
        Intrinsics.checkNotNullParameter(input, "input");
        kotlinx.io.b bVar = new kotlinx.io.b();
        g(charsetEncoder, bVar, input, i10, i11);
        return bVar;
    }

    public static final void d(@NotNull CharsetEncoder charsetEncoder, @NotNull char[] input, int i10, int i11, @NotNull x dst) {
        Intrinsics.checkNotNullParameter(charsetEncoder, "<this>");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(dst, "dst");
        f(charsetEncoder, input, i10, i11, dst);
    }

    public static /* synthetic */ c0 e(CharsetEncoder charsetEncoder, CharSequence charSequence, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = charSequence.length();
        }
        return c(charsetEncoder, charSequence, i10, i11);
    }

    public static final int f(@NotNull CharsetEncoder charsetEncoder, @NotNull char[] input, int i10, int i11, @NotNull x dst) {
        Intrinsics.checkNotNullParameter(charsetEncoder, "<this>");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(dst, "dst");
        int i12 = i11 - i10;
        return a.c(charsetEncoder, new vi.a(input, i10, i12), 0, i12, dst);
    }

    public static final void g(@NotNull CharsetEncoder charsetEncoder, @NotNull x destination, @NotNull CharSequence input, int i10, int i11) {
        Intrinsics.checkNotNullParameter(charsetEncoder, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(input, "input");
        if (i10 >= i11) {
            return;
        }
        do {
            int iC = a.c(charsetEncoder, input, i10, i11, destination);
            if (iC < 0) {
                throw new IllegalStateException("Check failed.");
            }
            i10 += iC;
        } while (i10 < i11);
    }
}
