package com.devtodev.analytics.internal.domain.events.people;

import com.devtodev.analytics.internal.domain.events.IEncodable;
import com.devtodev.analytics.internal.storage.sqlite.UserEntry;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class CheaterMark implements IEncodable {
    private final boolean cheater;
    private final int level;
    private final long sessionId;

    @NotNull
    private final String code = "ch";
    private final long timestamp = System.currentTimeMillis();

    public CheaterMark(long j10, int i10, boolean z10) {
        this.sessionId = j10;
        this.level = i10;
        this.cheater = z10;
    }

    public static /* synthetic */ CheaterMark copy$default(CheaterMark cheaterMark, long j10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j10 = cheaterMark.sessionId;
        }
        if ((i11 & 2) != 0) {
            i10 = cheaterMark.level;
        }
        if ((i11 & 4) != 0) {
            z10 = cheaterMark.cheater;
        }
        return cheaterMark.copy(j10, i10, z10);
    }

    public final long component1() {
        return this.sessionId;
    }

    public final int component2() {
        return this.level;
    }

    public final boolean component3() {
        return this.cheater;
    }

    @NotNull
    public final CheaterMark copy(long j10, int i10, boolean z10) {
        return new CheaterMark(j10, i10, z10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheaterMark)) {
            return false;
        }
        CheaterMark cheaterMark = (CheaterMark) obj;
        return this.sessionId == cheaterMark.sessionId && this.level == cheaterMark.level && this.cheater == cheaterMark.cheater;
    }

    public final boolean getCheater() {
        return this.cheater;
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
        jSONObject.accumulate("cheater", Boolean.valueOf(this.cheater));
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    public int hashCode() {
        int iHashCode = (Integer.hashCode(this.level) + (Long.hashCode(this.sessionId) * 31)) * 31;
        boolean z10 = this.cheater;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return iHashCode + r10;
    }

    @NotNull
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n\t code: " + getCode() + "\n");
        stringBuffer.append("\t timestamp: " + this.timestamp + "\n");
        stringBuffer.append("\t sessionId: " + this.sessionId + "\n");
        stringBuffer.append("\t level: " + this.level + "\n");
        stringBuffer.append("\t cheater: " + this.cheater + "\n");
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "result.toString()");
        return string;
    }
}
