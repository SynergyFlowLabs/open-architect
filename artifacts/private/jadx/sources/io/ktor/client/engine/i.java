package io.ktor.client.engine;

import io.ktor.client.plugins.e1;
import java.util.Map;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import kotlin.reflect.KTypeProjection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nHttpClientEngineCapability.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpClientEngineCapability.kt\nio/ktor/client/engine/HttpClientEngineCapabilityKt\n+ 2 Attributes.kt\nio/ktor/util/AttributesKt\n+ 3 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,78:1\n21#2:79\n65#3,18:80\n*S KotlinDebug\n*F\n+ 1 HttpClientEngineCapability.kt\nio/ktor/client/engine/HttpClientEngineCapabilityKt\n*L\n14#1:79\n14#1:80,18\n*E\n"})
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final io.ktor.util.a<Map<h<?>, Object>> f294338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Set<h<?>> f294339b;

    static {
        kotlin.reflect.s sVarI;
        kotlin.reflect.d dVarD = j1.d(Map.class);
        try {
            KTypeProjection.a aVar = KTypeProjection.f312969c;
            sVarI = j1.i(j1.C(Map.class, aVar.e(j1.B(h.class, aVar.c())), aVar.e(j1.A(Object.class))));
        } catch (Throwable unused) {
            sVarI = null;
        }
        f294338a = new io.ktor.util.a<>("EngineCapabilities", new ri.b(dVarD, sVarI));
        f294339b = SetsKt.setOf(e1.f294787a);
    }

    @NotNull
    public static final Set<h<?>> a() {
        return f294339b;
    }

    @NotNull
    public static final io.ktor.util.a<Map<h<?>, Object>> b() {
        return f294338a;
    }
}
