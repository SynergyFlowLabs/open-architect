package kotlinx.serialization;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import kotlin.n1;
import kotlinx.serialization.internal.e2;
import kotlinx.serialization.internal.s2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nSerializersJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerializersJvm.kt\nkotlinx/serialization/SerializersKt__SerializersJvmKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,201:1\n11228#2:202\n11563#2,3:203\n1563#3:206\n1634#3,3:207\n37#4:210\n36#4,3:211\n1#5:214\n*S KotlinDebug\n*F\n+ 1 SerializersJvm.kt\nkotlinx/serialization/SerializersKt__SerializersJvmKt\n*L\n113#1:202\n113#1:203,3\n140#1:206\n140#1:207,3\n169#1:210\n169#1:211,3\n*E\n"})
final /* synthetic */ class n0 {
    private static final KSerializer<Object> a(kotlinx.serialization.modules.f fVar, GenericArrayType genericArrayType, boolean z10) {
        KSerializer<Object> kSerializerS;
        kotlin.reflect.d dVarI;
        Type genericComponentType = genericArrayType.getGenericComponentType();
        if (genericComponentType instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) genericComponentType).getUpperBounds();
            Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
            genericComponentType = (Type) ArraysKt.first(upperBounds);
        }
        Intrinsics.checkNotNull(genericComponentType);
        if (z10) {
            kSerializerS = m0.m(fVar, genericComponentType);
        } else {
            kSerializerS = m0.s(fVar, genericComponentType);
            if (kSerializerS == null) {
                return null;
            }
        }
        if (genericComponentType instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) genericComponentType).getRawType();
            Intrinsics.checkNotNull(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            dVarI = oj.b.i((Class) rawType);
        } else {
            if (!(genericComponentType instanceof kotlin.reflect.d)) {
                throw new IllegalStateException("unsupported type in GenericArray: " + j1.d(genericComponentType.getClass()));
            }
            dVarI = (kotlin.reflect.d) genericComponentType;
        }
        Intrinsics.checkNotNull(dVarI, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
        KSerializer<Object> kSerializerA = hk.a.a(dVarI, kSerializerS);
        Intrinsics.checkNotNull(kSerializerA, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
        return kSerializerA;
    }

    private static final Class<?> b(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            Intrinsics.checkNotNullExpressionValue(rawType, "getRawType(...)");
            return b(rawType);
        }
        if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
            Object objFirst = ArraysKt.first(upperBounds);
            Intrinsics.checkNotNullExpressionValue(objFirst, "first(...)");
            return b((Type) objFirst);
        }
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            Intrinsics.checkNotNullExpressionValue(genericComponentType, "getGenericComponentType(...)");
            return b(genericComponentType);
        }
        throw new IllegalArgumentException("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument " + type + " has type " + j1.d(type.getClass()));
    }

    private static final <T> KSerializer<T> c(kotlinx.serialization.modules.f fVar, Class<T> cls, List<? extends KSerializer<Object>> list) {
        KSerializer[] kSerializerArr = (KSerializer[]) list.toArray(new KSerializer[0]);
        KSerializer<T> kSerializerC = e2.c(cls, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
        if (kSerializerC != null) {
            return kSerializerC;
        }
        kotlin.reflect.d<T> dVarI = oj.b.i(cls);
        KSerializer<T> kSerializerB = s2.b(dVarI);
        if (kSerializerB != null) {
            return kSerializerB;
        }
        KSerializer<T> kSerializerC2 = fVar.c(dVarI, list);
        if (kSerializerC2 != null) {
            return kSerializerC2;
        }
        if (cls.isInterface()) {
            return new p(oj.b.i(cls));
        }
        return null;
    }

    @NotNull
    public static final KSerializer<Object> d(@NotNull Type type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return m0.m(kotlinx.serialization.modules.h.a(), type);
    }

    @NotNull
    public static final KSerializer<Object> e(@NotNull kotlinx.serialization.modules.f fVar, @NotNull Type type) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        KSerializer<Object> kSerializerF = f(fVar, type, true);
        if (kSerializerF != null) {
            return kSerializerF;
        }
        e2.t(b(type));
        throw new kotlin.a0();
    }

    private static final KSerializer<Object> f(kotlinx.serialization.modules.f fVar, Type type, boolean z10) {
        ArrayList<KSerializer> arrayList;
        if (type instanceof GenericArrayType) {
            return a(fVar, (GenericArrayType) type, z10);
        }
        if (type instanceof Class) {
            return j(fVar, (Class) type, z10);
        }
        if (!(type instanceof ParameterizedType)) {
            if (type instanceof WildcardType) {
                Type[] upperBounds = ((WildcardType) type).getUpperBounds();
                Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
                Object objFirst = ArraysKt.first(upperBounds);
                Intrinsics.checkNotNullExpressionValue(objFirst, "first(...)");
                return g(fVar, (Type) objFirst, false, 2, null);
            }
            throw new IllegalArgumentException("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument " + type + " has type " + j1.d(type.getClass()));
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Type rawType = parameterizedType.getRawType();
        Intrinsics.checkNotNull(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
        Class cls = (Class) rawType;
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        Intrinsics.checkNotNull(actualTypeArguments);
        if (z10) {
            arrayList = new ArrayList(actualTypeArguments.length);
            for (Type type2 : actualTypeArguments) {
                Intrinsics.checkNotNull(type2);
                arrayList.add(m0.m(fVar, type2));
            }
        } else {
            arrayList = new ArrayList(actualTypeArguments.length);
            for (Type type3 : actualTypeArguments) {
                Intrinsics.checkNotNull(type3);
                KSerializer<Object> kSerializerS = m0.s(fVar, type3);
                if (kSerializerS == null) {
                    return null;
                }
                arrayList.add(kSerializerS);
            }
        }
        if (Set.class.isAssignableFrom(cls)) {
            KSerializer<Object> kSerializerO = hk.a.o((KSerializer) arrayList.get(0));
            Intrinsics.checkNotNull(kSerializerO, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return kSerializerO;
        }
        if (List.class.isAssignableFrom(cls) || Collection.class.isAssignableFrom(cls)) {
            KSerializer<Object> kSerializerI = hk.a.i((KSerializer) arrayList.get(0));
            Intrinsics.checkNotNull(kSerializerI, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return kSerializerI;
        }
        if (Map.class.isAssignableFrom(cls)) {
            KSerializer<Object> kSerializerL = hk.a.l((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
            Intrinsics.checkNotNull(kSerializerL, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return kSerializerL;
        }
        if (Map.Entry.class.isAssignableFrom(cls)) {
            KSerializer<Object> kSerializerK = hk.a.k((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
            Intrinsics.checkNotNull(kSerializerK, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return kSerializerK;
        }
        if (Pair.class.isAssignableFrom(cls)) {
            KSerializer<Object> kSerializerN = hk.a.n((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
            Intrinsics.checkNotNull(kSerializerN, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return kSerializerN;
        }
        if (n1.class.isAssignableFrom(cls)) {
            KSerializer<Object> kSerializerQ = hk.a.q((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1), (KSerializer) arrayList.get(2));
            Intrinsics.checkNotNull(kSerializerQ, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return kSerializerQ;
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (KSerializer kSerializer : arrayList) {
            Intrinsics.checkNotNull(kSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any?>");
            arrayList2.add(kSerializer);
        }
        return c(fVar, cls, arrayList2);
    }

    static /* synthetic */ KSerializer g(kotlinx.serialization.modules.f fVar, Type type, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return f(fVar, type, z10);
    }

    @Nullable
    public static final KSerializer<Object> h(@NotNull Type type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return m0.s(kotlinx.serialization.modules.h.a(), type);
    }

    @Nullable
    public static final KSerializer<Object> i(@NotNull kotlinx.serialization.modules.f fVar, @NotNull Type type) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        return f(fVar, type, false);
    }

    private static final KSerializer<Object> j(kotlinx.serialization.modules.f fVar, Class<?> cls, boolean z10) {
        KSerializer<Object> kSerializerS;
        if (!cls.isArray() || cls.getComponentType().isPrimitive()) {
            Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
            return c(fVar, cls, CollectionsKt.emptyList());
        }
        Class<?> componentType = cls.getComponentType();
        Intrinsics.checkNotNullExpressionValue(componentType, "getComponentType(...)");
        if (z10) {
            kSerializerS = m0.m(fVar, componentType);
        } else {
            kSerializerS = m0.s(fVar, componentType);
            if (kSerializerS == null) {
                return null;
            }
        }
        kotlin.reflect.d dVarI = oj.b.i(componentType);
        Intrinsics.checkNotNull(dVarI, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
        KSerializer<Object> kSerializerA = hk.a.a(dVarI, kSerializerS);
        Intrinsics.checkNotNull(kSerializerA, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
        return kSerializerA;
    }
}
