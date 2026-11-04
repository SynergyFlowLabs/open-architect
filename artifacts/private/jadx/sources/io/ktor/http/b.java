package io.ktor.http;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@NotNull String value) {
        super("Bad Content-Type format: " + value);
        Intrinsics.checkNotNullParameter(value, "value");
    }
}
