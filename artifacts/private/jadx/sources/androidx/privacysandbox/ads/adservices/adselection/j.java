package androidx.privacysandbox.ads.adservices.adselection;

import android.adservices.adselection.AdSelectionConfig;
import android.adservices.common.AdSelectionSignals;
import android.adservices.common.AdTechIdentifier;
import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@e.a({"ClassVerificationFailure"})
public final class j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final a f73428h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final j f73429i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.privacysandbox.ads.adservices.common.p f73430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Uri f73431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<androidx.privacysandbox.ads.adservices.common.p> f73432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final androidx.privacysandbox.ads.adservices.common.n f73433d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final androidx.privacysandbox.ads.adservices.common.n f73434e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final Map<androidx.privacysandbox.ads.adservices.common.p, androidx.privacysandbox.ads.adservices.common.n> f73435f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final Uri f73436g;

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final j a() {
            return j.f73429i;
        }

        private a() {
        }
    }

    static {
        androidx.privacysandbox.ads.adservices.common.p pVar = new androidx.privacysandbox.ads.adservices.common.p("");
        Uri EMPTY = Uri.EMPTY;
        Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
        List listEmptyList = CollectionsKt.emptyList();
        androidx.privacysandbox.ads.adservices.common.n nVar = new androidx.privacysandbox.ads.adservices.common.n("");
        androidx.privacysandbox.ads.adservices.common.n nVar2 = new androidx.privacysandbox.ads.adservices.common.n("");
        Map mapEmptyMap = MapsKt.emptyMap();
        Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
        f73429i = new j(pVar, EMPTY, listEmptyList, nVar, nVar2, mapEmptyMap, EMPTY);
    }

    public j(@NotNull androidx.privacysandbox.ads.adservices.common.p seller, @NotNull Uri decisionLogicUri, @NotNull List<androidx.privacysandbox.ads.adservices.common.p> customAudienceBuyers, @NotNull androidx.privacysandbox.ads.adservices.common.n adSelectionSignals, @NotNull androidx.privacysandbox.ads.adservices.common.n sellerSignals, @NotNull Map<androidx.privacysandbox.ads.adservices.common.p, androidx.privacysandbox.ads.adservices.common.n> perBuyerSignals, @NotNull Uri trustedScoringSignalsUri) {
        Intrinsics.checkNotNullParameter(seller, "seller");
        Intrinsics.checkNotNullParameter(decisionLogicUri, "decisionLogicUri");
        Intrinsics.checkNotNullParameter(customAudienceBuyers, "customAudienceBuyers");
        Intrinsics.checkNotNullParameter(adSelectionSignals, "adSelectionSignals");
        Intrinsics.checkNotNullParameter(sellerSignals, "sellerSignals");
        Intrinsics.checkNotNullParameter(perBuyerSignals, "perBuyerSignals");
        Intrinsics.checkNotNullParameter(trustedScoringSignalsUri, "trustedScoringSignalsUri");
        this.f73430a = seller;
        this.f73431b = decisionLogicUri;
        this.f73432c = customAudienceBuyers;
        this.f73433d = adSelectionSignals;
        this.f73434e = sellerSignals;
        this.f73435f = perBuyerSignals;
        this.f73436g = trustedScoringSignalsUri;
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    @androidx.annotation.x0.a({@androidx.annotation.x0(extension = 1000000, version = 4), @androidx.annotation.x0(extension = 31, version = 9)})
    private final List<AdTechIdentifier> b(List<androidx.privacysandbox.ads.adservices.common.p> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<androidx.privacysandbox.ads.adservices.common.p> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().a());
        }
        return arrayList;
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    @androidx.annotation.x0.a({@androidx.annotation.x0(extension = 1000000, version = 4), @androidx.annotation.x0(extension = 31, version = 9)})
    private final Map<AdTechIdentifier, AdSelectionSignals> c(Map<androidx.privacysandbox.ads.adservices.common.p, androidx.privacysandbox.ads.adservices.common.n> map) {
        HashMap map2 = new HashMap();
        for (androidx.privacysandbox.ads.adservices.common.p pVar : map.keySet()) {
            AdTechIdentifier adTechIdentifierA = pVar.a();
            androidx.privacysandbox.ads.adservices.common.n nVar = map.get(pVar);
            map2.put(adTechIdentifierA, nVar != null ? nVar.a() : null);
        }
        return map2;
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    @androidx.annotation.x0.a({@androidx.annotation.x0(extension = 1000000, version = 4), @androidx.annotation.x0(extension = 31, version = 9)})
    @NotNull
    public final AdSelectionConfig d() {
        AdSelectionConfig adSelectionConfigBuild = i.a().setAdSelectionSignals(this.f73433d.a()).setCustomAudienceBuyers(b(this.f73432c)).setDecisionLogicUri(this.f73431b).setSeller(this.f73430a.a()).setPerBuyerSignals(c(this.f73435f)).setSellerSignals(this.f73434e.a()).setTrustedScoringSignalsUri(this.f73436g).build();
        Intrinsics.checkNotNullExpressionValue(adSelectionConfigBuild, "Builder()\n            .s…Uri)\n            .build()");
        return adSelectionConfigBuild;
    }

    @NotNull
    public final androidx.privacysandbox.ads.adservices.common.n e() {
        return this.f73433d;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.areEqual(this.f73430a, jVar.f73430a) && Intrinsics.areEqual(this.f73431b, jVar.f73431b) && Intrinsics.areEqual(this.f73432c, jVar.f73432c) && Intrinsics.areEqual(this.f73433d, jVar.f73433d) && Intrinsics.areEqual(this.f73434e, jVar.f73434e) && Intrinsics.areEqual(this.f73435f, jVar.f73435f) && Intrinsics.areEqual(this.f73436g, jVar.f73436g);
    }

    @NotNull
    public final List<androidx.privacysandbox.ads.adservices.common.p> f() {
        return this.f73432c;
    }

    @NotNull
    public final Uri g() {
        return this.f73431b;
    }

    @NotNull
    public final Map<androidx.privacysandbox.ads.adservices.common.p, androidx.privacysandbox.ads.adservices.common.n> h() {
        return this.f73435f;
    }

    public int hashCode() {
        return (((((((((((this.f73430a.hashCode() * 31) + this.f73431b.hashCode()) * 31) + this.f73432c.hashCode()) * 31) + this.f73433d.hashCode()) * 31) + this.f73434e.hashCode()) * 31) + this.f73435f.hashCode()) * 31) + this.f73436g.hashCode();
    }

    @NotNull
    public final androidx.privacysandbox.ads.adservices.common.p i() {
        return this.f73430a;
    }

    @NotNull
    public final androidx.privacysandbox.ads.adservices.common.n j() {
        return this.f73434e;
    }

    @NotNull
    public final Uri k() {
        return this.f73436g;
    }

    @NotNull
    public String toString() {
        return "AdSelectionConfig: seller=" + this.f73430a + ", decisionLogicUri='" + this.f73431b + "', customAudienceBuyers=" + this.f73432c + ", adSelectionSignals=" + this.f73433d + ", sellerSignals=" + this.f73434e + ", perBuyerSignals=" + this.f73435f + ", trustedScoringSignalsUri=" + this.f73436g;
    }
}
