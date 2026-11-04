package androidx.privacysandbox.ads.adservices.common;

import android.adservices.common.AdData;
import android.net.Uri;
import androidx.annotation.b1;
import androidx.annotation.x0;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@e.a({"ClassVerificationFailure"})
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Uri f73484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f73485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Set<Integer> f73486c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final l f73487d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final String f73488e;

    @x0.a({@x0(extension = 1000000, version = 10), @x0(extension = 31, version = 10)})
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C0703a f73489a = new C0703a(null);

        /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.common.h$a$a, reason: collision with other inner class name */
        public static final class C0703a {
            public /* synthetic */ C0703a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final AdData a(@NotNull h adData) {
                Intrinsics.checkNotNullParameter(adData, "adData");
                AdData.Builder adCounterKeys = g.a().setMetadata(adData.e()).setRenderUri(adData.f()).setAdCounterKeys(adData.b());
                l lVarC = adData.c();
                AdData adDataBuild = adCounterKeys.setAdFilters(lVarC != null ? lVarC.a() : null).setAdRenderId(adData.d()).build();
                Intrinsics.checkNotNullExpressionValue(adDataBuild, "Builder()\n              …                 .build()");
                return adDataBuild;
            }

            private C0703a() {
            }
        }

        private a() {
        }
    }

    @x0.a({@x0(extension = 1000000, version = 4), @x0(extension = 31, version = 9)})
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f73490a = new a(null);

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final AdData a(@NotNull h adData) {
                Intrinsics.checkNotNullParameter(adData, "adData");
                adData.b().isEmpty();
                adData.c();
                adData.d();
                AdData adDataBuild = g.a().setMetadata(adData.e()).setRenderUri(adData.f()).build();
                Intrinsics.checkNotNullExpressionValue(adDataBuild, "Builder()\n              …                 .build()");
                return adDataBuild;
            }

            private a() {
            }
        }

        private b() {
        }
    }

    @x0.a({@x0(extension = 1000000, version = 8), @x0(extension = 31, version = 9)})
    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f73491a = new a(null);

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final AdData a(@NotNull h adData) {
                Intrinsics.checkNotNullParameter(adData, "adData");
                adData.d();
                AdData.Builder adCounterKeys = g.a().setMetadata(adData.e()).setRenderUri(adData.f()).setAdCounterKeys(adData.b());
                l lVarC = adData.c();
                AdData adDataBuild = adCounterKeys.setAdFilters(lVarC != null ? lVarC.a() : null).build();
                Intrinsics.checkNotNullExpressionValue(adDataBuild, "Builder()\n              …                 .build()");
                return adDataBuild;
            }

            private a() {
            }
        }

        private c() {
        }
    }

    @q.a
    public h(@NotNull Uri renderUri, @NotNull String metadata, @NotNull Set<Integer> adCounterKeys, @Nullable l lVar, @Nullable String str) {
        Intrinsics.checkNotNullParameter(renderUri, "renderUri");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(adCounterKeys, "adCounterKeys");
        this.f73484a = renderUri;
        this.f73485b = metadata;
        this.f73486c = adCounterKeys;
        this.f73487d = lVar;
        this.f73488e = str;
    }

    @e.a({"NewApi"})
    @b1({b1.a.LIBRARY})
    @NotNull
    public final AdData a() {
        androidx.privacysandbox.ads.adservices.internal.a aVar = androidx.privacysandbox.ads.adservices.internal.a.f73536a;
        if (aVar.a() >= 10 || aVar.b() >= 10) {
            return a.f73489a.a(this);
        }
        if (aVar.a() < 8 && aVar.b() < 9) {
            return b.f73490a.a(this);
        }
        return c.f73491a.a(this);
    }

    @NotNull
    public final Set<Integer> b() {
        return this.f73486c;
    }

    @Nullable
    public final l c() {
        return this.f73487d;
    }

    @Nullable
    public final String d() {
        return this.f73488e;
    }

    @NotNull
    public final String e() {
        return this.f73485b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.areEqual(this.f73484a, hVar.f73484a) && Intrinsics.areEqual(this.f73485b, hVar.f73485b) && Intrinsics.areEqual(this.f73486c, hVar.f73486c) && Intrinsics.areEqual(this.f73487d, hVar.f73487d) && Intrinsics.areEqual(this.f73488e, hVar.f73488e);
    }

    @NotNull
    public final Uri f() {
        return this.f73484a;
    }

    public int hashCode() {
        int iHashCode = ((((this.f73484a.hashCode() * 31) + this.f73485b.hashCode()) * 31) + this.f73486c.hashCode()) * 31;
        l lVar = this.f73487d;
        int iHashCode2 = (iHashCode + (lVar != null ? lVar.hashCode() : 0)) * 31;
        String str = this.f73488e;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AdData: renderUri=" + this.f73484a + ", metadata='" + this.f73485b + "', adCounterKeys=" + this.f73486c + ", adFilters=" + this.f73487d + ", adRenderId=" + this.f73488e;
    }

    public /* synthetic */ h(Uri uri, String str, Set set, l lVar, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(uri, str, (i10 & 4) != 0 ? SetsKt.emptySet() : set, (i10 & 8) != 0 ? null : lVar, (i10 & 16) != 0 ? null : str2);
    }

    public /* synthetic */ h(Uri uri, String str, Set set, l lVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(uri, str, (i10 & 4) != 0 ? SetsKt.emptySet() : set, (i10 & 8) != 0 ? null : lVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @q.d
    public h(@NotNull Uri renderUri, @NotNull String metadata, @NotNull Set<Integer> adCounterKeys, @Nullable l lVar) {
        this(renderUri, metadata, adCounterKeys, lVar, null);
        Intrinsics.checkNotNullParameter(renderUri, "renderUri");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(adCounterKeys, "adCounterKeys");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(@NotNull Uri renderUri, @NotNull String metadata) {
        this(renderUri, metadata, SetsKt.emptySet(), null);
        Intrinsics.checkNotNullParameter(renderUri, "renderUri");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
    }
}
