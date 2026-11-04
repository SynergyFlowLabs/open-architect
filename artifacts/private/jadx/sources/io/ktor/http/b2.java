package io.ktor.http;

import java.util.List;
import java.util.Map;
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
@SourceDebugExtension({"SMAP\nParameters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Parameters.kt\nio/ktor/http/ParametersKt\n+ 2 Parameters.kt\nio/ktor/http/Parameters$Companion\n*L\n1#1,136:1\n31#2:137\n31#2:138\n*S KotlinDebug\n*F\n+ 1 Parameters.kt\nio/ktor/http/ParametersKt\n*L\n91#1:137\n113#1:138\n*E\n"})
public final class b2 {
    @NotNull
    public static final y1 a(int i10) {
        return new z1(i10);
    }

    public static /* synthetic */ y1 b(int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 8;
        }
        return a(i10);
    }

    @NotNull
    public static final x1 c(@NotNull Function1<? super y1, Unit> builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        x1.a aVar = x1.f296128b;
        y1 y1VarB = b(0, 1, null);
        builder.invoke(y1VarB);
        return y1VarB.build();
    }

    @NotNull
    public static final x1 d() {
        return x1.f296128b.b();
    }

    @NotNull
    public static final x1 e(@NotNull String name, @NotNull String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        return new c2(name, CollectionsKt.listOf(value));
    }

    @NotNull
    public static final x1 f(@NotNull String name, @NotNull List<String> values) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(values, "values");
        return new c2(name, values);
    }

    @NotNull
    public static final x1 g(@NotNull Map<String, ? extends List<String>> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        return new a2(map);
    }

    @NotNull
    public static final x1 h(@NotNull Pair<String, ? extends List<String>>... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        return new a2(MapsKt.toMap(ArraysKt.asList(pairs)));
    }

    @NotNull
    public static final x1 i(@NotNull x1 x1Var, @NotNull x1 other) {
        Intrinsics.checkNotNullParameter(x1Var, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (x1Var.c() != other.c()) {
            throw new IllegalArgumentException("Cannot concatenate Parameters with case-sensitive and case-insensitive names");
        }
        if (x1Var.isEmpty()) {
            return other;
        }
        if (other.isEmpty()) {
            return x1Var;
        }
        x1.a aVar = x1.f296128b;
        y1 y1VarB = b(0, 1, null);
        y1VarB.j(x1Var);
        y1VarB.j(other);
        return y1VarB.build();
    }
}
