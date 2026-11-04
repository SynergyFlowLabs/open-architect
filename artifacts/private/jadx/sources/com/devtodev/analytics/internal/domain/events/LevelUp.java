package com.devtodev.analytics.internal.domain.events;

import com.devtodev.analytics.internal.storage.sqlite.UserEntry;
import com.devtodev.core.data.metrics.Metric;
import h4.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nLevelUp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LevelUp.kt\ncom/devtodev/analytics/internal/domain/events/LevelUp\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,115:1\n1855#2,2:116\n125#3:118\n152#3,3:119\n125#3:122\n152#3,3:123\n125#3:126\n152#3,3:127\n125#3:130\n152#3,3:131\n*S KotlinDebug\n*F\n+ 1 LevelUp.kt\ncom/devtodev/analytics/internal/domain/events/LevelUp\n*L\n72#1:116,2\n88#1:118\n88#1:119,3\n94#1:122\n94#1:123,3\n101#1:126\n101#1:127,3\n107#1:130\n107#1:131,3\n*E\n"})
public final class LevelUp implements IEncodable {

    @Nullable
    private final Map<String, Long> balance;

    @Nullable
    private Map<String, Long> bought;

    @NotNull
    private final String code;

    @Nullable
    private Map<String, Long> earned;

    @Nullable
    private final List<String> inProgress;
    private final int level;
    private final long sessionId;

    @Nullable
    private Map<String, Long> spent;
    private final long timestamp;

    public LevelUp(int i10, long j10, @Nullable Map<String, Long> map, @Nullable Map<String, Long> map2, @Nullable Map<String, Long> map3, @Nullable Map<String, Long> map4, @Nullable List<String> list) {
        this.level = i10;
        this.sessionId = j10;
        this.balance = map;
        this.spent = map2;
        this.earned = map3;
        this.bought = map4;
        this.inProgress = list;
        this.code = LevelUpKt.LEVEL_UP_CODE;
        this.timestamp = System.currentTimeMillis();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LevelUp copy$default(LevelUp levelUp, int i10, long j10, Map map, Map map2, Map map3, Map map4, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = levelUp.level;
        }
        if ((i11 & 2) != 0) {
            j10 = levelUp.sessionId;
        }
        if ((i11 & 4) != 0) {
            map = levelUp.balance;
        }
        if ((i11 & 8) != 0) {
            map2 = levelUp.spent;
        }
        if ((i11 & 16) != 0) {
            map3 = levelUp.earned;
        }
        if ((i11 & 32) != 0) {
            map4 = levelUp.bought;
        }
        if ((i11 & 64) != 0) {
            list = levelUp.inProgress;
        }
        List list2 = list;
        Map map5 = map3;
        Map map6 = map;
        return levelUp.copy(i10, j10, map6, map2, map5, map4, list2);
    }

    public final int component1() {
        return this.level;
    }

    public final long component2() {
        return this.sessionId;
    }

    @Nullable
    public final Map<String, Long> component3() {
        return this.balance;
    }

    @Nullable
    public final Map<String, Long> component4() {
        return this.spent;
    }

    @Nullable
    public final Map<String, Long> component5() {
        return this.earned;
    }

    @Nullable
    public final Map<String, Long> component6() {
        return this.bought;
    }

    @Nullable
    public final List<String> component7() {
        return this.inProgress;
    }

    @NotNull
    public final LevelUp copy(int i10, long j10, @Nullable Map<String, Long> map, @Nullable Map<String, Long> map2, @Nullable Map<String, Long> map3, @Nullable Map<String, Long> map4, @Nullable List<String> list) {
        return new LevelUp(i10, j10, map, map2, map3, map4, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LevelUp)) {
            return false;
        }
        LevelUp levelUp = (LevelUp) obj;
        return this.level == levelUp.level && this.sessionId == levelUp.sessionId && Intrinsics.areEqual(this.balance, levelUp.balance) && Intrinsics.areEqual(this.spent, levelUp.spent) && Intrinsics.areEqual(this.earned, levelUp.earned) && Intrinsics.areEqual(this.bought, levelUp.bought) && Intrinsics.areEqual(this.inProgress, levelUp.inProgress);
    }

    @Nullable
    public final Map<String, Long> getBalance() {
        return this.balance;
    }

    @Nullable
    public final Map<String, Long> getBought() {
        return this.bought;
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

    @Nullable
    public final List<String> getInProgress() {
        return this.inProgress;
    }

    @Override // com.devtodev.analytics.internal.domain.events.IEncodable
    @NotNull
    public String getJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.accumulate("code", LevelUpKt.LEVEL_UP_CODE);
        jSONObject.accumulate("timestamp", Long.valueOf(this.timestamp));
        jSONObject.accumulate("level", Integer.valueOf(this.level));
        RecourcesKt.addToJson("balance", this.balance, jSONObject);
        RecourcesKt.addToJson("spent", this.spent, jSONObject);
        RecourcesKt.addToJson("earned", this.earned, jSONObject);
        RecourcesKt.addToJson("bought", this.bought, jSONObject);
        jSONObject.accumulate(UserEntry.sessionId, Long.valueOf(this.sessionId));
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
        int iA = a.a(this.sessionId, Integer.hashCode(this.level) * 31, 31);
        Map<String, Long> map = this.balance;
        int iHashCode = 0;
        int iHashCode2 = (iA + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, Long> map2 = this.spent;
        int iHashCode3 = (iHashCode2 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, Long> map3 = this.earned;
        int iHashCode4 = (iHashCode3 + (map3 == null ? 0 : map3.hashCode())) * 31;
        Map<String, Long> map4 = this.bought;
        int iHashCode5 = (iHashCode4 + (map4 == null ? 0 : map4.hashCode())) * 31;
        List<String> list = this.inProgress;
        if (list != null) {
            iHashCode = list.hashCode();
        }
        return iHashCode5 + iHashCode;
    }

    public final void setBought(@Nullable Map<String, Long> map) {
        this.bought = map;
    }

    public final void setEarned(@Nullable Map<String, Long> map) {
        this.earned = map;
    }

    public final void setSpent(@Nullable Map<String, Long> map) {
        this.spent = map;
    }

    @NotNull
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n\t code: " + getCode() + "\n");
        stringBuffer.append("\t timestamp: " + this.timestamp + "\n");
        stringBuffer.append("\t level: " + this.level + "\n");
        stringBuffer.append("\t sessionId: " + this.sessionId + "\n");
        Map<String, Long> map = this.balance;
        if (map != null && !map.isEmpty()) {
            stringBuffer.append("\t balance: \n");
            Map<String, Long> map2 = this.balance;
            ArrayList arrayList = new ArrayList(map2.size());
            for (Map.Entry<String, Long> entry : map2.entrySet()) {
                String key = entry.getKey();
                stringBuffer.append("\t\tresource: " + ((Object) key) + " amount: " + entry.getValue() + " \n");
                arrayList.add(stringBuffer);
            }
        }
        Map<String, Long> map3 = this.spent;
        if (map3 != null && !map3.isEmpty()) {
            stringBuffer.append("\t spent: \n");
            ArrayList arrayList2 = new ArrayList(map3.size());
            for (Map.Entry<String, Long> entry2 : map3.entrySet()) {
                String key2 = entry2.getKey();
                stringBuffer.append("\t\tresource: " + ((Object) key2) + " amount: " + entry2.getValue() + " \n");
                arrayList2.add(stringBuffer);
            }
        }
        Map<String, Long> map4 = this.earned;
        if (map4 != null && !map4.isEmpty()) {
            stringBuffer.append("\t earned: \n");
            ArrayList arrayList3 = new ArrayList(map4.size());
            for (Map.Entry<String, Long> entry3 : map4.entrySet()) {
                String key3 = entry3.getKey();
                stringBuffer.append("\t\tresource: " + ((Object) key3) + " amount: " + entry3.getValue() + " \n");
                arrayList3.add(stringBuffer);
            }
        }
        Map<String, Long> map5 = this.bought;
        if (map5 != null && !map5.isEmpty()) {
            stringBuffer.append("\t bought: \n");
            ArrayList arrayList4 = new ArrayList(map5.size());
            for (Map.Entry<String, Long> entry4 : map5.entrySet()) {
                String key4 = entry4.getKey();
                stringBuffer.append("\t\tresource: " + ((Object) key4) + " amount: " + entry4.getValue() + " \n");
                arrayList4.add(stringBuffer);
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

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LevelUp(int i10, long j10, Map map, Map map2, Map map3, Map map4, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, j10, (i11 & 4) != 0 ? null : map, (i11 & 8) != 0 ? null : map2, (i11 & 16) != 0 ? null : map3, (i11 & 32) != 0 ? null : map4, (i11 & 64) != 0 ? null : list);
        boolean z10 = false | false;
    }
}
