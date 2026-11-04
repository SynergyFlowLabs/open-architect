package io.intercom.android.sdk.m5.home.data;

import kotlin.enums.a;
import kotlin.enums.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public enum BadgeType {
    UNREAD,
    PASSIVE;

    private static final /* synthetic */ a $ENTRIES = c.c(values());

    @NotNull
    public static a<BadgeType> getEntries() {
        return $ENTRIES;
    }
}
