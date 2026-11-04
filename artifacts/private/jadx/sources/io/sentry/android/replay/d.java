package io.sentry.android.replay;

import androidx.compose.runtime.internal.w0;
import io.sentry.o8;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@w0(parameters = 0)
public final class d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f304885i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final w f304886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final j f304887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Date f304888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f304889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f304890e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final o8.c f304891f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private final String f304892g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final List<io.sentry.rrweb.b> f304893h;

    /* JADX WARN: Multi-variable type inference failed */
    public d(@NotNull w recorderConfig, @NotNull j cache, @NotNull Date timestamp, int i10, long j10, @NotNull o8.c replayType, @Nullable String str, @NotNull List<? extends io.sentry.rrweb.b> events) {
        Intrinsics.checkNotNullParameter(recorderConfig, "recorderConfig");
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(replayType, "replayType");
        Intrinsics.checkNotNullParameter(events, "events");
        this.f304886a = recorderConfig;
        this.f304887b = cache;
        this.f304888c = timestamp;
        this.f304889d = i10;
        this.f304890e = j10;
        this.f304891f = replayType;
        this.f304892g = str;
        this.f304893h = events;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ d j(d dVar, w wVar, j jVar, Date date, int i10, long j10, o8.c cVar, String str, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            wVar = dVar.f304886a;
        }
        if ((i11 & 2) != 0) {
            jVar = dVar.f304887b;
        }
        if ((i11 & 4) != 0) {
            date = dVar.f304888c;
        }
        if ((i11 & 8) != 0) {
            i10 = dVar.f304889d;
        }
        if ((i11 & 16) != 0) {
            j10 = dVar.f304890e;
        }
        if ((i11 & 32) != 0) {
            cVar = dVar.f304891f;
        }
        if ((i11 & 64) != 0) {
            str = dVar.f304892g;
        }
        if ((i11 & 128) != 0) {
            list = dVar.f304893h;
        }
        List list2 = list;
        o8.c cVar2 = cVar;
        long j11 = j10;
        Date date2 = date;
        int i12 = i10;
        return dVar.i(wVar, jVar, date2, i12, j11, cVar2, str, list2);
    }

    @NotNull
    public final w a() {
        return this.f304886a;
    }

    @NotNull
    public final j b() {
        return this.f304887b;
    }

    @NotNull
    public final Date c() {
        return this.f304888c;
    }

    public final int d() {
        return this.f304889d;
    }

    public final long e() {
        return this.f304890e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (Intrinsics.areEqual(this.f304886a, dVar.f304886a) && Intrinsics.areEqual(this.f304887b, dVar.f304887b) && Intrinsics.areEqual(this.f304888c, dVar.f304888c) && this.f304889d == dVar.f304889d && this.f304890e == dVar.f304890e && this.f304891f == dVar.f304891f && Intrinsics.areEqual(this.f304892g, dVar.f304892g) && Intrinsics.areEqual(this.f304893h, dVar.f304893h)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final o8.c f() {
        return this.f304891f;
    }

    @Nullable
    public final String g() {
        return this.f304892g;
    }

    @NotNull
    public final List<io.sentry.rrweb.b> h() {
        return this.f304893h;
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.f304886a.hashCode() * 31) + this.f304887b.hashCode()) * 31) + this.f304888c.hashCode()) * 31) + Integer.hashCode(this.f304889d)) * 31) + Long.hashCode(this.f304890e)) * 31) + this.f304891f.hashCode()) * 31;
        String str = this.f304892g;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f304893h.hashCode();
    }

    @NotNull
    public final d i(@NotNull w recorderConfig, @NotNull j cache, @NotNull Date timestamp, int i10, long j10, @NotNull o8.c replayType, @Nullable String str, @NotNull List<? extends io.sentry.rrweb.b> events) {
        Intrinsics.checkNotNullParameter(recorderConfig, "recorderConfig");
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(replayType, "replayType");
        Intrinsics.checkNotNullParameter(events, "events");
        return new d(recorderConfig, cache, timestamp, i10, j10, replayType, str, events);
    }

    @NotNull
    public final j k() {
        return this.f304887b;
    }

    public final long l() {
        return this.f304890e;
    }

    @NotNull
    public final List<io.sentry.rrweb.b> m() {
        return this.f304893h;
    }

    public final int n() {
        return this.f304889d;
    }

    @NotNull
    public final w o() {
        return this.f304886a;
    }

    @NotNull
    public final o8.c p() {
        return this.f304891f;
    }

    @Nullable
    public final String q() {
        return this.f304892g;
    }

    @NotNull
    public final Date r() {
        return this.f304888c;
    }

    @NotNull
    public String toString() {
        return "LastSegmentData(recorderConfig=" + this.f304886a + ", cache=" + this.f304887b + ", timestamp=" + this.f304888c + ", id=" + this.f304889d + ", duration=" + this.f304890e + ", replayType=" + this.f304891f + ", screenAtStart=" + this.f304892g + ", events=" + this.f304893h + ')';
    }
}
