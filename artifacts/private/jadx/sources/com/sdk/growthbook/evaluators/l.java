package com.sdk.growthbook.evaluators;

import com.sdk.growthbook.model.q;
import com.sdk.growthbook.utils.GBParentConditionInterface;
import com.sdk.growthbook.utils.GBStickyAssignmentsDocument;
import com.sdk.growthbook.utils.GBVariationMeta;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.n1;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nGBExperimentEvaluator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GBExperimentEvaluator.kt\ncom/sdk/growthbook/evaluators/GBExperimentEvaluator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,465:1\n1#2:466\n465#3:467\n415#3:468\n1252#4,4:469\n*S KotlinDebug\n*F\n+ 1 GBExperimentEvaluator.kt\ncom/sdk/growthbook/evaluators/GBExperimentEvaluator\n*L\n206#1:467\n206#1:468\n206#1:469,4\n*E\n"})
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final a f266221a;

    public l(@NotNull a evaluationContext) {
        Intrinsics.checkNotNullParameter(evaluationContext, "evaluationContext");
        this.f266221a = evaluationContext;
    }

    public static /* synthetic */ com.sdk.growthbook.model.g b(l lVar, com.sdk.growthbook.model.f fVar, Map map, String str, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str = null;
        }
        return lVar.a(fVar, map, str);
    }

    private final com.sdk.growthbook.model.g c(com.sdk.growthbook.model.f fVar, int i10, boolean z10, String str, Float f10, Boolean bool, Map<String, ? extends q> map) {
        boolean z11;
        int i11;
        String strValueOf;
        if (i10 < 0 || i10 >= fVar.S().size()) {
            z11 = false;
            i11 = 0;
        } else {
            i11 = i10;
            z11 = true;
        }
        Pair<String, String> pairI = com.sdk.growthbook.utils.o.Companion.i(fVar.G(), (this.f266221a.t() == null || Intrinsics.areEqual(fVar.C(), Boolean.TRUE)) ? null : fVar.D(), this.f266221a.v().f(), map);
        String strComponent1 = pairI.component1();
        String strComponent2 = pairI.component2();
        List listJ = fVar.J();
        if (listJ == null) {
            listJ = CollectionsKt.emptyList();
        }
        GBVariationMeta gBVariationMeta = listJ.size() > i11 ? (GBVariationMeta) listJ.get(i11) : null;
        q qVar = i11 < fVar.S().size() ? fVar.S().get(i11) : q.b.f266379a;
        if (gBVariationMeta == null || (strValueOf = gBVariationMeta.f()) == null) {
            strValueOf = String.valueOf(i11);
        }
        return new com.sdk.growthbook.model.g(z11, i11, qVar, strComponent1, strComponent2, strValueOf, gBVariationMeta != null ? gBVariationMeta.g() : null, f10, gBVariationMeta != null ? gBVariationMeta.h() : null, Boolean.valueOf(z10), str, Boolean.valueOf(bool != null ? bool.booleanValue() : false));
    }

    static /* synthetic */ com.sdk.growthbook.model.g d(l lVar, com.sdk.growthbook.model.f fVar, int i10, boolean z10, String str, Float f10, Boolean bool, Map map, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return lVar.c(fVar, i10, z10, (i11 & 8) != 0 ? null : str, (i11 & 16) != 0 ? null : f10, (i11 & 32) != 0 ? null : bool, map);
    }

    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.Map, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r10v2 */
    @NotNull
    public final com.sdk.growthbook.model.g a(@NotNull com.sdk.growthbook.model.f experiment, @NotNull Map<String, ? extends q> attributeOverrides, @Nullable String str) {
        com.sdk.growthbook.utils.o.a aVar;
        int iB;
        boolean zBooleanValue;
        boolean z10;
        l lVar;
        n1<String, Float, Float> n1VarH;
        Map<String, ? extends q> mapEmptyMap;
        Intrinsics.checkNotNullParameter(experiment, "experiment");
        Intrinsics.checkNotNullParameter(attributeOverrides, "attributeOverrides");
        int i10 = 2;
        if (experiment.S().size() < 2 || !this.f266221a.m()) {
            return d(this, experiment, -1, false, str, null, null, attributeOverrides, 48, null);
        }
        Object obj = this.f266221a.o().get(experiment.I());
        if (obj != null) {
            if (this.f266221a.q()) {
                of.e.a().a("return forcedVariation " + obj);
            }
            return d(this, experiment, Integer.parseInt(obj.toString()), false, str, null, null, attributeOverrides, 48, null);
        }
        if (Intrinsics.areEqual(experiment.y(), Boolean.FALSE)) {
            return d(this, experiment, -1, false, str, null, null, attributeOverrides, 48, null);
        }
        com.sdk.growthbook.utils.o.a aVar2 = com.sdk.growthbook.utils.o.Companion;
        ?? r10 = 0;
        Pair<String, String> pairI = aVar2.i(experiment.G(), (this.f266221a.t() == null || Intrinsics.areEqual(experiment.C(), Boolean.TRUE)) ? null : experiment.D(), this.f266221a.v().f(), attributeOverrides);
        String strComponent1 = pairI.component1();
        String strComponent2 = pairI.component2();
        if (strComponent2.length() == 0 || Intrinsics.areEqual(strComponent2, AbstractJsonLexerKt.NULL)) {
            return d(this, experiment, -1, false, str, null, null, attributeOverrides, 48, null);
        }
        if (this.f266221a.t() == null || Intrinsics.areEqual(experiment.C(), Boolean.TRUE)) {
            aVar = aVar2;
            iB = -1;
            zBooleanValue = false;
            z10 = false;
        } else {
            aVar = aVar2;
            String strI = experiment.I();
            o oVarV = this.f266221a.v();
            Integer numZ = experiment.z();
            int iIntValue = numZ != null ? numZ.intValue() : 0;
            Integer numK = experiment.K();
            int iIntValue2 = numK != null ? numK.intValue() : 0;
            List<GBVariationMeta> listJ = experiment.J();
            if (listJ == null) {
                listJ = CollectionsKt.emptyList();
            }
            Pair<Integer, Boolean> pairO = aVar.o(strI, oVarV, iIntValue, iIntValue2, listJ, experiment.D(), experiment.G(), attributeOverrides);
            iB = pairO.component1().intValue();
            Boolean boolComponent2 = pairO.component2();
            z10 = iB >= 0;
            zBooleanValue = boolComponent2 != null ? boolComponent2.booleanValue() : false;
        }
        if (z10) {
            lVar = this;
        } else {
            if (experiment.E() != null) {
                if (aVar.v(experiment.E(), this.f266221a.v().f(), this.f266221a)) {
                    if (this.f266221a.q()) {
                        System.out.println((Object) "Skip because of filters");
                    }
                    return d(this, experiment, -1, false, str, null, null, attributeOverrides, 48, null);
                }
            } else if (experiment.M() != null && (n1VarH = aVar.h(experiment.M())) != null && !aVar.t(strComponent2, n1VarH)) {
                return d(this, experiment, -1, false, str, null, null, attributeOverrides, 48, null);
            }
            lVar = this;
            if (experiment.A() != null) {
                Map<String, q> mapF = lVar.f266221a.v().f();
                JsonElement jsonElementA = experiment.A();
                Intrinsics.checkNotNull(jsonElementA);
                q qVarA = nf.a.a(q.Companion, jsonElementA);
                com.sdk.growthbook.model.m mVar = qVarA instanceof com.sdk.growthbook.model.m ? (com.sdk.growthbook.model.m) qVarA : null;
                if (mVar == null) {
                    mVar = new com.sdk.growthbook.model.m(MapsKt.emptyMap());
                }
                if (!new k().n(mapF, mVar, lVar.f266221a.s())) {
                    return d(lVar, experiment, -1, false, str, null, null, attributeOverrides, 48, null);
                }
            }
            if (experiment.N() != null) {
                Iterator<GBParentConditionInterface> it = experiment.N().iterator();
                Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
                while (it.hasNext()) {
                    GBParentConditionInterface next = it.next();
                    Intrinsics.checkNotNullExpressionValue(next, "next(...)");
                    GBParentConditionInterface gBParentConditionInterface = next;
                    n nVar = new n(lVar.f266221a, r10, i10, r10);
                    String strH = gBParentConditionInterface.h();
                    JsonObject jsonObject = JsonElementKt.getJsonObject(gBParentConditionInterface.f());
                    LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(jsonObject.size()));
                    Iterator<T> it2 = jsonObject.entrySet().iterator();
                    while (it2.hasNext()) {
                        Map.Entry entry = (Map.Entry) it2.next();
                        linkedHashMap.put(entry.getKey(), nf.a.a(q.Companion, (JsonElement) entry.getValue()));
                    }
                    com.sdk.growthbook.model.j jVarB = n.b(nVar, strH, linkedHashMap, null, 4, null);
                    if (jVarB.n() == com.sdk.growthbook.model.l.cyclicPrerequisite) {
                        return d(lVar, experiment, -1, false, str, null, null, attributeOverrides, 48, null);
                    }
                    q qVarK = jVarB.k();
                    if (qVarK == null || (mapEmptyMap = MapsKt.mapOf(TuplesKt.to("value", qVarK))) == null) {
                        mapEmptyMap = MapsKt.emptyMap();
                    }
                    q qVarA2 = nf.a.a(q.Companion, gBParentConditionInterface.f());
                    com.sdk.growthbook.model.m mVar2 = qVarA2 instanceof com.sdk.growthbook.model.m ? (com.sdk.growthbook.model.m) qVarA2 : null;
                    if (mVar2 == null) {
                        mVar2 = new com.sdk.growthbook.model.m(MapsKt.emptyMap());
                    }
                    if (!new k().n(mapEmptyMap, mVar2, lVar.f266221a.s())) {
                        if (lVar.f266221a.q()) {
                            System.out.println((Object) "Feature blocked by prerequisite");
                        }
                        return d(lVar, experiment, -1, false, str, null, null, attributeOverrides, 48, null);
                    }
                    i10 = 2;
                    r10 = 0;
                }
            }
        }
        com.sdk.growthbook.utils.o.a aVar3 = com.sdk.growthbook.utils.o.Companion;
        Integer numH = experiment.H();
        Integer numValueOf = Integer.valueOf(numH != null ? numH.intValue() : 1);
        String strR = experiment.R();
        if (strR == null) {
            strR = experiment.I();
        }
        Float fQ = aVar3.q(strComponent2, numValueOf, strR);
        if (fQ == null) {
            if (lVar.f266221a.q()) {
                System.out.println((Object) "Skip because of invalid hash version");
            }
            return d(lVar, experiment, -1, false, str, null, null, attributeOverrides, 48, null);
        }
        if (!z10) {
            List<Pair<Float, Float>> listP = experiment.P();
            if (listP == null) {
                int size = experiment.S().size();
                Float fB = experiment.B();
                float fFloatValue = fB != null ? fB.floatValue() : 1.0f;
                List<Float> listT = experiment.T();
                if (listT == null) {
                    listT = CollectionsKt.emptyList();
                }
                listP = aVar3.f(size, fFloatValue, listT);
            }
            iB = aVar3.b(fQ.floatValue(), listP);
        }
        if (zBooleanValue) {
            if (lVar.f266221a.q()) {
                System.out.println((Object) "Skip because sticky bucket version is blocked");
            }
            return lVar.c(experiment, -1, false, str, null, Boolean.TRUE, attributeOverrides);
        }
        if (iB < 0) {
            if (lVar.f266221a.q()) {
                System.out.println((Object) "Skip because of coverage");
            }
            return d(lVar, experiment, -1, false, str, null, null, attributeOverrides, 48, null);
        }
        Integer numF = experiment.F();
        if (numF != null) {
            return d(this, experiment, numF.intValue(), false, str, null, null, attributeOverrides, 48, null);
        }
        if (this.f266221a.v().g()) {
            return d(this, experiment, -1, false, str, null, null, attributeOverrides, 48, null);
        }
        com.sdk.growthbook.model.g gVarC = c(experiment, iB, true, str, fQ, Boolean.valueOf(z10), attributeOverrides);
        if (this.f266221a.q()) {
            System.out.println((Object) ("ExperimentResult: " + gVarC));
        }
        if (this.f266221a.t() != null && !Intrinsics.areEqual(experiment.C(), Boolean.TRUE)) {
            Map<String, GBStickyAssignmentsDocument> mapH = this.f266221a.v().h();
            String strI2 = experiment.I();
            Integer numZ2 = experiment.z();
            n1<String, GBStickyAssignmentsDocument, Boolean> n1VarE = aVar3.e(strComponent1, strComponent2, MapsKt.mapOf(TuplesKt.to(aVar3.m(strI2, numZ2 != null ? numZ2.intValue() : 0), gVarC.v())), mapH);
            String strA = n1VarE.a();
            GBStickyAssignmentsDocument gBStickyAssignmentsDocumentB = n1VarE.b();
            if (n1VarE.c().booleanValue()) {
                o oVarV2 = this.f266221a.v();
                if (mapH == null) {
                    mapH = MapsKt.emptyMap();
                }
                Map<String, GBStickyAssignmentsDocument> mutableMap = MapsKt.toMutableMap(mapH);
                mutableMap.put(strA, gBStickyAssignmentsDocumentB);
                oVarV2.i(mutableMap);
                this.f266221a.t().c(gBStickyAssignmentsDocumentB);
            }
        }
        if (!this.f266221a.p().a(experiment, gVarC)) {
            this.f266221a.u().invoke(experiment, gVarC);
        }
        return gVarC;
    }
}
