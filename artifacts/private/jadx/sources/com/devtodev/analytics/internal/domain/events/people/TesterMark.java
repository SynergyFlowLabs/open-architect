package com.devtodev.analytics.internal.domain.events.people;

import com.devtodev.analytics.internal.domain.events.IEncodable;
import com.devtodev.analytics.internal.storage.sqlite.UserEntry;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class TesterMark implements IEncodable {
    private final int level;
    private final long sessionId;
    private final boolean tester;

    @NotNull
    private final String code = TesterMarkKt.TESTER_CODE;
    private final long timestamp = System.currentTimeMillis();

    public TesterMark(long j10, int i10, boolean z10) {
        this.sessionId = j10;
        this.level = i10;
        this.tester = z10;
    }

    public static /* synthetic */ TesterMark copy$default(TesterMark testerMark, long j10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j10 = testerMark.sessionId;
        }
        if ((i11 & 2) != 0) {
            i10 = testerMark.level;
        }
        if ((i11 & 4) != 0) {
            z10 = testerMark.tester;
        }
        return testerMark.copy(j10, i10, z10);
    }

    public final long component1() {
        return this.sessionId;
    }

    public final int component2() {
        return this.level;
    }

    public final boolean component3() {
        return this.tester;
    }

    @NotNull
    public final TesterMark copy(long j10, int i10, boolean z10) {
        return new TesterMark(j10, i10, z10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TesterMark)) {
            return false;
        }
        TesterMark testerMark = (TesterMark) obj;
        return this.sessionId == testerMark.sessionId && this.level == testerMark.level && this.tester == testerMark.tester;
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
        jSONObject.accumulate("tester", Boolean.valueOf(this.tester));
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

    public final boolean getTester() {
        return this.tester;
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
        boolean z10 = this.tester;
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
        stringBuffer.append("\t tester: " + this.tester + "\n");
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "result.toString()");
        return string;
    }
}
