package io.ktor.http;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class c2 extends io.ktor.util.x1 implements x1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(@NotNull String name, @NotNull List<String> values) {
        super(true, name, values);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(values, "values");
    }

    @Override // io.ktor.util.x1
    @NotNull
    public String toString() {
        return "Parameters " + k();
    }
}
