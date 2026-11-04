package com.sdk.growthbook.evaluators;

import com.sdk.growthbook.model.p;
import com.sdk.growthbook.model.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nGBConditionEvaluator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GBConditionEvaluator.kt\ncom/sdk/growthbook/evaluators/GBConditionEvaluator\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,605:1\n1869#2,2:606\n*S KotlinDebug\n*F\n+ 1 GBConditionEvaluator.kt\ncom/sdk/growthbook/evaluators/GBConditionEvaluator\n*L\n565#1:606,2\n*E\n"})
public final class k {
    /* JADX WARN: Multi-variable type inference failed */
    private final boolean C(q qVar, com.sdk.growthbook.model.b bVar) {
        if (!(qVar instanceof com.sdk.growthbook.model.b)) {
            return bVar.contains(qVar);
        }
        if (((com.sdk.growthbook.model.b) qVar).size() == 0) {
            return false;
        }
        for (q qVar2 : (Iterable) qVar) {
            if (B(qVar2) == b.GbString || B(qVar2) == b.GbBoolean || B(qVar2) == b.GbNumber) {
                if (bVar.contains(qVar2)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final double E(q qVar) {
        Double dL0;
        if (qVar instanceof com.sdk.growthbook.model.o) {
            return ((com.sdk.growthbook.model.o) qVar).i().doubleValue();
        }
        if (!(qVar instanceof p) || (dL0 = StringsKt.L0(((p) qVar).m())) == null) {
            return 0.0d;
        }
        return dL0.doubleValue();
    }

    private final boolean i(com.sdk.growthbook.model.b bVar, com.sdk.growthbook.model.b bVar2) {
        if (bVar.size() != bVar2.size()) {
            return false;
        }
        int size = bVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!Intrinsics.areEqual(bVar.get(i10), bVar2.get(i10))) {
                return false;
            }
        }
        return true;
    }

    private final String j(q qVar) {
        return qVar instanceof p ? ((p) qVar).m() : qVar.toString();
    }

    private final boolean k(q qVar, q qVar2, Function2<? super String, ? super String, Boolean> function2, Function2<? super Double, ? super Double, Boolean> function3) {
        boolean z10 = qVar instanceof p;
        if (!z10 || !(qVar2 instanceof p)) {
            return function3.invoke(Double.valueOf(qVar != null ? E(qVar) : 0.0d), Double.valueOf(E(qVar2))).booleanValue();
        }
        p pVar = z10 ? (p) qVar : null;
        String strM = pVar != null ? pVar.m() : null;
        if (strM == null) {
            strM = "";
        }
        p pVar2 = qVar2 instanceof p ? (p) qVar2 : null;
        String strM2 = pVar2 != null ? pVar2.m() : null;
        return function2.invoke(strM, strM2 != null ? strM2 : "").booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean l(q qVar, q qVar2, Map<String, ? extends q> map) {
        if (qVar instanceof com.sdk.growthbook.model.b) {
            for (q qVar3 : (com.sdk.growthbook.model.b) qVar) {
                Map<String, ? extends q> map2 = qVar3 instanceof com.sdk.growthbook.model.m ? new HashMap<>((Map) qVar3) : MapsKt.mapOf(TuplesKt.to("value", qVar3));
                boolean z10 = qVar2 instanceof com.sdk.growthbook.model.m;
                if (z10 && D((com.sdk.growthbook.model.m) qVar2)) {
                    if (o(qVar2, qVar3, map)) {
                        return true;
                    }
                } else {
                    com.sdk.growthbook.model.m mVar = z10 ? (com.sdk.growthbook.model.m) qVar2 : null;
                    if (mVar == null) {
                        mVar = new com.sdk.growthbook.model.m(MapsKt.emptyMap());
                    }
                    if (n(map2, mVar, map)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private final boolean m(Map<String, ? extends q> map, com.sdk.growthbook.model.b bVar, Map<String, ? extends q> map2) {
        for (q qVar : bVar) {
            com.sdk.growthbook.model.m mVar = qVar instanceof com.sdk.growthbook.model.m ? (com.sdk.growthbook.model.m) qVar : null;
            if (mVar == null || !n(map, mVar, map2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean q(String actual, String expected) {
        Intrinsics.checkNotNullParameter(actual, "actual");
        Intrinsics.checkNotNullParameter(expected, "expected");
        return actual.compareTo(expected) < 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean r(double d10, double d11) {
        return d10 < d11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean s(String actual, String expected) {
        Intrinsics.checkNotNullParameter(actual, "actual");
        Intrinsics.checkNotNullParameter(expected, "expected");
        if (actual.compareTo(expected) > 0) {
            return false;
        }
        int i10 = 5 | 1;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean t(double d10, double d11) {
        return d10 <= d11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean u(String actual, String expected) {
        Intrinsics.checkNotNullParameter(actual, "actual");
        Intrinsics.checkNotNullParameter(expected, "expected");
        return actual.compareTo(expected) > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean v(double d10, double d11) {
        return d10 > d11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean w(String actual, String expected) {
        Intrinsics.checkNotNullParameter(actual, "actual");
        Intrinsics.checkNotNullParameter(expected, "expected");
        return actual.compareTo(expected) >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean x(double d10, double d11) {
        return d10 >= d11;
    }

    private static final boolean y(k kVar, q qVar, q qVar2, Function2<? super String, ? super String, Boolean> function2, Function2<? super Double, ? super Double, Boolean> function3) {
        return kVar.k(qVar, qVar2, function2, function3);
    }

    private final boolean z(Map<String, ? extends q> map, com.sdk.growthbook.model.b bVar, Map<String, ? extends q> map2) {
        if (bVar.isEmpty()) {
            return true;
        }
        for (q qVar : bVar) {
            com.sdk.growthbook.model.m mVar = qVar instanceof com.sdk.growthbook.model.m ? (com.sdk.growthbook.model.m) qVar : null;
            if (mVar == null) {
                return false;
            }
            if (n(map, mVar, map2)) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final q A(@NotNull Map<String, ? extends q> attributes, @NotNull String key) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(key, "key");
        if (StringsKt.V2(key, ".", false, 2, null)) {
            List listSplit$default = StringsKt.split$default(key, new String[]{"."}, false, 0, 6, null);
            Intrinsics.checkNotNull(listSplit$default, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
            arrayList = (ArrayList) listSplit$default;
        } else {
            arrayList = new ArrayList();
            arrayList.add(key);
        }
        q qVar = attributes.get(arrayList.get(0));
        if (qVar == null) {
            qVar = com.sdk.growthbook.model.n.f266374a;
        }
        for (Object obj : arrayList.subList(1, arrayList.size())) {
            Intrinsics.checkNotNullExpressionValue(obj, "next(...)");
            String str = (String) obj;
            if ((qVar instanceof com.sdk.growthbook.model.m) && (qVar = (q) ((com.sdk.growthbook.model.m) qVar).get(str)) == null) {
                qVar = com.sdk.growthbook.model.n.f266374a;
            }
        }
        return qVar;
    }

    @NotNull
    public final b B(@Nullable q qVar) {
        if (Intrinsics.areEqual(qVar, com.sdk.growthbook.model.n.f266374a)) {
            return b.GbNull;
        }
        if (qVar == null || !qVar.c()) {
            if (qVar instanceof com.sdk.growthbook.model.b) {
                return b.GbArray;
            }
            return qVar instanceof com.sdk.growthbook.model.m ? b.GbObject : b.GbUnknown;
        }
        if (qVar instanceof p) {
            return b.GbString;
        }
        if (qVar instanceof com.sdk.growthbook.model.c) {
            return b.GbBoolean;
        }
        return qVar instanceof com.sdk.growthbook.model.o ? b.GbNumber : b.GbUnknown;
    }

    public final boolean D(@NotNull com.sdk.growthbook.model.m obj) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.keySet().isEmpty()) {
            return false;
        }
        Iterator<String> it = obj.keySet().iterator();
        while (it.hasNext()) {
            if (!StringsKt.u2(it.next(), "$", false, 2, null)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x0013 A[SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final boolean n(@NotNull Map<String, ? extends q> attributes, @NotNull com.sdk.growthbook.model.m conditionObj, @Nullable Map<String, ? extends q> map) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(conditionObj, "conditionObj");
        for (Map.Entry<String, q> entry : conditionObj.entrySet()) {
            String key = entry.getKey();
            q value = entry.getValue();
            boolean z10 = false | false;
            switch (key.hashCode()) {
                case 38151:
                    if (key.equals("$or")) {
                        Object obj = conditionObj.get(key);
                        com.sdk.growthbook.model.b bVar = obj instanceof com.sdk.growthbook.model.b ? (com.sdk.growthbook.model.b) obj : null;
                        if (bVar != null && !z(attributes, bVar, map)) {
                            return false;
                        }
                    } else if (!o(value, A(attributes, key), map)) {
                        return false;
                    }
                case 1169203:
                    if (key.equals("$and")) {
                        Object obj2 = conditionObj.get(key);
                        com.sdk.growthbook.model.b bVar2 = obj2 instanceof com.sdk.growthbook.model.b ? (com.sdk.growthbook.model.b) obj2 : null;
                        if (bVar2 != null && !m(attributes, bVar2, map)) {
                            return false;
                        }
                    } else if (!o(value, A(attributes, key), map)) {
                        return false;
                    }
                case 1181741:
                    if (key.equals("$nor")) {
                        Object obj3 = conditionObj.get(key);
                        com.sdk.growthbook.model.b bVar3 = obj3 instanceof com.sdk.growthbook.model.b ? (com.sdk.growthbook.model.b) obj3 : null;
                        if (bVar3 != null && z(attributes, bVar3, map)) {
                            return false;
                        }
                    } else if (!o(value, A(attributes, key), map)) {
                        return false;
                    }
                case 1181743:
                    if (key.equals("$not")) {
                        Object obj4 = conditionObj.get(key);
                        com.sdk.growthbook.model.m mVar = obj4 instanceof com.sdk.growthbook.model.m ? (com.sdk.growthbook.model.m) obj4 : null;
                        if (mVar != null && n(attributes, mVar, map)) {
                            return false;
                        }
                    } else if (!o(value, A(attributes, key), map)) {
                        return false;
                    }
                default:
                    if (!o(value, A(attributes, key), map)) {
                        return false;
                    }
                    break;
                    break;
            }
        }
        return true;
    }

    public final boolean o(@NotNull q conditionValue, @Nullable q qVar, @Nullable Map<String, ? extends q> map) {
        Intrinsics.checkNotNullParameter(conditionValue, "conditionValue");
        if (conditionValue.c() && (qVar == null || qVar.c())) {
            return Intrinsics.areEqual(conditionValue, qVar);
        }
        if (conditionValue.c() && qVar == null) {
            return false;
        }
        if (conditionValue instanceof com.sdk.growthbook.model.b) {
            if (qVar instanceof com.sdk.growthbook.model.b) {
                return i((com.sdk.growthbook.model.b) conditionValue, (com.sdk.growthbook.model.b) qVar);
            }
            return false;
        }
        if (conditionValue instanceof com.sdk.growthbook.model.m) {
            com.sdk.growthbook.model.m mVar = (com.sdk.growthbook.model.m) conditionValue;
            if (!D(mVar)) {
                if (qVar != null) {
                    return Intrinsics.areEqual(conditionValue, qVar);
                }
                return false;
            }
            for (String str : mVar.keySet()) {
                Object obj = mVar.get(str);
                Intrinsics.checkNotNull(obj);
                if (!p(str, qVar, (q) obj, map)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r14v0, types: [com.sdk.growthbook.model.q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final boolean p(@NotNull String operator, @Nullable q qVar, @NotNull q conditionValue, @Nullable Map<String, ? extends q> map) {
        String strM;
        String strM2;
        Intrinsics.checkNotNullParameter(operator, "operator");
        Intrinsics.checkNotNullParameter(conditionValue, "conditionValue");
        if (Intrinsics.areEqual(operator, "$type")) {
            p pVar = conditionValue instanceof p ? (p) conditionValue : null;
            return Intrinsics.areEqual(B(qVar).toString(), pVar != null ? pVar.m() : null);
        }
        if (Intrinsics.areEqual(operator, "$not")) {
            return !o(conditionValue, qVar, map);
        }
        if (Intrinsics.areEqual(operator, "$exists")) {
            com.sdk.growthbook.model.c cVar = conditionValue instanceof com.sdk.growthbook.model.c ? (com.sdk.growthbook.model.c) conditionValue : null;
            ?? r10 = qVar == null || (qVar instanceof com.sdk.growthbook.model.n);
            if (cVar != null && !cVar.m() && r10 == true) {
                return true;
            }
            ?? r11 = cVar != null && cVar.m();
            ?? r12 = qVar != null;
            boolean z10 = qVar instanceof com.sdk.growthbook.model.n;
            if (r11 != false && r12 != false && !z10) {
                return true;
            }
        }
        if (conditionValue instanceof com.sdk.growthbook.model.b) {
            int iHashCode = operator.hashCode();
            if (iHashCode != 37961) {
                if (iHashCode == 1169149) {
                    if (operator.equals("$all") && (qVar instanceof com.sdk.growthbook.model.b)) {
                        for (q qVar2 : (com.sdk.growthbook.model.b) conditionValue) {
                            Iterator<q> it = ((com.sdk.growthbook.model.b) qVar).iterator();
                            ?? r13 = false;
                            while (it.hasNext()) {
                                if (o(qVar2, it.next(), map)) {
                                    r13 = true;
                                }
                            }
                            if (r13 == false) {
                                return false;
                            }
                        }
                        return true;
                    }
                    return false;
                }
                if (iHashCode == 1181551 && operator.equals("$nin")) {
                    if (qVar instanceof com.sdk.growthbook.model.b) {
                        return !C(qVar, (com.sdk.growthbook.model.b) conditionValue);
                    }
                    return !CollectionsKt.contains((Iterable) conditionValue, qVar);
                }
            } else if (operator.equals("$in")) {
                return qVar instanceof com.sdk.growthbook.model.b ? C(qVar, (com.sdk.growthbook.model.b) conditionValue) : CollectionsKt.contains((Iterable) conditionValue, qVar);
            }
        } else if (qVar instanceof com.sdk.growthbook.model.b) {
            if (Intrinsics.areEqual(operator, "$elemMatch")) {
                return l(qVar, conditionValue, map);
            }
            if (Intrinsics.areEqual(operator, "$size")) {
                return o(conditionValue, new com.sdk.growthbook.model.o(Integer.valueOf(((com.sdk.growthbook.model.b) qVar).size())), map);
            }
        } else if (qVar != null && qVar.c()) {
            p pVar2 = conditionValue instanceof p ? (p) conditionValue : null;
            p pVar3 = qVar instanceof p ? (p) qVar : null;
            com.sdk.growthbook.utils.o.a aVar = com.sdk.growthbook.utils.o.Companion;
            String strM3 = pVar2 != null ? pVar2.m() : null;
            String str = "";
            if (strM3 == null) {
                strM3 = "";
            }
            String strX = aVar.x(strM3);
            String str2 = com.facebook.appevents.p.f99189d0;
            if (pVar3 == null || (strM = pVar3.m()) == null) {
                strM = com.facebook.appevents.p.f99189d0;
            }
            String strX2 = aVar.x(strM);
            switch (operator.hashCode()) {
                case 37840:
                    if (operator.equals("$eq")) {
                        return Intrinsics.areEqual(pVar3, pVar2);
                    }
                    break;
                case 37905:
                    if (operator.equals("$gt")) {
                        return y(this, qVar, conditionValue, new Function2() { // from class: com.sdk.growthbook.evaluators.g
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return Boolean.valueOf(k.u((String) obj, (String) obj2));
                            }
                        }, new Function2() { // from class: com.sdk.growthbook.evaluators.h
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return Boolean.valueOf(k.v(((Double) obj).doubleValue(), ((Double) obj2).doubleValue()));
                            }
                        });
                    }
                    break;
                case 38060:
                    if (operator.equals("$lt")) {
                        return y(this, qVar, conditionValue, new Function2() { // from class: com.sdk.growthbook.evaluators.c
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return Boolean.valueOf(k.q((String) obj, (String) obj2));
                            }
                        }, new Function2() { // from class: com.sdk.growthbook.evaluators.d
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return Boolean.valueOf(k.r(((Double) obj).doubleValue(), ((Double) obj2).doubleValue()));
                            }
                        });
                    }
                    break;
                case 38107:
                    if (operator.equals("$ne")) {
                        return !Intrinsics.areEqual((Object) conditionValue, qVar);
                    }
                    break;
                case 1175156:
                    if (operator.equals("$gte")) {
                        return y(this, qVar, conditionValue, new Function2() { // from class: com.sdk.growthbook.evaluators.i
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return Boolean.valueOf(k.w((String) obj, (String) obj2));
                            }
                        }, new Function2() { // from class: com.sdk.growthbook.evaluators.j
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return Boolean.valueOf(k.x(((Double) obj).doubleValue(), ((Double) obj2).doubleValue()));
                            }
                        });
                    }
                    break;
                case 1179961:
                    if (operator.equals("$lte")) {
                        return y(this, qVar, conditionValue, new Function2() { // from class: com.sdk.growthbook.evaluators.e
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return Boolean.valueOf(k.s((String) obj, (String) obj2));
                            }
                        }, new Function2() { // from class: com.sdk.growthbook.evaluators.f
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return Boolean.valueOf(k.t(((Double) obj).doubleValue(), ((Double) obj2).doubleValue()));
                            }
                        });
                    }
                    break;
                    break;
                case 1189118:
                    if (operator.equals("$veq")) {
                        return Intrinsics.areEqual(strX2, strX);
                    }
                    break;
                case 1189183:
                    return operator.equals("$vgt") && strX2.compareTo(strX) > 0;
                case 1189338:
                    return operator.equals("$vlt") && strX2.compareTo(strX) < 0;
                case 1189385:
                    if (operator.equals("$vne")) {
                        return !Intrinsics.areEqual(strX2, strX);
                    }
                    break;
                case 36864774:
                    return operator.equals("$vgte") && strX2.compareTo(strX) >= 0;
                case 36869579:
                    return operator.equals("$vlte") && strX2.compareTo(strX) <= 0;
                case 233551798:
                    if (operator.equals("$inGroup")) {
                        q qVar3 = map != null ? map.get(j(conditionValue)) : null;
                        com.sdk.growthbook.model.b bVar = qVar3 instanceof com.sdk.growthbook.model.b ? (com.sdk.growthbook.model.b) qVar3 : null;
                        if (bVar == null) {
                            bVar = new com.sdk.growthbook.model.b(CollectionsKt.emptyList());
                        }
                        return C(qVar, bVar);
                    }
                    break;
                case 417740075:
                    if (operator.equals("$notInGroup")) {
                        q qVar4 = map != null ? map.get(j(conditionValue)) : null;
                        com.sdk.growthbook.model.b bVar2 = qVar4 instanceof com.sdk.growthbook.model.b ? (com.sdk.growthbook.model.b) qVar4 : null;
                        if (bVar2 == null) {
                            bVar2 = new com.sdk.growthbook.model.b(CollectionsKt.emptyList());
                        }
                        return !C(qVar, bVar2);
                    }
                    break;
                case 1139041955:
                    if (operator.equals("$regex")) {
                        try {
                            String strM4 = pVar2 != null ? pVar2.m() : null;
                            if (strM4 != null) {
                                str = strM4;
                            }
                            Regex regex = new Regex(str);
                            if (pVar3 != null && (strM2 = pVar3.m()) != null) {
                                str2 = strM2;
                            }
                            return regex.b(str2);
                        } catch (Throwable unused) {
                            return false;
                        }
                    }
                    break;
                default:
                    break;
            }
        }
        return false;
    }
}
