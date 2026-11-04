package kotlinx.serialization.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nCaching.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ConcurrentHashMapParametrizedCache\n+ 2 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Caching.kt\nkotlinx/serialization/internal/ParametrizedCacheEntry\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,219:1\n72#2,2:220\n72#2,2:229\n1#3:222\n1#3:232\n212#4:223\n213#4:228\n214#4:231\n1563#5:224\n1634#5,3:225\n*S KotlinDebug\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ConcurrentHashMapParametrizedCache\n*L\n158#1:220,2\n159#1:229,2\n158#1:222\n159#1:232\n159#1:223\n159#1:228\n159#1:231\n159#1:224\n159#1:225,3\n*E\n"})
final class a0<T> implements d2<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function2<kotlin.reflect.d<Object>, List<? extends kotlin.reflect.s>, KSerializer<T>> f315889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final ConcurrentHashMap<Class<?>, c2<T>> f315890b;

    /* JADX WARN: Multi-variable type inference failed */
    public a0(@NotNull Function2<? super kotlin.reflect.d<Object>, ? super List<? extends kotlin.reflect.s>, ? extends KSerializer<T>> compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.f315889a = compute;
        this.f315890b = new ConcurrentHashMap<>();
    }

    @Override // kotlinx.serialization.internal.d2
    @NotNull
    public Object a(@NotNull kotlin.reflect.d<Object> key, @NotNull List<? extends kotlin.reflect.s> types) {
        Object objM785constructorimpl;
        c2<T> c2VarPutIfAbsent;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(types, "types");
        ConcurrentHashMap<Class<?>, c2<T>> concurrentHashMap = this.f315890b;
        Class<?> clsE = oj.b.e(key);
        c2<T> c2Var = concurrentHashMap.get(clsE);
        if (c2Var == null && (c2VarPutIfAbsent = concurrentHashMap.putIfAbsent(clsE, (c2Var = new c2<>()))) != null) {
            c2Var = c2VarPutIfAbsent;
        }
        c2<T> c2Var2 = c2Var;
        List<? extends kotlin.reflect.s> list = types;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new b1((kotlin.reflect.s) it.next()));
        }
        ConcurrentHashMap concurrentHashMap2 = ((c2) c2Var2).f315903a;
        Object obj = concurrentHashMap2.get(arrayList);
        if (obj == null) {
            try {
                Result.a aVar = Result.Companion;
                objM785constructorimpl = Result.m785constructorimpl(this.f315889a.invoke(key, types));
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                objM785constructorimpl = Result.m785constructorimpl(ResultKt.createFailure(th2));
            }
            Result resultA = Result.a(objM785constructorimpl);
            Object objPutIfAbsent = concurrentHashMap2.putIfAbsent(arrayList, resultA);
            obj = objPutIfAbsent == null ? resultA : objPutIfAbsent;
        }
        Intrinsics.checkNotNullExpressionValue(obj, "getOrPut(...)");
        return ((Result) obj).j();
    }
}
