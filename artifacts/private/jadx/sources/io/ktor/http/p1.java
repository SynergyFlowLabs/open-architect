package io.ktor.http;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class p1 extends IllegalArgumentException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f296066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f296067b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(@NotNull String headerName, int i10) {
        super("Header name '" + headerName + "' contains illegal character '" + headerName.charAt(i10) + "' (code " + (headerName.charAt(i10) & 255) + ')');
        Intrinsics.checkNotNullParameter(headerName, "headerName");
        this.f296066a = headerName;
        this.f296067b = i10;
    }

    @NotNull
    public final String a() {
        return this.f296066a;
    }

    public final int b() {
        return this.f296067b;
    }
}
