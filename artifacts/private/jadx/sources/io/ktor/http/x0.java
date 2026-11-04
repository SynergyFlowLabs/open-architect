package io.ktor.http;

import java.util.List;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class x0 extends io.ktor.util.t1 implements v0 {
    /* JADX WARN: Multi-variable type inference failed */
    public x0() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.ktor.util.t1
    @NotNull
    public String toString() {
        return "Headers " + k();
    }

    public /* synthetic */ x0(Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? MapsKt.emptyMap() : map);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(@NotNull Map<String, ? extends List<String>> values) {
        super(true, values);
        Intrinsics.checkNotNullParameter(values, "values");
    }
}
