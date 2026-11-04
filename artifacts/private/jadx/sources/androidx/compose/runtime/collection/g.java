package androidx.compose.runtime.collection;

import androidx.collection.c3;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nScatterSetWrapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSetWrapper.kt\nandroidx/compose/runtime/collection/ScatterSetWrapperKt\n+ 2 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,56:1\n231#2,3:57\n200#2,7:60\n211#2,3:68\n214#2,9:72\n234#2:81\n256#2,2:84\n231#2,3:86\n200#2,7:89\n211#2,3:97\n214#2,9:101\n234#2:110\n258#2:111\n1399#3:67\n1270#3:71\n1399#3:96\n1270#3:100\n1863#4,2:82\n1755#4,3:112\n*S KotlinDebug\n*F\n+ 1 ScatterSetWrapper.kt\nandroidx/compose/runtime/collection/ScatterSetWrapperKt\n*L\n43#1:57,3\n43#1:60,7\n43#1:68,3\n43#1:72,9\n43#1:81\n52#1:84,2\n52#1:86,3\n52#1:89,7\n52#1:97,3\n52#1:101,9\n52#1:110\n52#1:111\n43#1:67\n43#1:71\n52#1:96\n52#1:100\n46#1:82,2\n54#1:112,3\n*E\n"})
public final class g {
    /* JADX WARN: Code duplicated, block: B:18:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0056 A[LOOP:0: B:7:0x0017->B:19:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x0059 A[SYNTHETIC] */
    public static final boolean a(@NotNull Set<? extends Object> set, @NotNull Function1<Object, Boolean> function1) {
        if (!(set instanceof f)) {
            Set<? extends Object> set2 = set;
            if ((set2 instanceof Collection) && set2.isEmpty()) {
                return false;
            }
            Iterator<T> it = set2.iterator();
            while (it.hasNext()) {
                if (function1.invoke(it.next()).booleanValue()) {
                    return true;
                }
            }
            return false;
        }
        c3 c3VarC = ((f) set).c();
        Object[] objArr = c3VarC.f12171b;
        long[] jArr = c3VarC.f12170a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128 && function1.invoke(objArr[(i10 << 3) + i12]).booleanValue()) {
                            return true;
                        }
                        j10 >>= 8;
                    }
                    if (i11 == 8) {
                        if (i10 != length) {
                            i10++;
                        }
                    }
                } else if (i10 != length) {
                    i10++;
                }
            }
        }
        return false;
    }

    public static final <T> void b(@NotNull Set<? extends T> set, @NotNull Function1<? super T, Unit> function1) {
        if (!(set instanceof f)) {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                function1.invoke(it.next());
            }
            return;
        }
        c3<T> c3VarC = ((f) set).c();
        Object[] objArr = c3VarC.f12171b;
        long[] jArr = c3VarC.f12170a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        function1.invoke(objArr[(i10 << 3) + i12]);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    @NotNull
    public static final <T> Set<T> c(@NotNull c3<T> c3Var) {
        return new f(c3Var);
    }
}
