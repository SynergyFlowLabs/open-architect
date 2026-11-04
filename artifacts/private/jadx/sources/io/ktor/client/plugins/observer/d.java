package io.ktor.client.plugins.observer;

import io.ktor.http.v0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class d {
    @NotNull
    public static final io.ktor.client.call.b a(@NotNull io.ktor.client.call.b bVar, @NotNull io.ktor.utils.io.h content, @NotNull v0 headers) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(headers, "headers");
        return new c(bVar.i(), content, bVar, headers);
    }

    @NotNull
    public static final io.ktor.client.call.b b(@NotNull io.ktor.client.call.b bVar, @NotNull io.ktor.utils.io.h content) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(content, "content");
        return new c(bVar.i(), content, bVar, (v0) null, 8, (DefaultConstructorMarker) null);
    }

    @NotNull
    public static final io.ktor.client.call.b c(@NotNull io.ktor.client.call.b bVar, @NotNull Function0<? extends io.ktor.utils.io.h> block) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        return new c(bVar.i(), block, bVar, (v0) null, 8, (DefaultConstructorMarker) null);
    }
}
