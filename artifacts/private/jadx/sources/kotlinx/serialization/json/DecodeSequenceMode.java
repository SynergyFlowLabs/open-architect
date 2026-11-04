package kotlinx.serialization.json;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@kotlinx.serialization.g
public enum DecodeSequenceMode {
    WHITESPACE_SEPARATED,
    ARRAY_WRAPPED,
    AUTO_DETECT;

    private static final /* synthetic */ kotlin.enums.a $ENTRIES = kotlin.enums.c.c(values());

    @NotNull
    public static kotlin.enums.a<DecodeSequenceMode> getEntries() {
        return $ENTRIES;
    }
}
