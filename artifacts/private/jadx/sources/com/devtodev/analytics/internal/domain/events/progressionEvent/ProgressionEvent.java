package com.devtodev.analytics.internal.domain.events.progressionEvent;

import com.devtodev.analytics.internal.domain.events.IEncodable;
import com.devtodev.analytics.internal.domain.events.RecourcesKt;
import com.devtodev.analytics.internal.storage.sqlite.ExperimentsEntry;
import com.devtodev.analytics.internal.storage.sqlite.UserEntry;
import h4.b;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nProgressionEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProgressionEvent.kt\ncom/devtodev/analytics/internal/domain/events/progressionEvent/ProgressionEvent\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,141:1\n125#2:142\n152#2,3:143\n125#2:146\n152#2,3:147\n*S KotlinDebug\n*F\n+ 1 ProgressionEvent.kt\ncom/devtodev/analytics/internal/domain/events/progressionEvent/ProgressionEvent\n*L\n110#1:142\n110#1:143,3\n114#1:146\n114#1:147,3\n*E\n"})
public final class ProgressionEvent implements IEncodable {

    @NotNull
    private final String code;

    @Nullable
    private final Map<String, Long> earned;
    private final int level;

    @NotNull
    private final String name;

    @NotNull
    private final ProgressionParameter parameters;
    private final long sessionId;

    @Nullable
    private final Map<String, Long> spent;
    private final long timestamp;

    public ProgressionEvent(long j10, int i10, @NotNull String name, @NotNull ProgressionParameter parameters, @Nullable Map<String, Long> map, @Nullable Map<String, Long> map2) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.sessionId = j10;
        this.level = i10;
        this.name = name;
        this.parameters = parameters;
        this.spent = map;
        this.earned = map2;
        this.code = "pe";
        this.timestamp = System.currentTimeMillis();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProgressionEvent copy$default(ProgressionEvent progressionEvent, long j10, int i10, String str, ProgressionParameter progressionParameter, Map map, Map map2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j10 = progressionEvent.sessionId;
        }
        long j11 = j10;
        if ((i11 & 2) != 0) {
            i10 = progressionEvent.level;
        }
        int i12 = i10;
        if ((i11 & 4) != 0) {
            str = progressionEvent.name;
        }
        String str2 = str;
        if ((i11 & 8) != 0) {
            progressionParameter = progressionEvent.parameters;
        }
        ProgressionParameter progressionParameter2 = progressionParameter;
        if ((i11 & 16) != 0) {
            map = progressionEvent.spent;
        }
        Map map3 = map;
        if ((i11 & 32) != 0) {
            map2 = progressionEvent.earned;
        }
        return progressionEvent.copy(j11, i12, str2, progressionParameter2, map3, map2);
    }

    public final long component1() {
        return this.sessionId;
    }

    public final int component2() {
        return this.level;
    }

    @NotNull
    public final String component3() {
        return this.name;
    }

    @NotNull
    public final ProgressionParameter component4() {
        return this.parameters;
    }

    @Nullable
    public final Map<String, Long> component5() {
        return this.spent;
    }

    @Nullable
    public final Map<String, Long> component6() {
        return this.earned;
    }

    @NotNull
    public final ProgressionEvent copy(long j10, int i10, @NotNull String name, @NotNull ProgressionParameter parameters, @Nullable Map<String, Long> map, @Nullable Map<String, Long> map2) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        return new ProgressionEvent(j10, i10, name, parameters, map, map2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProgressionEvent)) {
            return false;
        }
        ProgressionEvent progressionEvent = (ProgressionEvent) obj;
        return this.sessionId == progressionEvent.sessionId && this.level == progressionEvent.level && Intrinsics.areEqual(this.name, progressionEvent.name) && Intrinsics.areEqual(this.parameters, progressionEvent.parameters) && Intrinsics.areEqual(this.spent, progressionEvent.spent) && Intrinsics.areEqual(this.earned, progressionEvent.earned);
    }

    @Override // com.devtodev.analytics.internal.domain.events.IEncodable
    @NotNull
    public String getCode() {
        return this.code;
    }

    @Nullable
    public final Map<String, Long> getEarned() {
        return this.earned;
    }

    @Override // com.devtodev.analytics.internal.domain.events.IEncodable
    @NotNull
    public String getJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.accumulate("code", "pe");
        jSONObject.accumulate("timestamp", Long.valueOf(this.timestamp));
        jSONObject.accumulate(UserEntry.sessionId, Long.valueOf(this.sessionId));
        jSONObject.accumulate("level", Integer.valueOf(this.level));
        jSONObject.accumulate("name", this.name);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.accumulate("success", Boolean.valueOf(this.parameters.getSuccess()));
        jSONObject2.accumulate("source", this.parameters.getSource());
        jSONObject2.accumulate(ProgressionEventKt.LOCATION_DIFFICULTY_KEY, this.parameters.getDifficulty());
        if (this.parameters.getDuration() != null) {
            jSONObject2.accumulate("duration", this.parameters.getDuration());
        }
        jSONObject.accumulate(ExperimentsEntry.parameters, jSONObject2);
        RecourcesKt.addToJson("spent", this.spent, jSONObject);
        RecourcesKt.addToJson("earned", this.earned, jSONObject);
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

    @NotNull
    public final ProgressionParameter getParameters() {
        return this.parameters;
    }

    public final long getSessionId() {
        return this.sessionId;
    }

    @Nullable
    public final Map<String, Long> getSpent() {
        return this.spent;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int iHashCode = (this.parameters.hashCode() + b.a(this.name, (Integer.hashCode(this.level) + (Long.hashCode(this.sessionId) * 31)) * 31, 31)) * 31;
        Map<String, Long> map = this.spent;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, Long> map2 = this.earned;
        return iHashCode2 + (map2 != null ? map2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n\t code: " + getCode() + "\n");
        stringBuffer.append("\t timestamp: " + this.timestamp + "\n");
        stringBuffer.append("\t sessionId: " + this.sessionId + "\n");
        stringBuffer.append("\t level: " + this.level + "\n");
        stringBuffer.append("\t name: " + this.name + "\n");
        Map<String, Long> map = this.spent;
        if (map != null && !map.isEmpty()) {
            stringBuffer.append("\t spent: \n");
            Map<String, Long> map2 = this.spent;
            ArrayList arrayList = new ArrayList(map2.size());
            for (Map.Entry<String, Long> entry : map2.entrySet()) {
                String key = entry.getKey();
                stringBuffer.append("\t\tresource: " + ((Object) key) + " amount: " + entry.getValue() + " \n");
                arrayList.add(stringBuffer);
            }
        }
        Map<String, Long> map3 = this.earned;
        if (map3 != null && !map3.isEmpty()) {
            stringBuffer.append("\t earned: \n");
            Map<String, Long> map4 = this.earned;
            ArrayList arrayList2 = new ArrayList(map4.size());
            for (Map.Entry<String, Long> entry2 : map4.entrySet()) {
                String key2 = entry2.getKey();
                stringBuffer.append("\t\tresource: " + ((Object) key2) + " amount: " + entry2.getValue() + " \n");
                arrayList2.add(stringBuffer);
            }
        }
        stringBuffer.append("\t parameters:\n");
        stringBuffer.append("\t\tsuccess: " + this.parameters.getSuccess() + " \n");
        Integer duration = this.parameters.getDuration();
        if (duration != null) {
            stringBuffer.append("\t\tduration: " + duration.intValue() + " \n");
        }
        if (this.parameters.getDifficulty() != null) {
            stringBuffer.append("\t\tdifficulty: " + this.parameters.getDifficulty() + " \n");
        }
        if (this.parameters.getSource() != null) {
            stringBuffer.append("\t\tsource: " + this.parameters.getSource() + " \n");
        }
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "result.toString()");
        return string;
    }

    public /* synthetic */ ProgressionEvent(long j10, int i10, String str, ProgressionParameter progressionParameter, Map map, Map map2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, i10, str, progressionParameter, (i11 & 16) != 0 ? null : map, (i11 & 32) != 0 ? null : map2);
    }
}
