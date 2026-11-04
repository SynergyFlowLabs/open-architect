package io.ktor.util;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nAttributesJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AttributesJvm.kt\nio/ktor/util/ConcurrentSafeAttributes\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,70:1\n1#2:71\n*E\n"})
final class y extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ConcurrentHashMap<a<?>, Object> f296828a = new ConcurrentHashMap<>();

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
        Object objPutIfAbsent = j().putIfAbsent(key, tInvoke);
        if (objPutIfAbsent != null) {
            tInvoke = (T) objPutIfAbsent;
        }
        Intrinsics.checkNotNull(tInvoke, "null cannot be cast to non-null type T of io.ktor.util.ConcurrentSafeAttributes.computeIfAbsent");
        return tInvoke;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.ktor.util.c
    @NotNull
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public ConcurrentHashMap<a<?>, Object> j() {
        return this.f296828a;
    }
}
