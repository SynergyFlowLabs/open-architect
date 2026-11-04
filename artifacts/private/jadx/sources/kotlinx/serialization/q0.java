package kotlinx.serialization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Result;
import kotlin.a1;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import kotlin.n1;
import kotlin.reflect.KTypeProjection;
import kotlinx.serialization.internal.e1;
import kotlinx.serialization.internal.e2;
import kotlinx.serialization.internal.f2;
import kotlinx.serialization.internal.g1;
import kotlinx.serialization.internal.s2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nSerializers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Serializers.kt\nkotlinx/serialization/SerializersKt__SerializersKt\n+ 2 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 SerializersCache.kt\nkotlinx/serialization/SerializersCacheKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,421:1\n78#2:422\n78#2:423\n78#2:430\n78#2:431\n1563#3:424\n1634#3,3:425\n1563#3:432\n1634#3,3:433\n1563#3:436\n1634#3,3:437\n78#4:428\n78#4:429\n37#5:440\n36#5,3:441\n*S KotlinDebug\n*F\n+ 1 Serializers.kt\nkotlinx/serialization/SerializersKt__SerializersKt\n*L\n35#1:422\n54#1:423\n232#1:430\n256#1:431\n190#1:424\n190#1:425,3\n267#1:432\n267#1:433,3\n269#1:436\n269#1:437,3\n223#1:428\n230#1:429\n334#1:440\n334#1:441,3\n*E\n"})
final /* synthetic */ class q0 {
    private static final KSerializer<? extends Object> c(kotlin.reflect.d<Object> dVar, List<? extends KSerializer<Object>> list, Function0<? extends kotlin.reflect.g> function0) {
        if (Intrinsics.areEqual(dVar, j1.d(Collection.class)) || Intrinsics.areEqual(dVar, j1.d(List.class)) || Intrinsics.areEqual(dVar, j1.d(List.class)) || Intrinsics.areEqual(dVar, j1.d(ArrayList.class))) {
            return new kotlinx.serialization.internal.f(list.get(0));
        }
        if (Intrinsics.areEqual(dVar, j1.d(HashSet.class))) {
            return new kotlinx.serialization.internal.t0(list.get(0));
        }
        if (Intrinsics.areEqual(dVar, j1.d(Set.class)) || Intrinsics.areEqual(dVar, j1.d(Set.class)) || Intrinsics.areEqual(dVar, j1.d(LinkedHashSet.class))) {
            return new g1(list.get(0));
        }
        if (Intrinsics.areEqual(dVar, j1.d(HashMap.class))) {
            return new kotlinx.serialization.internal.r0(list.get(0), list.get(1));
        }
        if (Intrinsics.areEqual(dVar, j1.d(Map.class)) || Intrinsics.areEqual(dVar, j1.d(Map.class)) || Intrinsics.areEqual(dVar, j1.d(LinkedHashMap.class))) {
            return new e1(list.get(0), list.get(1));
        }
        if (Intrinsics.areEqual(dVar, j1.d(Map.Entry.class))) {
            return hk.a.k(list.get(0), list.get(1));
        }
        if (Intrinsics.areEqual(dVar, j1.d(Pair.class))) {
            return hk.a.n(list.get(0), list.get(1));
        }
        if (Intrinsics.areEqual(dVar, j1.d(n1.class))) {
            return hk.a.q(list.get(0), list.get(1), list.get(2));
        }
        if (!e2.q(dVar)) {
            return null;
        }
        kotlin.reflect.g gVarInvoke = function0.invoke();
        Intrinsics.checkNotNull(gVarInvoke, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
        return hk.a.a((kotlin.reflect.d) gVarInvoke, list.get(0));
    }

    private static final KSerializer<? extends Object> d(kotlin.reflect.d<Object> dVar, List<? extends KSerializer<Object>> list) {
        KSerializer[] kSerializerArr = (KSerializer[]) list.toArray(new KSerializer[0]);
        return e2.d(dVar, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
    }

    @a1
    @NotNull
    public static final KSerializer<?> e(@NotNull kotlinx.serialization.modules.f module, @NotNull kotlin.reflect.d<?> kClass) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        KSerializer<?> kSerializerD = kotlinx.serialization.modules.f.d(module, kClass, null, 2, null);
        return kSerializerD == null ? new p(kClass) : kSerializerD;
    }

    @a1
    @NotNull
    public static final KSerializer<?> f(@NotNull kotlinx.serialization.modules.f module, @NotNull kotlin.reflect.d<?> kClass, @NotNull KSerializer<?>[] argSerializers) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(argSerializers, "argSerializers");
        KSerializer<?> kSerializerC = module.c(kClass, ArraysKt.asList(argSerializers));
        return kSerializerC == null ? new p(kClass) : kSerializerC;
    }

    @a1
    @NotNull
    public static final KSerializer<?> g(@NotNull String forClass) {
        Intrinsics.checkNotNullParameter(forClass, "forClass");
        throw new c0(f2.h(forClass));
    }

    @a1
    @NotNull
    public static final KSerializer<?> h(@NotNull kotlinx.serialization.modules.f module, @NotNull kotlin.reflect.d<?> kClass) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        int i10 = 0 & 2;
        KSerializer<?> kSerializerD = kotlinx.serialization.modules.f.d(module, kClass, null, 2, null);
        if (kSerializerD != null) {
            return kSerializerD;
        }
        f2.j(kClass);
        throw new kotlin.a0();
    }

    @a1
    @NotNull
    public static final KSerializer<?> i(@NotNull kotlinx.serialization.modules.f module, @NotNull kotlin.reflect.d<?> kClass, @NotNull KSerializer<?>[] argSerializers) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(argSerializers, "argSerializers");
        KSerializer<?> kSerializerC = module.c(kClass, ArraysKt.asList(argSerializers));
        if (kSerializerC != null) {
            return kSerializerC;
        }
        f2.j(kClass);
        throw new kotlin.a0();
    }

    private static final <T> KSerializer<T> j(KSerializer<T> kSerializer, boolean z10) {
        if (z10) {
            return hk.a.v(kSerializer);
        }
        Intrinsics.checkNotNull(kSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.SerializersKt__SerializersKt.nullable?>");
        return kSerializer;
    }

    @Nullable
    public static final KSerializer<? extends Object> k(@NotNull kotlin.reflect.d<Object> dVar, @NotNull List<? extends KSerializer<Object>> serializers, @NotNull Function0<? extends kotlin.reflect.g> elementClassifierIfArray) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(serializers, "serializers");
        Intrinsics.checkNotNullParameter(elementClassifierIfArray, "elementClassifierIfArray");
        KSerializer<? extends Object> kSerializerC = c(dVar, serializers, elementClassifierIfArray);
        return kSerializerC == null ? d(dVar, serializers) : kSerializerC;
    }

    public static final /* synthetic */ <T> KSerializer<T> l() {
        Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.a.f51379e5);
        d0 d0VarK = m0.k(null);
        Intrinsics.checkNotNull(d0VarK, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return (KSerializer) d0VarK;
    }

    @i
    @NotNull
    public static final <T> KSerializer<T> m(@NotNull kotlin.reflect.d<T> dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        KSerializer<T> kSerializerQ = m0.q(dVar);
        if (kSerializerQ != null) {
            return kSerializerQ;
        }
        f2.j(dVar);
        throw new kotlin.a0();
    }

    @g
    @NotNull
    public static final KSerializer<Object> n(@NotNull kotlin.reflect.d<?> kClass, @NotNull List<? extends KSerializer<?>> typeArgumentsSerializers, boolean z10) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
        return m0.n(kotlinx.serialization.modules.h.a(), kClass, typeArgumentsSerializers, z10);
    }

    @NotNull
    public static final KSerializer<Object> o(@NotNull kotlin.reflect.s type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return m0.o(kotlinx.serialization.modules.h.a(), type);
    }

    public static final /* synthetic */ <T> KSerializer<T> p(kotlinx.serialization.modules.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.a.f51379e5);
        d0 d0VarO = m0.o(fVar, null);
        Intrinsics.checkNotNull(d0VarO, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return (KSerializer) d0VarO;
    }

    @g
    @NotNull
    public static final KSerializer<Object> q(@NotNull kotlinx.serialization.modules.f fVar, @NotNull kotlin.reflect.d<?> kClass, @NotNull List<? extends KSerializer<?>> typeArgumentsSerializers, boolean z10) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
        KSerializer<Object> kSerializerS = s(fVar, kClass, typeArgumentsSerializers, z10);
        if (kSerializerS != null) {
            return kSerializerS;
        }
        e2.s(kClass);
        throw new kotlin.a0();
    }

    @NotNull
    public static final KSerializer<Object> r(@NotNull kotlinx.serialization.modules.f fVar, @NotNull kotlin.reflect.s type) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        KSerializer<Object> kSerializerU = u(fVar, type, true);
        if (kSerializerU != null) {
            return kSerializerU;
        }
        e2.s(f2.g(type));
        throw new kotlin.a0();
    }

    private static final KSerializer<Object> s(kotlinx.serialization.modules.f fVar, kotlin.reflect.d<Object> dVar, List<? extends KSerializer<Object>> list, boolean z10) {
        KSerializer<? extends Object> kSerializerC;
        if (list.isEmpty()) {
            kSerializerC = m0.q(dVar);
            if (kSerializerC == null) {
                kSerializerC = kotlinx.serialization.modules.f.d(fVar, dVar, null, 2, null);
            }
        } else {
            try {
                KSerializer<? extends Object> kSerializerF = m0.f(dVar, list, new Function0() { // from class: kotlinx.serialization.o0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return q0.t();
                    }
                });
                kSerializerC = kSerializerF == null ? fVar.c(dVar, list) : kSerializerF;
            } catch (IndexOutOfBoundsException e10) {
                throw new c0("Unable to retrieve a serializer, the number of passed type serializers differs from the actual number of generic parameters", e10);
            }
        }
        if (kSerializerC != null) {
            return j(kSerializerC, z10);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.reflect.g t() {
        throw new c0("It is not possible to retrieve an array serializer using KClass alone, use KType instead or ArraySerializer factory");
    }

    /* JADX WARN: Code duplicated, block: B:12:0x004c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0092  */
    private static final KSerializer<Object> u(kotlinx.serialization.modules.f fVar, kotlin.reflect.s sVar, boolean z10) {
        KSerializer<Object> kSerializerM;
        KSerializer<? extends Object> kSerializerC;
        p pVar;
        kotlin.reflect.d<Object> dVarG = f2.g(sVar);
        boolean zA = sVar.A();
        List<KTypeProjection> listD = sVar.d();
        final ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listD, 10));
        Iterator<T> it = listD.iterator();
        while (it.hasNext()) {
            arrayList.add(f2.k((KTypeProjection) it.next()));
        }
        if (arrayList.isEmpty()) {
            if (!e2.n(dVarG) || kotlinx.serialization.modules.f.d(fVar, dVarG, null, 2, null) == null) {
                kSerializerM = l0.m(dVarG, zA);
            } else {
                kSerializerM = null;
            }
        } else if (fVar.e()) {
            kSerializerM = null;
        } else {
            Object objN = l0.n(dVarG, arrayList, zA);
            if (Result.m786isFailureimpl(objN)) {
                objN = null;
            }
            kSerializerM = (KSerializer) objN;
        }
        if (kSerializerM != null) {
            return kSerializerM;
        }
        if (arrayList.isEmpty()) {
            kSerializerC = m0.q(dVarG);
            if (kSerializerC == null && (kSerializerC = kotlinx.serialization.modules.f.d(fVar, dVarG, null, 2, null)) == null) {
                if (e2.n(dVarG)) {
                    pVar = new p(dVarG);
                    kSerializerC = pVar;
                } else {
                    kSerializerC = null;
                }
            }
        } else {
            List<KSerializer<Object>> listU = m0.u(fVar, arrayList, z10);
            if (listU == null) {
                return null;
            }
            KSerializer<? extends Object> kSerializerF = m0.f(dVarG, listU, new Function0() { // from class: kotlinx.serialization.p0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return q0.v(arrayList);
                }
            });
            if (kSerializerF == null) {
                kSerializerC = fVar.c(dVarG, listU);
                if (kSerializerC == null) {
                    if (e2.n(dVarG)) {
                        pVar = new p(dVarG);
                        kSerializerC = pVar;
                    } else {
                        kSerializerC = null;
                    }
                }
            } else {
                kSerializerC = kSerializerF;
            }
        }
        if (kSerializerC != null) {
            return j(kSerializerC, zA);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.reflect.g v(List list) {
        return ((kotlin.reflect.s) list.get(0)).J();
    }

    @i
    @Nullable
    public static final <T> KSerializer<T> w(@NotNull kotlin.reflect.d<T> dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        KSerializer<T> kSerializerB = e2.b(dVar);
        return kSerializerB == null ? s2.b(dVar) : kSerializerB;
    }

    @Nullable
    public static final KSerializer<Object> x(@NotNull kotlin.reflect.s type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return m0.t(kotlinx.serialization.modules.h.a(), type);
    }

    @Nullable
    public static final KSerializer<Object> y(@NotNull kotlinx.serialization.modules.f fVar, @NotNull kotlin.reflect.s type) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        return u(fVar, type, false);
    }

    @Nullable
    public static final List<KSerializer<Object>> z(@NotNull kotlinx.serialization.modules.f fVar, @NotNull List<? extends kotlin.reflect.s> typeArguments, boolean z10) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(typeArguments, "typeArguments");
        if (z10) {
            List<? extends kotlin.reflect.s> list = typeArguments;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(m0.o(fVar, (kotlin.reflect.s) it.next()));
            }
            return arrayList;
        }
        List<? extends kotlin.reflect.s> list2 = typeArguments;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            KSerializer<Object> kSerializerT = m0.t(fVar, (kotlin.reflect.s) it2.next());
            if (kSerializerT == null) {
                return null;
            }
            arrayList2.add(kSerializerT);
        }
        return arrayList2;
    }
}
