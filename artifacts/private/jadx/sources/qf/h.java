package qf;

import com.sdk.growthbook.serializable_model.SerializableGBExperiment;
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
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nSerializableGBExperiment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerializableGBExperiment.kt\ncom/sdk/growthbook/serializable_model/SerializableGBExperimentKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,159:1\n1563#2:160\n1634#2,3:161\n*S KotlinDebug\n*F\n+ 1 SerializableGBExperiment.kt\ncom/sdk/growthbook/serializable_model/SerializableGBExperimentKt\n*L\n157#1:160\n157#1:161,3\n*E\n"})
public final class h {
    @NotNull
    public static final com.sdk.growthbook.model.f a(@NotNull SerializableGBExperiment serializableGBExperiment) {
        Intrinsics.checkNotNullParameter(serializableGBExperiment, "<this>");
        String strS = serializableGBExperiment.S();
        String strB0 = serializableGBExperiment.b0();
        ArrayList<GBVariationMeta> arrayListT = serializableGBExperiment.T();
        String strV = serializableGBExperiment.V();
        Integer numP = serializableGBExperiment.P();
        String strY = serializableGBExperiment.Y();
        Boolean boolI = serializableGBExperiment.I();
        List<Pair<Float, Float>> listZ = serializableGBExperiment.Z();
        List<Float> listD0 = serializableGBExperiment.d0();
        ArrayList<GBFilter> arrayListO = serializableGBExperiment.O();
        Float fL = serializableGBExperiment.L();
        JsonArray jsonArrayW = serializableGBExperiment.W();
        JsonElement jsonElementK = serializableGBExperiment.K();
        Integer numR = serializableGBExperiment.R();
        Integer numJ = serializableGBExperiment.J();
        String strQ = serializableGBExperiment.Q();
        Integer numU = serializableGBExperiment.U();
        ArrayList<GBParentConditionInterface> arrayListX = serializableGBExperiment.X();
        String strN = serializableGBExperiment.N();
        Boolean boolM = serializableGBExperiment.M();
        List<JsonElement> listC0 = serializableGBExperiment.c0();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listC0, 10));
        for (Iterator it = listC0.iterator(); it.hasNext(); it = it) {
            arrayList.add(nf.a.a(com.sdk.growthbook.model.q.Companion, (JsonElement) it.next()));
        }
        return new com.sdk.growthbook.model.f(strS, arrayList, jsonArrayW, strQ, listD0, boolI, fL, jsonElementK, arrayListX, numP, numR, listZ, arrayListT, arrayListO, strB0, strV, strY, strN, boolM, numJ, numU);
    }
}
