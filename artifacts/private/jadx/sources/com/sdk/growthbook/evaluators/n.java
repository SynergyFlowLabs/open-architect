package com.sdk.growthbook.evaluators;

import com.sdk.growthbook.model.q;
import com.sdk.growthbook.utils.GBFilter;
import com.sdk.growthbook.utils.GBParentConditionInterface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nGBFeatureEvaluator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GBFeatureEvaluator.kt\ncom/sdk/growthbook/evaluators/GBFeatureEvaluator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,359:1\n1#2:360\n1869#3,2:361\n*S KotlinDebug\n*F\n+ 1 GBFeatureEvaluator.kt\ncom/sdk/growthbook/evaluators/GBFeatureEvaluator\n*L\n207#1:361,2\n*E\n"})
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final a f266223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Map<String, q> f266224b;

    /* JADX WARN: Multi-variable type inference failed */
    public n(@NotNull a evaluationContext, @NotNull Map<String, ? extends q> forcedFeature) {
        Intrinsics.checkNotNullParameter(evaluationContext, "evaluationContext");
        Intrinsics.checkNotNullParameter(forcedFeature, "forcedFeature");
        this.f266223a = evaluationContext;
        this.f266224b = forcedFeature;
    }

    public static /* synthetic */ com.sdk.growthbook.model.j b(n nVar, String str, Map map, com.sdk.growthbook.model.a aVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            aVar = new com.sdk.growthbook.model.a(str, new LinkedHashSet());
        }
        return nVar.a(str, map, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Map<String, q> c(Map<String, ? extends q> map, Map<String, ? extends q> map2) {
        MapsKt.toMutableMap(map).putAll(map2);
        return map;
    }

    private final com.sdk.growthbook.model.j d(String str, q qVar, com.sdk.growthbook.model.l lVar, com.sdk.growthbook.model.f fVar, com.sdk.growthbook.model.g gVar) {
        boolean z10 = true;
        int i10 = 1 << 1;
        boolean z11 = (qVar instanceof com.sdk.growthbook.model.c) && !((com.sdk.growthbook.model.c) qVar).m();
        boolean z12 = (qVar instanceof com.sdk.growthbook.model.o) && Intrinsics.areEqual((Object) ((com.sdk.growthbook.model.o) qVar).i(), (Object) 0);
        if (qVar != null && !z11 && !z12) {
            z10 = false;
        }
        com.sdk.growthbook.model.j jVar = new com.sdk.growthbook.model.j(qVar, !z10, z10, lVar, fVar, gVar);
        Function2<String, com.sdk.growthbook.model.j, Unit> function2R = this.f266223a.r();
        if (function2R != null) {
            function2R.invoke(str, jVar);
        }
        return jVar;
    }

    static /* synthetic */ com.sdk.growthbook.model.j e(n nVar, String str, q qVar, com.sdk.growthbook.model.l lVar, com.sdk.growthbook.model.f fVar, com.sdk.growthbook.model.g gVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            fVar = null;
        }
        if ((i10 & 16) != 0) {
            gVar = null;
        }
        return nVar.d(str, qVar, lVar, fVar, gVar);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0251 A[Catch: Exception -> 0x0398, TryCatch #2 {Exception -> 0x0398, blocks: (B:3:0x001b, B:5:0x0023, B:7:0x002b, B:8:0x004f, B:10:0x0063, B:12:0x006b, B:13:0x0072, B:15:0x007c, B:17:0x0089, B:19:0x00a7, B:22:0x00af, B:23:0x00b3, B:25:0x00b9, B:34:0x00fd, B:38:0x0108, B:43:0x0126, B:46:0x012c, B:53:0x015a, B:60:0x017f, B:62:0x0185, B:65:0x01a3, B:69:0x01af, B:71:0x01d0, B:74:0x01d6, B:75:0x01df, B:91:0x0218, B:99:0x0243, B:100:0x024b, B:102:0x0251, B:104:0x026b, B:108:0x0283, B:110:0x0289, B:113:0x0291, B:115:0x02a3, B:117:0x02a9, B:120:0x02b1, B:122:0x02c1, B:124:0x02c7, B:130:0x02e5, B:133:0x02f1, B:135:0x02fa, B:139:0x0304, B:141:0x0366, B:143:0x0372, B:146:0x0384), top: B:155:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:108:0x0283 A[Catch: Exception -> 0x0398, TRY_ENTER, TryCatch #2 {Exception -> 0x0398, blocks: (B:3:0x001b, B:5:0x0023, B:7:0x002b, B:8:0x004f, B:10:0x0063, B:12:0x006b, B:13:0x0072, B:15:0x007c, B:17:0x0089, B:19:0x00a7, B:22:0x00af, B:23:0x00b3, B:25:0x00b9, B:34:0x00fd, B:38:0x0108, B:43:0x0126, B:46:0x012c, B:53:0x015a, B:60:0x017f, B:62:0x0185, B:65:0x01a3, B:69:0x01af, B:71:0x01d0, B:74:0x01d6, B:75:0x01df, B:91:0x0218, B:99:0x0243, B:100:0x024b, B:102:0x0251, B:104:0x026b, B:108:0x0283, B:110:0x0289, B:113:0x0291, B:115:0x02a3, B:117:0x02a9, B:120:0x02b1, B:122:0x02c1, B:124:0x02c7, B:130:0x02e5, B:133:0x02f1, B:135:0x02fa, B:139:0x0304, B:141:0x0366, B:143:0x0372, B:146:0x0384), top: B:155:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:135:0x02fa A[Catch: Exception -> 0x0398, TryCatch #2 {Exception -> 0x0398, blocks: (B:3:0x001b, B:5:0x0023, B:7:0x002b, B:8:0x004f, B:10:0x0063, B:12:0x006b, B:13:0x0072, B:15:0x007c, B:17:0x0089, B:19:0x00a7, B:22:0x00af, B:23:0x00b3, B:25:0x00b9, B:34:0x00fd, B:38:0x0108, B:43:0x0126, B:46:0x012c, B:53:0x015a, B:60:0x017f, B:62:0x0185, B:65:0x01a3, B:69:0x01af, B:71:0x01d0, B:74:0x01d6, B:75:0x01df, B:91:0x0218, B:99:0x0243, B:100:0x024b, B:102:0x0251, B:104:0x026b, B:108:0x0283, B:110:0x0289, B:113:0x0291, B:115:0x02a3, B:117:0x02a9, B:120:0x02b1, B:122:0x02c1, B:124:0x02c7, B:130:0x02e5, B:133:0x02f1, B:135:0x02fa, B:139:0x0304, B:141:0x0366, B:143:0x0372, B:146:0x0384), top: B:155:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:137:0x0300  */
    /* JADX WARN: Code duplicated, block: B:138:0x0303  */
    /* JADX WARN: Code duplicated, block: B:141:0x0366 A[Catch: Exception -> 0x0398, TryCatch #2 {Exception -> 0x0398, blocks: (B:3:0x001b, B:5:0x0023, B:7:0x002b, B:8:0x004f, B:10:0x0063, B:12:0x006b, B:13:0x0072, B:15:0x007c, B:17:0x0089, B:19:0x00a7, B:22:0x00af, B:23:0x00b3, B:25:0x00b9, B:34:0x00fd, B:38:0x0108, B:43:0x0126, B:46:0x012c, B:53:0x015a, B:60:0x017f, B:62:0x0185, B:65:0x01a3, B:69:0x01af, B:71:0x01d0, B:74:0x01d6, B:75:0x01df, B:91:0x0218, B:99:0x0243, B:100:0x024b, B:102:0x0251, B:104:0x026b, B:108:0x0283, B:110:0x0289, B:113:0x0291, B:115:0x02a3, B:117:0x02a9, B:120:0x02b1, B:122:0x02c1, B:124:0x02c7, B:130:0x02e5, B:133:0x02f1, B:135:0x02fa, B:139:0x0304, B:141:0x0366, B:143:0x0372, B:146:0x0384), top: B:155:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:153:0x01a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x02f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x02d5 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x019b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x026b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x024b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x0185 A[Catch: Exception -> 0x0398, TryCatch #2 {Exception -> 0x0398, blocks: (B:3:0x001b, B:5:0x0023, B:7:0x002b, B:8:0x004f, B:10:0x0063, B:12:0x006b, B:13:0x0072, B:15:0x007c, B:17:0x0089, B:19:0x00a7, B:22:0x00af, B:23:0x00b3, B:25:0x00b9, B:34:0x00fd, B:38:0x0108, B:43:0x0126, B:46:0x012c, B:53:0x015a, B:60:0x017f, B:62:0x0185, B:65:0x01a3, B:69:0x01af, B:71:0x01d0, B:74:0x01d6, B:75:0x01df, B:91:0x0218, B:99:0x0243, B:100:0x024b, B:102:0x0251, B:104:0x026b, B:108:0x0283, B:110:0x0289, B:113:0x0291, B:115:0x02a3, B:117:0x02a9, B:120:0x02b1, B:122:0x02c1, B:124:0x02c7, B:130:0x02e5, B:133:0x02f1, B:135:0x02fa, B:139:0x0304, B:141:0x0366, B:143:0x0372, B:146:0x0384), top: B:155:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:65:0x01a3 A[Catch: Exception -> 0x0398, TRY_LEAVE, TryCatch #2 {Exception -> 0x0398, blocks: (B:3:0x001b, B:5:0x0023, B:7:0x002b, B:8:0x004f, B:10:0x0063, B:12:0x006b, B:13:0x0072, B:15:0x007c, B:17:0x0089, B:19:0x00a7, B:22:0x00af, B:23:0x00b3, B:25:0x00b9, B:34:0x00fd, B:38:0x0108, B:43:0x0126, B:46:0x012c, B:53:0x015a, B:60:0x017f, B:62:0x0185, B:65:0x01a3, B:69:0x01af, B:71:0x01d0, B:74:0x01d6, B:75:0x01df, B:91:0x0218, B:99:0x0243, B:100:0x024b, B:102:0x0251, B:104:0x026b, B:108:0x0283, B:110:0x0289, B:113:0x0291, B:115:0x02a3, B:117:0x02a9, B:120:0x02b1, B:122:0x02c1, B:124:0x02c7, B:130:0x02e5, B:133:0x02f1, B:135:0x02fa, B:139:0x0304, B:141:0x0366, B:143:0x0372, B:146:0x0384), top: B:155:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:69:0x01af A[Catch: Exception -> 0x0398, TRY_ENTER, TryCatch #2 {Exception -> 0x0398, blocks: (B:3:0x001b, B:5:0x0023, B:7:0x002b, B:8:0x004f, B:10:0x0063, B:12:0x006b, B:13:0x0072, B:15:0x007c, B:17:0x0089, B:19:0x00a7, B:22:0x00af, B:23:0x00b3, B:25:0x00b9, B:34:0x00fd, B:38:0x0108, B:43:0x0126, B:46:0x012c, B:53:0x015a, B:60:0x017f, B:62:0x0185, B:65:0x01a3, B:69:0x01af, B:71:0x01d0, B:74:0x01d6, B:75:0x01df, B:91:0x0218, B:99:0x0243, B:100:0x024b, B:102:0x0251, B:104:0x026b, B:108:0x0283, B:110:0x0289, B:113:0x0291, B:115:0x02a3, B:117:0x02a9, B:120:0x02b1, B:122:0x02c1, B:124:0x02c7, B:130:0x02e5, B:133:0x02f1, B:135:0x02fa, B:139:0x0304, B:141:0x0366, B:143:0x0372, B:146:0x0384), top: B:155:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:71:0x01d0 A[Catch: Exception -> 0x0398, TryCatch #2 {Exception -> 0x0398, blocks: (B:3:0x001b, B:5:0x0023, B:7:0x002b, B:8:0x004f, B:10:0x0063, B:12:0x006b, B:13:0x0072, B:15:0x007c, B:17:0x0089, B:19:0x00a7, B:22:0x00af, B:23:0x00b3, B:25:0x00b9, B:34:0x00fd, B:38:0x0108, B:43:0x0126, B:46:0x012c, B:53:0x015a, B:60:0x017f, B:62:0x0185, B:65:0x01a3, B:69:0x01af, B:71:0x01d0, B:74:0x01d6, B:75:0x01df, B:91:0x0218, B:99:0x0243, B:100:0x024b, B:102:0x0251, B:104:0x026b, B:108:0x0283, B:110:0x0289, B:113:0x0291, B:115:0x02a3, B:117:0x02a9, B:120:0x02b1, B:122:0x02c1, B:124:0x02c7, B:130:0x02e5, B:133:0x02f1, B:135:0x02fa, B:139:0x0304, B:141:0x0366, B:143:0x0372, B:146:0x0384), top: B:155:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:72:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:74:0x01d6 A[Catch: Exception -> 0x0398, TryCatch #2 {Exception -> 0x0398, blocks: (B:3:0x001b, B:5:0x0023, B:7:0x002b, B:8:0x004f, B:10:0x0063, B:12:0x006b, B:13:0x0072, B:15:0x007c, B:17:0x0089, B:19:0x00a7, B:22:0x00af, B:23:0x00b3, B:25:0x00b9, B:34:0x00fd, B:38:0x0108, B:43:0x0126, B:46:0x012c, B:53:0x015a, B:60:0x017f, B:62:0x0185, B:65:0x01a3, B:69:0x01af, B:71:0x01d0, B:74:0x01d6, B:75:0x01df, B:91:0x0218, B:99:0x0243, B:100:0x024b, B:102:0x0251, B:104:0x026b, B:108:0x0283, B:110:0x0289, B:113:0x0291, B:115:0x02a3, B:117:0x02a9, B:120:0x02b1, B:122:0x02c1, B:124:0x02c7, B:130:0x02e5, B:133:0x02f1, B:135:0x02fa, B:139:0x0304, B:141:0x0366, B:143:0x0372, B:146:0x0384), top: B:155:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:78:0x01ec A[Catch: Exception -> 0x02ea, TRY_ENTER, TryCatch #1 {Exception -> 0x02ea, blocks: (B:67:0x01a9, B:78:0x01ec, B:82:0x01f9, B:86:0x0208, B:89:0x0212, B:94:0x021f, B:97:0x023d, B:106:0x027d, B:128:0x02d5), top: B:153:0x01a9 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:81:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:84:0x0205 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:88:0x0210  */
    /* JADX WARN: Code duplicated, block: B:91:0x0218 A[Catch: Exception -> 0x0398, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0398, blocks: (B:3:0x001b, B:5:0x0023, B:7:0x002b, B:8:0x004f, B:10:0x0063, B:12:0x006b, B:13:0x0072, B:15:0x007c, B:17:0x0089, B:19:0x00a7, B:22:0x00af, B:23:0x00b3, B:25:0x00b9, B:34:0x00fd, B:38:0x0108, B:43:0x0126, B:46:0x012c, B:53:0x015a, B:60:0x017f, B:62:0x0185, B:65:0x01a3, B:69:0x01af, B:71:0x01d0, B:74:0x01d6, B:75:0x01df, B:91:0x0218, B:99:0x0243, B:100:0x024b, B:102:0x0251, B:104:0x026b, B:108:0x0283, B:110:0x0289, B:113:0x0291, B:115:0x02a3, B:117:0x02a9, B:120:0x02b1, B:122:0x02c1, B:124:0x02c7, B:130:0x02e5, B:133:0x02f1, B:135:0x02fa, B:139:0x0304, B:141:0x0366, B:143:0x0372, B:146:0x0384), top: B:155:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:93:0x021e  */
    /* JADX WARN: Code duplicated, block: B:96:0x023b  */
    /* JADX WARN: Code duplicated, block: B:97:0x023d A[Catch: Exception -> 0x02ea, TRY_LEAVE, TryCatch #1 {Exception -> 0x02ea, blocks: (B:67:0x01a9, B:78:0x01ec, B:82:0x01f9, B:86:0x0208, B:89:0x0212, B:94:0x021f, B:97:0x023d, B:106:0x027d, B:128:0x02d5), top: B:153:0x01a9 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x0243 A[Catch: Exception -> 0x0398, TRY_ENTER, TryCatch #2 {Exception -> 0x0398, blocks: (B:3:0x001b, B:5:0x0023, B:7:0x002b, B:8:0x004f, B:10:0x0063, B:12:0x006b, B:13:0x0072, B:15:0x007c, B:17:0x0089, B:19:0x00a7, B:22:0x00af, B:23:0x00b3, B:25:0x00b9, B:34:0x00fd, B:38:0x0108, B:43:0x0126, B:46:0x012c, B:53:0x015a, B:60:0x017f, B:62:0x0185, B:65:0x01a3, B:69:0x01af, B:71:0x01d0, B:74:0x01d6, B:75:0x01df, B:91:0x0218, B:99:0x0243, B:100:0x024b, B:102:0x0251, B:104:0x026b, B:108:0x0283, B:110:0x0289, B:113:0x0291, B:115:0x02a3, B:117:0x02a9, B:120:0x02b1, B:122:0x02c1, B:124:0x02c7, B:130:0x02e5, B:133:0x02f1, B:135:0x02fa, B:139:0x0304, B:141:0x0366, B:143:0x0372, B:146:0x0384), top: B:155:0x001b }] */
    @NotNull
    public final com.sdk.growthbook.model.j a(@NotNull String featureKey, @NotNull Map<String, ? extends q> attributeOverrides, @NotNull com.sdk.growthbook.model.a evalContext) {
        Map<String, ? extends q> mapEmptyMap;
        n nVar;
        List<q> listX;
        String strK;
        String str;
        com.sdk.growthbook.model.f fVar;
        com.sdk.growthbook.model.g gVarA;
        boolean z10;
        boolean z11;
        com.sdk.growthbook.utils.o.a aVar;
        String strV;
        String strH;
        String strE;
        k kVar;
        Map<String, q> mapC;
        q qVarA;
        com.sdk.growthbook.model.m mVar;
        com.sdk.growthbook.utils.o.a aVar2;
        ArrayList<GBFilter> arrayListF;
        a aVar3;
        n nVar2 = this;
        featureKey = featureKey;
        Intrinsics.checkNotNullParameter(featureKey, "featureKey");
        Intrinsics.checkNotNullParameter(attributeOverrides, "attributeOverrides");
        Intrinsics.checkNotNullParameter(evalContext, "evalContext");
        try {
            if (nVar2.f266224b.containsKey(featureKey)) {
                if (nVar2.f266223a.q()) {
                    System.out.println((Object) ("Global override for forced feature with key: " + featureKey + " and value " + nVar2.f266224b.get(featureKey)));
                }
                return e(nVar2, featureKey, nVar2.f266224b.get(featureKey), com.sdk.growthbook.model.l.override, null, null, 24, null);
            }
            if (nVar2.f266223a.q()) {
                System.out.println((Object) "evaluateFeature: circular dependency detected:");
            }
            if (evalContext.e().contains(featureKey)) {
                return e(nVar2, featureKey, null, com.sdk.growthbook.model.l.cyclicPrerequisite, null, null, 24, null);
            }
            evalContext.e().add(featureKey);
            com.sdk.growthbook.model.h hVar = (com.sdk.growthbook.model.h) MapsKt.getValue(nVar2.f266223a.n(), featureKey);
            List<com.sdk.growthbook.model.k> listF = hVar.f();
            List<com.sdk.growthbook.model.k> list = listF;
            if (list != null && !list.isEmpty()) {
                for (com.sdk.growthbook.model.k kVar2 : listF) {
                    if (kVar2.P() != null) {
                        try {
                            Iterator<GBParentConditionInterface> it = kVar2.P().iterator();
                            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
                            while (true) {
                                if (it.hasNext()) {
                                    GBParentConditionInterface next = it.next();
                                    Intrinsics.checkNotNullExpressionValue(next, "next(...)");
                                    GBParentConditionInterface gBParentConditionInterface = next;
                                    com.sdk.growthbook.model.j jVarA = nVar2.a(gBParentConditionInterface.h(), attributeOverrides, evalContext);
                                    com.sdk.growthbook.model.l lVarN = jVarA.n();
                                    Iterator<GBParentConditionInterface> it2 = it;
                                    com.sdk.growthbook.model.l lVar = com.sdk.growthbook.model.l.cyclicPrerequisite;
                                    if (lVarN == lVar) {
                                        return e(nVar2, featureKey, null, lVar, null, null, 24, null);
                                    }
                                    q qVarK = jVarA.k();
                                    if (qVarK == null || (mapEmptyMap = MapsKt.mapOf(TuplesKt.to("value", qVarK))) == null) {
                                        mapEmptyMap = MapsKt.emptyMap();
                                    }
                                    q qVarA2 = nf.a.a(q.Companion, gBParentConditionInterface.f());
                                    com.sdk.growthbook.model.m mVar2 = qVarA2 instanceof com.sdk.growthbook.model.m ? (com.sdk.growthbook.model.m) qVarA2 : null;
                                    if (mVar2 == null) {
                                        mVar2 = new com.sdk.growthbook.model.m(MapsKt.emptyMap());
                                    }
                                    if (new k().n(mapEmptyMap, mVar2, nVar2.f266223a.s())) {
                                        featureKey = featureKey;
                                        it = it2;
                                    } else if (!Intrinsics.areEqual(gBParentConditionInterface.g(), Boolean.FALSE)) {
                                        if (nVar2.f266223a.q()) {
                                            System.out.println((Object) "Feature blocked by prerequisite");
                                        }
                                        return e(nVar2, featureKey, null, com.sdk.growthbook.model.l.prerequisite, null, null, 24, null);
                                    }
                                    return e(this, featureKey, null, com.sdk.growthbook.model.l.unknownFeature, null, null, 24, null);
                                }
                                nVar = nVar2;
                                if (kVar2.F() != null) {
                                    aVar2 = com.sdk.growthbook.utils.o.Companion;
                                    arrayListF = kVar2.F();
                                    aVar3 = nVar.f266223a;
                                    if (aVar2.v(arrayListF, aVar3.v().f(), aVar3)) {
                                        if (kVar2.G() == null) {
                                            try {
                                                if (kVar2.B() != null) {
                                                    kVar = new k();
                                                    mapC = nVar.c(nVar.f266223a.v().f(), attributeOverrides);
                                                    qVarA = nf.a.a(q.Companion, kVar2.B());
                                                    if (qVarA instanceof com.sdk.growthbook.model.m) {
                                                        mVar = (com.sdk.growthbook.model.m) qVarA;
                                                    } else {
                                                        mVar = null;
                                                    }
                                                    if (mVar == null) {
                                                        mVar = new com.sdk.growthbook.model.m(MapsKt.emptyMap());
                                                    }
                                                    if (kVar.n(mapC, mVar, nVar.f266223a.s())) {
                                                        z10 = false;
                                                        if (nVar.f266223a.t() != null) {
                                                            z11 = true;
                                                        } else {
                                                            z11 = false;
                                                        }
                                                        boolean zAreEqual = Intrinsics.areEqual(kVar2.D(), Boolean.TRUE);
                                                        if (z11 && !zAreEqual) {
                                                            z10 = true;
                                                        }
                                                        aVar = com.sdk.growthbook.utils.o.Companion;
                                                        strV = kVar2.V();
                                                        if (strV == null) {
                                                            strV = featureKey;
                                                        }
                                                        strH = kVar2.H();
                                                        if (z10) {
                                                            strE = kVar2.E();
                                                        } else {
                                                            strE = null;
                                                        }
                                                        if (aVar.w(nVar.f266223a.v().f(), attributeOverrides, strV, strH, strE, kVar2.R(), kVar2.C(), kVar2.I())) {
                                                            if (kVar2.W() != null) {
                                                                for (com.sdk.growthbook.utils.m mVar3 : kVar2.W()) {
                                                                    if (!nVar.f266223a.p().a(mVar3.f(), mVar3.g())) {
                                                                        nVar.f266223a.u().invoke(mVar3.f(), mVar3.g());
                                                                    }
                                                                }
                                                            }
                                                            if (kVar2.R() != null && kVar2.C() != null) {
                                                                String strH2 = kVar2.H();
                                                                if (strH2 == null) {
                                                                    strH2 = "id";
                                                                }
                                                                q qVar = nVar.f266223a.v().f().get(strH2);
                                                                String string = qVar != null ? qVar.toString() : null;
                                                                if (string != null && string.length() != 0) {
                                                                    Float fQ = com.sdk.growthbook.utils.o.Companion.q(string, kVar2.I(), kVar2.V());
                                                                    if ((fQ != null ? fQ.floatValue() : 0.0f) <= kVar2.C().floatValue()) {
                                                                    }
                                                                }
                                                            }
                                                            return e(nVar, featureKey, kVar2.G(), com.sdk.growthbook.model.l.force, null, null, 24, null);
                                                        }
                                                    }
                                                } else {
                                                    z10 = false;
                                                    if (nVar.f266223a.t() != null) {
                                                        z11 = true;
                                                    } else {
                                                        z11 = false;
                                                    }
                                                    boolean zAreEqual2 = Intrinsics.areEqual(kVar2.D(), Boolean.TRUE);
                                                    if (z11) {
                                                        z10 = true;
                                                    }
                                                    aVar = com.sdk.growthbook.utils.o.Companion;
                                                    strV = kVar2.V();
                                                    if (strV == null) {
                                                        strV = featureKey;
                                                    }
                                                    strH = kVar2.H();
                                                    if (z10) {
                                                        strE = kVar2.E();
                                                    } else {
                                                        strE = null;
                                                    }
                                                    if (aVar.w(nVar.f266223a.v().f(), attributeOverrides, strV, strH, strE, kVar2.R(), kVar2.C(), kVar2.I())) {
                                                        if (kVar2.W() != null) {
                                                            while (r0.hasNext()) {
                                                                if (!nVar.f266223a.p().a(mVar3.f(), mVar3.g())) {
                                                                    nVar.f266223a.u().invoke(mVar3.f(), mVar3.g());
                                                                }
                                                            }
                                                        }
                                                        if (kVar2.R() != null) {
                                                        }
                                                        return e(nVar, featureKey, kVar2.G(), com.sdk.growthbook.model.l.force, null, null, 24, null);
                                                    }
                                                }
                                            } catch (Exception unused) {
                                            }
                                        } else {
                                            listX = kVar2.X();
                                            if (listX != null) {
                                                strK = kVar2.K();
                                                if (strK == null) {
                                                    str = featureKey;
                                                } else {
                                                    str = strK;
                                                }
                                                Float fC = kVar2.C();
                                                List<Float> listY = kVar2.Y();
                                                fVar = new com.sdk.growthbook.model.f(str, listX, kVar2.O(), kVar2.H(), listY, null, fC, kVar2.B(), kVar2.P(), null, kVar2.I(), kVar2.T(), kVar2.L(), kVar2.F(), kVar2.V(), kVar2.N(), kVar2.Q(), kVar2.E(), kVar2.D(), kVar2.A(), kVar2.M(), 544, null);
                                                gVarA = new l(nVar.f266223a).a(fVar, attributeOverrides, featureKey);
                                                if (gVarA.u() && !Intrinsics.areEqual(gVarA.x(), Boolean.TRUE)) {
                                                    return nVar.d(featureKey, gVarA.z(), com.sdk.growthbook.model.l.experiment, fVar, gVarA);
                                                }
                                            }
                                            nVar2 = this;
                                        }
                                    }
                                } else if (kVar2.G() == null) {
                                    listX = kVar2.X();
                                    if (listX != null) {
                                        strK = kVar2.K();
                                        if (strK == null) {
                                            str = featureKey;
                                        } else {
                                            str = strK;
                                        }
                                        Float fC2 = kVar2.C();
                                        List<Float> listY2 = kVar2.Y();
                                        fVar = new com.sdk.growthbook.model.f(str, listX, kVar2.O(), kVar2.H(), listY2, null, fC2, kVar2.B(), kVar2.P(), null, kVar2.I(), kVar2.T(), kVar2.L(), kVar2.F(), kVar2.V(), kVar2.N(), kVar2.Q(), kVar2.E(), kVar2.D(), kVar2.A(), kVar2.M(), 544, null);
                                        gVarA = new l(nVar.f266223a).a(fVar, attributeOverrides, featureKey);
                                        if (gVarA.u()) {
                                            return nVar.d(featureKey, gVarA.z(), com.sdk.growthbook.model.l.experiment, fVar, gVarA);
                                        }
                                    }
                                    nVar2 = this;
                                } else if (kVar2.B() != null) {
                                    kVar = new k();
                                    mapC = nVar.c(nVar.f266223a.v().f(), attributeOverrides);
                                    qVarA = nf.a.a(q.Companion, kVar2.B());
                                    if (qVarA instanceof com.sdk.growthbook.model.m) {
                                        mVar = (com.sdk.growthbook.model.m) qVarA;
                                    } else {
                                        mVar = null;
                                    }
                                    if (mVar == null) {
                                        mVar = new com.sdk.growthbook.model.m(MapsKt.emptyMap());
                                    }
                                    if (kVar.n(mapC, mVar, nVar.f266223a.s())) {
                                        z10 = false;
                                        if (nVar.f266223a.t() != null) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        boolean zAreEqual3 = Intrinsics.areEqual(kVar2.D(), Boolean.TRUE);
                                        if (z11) {
                                            z10 = true;
                                        }
                                        aVar = com.sdk.growthbook.utils.o.Companion;
                                        strV = kVar2.V();
                                        if (strV == null) {
                                            strV = featureKey;
                                        }
                                        strH = kVar2.H();
                                        if (z10) {
                                            strE = kVar2.E();
                                        } else {
                                            strE = null;
                                        }
                                        if (aVar.w(nVar.f266223a.v().f(), attributeOverrides, strV, strH, strE, kVar2.R(), kVar2.C(), kVar2.I())) {
                                            if (kVar2.W() != null) {
                                                while (r0.hasNext()) {
                                                    if (!nVar.f266223a.p().a(mVar3.f(), mVar3.g())) {
                                                        nVar.f266223a.u().invoke(mVar3.f(), mVar3.g());
                                                    }
                                                }
                                            }
                                            if (kVar2.R() != null) {
                                            }
                                            return e(nVar, featureKey, kVar2.G(), com.sdk.growthbook.model.l.force, null, null, 24, null);
                                        }
                                    }
                                } else {
                                    z10 = false;
                                    if (nVar.f266223a.t() != null) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    boolean zAreEqual4 = Intrinsics.areEqual(kVar2.D(), Boolean.TRUE);
                                    if (z11) {
                                        z10 = true;
                                    }
                                    aVar = com.sdk.growthbook.utils.o.Companion;
                                    strV = kVar2.V();
                                    if (strV == null) {
                                        strV = featureKey;
                                    }
                                    strH = kVar2.H();
                                    if (z10) {
                                        strE = kVar2.E();
                                    } else {
                                        strE = null;
                                    }
                                    if (aVar.w(nVar.f266223a.v().f(), attributeOverrides, strV, strH, strE, kVar2.R(), kVar2.C(), kVar2.I())) {
                                        if (kVar2.W() != null) {
                                            while (r0.hasNext()) {
                                                if (!nVar.f266223a.p().a(mVar3.f(), mVar3.g())) {
                                                    nVar.f266223a.u().invoke(mVar3.f(), mVar3.g());
                                                }
                                            }
                                        }
                                        if (kVar2.R() != null) {
                                        }
                                        return e(nVar, featureKey, kVar2.G(), com.sdk.growthbook.model.l.force, null, null, 24, null);
                                    }
                                }
                                nVar2 = nVar;
                            }
                        } catch (Exception unused2) {
                        }
                    } else {
                        nVar = nVar2;
                        if (kVar2.F() != null) {
                            aVar2 = com.sdk.growthbook.utils.o.Companion;
                            arrayListF = kVar2.F();
                            aVar3 = nVar.f266223a;
                            if (aVar2.v(arrayListF, aVar3.v().f(), aVar3)) {
                                if (kVar2.G() == null) {
                                    listX = kVar2.X();
                                    if (listX != null) {
                                        strK = kVar2.K();
                                        if (strK == null) {
                                            str = featureKey;
                                        } else {
                                            str = strK;
                                        }
                                        Float fC3 = kVar2.C();
                                        List<Float> listY3 = kVar2.Y();
                                        fVar = new com.sdk.growthbook.model.f(str, listX, kVar2.O(), kVar2.H(), listY3, null, fC3, kVar2.B(), kVar2.P(), null, kVar2.I(), kVar2.T(), kVar2.L(), kVar2.F(), kVar2.V(), kVar2.N(), kVar2.Q(), kVar2.E(), kVar2.D(), kVar2.A(), kVar2.M(), 544, null);
                                        gVarA = new l(nVar.f266223a).a(fVar, attributeOverrides, featureKey);
                                        if (gVarA.u()) {
                                            return nVar.d(featureKey, gVarA.z(), com.sdk.growthbook.model.l.experiment, fVar, gVarA);
                                        }
                                    }
                                    nVar2 = this;
                                } else if (kVar2.B() != null) {
                                    kVar = new k();
                                    mapC = nVar.c(nVar.f266223a.v().f(), attributeOverrides);
                                    qVarA = nf.a.a(q.Companion, kVar2.B());
                                    if (qVarA instanceof com.sdk.growthbook.model.m) {
                                        mVar = (com.sdk.growthbook.model.m) qVarA;
                                    } else {
                                        mVar = null;
                                    }
                                    if (mVar == null) {
                                        mVar = new com.sdk.growthbook.model.m(MapsKt.emptyMap());
                                    }
                                    if (kVar.n(mapC, mVar, nVar.f266223a.s())) {
                                        z10 = false;
                                        if (nVar.f266223a.t() != null) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        boolean zAreEqual5 = Intrinsics.areEqual(kVar2.D(), Boolean.TRUE);
                                        if (z11) {
                                            z10 = true;
                                        }
                                        aVar = com.sdk.growthbook.utils.o.Companion;
                                        strV = kVar2.V();
                                        if (strV == null) {
                                            strV = featureKey;
                                        }
                                        strH = kVar2.H();
                                        if (z10) {
                                            strE = kVar2.E();
                                        } else {
                                            strE = null;
                                        }
                                        if (aVar.w(nVar.f266223a.v().f(), attributeOverrides, strV, strH, strE, kVar2.R(), kVar2.C(), kVar2.I())) {
                                            if (kVar2.W() != null) {
                                                while (r0.hasNext()) {
                                                    if (!nVar.f266223a.p().a(mVar3.f(), mVar3.g())) {
                                                        nVar.f266223a.u().invoke(mVar3.f(), mVar3.g());
                                                    }
                                                }
                                            }
                                            if (kVar2.R() != null) {
                                            }
                                            return e(nVar, featureKey, kVar2.G(), com.sdk.growthbook.model.l.force, null, null, 24, null);
                                        }
                                    }
                                } else {
                                    z10 = false;
                                    if (nVar.f266223a.t() != null) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    boolean zAreEqual6 = Intrinsics.areEqual(kVar2.D(), Boolean.TRUE);
                                    if (z11) {
                                        z10 = true;
                                    }
                                    aVar = com.sdk.growthbook.utils.o.Companion;
                                    strV = kVar2.V();
                                    if (strV == null) {
                                        strV = featureKey;
                                    }
                                    strH = kVar2.H();
                                    if (z10) {
                                        strE = kVar2.E();
                                    } else {
                                        strE = null;
                                    }
                                    if (aVar.w(nVar.f266223a.v().f(), attributeOverrides, strV, strH, strE, kVar2.R(), kVar2.C(), kVar2.I())) {
                                        if (kVar2.W() != null) {
                                            while (r0.hasNext()) {
                                                if (!nVar.f266223a.p().a(mVar3.f(), mVar3.g())) {
                                                    nVar.f266223a.u().invoke(mVar3.f(), mVar3.g());
                                                }
                                            }
                                        }
                                        if (kVar2.R() != null) {
                                        }
                                        return e(nVar, featureKey, kVar2.G(), com.sdk.growthbook.model.l.force, null, null, 24, null);
                                    }
                                }
                            }
                        } else if (kVar2.G() == null) {
                            listX = kVar2.X();
                            if (listX != null) {
                                strK = kVar2.K();
                                if (strK == null) {
                                    str = featureKey;
                                } else {
                                    str = strK;
                                }
                                Float fC4 = kVar2.C();
                                List<Float> listY4 = kVar2.Y();
                                fVar = new com.sdk.growthbook.model.f(str, listX, kVar2.O(), kVar2.H(), listY4, null, fC4, kVar2.B(), kVar2.P(), null, kVar2.I(), kVar2.T(), kVar2.L(), kVar2.F(), kVar2.V(), kVar2.N(), kVar2.Q(), kVar2.E(), kVar2.D(), kVar2.A(), kVar2.M(), 544, null);
                                gVarA = new l(nVar.f266223a).a(fVar, attributeOverrides, featureKey);
                                if (gVarA.u()) {
                                    return nVar.d(featureKey, gVarA.z(), com.sdk.growthbook.model.l.experiment, fVar, gVarA);
                                }
                            }
                            nVar2 = this;
                        } else if (kVar2.B() != null) {
                            kVar = new k();
                            mapC = nVar.c(nVar.f266223a.v().f(), attributeOverrides);
                            qVarA = nf.a.a(q.Companion, kVar2.B());
                            if (qVarA instanceof com.sdk.growthbook.model.m) {
                                mVar = (com.sdk.growthbook.model.m) qVarA;
                            } else {
                                mVar = null;
                            }
                            if (mVar == null) {
                                mVar = new com.sdk.growthbook.model.m(MapsKt.emptyMap());
                            }
                            if (kVar.n(mapC, mVar, nVar.f266223a.s())) {
                                z10 = false;
                                if (nVar.f266223a.t() != null) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                boolean zAreEqual7 = Intrinsics.areEqual(kVar2.D(), Boolean.TRUE);
                                if (z11) {
                                    z10 = true;
                                }
                                aVar = com.sdk.growthbook.utils.o.Companion;
                                strV = kVar2.V();
                                if (strV == null) {
                                    strV = featureKey;
                                }
                                strH = kVar2.H();
                                if (z10) {
                                    strE = kVar2.E();
                                } else {
                                    strE = null;
                                }
                                if (aVar.w(nVar.f266223a.v().f(), attributeOverrides, strV, strH, strE, kVar2.R(), kVar2.C(), kVar2.I())) {
                                    if (kVar2.W() != null) {
                                        while (r0.hasNext()) {
                                            if (!nVar.f266223a.p().a(mVar3.f(), mVar3.g())) {
                                                nVar.f266223a.u().invoke(mVar3.f(), mVar3.g());
                                            }
                                        }
                                    }
                                    if (kVar2.R() != null) {
                                    }
                                    return e(nVar, featureKey, kVar2.G(), com.sdk.growthbook.model.l.force, null, null, 24, null);
                                }
                            }
                        } else {
                            z10 = false;
                            if (nVar.f266223a.t() != null) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            boolean zAreEqual8 = Intrinsics.areEqual(kVar2.D(), Boolean.TRUE);
                            if (z11) {
                                z10 = true;
                            }
                            aVar = com.sdk.growthbook.utils.o.Companion;
                            strV = kVar2.V();
                            if (strV == null) {
                                strV = featureKey;
                            }
                            strH = kVar2.H();
                            if (z10) {
                                strE = kVar2.E();
                            } else {
                                strE = null;
                            }
                            if (aVar.w(nVar.f266223a.v().f(), attributeOverrides, strV, strH, strE, kVar2.R(), kVar2.C(), kVar2.I())) {
                                if (kVar2.W() != null) {
                                    while (r0.hasNext()) {
                                        if (!nVar.f266223a.p().a(mVar3.f(), mVar3.g())) {
                                            nVar.f266223a.u().invoke(mVar3.f(), mVar3.g());
                                        }
                                    }
                                }
                                if (kVar2.R() != null) {
                                }
                                return e(nVar, featureKey, kVar2.G(), com.sdk.growthbook.model.l.force, null, null, 24, null);
                            }
                        }
                        nVar2 = nVar;
                    }
                }
            }
            return e(this, featureKey, hVar.e(), com.sdk.growthbook.model.l.defaultValue, null, null, 24, null);
        } catch (Exception unused3) {
        }
    }

    public /* synthetic */ n(a aVar, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i10 & 2) != 0 ? MapsKt.emptyMap() : map);
    }
}
