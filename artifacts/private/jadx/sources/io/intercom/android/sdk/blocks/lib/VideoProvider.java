package io.intercom.android.sdk.blocks.lib;

import java.util.Locale;

/* JADX INFO: loaded from: classes13.dex */
public enum VideoProvider {
    YOUTUBE,
    VIMEO,
    WISTIA,
    LOOM,
    VIDYARD,
    BRIGHTCOVE,
    JWPLAYER,
    MICROSOFTSTREAM,
    SYNTHESIA,
    GUIDDE,
    DESCRIPT,
    UNKNOWN;

    static {
        int i10 = (3 & 4) >> 6;
    }

    public static VideoProvider videoValueOf(String str) {
        try {
            return valueOf(str.toUpperCase(Locale.ENGLISH));
        } catch (IllegalArgumentException unused) {
            return UNKNOWN;
        }
    }
}
