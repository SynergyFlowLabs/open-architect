package kotlinx.serialization.json.internal;

import java.util.Iterator;
import kotlin.a0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import kotlinx.serialization.e;
import kotlinx.serialization.json.DecodeSequenceMode;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nJsonIterator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonIterator.kt\nkotlinx/serialization/json/internal/JsonIteratorKt\n+ 2 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer\n+ 3 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer$fail$1\n*L\n1#1,103:1\n226#2,10:104\n229#3:114\n*S KotlinDebug\n*F\n+ 1 JsonIterator.kt\nkotlinx/serialization/json/internal/JsonIteratorKt\n*L\n39#1:104,10\n39#1:114\n*E\n"})
public final class JsonIteratorKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DecodeSequenceMode.values().length];
            try {
                iArr[DecodeSequenceMode.WHITESPACE_SEPARATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int i10 = 6 | 2;
                iArr[DecodeSequenceMode.ARRAY_WRAPPED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DecodeSequenceMode.AUTO_DETECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final <T> Iterator<T> JsonIterator(@NotNull DecodeSequenceMode mode, @NotNull Json json, @NotNull ReaderJsonLexer lexer, @NotNull e<? extends T> deserializer) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        int i10 = WhenMappings.$EnumSwitchMapping$0[determineFormat(lexer, mode).ordinal()];
        if (i10 == 1) {
            return new JsonIteratorWsSeparated(json, lexer, deserializer);
        }
        if (i10 == 2) {
            return new JsonIteratorArrayWrapped(json, lexer, deserializer);
        }
        if (i10 != 3) {
            throw new k0();
        }
        throw new IllegalStateException("AbstractJsonLexer.determineFormat must be called beforehand.");
    }

    private static final DecodeSequenceMode determineFormat(AbstractJsonLexer abstractJsonLexer, DecodeSequenceMode decodeSequenceMode) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[decodeSequenceMode.ordinal()];
        if (i10 == 1) {
            return DecodeSequenceMode.WHITESPACE_SEPARATED;
        }
        if (i10 != 2) {
            if (i10 == 3) {
                return tryConsumeStartArray(abstractJsonLexer) ? DecodeSequenceMode.ARRAY_WRAPPED : DecodeSequenceMode.WHITESPACE_SEPARATED;
            }
            throw new k0();
        }
        if (tryConsumeStartArray(abstractJsonLexer)) {
            return DecodeSequenceMode.ARRAY_WRAPPED;
        }
        String str = AbstractJsonLexerKt.tokenDescription((byte) 8);
        int i11 = abstractJsonLexer.currentPosition;
        int i12 = i11 - 1;
        AbstractJsonLexer.fail$default(abstractJsonLexer, "Expected " + str + ", but had '" + ((i11 == abstractJsonLexer.getSource().length() || i12 < 0) ? "EOF" : String.valueOf(abstractJsonLexer.getSource().charAt(i12))) + "' instead", i12, null, 4, null);
        throw new a0();
    }

    private static final boolean tryConsumeStartArray(AbstractJsonLexer abstractJsonLexer) {
        if (abstractJsonLexer.peekNextToken() != 8) {
            return false;
        }
        abstractJsonLexer.consumeNextToken((byte) 8);
        return true;
    }
}
