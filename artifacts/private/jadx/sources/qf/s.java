package qf;

import com.sdk.growthbook.serializable_model.SerializableGBFeatureRule;
import com.sdk.growthbook.serializable_model.SerializableGBTrackData;
import com.sdk.growthbook.utils.GBFilter;
import com.sdk.growthbook.utils.GBParentConditionInterface;
import com.sdk.growthbook.utils.GBVariationMeta;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nSerializableGBFeatureRule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerializableGBFeatureRule.kt\ncom/sdk/growthbook/serializable_model/SerializableGBFeatureRuleKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,183:1\n1563#2:184\n1634#2,3:185\n1563#2:188\n1634#2,3:189\n*S KotlinDebug\n*F\n+ 1 SerializableGBFeatureRule.kt\ncom/sdk/growthbook/serializable_model/SerializableGBFeatureRuleKt\n*L\n157#1:184\n157#1:185,3\n181#1:188\n181#1:189,3\n*E\n"})
public final class s {
    /* JADX WARN: Code duplicated, block: B:22:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:25:0x00dc A[LOOP:1: B:23:0x00d6->B:25:0x00dc, LOOP_END] */
    @NotNull
    public static final com.sdk.growthbook.model.k a(@NotNull SerializableGBFeatureRule serializableGBFeatureRule) {
        ArrayList arrayList;
        com.sdk.growthbook.model.q qVarA;
        ArrayList arrayList2;
        List<JsonElement> listM0;
        Iterator<T> it;
        Intrinsics.checkNotNullParameter(serializableGBFeatureRule, "<this>");
        String strY = serializableGBFeatureRule.Y();
        String strZ = serializableGBFeatureRule.Z();
        ArrayList<GBVariationMeta> arrayListA0 = serializableGBFeatureRule.a0();
        String strK0 = serializableGBFeatureRule.k0();
        String strC0 = serializableGBFeatureRule.c0();
        Pair<Float, Float> pairG0 = serializableGBFeatureRule.g0();
        String strF0 = serializableGBFeatureRule.f0();
        List<Pair<Float, Float>> listI0 = serializableGBFeatureRule.i0();
        if (serializableGBFeatureRule.l0() != null) {
            ArrayList<SerializableGBTrackData> arrayListL0 = serializableGBFeatureRule.l0();
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayListL0, 10));
            Iterator<T> it2 = arrayListL0.iterator();
            while (it2.hasNext()) {
                arrayList3.add(t.a((SerializableGBTrackData) it2.next()));
            }
            arrayList = new ArrayList(arrayList3);
        } else {
            arrayList = null;
        }
        ArrayList<GBFilter> arrayListT = serializableGBFeatureRule.T();
        List<Float> listN0 = serializableGBFeatureRule.n0();
        Float fQ = serializableGBFeatureRule.Q();
        JsonArray jsonArrayD0 = serializableGBFeatureRule.d0();
        JsonElement jsonElementP = serializableGBFeatureRule.P();
        Integer numX = serializableGBFeatureRule.X();
        Integer numO = serializableGBFeatureRule.O();
        String strW = serializableGBFeatureRule.W();
        ArrayList<GBParentConditionInterface> arrayListE0 = serializableGBFeatureRule.e0();
        Integer numB0 = serializableGBFeatureRule.b0();
        String strS = serializableGBFeatureRule.S();
        com.sdk.growthbook.utils.p<JsonElement> pVarU = serializableGBFeatureRule.U();
        if (pVarU instanceof com.sdk.growthbook.utils.p.b) {
            if (((com.sdk.growthbook.utils.p.b) serializableGBFeatureRule.U()).d() != null) {
                qVarA = nf.a.a(com.sdk.growthbook.model.q.Companion, (JsonElement) ((com.sdk.growthbook.utils.p.b) serializableGBFeatureRule.U()).d());
            }
            arrayList2 = null;
            Boolean boolR = serializableGBFeatureRule.R();
            listM0 = serializableGBFeatureRule.m0();
            if (listM0 != null) {
                List<JsonElement> list = listM0;
                arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(nf.a.a(com.sdk.growthbook.model.q.Companion, (JsonElement) it.next()));
                    jsonElementP = jsonElementP;
                }
            }
            return new com.sdk.growthbook.model.k(strY, jsonElementP, arrayListE0, fQ, qVarA, arrayList2, strZ, listN0, jsonArrayD0, strW, numX, pairG0, listI0, arrayListA0, arrayListT, strK0, strC0, strF0, strS, boolR, numO, numB0, arrayList);
        }
        if (!(pVarU instanceof com.sdk.growthbook.utils.p.a)) {
            throw new k0();
        }
        qVarA = null;
        arrayList2 = null;
        Boolean boolR2 = serializableGBFeatureRule.R();
        listM0 = serializableGBFeatureRule.m0();
        if (listM0 != null) {
            List<JsonElement> list2 = listM0;
            arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(nf.a.a(com.sdk.growthbook.model.q.Companion, (JsonElement) it.next()));
                jsonElementP = jsonElementP;
            }
        }
        return new com.sdk.growthbook.model.k(strY, jsonElementP, arrayListE0, fQ, qVarA, arrayList2, strZ, listN0, jsonArrayD0, strW, numX, pairG0, listI0, arrayListA0, arrayListT, strK0, strC0, strF0, strS, boolR2, numO, numB0, arrayList);
    }
}
