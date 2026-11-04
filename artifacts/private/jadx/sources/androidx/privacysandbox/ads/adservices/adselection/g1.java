package androidx.privacysandbox.ads.adservices.adselection;

import android.adservices.adselection.ReportImpressionRequest;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@e.a({"ClassVerificationFailure"})
public final class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f73424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final j f73425b;

    @androidx.annotation.x0.a({@androidx.annotation.x0(extension = 1000000, version = 10), @androidx.annotation.x0(extension = 31, version = 10)})
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C0698a f73426a = new C0698a(null);

        /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.adselection.g1$a$a, reason: collision with other inner class name */
        public static final class C0698a {
            public /* synthetic */ C0698a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final ReportImpressionRequest a(@NotNull g1 request) {
                Intrinsics.checkNotNullParameter(request, "request");
                if (Intrinsics.areEqual(request.b(), j.f73428h.a())) {
                    f1.a();
                    return d1.a(request.c());
                }
                f1.a();
                return e1.a(request.c(), request.b().d());
            }

            private C0698a() {
            }
        }

        private a() {
        }
    }

    @androidx.annotation.x0.a({@androidx.annotation.x0(extension = 1000000, version = 4), @androidx.annotation.x0(extension = 31, version = 9)})
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f73427a = new a(null);

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final ReportImpressionRequest a(@NotNull g1 request) {
                Intrinsics.checkNotNullParameter(request, "request");
                if (Intrinsics.areEqual(request.b(), j.f73428h.a())) {
                    throw new UnsupportedOperationException("adSelectionConfig is mandatory forAPI versions lower than ext 10");
                }
                f1.a();
                return e1.a(request.c(), request.b().d());
            }

            private a() {
            }
        }

        private b() {
        }
    }

    public g1(long j10, @NotNull j adSelectionConfig) {
        Intrinsics.checkNotNullParameter(adSelectionConfig, "adSelectionConfig");
        this.f73424a = j10;
        this.f73425b = adSelectionConfig;
    }

    @e.a({"NewApi"})
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    @NotNull
    public final ReportImpressionRequest a() {
        androidx.privacysandbox.ads.adservices.internal.a aVar = androidx.privacysandbox.ads.adservices.internal.a.f73536a;
        if (aVar.a() < 10 && aVar.b() < 10) {
            return b.f73427a.a(this);
        }
        return a.f73426a.a(this);
    }

    @NotNull
    public final j b() {
        return this.f73425b;
    }

    public final long c() {
        return this.f73424a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return this.f73424a == g1Var.f73424a && Intrinsics.areEqual(this.f73425b, g1Var.f73425b);
    }

    public int hashCode() {
        return (Long.hashCode(this.f73424a) * 31) + this.f73425b.hashCode();
    }

    @NotNull
    public String toString() {
        return "ReportImpressionRequest: adSelectionId=" + this.f73424a + ", adSelectionConfig=" + this.f73425b;
    }

    @androidx.privacysandbox.ads.adservices.common.q.d
    public g1(long j10) {
        this(j10, j.f73428h.a());
    }
}
