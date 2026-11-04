package androidx.privacysandbox.ads.adservices.customaudience;

import android.net.Uri;
import java.time.Instant;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.privacysandbox.ads.adservices.common.p f73504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f73505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Uri f73506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Uri f73507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final List<androidx.privacysandbox.ads.adservices.common.h> f73508e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final Instant f73509f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private final Instant f73510g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private final androidx.privacysandbox.ads.adservices.common.n f73511h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private final r0 f73512i;

    /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.customaudience.a$a, reason: collision with other inner class name */
    @SourceDebugExtension({"SMAP\nCustomAudience.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomAudience.kt\nandroidx/privacysandbox/ads/adservices/customaudience/CustomAudience$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,252:1\n1#2:253\n*E\n"})
    public static final class C0704a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private androidx.privacysandbox.ads.adservices.common.p f73513a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private String f73514b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private Uri f73515c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private Uri f73516d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private List<androidx.privacysandbox.ads.adservices.common.h> f73517e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        private Instant f73518f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        private Instant f73519g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        private androidx.privacysandbox.ads.adservices.common.n f73520h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        private r0 f73521i;

        public C0704a(@NotNull androidx.privacysandbox.ads.adservices.common.p buyer, @NotNull String name, @NotNull Uri dailyUpdateUri, @NotNull Uri biddingLogicUri, @NotNull List<androidx.privacysandbox.ads.adservices.common.h> ads) {
            Intrinsics.checkNotNullParameter(buyer, "buyer");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(dailyUpdateUri, "dailyUpdateUri");
            Intrinsics.checkNotNullParameter(biddingLogicUri, "biddingLogicUri");
            Intrinsics.checkNotNullParameter(ads, "ads");
            this.f73513a = buyer;
            this.f73514b = name;
            this.f73515c = dailyUpdateUri;
            this.f73516d = biddingLogicUri;
            this.f73517e = ads;
        }

        @NotNull
        public final a a() {
            return new a(this.f73513a, this.f73514b, this.f73515c, this.f73516d, this.f73517e, this.f73518f, this.f73519g, this.f73520h, this.f73521i);
        }

        @NotNull
        public final C0704a b(@NotNull Instant activationTime) {
            Intrinsics.checkNotNullParameter(activationTime, "activationTime");
            this.f73518f = activationTime;
            return this;
        }

        @NotNull
        public final C0704a c(@NotNull List<androidx.privacysandbox.ads.adservices.common.h> ads) {
            Intrinsics.checkNotNullParameter(ads, "ads");
            this.f73517e = ads;
            return this;
        }

        @NotNull
        public final C0704a d(@NotNull Uri biddingLogicUri) {
            Intrinsics.checkNotNullParameter(biddingLogicUri, "biddingLogicUri");
            this.f73516d = biddingLogicUri;
            return this;
        }

        @NotNull
        public final C0704a e(@NotNull androidx.privacysandbox.ads.adservices.common.p buyer) {
            Intrinsics.checkNotNullParameter(buyer, "buyer");
            this.f73513a = buyer;
            return this;
        }

        @NotNull
        public final C0704a f(@NotNull Uri dailyUpdateUri) {
            Intrinsics.checkNotNullParameter(dailyUpdateUri, "dailyUpdateUri");
            this.f73515c = dailyUpdateUri;
            return this;
        }

        @NotNull
        public final C0704a g(@NotNull Instant expirationTime) {
            Intrinsics.checkNotNullParameter(expirationTime, "expirationTime");
            this.f73519g = expirationTime;
            return this;
        }

        @NotNull
        public final C0704a h(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f73514b = name;
            return this;
        }

        @NotNull
        public final C0704a i(@NotNull r0 trustedBiddingSignals) {
            Intrinsics.checkNotNullParameter(trustedBiddingSignals, "trustedBiddingSignals");
            this.f73521i = trustedBiddingSignals;
            return this;
        }

        @NotNull
        public final C0704a j(@NotNull androidx.privacysandbox.ads.adservices.common.n userBiddingSignals) {
            Intrinsics.checkNotNullParameter(userBiddingSignals, "userBiddingSignals");
            this.f73520h = userBiddingSignals;
            return this;
        }
    }

    public a(@NotNull androidx.privacysandbox.ads.adservices.common.p buyer, @NotNull String name, @NotNull Uri dailyUpdateUri, @NotNull Uri biddingLogicUri, @NotNull List<androidx.privacysandbox.ads.adservices.common.h> ads, @Nullable Instant instant, @Nullable Instant instant2, @Nullable androidx.privacysandbox.ads.adservices.common.n nVar, @Nullable r0 r0Var) {
        Intrinsics.checkNotNullParameter(buyer, "buyer");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(dailyUpdateUri, "dailyUpdateUri");
        Intrinsics.checkNotNullParameter(biddingLogicUri, "biddingLogicUri");
        Intrinsics.checkNotNullParameter(ads, "ads");
        this.f73504a = buyer;
        this.f73505b = name;
        this.f73506c = dailyUpdateUri;
        this.f73507d = biddingLogicUri;
        this.f73508e = ads;
        this.f73509f = instant;
        this.f73510g = instant2;
        this.f73511h = nVar;
        this.f73512i = r0Var;
    }

    @Nullable
    public final Instant a() {
        return this.f73509f;
    }

    @NotNull
    public final List<androidx.privacysandbox.ads.adservices.common.h> b() {
        return this.f73508e;
    }

    @NotNull
    public final Uri c() {
        return this.f73507d;
    }

    @NotNull
    public final androidx.privacysandbox.ads.adservices.common.p d() {
        return this.f73504a;
    }

    @NotNull
    public final Uri e() {
        return this.f73506c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f73504a, aVar.f73504a) && Intrinsics.areEqual(this.f73505b, aVar.f73505b) && Intrinsics.areEqual(this.f73509f, aVar.f73509f) && Intrinsics.areEqual(this.f73510g, aVar.f73510g) && Intrinsics.areEqual(this.f73506c, aVar.f73506c) && Intrinsics.areEqual(this.f73511h, aVar.f73511h) && Intrinsics.areEqual(this.f73512i, aVar.f73512i) && Intrinsics.areEqual(this.f73508e, aVar.f73508e);
    }

    @Nullable
    public final Instant f() {
        return this.f73510g;
    }

    @NotNull
    public final String g() {
        return this.f73505b;
    }

    @Nullable
    public final r0 h() {
        return this.f73512i;
    }

    public int hashCode() {
        int iHashCode = ((this.f73504a.hashCode() * 31) + this.f73505b.hashCode()) * 31;
        Instant instant = this.f73509f;
        int iHashCode2 = (iHashCode + (instant != null ? instant.hashCode() : 0)) * 31;
        Instant instant2 = this.f73510g;
        int iHashCode3 = (((iHashCode2 + (instant2 != null ? instant2.hashCode() : 0)) * 31) + this.f73506c.hashCode()) * 31;
        androidx.privacysandbox.ads.adservices.common.n nVar = this.f73511h;
        int iHashCode4 = (iHashCode3 + (nVar != null ? nVar.hashCode() : 0)) * 31;
        r0 r0Var = this.f73512i;
        return ((((iHashCode4 + (r0Var != null ? r0Var.hashCode() : 0)) * 31) + this.f73507d.hashCode()) * 31) + this.f73508e.hashCode();
    }

    @Nullable
    public final androidx.privacysandbox.ads.adservices.common.n i() {
        return this.f73511h;
    }

    @NotNull
    public String toString() {
        return "CustomAudience: buyer=" + this.f73507d + ", name=" + this.f73505b + ", activationTime=" + this.f73509f + ", expirationTime=" + this.f73510g + ", dailyUpdateUri=" + this.f73506c + ", userBiddingSignals=" + this.f73511h + ", trustedBiddingSignals=" + this.f73512i + ", biddingLogicUri=" + this.f73507d + ", ads=" + this.f73508e;
    }

    public /* synthetic */ a(androidx.privacysandbox.ads.adservices.common.p pVar, String str, Uri uri, Uri uri2, List list, Instant instant, Instant instant2, androidx.privacysandbox.ads.adservices.common.n nVar, r0 r0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(pVar, str, uri, uri2, list, (i10 & 32) != 0 ? null : instant, (i10 & 64) != 0 ? null : instant2, (i10 & 128) != 0 ? null : nVar, (i10 & 256) != 0 ? null : r0Var);
    }
}
