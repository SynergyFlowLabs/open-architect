package kotlinx.serialization.internal;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KTypeProjection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nPlatform.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,190:1\n1#2:191\n37#3:192\n36#3,3:193\n1803#4,3:196\n*S KotlinDebug\n*F\n+ 1 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n*L\n74#1:192\n74#1:193,3\n160#1:196,3\n*E\n"})
public final class f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final SerialDescriptor[] f315917a = new SerialDescriptor[0];

    @NotNull
    public static final Set<String> a(@NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        if (serialDescriptor instanceof n) {
            return ((n) serialDescriptor).a();
        }
        HashSet hashSet = new HashSet(serialDescriptor.getElementsCount());
        int elementsCount = serialDescriptor.getElementsCount();
        for (int i10 = 0; i10 < elementsCount; i10++) {
            hashSet.add(serialDescriptor.getElementName(i10));
        }
        return hashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.a1
    @NotNull
    public static final <T> kotlinx.serialization.e<T> b(@NotNull kotlinx.serialization.e<?> eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        return eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.a1
    @NotNull
    public static final <T> KSerializer<T> c(@NotNull KSerializer<?> kSerializer) {
        Intrinsics.checkNotNullParameter(kSerializer, "<this>");
        return kSerializer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.a1
    @NotNull
    public static final <T> kotlinx.serialization.d0<T> d(@NotNull kotlinx.serialization.d0<?> d0Var) {
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        return d0Var;
    }

    @NotNull
    public static final SerialDescriptor[] e(@Nullable List<? extends SerialDescriptor> list) {
        SerialDescriptor[] serialDescriptorArr;
        List<? extends SerialDescriptor> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            list = null;
        }
        if (list != null && (serialDescriptorArr = (SerialDescriptor[]) list.toArray(new SerialDescriptor[0])) != null) {
            return serialDescriptorArr;
        }
        return f315917a;
    }

    public static final <T, K> int f(@NotNull Iterable<? extends T> iterable, @NotNull Function1<? super T, ? extends K> selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        int iHashCode = 1;
        while (it.hasNext()) {
            int i10 = iHashCode * 31;
            K kInvoke = selector.invoke(it.next());
            iHashCode = i10 + (kInvoke != null ? kInvoke.hashCode() : 0);
        }
        return iHashCode;
    }

    @NotNull
    public static final kotlin.reflect.d<Object> g(@NotNull kotlin.reflect.s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        kotlin.reflect.g gVarJ = sVar.J();
        if (gVarJ instanceof kotlin.reflect.d) {
            return (kotlin.reflect.d) gVarJ;
        }
        if (!(gVarJ instanceof kotlin.reflect.t)) {
            throw new IllegalArgumentException("Only KClass supported as classifier, got " + gVarJ);
        }
        throw new IllegalArgumentException("Captured type parameter " + gVarJ + " from generic non-reified function. Such functionality cannot be supported because " + gVarJ + " is erased, either specify serializer explicitly or make calling function inline with reified " + gVarJ + '.');
    }

    @NotNull
    public static final String h(@NotNull String className) {
        Intrinsics.checkNotNullParameter(className, "className");
        return "Serializer for class '" + className + "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n";
    }

    @NotNull
    public static final String i(@NotNull kotlin.reflect.d<?> dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        String strQ = dVar.Q();
        if (strQ == null) {
            strQ = "<local class name not available>";
        }
        return h(strQ);
    }

    @NotNull
    public static final Void j(@NotNull kotlin.reflect.d<?> dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        throw new kotlinx.serialization.c0(i(dVar));
    }

    @NotNull
    public static final kotlin.reflect.s k(@NotNull KTypeProjection kTypeProjection) {
        Intrinsics.checkNotNullParameter(kTypeProjection, "<this>");
        kotlin.reflect.s sVarG = kTypeProjection.g();
        if (sVarG != null) {
            return sVarG;
        }
        throw new IllegalArgumentException(("Star projections in type arguments are not allowed, but had " + kTypeProjection.g()).toString());
    }
}
