package io.ktor.util;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nAttributesJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AttributesJvm.kt\nio/ktor/util/HashMapAttributes\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,70:1\n1#2:71\n*E\n"})
final class v0 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<a<?>, Object> f296815a = new HashMap();

    @Override // io.ktor.util.b
    @NotNull
    public <T> T i(@NotNull a<T> key, @NotNull Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(block, "block");
        T t10 = (T) j().get(key);
        if (t10 != null) {
            return t10;
        }
        T tInvoke = block.invoke();
        Object objPut = j().put(key, tInvoke);
        if (objPut != null) {
            tInvoke = (T) objPut;
        }
        Intrinsics.checkNotNull(tInvoke, "null cannot be cast to non-null type T of io.ktor.util.HashMapAttributes.computeIfAbsent");
        return tInvoke;
    }

    @Override // io.ktor.util.c
    @NotNull
    protected Map<a<?>, Object> j() {
        return this.f296815a;
    }
}
