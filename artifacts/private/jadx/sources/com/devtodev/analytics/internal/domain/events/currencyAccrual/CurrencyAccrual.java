package com.devtodev.analytics.internal.domain.events.currencyAccrual;

import com.devtodev.analytics.internal.domain.events.IEncodable;
import com.devtodev.analytics.internal.domain.events.RecourcesKt;
import com.devtodev.analytics.internal.storage.sqlite.UserEntry;
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
@SourceDebugExtension({"SMAP\nCurrencyAccrual.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CurrencyAccrual.kt\ncom/devtodev/analytics/internal/domain/events/currencyAccrual/CurrencyAccrual\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,107:1\n125#2:108\n152#2,2:109\n125#2:111\n152#2,3:112\n154#2:115\n*S KotlinDebug\n*F\n+ 1 CurrencyAccrual.kt\ncom/devtodev/analytics/internal/domain/events/currencyAccrual/CurrencyAccrual\n*L\n101#1:108\n101#1:109,2\n103#1:111\n103#1:112,3\n101#1:115\n*E\n"})
public final class CurrencyAccrual implements IEncodable {

    @Nullable
    private final Map<String, Map<String, Long>> bought;

    @NotNull
    private final String code;

    @Nullable
    private final Map<String, Map<String, Long>> earned;
    private final int level;
    private final long sessionId;
    private long timestamp;

    /* JADX WARN: Multi-variable type inference failed */
    public CurrencyAccrual(int i10, @Nullable Map<String, ? extends Map<String, Long>> map, @Nullable Map<String, ? extends Map<String, Long>> map2, long j10) {
        this.level = i10;
        this.bought = map;
        this.earned = map2;
        this.sessionId = j10;
        this.code = "ca";
        this.timestamp = System.currentTimeMillis();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CurrencyAccrual copy$default(CurrencyAccrual currencyAccrual, int i10, Map map, Map map2, long j10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = currencyAccrual.level;
        }
        if ((i11 & 2) != 0) {
            map = currencyAccrual.bought;
        }
        if ((i11 & 4) != 0) {
            map2 = currencyAccrual.earned;
        }
        if ((i11 & 8) != 0) {
            j10 = currencyAccrual.sessionId;
        }
        Map map3 = map2;
        return currencyAccrual.copy(i10, map, map3, j10);
    }

    private final void prepareString(Map<String, ? extends Map<String, Long>> map, StringBuffer stringBuffer) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, ? extends Map<String, Long>> entry : map.entrySet()) {
            stringBuffer.append("\t\tsource: " + ((Object) entry.getKey()) + " \n\t\tresources:\n");
            Map<String, Long> value = entry.getValue();
            ArrayList arrayList2 = new ArrayList(value.size());
            for (Map.Entry<String, Long> entry2 : value.entrySet()) {
                String key = entry2.getKey();
                stringBuffer.append("\t\t\tresource: " + ((Object) key) + " amount: " + entry2.getValue() + " \n");
                arrayList2.add(stringBuffer);
            }
            arrayList.add(arrayList2);
        }
    }

    public final int component1() {
        return this.level;
    }

    @Nullable
    public final Map<String, Map<String, Long>> component2() {
        return this.bought;
    }

    @Nullable
    public final Map<String, Map<String, Long>> component3() {
        return this.earned;
    }

    public final long component4() {
        return this.sessionId;
    }

    @NotNull
    public final CurrencyAccrual copy(int i10, @Nullable Map<String, ? extends Map<String, Long>> map, @Nullable Map<String, ? extends Map<String, Long>> map2, long j10) {
        return new CurrencyAccrual(i10, map, map2, j10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CurrencyAccrual)) {
            return false;
        }
        CurrencyAccrual currencyAccrual = (CurrencyAccrual) obj;
        return this.level == currencyAccrual.level && Intrinsics.areEqual(this.bought, currencyAccrual.bought) && Intrinsics.areEqual(this.earned, currencyAccrual.earned) && this.sessionId == currencyAccrual.sessionId;
    }

    @Nullable
    public final Map<String, Map<String, Long>> getBought() {
        return this.bought;
    }

    @Override // com.devtodev.analytics.internal.domain.events.IEncodable
    @NotNull
    public String getCode() {
        return this.code;
    }

    @Nullable
    public final Map<String, Map<String, Long>> getEarned() {
        return this.earned;
    }

    @Override // com.devtodev.analytics.internal.domain.events.IEncodable
    @NotNull
    public String getJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.accumulate("code", getCode());
        jSONObject.accumulate("timestamp", Long.valueOf(this.timestamp));
        jSONObject.accumulate("level", Integer.valueOf(this.level));
        Map<String, Map<String, Long>> map = this.bought;
        if (map != null && !map.isEmpty()) {
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry<String, Map<String, Long>> entry : this.bought.entrySet()) {
                jSONObject2.accumulate(entry.getKey(), RecourcesKt.getJson(entry.getValue()));
            }
            jSONObject.accumulate("bought", jSONObject2);
        }
        Map<String, Map<String, Long>> map2 = this.earned;
        if (map2 != null && !map2.isEmpty()) {
            JSONObject jSONObject3 = new JSONObject();
            for (Map.Entry<String, Map<String, Long>> entry2 : this.earned.entrySet()) {
                jSONObject3.accumulate(entry2.getKey(), RecourcesKt.getJson(entry2.getValue()));
            }
            jSONObject.accumulate("earned", jSONObject3);
        }
        jSONObject.accumulate(UserEntry.sessionId, Long.valueOf(this.sessionId));
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

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.level) * 31;
        Map<String, Map<String, Long>> map = this.bought;
        int iHashCode2 = 0;
        int iHashCode3 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, Map<String, Long>> map2 = this.earned;
        if (map2 != null) {
            iHashCode2 = map2.hashCode();
        }
        return Long.hashCode(this.sessionId) + ((iHashCode3 + iHashCode2) * 31);
    }

    public final void setTimestamp(long j10) {
        this.timestamp = j10;
    }

    @NotNull
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n\t code: " + getCode() + "\n");
        stringBuffer.append("\t timestamp: " + this.timestamp + "\n");
        stringBuffer.append("\t level: " + this.level + "\n");
        stringBuffer.append("\t sessionId: " + this.sessionId + "\n");
        Map<String, Map<String, Long>> map = this.bought;
        if (map != null && !map.isEmpty()) {
            stringBuffer.append("\t bought: \n");
            prepareString(this.bought, stringBuffer);
        }
        Map<String, Map<String, Long>> map2 = this.earned;
        if (map2 != null && !map2.isEmpty()) {
            stringBuffer.append("\t earned: \n");
            prepareString(this.earned, stringBuffer);
        }
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "result.toString()");
        return string;
    }

    public /* synthetic */ CurrencyAccrual(int i10, Map map, Map map2, long j10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i11 & 2) != 0 ? null : map, (i11 & 4) != 0 ? null : map2, j10);
    }
}
