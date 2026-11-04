package androidx.compose.ui.text.android;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nListUtils.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListUtils.android.kt\nandroidx/compose/ui/text/android/ListUtils_androidKt\n*L\n1#1,84:1\n34#1,5:85\n*S KotlinDebug\n*F\n+ 1 ListUtils.android.kt\nandroidx/compose/ui/text/android/ListUtils_androidKt\n*L\n55#1:85,5\n*E\n"})
public final class i0 {
    public static final <T> void a(@NotNull List<? extends T> list, @NotNull Function1<? super T, Unit> function1) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            function1.invoke(list.get(i10));
        }
    }

    @NotNull
    public static final <T, R, C extends Collection<? super R>> C b(@NotNull List<? extends T> list, @NotNull C c10, @NotNull Function1<? super T, ? extends R> function1) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            c10.add(function1.invoke(list.get(i10)));
        }
        return c10;
    }

    @NotNull
    public static final <T, R> List<R> c(@NotNull List<? extends T> list, @NotNull Function2<? super T, ? super T, ? extends R> function2) {
        if (list.size() <= 1) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        a0.c cVar = list.get(0);
        int lastIndex = CollectionsKt.getLastIndex(list);
        while (i10 < lastIndex) {
            i10++;
            T t10 = list.get(i10);
            arrayList.add(function2.invoke(cVar, t10));
            cVar = t10;
        }
        return arrayList;
    }
}
