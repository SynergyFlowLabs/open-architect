package io.ktor.client.plugins.websocket;

import java.util.List;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import kotlin.reflect.KTypeProjection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nWebSockets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSockets.kt\nio/ktor/client/plugins/websocket/WebSocketsKt\n+ 2 Attributes.kt\nio/ktor/util/AttributesKt\n+ 3 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,249:1\n21#2:250\n65#3,18:251\n*S KotlinDebug\n*F\n+ 1 WebSockets.kt\nio/ktor/client/plugins/websocket/WebSocketsKt\n*L\n20#1:250\n20#1:251,18\n*E\n"})
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final io.ktor.util.a<List<io.ktor.websocket.e0<?>>> f295223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final org.slf4j.c f295224b;

    static {
        kotlin.reflect.s sVarB;
        kotlin.reflect.d dVarD = j1.d(List.class);
        try {
            KTypeProjection.a aVar = KTypeProjection.f312969c;
            sVarB = j1.B(List.class, aVar.e(j1.B(io.ktor.websocket.e0.class, aVar.c())));
        } catch (Throwable unused) {
            sVarB = null;
        }
        f295223a = new io.ktor.util.a<>("Websocket extensions", new ri.b(dVarD, sVarB));
        f295224b = pi.a.a("io.ktor.client.plugins.websocket.WebSockets");
    }

    @NotNull
    public static final org.slf4j.c b() {
        return f295224b;
    }
}
