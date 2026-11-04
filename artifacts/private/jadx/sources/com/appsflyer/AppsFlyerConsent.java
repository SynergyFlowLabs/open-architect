package com.appsflyer;

import kotlin.b1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.l;
import oj.i;
import oj.j;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class AppsFlyerConsent {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @Nullable
    private final Boolean hasConsentForAdStorage;

    @Nullable
    private final Boolean hasConsentForAdsPersonalization;

    @Nullable
    private final Boolean hasConsentForDataUsage;

    @Nullable
    private final Boolean isUserSubjectToGDPR;

    public static final class Companion {
        private Companion() {
        }

        @n
        @l(level = kotlin.n.WARNING, message = "Deprecated since v6.16.1. Please use direct constructor invocation.", replaceWith = @b1(expression = "AppsFlyerConsent()", imports = {}))
        @NotNull
        public final AppsFlyerConsent forGDPRUser(boolean z10, boolean z11) {
            return new AppsFlyerConsent(Boolean.TRUE, Boolean.valueOf(z10), Boolean.valueOf(z11), null, 8, null);
        }

        @n
        @l(level = kotlin.n.WARNING, message = "Deprecated since v6.16.1. Please use direct constructor invocation.", replaceWith = @b1(expression = "AppsFlyerConsent()", imports = {}))
        @NotNull
        public final AppsFlyerConsent forNonGDPRUser() {
            return new AppsFlyerConsent(Boolean.FALSE, null, null, null, 8, null);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @j
    public AppsFlyerConsent(@Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4) {
        this.isUserSubjectToGDPR = bool;
        this.hasConsentForDataUsage = bool2;
        this.hasConsentForAdsPersonalization = bool3;
        this.hasConsentForAdStorage = bool4;
    }

    public static /* synthetic */ AppsFlyerConsent copy$default(AppsFlyerConsent appsFlyerConsent, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bool = appsFlyerConsent.isUserSubjectToGDPR;
        }
        if ((i10 & 2) != 0) {
            bool2 = appsFlyerConsent.hasConsentForDataUsage;
        }
        if ((i10 & 4) != 0) {
            bool3 = appsFlyerConsent.hasConsentForAdsPersonalization;
        }
        if ((i10 & 8) != 0) {
            bool4 = appsFlyerConsent.hasConsentForAdStorage;
        }
        return appsFlyerConsent.copy(bool, bool2, bool3, bool4);
    }

    @n
    @l(level = kotlin.n.WARNING, message = "Deprecated since v6.16.1. Please use direct constructor invocation.", replaceWith = @b1(expression = "AppsFlyerConsent()", imports = {}))
    @NotNull
    public static final AppsFlyerConsent forGDPRUser(boolean z10, boolean z11) {
        return Companion.forGDPRUser(z10, z11);
    }

    @n
    @l(level = kotlin.n.WARNING, message = "Deprecated since v6.16.1. Please use direct constructor invocation.", replaceWith = @b1(expression = "AppsFlyerConsent()", imports = {}))
    @NotNull
    public static final AppsFlyerConsent forNonGDPRUser() {
        return Companion.forNonGDPRUser();
    }

    @Nullable
    public final Boolean component1() {
        return this.isUserSubjectToGDPR;
    }

    @Nullable
    public final Boolean component2() {
        return this.hasConsentForDataUsage;
    }

    @Nullable
    public final Boolean component3() {
        return this.hasConsentForAdsPersonalization;
    }

    @Nullable
    public final Boolean component4() {
        return this.hasConsentForAdStorage;
    }

    @NotNull
    public final AppsFlyerConsent copy(@Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4) {
        return new AppsFlyerConsent(bool, bool2, bool3, bool4);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsFlyerConsent)) {
            return false;
        }
        AppsFlyerConsent appsFlyerConsent = (AppsFlyerConsent) obj;
        return Intrinsics.areEqual(this.isUserSubjectToGDPR, appsFlyerConsent.isUserSubjectToGDPR) && Intrinsics.areEqual(this.hasConsentForDataUsage, appsFlyerConsent.hasConsentForDataUsage) && Intrinsics.areEqual(this.hasConsentForAdsPersonalization, appsFlyerConsent.hasConsentForAdsPersonalization) && Intrinsics.areEqual(this.hasConsentForAdStorage, appsFlyerConsent.hasConsentForAdStorage);
    }

    @i(name = "getHasConsentForAdStorage")
    @Nullable
    public final Boolean getHasConsentForAdStorage() {
        return this.hasConsentForAdStorage;
    }

    @i(name = "getHasConsentForAdsPersonalization")
    @Nullable
    public final Boolean getHasConsentForAdsPersonalization() {
        return this.hasConsentForAdsPersonalization;
    }

    @i(name = "getHasConsentForDataUsage")
    @Nullable
    public final Boolean getHasConsentForDataUsage() {
        return this.hasConsentForDataUsage;
    }

    public final int hashCode() {
        Boolean bool = this.isUserSubjectToGDPR;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.hasConsentForDataUsage;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.hasConsentForAdsPersonalization;
        int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.hasConsentForAdStorage;
        return iHashCode3 + (bool4 != null ? bool4.hashCode() : 0);
    }

    @i(name = "isUserSubjectToGDPR")
    @Nullable
    public final Boolean isUserSubjectToGDPR() {
        return this.isUserSubjectToGDPR;
    }

    @NotNull
    public final String toString() {
        return "AppsFlyerConsent(isUserSubjectToGDPR=" + this.isUserSubjectToGDPR + ", hasConsentForDataUsage=" + this.hasConsentForDataUsage + ", hasConsentForAdsPersonalization=" + this.hasConsentForAdsPersonalization + ", hasConsentForAdStorage=" + this.hasConsentForAdStorage + ")";
    }

    public /* synthetic */ AppsFlyerConsent(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : bool, (i10 & 2) != 0 ? null : bool2, (i10 & 4) != 0 ? null : bool3, (i10 & 8) != 0 ? null : bool4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public AppsFlyerConsent() {
        this(null, null, null, null, 15, null);
        int i10 = 7 | 0;
    }

    @j
    public AppsFlyerConsent(@Nullable Boolean bool) {
        this(bool, null, null, null, 14, null);
    }

    @j
    public AppsFlyerConsent(@Nullable Boolean bool, @Nullable Boolean bool2) {
        this(bool, bool2, null, null, 12, null);
    }

    @j
    public AppsFlyerConsent(@Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3) {
        this(bool, bool2, bool3, null, 8, null);
    }
}
