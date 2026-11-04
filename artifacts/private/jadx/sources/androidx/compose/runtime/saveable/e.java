package androidx.compose.runtime.saveable;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nMapSaver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapSaver.kt\nandroidx/compose/runtime/saveable/MapSaverKt\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,56:1\n216#2,2:57\n1#3:59\n*S KotlinDebug\n*F\n+ 1 MapSaver.kt\nandroidx/compose/runtime/saveable/MapSaverKt\n*L\n37#1:57,2\n*E\n"})
public final class e {
    @NotNull
    public static final <T> c0<T, Object> c(@NotNull final Function2<? super g0, ? super T, ? extends Map<String, ? extends Object>> function2, @NotNull final Function1<? super Map<String, ? extends Object>, ? extends T> function1) {
        return b.b(new Function2() { // from class: androidx.compose.runtime.saveable.c
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return e.d(function2, (g0) obj, obj2);
            }
        }, new Function1() { // from class: androidx.compose.runtime.saveable.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e.e(function1, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List d(Function2 function2, g0 g0Var, Object obj) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((Map) function2.invoke(g0Var, obj)).entrySet()) {
            arrayList.add(entry.getKey());
            arrayList.add(entry.getValue());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object e(Function1 function1, List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list.size() % 2 != 0) {
            throw new IllegalStateException("non-zero remainder");
        }
        for (int i10 = 0; i10 < list.size(); i10 += 2) {
            Object obj = list.get(i10);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
            linkedHashMap.put((String) obj, list.get(i10 + 1));
        }
        return function1.invoke(linkedHashMap);
    }
}
