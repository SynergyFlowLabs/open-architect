package io.intercom.android.sdk.lightcompressor.config;

import kotlin.enums.a;
import kotlin.enums.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public enum SaveLocation {
    pictures,
    downloads,
    movies;

    private static final /* synthetic */ a $ENTRIES = c.c(values());

    static {
        int i10 = 7 | 2;
    }

    @NotNull
    public static a<SaveLocation> getEntries() {
        return $ENTRIES;
    }
}
