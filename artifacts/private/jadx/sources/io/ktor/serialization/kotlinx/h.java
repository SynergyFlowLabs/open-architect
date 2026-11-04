package io.ktor.serialization.kotlinx;

import io.ktor.utils.io.o0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import kotlin.jvm.internal.q1;
import kotlin.reflect.s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.i;
import kotlinx.serialization.m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nSerializerLookup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerializerLookup.kt\nio/ktor/serialization/kotlinx/SerializerLookupKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,85:1\n1#2:86\n1563#3:87\n1634#3,3:88\n1669#3,8:91\n1563#3:99\n1634#3,3:100\n1761#3,3:103\n*S KotlinDebug\n*F\n+ 1 SerializerLookup.kt\nio/ktor/serialization/kotlinx/SerializerLookupKt\n*L\n61#1:87\n61#1:88,3\n61#1:91,8\n66#1:99\n66#1:100,3\n79#1:103,3\n*E\n"})
public final class h {
    private static final KSerializer<?> a(Collection<?> collection, kotlinx.serialization.modules.f fVar) {
        Collection<?> collection2 = collection;
        List listFilterNotNull = CollectionsKt.filterNotNull(collection2);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listFilterNotNull, 10));
        Iterator it = listFilterNotNull.iterator();
        while (it.hasNext()) {
            arrayList.add(b(it.next(), fVar));
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (hashSet.add(((KSerializer) obj).getDescriptor().getSerialName())) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.size() > 1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Serializing collections of different element types is not yet supported. Selected serializers: ");
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((KSerializer) it2.next()).getDescriptor().getSerialName());
            }
            sb2.append(arrayList3);
            throw new IllegalStateException(sb2.toString().toString());
        }
        KSerializer<String> kSerializerK = (KSerializer) CollectionsKt.singleOrNull((List) arrayList2);
        if (kSerializerK == null) {
            kSerializerK = hk.a.K(q1.f312784a);
        }
        if (kSerializerK.getDescriptor().isNullable()) {
            return kSerializerK;
        }
        Intrinsics.checkNotNull(kSerializerK, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return kSerializerK;
        }
        Iterator<T> it3 = collection2.iterator();
        while (it3.hasNext()) {
            if (it3.next() == null) {
                return hk.a.v(kSerializerK);
            }
        }
        return kSerializerK;
    }

    @o0
    @NotNull
    public static final KSerializer<Object> b(@Nullable Object obj, @NotNull kotlinx.serialization.modules.f module) {
        KSerializer<Object> kSerializerI;
        Intrinsics.checkNotNullParameter(module, "module");
        if (obj == null) {
            kSerializerI = hk.a.v(hk.a.K(q1.f312784a));
        } else if (obj instanceof List) {
            kSerializerI = hk.a.i(a((Collection) obj, module));
        } else if (obj instanceof Object[]) {
            Object objFirstOrNull = ArraysKt.firstOrNull((Object[]) obj);
            if (objFirstOrNull == null || (kSerializerI = b(objFirstOrNull, module)) == null) {
                kSerializerI = hk.a.i(hk.a.K(q1.f312784a));
            }
        } else if (obj instanceof Set) {
            kSerializerI = hk.a.o(a((Collection) obj, module));
        } else if (obj instanceof Map) {
            Map map = (Map) obj;
            kSerializerI = hk.a.l(a(map.keySet(), module), a(map.values(), module));
        } else {
            KSerializer<Object> kSerializerD = kotlinx.serialization.modules.f.d(module, j1.d(obj.getClass()), null, 2, null);
            kSerializerI = kSerializerD == null ? m0.i(j1.d(obj.getClass())) : kSerializerD;
        }
        Intrinsics.checkNotNull(kSerializerI, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
        return kSerializerI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.serialization.KSerializer<?>] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    private static final <T> KSerializer<?> c(KSerializer<T> kSerializer, ri.b bVar) {
        s sVarA = bVar.a();
        ?? r10 = kSerializer;
        if (sVarA != null && sVarA.A()) {
            r10 = kSerializer;
            r10 = (KSerializer<T>) hk.a.v(kSerializer);
        }
        r10 = kSerializer;
        return r10;
    }

    @i
    @kotlinx.serialization.g
    @NotNull
    public static final KSerializer<?> d(@NotNull kotlinx.serialization.modules.f fVar, @NotNull ri.b typeInfo) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(typeInfo, "typeInfo");
        s sVarA = typeInfo.a();
        if (sVarA != null) {
            KSerializer<?> kSerializerT = sVarA.d().isEmpty() ? null : m0.t(fVar, sVarA);
            if (kSerializerT != null) {
                return kSerializerT;
            }
        }
        KSerializer kSerializerD = kotlinx.serialization.modules.f.d(fVar, typeInfo.b(), null, 2, null);
        return kSerializerD != null ? c(kSerializerD, typeInfo) : c(m0.i(typeInfo.b()), typeInfo);
    }
}
