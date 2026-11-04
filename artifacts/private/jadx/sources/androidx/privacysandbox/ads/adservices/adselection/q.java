package androidx.privacysandbox.ads.adservices.adselection;

import android.adservices.adselection.AdSelectionFromOutcomesConfig;
import android.net.Uri;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@androidx.privacysandbox.ads.adservices.common.q.a
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.privacysandbox.ads.adservices.common.p f73446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<Long> f73447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.privacysandbox.ads.adservices.common.n f73448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private Uri f73449d;

    public q(@NotNull androidx.privacysandbox.ads.adservices.common.p seller, @NotNull List<Long> adSelectionIds, @NotNull androidx.privacysandbox.ads.adservices.common.n adSelectionSignals, @NotNull Uri selectionLogicUri) {
        Intrinsics.checkNotNullParameter(seller, "seller");
        Intrinsics.checkNotNullParameter(adSelectionIds, "adSelectionIds");
        Intrinsics.checkNotNullParameter(adSelectionSignals, "adSelectionSignals");
        Intrinsics.checkNotNullParameter(selectionLogicUri, "selectionLogicUri");
        this.f73446a = seller;
        this.f73447b = adSelectionIds;
        this.f73448c = adSelectionSignals;
        this.f73449d = selectionLogicUri;
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    @androidx.annotation.x0.a({@androidx.annotation.x0(extension = 1000000, version = 10), @androidx.annotation.x0(extension = 31, version = 10)})
    @NotNull
    public final AdSelectionFromOutcomesConfig a() {
        AdSelectionFromOutcomesConfig adSelectionFromOutcomesConfigBuild = p.a().setSelectionSignals(this.f73448c.a()).setAdSelectionIds(this.f73447b).setSelectionLogicUri(this.f73449d).setSeller(this.f73446a.a()).build();
        Intrinsics.checkNotNullExpressionValue(adSelectionFromOutcomesConfigBuild, "Builder()\n            .s…s())\n            .build()");
        return adSelectionFromOutcomesConfigBuild;
    }

    @NotNull
    public final List<Long> b() {
        return this.f73447b;
    }

    @NotNull
    public final androidx.privacysandbox.ads.adservices.common.n c() {
        return this.f73448c;
    }

    @NotNull
    public final Uri d() {
        return this.f73449d;
    }

    @NotNull
    public final androidx.privacysandbox.ads.adservices.common.p e() {
        return this.f73446a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Intrinsics.areEqual(this.f73446a, qVar.f73446a) && Intrinsics.areEqual(this.f73447b, qVar.f73447b) && Intrinsics.areEqual(this.f73448c, qVar.f73448c) && Intrinsics.areEqual(this.f73449d, qVar.f73449d);
    }

    public final void f(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<set-?>");
        this.f73449d = uri;
    }

    public int hashCode() {
        return (((((this.f73446a.hashCode() * 31) + this.f73447b.hashCode()) * 31) + this.f73448c.hashCode()) * 31) + this.f73449d.hashCode();
    }

    @NotNull
    public String toString() {
        return "AdSelectionFromOutcomesConfig: seller=" + this.f73446a + ", adSelectionIds='" + this.f73447b + "', adSelectionSignals=" + this.f73448c + ", selectionLogicUri=" + this.f73449d;
    }
}
