package k0;

import androidx.compose.runtime.c0;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.p1;
import kotlin.ranges.IntRange;
import kotlin.ranges.r;
import oj.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nComposableMethod.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableMethod.jvm.kt\nandroidx/compose/runtime/reflect/ComposableMethodKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,206:1\n170#1:219\n170#1:226\n170#1:233\n1790#2,6:207\n1557#3:213\n1628#3,3:214\n1557#3:220\n1628#3,3:221\n1557#3:227\n1628#3,3:228\n1557#3:234\n1628#3,3:235\n37#4,2:217\n37#4,2:224\n37#4,2:231\n37#4,2:238\n*S KotlinDebug\n*F\n+ 1 ComposableMethod.jvm.kt\nandroidx/compose/runtime/reflect/ComposableMethodKt\n*L\n187#1:219\n196#1:226\n197#1:233\n53#1:207,6\n170#1:213\n170#1:214,3\n187#1:220\n187#1:221,3\n196#1:227\n196#1:228,3\n197#1:234\n197#1:235,3\n170#1:217,2\n187#1:224,2\n196#1:231,2\n197#1:238,2\n*E\n"})
@i(name = "ComposableMethodKt")
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f307526a = 31;

    @Nullable
    public static final b b(@NotNull Method method) {
        a aVarF = f(method);
        if (aVarF.j()) {
            return new b(method, aVarF);
        }
        return null;
    }

    private static final int c(int i10, int i11) {
        if (i10 == 0) {
            return 1;
        }
        return (int) Math.ceil(((double) (i10 + i11)) / 10.0d);
    }

    private static final int d(int i10) {
        return (int) Math.ceil(((double) i10) / 31.0d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final /* synthetic */ <T> T[] e(T t10, int i10) {
        IntRange intRangeW1 = r.W1(0, i10);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeW1, 10));
        Iterator<Integer> it = intRangeW1.iterator();
        while (it.hasNext()) {
            ((IntIterator) it).nextInt();
            arrayList.add(t10);
        }
        Intrinsics.reifiedOperationMarker(0, "T?");
        return (T[]) arrayList.toArray(new Object[0]);
    }

    private static final a f(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        int length = parameterTypes.length - 1;
        if (length < 0) {
            length = -1;
            break;
        }
        while (true) {
            int i10 = length - 1;
            if (Intrinsics.areEqual(parameterTypes[length], c0.class)) {
                break;
            }
            if (i10 < 0) {
                length = -1;
                break;
            }
            length = i10;
        }
        if (length == -1) {
            return new a(false, method.getParameterTypes().length, 0, 0);
        }
        int iC = c(length, !Modifier.isStatic(method.getModifiers()) ? 1 : 0);
        int i11 = length + 1 + iC;
        int length2 = method.getParameterTypes().length;
        int iD = length2 != i11 ? d(length) : 0;
        return new a(i11 + iD == length2, length, iC, iD);
    }

    @NotNull
    public static final b g(@NotNull Class<?> cls, @NotNull String str, @NotNull Class<?>... clsArr) throws NoSuchMethodException {
        Method declaredMethod;
        Class cls2 = Integer.TYPE;
        int iC = c(clsArr.length, 0);
        try {
            p1 p1Var = new p1(3);
            p1Var.b(clsArr);
            p1Var.a(c0.class);
            IntRange intRangeW1 = r.W1(0, iC);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeW1, 10));
            Iterator<Integer> it = intRangeW1.iterator();
            while (it.hasNext()) {
                ((IntIterator) it).nextInt();
                arrayList.add(cls2);
            }
            p1Var.b(arrayList.toArray(new Class[0]));
            declaredMethod = cls.getDeclaredMethod(str, (Class[]) p1Var.d(new Class[p1Var.c()]));
        } catch (ReflectiveOperationException unused) {
            int iD = d(clsArr.length);
            try {
                p1 p1Var2 = new p1(4);
                p1Var2.b(clsArr);
                p1Var2.a(c0.class);
                IntRange intRangeW2 = r.W1(0, iC);
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeW2, 10));
                Iterator<Integer> it2 = intRangeW2.iterator();
                while (it2.hasNext()) {
                    ((IntIterator) it2).nextInt();
                    arrayList2.add(cls2);
                }
                p1Var2.b(arrayList2.toArray(new Class[0]));
                IntRange intRangeW3 = r.W1(0, iD);
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeW3, 10));
                Iterator<Integer> it3 = intRangeW3.iterator();
                while (it3.hasNext()) {
                    ((IntIterator) it3).nextInt();
                    arrayList3.add(cls2);
                }
                p1Var2.b(arrayList3.toArray(new Class[0]));
                declaredMethod = cls.getDeclaredMethod(str, (Class[]) p1Var2.d(new Class[p1Var2.c()]));
            } catch (ReflectiveOperationException unused2) {
                declaredMethod = null;
            }
        }
        if (declaredMethod != null) {
            b bVarB = b(declaredMethod);
            Intrinsics.checkNotNull(bVarB);
            return bVarB;
        }
        throw new NoSuchMethodException(cls.getName() + '.' + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object h(Class<?> cls) {
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
}
