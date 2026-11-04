package io.ktor.client.plugins.websocket;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.j1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nClientSessions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClientSessions.kt\nio/ktor/client/plugins/websocket/ClientSessionsKt\n+ 2 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,139:1\n65#2,18:140\n65#2,18:158\n*S KotlinDebug\n*F\n+ 1 ClientSessions.kt\nio/ktor/client/plugins/websocket/ClientSessionsKt\n*L\n93#1:140,18\n138#1:158,18\n*E\n"})
public final class t {
    @Nullable
    public static final io.ktor.serialization.h a(@NotNull v vVar) {
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        d0 d0Var = (d0) io.ktor.client.plugins.a0.c(vVar.h().i(), d0.f295204e);
        if (d0Var != null) {
            return d0Var.g();
        }
        return null;
    }

    public static final /* synthetic */ <T> Object b(v vVar, kotlin.coroutines.d<? super T> dVar) throws io.ktor.serialization.j, io.ktor.serialization.k {
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        kotlin.reflect.d dVarD = j1.d(Object.class);
        try {
            Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.a.f51379e5);
        } catch (Throwable unused) {
        }
        ri.b bVar = new ri.b(dVarD, null);
        h0.e(0);
        Object objC = c(vVar, bVar, dVar);
        h0.e(1);
        return objC;
    }

    @Nullable
    public static final <T> Object c(@NotNull v vVar, @NotNull ri.b bVar, @NotNull kotlin.coroutines.d<? super T> dVar) throws io.ktor.serialization.j, io.ktor.serialization.k {
        io.ktor.serialization.h hVarA = a(vVar);
        if (hVarA == null) {
            throw new io.ktor.serialization.j("No converter was found for websocket", null, 2, null);
        }
        Object objB = io.ktor.websocket.serialization.a.b(vVar, bVar, hVarA, io.ktor.serialization.e.c(vVar.h().j().O(), null, 1, null), dVar);
        kotlin.coroutines.intrinsics.b.l();
        return objB;
    }

    public static final /* synthetic */ <T> Object d(v vVar, T t10, kotlin.coroutines.d<? super Unit> dVar) throws io.ktor.serialization.j {
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        kotlin.reflect.d dVarD = j1.d(Object.class);
        try {
            Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.a.f51379e5);
        } catch (Throwable unused) {
        }
        ri.b bVar = new ri.b(dVarD, null);
        h0.e(0);
        e(vVar, t10, bVar, dVar);
        h0.e(1);
        return Unit.f312394a;
    }

    @Nullable
    public static final Object e(@NotNull v vVar, @Nullable Object obj, @NotNull ri.b bVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) throws io.ktor.serialization.j {
        io.ktor.serialization.h hVarA = a(vVar);
        if (hVarA == null) {
            throw new io.ktor.serialization.j("No converter was found for websocket", null, 2, null);
        }
        Object objD = io.ktor.websocket.serialization.a.d(vVar, obj, bVar, hVarA, io.ktor.serialization.e.c(vVar.h().j().O(), null, 1, null), dVar);
        return objD == kotlin.coroutines.intrinsics.b.l() ? objD : Unit.f312394a;
    }
}
