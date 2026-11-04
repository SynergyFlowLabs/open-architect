package io.ktor.http.content;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import kotlin.reflect.KTypeProjection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nVersions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Versions.kt\nio/ktor/http/content/VersionsKt\n+ 2 Attributes.kt\nio/ktor/util/AttributesKt\n+ 3 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,307:1\n21#2:308\n65#3,18:309\n*S KotlinDebug\n*F\n+ 1 Versions.kt\nio/ktor/http/content/VersionsKt\n*L\n16#1:308\n16#1:309,18\n*E\n"})
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final io.ktor.util.a<List<f0>> f295721a;

    static {
        kotlin.reflect.s sVarB;
        kotlin.reflect.d dVarD = j1.d(List.class);
        try {
            sVarB = j1.B(List.class, KTypeProjection.f312969c.e(j1.A(f0.class)));
        } catch (Throwable unused) {
            sVarB = null;
        }
        f295721a = new io.ktor.util.a<>("VersionList", new ri.b(dVarD, sVarB));
    }

    @NotNull
    public static final p a(@NotNull String spec) {
        Intrinsics.checkNotNullParameter(spec, "spec");
        return p.f295746d.c(spec);
    }

    @NotNull
    public static final io.ktor.util.a<List<f0>> b() {
        return f295721a;
    }

    @NotNull
    public static final List<f0> c(@NotNull w wVar) {
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        List<f0> list = (List) wVar.d(f295721a);
        return list == null ? CollectionsKt.emptyList() : list;
    }

    public static final void d(@NotNull w wVar, @NotNull List<? extends f0> value) {
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        wVar.f(f295721a, value);
    }
}
