package io.ktor.client.call;

import io.ktor.http.content.w;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(@NotNull w content) {
        super("Failed to write body: " + j1.d(content.getClass()));
        Intrinsics.checkNotNullParameter(content, "content");
    }
}
