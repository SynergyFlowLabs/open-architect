package com.devtodev.analytics.internal.domain.events.session;

import com.devtodev.analytics.internal.domain.events.IEncodable;
import com.devtodev.analytics.internal.storage.sqlite.UserEntry;
import com.devtodev.core.data.metrics.Metric;
import h4.a;
import io.sentry.n7;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nUserEngagement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserEngagement.kt\ncom/devtodev/analytics/internal/domain/events/session/UserEngagement\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,71:1\n1855#2,2:72\n*S KotlinDebug\n*F\n+ 1 UserEngagement.kt\ncom/devtodev/analytics/internal/domain/events/session/UserEngagement\n*L\n52#1:72,2\n*E\n"})
public final class UserEngagement implements IEncodable {

    @Nullable
    private final List<String> inProgress;
    private final long length;
    private final int level;
    private final long sessionId;

    @NotNull
    private final String code = "ue";
    private final long timestamp = System.currentTimeMillis();

    public UserEngagement(long j10, int i10, long j11, @Nullable List<String> list) {
        this.sessionId = j10;
        this.level = i10;
        this.length = j11;
        this.inProgress = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserEngagement copy$default(UserEngagement userEngagement, long j10, int i10, long j11, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j10 = userEngagement.sessionId;
        }
        long j12 = j10;
        if ((i11 & 2) != 0) {
            i10 = userEngagement.level;
        }
        int i12 = i10;
        if ((i11 & 4) != 0) {
            j11 = userEngagement.length;
        }
        long j13 = j11;
        if ((i11 & 8) != 0) {
            list = userEngagement.inProgress;
        }
        return userEngagement.copy(j12, i12, j13, list);
    }

    public final long component1() {
        return this.sessionId;
    }

    public final int component2() {
        return this.level;
    }

    public final long component3() {
        return this.length;
    }

    @Nullable
    public final List<String> component4() {
        return this.inProgress;
    }

    @NotNull
    public final UserEngagement copy(long j10, int i10, long j11, @Nullable List<String> list) {
        return new UserEngagement(j10, i10, j11, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserEngagement)) {
            return false;
        }
        UserEngagement userEngagement = (UserEngagement) obj;
        return this.sessionId == userEngagement.sessionId && this.level == userEngagement.level && this.length == userEngagement.length && Intrinsics.areEqual(this.inProgress, userEngagement.inProgress);
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
        jSONObject.accumulate(n7.b.f305917e, Long.valueOf(this.length));
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

    public final long getLength() {
        return this.length;
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
        int iA = a.a(this.length, (Integer.hashCode(this.level) + (Long.hashCode(this.sessionId) * 31)) * 31, 31);
        List<String> list = this.inProgress;
        return iA + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n\t code: " + getCode() + "\n");
        stringBuffer.append("\t timestamp: " + this.timestamp + "\n");
        stringBuffer.append("\t sessionId: " + this.sessionId + "\n");
        stringBuffer.append("\t level: " + this.level + "\n");
        stringBuffer.append("\t length: " + this.length + "\n");
        List<String> list = this.inProgress;
        if (list != null && !list.isEmpty()) {
            stringBuffer.append("\t inProgress: " + this.inProgress + "\n");
        }
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "result.toString()");
        return string;
    }
}
