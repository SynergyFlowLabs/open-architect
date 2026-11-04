package kotlinx.serialization.json.internal;

import kotlin.a0;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oj.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nReaderJsonLexer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReaderJsonLexer.kt\nkotlinx/serialization/json/internal/ReaderJsonLexer\n+ 2 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer\n+ 3 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer$fail$1\n*L\n1#1,221:1\n158#2:222\n158#2:223\n158#2:224\n226#2,10:225\n229#3:235\n*S KotlinDebug\n*F\n+ 1 ReaderJsonLexer.kt\nkotlinx/serialization/json/internal/ReaderJsonLexer\n*L\n66#1:222\n133#1:223\n150#1:224\n181#1:225,10\n181#1:235\n*E\n"})
public class ReaderJsonLexer extends AbstractJsonLexer {

    @NotNull
    private final char[] buffer;

    @NotNull
    private final InternalJsonReader reader;

    @NotNull
    private final ArrayAsSequence source;

    @f
    protected int threshold;

    public /* synthetic */ ReaderJsonLexer(InternalJsonReader internalJsonReader, char[] cArr, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(internalJsonReader, (i10 & 2) != 0 ? CharArrayPoolBatchSize.INSTANCE.take() : cArr);
    }

    private final void preload(int i10) {
        char[] buffer$kotlinx_serialization_json = getSource().getBuffer$kotlinx_serialization_json();
        if (i10 != 0) {
            int i11 = this.currentPosition;
            ArraysKt.copyInto(buffer$kotlinx_serialization_json, buffer$kotlinx_serialization_json, 0, i11, i11 + i10);
        }
        int length = getSource().length();
        while (i10 != length) {
            int i12 = this.reader.read(buffer$kotlinx_serialization_json, i10, length - i10);
            if (i12 == -1) {
                getSource().trim(i10);
                this.threshold = -1;
                break;
            }
            i10 += i12;
        }
        this.currentPosition = 0;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    protected void appendRange(int i10, int i11) {
        StringBuilder escapedString = getEscapedString();
        escapedString.append(getSource().getBuffer$kotlinx_serialization_json(), i10, i11 - i10);
        Intrinsics.checkNotNullExpressionValue(escapedString, "append(...)");
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public boolean canConsumeValue() {
        ensureHaveChars();
        int i10 = this.currentPosition;
        while (true) {
            int iPrefetchOrEof = prefetchOrEof(i10);
            if (iPrefetchOrEof == -1) {
                this.currentPosition = iPrefetchOrEof;
                return false;
            }
            char cCharAt = getSource().charAt(iPrefetchOrEof);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.currentPosition = iPrefetchOrEof;
                return isValidValueStart(cCharAt);
            }
            i10 = iPrefetchOrEof + 1;
        }
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    @NotNull
    public String consumeKeyString() {
        consumeNextToken('\"');
        int i10 = this.currentPosition;
        int iIndexOf = indexOf('\"', i10);
        if (iIndexOf != -1) {
            for (int i11 = i10; i11 < iIndexOf; i11++) {
                if (getSource().charAt(i11) == '\\') {
                    return consumeString(getSource(), this.currentPosition, i11);
                }
            }
            this.currentPosition = iIndexOf + 1;
            return substring(i10, iIndexOf);
        }
        int iPrefetchOrEof = prefetchOrEof(i10);
        if (iPrefetchOrEof != -1) {
            return consumeString(getSource(), this.currentPosition, iPrefetchOrEof);
        }
        String str = AbstractJsonLexerKt.tokenDescription((byte) 1);
        int i12 = this.currentPosition;
        int i13 = i12 - 1;
        AbstractJsonLexer.fail$default(this, "Expected " + str + ", but had '" + ((i12 == getSource().length() || i13 < 0) ? "EOF" : String.valueOf(getSource().charAt(i13))) + "' instead", i13, null, 4, null);
        throw new a0();
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public byte consumeNextToken() {
        ensureHaveChars();
        ArrayAsSequence source = getSource();
        int i10 = this.currentPosition;
        while (true) {
            int iPrefetchOrEof = prefetchOrEof(i10);
            if (iPrefetchOrEof == -1) {
                this.currentPosition = iPrefetchOrEof;
                return (byte) 10;
            }
            int i11 = iPrefetchOrEof + 1;
            byte bCharToTokenClass = AbstractJsonLexerKt.charToTokenClass(source.charAt(iPrefetchOrEof));
            int i12 = 3 ^ 3;
            if (bCharToTokenClass != 3) {
                this.currentPosition = i11;
                return bCharToTokenClass;
            }
            i10 = i11;
        }
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public void ensureHaveChars() {
        int length = getSource().length() - this.currentPosition;
        if (length > this.threshold) {
            return;
        }
        preload(length);
    }

    @NotNull
    public final char[] getBuffer() {
        return this.buffer;
    }

    @NotNull
    public final InternalJsonReader getReader() {
        return this.reader;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public int indexOf(char c10, int i10) {
        ArrayAsSequence source = getSource();
        int length = source.length();
        while (i10 < length) {
            if (source.charAt(i10) == c10) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    @Nullable
    public String peekLeadingMatchingValue(@NotNull String keyToMatch, boolean z10) {
        Intrinsics.checkNotNullParameter(keyToMatch, "keyToMatch");
        return null;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public int prefetchOrEof(int i10) {
        if (i10 < getSource().length()) {
            return i10;
        }
        this.currentPosition = i10;
        ensureHaveChars();
        return (this.currentPosition != 0 || getSource().length() == 0) ? -1 : 0;
    }

    public final void release() {
        CharArrayPoolBatchSize.INSTANCE.release(this.buffer);
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public int skipWhitespaces() {
        int iPrefetchOrEof;
        char cCharAt;
        int i10 = this.currentPosition;
        while (true) {
            iPrefetchOrEof = prefetchOrEof(i10);
            if (iPrefetchOrEof == -1 || !((cCharAt = getSource().charAt(iPrefetchOrEof)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
                break;
            }
            i10 = iPrefetchOrEof + 1;
        }
        this.currentPosition = iPrefetchOrEof;
        return iPrefetchOrEof;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    @NotNull
    public String substring(int i10, int i11) {
        return getSource().substring(i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    @NotNull
    public ArrayAsSequence getSource() {
        return this.source;
    }

    public ReaderJsonLexer(@NotNull InternalJsonReader reader, @NotNull char[] buffer) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.reader = reader;
        this.buffer = buffer;
        this.threshold = 128;
        this.source = new ArrayAsSequence(buffer);
        preload(0);
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public void consumeNextToken(char c10) {
        ensureHaveChars();
        ArrayAsSequence source = getSource();
        int i10 = this.currentPosition;
        while (true) {
            int iPrefetchOrEof = prefetchOrEof(i10);
            if (iPrefetchOrEof != -1) {
                int i11 = iPrefetchOrEof + 1;
                char cCharAt = source.charAt(iPrefetchOrEof);
                if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                    this.currentPosition = i11;
                    if (cCharAt == c10) {
                        return;
                    } else {
                        unexpectedToken(c10);
                    }
                }
                i10 = i11;
            } else {
                this.currentPosition = iPrefetchOrEof;
                unexpectedToken(c10);
                return;
            }
        }
    }
}
