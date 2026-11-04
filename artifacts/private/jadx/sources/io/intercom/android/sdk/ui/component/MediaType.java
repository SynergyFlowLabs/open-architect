package io.intercom.android.sdk.ui.component;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public enum MediaType {
    ImageOnly,
    VideOnly,
    DocumentOnly,
    ImageAndVideo,
    All;

    private static final /* synthetic */ kotlin.enums.a $ENTRIES = kotlin.enums.c.c(values());

    @NotNull
    public static kotlin.enums.a<MediaType> getEntries() {
        return $ENTRIES;
    }
}
