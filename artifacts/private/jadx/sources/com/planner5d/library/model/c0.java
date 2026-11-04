package com.planner5d.library.model;

import android.os.Build;
import android.os.SystemClock;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.services.utility.k1;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nUnlockedItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnlockedItem.kt\ncom/planner5d/library/model/UnlockedItem\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,48:1\n1#2:49\n*E\n"})
public final class c0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f180561f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f180562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Date f180563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final Long f180564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final Long f180565d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f180566e;

    public c0(@NotNull String id2, @NotNull Date startByWallClock, @Nullable Long l10, @Nullable Long l11, long j10) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(startByWallClock, "startByWallClock");
        this.f180562a = id2;
        this.f180563b = startByWallClock;
        this.f180564c = l10;
        this.f180565d = l11;
        this.f180566e = j10;
    }

    private final Date b() {
        return this.f180563b;
    }

    private final Long c() {
        return this.f180564c;
    }

    private final Long d() {
        return this.f180565d;
    }

    private final long e() {
        return this.f180566e;
    }

    public static /* synthetic */ c0 g(c0 c0Var, String str, Date date, Long l10, Long l11, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = c0Var.f180562a;
        }
        if ((i10 & 2) != 0) {
            date = c0Var.f180563b;
        }
        if ((i10 & 4) != 0) {
            l10 = c0Var.f180564c;
        }
        if ((i10 & 8) != 0) {
            l11 = c0Var.f180565d;
        }
        if ((i10 & 16) != 0) {
            j10 = c0Var.f180566e;
        }
        long j11 = j10;
        return c0Var.f(str, date, l10, l11, j11);
    }

    @NotNull
    public final String a() {
        return this.f180562a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return Intrinsics.areEqual(this.f180562a, c0Var.f180562a) && Intrinsics.areEqual(this.f180563b, c0Var.f180563b) && Intrinsics.areEqual(this.f180564c, c0Var.f180564c) && Intrinsics.areEqual(this.f180565d, c0Var.f180565d) && this.f180566e == c0Var.f180566e;
    }

    @NotNull
    public final c0 f(@NotNull String id2, @NotNull Date startByWallClock, @Nullable Long l10, @Nullable Long l11, long j10) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(startByWallClock, "startByWallClock");
        return new c0(id2, startByWallClock, l10, l11, j10);
    }

    @NotNull
    public final String h() {
        return this.f180562a;
    }

    public int hashCode() {
        int iHashCode = ((this.f180562a.hashCode() * 31) + this.f180563b.hashCode()) * 31;
        Long l10 = this.f180564c;
        int i10 = 4 << 0;
        int iHashCode2 = (iHashCode + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.f180565d;
        return ((iHashCode2 + (l11 != null ? l11.hashCode() : 0)) * 31) + Long.hashCode(this.f180566e);
    }

    public final boolean i() {
        Long l10;
        if (Build.VERSION.SDK_INT >= 33 && (l10 = this.f180565d) != null) {
            long jLongValue = l10.longValue() + this.f180566e;
            long jMillis = SystemClock.currentNetworkTimeClock().millis();
            return l10.longValue() <= jMillis && jMillis <= jLongValue;
        }
        if (this.f180564c != null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f180564c.longValue() < jElapsedRealtime) {
                Long l11 = this.f180564c;
                return jElapsedRealtime <= l11.longValue() + this.f180566e && l11.longValue() <= jElapsedRealtime;
            }
        }
        long time = this.f180563b.getTime();
        long time2 = this.f180563b.getTime() + this.f180566e;
        long time3 = new Date().getTime();
        return time <= time3 && time3 <= time2;
    }

    @NotNull
    public final JSONObject j() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(com.planner5d.library.services.r.id.f224891a, this.f180562a);
        jSONObject.put(com.planner5d.library.services.r.start.f224891a, this.f180563b.getTime());
        Long l10 = this.f180564c;
        if (l10 != null) {
            jSONObject.put(com.planner5d.library.services.r.startUptime.f224891a, l10.longValue());
        }
        Long l11 = this.f180565d;
        if (l11 != null) {
            jSONObject.put(com.planner5d.library.services.r.startNettime.f224891a, l11.longValue());
        }
        jSONObject.put(com.planner5d.library.services.r.length.f224891a, this.f180566e);
        return jSONObject;
    }

    @NotNull
    public String toString() {
        return "UnlockedItem(id=" + this.f180562a + ", startByWallClock=" + this.f180563b + ", startByElapsedRealtimeMillis=" + this.f180564c + ", startByNetworkTimeMillis=" + this.f180565d + ", duration=" + this.f180566e + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c0(@NotNull JSONObject json) throws JSONException {
        Intrinsics.checkNotNullParameter(json, "json");
        String string = json.getString(com.planner5d.library.services.r.id.f224891a);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this(string, new Date(json.getLong(com.planner5d.library.services.r.start.f224891a)), k1.v(json, com.planner5d.library.services.r.startUptime), k1.v(json, com.planner5d.library.services.r.startNettime), json.getLong(com.planner5d.library.services.r.length.f224891a));
    }
}
