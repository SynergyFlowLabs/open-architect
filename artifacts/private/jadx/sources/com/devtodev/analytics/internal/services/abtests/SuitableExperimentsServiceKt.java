package com.devtodev.analytics.internal.services.abtests;

import com.devtodev.analytics.internal.helpfultools.Version;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes3.dex */
public final class SuitableExperimentsServiceKt {
    @NotNull
    public static final <T> List<T> add(@NotNull List<? extends T> list, T t10) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<T> mutableList = CollectionsKt.toMutableList((Collection) list);
        mutableList.add(t10);
        return mutableList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean contains(@NotNull JSONArray jSONArray, T t10) {
        Intrinsics.checkNotNullParameter(jSONArray, "<this>");
        int length = jSONArray.length();
        boolean zEquals = false;
        for (int i10 = 0; i10 < length; i10++) {
            if (t10 instanceof String) {
                zEquals = jSONArray.get(i10).equals(t10);
            } else if (t10 instanceof JSONArray) {
                zEquals = contains((JSONArray) t10, jSONArray.get(i10));
            } else {
                zEquals = t10 instanceof Version ? jSONArray.get(i10).equals(((Version) t10).getVersion()) : Intrinsics.areEqual(jSONArray.get(i10), t10);
            }
            if (zEquals) {
                break;
            }
        }
        return zEquals;
    }
}
