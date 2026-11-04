package kotlinx.serialization.json.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.a0;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.h0;
import kotlin.k0;
import kotlin.text.StringsKt;
import oj.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.locationtech.jts.geom.l;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nAbstractJsonLexer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer\n+ 2 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer$fail$1\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,763:1\n226#1,10:764\n755#1,5:775\n226#1,10:780\n226#1,10:792\n229#2:774\n229#2:790\n1#3:791\n*S KotlinDebug\n*F\n+ 1 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer\n*L\n206#1:764,10\n216#1:775,5\n223#1:780,10\n685#1:792,10\n206#1:774\n223#1:790\n*E\n"})
public abstract class AbstractJsonLexer {

    @f
    public int currentPosition;

    @Nullable
    private String peekedString;

    @f
    @NotNull
    public final JsonPath path = new JsonPath();

    @NotNull
    private StringBuilder escapedString = new StringBuilder();

    private final int appendEsc(int i10) {
        int iPrefetchOrEof = prefetchOrEof(i10);
        if (iPrefetchOrEof == -1) {
            fail$default(this, "Expected escape sequence to continue, got EOF", 0, null, 6, null);
            throw new a0();
        }
        int i11 = iPrefetchOrEof + 1;
        char cCharAt = getSource().charAt(iPrefetchOrEof);
        if (cCharAt == 'u') {
            return appendHex(getSource(), i11);
        }
        char cEscapeToChar = AbstractJsonLexerKt.escapeToChar(cCharAt);
        if (cEscapeToChar != 0) {
            this.escapedString.append(cEscapeToChar);
            return i11;
        }
        fail$default(this, "Invalid escaped char '" + cCharAt + '\'', 0, null, 6, null);
        throw new a0();
    }

    private final int appendEscape(int i10, int i11) {
        appendRange(i10, i11);
        return appendEsc(i11 + 1);
    }

    private final int appendHex(CharSequence charSequence, int i10) {
        int i11 = i10 + 4;
        if (i11 < charSequence.length()) {
            this.escapedString.append((char) ((fromHexChar(charSequence, i10) << 12) + (fromHexChar(charSequence, i10 + 1) << 8) + (fromHexChar(charSequence, i10 + 2) << 4) + fromHexChar(charSequence, i10 + 3)));
            return i11;
        }
        this.currentPosition = i10;
        ensureHaveChars();
        if (this.currentPosition + 4 < charSequence.length()) {
            return appendHex(charSequence, this.currentPosition);
        }
        fail$default(this, "Unexpected EOF during unicode escape", 0, null, 6, null);
        throw new a0();
    }

    private final void consumeBooleanLiteral(String str, int i10) {
        if (getSource().length() - i10 < str.length()) {
            fail$default(this, "Unexpected end of boolean literal", 0, null, 6, null);
            throw new a0();
        }
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (str.charAt(i11) != (getSource().charAt(i10 + i11) | ' ')) {
                int i12 = 5 ^ 0;
                fail$default(this, "Expected valid boolean literal prefix, but had '" + consumeStringLenient() + '\'', 0, null, 6, null);
                throw new a0();
            }
        }
        this.currentPosition = i10 + str.length();
    }

    private static final double consumeNumericLiteral$calculateExponent(long j10, boolean z10) {
        if (!z10) {
            return Math.pow(10.0d, -j10);
        }
        if (z10) {
            return Math.pow(10.0d, j10);
        }
        throw new k0();
    }

    private final String decodedString(int i10, int i11) {
        appendRange(i10, i11);
        String string = this.escapedString.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.escapedString.setLength(0);
        return string;
    }

    public static /* synthetic */ Void fail$default(AbstractJsonLexer abstractJsonLexer, String str, int i10, String str2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
        }
        if ((i11 & 2) != 0) {
            i10 = abstractJsonLexer.currentPosition;
        }
        if ((i11 & 4) != 0) {
            str2 = "";
        }
        return abstractJsonLexer.fail(str, i10, str2);
    }

    public static /* synthetic */ Void fail$kotlinx_serialization_json$default(AbstractJsonLexer abstractJsonLexer, byte b10, boolean z10, Function2 message, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        if ((i10 & 4) != 0) {
            message = new Function2<String, String, String>() { // from class: kotlinx.serialization.json.internal.AbstractJsonLexer.fail.1
                @Override // kotlin.jvm.functions.Function2
                public final String invoke(String expected, String source) {
                    Intrinsics.checkNotNullParameter(expected, "expected");
                    Intrinsics.checkNotNullParameter(source, "source");
                    return "Expected " + expected + ", but had '" + source + "' instead";
                }
            };
        }
        Intrinsics.checkNotNullParameter(message, "message");
        String str = AbstractJsonLexerKt.tokenDescription(b10);
        int i11 = z10 ? abstractJsonLexer.currentPosition - 1 : abstractJsonLexer.currentPosition;
        fail$default(abstractJsonLexer, (String) message.invoke(str, (abstractJsonLexer.currentPosition == abstractJsonLexer.getSource().length() || i11 < 0) ? "EOF" : String.valueOf(abstractJsonLexer.getSource().charAt(i11))), i11, null, 4, null);
        throw new a0();
    }

    private final int fromHexChar(CharSequence charSequence, int i10) {
        char cCharAt = charSequence.charAt(i10);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - l.f338160j;
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        fail$default(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6, null);
        throw new a0();
    }

    private final boolean insideString(boolean z10, char c10) {
        if (z10) {
            return AbstractJsonLexerKt.charToTokenClass(c10) == 0;
        }
        return c10 != '\"';
    }

    public static /* synthetic */ void require$kotlinx_serialization_json$default(AbstractJsonLexer abstractJsonLexer, boolean z10, int i10, Function0 message, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: require");
        }
        if ((i11 & 2) != 0) {
            i10 = abstractJsonLexer.currentPosition;
        }
        int i12 = i10;
        Intrinsics.checkNotNullParameter(message, "message");
        if (z10) {
            return;
        }
        fail$default(abstractJsonLexer, (String) message.invoke(), i12, null, 4, null);
        throw new a0();
    }

    private final String takePeeked() {
        String str = this.peekedString;
        Intrinsics.checkNotNull(str);
        this.peekedString = null;
        return str;
    }

    public static /* synthetic */ boolean tryConsumeNull$default(AbstractJsonLexer abstractJsonLexer, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryConsumeNull");
        }
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return abstractJsonLexer.tryConsumeNull(z10);
    }

    private final boolean wasUnquotedString() {
        return getSource().charAt(this.currentPosition - 1) != '\"';
    }

    private final <T> T withPositionRollback(Function0<? extends T> function0) {
        int i10 = this.currentPosition;
        try {
            T tInvoke = function0.invoke();
            h0.d(1);
            this.currentPosition = i10;
            h0.c(1);
            return tInvoke;
        } catch (Throwable th2) {
            h0.d(1);
            this.currentPosition = i10;
            h0.c(1);
            throw th2;
        }
    }

    private final void writeRange(int i10, int i11, boolean z10, Function1<? super String, Unit> function1) {
        if (z10) {
            function1.invoke(decodedString(i10, i11));
        } else {
            function1.invoke(substring(i10, i11));
        }
    }

    protected void appendRange(int i10, int i11) {
        this.escapedString.append(getSource(), i10, i11);
    }

    public abstract boolean canConsumeValue();

    public final boolean consumeBoolean() {
        return consumeBoolean(skipWhitespaces());
    }

    public final boolean consumeBooleanLenient() {
        boolean z10;
        int iSkipWhitespaces = skipWhitespaces();
        if (iSkipWhitespaces == getSource().length()) {
            fail$default(this, "EOF", 0, null, 6, null);
            throw new a0();
        }
        if (getSource().charAt(iSkipWhitespaces) == '\"') {
            iSkipWhitespaces++;
            z10 = true;
        } else {
            z10 = false;
        }
        boolean zConsumeBoolean = consumeBoolean(iSkipWhitespaces);
        if (!z10) {
            return zConsumeBoolean;
        }
        if (this.currentPosition == getSource().length()) {
            fail$default(this, "EOF", 0, null, 6, null);
            throw new a0();
        }
        if (getSource().charAt(this.currentPosition) == '\"') {
            this.currentPosition++;
            return zConsumeBoolean;
        }
        fail$default(this, "Expected closing quotation mark", 0, null, 6, null);
        throw new a0();
    }

    @NotNull
    public abstract String consumeKeyString();

    public abstract byte consumeNextToken();

    public final byte consumeNextToken(byte b10) {
        byte bConsumeNextToken = consumeNextToken();
        if (bConsumeNextToken == b10) {
            return bConsumeNextToken;
        }
        String str = AbstractJsonLexerKt.tokenDescription(b10);
        int i10 = this.currentPosition;
        int i11 = i10 - 1;
        fail$default(this, "Expected " + str + ", but had '" + ((i10 == getSource().length() || i11 < 0) ? "EOF" : String.valueOf(getSource().charAt(i11))) + "' instead", i11, null, 4, null);
        throw new a0();
    }

    public abstract void consumeNextToken(char c10);

    public final long consumeNumericLiteral() {
        boolean z10;
        boolean z11;
        int iPrefetchOrEof = prefetchOrEof(skipWhitespaces());
        if (iPrefetchOrEof >= getSource().length() || iPrefetchOrEof == -1) {
            fail$default(this, "EOF", 0, null, 6, null);
            throw new a0();
        }
        if (getSource().charAt(iPrefetchOrEof) == '\"') {
            iPrefetchOrEof++;
            if (iPrefetchOrEof == getSource().length()) {
                fail$default(this, "EOF", 0, null, 6, null);
                throw new a0();
            }
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = iPrefetchOrEof;
        boolean z12 = false;
        boolean z13 = false;
        long j10 = 0;
        long j11 = 0;
        loop0: while (true) {
            z11 = false;
            while (true) {
                if (i10 == getSource().length()) {
                    break loop0;
                }
                char cCharAt = getSource().charAt(i10);
                if ((cCharAt == 'e' || cCharAt == 'E') && !z12) {
                    if (i10 == iPrefetchOrEof) {
                        fail$default(this, "Unexpected symbol " + cCharAt + " in numeric literal", 0, null, 6, null);
                        throw new a0();
                    }
                    i10++;
                    z12 = true;
                } else if (cCharAt != '-' || !z12) {
                    if (cCharAt != '+' || !z12) {
                        if (cCharAt != '-') {
                            if (AbstractJsonLexerKt.charToTokenClass(cCharAt) != 0) {
                                break loop0;
                            }
                            i10++;
                            int i11 = cCharAt - '0';
                            if (i11 < 0 || i11 >= 10) {
                                fail$default(this, "Unexpected symbol '" + cCharAt + "' in numeric literal", 0, null, 6, null);
                                throw new a0();
                            }
                            if (z12) {
                                j11 = (j11 * ((long) 10)) + ((long) i11);
                            } else {
                                j10 = (j10 * ((long) 10)) - ((long) i11);
                                if (j10 > 0) {
                                    fail$default(this, "Numeric value overflow", 0, null, 6, null);
                                    throw new a0();
                                }
                            }
                        } else {
                            if (i10 != iPrefetchOrEof) {
                                fail$default(this, "Unexpected symbol '-' in numeric literal", 0, null, 6, null);
                                throw new a0();
                            }
                            i10++;
                            z13 = true;
                        }
                    } else {
                        if (i10 == iPrefetchOrEof) {
                            fail$default(this, "Unexpected symbol '+' in numeric literal", 0, null, 6, null);
                            throw new a0();
                        }
                        i10++;
                    }
                }
                z11 = true;
            }
            if (i10 == iPrefetchOrEof) {
                fail$default(this, "Unexpected symbol '-' in numeric literal", 0, null, 6, null);
                throw new a0();
            }
            i10++;
        }
        boolean z14 = i10 != iPrefetchOrEof;
        if (iPrefetchOrEof == i10 || (z13 && iPrefetchOrEof == i10 - 1)) {
            fail$default(this, "Expected numeric literal", 0, null, 6, null);
            throw new a0();
        }
        if (z10) {
            if (!z14) {
                fail$default(this, "EOF", 0, null, 6, null);
                throw new a0();
            }
            if (getSource().charAt(i10) != '\"') {
                fail$default(this, "Expected closing quotation mark", 0, null, 6, null);
                throw new a0();
            }
            i10++;
        }
        this.currentPosition = i10;
        if (z12) {
            double dConsumeNumericLiteral$calculateExponent = j10 * consumeNumericLiteral$calculateExponent(j11, z11);
            if (dConsumeNumericLiteral$calculateExponent > 9.223372036854776E18d || dConsumeNumericLiteral$calculateExponent < -9.223372036854776E18d) {
                fail$default(this, "Numeric value overflow", 0, null, 6, null);
                throw new a0();
            }
            if (Math.floor(dConsumeNumericLiteral$calculateExponent) != dConsumeNumericLiteral$calculateExponent) {
                fail$default(this, "Can't convert " + dConsumeNumericLiteral$calculateExponent + " to Long", 0, null, 6, null);
                throw new a0();
            }
            j10 = (long) dConsumeNumericLiteral$calculateExponent;
        }
        if (z13) {
            return j10;
        }
        if (j10 != Long.MIN_VALUE) {
            return -j10;
        }
        fail$default(this, "Numeric value overflow", 0, null, 6, null);
        throw new a0();
    }

    public final long consumeNumericLiteralFully() {
        long jConsumeNumericLiteral = consumeNumericLiteral();
        if (consumeNextToken() == 10) {
            return jConsumeNumericLiteral;
        }
        AbstractJsonLexerKt.tokenDescription((byte) 10);
        int i10 = this.currentPosition;
        int i11 = i10 - 1;
        int i12 = 6 & 0;
        fail$default(this, "Expected input to contain a single valid number, but got '" + ((i10 == getSource().length() || i11 < 0) ? "EOF" : String.valueOf(getSource().charAt(i11))) + "' after it", i11, null, 4, null);
        throw new a0();
    }

    @NotNull
    public final String consumeString() {
        return this.peekedString != null ? takePeeked() : consumeKeyString();
    }

    public void consumeStringChunked(boolean z10, @NotNull Function1<? super String, Unit> consumeChunk) {
        int i10;
        int iPrefetchOrEof;
        Intrinsics.checkNotNullParameter(consumeChunk, "consumeChunk");
        byte bPeekNextToken = peekNextToken();
        if (!z10 || bPeekNextToken == 0) {
            if (!z10) {
                consumeNextToken('\"');
            }
            int i11 = this.currentPosition;
            char cCharAt = getSource().charAt(i11);
            boolean z11 = false;
            int i12 = i11;
            while (this.insideString(z10, cCharAt)) {
                if (z10 || cCharAt != '\\') {
                    int i13 = i12 + 1;
                    i10 = i11;
                    iPrefetchOrEof = i13;
                } else {
                    iPrefetchOrEof = this.prefetchOrEof(this.appendEscape(i11, i12));
                    z11 = true;
                    i10 = iPrefetchOrEof;
                }
                if (iPrefetchOrEof >= this.getSource().length()) {
                    this.writeRange(i10, iPrefetchOrEof, z11, consumeChunk);
                    int iPrefetchOrEof2 = this.prefetchOrEof(iPrefetchOrEof);
                    if (iPrefetchOrEof2 == -1) {
                        fail$default(this, "EOF", iPrefetchOrEof2, null, 4, null);
                        throw new a0();
                    }
                    z11 = false;
                    i11 = iPrefetchOrEof2;
                    i12 = i11;
                } else {
                    int i14 = i10;
                    i12 = iPrefetchOrEof;
                    i11 = i14;
                }
                AbstractJsonLexer abstractJsonLexer = this;
                cCharAt = abstractJsonLexer.getSource().charAt(i12);
                this = abstractJsonLexer;
            }
            AbstractJsonLexer abstractJsonLexer2 = this;
            abstractJsonLexer2.writeRange(i11, i12, z11, consumeChunk);
            abstractJsonLexer2.currentPosition = i12;
            if (z10) {
                return;
            }
            abstractJsonLexer2.consumeNextToken('\"');
        }
    }

    @NotNull
    public final String consumeStringLenient() {
        if (this.peekedString != null) {
            return takePeeked();
        }
        int iSkipWhitespaces = skipWhitespaces();
        if (iSkipWhitespaces >= getSource().length() || iSkipWhitespaces == -1) {
            fail$default(this, "EOF", iSkipWhitespaces, null, 4, null);
            throw new a0();
        }
        byte bCharToTokenClass = AbstractJsonLexerKt.charToTokenClass(getSource().charAt(iSkipWhitespaces));
        if (bCharToTokenClass == 1) {
            return consumeString();
        }
        if (bCharToTokenClass != 0) {
            fail$default(this, "Expected beginning of the string, but got " + getSource().charAt(iSkipWhitespaces), 0, null, 6, null);
            throw new a0();
        }
        boolean z10 = false;
        while (AbstractJsonLexerKt.charToTokenClass(getSource().charAt(iSkipWhitespaces)) == 0) {
            iSkipWhitespaces++;
            if (iSkipWhitespaces >= getSource().length()) {
                appendRange(this.currentPosition, iSkipWhitespaces);
                int iPrefetchOrEof = prefetchOrEof(iSkipWhitespaces);
                if (iPrefetchOrEof == -1) {
                    this.currentPosition = iSkipWhitespaces;
                    return decodedString(0, 0);
                }
                iSkipWhitespaces = iPrefetchOrEof;
                z10 = true;
            }
        }
        String strSubstring = !z10 ? substring(this.currentPosition, iSkipWhitespaces) : decodedString(this.currentPosition, iSkipWhitespaces);
        this.currentPosition = iSkipWhitespaces;
        return strSubstring;
    }

    @NotNull
    public final String consumeStringLenientNotNull() {
        String strConsumeStringLenient = consumeStringLenient();
        if (!Intrinsics.areEqual(strConsumeStringLenient, AbstractJsonLexerKt.NULL) || !wasUnquotedString()) {
            return strConsumeStringLenient;
        }
        fail$default(this, "Unexpected 'null' value instead of string literal", 0, null, 6, null);
        throw new a0();
    }

    public final void discardPeeked() {
        this.peekedString = null;
    }

    public void ensureHaveChars() {
    }

    public final void expectEof() {
        if (consumeNextToken() == 10) {
            return;
        }
        int i10 = 3 & 0;
        fail$default(this, "Expected EOF after parsing, but had " + getSource().charAt(this.currentPosition - 1) + " instead", 0, null, 6, null);
        throw new a0();
    }

    @NotNull
    public final Void fail(@NotNull String message, int i10, @NotNull String hint) {
        String str;
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(hint, "hint");
        if (hint.length() == 0) {
            str = "";
        } else {
            str = '\n' + hint;
        }
        throw JsonExceptionsKt.JsonDecodingException(i10, message + " at path: " + this.path.getPath() + str, getSource());
    }

    @NotNull
    public final Void fail$kotlinx_serialization_json(byte b10, boolean z10, @NotNull Function2<? super String, ? super String, String> message) {
        Intrinsics.checkNotNullParameter(message, "message");
        String str = AbstractJsonLexerKt.tokenDescription(b10);
        int i10 = z10 ? this.currentPosition - 1 : this.currentPosition;
        fail$default(this, message.invoke(str, (this.currentPosition == getSource().length() || i10 < 0) ? "EOF" : String.valueOf(getSource().charAt(i10))), i10, null, 4, null);
        throw new a0();
    }

    public final void failOnUnknownKey(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        int iG3 = StringsKt.G3(substring(0, this.currentPosition), key, 0, false, 6, null);
        throw new JsonDecodingException("Encountered an unknown key '" + key + "' at offset " + iG3 + " at path: " + this.path.getPath() + "\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: " + ((Object) JsonExceptionsKt.minify(getSource(), iG3)));
    }

    @NotNull
    protected final StringBuilder getEscapedString() {
        return this.escapedString;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NotNull
    public abstract CharSequence getSource();

    public int indexOf(char c10, int i10) {
        return StringsKt.q3(getSource(), c10, i10, false, 4, null);
    }

    public final boolean isNotEof() {
        return peekNextToken() != 10;
    }

    protected final boolean isValidValueStart(char c10) {
        if (c10 == ',' || c10 == ':' || c10 == ']' || c10 == '}') {
            return false;
        }
        int i10 = 2 << 1;
        return true;
    }

    protected final boolean isWs(char c10) {
        return c10 == ' ' || c10 == '\n' || c10 == '\r' || c10 == '\t';
    }

    @Nullable
    public abstract String peekLeadingMatchingValue(@NotNull String str, boolean z10);

    public byte peekNextToken() {
        CharSequence source = getSource();
        int i10 = this.currentPosition;
        while (true) {
            int iPrefetchOrEof = prefetchOrEof(i10);
            if (iPrefetchOrEof == -1) {
                this.currentPosition = iPrefetchOrEof;
                return (byte) 10;
            }
            char cCharAt = source.charAt(iPrefetchOrEof);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.currentPosition = iPrefetchOrEof;
                return AbstractJsonLexerKt.charToTokenClass(cCharAt);
            }
            i10 = iPrefetchOrEof + 1;
        }
    }

    @Nullable
    public final String peekString(boolean z10) {
        String strConsumeString;
        byte bPeekNextToken = peekNextToken();
        if (z10) {
            if (bPeekNextToken != 1 && bPeekNextToken != 0) {
                return null;
            }
            strConsumeString = consumeStringLenient();
        } else {
            if (bPeekNextToken != 1) {
                return null;
            }
            strConsumeString = consumeString();
        }
        this.peekedString = strConsumeString;
        return strConsumeString;
    }

    public abstract int prefetchOrEof(int i10);

    public final void require$kotlinx_serialization_json(boolean z10, int i10, @NotNull Function0<String> message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (z10) {
            return;
        }
        fail$default(this, message.invoke(), i10, null, 4, null);
        throw new a0();
    }

    protected final void setEscapedString(@NotNull StringBuilder sb2) {
        Intrinsics.checkNotNullParameter(sb2, "<set-?>");
        this.escapedString = sb2;
    }

    public final void skipElement(boolean z10) {
        ArrayList arrayList = new ArrayList();
        byte bPeekNextToken = peekNextToken();
        if (bPeekNextToken != 8 && bPeekNextToken != 6) {
            consumeStringLenient();
            return;
        }
        while (true) {
            byte bPeekNextToken2 = this.peekNextToken();
            if (bPeekNextToken2 != 1) {
                if (bPeekNextToken2 == 8 || bPeekNextToken2 == 6) {
                    arrayList.add(Byte.valueOf(bPeekNextToken2));
                } else if (bPeekNextToken2 == 9) {
                    if (((Number) CollectionsKt.last((List) arrayList)).byteValue() != 8) {
                        throw JsonExceptionsKt.JsonDecodingException(this.currentPosition, "found ] instead of } at path: " + this.path, this.getSource());
                    }
                    CollectionsKt.removeLast(arrayList);
                } else if (bPeekNextToken2 == 7) {
                    if (((Number) CollectionsKt.last((List) arrayList)).byteValue() != 6) {
                        throw JsonExceptionsKt.JsonDecodingException(this.currentPosition, "found } instead of ] at path: " + this.path, this.getSource());
                    }
                    CollectionsKt.removeLast(arrayList);
                } else if (bPeekNextToken2 == 10) {
                    fail$default(this, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6, null);
                    throw new a0();
                }
                this.consumeNextToken();
                if (arrayList.size() == 0) {
                    return;
                } else {
                    this = this;
                }
            } else if (z10) {
                this.consumeStringLenient();
            } else {
                this.consumeKeyString();
            }
        }
    }

    public abstract int skipWhitespaces();

    @NotNull
    public String substring(int i10, int i11) {
        return getSource().subSequence(i10, i11).toString();
    }

    @NotNull
    public String toString() {
        return "JsonReader(source='" + ((Object) getSource()) + "', currentPosition=" + this.currentPosition + ')';
    }

    public final boolean tryConsumeComma() {
        int iSkipWhitespaces = skipWhitespaces();
        CharSequence source = getSource();
        if (iSkipWhitespaces >= source.length() || iSkipWhitespaces == -1 || source.charAt(iSkipWhitespaces) != ',') {
            return false;
        }
        this.currentPosition++;
        return true;
    }

    public final boolean tryConsumeNull(boolean z10) {
        int iPrefetchOrEof = prefetchOrEof(skipWhitespaces());
        int length = getSource().length() - iPrefetchOrEof;
        if (length >= 4) {
            int i10 = 4 ^ (-1);
            if (iPrefetchOrEof != -1) {
                for (int i11 = 0; i11 < 4; i11++) {
                    if (AbstractJsonLexerKt.NULL.charAt(i11) != getSource().charAt(iPrefetchOrEof + i11)) {
                        return false;
                    }
                }
                if (length > 4 && AbstractJsonLexerKt.charToTokenClass(getSource().charAt(iPrefetchOrEof + 4)) == 0) {
                    return false;
                }
                if (z10) {
                    this.currentPosition = iPrefetchOrEof + 4;
                }
                return true;
            }
        }
        return false;
    }

    protected final void unexpectedToken(char c10) {
        int i10 = this.currentPosition;
        if (i10 > 0 && c10 == '\"') {
            try {
                this.currentPosition = i10 - 1;
                String strConsumeStringLenient = consumeStringLenient();
                this.currentPosition = i10;
                if (Intrinsics.areEqual(strConsumeStringLenient, AbstractJsonLexerKt.NULL)) {
                    fail("Expected string literal but 'null' literal was found", this.currentPosition - 1, AbstractJsonLexerKt.coerceInputValuesHint);
                    throw new a0();
                }
            } catch (Throwable th2) {
                this.currentPosition = i10;
                throw th2;
            }
        }
        String str = AbstractJsonLexerKt.tokenDescription(AbstractJsonLexerKt.charToTokenClass(c10));
        int i11 = this.currentPosition;
        int i12 = i11 - 1;
        fail$default(this, "Expected " + str + ", but had '" + ((i11 == getSource().length() || i12 < 0) ? "EOF" : String.valueOf(getSource().charAt(i12))) + "' instead", i12, null, 4, null);
        throw new a0();
    }

    private final boolean consumeBoolean(int i10) {
        int iPrefetchOrEof = prefetchOrEof(i10);
        if (iPrefetchOrEof >= getSource().length() || iPrefetchOrEof == -1) {
            fail$default(this, "EOF", 0, null, 6, null);
            throw new a0();
        }
        int i11 = iPrefetchOrEof + 1;
        int iCharAt = getSource().charAt(iPrefetchOrEof) | ' ';
        if (iCharAt == 102) {
            consumeBooleanLiteral("alse", i11);
            return false;
        }
        if (iCharAt == 116) {
            consumeBooleanLiteral("rue", i11);
            return true;
        }
        fail$default(this, "Expected valid boolean literal prefix, but had '" + consumeStringLenient() + '\'', 0, null, 6, null);
        throw new a0();
    }

    @NotNull
    protected final String consumeString(@NotNull CharSequence source, int i10, int i11) {
        String strDecodedString;
        AbstractJsonLexer abstractJsonLexer;
        Intrinsics.checkNotNullParameter(source, "source");
        char cCharAt = source.charAt(i11);
        boolean z10 = false;
        while (cCharAt != '\"') {
            if (cCharAt == '\\') {
                int iPrefetchOrEof = this.prefetchOrEof(this.appendEscape(i10, i11));
                if (iPrefetchOrEof == -1) {
                    fail$default(this, "Unexpected EOF", iPrefetchOrEof, null, 4, null);
                    throw new a0();
                }
                abstractJsonLexer = this;
                z10 = true;
                i10 = iPrefetchOrEof;
                i11 = i10;
            } else {
                abstractJsonLexer = this;
                i11++;
                if (i11 >= source.length()) {
                    abstractJsonLexer.appendRange(i10, i11);
                    int iPrefetchOrEof2 = abstractJsonLexer.prefetchOrEof(i11);
                    if (iPrefetchOrEof2 == -1) {
                        fail$default(abstractJsonLexer, "Unexpected EOF", iPrefetchOrEof2, null, 4, null);
                        throw new a0();
                    }
                    i10 = iPrefetchOrEof2;
                    i11 = i10;
                    z10 = true;
                } else {
                    continue;
                }
            }
            AbstractJsonLexer abstractJsonLexer2 = abstractJsonLexer;
            cCharAt = source.charAt(i11);
            this = abstractJsonLexer2;
        }
        AbstractJsonLexer abstractJsonLexer3 = this;
        if (!z10) {
            strDecodedString = abstractJsonLexer3.substring(i10, i11);
        } else {
            strDecodedString = abstractJsonLexer3.decodedString(i10, i11);
        }
        abstractJsonLexer3.currentPosition = i11 + 1;
        return strDecodedString;
    }
}
