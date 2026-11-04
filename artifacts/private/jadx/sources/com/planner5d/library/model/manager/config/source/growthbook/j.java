package com.planner5d.library.model.manager.config.source.growthbook;

import com.sdk.growthbook.model.m;
import com.sdk.growthbook.model.n;
import com.sdk.growthbook.model.o;
import com.sdk.growthbook.model.p;
import com.sdk.growthbook.model.q;
import com.sdk.growthbook.model.r;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nGrowthBookValueConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GrowthBookValueConverter.kt\ncom/planner5d/library/model/manager/config/source/growthbook/GrowthBookValueConverter\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,62:1\n462#2:63\n412#2:64\n1246#3,4:65\n1863#3,2:69\n*S KotlinDebug\n*F\n+ 1 GrowthBookValueConverter.kt\ncom/planner5d/library/model/manager/config/source/growthbook/GrowthBookValueConverter\n*L\n25#1:63\n25#1:64\n25#1:65,4\n56#1:69,2\n*E\n"})
public final class j {
    @ij.a
    public j() {
    }

    private final JSONArray d(com.sdk.growthbook.model.b bVar) {
        JSONArray jSONArray = new JSONArray();
        Iterator<q> it = bVar.iterator();
        while (it.hasNext()) {
            jSONArray.put(c(it.next()));
        }
        return jSONArray;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(JSONObject jSONObject, j jVar, String key, q value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            jSONObject.put(key, jVar.c(value));
        } catch (JSONException e10) {
            timber.log.b.f381052a.e(e10);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(Function2 function2, Object obj, Object obj2) {
        function2.invoke(obj, obj2);
    }

    @Nullable
    public final Object c(@NotNull q source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if ((source instanceof n) || Intrinsics.areEqual(source, q.b.f266379a)) {
            return null;
        }
        if (source instanceof com.sdk.growthbook.model.c) {
            return Boolean.valueOf(((com.sdk.growthbook.model.c) source).m());
        }
        if (source instanceof p) {
            return ((p) source).m();
        }
        if (source instanceof o) {
            return ((o) source).i();
        }
        if (source instanceof m) {
            return e((m) source);
        }
        if (source instanceof com.sdk.growthbook.model.b) {
            return d((com.sdk.growthbook.model.b) source);
        }
        throw new k0();
    }

    @NotNull
    public final JSONObject e(@NotNull m source) {
        Intrinsics.checkNotNullParameter(source, "source");
        final JSONObject jSONObject = new JSONObject();
        final Function2 function2 = new Function2() { // from class: com.planner5d.library.model.manager.config.source.growthbook.h
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return j.f(jSONObject, this, (String) obj, (q) obj2);
            }
        };
        source.forEach(new BiConsumer() { // from class: com.planner5d.library.model.manager.config.source.growthbook.i
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                j.g(function2, obj, obj2);
            }
        });
        return jSONObject;
    }

    @NotNull
    public final m h(@NotNull Map<String, ? extends Object> source) {
        q qVarA;
        Intrinsics.checkNotNullParameter(source, "source");
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(source.size()));
        Iterator<T> it = source.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Number) {
                qVarA = r.b((Number) value);
            } else if (value instanceof String) {
                qVarA = r.c((String) value);
            } else {
                qVarA = value instanceof Boolean ? r.a(((Boolean) value).booleanValue()) : n.f266374a;
            }
            linkedHashMap.put(key, qVarA);
        }
        return new m(linkedHashMap);
    }
}
