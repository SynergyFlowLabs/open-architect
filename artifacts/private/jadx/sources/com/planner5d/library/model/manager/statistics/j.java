package com.planner5d.library.model.manager.statistics;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f217781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f217782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f217783c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f217784d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f217785e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final String f217786f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final double f217787g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f217788h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final String f217789i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private final String f217790j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private final String f217791k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private final String f217792l;

    public j(@Nullable String str, @Nullable String str2, boolean z10, boolean z11, boolean z12, @Nullable String str3, double d10, long j10, @NotNull String priceCurrencyCode, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        Intrinsics.checkNotNullParameter(priceCurrencyCode, "priceCurrencyCode");
        this.f217781a = str;
        this.f217782b = str2;
        this.f217783c = z10;
        this.f217784d = z11;
        this.f217785e = z12;
        this.f217786f = str3;
        this.f217787g = d10;
        this.f217788h = j10;
        this.f217789i = priceCurrencyCode;
        this.f217790j = str4;
        this.f217791k = str5;
        this.f217792l = str6;
    }

    @Nullable
    public final String a() {
        return this.f217781a;
    }

    @Nullable
    public final String b() {
        return this.f217790j;
    }

    @Nullable
    public final String c() {
        return this.f217791k;
    }

    @Nullable
    public final String d() {
        return this.f217792l;
    }

    @Nullable
    public final String e() {
        return this.f217782b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.areEqual(this.f217781a, jVar.f217781a) && Intrinsics.areEqual(this.f217782b, jVar.f217782b) && this.f217783c == jVar.f217783c && this.f217784d == jVar.f217784d && this.f217785e == jVar.f217785e && Intrinsics.areEqual(this.f217786f, jVar.f217786f) && Double.compare(this.f217787g, jVar.f217787g) == 0 && this.f217788h == jVar.f217788h && Intrinsics.areEqual(this.f217789i, jVar.f217789i) && Intrinsics.areEqual(this.f217790j, jVar.f217790j) && Intrinsics.areEqual(this.f217791k, jVar.f217791k) && Intrinsics.areEqual(this.f217792l, jVar.f217792l);
    }

    public final boolean f() {
        return this.f217783c;
    }

    public final boolean g() {
        return this.f217784d;
    }

    public final boolean h() {
        return this.f217785e;
    }

    public int hashCode() {
        String str = this.f217781a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f217782b;
        int iHashCode2 = (((((((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.f217783c)) * 31) + Boolean.hashCode(this.f217784d)) * 31) + Boolean.hashCode(this.f217785e)) * 31;
        String str3 = this.f217786f;
        int iHashCode3 = (((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + Double.hashCode(this.f217787g)) * 31) + Long.hashCode(this.f217788h)) * 31) + this.f217789i.hashCode()) * 31;
        String str4 = this.f217790j;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f217791k;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f217792l;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    @Nullable
    public final String i() {
        return this.f217786f;
    }

    public final double j() {
        return this.f217787g;
    }

    public final long k() {
        return this.f217788h;
    }

    @NotNull
    public final String l() {
        return this.f217789i;
    }

    @NotNull
    public final j m(@Nullable String str, @Nullable String str2, boolean z10, boolean z11, boolean z12, @Nullable String str3, double d10, long j10, @NotNull String priceCurrencyCode, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        Intrinsics.checkNotNullParameter(priceCurrencyCode, "priceCurrencyCode");
        return new j(str, str2, z10, z11, z12, str3, d10, j10, priceCurrencyCode, str4, str5, str6);
    }

    @Nullable
    public final String o() {
        return this.f217786f;
    }

    @Nullable
    public final String p() {
        return this.f217781a;
    }

    @Nullable
    public final String q() {
        return this.f217790j;
    }

    @Nullable
    public final String r() {
        return this.f217792l;
    }

    @Nullable
    public final String s() {
        return this.f217791k;
    }

    @NotNull
    public final String t() {
        return this.f217789i;
    }

    @NotNull
    public String toString() {
        return "Purchase(name=" + this.f217781a + ", subscriptionName=" + this.f217782b + ", isSubscription=" + this.f217783c + ", isSubscriptionYearly=" + this.f217784d + ", isSubscriptionMonthly=" + this.f217785e + ", catalogItemId=" + this.f217786f + ", priceDouble=" + this.f217787g + ", priceMicros=" + this.f217788h + ", priceCurrencyCode=" + this.f217789i + ", orderId=" + this.f217790j + ", orderSignature=" + this.f217791k + ", orderPurchaseToken=" + this.f217792l + ")";
    }

    public final double u() {
        return this.f217787g;
    }

    public final long v() {
        return this.f217788h;
    }

    @Nullable
    public final String w() {
        return this.f217782b;
    }

    public final boolean x() {
        return this.f217783c;
    }

    public final boolean y() {
        return this.f217785e;
    }

    public final boolean z() {
        return this.f217784d;
    }
}
