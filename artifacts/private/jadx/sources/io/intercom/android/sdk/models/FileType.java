package io.intercom.android.sdk.models;

import kotlin.enums.a;
import kotlin.enums.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public enum FileType {
    IMAGE,
    VIDEO,
    ATTACHMENT;

    private static final /* synthetic */ a $ENTRIES = c.c(values());

    @NotNull
    public static a<FileType> getEntries() {
        return $ENTRIES;
    }
}
