package kotlin.io;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nConsole.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Console.kt\nkotlin/io/LineReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,299:1\n1#2:300\n*E\n"})
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final q f312693a = new q();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f312694b = 32;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static CharsetDecoder f312695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f312696d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final byte[] f312697e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final char[] f312698f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final ByteBuffer f312699g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final CharBuffer f312700h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final StringBuilder f312701i;

    static {
        byte[] bArr = new byte[32];
        f312697e = bArr;
        char[] cArr = new char[32];
        f312698f = cArr;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        Intrinsics.checkNotNullExpressionValue(byteBufferWrap, "wrap(...)");
        f312699g = byteBufferWrap;
        CharBuffer charBufferWrap = CharBuffer.wrap(cArr);
        Intrinsics.checkNotNullExpressionValue(charBufferWrap, "wrap(...)");
        f312700h = charBufferWrap;
        f312701i = new StringBuilder();
    }

    private q() {
    }

    private final int a() {
        ByteBuffer byteBuffer = f312699g;
        byteBuffer.compact();
        int iPosition = byteBuffer.position();
        byteBuffer.position(0);
        return iPosition;
    }

    private final int b(boolean z10) throws CharacterCodingException {
        while (true) {
            CharsetDecoder charsetDecoder = f312695c;
            if (charsetDecoder == null) {
                Intrinsics.throwUninitializedPropertyAccessException("decoder");
                charsetDecoder = null;
            }
            ByteBuffer byteBuffer = f312699g;
            CharBuffer charBuffer = f312700h;
            CoderResult coderResultDecode = charsetDecoder.decode(byteBuffer, charBuffer, z10);
            Intrinsics.checkNotNullExpressionValue(coderResultDecode, "decode(...)");
            if (coderResultDecode.isError()) {
                e();
                coderResultDecode.throwException();
            }
            int iPosition = charBuffer.position();
            if (!coderResultDecode.isOverflow()) {
                return iPosition;
            }
            StringBuilder sb2 = f312701i;
            char[] cArr = f312698f;
            int i10 = iPosition - 1;
            sb2.append(cArr, 0, i10);
            charBuffer.position(0);
            charBuffer.limit(32);
            charBuffer.put(cArr[i10]);
        }
    }

    private final int c(int i10, int i11) throws CharacterCodingException {
        ByteBuffer byteBuffer = f312699g;
        byteBuffer.limit(i10);
        f312700h.position(i11);
        int iB = b(true);
        CharsetDecoder charsetDecoder = f312695c;
        if (charsetDecoder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("decoder");
            charsetDecoder = null;
        }
        charsetDecoder.reset();
        byteBuffer.position(0);
        return iB;
    }

    private final void e() {
        CharsetDecoder charsetDecoder = f312695c;
        if (charsetDecoder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("decoder");
            charsetDecoder = null;
        }
        charsetDecoder.reset();
        f312699g.position(0);
        f312701i.setLength(0);
    }

    private final void f() {
        StringBuilder sb2 = f312701i;
        sb2.setLength(32);
        sb2.trimToSize();
    }

    private final void g(Charset charset) {
        CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
        Intrinsics.checkNotNullExpressionValue(charsetDecoderNewDecoder, "newDecoder(...)");
        f312695c = charsetDecoderNewDecoder;
        ByteBuffer byteBuffer = f312699g;
        byteBuffer.clear();
        CharBuffer charBuffer = f312700h;
        charBuffer.clear();
        byteBuffer.put((byte) 10);
        byteBuffer.flip();
        CharsetDecoder charsetDecoder = f312695c;
        if (charsetDecoder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("decoder");
            charsetDecoder = null;
        }
        boolean z10 = false;
        charsetDecoder.decode(byteBuffer, charBuffer, false);
        if (charBuffer.position() == 1 && charBuffer.get(0) == '\n') {
            z10 = true;
        }
        f312696d = z10;
        e();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002d A[Catch: all -> 0x001e, TryCatch #0 {all -> 0x001e, blocks: (B:3:0x0001, B:7:0x0014, B:10:0x0022, B:14:0x0035, B:16:0x0043, B:22:0x0051, B:36:0x008e, B:38:0x0096, B:40:0x009a, B:42:0x00a4, B:44:0x00a8, B:46:0x00b2, B:50:0x00be, B:52:0x00d5, B:53:0x00d9, B:23:0x0057, B:26:0x0065, B:30:0x006e, B:32:0x007f, B:34:0x0088, B:56:0x00de, B:12:0x002d), top: B:60:0x0001 }] */
    @Nullable
    public final synchronized String d(@NotNull InputStream inputStream, @NotNull Charset charset) {
        int iC;
        try {
            Intrinsics.checkNotNullParameter(inputStream, "inputStream");
            Intrinsics.checkNotNullParameter(charset, "charset");
            CharsetDecoder charsetDecoder = f312695c;
            if (charsetDecoder == null) {
                g(charset);
            } else {
                if (charsetDecoder == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("decoder");
                    charsetDecoder = null;
                }
                if (!Intrinsics.areEqual(charsetDecoder.charset(), charset)) {
                    g(charset);
                }
            }
            int iA = 0;
            int iB = 0;
            while (true) {
                int i10 = inputStream.read();
                if (i10 == -1) {
                    if (f312701i.length() != 0 || iA != 0 || iB != 0) {
                        iC = c(iA, iB);
                        break;
                    }
                    return null;
                }
                int i11 = iA + 1;
                f312697e[iA] = (byte) i10;
                if (i10 == 10 || i11 == 32 || !f312696d) {
                    ByteBuffer byteBuffer = f312699g;
                    byteBuffer.limit(i11);
                    f312700h.position(iB);
                    iB = b(false);
                    if (iB > 0 && f312698f[iB - 1] == '\n') {
                        byteBuffer.position(0);
                        iC = iB;
                        break;
                    }
                    iA = a();
                } else {
                    iA = i11;
                }
            }
            if (iC > 0) {
                char[] cArr = f312698f;
                if (cArr[iC - 1] == '\n') {
                    int i12 = iC - 1;
                    iC = (i12 <= 0 || cArr[iC + (-2)] != '\r') ? i12 : iC - 2;
                }
            }
            StringBuilder sb2 = f312701i;
            if (sb2.length() == 0) {
                return new String(f312698f, 0, iC);
            }
            sb2.append(f312698f, 0, iC);
            String string = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            if (sb2.length() > 32) {
                f();
            }
            sb2.setLength(0);
            return string;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
