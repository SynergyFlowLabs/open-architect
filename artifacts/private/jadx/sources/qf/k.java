package qf;

import com.sdk.growthbook.serializable_model.SerializableGBFeature;
import com.sdk.growthbook.serializable_model.SerializableGBFeatureRule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nSerializableGBFeature.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerializableGBFeature.kt\ncom/sdk/growthbook/serializable_model/SerializableGBFeatureKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,28:1\n1#2:29\n1563#3:30\n1634#3,3:31\n*S KotlinDebug\n*F\n+ 1 SerializableGBFeature.kt\ncom/sdk/growthbook/serializable_model/SerializableGBFeatureKt\n*L\n26#1:30\n26#1:31,3\n*E\n"})
public final class k {
    @NotNull
    public static final com.sdk.growthbook.model.h a(@NotNull SerializableGBFeature serializableGBFeature) {
        Intrinsics.checkNotNullParameter(serializableGBFeature, "<this>");
        JsonElement jsonElementH = serializableGBFeature.h();
        ArrayList arrayList = null;
        com.sdk.growthbook.model.q qVarA = jsonElementH != null ? nf.a.a(com.sdk.growthbook.model.q.Companion, jsonElementH) : null;
        List<SerializableGBFeatureRule> listI = serializableGBFeature.i();
        if (listI != null) {
            List<SerializableGBFeatureRule> list = listI;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(s.a((SerializableGBFeatureRule) it.next()));
            }
        }
        return new com.sdk.growthbook.model.h(qVarA, arrayList);
    }
}
