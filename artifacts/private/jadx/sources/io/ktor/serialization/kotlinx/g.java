package io.ktor.serialization.kotlinx;

import io.ktor.serialization.j;
import io.ktor.serialization.k;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.c0;
import kotlinx.serialization.r0;
import kotlinx.serialization.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements io.ktor.serialization.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final x f296449a;

    public g(@NotNull x format) {
        Intrinsics.checkNotNullParameter(format, "format");
        this.f296449a = format;
        if (!(format instanceof kotlinx.serialization.a) && !(format instanceof r0)) {
            throw new IllegalArgumentException(("Only binary and string formats are supported, " + format + " is not supported.").toString());
        }
    }

    private final io.ktor.websocket.e d(KSerializer<?> kSerializer, x xVar, Object obj) {
        if (xVar instanceof r0) {
            Intrinsics.checkNotNull(kSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any?>");
            return new io.ktor.websocket.e.f(((r0) xVar).encodeToString(kSerializer, obj));
        }
        if (xVar instanceof kotlinx.serialization.a) {
            Intrinsics.checkNotNull(kSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any?>");
            return new io.ktor.websocket.e.a(true, ((kotlinx.serialization.a) xVar).a(kSerializer, obj));
        }
        throw new IllegalStateException(("Unsupported format " + xVar).toString());
    }

    @Override // io.ktor.serialization.h
    @Nullable
    public Object a(@NotNull Charset charset, @NotNull ri.b bVar, @NotNull io.ktor.websocket.e eVar, @NotNull kotlin.coroutines.d<Object> dVar) throws j, k {
        if (!b(eVar)) {
            throw new j("Unsupported frame " + eVar.g().name(), null, 2, null);
        }
        KSerializer<?> kSerializerD = h.d(this.f296449a.getSerializersModule(), bVar);
        x xVar = this.f296449a;
        if (xVar instanceof r0) {
            if (eVar instanceof io.ktor.websocket.e.f) {
                return ((r0) xVar).decodeFromString(kSerializerD, io.ktor.websocket.f.c((io.ktor.websocket.e.f) eVar));
            }
            throw new k("Unsupported format " + this.f296449a + " for " + eVar.g().name(), null, eVar, 2, null);
        }
        if (!(xVar instanceof kotlinx.serialization.a)) {
            throw new IllegalStateException(("Unsupported format " + this.f296449a).toString());
        }
        if (eVar instanceof io.ktor.websocket.e.a) {
            return ((kotlinx.serialization.a) xVar).b(kSerializerD, io.ktor.websocket.f.a(eVar));
        }
        throw new k("Unsupported format " + this.f296449a + " for " + eVar.g().name(), null, eVar, 2, null);
    }

    @Override // io.ktor.serialization.h
    public boolean b(@NotNull io.ktor.websocket.e frame) {
        Intrinsics.checkNotNullParameter(frame, "frame");
        if (!(frame instanceof io.ktor.websocket.e.f) && !(frame instanceof io.ktor.websocket.e.a)) {
            return false;
        }
        return true;
    }

    @Override // io.ktor.serialization.h
    @Nullable
    public Object c(@NotNull Charset charset, @NotNull ri.b bVar, @Nullable Object obj, @NotNull kotlin.coroutines.d<? super io.ktor.websocket.e> dVar) {
        KSerializer<?> kSerializerB;
        try {
            kSerializerB = h.d(this.f296449a.getSerializersModule(), bVar);
        } catch (c0 unused) {
            kSerializerB = h.b(obj, this.f296449a.getSerializersModule());
        }
        return d(kSerializerB, this.f296449a, obj);
    }
}
