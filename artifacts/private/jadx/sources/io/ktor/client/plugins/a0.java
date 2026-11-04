package io.ktor.client.plugins;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nHttpClientPlugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpClientPlugin.kt\nio/ktor/client/plugins/HttpClientPluginKt\n+ 2 Attributes.kt\nio/ktor/util/AttributesKt\n+ 3 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,62:1\n21#2:63\n65#3,18:64\n*S KotlinDebug\n*F\n+ 1 HttpClientPlugin.kt\nio/ktor/client/plugins/HttpClientPluginKt\n*L\n11#1:63\n11#1:64,18\n*E\n"})
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final io.ktor.util.a<io.ktor.util.b> f294383a;

    static {
        kotlin.reflect.s sVarA;
        kotlin.reflect.d dVarD = kotlin.jvm.internal.j1.d(io.ktor.util.b.class);
        try {
            sVarA = kotlin.jvm.internal.j1.A(io.ktor.util.b.class);
        } catch (Throwable unused) {
            sVarA = null;
        }
        f294383a = new io.ktor.util.a<>("ApplicationPluginRegistry", new ri.b(dVarD, sVarA));
    }

    @NotNull
    public static final io.ktor.util.a<io.ktor.util.b> a() {
        return f294383a;
    }

    @NotNull
    public static final <B, F> F b(@NotNull io.ktor.client.c cVar, @NotNull z<? extends B, F> plugin) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(plugin, "plugin");
        F f10 = (F) c(cVar, plugin);
        if (f10 != null) {
            return f10;
        }
        throw new IllegalStateException("Plugin " + plugin + " is not installed. Consider using `install(" + plugin.getKey() + ")` in client config first.");
    }

    @Nullable
    public static final <B, F> F c(@NotNull io.ktor.client.c cVar, @NotNull z<? extends B, F> plugin) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(plugin, "plugin");
        io.ktor.util.b bVar = (io.ktor.util.b) cVar.getAttributes().e(f294383a);
        if (bVar != null) {
            return (F) bVar.e(plugin.getKey());
        }
        return null;
    }
}
