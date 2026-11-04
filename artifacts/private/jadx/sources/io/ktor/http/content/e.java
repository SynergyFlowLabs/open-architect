package io.ktor.http.content;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nCachingOptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CachingOptions.kt\nio/ktor/http/content/CachingOptionsKt\n+ 2 Attributes.kt\nio/ktor/util/AttributesKt\n+ 3 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,36:1\n21#2:37\n65#3,18:38\n*S KotlinDebug\n*F\n+ 1 CachingOptions.kt\nio/ktor/http/content/CachingOptionsKt\n*L\n26#1:37\n26#1:38,18\n*E\n"})
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final io.ktor.util.a<d> f295705a;

    static {
        kotlin.reflect.s sVarA;
        kotlin.reflect.d dVarD = j1.d(d.class);
        try {
            sVarA = j1.A(d.class);
        } catch (Throwable unused) {
            sVarA = null;
        }
        f295705a = new io.ktor.util.a<>("Caching", new ri.b(dVarD, sVarA));
    }

    @Nullable
    public static final d a(@NotNull w wVar) {
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        return (d) wVar.d(f295705a);
    }

    @NotNull
    public static final io.ktor.util.a<d> b() {
        return f295705a;
    }

    public static final void c(@NotNull w wVar, @Nullable d dVar) {
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        wVar.f(f295705a, dVar);
    }
}
