package androidx.navigation;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nNavArgument.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavArgument.kt\nandroidx/navigation/NavArgumentKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,239:1\n503#2,7:240\n774#3:247\n865#3,2:248\n*S KotlinDebug\n*F\n+ 1 NavArgument.kt\nandroidx/navigation/NavArgumentKt\n*L\n235#1:240,7\n237#1:247\n237#1:248,2\n*E\n"})
public final class l0 {
    @NotNull
    public static final List<String> a(@NotNull Map<String, j0> map, @NotNull Function1<? super String, Boolean> isArgumentMissing) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(isArgumentMissing, "isArgumentMissing");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, j0> entry : map.entrySet()) {
            j0 value = entry.getValue();
            Boolean boolValueOf = value != null ? Boolean.valueOf(value.e()) : null;
            Intrinsics.checkNotNull(boolValueOf);
            if (!boolValueOf.booleanValue() && !value.c()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (isArgumentMissing.invoke((String) obj).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
