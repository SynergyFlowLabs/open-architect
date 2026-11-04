package com.devtodev.analytics.internal.domain.events.customEvent;

import com.devtodev.analytics.internal.domain.events.IEncodable;
import com.devtodev.analytics.internal.storage.sqlite.ExperimentsEntry;
import com.devtodev.analytics.internal.storage.sqlite.UserEntry;
import com.devtodev.core.data.metrics.Metric;
import h4.a;
import h4.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nCustomEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomEvent.kt\ncom/devtodev/analytics/internal/domain/events/customEvent/CustomEvent\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,94:1\n1855#2,2:95\n125#3:97\n152#3,3:98\n*S KotlinDebug\n*F\n+ 1 CustomEvent.kt\ncom/devtodev/analytics/internal/domain/events/customEvent/CustomEvent\n*L\n65#1:95,2\n83#1:97\n83#1:98,3\n*E\n"})
public final class CustomEvent implements IEncodable {

    @NotNull
    private final String code;

    @Nullable
    private final List<String> inProgress;
    private final int level;

    @NotNull
    private final String name;

    @Nullable
    private final Map<String, Object> parameters;
    private final long sessionId;
    private final long timestamp;

    public CustomEvent(int i10, long j10, @NotNull String name, @Nullable Map<String, ? extends Object> map, @Nullable List<String> list) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.level = i10;
        this.sessionId = j10;
        this.name = name;
        this.parameters = map;
        this.inProgress = list;
        this.code = "ce";
        this.timestamp = System.currentTimeMillis();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CustomEvent copy$default(CustomEvent customEvent, int i10, long j10, String str, Map map, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = customEvent.level;
        }
        if ((i11 & 2) != 0) {
            j10 = customEvent.sessionId;
        }
        if ((i11 & 4) != 0) {
            str = customEvent.name;
        }
        if ((i11 & 8) != 0) {
            map = customEvent.parameters;
        }
        if ((i11 & 16) != 0) {
            list = customEvent.inProgress;
        }
        List list2 = list;
        String str2 = str;
        return customEvent.copy(i10, j10, str2, map, list2);
    }

    public final int component1() {
        return this.level;
    }

    public final long component2() {
        return this.sessionId;
    }

    @NotNull
    public final String component3() {
        return this.name;
    }

    @Nullable
    public final Map<String, Object> component4() {
        return this.parameters;
    }

    @Nullable
    public final List<String> component5() {
        return this.inProgress;
    }

    @NotNull
    public final CustomEvent copy(int i10, long j10, @NotNull String name, @Nullable Map<String, ? extends Object> map, @Nullable List<String> list) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new CustomEvent(i10, j10, name, map, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomEvent)) {
            return false;
        }
        CustomEvent customEvent = (CustomEvent) obj;
        return this.level == customEvent.level && this.sessionId == customEvent.sessionId && Intrinsics.areEqual(this.name, customEvent.name) && Intrinsics.areEqual(this.parameters, customEvent.parameters) && Intrinsics.areEqual(this.inProgress, customEvent.inProgress);
    }

    @Override // com.devtodev.analytics.internal.domain.events.IEncodable
    @NotNull
    public String getCode() {
        return this.code;
    }

    @Nullable
    public final List<String> getInProgress() {
        return this.inProgress;
    }

    @Override // com.devtodev.analytics.internal.domain.events.IEncodable
    @NotNull
    public String getJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.accumulate("code", getCode());
        jSONObject.accumulate("timestamp", Long.valueOf(this.timestamp));
        jSONObject.accumulate("level", Integer.valueOf(this.level));
        jSONObject.accumulate(UserEntry.sessionId, Long.valueOf(this.sessionId));
        jSONObject.accumulate("name", this.name);
        Map<String, Object> map = this.parameters;
        if (map != null && !map.isEmpty()) {
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry<String, Object> entry : this.parameters.entrySet()) {
                jSONObject2.accumulate(entry.getKey(), entry.getValue());
            }
            jSONObject.accumulate(ExperimentsEntry.parameters, jSONObject2);
        }
        List<String> list = this.inProgress;
        if (list != null && !list.isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            Iterator<T> it = this.inProgress.iterator();
            while (it.hasNext()) {
                jSONArray.put((String) it.next());
            }
            jSONObject.accumulate(Metric.IN_PROGRESS_KEY, jSONArray);
        }
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString()");
        return string;
    }

    public final int getLevel() {
        return this.level;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Map<String, Object> getParameters() {
        return this.parameters;
    }

    public final long getSessionId() {
        return this.sessionId;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int iA = b.a(this.name, a.a(this.sessionId, Integer.hashCode(this.level) * 31, 31), 31);
        Map<String, Object> map = this.parameters;
        int iHashCode = (iA + (map == null ? 0 : map.hashCode())) * 31;
        List<String> list = this.inProgress;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n\t code: " + getCode() + "\n");
        stringBuffer.append("\t timestamp: " + this.timestamp + "\n");
        stringBuffer.append("\t level: " + this.level + "\n");
        stringBuffer.append("\t sessionId: " + this.sessionId + "\n");
        stringBuffer.append("\t name: " + this.name + "\n");
        Map<String, Object> map = this.parameters;
        if (map != null && !map.isEmpty()) {
            stringBuffer.append("\t parameters: \n");
            Map<String, Object> map2 = this.parameters;
            ArrayList arrayList = new ArrayList(map2.size());
            for (Map.Entry<String, Object> entry : map2.entrySet()) {
                if (entry.getKey().length() > 0) {
                    String key = entry.getKey();
                    stringBuffer.append("\t\tparameter key: " + ((Object) key) + " value: " + entry.getValue() + " \n");
                }
                arrayList.add(Unit.f312394a);
            }
        }
        List<String> list = this.inProgress;
        if (list != null && !list.isEmpty()) {
            stringBuffer.append("\t inProgress: " + this.inProgress + "\n");
        }
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "result.toString()");
        return string;
    }

    public /* synthetic */ CustomEvent(int i10, long j10, String str, Map map, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, j10, str, (i11 & 8) != 0 ? null : map, list);
    }
}
