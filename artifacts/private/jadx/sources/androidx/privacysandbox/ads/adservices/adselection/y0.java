package androidx.privacysandbox.ads.adservices.adselection;

import android.adservices.adselection.ReportEventRequest;
import android.view.InputEvent;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@androidx.privacysandbox.ads.adservices.common.q.d
public final class y0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f73459f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f73460g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f73461h = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f73462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f73463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f73464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f73465d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final InputEvent f73466e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @androidx.annotation.x0.a({@androidx.annotation.x0(extension = 1000000, version = 10), @androidx.annotation.x0(extension = 31, version = 10)})
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f73467a = new a(null);

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final ReportEventRequest a(@NotNull y0 request) {
                Intrinsics.checkNotNullParameter(request, "request");
                c1.a();
                ReportEventRequest reportEventRequestBuild = b1.a(request.b(), request.d(), request.c(), request.g()).setInputEvent(request.e()).build();
                Intrinsics.checkNotNullExpressionValue(reportEventRequestBuild, "Builder(\n               …                 .build()");
                return reportEventRequestBuild;
            }

            private a() {
            }
        }

        private b() {
        }
    }

    @androidx.annotation.x0.a({@androidx.annotation.x0(extension = 1000000, version = 8), @androidx.annotation.x0(extension = 31, version = 9)})
    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f73468a = new a(null);

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final ReportEventRequest a(@NotNull y0 request) {
                Intrinsics.checkNotNullParameter(request, "request");
                request.e();
                c1.a();
                ReportEventRequest reportEventRequestBuild = b1.a(request.b(), request.d(), request.c(), request.g()).build();
                Intrinsics.checkNotNullExpressionValue(reportEventRequestBuild, "Builder(\n               …                 .build()");
                return reportEventRequestBuild;
            }

            private a() {
            }
        }

        private c() {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    @jj.e(jj.a.SOURCE)
    public @interface d {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public y0(long j10, @NotNull String eventKey, @NotNull String eventData, int i10) {
        this(j10, eventKey, eventData, i10, null, 16, null);
        Intrinsics.checkNotNullParameter(eventKey, "eventKey");
        Intrinsics.checkNotNullParameter(eventData, "eventData");
    }

    @androidx.privacysandbox.ads.adservices.common.q.a
    public static /* synthetic */ void f() {
    }

    @androidx.annotation.x0.a({@androidx.annotation.x0(extension = 1000000, version = 8), @androidx.annotation.x0(extension = 31, version = 9)})
    @NotNull
    @e.a({"NewApi"})
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    public final ReportEventRequest a() {
        androidx.privacysandbox.ads.adservices.internal.a aVar = androidx.privacysandbox.ads.adservices.internal.a.f73536a;
        return (aVar.a() >= 10 || aVar.b() >= 10) ? b.f73467a.a(this) : c.f73468a.a(this);
    }

    public final long b() {
        return this.f73462a;
    }

    @NotNull
    public final String c() {
        return this.f73464c;
    }

    @NotNull
    public final String d() {
        return this.f73463b;
    }

    @Nullable
    public final InputEvent e() {
        return this.f73466e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return this.f73462a == y0Var.f73462a && Intrinsics.areEqual(this.f73463b, y0Var.f73463b) && Intrinsics.areEqual(this.f73464c, y0Var.f73464c) && this.f73465d == y0Var.f73465d && Intrinsics.areEqual(this.f73466e, y0Var.f73466e);
    }

    public final int g() {
        return this.f73465d;
    }

    public int hashCode() {
        int iHashCode = ((((((Long.hashCode(this.f73462a) * 31) + this.f73463b.hashCode()) * 31) + this.f73464c.hashCode()) * 31) + Integer.hashCode(this.f73465d)) * 31;
        InputEvent inputEvent = this.f73466e;
        return iHashCode + (inputEvent != null ? inputEvent.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ReportEventRequest: adSelectionId=" + this.f73462a + ", eventKey=" + this.f73463b + ", eventData=" + this.f73464c + ", reportingDestinations=" + this.f73465d + "inputEvent=" + this.f73466e;
    }

    @oj.j
    public y0(long j10, @NotNull String eventKey, @NotNull String eventData, int i10, @Nullable InputEvent inputEvent) {
        Intrinsics.checkNotNullParameter(eventKey, "eventKey");
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        this.f73462a = j10;
        this.f73463b = eventKey;
        this.f73464c = eventData;
        this.f73465d = i10;
        this.f73466e = inputEvent;
        if (i10 <= 0 || i10 > 3) {
            throw new IllegalArgumentException("Invalid reporting destinations bitfield.");
        }
    }

    public /* synthetic */ y0(long j10, String str, String str2, int i10, InputEvent inputEvent, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, str, str2, i10, (i11 & 16) != 0 ? null : inputEvent);
    }
}
