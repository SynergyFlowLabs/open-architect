package io.ktor.http;

import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nHeaders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Headers.kt\nio/ktor/http/HeadersKt\n+ 2 Headers.kt\nio/ktor/http/Headers$Companion\n*L\n1#1,108:1\n30#2:109\n*S KotlinDebug\n*F\n+ 1 Headers.kt\nio/ktor/http/HeadersKt\n*L\n94#1:109\n*E\n"})
public final class y0 {
    @NotNull
    public static final v0 a(@NotNull Function1<? super w0, Unit> builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        v0.a aVar = v0.f296123a;
        w0 w0Var = new w0(0, 1, null);
        builder.invoke(w0Var);
        return w0Var.build();
    }

    @NotNull
    public static final v0 b() {
        return v0.f296123a.b();
    }

    @NotNull
    public static final v0 c(@NotNull String name, @NotNull String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        return new z0(name, CollectionsKt.listOf(value));
    }

    @NotNull
    public static final v0 d(@NotNull String name, @NotNull List<String> values) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(values, "values");
        return new z0(name, values);
    }

    @NotNull
    public static final v0 e(@NotNull Pair<String, ? extends List<String>>... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        return new x0(MapsKt.toMap(ArraysKt.asList(pairs)));
    }
}
