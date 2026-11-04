package kotlinx.serialization;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.internal.z0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class y {
    public static final /* synthetic */ <T> T a(a aVar, byte[] bytes) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        kotlinx.serialization.modules.f serializersModule = aVar.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.a.f51379e5);
        kotlin.jvm.internal.q0.n("kotlinx.serialization.serializer.withModule");
        return (T) aVar.b(m0.o(serializersModule, null), bytes);
    }

    public static final /* synthetic */ <T> T b(a aVar, String hex) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(hex, "hex");
        kotlinx.serialization.modules.f serializersModule = aVar.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.a.f51379e5);
        kotlin.jvm.internal.q0.n("kotlinx.serialization.serializer.withModule");
        return (T) c(aVar, m0.o(serializersModule, null), hex);
    }

    public static final <T> T c(@NotNull a aVar, @NotNull e<? extends T> deserializer, @NotNull String hex) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(hex, "hex");
        return (T) aVar.b(deserializer, z0.f316062a.b(hex));
    }

    public static final /* synthetic */ <T> T d(r0 r0Var, String string) {
        Intrinsics.checkNotNullParameter(r0Var, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        kotlinx.serialization.modules.f serializersModule = r0Var.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.a.f51379e5);
        kotlin.jvm.internal.q0.n("kotlinx.serialization.serializer.withModule");
        return (T) r0Var.decodeFromString(m0.o(serializersModule, null), string);
    }

    public static final /* synthetic */ <T> byte[] e(a aVar, T t10) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        kotlinx.serialization.modules.f serializersModule = aVar.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.a.f51379e5);
        kotlin.jvm.internal.q0.n("kotlinx.serialization.serializer.withModule");
        return aVar.a(m0.o(serializersModule, null), t10);
    }

    public static final /* synthetic */ <T> String f(a aVar, T t10) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        kotlinx.serialization.modules.f serializersModule = aVar.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.a.f51379e5);
        kotlin.jvm.internal.q0.n("kotlinx.serialization.serializer.withModule");
        return g(aVar, m0.o(serializersModule, null), t10);
    }

    @NotNull
    public static final <T> String g(@NotNull a aVar, @NotNull d0<? super T> serializer, T t10) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        return z0.f316062a.c(aVar.a(serializer, t10), true);
    }

    public static final /* synthetic */ <T> String h(r0 r0Var, T t10) {
        Intrinsics.checkNotNullParameter(r0Var, "<this>");
        kotlinx.serialization.modules.f serializersModule = r0Var.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.a.f51379e5);
        kotlin.jvm.internal.q0.n("kotlinx.serialization.serializer.withModule");
        return r0Var.encodeToString(m0.o(serializersModule, null), t10);
    }
}
