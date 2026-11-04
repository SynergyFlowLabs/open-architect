package com.sdk.growthbook.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.n1;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class o {

    @NotNull
    public static final a Companion = new a(null);

    @SourceDebugExtension({"SMAP\nGBUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GBUtils.kt\ncom/sdk/growthbook/utils/GBUtils$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,607:1\n1#2:608\n2783#3,7:609\n1563#3:616\n1634#3,3:617\n1761#3,2:620\n2746#3,3:622\n1763#3:625\n1869#3,2:626\n1869#3:628\n1869#3,2:629\n1870#3:631\n360#3,7:632\n*S KotlinDebug\n*F\n+ 1 GBUtils.kt\ncom/sdk/growthbook/utils/GBUtils$Companion\n*L\n162#1:609,7\n170#1:616\n170#1:617,3\n270#1:620,2\n291#1:622,3\n270#1:625\n371#1:626,2\n393#1:628\n395#1:629,2\n393#1:631\n496#1:632,7\n*E\n"})
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final float A(float f10, int i10) {
            float fPow = (float) Math.pow(10.0f, i10);
            return kotlin.math.b.L0(f10 * fPow) / fPow;
        }

        private final String B(com.sdk.growthbook.model.q qVar) {
            if (qVar instanceof com.sdk.growthbook.model.p) {
                return ((com.sdk.growthbook.model.p) qVar).m();
            }
            return String.valueOf(qVar != null ? nf.a.b(qVar) : null);
        }

        private final List<String> d(com.sdk.growthbook.model.d dVar, com.sdk.growthbook.features.b bVar) {
            Map<String, com.sdk.growthbook.model.h> mapW;
            List<com.sdk.growthbook.model.k> listF;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (bVar == null || (mapW = bVar.i()) == null) {
                mapW = dVar.w();
            }
            Iterator<T> it = mapW.keySet().iterator();
            while (it.hasNext()) {
                com.sdk.growthbook.model.h hVar = mapW.get((String) it.next());
                if (hVar != null && (listF = hVar.f()) != null) {
                    for (com.sdk.growthbook.model.k kVar : listF) {
                        if (kVar.X() != null) {
                            String strH = kVar.H();
                            if (strH == null) {
                                strH = "id";
                            }
                            linkedHashSet.add(strH);
                            String strE = kVar.E();
                            if (strE != null) {
                                linkedHashSet.add(strE);
                            }
                        }
                    }
                }
            }
            return CollectionsKt.toList(linkedHashSet);
        }

        public static /* synthetic */ Pair j(a aVar, String str, String str2, Map map, Map map2, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                str2 = null;
            }
            return aVar.i(str, str2, map, map2);
        }

        private final Map<String, String> k(com.sdk.growthbook.evaluators.o oVar, String str, String str2, Map<String, ? extends com.sdk.growthbook.model.q> map, Map<String, ? extends com.sdk.growthbook.model.q> map2) {
            String str3;
            GBStickyAssignmentsDocument gBStickyAssignmentsDocument;
            JsonElement jsonElementB;
            JsonPrimitive jsonPrimitive;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Map<String, GBStickyAssignmentsDocument> mapH = oVar.h();
            if (mapH != null) {
                String content = null;
                Pair<String, String> pairI = i(str, null, map, map2);
                String str4 = pairI.component1() + "||" + pairI.component2();
                Pair<String, String> pairI2 = i(null, str2, map, map2);
                String strComponent1 = pairI2.component1();
                String strComponent2 = pairI2.component2();
                if (strComponent2.length() == 0) {
                    str3 = null;
                } else {
                    str3 = strComponent1 + "||" + strComponent2;
                }
                GBStickyAssignmentsDocument gBStickyAssignmentsDocument2 = mapH.get(str2 + "||" + B(map2.get(str2)));
                String strK = gBStickyAssignmentsDocument2 != null ? gBStickyAssignmentsDocument2.k() : null;
                com.sdk.growthbook.model.q qVar = map2.get(str2);
                if (qVar != null && (jsonElementB = nf.a.b(qVar)) != null && (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElementB)) != null) {
                    content = jsonPrimitive.getContent();
                }
                if (!Intrinsics.areEqual(strK, content)) {
                    oVar.i(MapsKt.emptyMap());
                }
                if (str3 != null && (gBStickyAssignmentsDocument = mapH.get(str3)) != null) {
                    linkedHashMap.putAll(gBStickyAssignmentsDocument.i());
                }
                GBStickyAssignmentsDocument gBStickyAssignmentsDocument3 = mapH.get(str4);
                if (gBStickyAssignmentsDocument3 != null) {
                    linkedHashMap.putAll(gBStickyAssignmentsDocument3.i());
                }
            }
            return linkedHashMap;
        }

        private final Map<String, String> l(com.sdk.growthbook.model.d dVar, com.sdk.growthbook.features.b bVar, Map<String, ? extends com.sdk.growthbook.model.q> map) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            List<String> listE = dVar.E();
            if (listE == null) {
                listE = d(dVar, bVar);
            }
            dVar.M(listE);
            List<String> listE2 = dVar.E();
            if (listE2 != null) {
                for (String str : listE2) {
                    int i10 = 7 & 0;
                    linkedHashMap.put(str, j(o.Companion, str, null, dVar.s(), map, 2, null).getSecond());
                }
            }
            return linkedHashMap;
        }

        public static /* synthetic */ String n(a aVar, String str, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                i10 = 0;
            }
            return aVar.m(str, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Pair p(a aVar, String str, com.sdk.growthbook.evaluators.o oVar, int i10, int i11, List list, String str2, String str3, Map map, int i12, Object obj) {
            if ((i12 & 4) != 0) {
                i10 = 0;
            }
            if ((i12 & 8) != 0) {
                i11 = 0;
            }
            if ((i12 & 16) != 0) {
                list = CollectionsKt.emptyList();
            }
            if ((i12 & 32) != 0) {
                str2 = null;
            }
            if ((i12 & 64) != 0) {
                str3 = "id";
            }
            return aVar.o(str, oVar, i10, i11, list, str2, str3, map);
        }

        private final float r(String str, String str2) {
            return Float.parseFloat(new h().a(str + str2).r0(new com.ionspin.kotlin.bignum.integer.a(1000)).toString()) / 1000.0f;
        }

        private final float s(String str, String str2) {
            return Float.parseFloat(new h().a(new h().a(str2 + str).toString()).r0(new com.ionspin.kotlin.bignum.integer.a(10000)).toString()) / 10000.0f;
        }

        private final boolean u(Float f10, Pair<Float, Float> pair) {
            return f10 != null && pair != null && f10.floatValue() >= pair.getFirst().floatValue() && f10.floatValue() < pair.getSecond().floatValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence y(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (new Regex("^\\d+$").k(it)) {
                it = StringsKt.U3(it, 5, ' ');
            }
            return it;
        }

        public final int b(float f10, @NotNull List<Pair<Float, Float>> ranges) {
            Intrinsics.checkNotNullParameter(ranges, "ranges");
            Iterator<T> it = ranges.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                int i11 = i10 + 1;
                if (u(Float.valueOf(f10), (Pair) it.next())) {
                    return i10;
                }
                i10 = i11;
            }
            return -1;
        }

        @Nullable
        public final Object c(@Nullable Object obj) {
            if (obj instanceof JsonPrimitive) {
                JsonPrimitive jsonPrimitive = (JsonPrimitive) obj;
                Object intOrNull = JsonElementKt.getIntOrNull(jsonPrimitive);
                if (intOrNull != null || (intOrNull = JsonElementKt.getLongOrNull(jsonPrimitive)) != null || (intOrNull = JsonElementKt.getDoubleOrNull(jsonPrimitive)) != null || (intOrNull = JsonElementKt.getFloatOrNull(jsonPrimitive)) != null || (intOrNull = JsonElementKt.getBooleanOrNull(jsonPrimitive)) != null) {
                    return intOrNull;
                }
                String contentOrNull = JsonElementKt.getContentOrNull(jsonPrimitive);
                if (contentOrNull != null) {
                    return contentOrNull;
                }
            }
            return obj;
        }

        @NotNull
        public final n1<String, GBStickyAssignmentsDocument, Boolean> e(@NotNull String attributeName, @NotNull String attributeValue, @NotNull Map<String, String> assignments, @Nullable Map<String, GBStickyAssignmentsDocument> map) {
            Map<String, String> mapEmptyMap;
            GBStickyAssignmentsDocument gBStickyAssignmentsDocument;
            Intrinsics.checkNotNullParameter(attributeName, "attributeName");
            Intrinsics.checkNotNullParameter(attributeValue, "attributeValue");
            Intrinsics.checkNotNullParameter(assignments, "assignments");
            String str = attributeName + "||" + attributeValue;
            if (map == null || (gBStickyAssignmentsDocument = map.get(str)) == null || (mapEmptyMap = gBStickyAssignmentsDocument.i()) == null) {
                mapEmptyMap = MapsKt.emptyMap();
            }
            Map mutableMap = MapsKt.toMutableMap(mapEmptyMap);
            mutableMap.putAll(assignments);
            return new n1<>(str, new GBStickyAssignmentsDocument(attributeName, attributeValue, mutableMap), Boolean.valueOf(!Intrinsics.areEqual(mapEmptyMap, mutableMap)));
        }

        @NotNull
        public final List<Pair<Float, Float>> f(int i10, float f10, @Nullable List<Float> list) {
            float f11 = 0.0f;
            float f12 = f10 < 0.0f ? 0.0f : f10;
            if (f10 > 1.0f) {
                f12 = 1.0f;
            }
            List<Float> listG = g(i10);
            if (list == null) {
                list = listG;
            }
            if (list.size() == i10) {
                listG = list;
            }
            Iterator<T> it = listG.iterator();
            if (!it.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next = it.next();
            while (it.hasNext()) {
                next = Float.valueOf(((Number) next).floatValue() + ((Number) it.next()).floatValue());
            }
            double dFloatValue = ((Number) next).floatValue();
            if (dFloatValue < 0.99d || dFloatValue > 1.01d) {
                listG = g(i10);
            }
            List<Float> list2 = listG;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                float fFloatValue = ((Number) it2.next()).floatValue();
                a aVar = o.Companion;
                arrayList.add(new Pair(Float.valueOf(aVar.A(f11, 4)), Float.valueOf(aVar.A(f11 + (fFloatValue * f12), 4))));
                f11 += fFloatValue;
            }
            return arrayList;
        }

        @NotNull
        public final List<Float> g(int i10) {
            if (i10 <= 0) {
                return CollectionsKt.emptyList();
            }
            float f10 = 1.0f / i10;
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                arrayList.add(Float.valueOf(f10));
            }
            return arrayList;
        }

        @Nullable
        public final n1<String, Float, Float> h(@NotNull JsonArray namespace) {
            Intrinsics.checkNotNullParameter(namespace, "namespace");
            if (namespace.size() < 3) {
                return null;
            }
            String contentOrNull = JsonElementKt.getContentOrNull(JsonElementKt.getJsonPrimitive(namespace.get(0)));
            Float floatOrNull = JsonElementKt.getFloatOrNull(JsonElementKt.getJsonPrimitive(namespace.get(1)));
            Float floatOrNull2 = JsonElementKt.getFloatOrNull(JsonElementKt.getJsonPrimitive(namespace.get(2)));
            if (contentOrNull == null || floatOrNull == null || floatOrNull2 == null) {
                return null;
            }
            return new n1<>(contentOrNull, floatOrNull, floatOrNull2);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0071 A[PHI: r0
          0x0071: PHI (r0v11 java.lang.String) = (r0v10 java.lang.String), (r0v10 java.lang.String), (r0v14 java.lang.String) binds: [B:13:0x0041, B:14:0x0043, B:22:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
        @NotNull
        public final Pair<String, String> i(@Nullable String str, @Nullable String str2, @NotNull Map<String, ? extends com.sdk.growthbook.model.q> attributes, @NotNull Map<String, ? extends com.sdk.growthbook.model.q> attributeOverrides) {
            String strB;
            Intrinsics.checkNotNullParameter(attributes, "attributes");
            Intrinsics.checkNotNullParameter(attributeOverrides, "attributeOverrides");
            if (str == null) {
                str = "id";
            }
            if (attributeOverrides.get(str) != null) {
                strB = B(attributeOverrides.get(str));
            } else {
                strB = attributes.get(str) != null ? B(attributes.get(str)) : "";
            }
            if (strB.length() != 0 || str2 == null) {
                str2 = str;
            } else {
                if (attributeOverrides.get(str2) != null) {
                    strB = B(attributeOverrides.get(str2));
                } else if (attributes.get(str2) != null) {
                    strB = B(attributes.get(str2));
                }
                if (strB.length() <= 0) {
                    str2 = str;
                }
            }
            return new Pair<>(str2, strB);
        }

        @NotNull
        public final String m(@NotNull String experimentKey, int i10) {
            Intrinsics.checkNotNullParameter(experimentKey, "experimentKey");
            return experimentKey + "__" + i10;
        }

        @NotNull
        public final Pair<Integer, Boolean> o(@NotNull String experimentKey, @NotNull com.sdk.growthbook.evaluators.o userContext, int i10, int i11, @NotNull List<GBVariationMeta> meta, @Nullable String str, @Nullable String str2, @NotNull Map<String, ? extends com.sdk.growthbook.model.q> attributeOverrides) {
            int i12 = -1;
            Intrinsics.checkNotNullParameter(experimentKey, "experimentKey");
            Intrinsics.checkNotNullParameter(userContext, "userContext");
            Intrinsics.checkNotNullParameter(meta, "meta");
            Intrinsics.checkNotNullParameter(attributeOverrides, "attributeOverrides");
            String strM = m(experimentKey, i10);
            Map<String, String> mapK = k(userContext, str2, str, userContext.f(), attributeOverrides);
            int i13 = 0;
            if (i11 > 0 && i11 >= 0) {
                for (int i14 = 0; !mapK.containsKey(m(experimentKey, i14)); i14++) {
                    if (i14 != i11) {
                    }
                }
                return new Pair<>(-1, Boolean.TRUE);
            }
            String str3 = mapK.get(strM);
            if (str3 == null) {
                return new Pair<>(-1, null);
            }
            Iterator<GBVariationMeta> it = meta.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(it.next().f(), str3)) {
                    i12 = i13;
                    break;
                }
                i13++;
            }
            return i12 >= 0 ? new Pair<>(Integer.valueOf(i12), null) : new Pair<>(-1, null);
        }

        @Nullable
        public final Float q(@NotNull String stringValue, @Nullable Integer num, @Nullable String str) {
            Intrinsics.checkNotNullParameter(stringValue, "stringValue");
            if (num == null) {
                return null;
            }
            if (num.intValue() == 1) {
                return Float.valueOf(r(stringValue, str));
            }
            if (num.intValue() == 2) {
                return Float.valueOf(s(stringValue, str));
            }
            return null;
        }

        public final boolean t(@NotNull String userId, @NotNull n1<String, Float, Float> namespace) {
            Intrinsics.checkNotNullParameter(userId, "userId");
            Intrinsics.checkNotNullParameter(namespace, "namespace");
            Float fQ = q(userId + "__", 1, namespace.f());
            if (fQ != null) {
                return u(fQ, new Pair<>(namespace.g(), namespace.h()));
            }
            return false;
        }

        public final boolean v(@Nullable List<GBFilter> list, @Nullable Map<String, ? extends com.sdk.growthbook.model.q> map, @NotNull com.sdk.growthbook.evaluators.a evaluationContext) {
            Intrinsics.checkNotNullParameter(evaluationContext, "evaluationContext");
            if (list == null || map == null) {
                return false;
            }
            List<GBFilter> list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                return false;
            }
            for (GBFilter gBFilter : list2) {
                String strA = gBFilter.a();
                if (strA == null) {
                    strA = "id";
                }
                com.sdk.growthbook.model.q qVar = (com.sdk.growthbook.model.q) MapsKt.getValue(evaluationContext.v().f(), strA);
                if (!(qVar instanceof com.sdk.growthbook.model.q.b) && (nf.a.b(qVar) instanceof JsonPrimitive)) {
                    a aVar = o.Companion;
                    String strB = aVar.B(qVar);
                    if (strB.length() != 0) {
                        Integer numC = gBFilter.c();
                        Float fQ = aVar.q(strB, Integer.valueOf(numC != null ? numC.intValue() : 2), gBFilter.f());
                        if (fQ != null) {
                            List<Pair<Float, Float>> listD = gBFilter.d();
                            if (!(listD instanceof Collection) || !listD.isEmpty()) {
                                Iterator<T> it = listD.iterator();
                                while (it.hasNext()) {
                                    if (o.Companion.u(fQ, (Pair) it.next())) {
                                    }
                                }
                            }
                        }
                    }
                }
                return true;
            }
            return false;
        }

        public final boolean w(@NotNull Map<String, ? extends com.sdk.growthbook.model.q> attributes, @NotNull Map<String, ? extends com.sdk.growthbook.model.q> attributeOverrides, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Pair<Float, Float> pair, @Nullable Float f10, @Nullable Integer num) {
            Intrinsics.checkNotNullParameter(attributes, "attributes");
            Intrinsics.checkNotNullParameter(attributeOverrides, "attributeOverrides");
            if (pair == null && f10 == null) {
                return true;
            }
            Float fQ = q(i(str2, str3, attributes, attributeOverrides).component2(), Integer.valueOf(num != null ? num.intValue() : 1), str);
            if (fQ == null) {
                return false;
            }
            float fFloatValue = fQ.floatValue();
            if (pair != null) {
                return u(fQ, pair);
            }
            return f10 == null || fFloatValue <= f10.floatValue();
        }

        @NotNull
        public final String x(@NotNull String input) {
            Intrinsics.checkNotNullParameter(input, "input");
            List<String> listO = new Regex("[-.]").o(new Regex("^v|\\+.*$").replace(input, ""), 0);
            if (listO.size() == 3) {
                ArrayList arrayList = new ArrayList(listO);
                arrayList.add("~");
                listO = arrayList;
            }
            return CollectionsKt.joinToString$default(listO, "-", null, null, 0, null, new Function1() { // from class: com.sdk.growthbook.utils.n
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return o.a.y((String) obj);
                }
            }, 30, null);
        }

        public final void z(@NotNull com.sdk.growthbook.model.d context, @Nullable com.sdk.growthbook.features.b bVar, @NotNull Map<String, ? extends com.sdk.growthbook.model.q> attributeOverrides) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(attributeOverrides, "attributeOverrides");
            rf.a aVarF = context.F();
            if (aVarF == null) {
                return;
            }
            context.L(aVarF.a(l(context, bVar, attributeOverrides)));
        }

        private a() {
        }
    }
}
