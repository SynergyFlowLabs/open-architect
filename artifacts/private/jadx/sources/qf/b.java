package qf;

import com.sdk.growthbook.serializable_model.SerializableFeaturesDataModel;
import com.sdk.growthbook.serializable_model.SerializableGBFeature;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nSerializableFeaturesDataModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerializableFeaturesDataModel.kt\ncom/sdk/growthbook/serializable_model/SerializableFeaturesDataModelKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,25:1\n465#2:26\n415#2:27\n1252#3,4:28\n*S KotlinDebug\n*F\n+ 1 SerializableFeaturesDataModel.kt\ncom/sdk/growthbook/serializable_model/SerializableFeaturesDataModelKt\n*L\n20#1:26\n20#1:27\n20#1:28,4\n*E\n"})
public final class b {
    @NotNull
    public static final com.sdk.growthbook.features.b a(@NotNull SerializableFeaturesDataModel serializableFeaturesDataModel) {
        LinkedHashMap linkedHashMap;
        Intrinsics.checkNotNullParameter(serializableFeaturesDataModel, "<this>");
        Map<String, SerializableGBFeature> mapL = serializableFeaturesDataModel.l();
        if (mapL != null) {
            linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(mapL.size()));
            Iterator<T> it = mapL.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), k.a((SerializableGBFeature) entry.getValue()));
            }
        } else {
            linkedHashMap = null;
        }
        return new com.sdk.growthbook.features.b(linkedHashMap, serializableFeaturesDataModel.j(), serializableFeaturesDataModel.m(), serializableFeaturesDataModel.k());
    }
}
