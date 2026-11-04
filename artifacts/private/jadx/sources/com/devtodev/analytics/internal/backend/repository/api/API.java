package com.devtodev.analytics.internal.backend.repository.api;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class API {

    @NotNull
    public static final String API_URL = "https://statgw.devtodev.com";

    @NotNull
    public static final String API_VERSION = "/v2";

    @NotNull
    public static final API INSTANCE = new API();

    @NotNull
    private static String TEST_PROXY_URL = "";

    @NotNull
    private static String TEST_CUSTOM_URL = "";

    private API() {
    }

    @NotNull
    public final String getTEST_CUSTOM_URL() {
        return TEST_CUSTOM_URL;
    }

    @NotNull
    public final String getTEST_PROXY_URL() {
        return TEST_PROXY_URL;
    }

    public final void setTEST_CUSTOM_URL(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        TEST_CUSTOM_URL = str;
    }

    public final void setTEST_PROXY_URL(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        TEST_PROXY_URL = str;
    }
}
