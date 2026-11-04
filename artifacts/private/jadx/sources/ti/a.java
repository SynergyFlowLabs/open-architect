package ti;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlinx.io.bytestring.f;
import kotlinx.io.c0;
import kotlinx.io.i0;
import kotlinx.io.x;
import org.jetbrains.annotations.NotNull;
import ui.l;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nCharsetJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CharsetJVM.kt\nio/ktor/utils/io/charsets/CharsetJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,102:1\n1#2:103\n*E\n"})
public final class a {
    public static /* synthetic */ void a() {
    }

    public static final int b(@NotNull CharsetDecoder charsetDecoder, @NotNull c0 input, @NotNull Appendable dst, int i10) {
        Intrinsics.checkNotNullParameter(charsetDecoder, "<this>");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(dst, "dst");
        if (Intrinsics.areEqual(j(charsetDecoder), Charsets.UTF_8)) {
            String strJ = i0.j(input);
            dst.append(strJ);
            return strJ.length();
        }
        long j10 = l.j(input);
        dst.append(f.c(kotlinx.io.f.e(input), j(charsetDecoder)));
        return (int) j10;
    }

    public static final int c(@NotNull CharsetEncoder charsetEncoder, @NotNull CharSequence input, int i10, int i11, @NotNull x dst) {
        Intrinsics.checkNotNullParameter(charsetEncoder, "<this>");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(dst, "dst");
        byte[] bArrD = d(charsetEncoder, input, i10, i11);
        x.X3(dst, bArrD, 0, 0, 6, null);
        return bArrD.length;
    }

    @NotNull
    public static final byte[] d(@NotNull CharsetEncoder charsetEncoder, @NotNull CharSequence input, int i10, int i11) {
        Intrinsics.checkNotNullParameter(charsetEncoder, "<this>");
        Intrinsics.checkNotNullParameter(input, "input");
        if (!(input instanceof String)) {
            return h(charsetEncoder, input, i10, i11);
        }
        if (i10 == 0) {
            String str = (String) input;
            if (i11 == str.length()) {
                byte[] bytes = str.getBytes(charsetEncoder.charset());
                Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                return bytes;
            }
        }
        String strSubstring = ((String) input).substring(i10, i11);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        Intrinsics.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
        byte[] bytes2 = strSubstring.getBytes(charsetEncoder.charset());
        Intrinsics.checkNotNullExpressionValue(bytes2, "getBytes(...)");
        return bytes2;
    }

    public static /* synthetic */ byte[] e(CharsetEncoder charsetEncoder, CharSequence charSequence, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = charSequence.length();
        }
        return d(charsetEncoder, charSequence, i10, i11);
    }

    @NotNull
    public static final byte[] f(@NotNull CharsetEncoder charsetEncoder, @NotNull CharSequence input, int i10, int i11) {
        Intrinsics.checkNotNullParameter(charsetEncoder, "<this>");
        Intrinsics.checkNotNullParameter(input, "input");
        throw new IllegalStateException("Not needed on jvm");
    }

    public static /* synthetic */ byte[] g(CharsetEncoder charsetEncoder, CharSequence charSequence, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = charSequence.length();
        }
        return f(charsetEncoder, charSequence, i10, i11);
    }

    private static final byte[] h(CharsetEncoder charsetEncoder, CharSequence charSequence, int i10, int i11) throws CharacterCodingException {
        ByteBuffer byteBufferEncode = charsetEncoder.encode(CharBuffer.wrap(charSequence, i10, i11));
        byte[] bArr = null;
        if (byteBufferEncode.hasArray() && byteBufferEncode.arrayOffset() == 0) {
            byte[] bArrArray = byteBufferEncode.array();
            if (bArrArray.length == byteBufferEncode.remaining()) {
                bArr = bArrArray;
            }
        }
        if (bArr != null) {
            return bArr;
        }
        byte[] bArr2 = new byte[byteBufferEncode.remaining()];
        byteBufferEncode.get(bArr2);
        return bArr2;
    }

    @NotNull
    public static final Charset i(@NotNull Charsets charsets, @NotNull String name) {
        Intrinsics.checkNotNullParameter(charsets, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Charset charsetForName = Charset.forName(name);
        Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(...)");
        return charsetForName;
    }

    @NotNull
    public static final Charset j(@NotNull CharsetDecoder charsetDecoder) {
        Intrinsics.checkNotNullParameter(charsetDecoder, "<this>");
        Charset charset = charsetDecoder.charset();
        Intrinsics.checkNotNull(charset);
        return charset;
    }

    @NotNull
    public static final Charset k(@NotNull CharsetEncoder charsetEncoder) {
        Intrinsics.checkNotNullParameter(charsetEncoder, "<this>");
        Charset charset = charsetEncoder.charset();
        Intrinsics.checkNotNullExpressionValue(charset, "charset(...)");
        return charset;
    }

    @NotNull
    public static final String l(@NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "<this>");
        String strName = charset.name();
        Intrinsics.checkNotNullExpressionValue(strName, "name(...)");
        return strName;
    }

    public static final boolean m(@NotNull Charsets charsets, @NotNull String name) {
        Intrinsics.checkNotNullParameter(charsets, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        return Charset.isSupported(name);
    }
}
