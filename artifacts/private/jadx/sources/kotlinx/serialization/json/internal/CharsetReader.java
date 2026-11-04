package kotlinx.serialization.json.internal;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class CharsetReader {

    @NotNull
    private final ByteBuffer byteBuffer;

    @NotNull
    private final Charset charset;

    @NotNull
    private final CharsetDecoder decoder;
    private boolean hasLeftoverPotentiallySurrogateChar;

    @NotNull
    private final InputStream inputStream;
    private char leftoverChar;

    public CharsetReader(@NotNull InputStream inputStream, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        Intrinsics.checkNotNullParameter(charset, "charset");
        this.inputStream = inputStream;
        this.charset = charset;
        CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetDecoder charsetDecoderOnUnmappableCharacter = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        Intrinsics.checkNotNullExpressionValue(charsetDecoderOnUnmappableCharacter, "onUnmappableCharacter(...)");
        this.decoder = charsetDecoderOnUnmappableCharacter;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(ByteArrayPool8k.INSTANCE.take());
        Intrinsics.checkNotNullExpressionValue(byteBufferWrap, "wrap(...)");
        this.byteBuffer = byteBufferWrap;
        byteBufferWrap.flip();
    }

    private final int doRead(char[] cArr, int i10, int i11) throws CharacterCodingException {
        CharBuffer charBufferWrap = CharBuffer.wrap(cArr, i10, i11);
        if (charBufferWrap.position() != 0) {
            charBufferWrap = charBufferWrap.slice();
        }
        boolean z10 = false;
        while (true) {
            CoderResult coderResultDecode = this.decoder.decode(this.byteBuffer, charBufferWrap, z10);
            if (coderResultDecode.isUnderflow()) {
                if (!z10 && charBufferWrap.hasRemaining()) {
                    if (fillByteBuffer() < 0) {
                        if (charBufferWrap.position() == 0 && !this.byteBuffer.hasRemaining()) {
                            z10 = true;
                            break;
                        }
                        this.decoder.reset();
                        z10 = true;
                    } else {
                        continue;
                    }
                } else {
                    break;
                }
            } else {
                if (coderResultDecode.isOverflow()) {
                    charBufferWrap.position();
                    break;
                }
                coderResultDecode.throwException();
            }
        }
        if (z10) {
            this.decoder.reset();
        }
        if (charBufferWrap.position() == 0) {
            return -1;
        }
        return charBufferWrap.position();
    }

    private final int fillByteBuffer() {
        this.byteBuffer.compact();
        try {
            int iLimit = this.byteBuffer.limit();
            int iPosition = this.byteBuffer.position();
            int i10 = this.inputStream.read(this.byteBuffer.array(), this.byteBuffer.arrayOffset() + iPosition, iPosition <= iLimit ? iLimit - iPosition : 0);
            if (i10 < 0) {
                this.byteBuffer.flip();
                return i10;
            }
            ByteBuffer byteBuffer = this.byteBuffer;
            Intrinsics.checkNotNull(byteBuffer, "null cannot be cast to non-null type java.nio.Buffer");
            byteBuffer.position(iPosition + i10);
            this.byteBuffer.flip();
            return this.byteBuffer.remaining();
        } catch (Throwable th2) {
            this.byteBuffer.flip();
            throw th2;
        }
    }

    private final int oneShotReadSlowPath() {
        if (this.hasLeftoverPotentiallySurrogateChar) {
            this.hasLeftoverPotentiallySurrogateChar = false;
            return this.leftoverChar;
        }
        char[] cArr = new char[2];
        int i10 = read(cArr, 0, 2);
        if (i10 == -1) {
            return -1;
        }
        int i11 = 1 >> 1;
        if (i10 == 1) {
            return cArr[0];
        }
        if (i10 == 2) {
            this.leftoverChar = cArr[1];
            this.hasLeftoverPotentiallySurrogateChar = true;
            return cArr[0];
        }
        throw new IllegalStateException(("Unreachable state: " + i10).toString());
    }

    public final int read(@NotNull char[] array, int i10, int i11) {
        Intrinsics.checkNotNullParameter(array, "array");
        int i12 = 0;
        if (i11 == 0) {
            return 0;
        }
        if (i10 < 0 || i10 >= array.length || i11 < 0 || i10 + i11 > array.length) {
            throw new IllegalArgumentException(("Unexpected arguments: " + i10 + ", " + i11 + ", " + array.length).toString());
        }
        if (this.hasLeftoverPotentiallySurrogateChar) {
            array[i10] = this.leftoverChar;
            i10++;
            i11--;
            this.hasLeftoverPotentiallySurrogateChar = false;
            if (i11 == 0) {
                return 1;
            }
            i12 = 1;
        }
        if (i11 != 1) {
            return doRead(array, i10, i11) + i12;
        }
        int iOneShotReadSlowPath = oneShotReadSlowPath();
        if (iOneShotReadSlowPath != -1) {
            array[i10] = (char) iOneShotReadSlowPath;
            return i12 + 1;
        }
        if (i12 == 0) {
            return -1;
        }
        return i12;
    }

    public final void release() {
        ByteArrayPool8k byteArrayPool8k = ByteArrayPool8k.INSTANCE;
        byte[] bArrArray = this.byteBuffer.array();
        Intrinsics.checkNotNullExpressionValue(bArrArray, "array(...)");
        byteArrayPool8k.release(bArrArray);
    }
}
