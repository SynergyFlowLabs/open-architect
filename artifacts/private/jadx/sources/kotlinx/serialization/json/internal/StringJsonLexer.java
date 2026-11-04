package kotlinx.serialization.json.internal;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.a0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nStringJsonLexer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringJsonLexer.kt\nkotlinx/serialization/json/internal/StringJsonLexer\n+ 2 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer\n+ 3 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer$fail$1\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,129:1\n158#2:130\n158#2:131\n158#2:132\n158#2:133\n226#2,10:134\n229#3:144\n1869#4,2:145\n*S KotlinDebug\n*F\n+ 1 StringJsonLexer.kt\nkotlinx/serialization/json/internal/StringJsonLexer\n*L\n23#1:130\n38#1:131\n57#1:132\n73#1:133\n95#1:134,10\n95#1:144\n109#1:145,2\n*E\n"})
public class StringJsonLexer extends AbstractJsonLexer {

    @NotNull
    private final String source;

    public StringJsonLexer(@NotNull String source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.source = source;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public boolean canConsumeValue() {
        int i10 = this.currentPosition;
        if (i10 == -1) {
            return false;
        }
        String source = getSource();
        while (i10 < source.length()) {
            char cCharAt = source.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.currentPosition = i10;
                return isValidValueStart(cCharAt);
            }
            i10++;
        }
        this.currentPosition = i10;
        return false;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    @NotNull
    public String consumeKeyString() {
        consumeNextToken('\"');
        int i10 = this.currentPosition;
        int iQ3 = StringsKt.q3(getSource(), '\"', i10, false, 4, null);
        int i11 = 4 | (-1);
        if (iQ3 != -1) {
            for (int i12 = i10; i12 < iQ3; i12++) {
                if (getSource().charAt(i12) == '\\') {
                    return consumeString(getSource(), this.currentPosition, i12);
                }
            }
            this.currentPosition = iQ3 + 1;
            String strSubstring = getSource().substring(i10, iQ3);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return strSubstring;
        }
        consumeStringLenient();
        String str = AbstractJsonLexerKt.tokenDescription((byte) 1);
        int i13 = this.currentPosition;
        int i14 = 7 << 0;
        AbstractJsonLexer.fail$default(this, "Expected " + str + ", but had '" + ((i13 == getSource().length() || i13 < 0) ? "EOF" : String.valueOf(getSource().charAt(i13))) + "' instead", i13, null, 4, null);
        throw new a0();
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public byte consumeNextToken() {
        String source = getSource();
        int i10 = this.currentPosition;
        while (i10 != -1 && i10 < source.length()) {
            int i11 = i10 + 1;
            char cCharAt = source.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.currentPosition = i11;
                return AbstractJsonLexerKt.charToTokenClass(cCharAt);
            }
            i10 = i11;
        }
        this.currentPosition = source.length();
        return (byte) 10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public void consumeStringChunked(boolean z10, @NotNull Function1<? super String, Unit> consumeChunk) {
        Intrinsics.checkNotNullParameter(consumeChunk, "consumeChunk");
        Iterator<T> it = StringsKt.t6(z10 ? consumeStringLenient() : consumeString(), 16384).iterator();
        while (it.hasNext()) {
            consumeChunk.invoke(it.next());
        }
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    @Nullable
    public String peekLeadingMatchingValue(@NotNull String keyToMatch, boolean z10) {
        Intrinsics.checkNotNullParameter(keyToMatch, "keyToMatch");
        int i10 = this.currentPosition;
        try {
            if (consumeNextToken() == 6 && Intrinsics.areEqual(peekString(z10), keyToMatch)) {
                discardPeeked();
                if (consumeNextToken() == 5) {
                    String strPeekString = peekString(z10);
                    this.currentPosition = i10;
                    discardPeeked();
                    return strPeekString;
                }
            }
            this.currentPosition = i10;
            discardPeeked();
            return null;
        } catch (Throwable th2) {
            this.currentPosition = i10;
            discardPeeked();
            throw th2;
        }
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public int prefetchOrEof(int i10) {
        if (i10 < getSource().length()) {
            return i10;
        }
        return -1;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public int skipWhitespaces() {
        char cCharAt;
        int i10 = this.currentPosition;
        if (i10 == -1) {
            return i10;
        }
        String source = getSource();
        while (i10 < source.length() && ((cCharAt = source.charAt(i10)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
            i10++;
        }
        this.currentPosition = i10;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    @NotNull
    public String getSource() {
        return this.source;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public void consumeNextToken(char c10) {
        if (this.currentPosition == -1) {
            unexpectedToken(c10);
        }
        String source = getSource();
        int i10 = this.currentPosition;
        while (i10 < source.length()) {
            int i11 = i10 + 1;
            char cCharAt = source.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.currentPosition = i11;
                if (cCharAt == c10) {
                    return;
                } else {
                    unexpectedToken(c10);
                }
            }
            i10 = i11;
        }
        this.currentPosition = -1;
        unexpectedToken(c10);
    }
}
