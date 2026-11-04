package kotlinx.serialization.json.internal;

import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.a0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nCommentLexers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommentLexers.kt\nkotlinx/serialization/json/internal/ReaderJsonLexerWithComments\n+ 2 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer\n*L\n1#1,219:1\n158#2:220\n*S KotlinDebug\n*F\n+ 1 CommentLexers.kt\nkotlinx/serialization/json/internal/ReaderJsonLexerWithComments\n*L\n204#1:220\n*E\n"})
public final class ReaderJsonLexerWithComments extends ReaderJsonLexer {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderJsonLexerWithComments(@NotNull InternalJsonReader reader, @NotNull char[] buffer) {
        super(reader, buffer);
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
    }

    private final Pair<Integer, Boolean> handleComment(int i10) {
        int i11 = i10 + 2;
        char cCharAt = getSource().charAt(i10 + 1);
        if (cCharAt != '*') {
            if (cCharAt != '/') {
                return TuplesKt.to(Integer.valueOf(i10), Boolean.FALSE);
            }
            int iPrefetchOrEof = i11;
            while (i10 != -1) {
                int iQ3 = StringsKt.q3(getSource(), '\n', iPrefetchOrEof, false, 4, null);
                if (iQ3 != -1) {
                    return TuplesKt.to(Integer.valueOf(iQ3 + 1), Boolean.TRUE);
                }
                iPrefetchOrEof = prefetchOrEof(getSource().length());
                i10 = iPrefetchOrEof;
            }
            return TuplesKt.to(-1, Boolean.TRUE);
        }
        boolean z10 = false;
        int iPrefetchWithinThreshold = i11;
        while (i10 != -1) {
            int iR3 = StringsKt.r3(getSource(), "*/", iPrefetchWithinThreshold, false, 4, null);
            if (iR3 != -1) {
                return TuplesKt.to(Integer.valueOf(iR3 + 2), Boolean.TRUE);
            }
            if (getSource().charAt(getSource().length() - 1) == '*') {
                iPrefetchWithinThreshold = prefetchWithinThreshold(getSource().length() - 1);
                if (z10) {
                    break;
                }
                z10 = true;
            } else {
                iPrefetchWithinThreshold = prefetchOrEof(getSource().length());
            }
            i10 = iPrefetchWithinThreshold;
        }
        this.currentPosition = getSource().length();
        int i12 = 6 & 0;
        AbstractJsonLexer.fail$default(this, "Expected end of the block comment: \"*/\", but had EOF instead", 0, null, 6, null);
        throw new a0();
    }

    private final int prefetchWithinThreshold(int i10) {
        if (getSource().length() - i10 > this.threshold) {
            return i10;
        }
        this.currentPosition = i10;
        ensureHaveChars();
        if (this.currentPosition == 0 && getSource().length() != 0) {
            return 0;
        }
        return -1;
    }

    @Override // kotlinx.serialization.json.internal.ReaderJsonLexer, kotlinx.serialization.json.internal.AbstractJsonLexer
    public boolean canConsumeValue() {
        ensureHaveChars();
        int iSkipWhitespaces = skipWhitespaces();
        if (iSkipWhitespaces >= getSource().length() || iSkipWhitespaces == -1) {
            return false;
        }
        return isValidValueStart(getSource().charAt(iSkipWhitespaces));
    }

    @Override // kotlinx.serialization.json.internal.ReaderJsonLexer, kotlinx.serialization.json.internal.AbstractJsonLexer
    public void consumeNextToken(char c10) {
        ensureHaveChars();
        ArrayAsSequence source = getSource();
        int iSkipWhitespaces = skipWhitespaces();
        if (iSkipWhitespaces >= source.length() || iSkipWhitespaces == -1) {
            this.currentPosition = -1;
            unexpectedToken(c10);
        }
        char cCharAt = source.charAt(iSkipWhitespaces);
        this.currentPosition = iSkipWhitespaces + 1;
        if (cCharAt == c10) {
            return;
        }
        unexpectedToken(c10);
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public byte peekNextToken() {
        ensureHaveChars();
        ArrayAsSequence source = getSource();
        int iSkipWhitespaces = skipWhitespaces();
        if (iSkipWhitespaces >= source.length() || iSkipWhitespaces == -1) {
            return (byte) 10;
        }
        this.currentPosition = iSkipWhitespaces;
        return AbstractJsonLexerKt.charToTokenClass(source.charAt(iSkipWhitespaces));
    }

    @Override // kotlinx.serialization.json.internal.ReaderJsonLexer, kotlinx.serialization.json.internal.AbstractJsonLexer
    public int skipWhitespaces() {
        int iPrefetchOrEof;
        int i10 = this.currentPosition;
        while (true) {
            iPrefetchOrEof = prefetchOrEof(i10);
            if (iPrefetchOrEof == -1) {
                break;
            }
            char cCharAt = getSource().charAt(iPrefetchOrEof);
            if (cCharAt == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t') {
                i10 = iPrefetchOrEof + 1;
            } else {
                if (cCharAt != '/' || iPrefetchOrEof + 1 >= getSource().length()) {
                    break;
                }
                Pair<Integer, Boolean> pairHandleComment = handleComment(iPrefetchOrEof);
                int iIntValue = pairHandleComment.component1().intValue();
                if (!pairHandleComment.component2().booleanValue()) {
                    iPrefetchOrEof = iIntValue;
                    break;
                }
                i10 = iIntValue;
            }
        }
        this.currentPosition = iPrefetchOrEof;
        return iPrefetchOrEof;
    }

    @Override // kotlinx.serialization.json.internal.ReaderJsonLexer, kotlinx.serialization.json.internal.AbstractJsonLexer
    public byte consumeNextToken() {
        ensureHaveChars();
        ArrayAsSequence source = getSource();
        int iSkipWhitespaces = skipWhitespaces();
        if (iSkipWhitespaces >= source.length() || iSkipWhitespaces == -1) {
            return (byte) 10;
        }
        this.currentPosition = iSkipWhitespaces + 1;
        return AbstractJsonLexerKt.charToTokenClass(source.charAt(iSkipWhitespaces));
    }
}
