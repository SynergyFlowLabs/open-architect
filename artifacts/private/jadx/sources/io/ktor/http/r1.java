package io.ktor.http;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class r1 extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(@NotNull String data, @NotNull String reason) {
        super("Failed to parse date string: \"" + data + "\". Reason: \"" + reason + '\"');
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(reason, "reason");
    }
}
