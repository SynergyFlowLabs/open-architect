package kotlinx.serialization.internal;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nPlatform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Platform.kt\nkotlinx/serialization/internal/PlatformKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,214:1\n208#1,6:251\n208#1,6:257\n208#1,6:263\n208#1,6:269\n208#1,6:275\n208#1,6:281\n1#2:215\n3170#3,11:216\n1310#3,2:227\n3170#3,11:229\n3170#3,11:240\n*S KotlinDebug\n*F\n+ 1 Platform.kt\nkotlinx/serialization/internal/PlatformKt\n*L\n193#1:251,6\n197#1:257,6\n198#1:263,6\n199#1:269,6\n200#1:275,6\n203#1:281,6\n73#1:216,11\n81#1:227,2\n151#1:229,11\n156#1:240,11\n*E\n"})
public final class e2 {
    private static final Object a(Class<?> cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    public static final <T> KSerializer<T> b(@NotNull kotlin.reflect.d<T> dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return d(dVar, new KSerializer[0]);
    }

    @Nullable
    public static final <T> KSerializer<T> c(@NotNull Class<T> cls, @NotNull KSerializer<Object>... args) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        Intrinsics.checkNotNullParameter(args, "args");
        if (cls.isEnum() && o(cls)) {
            return e(cls);
        }
        KSerializer<T> kSerializerM = m(cls, (KSerializer[]) Arrays.copyOf(args, args.length));
        if (kSerializerM != null) {
            return kSerializerM;
        }
        KSerializer<T> kSerializerH = h(cls);
        if (kSerializerH != null) {
            return kSerializerH;
        }
        KSerializer<T> kSerializerF = f(cls, (KSerializer[]) Arrays.copyOf(args, args.length));
        if (kSerializerF != null) {
            return kSerializerF;
        }
        if (p(cls)) {
            return new kotlinx.serialization.p(oj.b.i(cls));
        }
        return null;
    }

    @Nullable
    public static final <T> KSerializer<T> d(@NotNull kotlin.reflect.d<T> dVar, @NotNull KSerializer<Object>... args) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(args, "args");
        return c(oj.b.e(dVar), (KSerializer[]) Arrays.copyOf(args, args.length));
    }

    private static final <T> KSerializer<T> e(Class<T> cls) {
        T[] enumConstants = cls.getEnumConstants();
        String canonicalName = cls.getCanonicalName();
        Intrinsics.checkNotNullExpressionValue(canonicalName, "getCanonicalName(...)");
        Intrinsics.checkNotNull(enumConstants, "null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>");
        return new k0(canonicalName, (Enum[]) enumConstants);
    }

    private static final <T> KSerializer<T> f(Class<T> cls, KSerializer<Object>... kSerializerArr) {
        Field field;
        KSerializer<T> kSerializerL;
        Object objG = g(cls);
        if (objG != null && (kSerializerL = l(objG, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length))) != null) {
            return kSerializerL;
        }
        try {
            Class<?>[] declaredClasses = cls.getDeclaredClasses();
            Intrinsics.checkNotNullExpressionValue(declaredClasses, "getDeclaredClasses(...)");
            int length = declaredClasses.length;
            int i10 = 0;
            Class<?> cls2 = null;
            boolean z10 = false;
            while (true) {
                if (i10 >= length) {
                    if (z10) {
                        break;
                    }
                } else {
                    Class<?> cls3 = declaredClasses[i10];
                    if (Intrinsics.areEqual(cls3.getSimpleName(), "$serializer")) {
                        if (!z10) {
                            z10 = true;
                            cls2 = cls3;
                        }
                    }
                    i10++;
                }
                cls2 = null;
                break;
            }
            Object obj = (cls2 == null || (field = cls2.getField("INSTANCE")) == null) ? null : field.get(null);
            if (obj instanceof KSerializer) {
                return (KSerializer) obj;
            }
        } catch (NoSuchFieldException unused) {
        }
        return null;
    }

    private static final <T> Object g(Class<T> cls) {
        Class<?> cls2;
        Class<?>[] declaredClasses = cls.getDeclaredClasses();
        Intrinsics.checkNotNullExpressionValue(declaredClasses, "getDeclaredClasses(...)");
        int length = declaredClasses.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                cls2 = null;
                break;
            }
            cls2 = declaredClasses[i10];
            if (cls2.getAnnotation(q1.class) != null) {
                break;
            }
            i10++;
        }
        if (cls2 == null) {
            return null;
        }
        String simpleName = cls2.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        return a(cls, simpleName);
    }

    private static final <T> KSerializer<T> h(Class<T> cls) throws IllegalAccessException, InvocationTargetException {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            int i10 = 0;
            if (!StringsKt.u2(canonicalName, "java.", false, 2, null) && !StringsKt.u2(canonicalName, "kotlin.", false, 2, null)) {
                Field[] declaredFields = cls.getDeclaredFields();
                Intrinsics.checkNotNullExpressionValue(declaredFields, "getDeclaredFields(...)");
                int length = declaredFields.length;
                Field field = null;
                int i11 = 0;
                boolean z10 = false;
                while (true) {
                    if (i11 >= length) {
                        if (!z10) {
                            break;
                        }
                        break;
                    }
                    Field field2 = declaredFields[i11];
                    if (Intrinsics.areEqual(field2.getName(), "INSTANCE") && Intrinsics.areEqual(field2.getType(), cls) && Modifier.isStatic(field2.getModifiers())) {
                        if (!z10) {
                            z10 = true;
                            field = field2;
                        }
                    }
                    i11++;
                    field = null;
                    break;
                }
                if (field == null) {
                    return null;
                }
                Object obj = field.get(null);
                Method[] methods = cls.getMethods();
                Intrinsics.checkNotNullExpressionValue(methods, "getMethods(...)");
                int length2 = methods.length;
                Method method = null;
                boolean z11 = false;
                while (true) {
                    if (i10 >= length2) {
                        if (!z11) {
                            break;
                        }
                        break;
                    }
                    Method method2 = methods[i10];
                    if (Intrinsics.areEqual(method2.getName(), "serializer")) {
                        Class<?>[] parameterTypes = method2.getParameterTypes();
                        Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
                        if (parameterTypes.length == 0 && Intrinsics.areEqual(method2.getReturnType(), KSerializer.class)) {
                            if (!z11) {
                                method = method2;
                                z11 = true;
                            }
                        }
                    }
                    i10++;
                    method = null;
                    break;
                }
                if (method == null) {
                    return null;
                }
                Object objInvoke = method.invoke(obj, null);
                if (objInvoke instanceof KSerializer) {
                    return (KSerializer) objInvoke;
                }
            }
        }
        return null;
    }

    public static final <T> T i(@NotNull T[] tArr, int i10) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return tArr[i10];
    }

    public static final boolean j(@NotNull boolean[] zArr, int i10) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return zArr[i10];
    }

    @NotNull
    public static final Map<kotlin.reflect.d<?>, KSerializer<?>> k() {
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        mapCreateMapBuilder.put(kotlin.jvm.internal.j1.d(String.class), hk.a.K(kotlin.jvm.internal.q1.f312784a));
        mapCreateMapBuilder.put(kotlin.jvm.internal.j1.d(Character.TYPE), hk.a.E(kotlin.jvm.internal.r.f312785a));
        mapCreateMapBuilder.put(kotlin.jvm.internal.j1.d(char[].class), hk.a.e());
        mapCreateMapBuilder.put(kotlin.jvm.internal.j1.d(Double.TYPE), hk.a.F(kotlin.jvm.internal.w.f312823a));
        mapCreateMapBuilder.put(kotlin.jvm.internal.j1.d(double[].class), hk.a.f());
        mapCreateMapBuilder.put(kotlin.jvm.internal.j1.d(Float.TYPE), hk.a.G(kotlin.jvm.internal.z.f312833a));
        mapCreateMapBuilder.put(kotlin.jvm.internal.j1.d(float[].class), hk.a.g());
        mapCreateMapBuilder.put(kotlin.jvm.internal.j1.d(Long.TYPE), hk.a.I(kotlin.jvm.internal.o0.f312774a));
        mapCreateMapBuilder.put(kotlin.jvm.internal.j1.d(long[].class), hk.a.j());
        mapCreateMapBuilder.put(kotlin.jvm.internal.j1.d(kotlin.y1.class), hk.a.z(kotlin.y1.f313456b));
        mapCreateMapBuilder.put(kotlin.jvm.internal.j1.d(Integer.TYPE), hk.a.H(kotlin.jvm.internal.i0.f312739a));
        mapCreateMapBuilder.put(kotlin.jvm.internal.j1.d(int[].class), hk.a.h());
        mapCreateMapBuilder.put(kotlin.jvm.internal.j1.d(kotlin.u1.class), hk.a.y(kotlin.u1.f313438b));
        mapCreateMapBuilder.put(kotlin.jvm.internal.j1.d(Short.TYPE), hk.a.J(kotlin.jvm.internal.n1.f312764a));
        mapCreateMapBuilder.put(kotlin.jvm.internal.j1.d(short[].class), hk.a.p());
        mapCreateMapBuilder.put(kotlin.jvm.internal.j1.d(kotlin.e2.class), hk.a.A(kotlin.e2.f312490b));
        mapCreateMapBuilder.put(kotlin.jvm.internal.j1.d(Byte.TYPE), hk.a.D(kotlin.jvm.internal.o.f312769a));
        mapCreateMapBuilder.put(kotlin.jvm.internal.j1.d(byte[].class), hk.a.d());
        mapCreateMapBuilder.put(kotlin.jvm.internal.j1.d(kotlin.q1.class), hk.a.x(kotlin.q1.f312878b));
        mapCreateMapBuilder.put(kotlin.jvm.internal.j1.d(Boolean.TYPE), hk.a.C(kotlin.jvm.internal.m.f312762a));
        mapCreateMapBuilder.put(kotlin.jvm.internal.j1.d(boolean[].class), hk.a.c());
        mapCreateMapBuilder.put(kotlin.jvm.internal.j1.d(Unit.class), hk.a.B(Unit.f312394a));
        mapCreateMapBuilder.put(kotlin.jvm.internal.j1.d(Void.class), hk.a.m());
        try {
            mapCreateMapBuilder.put(kotlin.jvm.internal.j1.d(kotlin.time.c.class), hk.a.L(kotlin.time.c.f313406b));
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        try {
            mapCreateMapBuilder.put(kotlin.jvm.internal.j1.d(kotlin.z1.class), hk.a.t());
        } catch (ClassNotFoundException | NoClassDefFoundError unused2) {
        }
        try {
            mapCreateMapBuilder.put(kotlin.jvm.internal.j1.d(kotlin.v1.class), hk.a.s());
        } catch (ClassNotFoundException | NoClassDefFoundError unused3) {
        }
        try {
            mapCreateMapBuilder.put(kotlin.jvm.internal.j1.d(kotlin.f2.class), hk.a.u());
        } catch (ClassNotFoundException | NoClassDefFoundError unused4) {
        }
        try {
            mapCreateMapBuilder.put(kotlin.jvm.internal.j1.d(kotlin.r1.class), hk.a.r());
        } catch (ClassNotFoundException | NoClassDefFoundError unused5) {
        }
        try {
            mapCreateMapBuilder.put(kotlin.jvm.internal.j1.d(kotlin.uuid.d.class), hk.a.M(kotlin.uuid.d.f313446c));
        } catch (ClassNotFoundException | NoClassDefFoundError unused6) {
        }
        return MapsKt.build(mapCreateMapBuilder);
    }

    private static final <T> KSerializer<T> l(Object obj, KSerializer<Object>... kSerializerArr) throws IllegalAccessException, InvocationTargetException {
        Class[] clsArr;
        try {
            if (kSerializerArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = kSerializerArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i10 = 0; i10 < length; i10++) {
                    clsArr2[i10] = KSerializer.class;
                }
                clsArr = clsArr2;
            }
            Object objInvoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(kSerializerArr, kSerializerArr.length));
            if (objInvoke instanceof KSerializer) {
                return (KSerializer) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e10) {
            Throwable cause = e10.getCause();
            if (cause == null) {
                throw e10;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e10.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    private static final <T> KSerializer<T> m(Class<?> cls, KSerializer<Object>... kSerializerArr) {
        Object objA = a(cls, "Companion");
        if (objA == null) {
            return null;
        }
        return l(objA, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
    }

    public static final <T> boolean n(@NotNull kotlin.reflect.d<T> dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return oj.b.e(dVar).isInterface();
    }

    private static final <T> boolean o(Class<T> cls) {
        return cls.getAnnotation(kotlinx.serialization.b0.class) == null && cls.getAnnotation(kotlinx.serialization.m.class) == null;
    }

    private static final <T> boolean p(Class<T> cls) {
        if (cls.getAnnotation(kotlinx.serialization.m.class) != null) {
            return true;
        }
        kotlinx.serialization.b0 b0Var = (kotlinx.serialization.b0) cls.getAnnotation(kotlinx.serialization.b0.class);
        return b0Var != null && Intrinsics.areEqual(kotlin.jvm.internal.j1.d(b0Var.with()), kotlin.jvm.internal.j1.d(kotlinx.serialization.p.class));
    }

    public static final boolean q(@NotNull kotlin.reflect.d<Object> rootClass) {
        Intrinsics.checkNotNullParameter(rootClass, "rootClass");
        return oj.b.e(rootClass).isArray();
    }

    private static final void r(Function0<Unit> function0) {
        try {
            function0.invoke();
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
    }

    @NotNull
    public static final Void s(@NotNull kotlin.reflect.d<?> dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        f2.j(dVar);
        throw new kotlin.a0();
    }

    @NotNull
    public static final Void t(@NotNull Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        throw new kotlinx.serialization.c0(f2.i(oj.b.i(cls)));
    }

    @NotNull
    public static final <T, E extends T> E[] u(@NotNull ArrayList<E> arrayList, @NotNull kotlin.reflect.d<T> eClass) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        Intrinsics.checkNotNullParameter(eClass, "eClass");
        Object objNewInstance = Array.newInstance((Class<?>) oj.b.e(eClass), arrayList.size());
        Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
        E[] eArr = (E[]) arrayList.toArray((Object[]) objNewInstance);
        Intrinsics.checkNotNullExpressionValue(eArr, "toArray(...)");
        return eArr;
    }
}
