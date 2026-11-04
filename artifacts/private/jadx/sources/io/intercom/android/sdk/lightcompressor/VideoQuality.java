package io.intercom.android.sdk.lightcompressor;

import kotlin.enums.a;
import kotlin.enums.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public enum VideoQuality {
    VERY_HIGH,
    HIGH,
    MEDIUM,
    LOW,
    VERY_LOW;

    private static final /* synthetic */ a $ENTRIES = c.c(values());

    @NotNull
    public static a<VideoQuality> getEntries() {
        return $ENTRIES;
    }
}
