package com.devtodev.analytics.internal.domain.events.tutorial;

import com.devtodev.analytics.internal.domain.events.IEncodable;
import com.devtodev.analytics.internal.storage.sqlite.TutorialMarkEntry;
import com.devtodev.analytics.internal.storage.sqlite.UserEntry;
import com.devtodev.core.data.metrics.Metric;
import h4.a;
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
@SourceDebugExtension({"SMAP\nTutorial.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tutorial.kt\ncom/devtodev/analytics/internal/domain/events/tutorial/Tutorial\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,71:1\n1855#2,2:72\n*S KotlinDebug\n*F\n+ 1 Tutorial.kt\ncom/devtodev/analytics/internal/domain/events/tutorial/Tutorial\n*L\n52#1:72,2\n*E\n"})
public final class Tutorial implements IEncodable {

    @Nullable
    private final List<String> inProgress;
    private final int level;
    private final long sessionId;
    private final int step;

    @NotNull
    private final String code = "tr";
    private final long timestamp = System.currentTimeMillis();

    public Tutorial(int i10, long j10, int i11, @Nullable List<String> list) {
        this.level = i10;
        this.sessionId = j10;
        this.step = i11;
        this.inProgress = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Tutorial copy$default(Tutorial tutorial, int i10, long j10, int i11, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = tutorial.level;
        }
        if ((i12 & 2) != 0) {
            j10 = tutorial.sessionId;
        }
        if ((i12 & 4) != 0) {
            i11 = tutorial.step;
        }
        if ((i12 & 8) != 0) {
            list = tutorial.inProgress;
        }
        return tutorial.copy(i10, j10, i11, list);
    }

    public final int component1() {
        return this.level;
    }

    public final long component2() {
        return this.sessionId;
    }

    public final int component3() {
        return this.step;
    }

    @Nullable
    public final List<String> component4() {
        return this.inProgress;
    }

    @NotNull
    public final Tutorial copy(int i10, long j10, int i11, @Nullable List<String> list) {
        return new Tutorial(i10, j10, i11, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Tutorial)) {
            return false;
        }
        Tutorial tutorial = (Tutorial) obj;
        return this.level == tutorial.level && this.sessionId == tutorial.sessionId && this.step == tutorial.step && Intrinsics.areEqual(this.inProgress, tutorial.inProgress);
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
        jSONObject.accumulate("level", Integer.valueOf(this.level));
        jSONObject.accumulate(UserEntry.sessionId, Long.valueOf(this.sessionId));
        jSONObject.accumulate(TutorialMarkEntry.step, Integer.valueOf(this.step));
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

    public final int getStep() {
        return this.step;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int iHashCode = (Integer.hashCode(this.step) + a.a(this.sessionId, Integer.hashCode(this.level) * 31, 31)) * 31;
        List<String> list = this.inProgress;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n\t code: " + getCode() + "\n");
        stringBuffer.append("\t timestamp: " + this.timestamp + "\n");
        stringBuffer.append("\t level: " + this.level + "\n");
        stringBuffer.append("\t sessionId: " + this.sessionId + "\n");
        stringBuffer.append("\t step: " + this.step + "\n");
        List<String> list = this.inProgress;
        if (list != null && !list.isEmpty()) {
            stringBuffer.append("\t inProgress: " + this.inProgress + "\n");
        }
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "result.toString()");
        return string;
    }
}
