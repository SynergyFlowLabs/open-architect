package com.devtodev.analytics.internal.domain.events.people;

import com.devtodev.analytics.internal.domain.events.IEncodable;
import com.devtodev.analytics.internal.storage.sqlite.ExperimentsEntry;
import com.devtodev.analytics.internal.storage.sqlite.UserEntry;
import com.devtodev.core.data.metrics.Metric;
import h4.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nPeopleEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PeopleEvent.kt\ncom/devtodev/analytics/internal/domain/events/people/People\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,85:1\n1855#2,2:86\n125#3:88\n152#3,3:89\n*S KotlinDebug\n*F\n+ 1 PeopleEvent.kt\ncom/devtodev/analytics/internal/domain/events/people/People\n*L\n49#1:86,2\n65#1:88\n65#1:89,3\n*E\n"})
public final class People implements IEncodable {

    @Nullable
    private final List<String> inProgress;
    private final long level;

    @Nullable
    private final Map<String, PeopleParameter> parameters;
    private final long sessionId;

    @NotNull
    private final String code = "pl";
    private final long timestamp = System.currentTimeMillis();

    public People(long j10, long j11, @Nullable Map<String, PeopleParameter> map, @Nullable List<String> list) {
        this.level = j10;
        this.sessionId = j11;
        this.parameters = map;
        this.inProgress = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ People copy$default(People people, long j10, long j11, Map map, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = people.level;
        }
        long j12 = j10;
        if ((i10 & 2) != 0) {
            j11 = people.sessionId;
        }
        long j13 = j11;
        if ((i10 & 4) != 0) {
            map = people.parameters;
        }
        Map map2 = map;
        if ((i10 & 8) != 0) {
            list = people.inProgress;
        }
        return people.copy(j12, j13, map2, list);
    }

    public final long component1() {
        return this.level;
    }

    public final long component2() {
        return this.sessionId;
    }

    @Nullable
    public final Map<String, PeopleParameter> component3() {
        return this.parameters;
    }

    @Nullable
    public final List<String> component4() {
        return this.inProgress;
    }

    @NotNull
    public final People copy(long j10, long j11, @Nullable Map<String, PeopleParameter> map, @Nullable List<String> list) {
        return new People(j10, j11, map, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof People)) {
            return false;
        }
        People people = (People) obj;
        return this.level == people.level && this.sessionId == people.sessionId && Intrinsics.areEqual(this.parameters, people.parameters) && Intrinsics.areEqual(this.inProgress, people.inProgress);
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
        jSONObject.accumulate("level", Long.valueOf(this.level));
        jSONObject.accumulate(UserEntry.sessionId, Long.valueOf(this.sessionId));
        Map<String, PeopleParameter> map = this.parameters;
        if (map == null) {
            jSONObject.accumulate(ExperimentsEntry.parameters, JSONObject.NULL);
        } else {
            jSONObject.accumulate(ExperimentsEntry.parameters, PeopleCardKt.jsonForSending(map));
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

    public final long getLevel() {
        return this.level;
    }

    @Nullable
    public final Map<String, PeopleParameter> getParameters() {
        return this.parameters;
    }

    public final long getSessionId() {
        return this.sessionId;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int iA = a.a(this.sessionId, Long.hashCode(this.level) * 31, 31);
        Map<String, PeopleParameter> map = this.parameters;
        boolean z10 = false;
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
        Map<String, PeopleParameter> map = this.parameters;
        if (map != null && !map.isEmpty()) {
            stringBuffer.append("\t parameters: \n");
            Map<String, PeopleParameter> map2 = this.parameters;
            ArrayList arrayList = new ArrayList(map2.size());
            for (Map.Entry<String, PeopleParameter> entry : map2.entrySet()) {
                String key = entry.getKey();
                arrayList.add("\t\tkey: " + ((Object) key) + " value: " + PeopleParameterKt.getValue(entry.getValue()));
            }
            stringBuffer.append(CollectionsKt.joinToString$default(arrayList, ",\n", null, null, 0, null, null, 62, null));
        }
        List<String> list = this.inProgress;
        if (list != null && !list.isEmpty()) {
            stringBuffer.append("\n\t inProgress: " + this.inProgress + "\n");
        }
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "result.toString()");
        return string;
    }
}
