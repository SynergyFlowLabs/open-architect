package kotlinx.serialization.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nCaching.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ParametrizedCacheEntry\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,219:1\n1563#2:220\n1634#2,3:221\n72#3,2:224\n1#4:226\n1#4:227\n*S KotlinDebug\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ParametrizedCacheEntry\n*L\n212#1:220\n212#1:221,3\n213#1:224,2\n213#1:227\n*E\n"})
final class c2<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ConcurrentHashMap<List<b1>, Result<KSerializer<T>>> f315903a = new ConcurrentHashMap<>();

    @NotNull
    public final Object b(@NotNull List<? extends kotlin.reflect.s> types, @NotNull Function0<? extends KSerializer<T>> producer) {
        Object objM785constructorimpl;
        Intrinsics.checkNotNullParameter(types, "types");
        Intrinsics.checkNotNullParameter(producer, "producer");
        List<? extends kotlin.reflect.s> list = types;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new b1((kotlin.reflect.s) it.next()));
        }
        ConcurrentHashMap concurrentHashMap = this.f315903a;
        Object objA = concurrentHashMap.get(arrayList);
        if (objA == null) {
            try {
                Result.a aVar = Result.Companion;
                objM785constructorimpl = Result.m785constructorimpl(producer.invoke());
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                objM785constructorimpl = Result.m785constructorimpl(ResultKt.createFailure(th2));
            }
            objA = Result.a(objM785constructorimpl);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(arrayList, objA);
            if (objPutIfAbsent != null) {
                objA = objPutIfAbsent;
            }
        }
        Intrinsics.checkNotNullExpressionValue(objA, "getOrPut(...)");
        return ((Result) objA).j();
    }
}
