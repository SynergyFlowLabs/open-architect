package androidx.compose.ui.tooling;

import androidx.compose.runtime.internal.w0;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.p1;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 1)
@kotlin.l(message = "Use androidx.compose.runtime.reflect.ComposableMethodInvoker instead")
@SourceDebugExtension({"SMAP\nComposableInvoker.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableInvoker.jvm.kt\nandroidx/compose/ui/tooling/ComposableInvoker\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,235:1\n78#1:267\n11255#2:236\n11366#2,4:237\n1310#2,2:244\n11483#2,9:252\n13409#2:261\n13410#2:263\n11492#2:264\n1790#2,6:274\n1734#3,3:241\n1557#3:246\n1628#3,3:247\n1557#3:268\n1628#3,3:269\n37#4,2:250\n37#4,2:265\n37#4,2:272\n1#5:262\n1#5:280\n*S KotlinDebug\n*F\n+ 1 ComposableInvoker.jvm.kt\nandroidx/compose/ui/tooling/ComposableInvoker\n*L\n96#1:267\n44#1:236\n44#1:237,4\n70#1:244,2\n92#1:252,9\n92#1:261\n92#1:263\n92#1:264\n144#1:274,6\n56#1:241,3\n78#1:246\n78#1:247,3\n96#1:268\n96#1:269,3\n78#1:250,2\n92#1:265,2\n96#1:272,2\n92#1:262\n*E\n"})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f42371a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f42372b = 10;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f42373c = 31;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f42374d = 0;

    private a() {
    }

    private final boolean a(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr.length == clsArr2.length) {
            ArrayList arrayList = new ArrayList(clsArr.length);
            int length = clsArr.length;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                boolean z10 = true;
                if (i10 >= length) {
                    break;
                }
                Class<?> cls = clsArr[i10];
                int i12 = i11 + 1;
                Class<?> cls2 = clsArr2[i11];
                if (!Intrinsics.areEqual(oj.b.i(cls), oj.b.i(cls2)) && !cls.isAssignableFrom(cls2)) {
                    z10 = false;
                }
                arrayList.add(Boolean.valueOf(z10));
                i10++;
                i11 = i12;
            }
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (!((Boolean) it.next()).booleanValue()) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    private final int b(int i10, int i11) {
        if (i10 == 0) {
            return 1;
        }
        return (int) Math.ceil(((double) (i10 + i11)) / 10.0d);
    }

    private final int c(int i10) {
        return (int) Math.ceil(((double) i10) / 31.0d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final /* synthetic */ <T> T[] d(T t10, int i10) {
        IntRange intRangeW1 = kotlin.ranges.r.W1(0, i10);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeW1, 10));
        Iterator<Integer> it = intRangeW1.iterator();
        while (it.hasNext()) {
            ((IntIterator) it).nextInt();
            arrayList.add(t10);
        }
        Intrinsics.reifiedOperationMarker(0, "T?");
        return (T[]) arrayList.toArray(new Object[0]);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0049 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0032  */
    private final Method e(Method[] methodArr, String str, Class<?>... clsArr) throws NoSuchMethodException {
        Method method;
        int length = methodArr.length;
        int i10 = 0;
        while (true) {
            method = null;
            if (i10 >= length) {
                break;
            }
            Method method2 = methodArr[i10];
            if (!Intrinsics.areEqual(str, method2.getName())) {
                int i11 = 6 << 2;
                if (!StringsKt.u2(method2.getName(), str + org.apache.commons.codec.language.l.f335457d, false, 2, null)) {
                    continue;
                } else if (f42371a.a(method2.getParameterTypes(), (Class[]) Arrays.copyOf(clsArr, clsArr.length))) {
                    method = method2;
                    break;
                }
            } else if (f42371a.a(method2.getParameterTypes(), (Class[]) Arrays.copyOf(clsArr, clsArr.length))) {
                method = method2;
                break;
            }
            i10++;
        }
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodException(str + " not found");
    }

    private final Method f(Class<?> cls, String str, Object... objArr) {
        Method method;
        ArrayList arrayList = new ArrayList();
        int length = objArr.length;
        int i10 = 0;
        while (true) {
            method = null;
            method = null;
            if (i10 >= length) {
                break;
            }
            Object obj = objArr[i10];
            Class<?> cls2 = obj != null ? obj.getClass() : null;
            if (cls2 != null) {
                arrayList.add(cls2);
            }
            i10++;
        }
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        try {
            try {
                int iB = b(clsArr.length, 0);
                Class cls3 = Integer.TYPE;
                IntRange intRangeW1 = kotlin.ranges.r.W1(0, iB);
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeW1, 10));
                Iterator<Integer> it = intRangeW1.iterator();
                while (it.hasNext()) {
                    ((IntIterator) it).nextInt();
                    arrayList2.add(cls3);
                }
                Class[] clsArr2 = (Class[]) arrayList2.toArray(new Class[0]);
                Method[] declaredMethods = cls.getDeclaredMethods();
                p1 p1Var = new p1(3);
                p1Var.b(clsArr);
                p1Var.a(androidx.compose.runtime.c0.class);
                p1Var.b(clsArr2);
                return e(declaredMethods, str, (Class[]) p1Var.d(new Class[p1Var.c()]));
            } catch (ReflectiveOperationException unused) {
                for (Method method2 : cls.getDeclaredMethods()) {
                    if (!Intrinsics.areEqual(method2.getName(), str)) {
                        if (!StringsKt.u2(method2.getName(), str + org.apache.commons.codec.language.l.f335457d, false, 2, null)) {
                        }
                    }
                    method = method2;
                    break;
                }
                return method;
            }
        } catch (ReflectiveOperationException unused2) {
            return method;
        }
    }

    private final Object g(Class<?> cls) {
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return Double.valueOf(0.0d);
                }
                return null;
            case 104431:
                return !name.equals("int") ? null : 0;
            case 3039496:
                return !name.equals(io.sentry.profilemeasurements.a.f306070m) ? null : (byte) 0;
            case 3052374:
                return !name.equals("char") ? null : (char) 0;
            case 3327612:
                return !name.equals("long") ? null : 0L;
            case 64711720:
                if (name.equals("boolean")) {
                    return Boolean.FALSE;
                }
                return null;
            case 97526364:
                if (name.equals("float")) {
                    return Float.valueOf(0.0f);
                }
                return null;
            case 109413500:
                return !name.equals("short") ? null : (short) 0;
            default:
                return null;
        }
    }

    private final Object i(Method method, Object obj, androidx.compose.runtime.c0 c0Var, Object... objArr) {
        Object objG;
        Class<?>[] parameterTypes = method.getParameterTypes();
        int i10 = -1;
        int length = parameterTypes.length - 1;
        if (length >= 0) {
            while (true) {
                int i11 = length - 1;
                if (Intrinsics.areEqual(parameterTypes[length], androidx.compose.runtime.c0.class)) {
                    i10 = length;
                    break;
                }
                if (i11 < 0) {
                    break;
                }
                length = i11;
            }
        }
        int i12 = i10 + 1;
        int iB = b(i10, obj != null ? 1 : 0) + i12;
        int length2 = method.getParameterTypes().length;
        if ((length2 != iB ? c(i10) : 0) + iB != length2) {
            throw new IllegalStateException("params don't add up to total params");
        }
        Object[] objArr2 = new Object[length2];
        int i13 = 0;
        while (i13 < length2) {
            if (i13 >= 0 && i13 < i10) {
                objG = (i13 < 0 || i13 >= objArr.length) ? f42371a.g(method.getParameterTypes()[i13]) : objArr[i13];
            } else if (i13 == i10) {
                objG = c0Var;
            } else if (i12 <= i13 && i13 < iB) {
                objG = 0;
            } else {
                if (iB > i13 || i13 >= length2) {
                    throw new IllegalStateException("Unexpected index");
                }
                objG = 2097151;
            }
            objArr2[i13] = objG;
            i13++;
        }
        return method.invoke(obj, Arrays.copyOf(objArr2, length2));
    }

    @androidx.compose.ui.o
    public final void h(@NotNull String str, @NotNull String str2, @NotNull androidx.compose.runtime.c0 c0Var, @NotNull Object... objArr) throws Exception {
        try {
            Class<?> cls = Class.forName(str);
            Method methodF = f(cls, str2, Arrays.copyOf(objArr, objArr.length));
            if (methodF != null) {
                methodF.setAccessible(true);
                if (Modifier.isStatic(methodF.getModifiers())) {
                    i(methodF, null, c0Var, Arrays.copyOf(objArr, objArr.length));
                    return;
                } else {
                    i(methodF, cls.getConstructor(null).newInstance(null), c0Var, Arrays.copyOf(objArr, objArr.length));
                    return;
                }
            }
            throw new NoSuchMethodException("Composable " + str + '.' + str2 + " not found");
        } catch (Exception e10) {
            t.a.d(t.f42641a, "Failed to invoke Composable Method '" + str + '.' + str2 + '\'', null, 2, null);
            throw e10;
        }
    }
}
