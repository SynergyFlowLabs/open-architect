package kotlinx.serialization;

import java.lang.reflect.Type;
import java.util.List;
import kotlin.a1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class m0 {
    @a1
    @NotNull
    public static final KSerializer<?> a(@NotNull kotlinx.serialization.modules.f fVar, @NotNull kotlin.reflect.d<?> dVar) {
        return q0.e(fVar, dVar);
    }

    @a1
    @NotNull
    public static final KSerializer<?> b(@NotNull kotlinx.serialization.modules.f fVar, @NotNull kotlin.reflect.d<?> dVar, @NotNull KSerializer<?>[] kSerializerArr) {
        return q0.f(fVar, dVar, kSerializerArr);
    }

    @a1
    @NotNull
    public static final KSerializer<?> c(@NotNull String str) {
        return q0.g(str);
    }

    @a1
    @NotNull
    public static final KSerializer<?> d(@NotNull kotlinx.serialization.modules.f fVar, @NotNull kotlin.reflect.d<?> dVar) {
        return q0.h(fVar, dVar);
    }

    @a1
    @NotNull
    public static final KSerializer<?> e(@NotNull kotlinx.serialization.modules.f fVar, @NotNull kotlin.reflect.d<?> dVar, @NotNull KSerializer<?>[] kSerializerArr) {
        return q0.i(fVar, dVar, kSerializerArr);
    }

    @Nullable
    public static final KSerializer<? extends Object> f(@NotNull kotlin.reflect.d<Object> dVar, @NotNull List<? extends KSerializer<Object>> list, @NotNull Function0<? extends kotlin.reflect.g> function0) {
        return q0.k(dVar, list, function0);
    }

    public static final /* synthetic */ <T> KSerializer<T> g() {
        Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.a.f51379e5);
        kotlin.jvm.internal.q0.n("kotlinx.serialization.serializer.simple");
        return (KSerializer<T>) k(null);
    }

    @NotNull
    public static final KSerializer<Object> h(@NotNull Type type) {
        return n0.d(type);
    }

    @i
    @NotNull
    public static final <T> KSerializer<T> i(@NotNull kotlin.reflect.d<T> dVar) {
        return q0.m(dVar);
    }

    @g
    @NotNull
    public static final KSerializer<Object> j(@NotNull kotlin.reflect.d<?> dVar, @NotNull List<? extends KSerializer<?>> list, boolean z10) {
        return q0.n(dVar, list, z10);
    }

    @NotNull
    public static final KSerializer<Object> k(@NotNull kotlin.reflect.s sVar) {
        return q0.o(sVar);
    }

    public static final /* synthetic */ <T> KSerializer<T> l(kotlinx.serialization.modules.f fVar) {
        Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.a.f51379e5);
        kotlin.jvm.internal.q0.n("kotlinx.serialization.serializer.withModule");
        return (KSerializer<T>) o(fVar, null);
    }

    @NotNull
    public static final KSerializer<Object> m(@NotNull kotlinx.serialization.modules.f fVar, @NotNull Type type) {
        return n0.e(fVar, type);
    }

    @g
    @NotNull
    public static final KSerializer<Object> n(@NotNull kotlinx.serialization.modules.f fVar, @NotNull kotlin.reflect.d<?> dVar, @NotNull List<? extends KSerializer<?>> list, boolean z10) {
        return q0.q(fVar, dVar, list, z10);
    }

    @NotNull
    public static final KSerializer<Object> o(@NotNull kotlinx.serialization.modules.f fVar, @NotNull kotlin.reflect.s sVar) {
        return q0.r(fVar, sVar);
    }

    @Nullable
    public static final KSerializer<Object> p(@NotNull Type type) {
        return n0.h(type);
    }

    @i
    @Nullable
    public static final <T> KSerializer<T> q(@NotNull kotlin.reflect.d<T> dVar) {
        return q0.w(dVar);
    }

    @Nullable
    public static final KSerializer<Object> r(@NotNull kotlin.reflect.s sVar) {
        return q0.x(sVar);
    }

    @Nullable
    public static final KSerializer<Object> s(@NotNull kotlinx.serialization.modules.f fVar, @NotNull Type type) {
        return n0.i(fVar, type);
    }

    @Nullable
    public static final KSerializer<Object> t(@NotNull kotlinx.serialization.modules.f fVar, @NotNull kotlin.reflect.s sVar) {
        return q0.y(fVar, sVar);
    }

    @Nullable
    public static final List<KSerializer<Object>> u(@NotNull kotlinx.serialization.modules.f fVar, @NotNull List<? extends kotlin.reflect.s> list, boolean z10) {
        return q0.z(fVar, list, z10);
    }
}
