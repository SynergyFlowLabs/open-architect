package kotlinx.serialization.json.internal;

import oj.f;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public enum WriteMode {
    OBJ(AbstractJsonLexerKt.BEGIN_OBJ, AbstractJsonLexerKt.END_OBJ),
    LIST(AbstractJsonLexerKt.BEGIN_LIST, AbstractJsonLexerKt.END_LIST),
    MAP(AbstractJsonLexerKt.BEGIN_OBJ, AbstractJsonLexerKt.END_OBJ),
    POLY_OBJ(AbstractJsonLexerKt.BEGIN_LIST, AbstractJsonLexerKt.END_LIST);

    private static final /* synthetic */ kotlin.enums.a $ENTRIES = kotlin.enums.c.c(values());

    @f
    public final char begin;

    @f
    public final char end;

    WriteMode(char c10, char c11) {
        this.begin = c10;
        this.end = c11;
    }

    @NotNull
    public static kotlin.enums.a<WriteMode> getEntries() {
        return $ENTRIES;
    }
}
