package com.sdk.growthbook.model;

import com.sdk.growthbook.serializable_model.SerializableGBFeature;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nGBFeature.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GBFeature.kt\ncom/sdk/growthbook/model/GBFeatureKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,274:1\n1563#2:275\n1634#2,3:276\n*S KotlinDebug\n*F\n+ 1 GBFeature.kt\ncom/sdk/growthbook/model/GBFeatureKt\n*L\n36#1:275\n36#1:276,3\n*E\n"})
public final class i {
    @NotNull
    public static final SerializableGBFeature a(@NotNull h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        q qVarE = hVar.e();
        ArrayList arrayList = null;
        JsonElement jsonElementB = qVarE != null ? nf.a.b(qVarE) : null;
        List<k> listF = hVar.f();
        if (listF != null) {
            List<k> list = listF;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((k) it.next()).z());
            }
        }
        return new SerializableGBFeature(jsonElementB, arrayList);
    }
}
