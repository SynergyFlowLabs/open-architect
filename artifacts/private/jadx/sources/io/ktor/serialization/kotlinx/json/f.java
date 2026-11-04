package io.ktor.serialization.kotlinx.json;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements io.ktor.serialization.kotlinx.f {
    @Override // io.ktor.serialization.kotlinx.f
    @Nullable
    public io.ktor.serialization.kotlinx.e a(@NotNull x format) {
        Intrinsics.checkNotNullParameter(format, "format");
        if (format instanceof Json) {
            return new g((Json) format);
        }
        return null;
    }
}
