package kotlinx.serialization.json;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public enum ClassDiscriminatorMode {
    NONE,
    ALL_JSON_OBJECTS,
    POLYMORPHIC;

    private static final /* synthetic */ kotlin.enums.a $ENTRIES = kotlin.enums.c.c(values());

    @NotNull
    public static kotlin.enums.a<ClassDiscriminatorMode> getEntries() {
        return $ENTRIES;
    }
}
