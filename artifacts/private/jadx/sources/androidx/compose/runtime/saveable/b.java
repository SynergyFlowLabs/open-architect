package androidx.compose.runtime.saveable;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.r1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nListSaver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListSaver.kt\nandroidx/compose/runtime/saveable/ListSaverKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,48:1\n1#2:49\n*E\n"})
public final class b {
    @NotNull
    public static final <Original, Saveable> c0<Original, Object> b(@NotNull final Function2<? super g0, ? super Original, ? extends List<? extends Saveable>> function2, @NotNull Function1<? super List<? extends Saveable>, ? extends Original> function1) {
        Function2 function3 = new Function2() { // from class: androidx.compose.runtime.saveable.a
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return b.c(function2, (g0) obj, obj2);
            }
        };
        Intrinsics.checkNotNull(function1, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, Original of androidx.compose.runtime.saveable.ListSaverKt.listSaver?>");
        return f0.e(function3, (Function1) r1.q(function1, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object c(Function2 function2, g0 g0Var, Object obj) {
        List list = (List) function2.invoke(g0Var, obj);
        List list2 = list;
        int size = list2.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj2 = list.get(i10);
            if (obj2 != null && !g0Var.a(obj2)) {
                throw new IllegalArgumentException(("item at index " + i10 + " can't be saved: " + obj2).toString());
            }
        }
        if (list2.isEmpty()) {
            return null;
        }
        return new ArrayList(list2);
    }
}
