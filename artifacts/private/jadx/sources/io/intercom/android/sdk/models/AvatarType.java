package io.intercom.android.sdk.models;

import kotlin.enums.a;
import kotlin.enums.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public enum AvatarType {
    UNKNOWN,
    FACEPILE,
    LAYERED_BUBBLES,
    LOGO;

    private static final /* synthetic */ a $ENTRIES = c.c(values());

    @NotNull
    public static a<AvatarType> getEntries() {
        return $ENTRIES;
    }
}
