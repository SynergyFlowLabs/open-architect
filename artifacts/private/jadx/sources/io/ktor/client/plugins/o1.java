package io.ktor.client.plugins;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public class o1 extends IllegalStateException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final transient io.ktor.client.statement.c f294920a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(@NotNull io.ktor.client.statement.c response, @NotNull String cachedResponseText) {
        super("Bad response: " + response + ". Text: \"" + cachedResponseText + '\"');
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(cachedResponseText, "cachedResponseText");
        this.f294920a = response;
    }

    @NotNull
    public final io.ktor.client.statement.c a() {
        return this.f294920a;
    }
}
