package com.devtodev.analytics.internal.domain.events.session;

import com.devtodev.analytics.internal.domain.events.IEncodable;
import com.devtodev.analytics.internal.storage.sqlite.UserEntry;
import com.devtodev.core.data.metrics.Metric;
import h4.a;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSessionStart.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SessionStart.kt\ncom/devtodev/analytics/internal/domain/events/session/SessionStart\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,66:1\n1855#2,2:67\n*S KotlinDebug\n*F\n+ 1 SessionStart.kt\ncom/devtodev/analytics/internal/domain/events/session/SessionStart\n*L\n48#1:67,2\n*E\n"})
public final class SessionStart implements IEncodable {

    @NotNull
    private final String code;

    @Nullable
    private final List<String> inProgress;
    private final int level;
    private final long sessionId;
    private final long timestamp;

    public SessionStart(long j10, long j11, int i10, @Nullable List<String> list) {
        this.timestamp = j10;
        this.sessionId = j11;
        this.level = i10;
        this.inProgress = list;
        this.code = "ss";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SessionStart copy$default(SessionStart sessionStart, long j10, long j11, int i10, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j10 = sessionStart.timestamp;
        }
        long j12 = j10;
        if ((i11 & 2) != 0) {
            j11 = sessionStart.sessionId;
        }
        long j13 = j11;
        if ((i11 & 4) != 0) {
            i10 = sessionStart.level;
        }
        int i12 = i10;
        if ((i11 & 8) != 0) {
            list = sessionStart.inProgress;
        }
        return sessionStart.copy(j12, j13, i12, list);
    }

    public final long component1() {
        return this.timestamp;
    }

    public final long component2() {
        return this.sessionId;
    }

    public final int component3() {
        return this.level;
    }

    @Nullable
    public final List<String> component4() {
        return this.inProgress;
    }

    @NotNull
    public final SessionStart copy(long j10, long j11, int i10, @Nullable List<String> list) {
        return new SessionStart(j10, j11, i10, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionStart)) {
            return false;
        }
        SessionStart sessionStart = (SessionStart) obj;
        return this.timestamp == sessionStart.timestamp && this.sessionId == sessionStart.sessionId && this.level == sessionStart.level && Intrinsics.areEqual(this.inProgress, sessionStart.inProgress);
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
        jSONObject.accumulate(UserEntry.sessionId, Long.valueOf(this.sessionId));
        jSONObject.accumulate("level", Integer.valueOf(this.level));
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

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int iHashCode = (Integer.hashCode(this.level) + a.a(this.sessionId, Long.hashCode(this.timestamp) * 31, 31)) * 31;
        List<String> list = this.inProgress;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n\t code: " + getCode() + "\n");
        stringBuffer.append("\t timestamp: " + this.timestamp + "\n");
        stringBuffer.append("\t sessionId: " + this.sessionId + "\n");
        stringBuffer.append("\t level: " + this.level + "\n");
        List<String> list = this.inProgress;
        if (list != null && !list.isEmpty()) {
            stringBuffer.append("\t inProgress: " + this.inProgress + "\n");
        }
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "result.toString()");
        return string;
    }

    public /* synthetic */ SessionStart(long j10, long j11, int i10, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? System.currentTimeMillis() : j10, j11, i10, list);
    }
}
