package io.ktor.client.plugins;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends o1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f294784b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@NotNull io.ktor.client.statement.c response, @NotNull String cachedResponseText) {
        super(response, cachedResponseText);
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(cachedResponseText, "cachedResponseText");
        this.f294784b = "Client request(" + response.h().j().getMethod().l() + ' ' + response.h().j().getUrl() + ") invalid: " + response.j() + ". Text: \"" + cachedResponseText + '\"';
    }

    @Override // java.lang.Throwable
    @NotNull
    public String getMessage() {
        return this.f294784b;
    }
}
