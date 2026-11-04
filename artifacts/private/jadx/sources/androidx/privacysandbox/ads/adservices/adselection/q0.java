package androidx.privacysandbox.ads.adservices.adselection;

import android.adservices.adselection.GetAdSelectionDataRequest;
import android.net.Uri;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@androidx.privacysandbox.ads.adservices.common.q.a
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.privacysandbox.ads.adservices.common.p f73450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Uri f73451b;

    @androidx.annotation.x0.a({@androidx.annotation.x0(extension = 1000000, version = 10), @androidx.annotation.x0(extension = 31, version = 10)})
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C0699a f73452a = new C0699a(null);

        /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.adselection.q0$a$a, reason: collision with other inner class name */
        public static final class C0699a {
            public /* synthetic */ C0699a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final GetAdSelectionDataRequest a(@NotNull q0 request) {
                Intrinsics.checkNotNullParameter(request, "request");
                GetAdSelectionDataRequest getAdSelectionDataRequestBuild = p0.a().setSeller(request.d().a()).build();
                Intrinsics.checkNotNullExpressionValue(getAdSelectionDataRequestBuild, "Builder()\n              …                 .build()");
                return getAdSelectionDataRequestBuild;
            }

            private C0699a() {
            }
        }

        private a() {
        }
    }

    @androidx.annotation.x0.a({@androidx.annotation.x0(extension = 1000000, version = 12), @androidx.annotation.x0(extension = 31, version = 12)})
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f73453a = new a(null);

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final GetAdSelectionDataRequest a(@NotNull q0 request) {
                Intrinsics.checkNotNullParameter(request, "request");
                GetAdSelectionDataRequest getAdSelectionDataRequestBuild = p0.a().setSeller(request.d().a()).setCoordinatorOriginUri(request.b()).build();
                Intrinsics.checkNotNullExpressionValue(getAdSelectionDataRequestBuild, "Builder()\n              …                 .build()");
                return getAdSelectionDataRequestBuild;
            }

            private a() {
            }
        }

        private b() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @oj.j
    public q0(@NotNull androidx.privacysandbox.ads.adservices.common.p seller) {
        this(seller, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(seller, "seller");
    }

    @androidx.privacysandbox.ads.adservices.common.q.c
    public static /* synthetic */ void c() {
    }

    @androidx.annotation.x0.a({@androidx.annotation.x0(extension = 1000000, version = 10), @androidx.annotation.x0(extension = 31, version = 10)})
    @NotNull
    @e.a({"NewApi"})
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    public final GetAdSelectionDataRequest a() {
        androidx.privacysandbox.ads.adservices.internal.a aVar = androidx.privacysandbox.ads.adservices.internal.a.f73536a;
        return (aVar.a() >= 12 || aVar.b() >= 12) ? b.f73453a.a(this) : a.f73452a.a(this);
    }

    @Nullable
    public final Uri b() {
        return this.f73451b;
    }

    @NotNull
    public final androidx.privacysandbox.ads.adservices.common.p d() {
        return this.f73450a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return Intrinsics.areEqual(this.f73450a, q0Var.f73450a) && Intrinsics.areEqual(this.f73451b, q0Var.f73451b);
    }

    public int hashCode() {
        int iHashCode = this.f73450a.hashCode() * 31;
        Uri uri = this.f73451b;
        return iHashCode + (uri != null ? uri.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "GetAdSelectionDataRequest: seller=" + this.f73450a + ", coordinatorOriginUri=" + this.f73451b;
    }

    @oj.j
    public q0(@NotNull androidx.privacysandbox.ads.adservices.common.p seller, @Nullable Uri uri) {
        Intrinsics.checkNotNullParameter(seller, "seller");
        this.f73450a = seller;
        this.f73451b = uri;
    }

    public /* synthetic */ q0(androidx.privacysandbox.ads.adservices.common.p pVar, Uri uri, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(pVar, (i10 & 2) != 0 ? null : uri);
    }
}
