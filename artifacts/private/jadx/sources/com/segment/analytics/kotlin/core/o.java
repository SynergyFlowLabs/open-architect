package com.segment.analytics.kotlin.core;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class o extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f266835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f266836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f266837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Map<String, List<String>> f266838d;

    public o(int i10, @NotNull String responseMessage, @Nullable String str, @NotNull Map<String, List<String>> responseHeaders) {
        Intrinsics.checkNotNullParameter(responseMessage, "responseMessage");
        Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("HTTP ");
        sb2.append(i10);
        sb2.append(": ");
        sb2.append(responseMessage);
        sb2.append(". Response: ");
        sb2.append(str == null ? "No response" : str);
        super(sb2.toString());
        this.f266835a = i10;
        this.f266836b = responseMessage;
        this.f266837c = str;
        this.f266838d = responseHeaders;
    }

    @Nullable
    public final String a() {
        return this.f266837c;
    }

    public final int b() {
        return this.f266835a;
    }

    @NotNull
    public final Map<String, List<String>> c() {
        return this.f266838d;
    }

    @NotNull
    public final String d() {
        return this.f266836b;
    }

    public final boolean e() {
        int i10 = this.f266835a;
        return 400 <= i10 && i10 < 500;
    }
}
