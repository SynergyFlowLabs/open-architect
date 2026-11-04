package com.devtodev.analytics.internal.domain.events;

import com.devtodev.analytics.internal.storage.sqlite.UserEntry;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class Alive implements IEncodable {
    private final long sessionId;

    @NotNull
    private final String code = "al";
    private final long timestamp = System.currentTimeMillis();

    public Alive(long j10) {
        this.sessionId = j10;
    }

    public static /* synthetic */ Alive copy$default(Alive alive, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = alive.sessionId;
        }
        return alive.copy(j10);
    }

    public final long component1() {
        return this.sessionId;
    }

    @NotNull
    public final Alive copy(long j10) {
        return new Alive(j10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Alive) && this.sessionId == ((Alive) obj).sessionId;
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
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString()");
        return string;
    }

    public final long getSessionId() {
        return this.sessionId;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return Long.hashCode(this.sessionId);
    }

    @NotNull
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n\t code: " + getCode() + "\n");
        stringBuffer.append("\t timestamp: " + this.timestamp + "\n");
        stringBuffer.append("\t sessionId: " + this.sessionId + "\n");
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "result.toString()");
        return string;
    }
}
