package io.customer.messaginginapp.gist.data.model;

import io.intercom.android.sdk.models.carousel.VerticalAlignment;
import kotlin.enums.a;
import kotlin.enums.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public enum MessagePosition {
    TOP("top"),
    CENTER("center"),
    BOTTOM(VerticalAlignment.BOTTOM);

    private static final /* synthetic */ a $ENTRIES = c.c(values());

    @NotNull
    private final String position;

    MessagePosition(String str) {
        this.position = str;
    }

    @NotNull
    public static a<MessagePosition> getEntries() {
        return $ENTRIES;
    }

    @NotNull
    public final String getPosition() {
        return this.position;
    }
}
