package kotlinx.serialization.internal;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nCaching.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ConcurrentHashMapCache\n+ 2 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,219:1\n72#2,2:220\n1#3:222\n*S KotlinDebug\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ConcurrentHashMapCache\n*L\n142#1:220,2\n142#1:222\n*E\n"})
final class z<T> implements w2<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<kotlin.reflect.d<?>, KSerializer<T>> f316060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final ConcurrentHashMap<Class<?>, m<T>> f316061b;

    /* JADX WARN: Multi-variable type inference failed */
    public z(@NotNull Function1<? super kotlin.reflect.d<?>, ? extends KSerializer<T>> compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.f316060a = compute;
        this.f316061b = new ConcurrentHashMap<>();
    }

    @Override // kotlinx.serialization.internal.w2
    @Nullable
    public KSerializer<T> a(@NotNull kotlin.reflect.d<Object> key) {
        m<T> mVarPutIfAbsent;
        Intrinsics.checkNotNullParameter(key, "key");
        ConcurrentHashMap<Class<?>, m<T>> concurrentHashMap = this.f316061b;
        Class<?> clsE = oj.b.e(key);
        m<T> mVar = concurrentHashMap.get(clsE);
        if (mVar == null && (mVarPutIfAbsent = concurrentHashMap.putIfAbsent(clsE, (mVar = new m<>(this.f316060a.invoke(key))))) != null) {
            mVar = mVarPutIfAbsent;
        }
        return mVar.f315968a;
    }

    @Override // kotlinx.serialization.internal.w2
    public boolean b(@NotNull kotlin.reflect.d<?> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f316061b.containsKey(oj.b.e(key));
    }
}
