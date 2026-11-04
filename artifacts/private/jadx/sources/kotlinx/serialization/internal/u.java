package kotlinx.serialization.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nCaching.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ClassValueParametrizedCache\n+ 2 Caching.kt\nkotlinx/serialization/internal/ClassValueReferences\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Caching.kt\nkotlinx/serialization/internal/ParametrizedCacheEntry\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n*L\n1#1,219:1\n84#2,3:220\n89#2:224\n1#3:223\n1#3:234\n212#4:225\n213#4:230\n214#4:233\n1563#5:226\n1634#5,3:227\n72#6,2:231\n*S KotlinDebug\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ClassValueParametrizedCache\n*L\n128#1:220,3\n128#1:224\n128#1:223\n129#1:234\n129#1:225\n129#1:230\n129#1:233\n129#1:226\n129#1:227,3\n129#1:231,2\n*E\n"})
final class u<T> implements d2<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function2<kotlin.reflect.d<Object>, List<? extends kotlin.reflect.s>, KSerializer<T>> f316021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final v<c2<T>> f316022b;

    @SourceDebugExtension({"SMAP\nCaching.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ClassValueReferences$getOrSet$2\n+ 2 Caching.kt\nkotlinx/serialization/internal/ClassValueParametrizedCache\n*L\n1#1,89:1\n128#2:90\n*E\n"})
    public static final class a implements Function0<T> {
        @Override // kotlin.jvm.functions.Function0
        public final T invoke() {
            return (T) new c2();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u(@NotNull Function2<? super kotlin.reflect.d<Object>, ? super List<? extends kotlin.reflect.s>, ? extends KSerializer<T>> compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.f316021a = compute;
        this.f316022b = new v<>();
    }

    @Override // kotlinx.serialization.internal.d2
    @NotNull
    public Object a(@NotNull kotlin.reflect.d<Object> key, @NotNull List<? extends kotlin.reflect.s> types) {
        Object objM785constructorimpl;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(types, "types");
        Object obj = this.f316022b.get(oj.b.e(key));
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        p1 p1Var = (p1) obj;
        T t10 = p1Var.f315993a.get();
        if (t10 == null) {
            t10 = (T) p1Var.a(new a());
        }
        c2 c2Var = t10;
        List<? extends kotlin.reflect.s> list = types;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new b1((kotlin.reflect.s) it.next()));
        }
        ConcurrentHashMap concurrentHashMap = c2Var.f315903a;
        Object obj2 = concurrentHashMap.get(arrayList);
        if (obj2 == null) {
            try {
                Result.a aVar = Result.Companion;
                objM785constructorimpl = Result.m785constructorimpl(this.f316021a.invoke(key, types));
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                objM785constructorimpl = Result.m785constructorimpl(ResultKt.createFailure(th2));
            }
            Result resultA = Result.a(objM785constructorimpl);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(arrayList, resultA);
            obj2 = objPutIfAbsent == null ? resultA : objPutIfAbsent;
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "getOrPut(...)");
        return ((Result) obj2).j();
    }
}
