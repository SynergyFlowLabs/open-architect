package com.devtodev.analytics.internal.domain.events;

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
@SourceDebugExtension({"SMAP\nCurrentBalance.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CurrentBalance.kt\ncom/devtodev/analytics/internal/domain/events/CurrentBalance\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,60:1\n125#2:61\n152#2,3:62\n*S KotlinDebug\n*F\n+ 1 CurrentBalance.kt\ncom/devtodev/analytics/internal/domain/events/CurrentBalance\n*L\n56#1:61\n56#1:62,3\n*E\n"})
public final class CurrentBalance implements IEncodable {

    @Nullable
    private final Map<String, Long> balance;

    @NotNull
    private final String code;
    private final int level;
    private final long sessionId;
    private final long timestamp;

    public CurrentBalance(long j10, @Nullable Map<String, Long> map, int i10) {
        this.sessionId = j10;
        this.balance = map;
        this.level = i10;
        this.code = CurrentBalanceKt.CURRENT_BALANCE;
        this.timestamp = System.currentTimeMillis();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CurrentBalance copy$default(CurrentBalance currentBalance, long j10, Map map, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j10 = currentBalance.sessionId;
        }
        if ((i11 & 2) != 0) {
            map = currentBalance.balance;
        }
        if ((i11 & 4) != 0) {
            i10 = currentBalance.level;
        }
        return currentBalance.copy(j10, map, i10);
    }

    public final long component1() {
        return this.sessionId;
    }

    @Nullable
    public final Map<String, Long> component2() {
        return this.balance;
    }

    public final int component3() {
        return this.level;
    }

    @NotNull
    public final CurrentBalance copy(long j10, @Nullable Map<String, Long> map, int i10) {
        return new CurrentBalance(j10, map, i10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CurrentBalance)) {
            return false;
        }
        CurrentBalance currentBalance = (CurrentBalance) obj;
        if (this.sessionId == currentBalance.sessionId && Intrinsics.areEqual(this.balance, currentBalance.balance) && this.level == currentBalance.level) {
            return true;
        }
        return false;
    }

    @Nullable
    public final Map<String, Long> getBalance() {
        return this.balance;
    }

    @Override // com.devtodev.analytics.internal.domain.events.IEncodable
    @NotNull
    public String getCode() {
        return this.code;
    }

    @Override // com.devtodev.analytics.internal.domain.events.IEncodable
    @NotNull
    public String getJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.accumulate("code", getCode());
        jSONObject.accumulate("timestamp", Long.valueOf(this.timestamp));
        jSONObject.accumulate(UserEntry.sessionId, Long.valueOf(this.sessionId));
        jSONObject.accumulate("level", Integer.valueOf(this.level));
        RecourcesKt.addToJson("balance", this.balance, jSONObject);
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
        int iHashCode = Long.hashCode(this.sessionId) * 31;
        Map<String, Long> map = this.balance;
        return Integer.hashCode(this.level) + ((iHashCode + (map == null ? 0 : map.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n\t code: " + getCode() + "\n");
        stringBuffer.append("\t timestamp: " + this.timestamp + "\n");
        stringBuffer.append("\t sessionId: " + this.sessionId + "\n");
        stringBuffer.append("\t level: " + this.level + "\n");
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
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "result.toString()");
        return string;
    }

    public /* synthetic */ CurrentBalance(long j10, Map map, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, (i11 & 2) != 0 ? null : map, i10);
    }
}
