package io.intercom.android.sdk.survey;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public enum CloseEventTrigger {
    CLOSE_BUTTON,
    CTA,
    SECONDARY_CTA_EXTERNAL_LINK,
    SECONDARY_CTA_DEEP_LINK;

    private static final /* synthetic */ kotlin.enums.a $ENTRIES = kotlin.enums.c.c(values());

    @NotNull
    public static kotlin.enums.a<CloseEventTrigger> getEntries() {
        return $ENTRIES;
    }
}
