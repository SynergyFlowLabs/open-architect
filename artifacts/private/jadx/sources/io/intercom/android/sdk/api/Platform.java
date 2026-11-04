package io.intercom.android.sdk.api;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public enum Platform {
    Cordova(PlatformIdentifierUtilKt.CORDOVA_HEADER),
    ReactNative(PlatformIdentifierUtilKt.REACT_NATIVE_HEADER),
    Flutter(PlatformIdentifierUtilKt.FLUTTER_HEADER),
    Native(PlatformIdentifierUtilKt.NATIVE_SDK);

    private static final /* synthetic */ kotlin.enums.a $ENTRIES = kotlin.enums.c.c(values());

    @NotNull
    private final String identifier;

    Platform(String str) {
        this.identifier = str;
    }

    @NotNull
    public static kotlin.enums.a<Platform> getEntries() {
        return $ENTRIES;
    }

    @NotNull
    public final String getIdentifier() {
        return this.identifier;
    }
}
