package androidx.compose.ui;

import androidx.compose.ui.node.e1;
import androidx.compose.ui.platform.t2;
import java.lang.reflect.Field;
import java.util.Comparator;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nActual.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Actual.jvm.kt\nandroidx/compose/ui/Actual_jvmKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,52:1\n6479#2:53\n35#3,5:54\n*S KotlinDebug\n*F\n+ 1 Actual.jvm.kt\nandroidx/compose/ui/Actual_jvmKt\n*L\n36#1:53\n37#1:54,5\n*E\n"})
public final class d {

    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 Actual.jvm.kt\nandroidx/compose/ui/Actual_jvmKt\n*L\n1#1,102:1\n36#2:103\n*E\n"})
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return kotlin.comparisons.a.l(((Field) t10).getName(), ((Field) t11).getName());
        }
    }

    public static final boolean a(@NotNull Object obj, @NotNull Object obj2) {
        return obj.getClass() == obj2.getClass();
    }

    @NotNull
    public static final Object b(@NotNull Object obj) {
        return obj.getClass();
    }

    public static final void c(@NotNull t2 t2Var, @NotNull e1<?> e1Var) {
        List listSortedWith = ArraysKt.sortedWith(e1Var.getClass().getDeclaredFields(), new a());
        int size = listSortedWith.size();
        for (int i10 = 0; i10 < size; i10++) {
            Field field = (Field) listSortedWith.get(i10);
            if (!field.getDeclaringClass().isAssignableFrom(e1.class)) {
                try {
                    field.setAccessible(true);
                    t2Var.b().c(field.getName(), field.get(e1Var));
                } catch (IllegalAccessException | SecurityException unused) {
                }
            }
        }
    }
}
