package io.ktor.http;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class q1 extends IllegalArgumentException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f296074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f296075b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(@NotNull String headerValue, int i10) {
        super("Header value '" + headerValue + "' contains illegal character '" + headerValue.charAt(i10) + "' (code " + (headerValue.charAt(i10) & 255) + ')');
        Intrinsics.checkNotNullParameter(headerValue, "headerValue");
        this.f296074a = headerValue;
        this.f296075b = i10;
    }

    @NotNull
    public final String a() {
        return this.f296074a;
    }

    public final int b() {
        return this.f296075b;
    }
}
