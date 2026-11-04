package oj;

import java.lang.annotation.Annotation;
import kotlin.b1;
import kotlin.e1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@i(name = "JvmClassMappingKt")
public final class b {
    @NotNull
    public static final <T extends Annotation> kotlin.reflect.d<? extends T> a(@NotNull T t10) {
        Intrinsics.checkNotNullParameter(t10, "<this>");
        Class<? extends Annotation> clsAnnotationType = t10.annotationType();
        Intrinsics.checkNotNullExpressionValue(clsAnnotationType, "annotationType(...)");
        kotlin.reflect.d<? extends T> dVarI = i(clsAnnotationType);
        Intrinsics.checkNotNull(dVarI, "null cannot be cast to non-null type kotlin.reflect.KClass<out T of kotlin.jvm.JvmClassMappingKt.<get-annotationClass>>");
        return dVarI;
    }

    private static final <E extends Enum<E>> Class<E> b(Enum<E> r10) {
        Intrinsics.checkNotNullParameter(r10, "<this>");
        Class<E> declaringClass = r10.getDeclaringClass();
        Intrinsics.checkNotNullExpressionValue(declaringClass, "getDeclaringClass(...)");
        return declaringClass;
    }

    @e1(version = "1.7")
    @kotlin.internal.f
    public static /* synthetic */ void c(Enum r10) {
    }

    @NotNull
    public static final <T> Class<T> d(@NotNull T t10) {
        Intrinsics.checkNotNullParameter(t10, "<this>");
        Class<T> cls = (Class<T>) t10.getClass();
        Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaClass>>");
        return cls;
    }

    @i(name = "getJavaClass")
    @NotNull
    public static final <T> Class<T> e(@NotNull kotlin.reflect.d<T> dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Class<T> cls = (Class<T>) ((kotlin.jvm.internal.t) dVar).l();
        Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return cls;
    }

    public static /* synthetic */ void f(kotlin.reflect.d dVar) {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @NotNull
    public static final <T> Class<T> g(@NotNull kotlin.reflect.d<T> dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Class<T> cls = (Class<T>) ((kotlin.jvm.internal.t) dVar).l();
        if (!cls.isPrimitive()) {
            Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return cls;
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    cls = (Class<T>) Double.class;
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    cls = (Class<T>) Integer.class;
                }
                break;
            case 3039496:
                if (name.equals(io.sentry.profilemeasurements.a.f306070m)) {
                    cls = (Class<T>) Byte.class;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    cls = (Class<T>) Character.class;
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    cls = (Class<T>) Long.class;
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    cls = (Class<T>) Void.class;
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    cls = (Class<T>) Boolean.class;
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    cls = (Class<T>) Float.class;
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    cls = (Class<T>) Short.class;
                }
                break;
        }
        Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return cls;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Nullable
    public static final <T> Class<T> h(@NotNull kotlin.reflect.d<T> dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Class<T> cls = (Class<T>) ((kotlin.jvm.internal.t) dVar).l();
        if (cls.isPrimitive()) {
            Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaPrimitiveType>>");
            return cls;
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                return null;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }

    @i(name = "getKotlinClass")
    @NotNull
    public static final <T> kotlin.reflect.d<T> i(@NotNull Class<T> cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        return j1.d(cls);
    }

    @i(name = "getRuntimeClassOfKClassInstance")
    @NotNull
    public static final <T> Class<kotlin.reflect.d<T>> j(@NotNull kotlin.reflect.d<T> dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Class<kotlin.reflect.d<T>> cls = (Class<kotlin.reflect.d<T>>) dVar.getClass();
        Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.reflect.KClass<T of kotlin.jvm.JvmClassMappingKt.<get-javaClass>>>");
        return cls;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Use 'java' property to get Java class corresponding to this Kotlin class or cast this instance to Any if you really want to get the runtime Java class of this implementation of KClass.", replaceWith = @b1(expression = "(this as Any).javaClass", imports = {}))
    public static /* synthetic */ void k(kotlin.reflect.d dVar) {
    }

    public static final /* synthetic */ boolean l(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        return Object.class.isAssignableFrom(objArr.getClass().getComponentType());
    }
}
