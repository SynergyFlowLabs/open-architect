package com.sdk.growthbook.features;

import com.sdk.growthbook.serializable_model.SerializableFeaturesDataModel;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nFeaturesDataModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeaturesDataModel.kt\ncom/sdk/growthbook/features/FeaturesDataModelKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,25:1\n465#2:26\n415#2:27\n1252#3,4:28\n*S KotlinDebug\n*F\n+ 1 FeaturesDataModel.kt\ncom/sdk/growthbook/features/FeaturesDataModelKt\n*L\n20#1:26\n20#1:27\n20#1:28,4\n*E\n"})
public final class c {
    @NotNull
    public static final SerializableFeaturesDataModel a(@NotNull b bVar) {
        LinkedHashMap linkedHashMap;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Map<String, com.sdk.growthbook.model.h> mapI = bVar.i();
        if (mapI != null) {
            linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(mapI.size()));
            Iterator<T> it = mapI.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), com.sdk.growthbook.model.i.a((com.sdk.growthbook.model.h) entry.getValue()));
            }
        } else {
            linkedHashMap = null;
        }
        return new SerializableFeaturesDataModel(linkedHashMap, bVar.g(), bVar.j(), bVar.h());
    }
}
