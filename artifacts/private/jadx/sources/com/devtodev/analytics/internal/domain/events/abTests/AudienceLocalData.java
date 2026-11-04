package com.devtodev.analytics.internal.domain.events.abTests;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class AudienceLocalData {

    @Nullable
    private final String country;
    private final double displayDiagonal;

    @Nullable
    private final String language;

    @Nullable
    private final String source;
    private final int userLevel;

    public AudienceLocalData(double d10, @Nullable String str, @Nullable String str2, @Nullable String str3, int i10) {
        this.displayDiagonal = d10;
        this.country = str;
        this.language = str2;
        this.source = str3;
        this.userLevel = i10;
    }

    public static /* synthetic */ AudienceLocalData copy$default(AudienceLocalData audienceLocalData, double d10, String str, String str2, String str3, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            d10 = audienceLocalData.displayDiagonal;
        }
        double d11 = d10;
        if ((i11 & 2) != 0) {
            str = audienceLocalData.country;
        }
        String str4 = str;
        if ((i11 & 4) != 0) {
            str2 = audienceLocalData.language;
        }
        String str5 = str2;
        if ((i11 & 8) != 0) {
            str3 = audienceLocalData.source;
        }
        String str6 = str3;
        if ((i11 & 16) != 0) {
            i10 = audienceLocalData.userLevel;
        }
        return audienceLocalData.copy(d11, str4, str5, str6, i10);
    }

    public final double component1() {
        return this.displayDiagonal;
    }

    @Nullable
    public final String component2() {
        return this.country;
    }

    @Nullable
    public final String component3() {
        return this.language;
    }

    @Nullable
    public final String component4() {
        return this.source;
    }

    public final int component5() {
        return this.userLevel;
    }

    @NotNull
    public final AudienceLocalData copy(double d10, @Nullable String str, @Nullable String str2, @Nullable String str3, int i10) {
        return new AudienceLocalData(d10, str, str2, str3, i10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudienceLocalData)) {
            return false;
        }
        AudienceLocalData audienceLocalData = (AudienceLocalData) obj;
        return Double.compare(this.displayDiagonal, audienceLocalData.displayDiagonal) == 0 && Intrinsics.areEqual(this.country, audienceLocalData.country) && Intrinsics.areEqual(this.language, audienceLocalData.language) && Intrinsics.areEqual(this.source, audienceLocalData.source) && this.userLevel == audienceLocalData.userLevel;
    }

    @Nullable
    public final String getCountry() {
        return this.country;
    }

    public final double getDisplayDiagonal() {
        return this.displayDiagonal;
    }

    @Nullable
    public final String getLanguage() {
        return this.language;
    }

    @Nullable
    public final String getSource() {
        return this.source;
    }

    public final int getUserLevel() {
        return this.userLevel;
    }

    public int hashCode() {
        int iHashCode = Double.hashCode(this.displayDiagonal) * 31;
        String str = this.country;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.language;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.source;
        return Integer.hashCode(this.userLevel) + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "AudienceLocalData(displayDiagonal=" + this.displayDiagonal + ", country=" + this.country + ", language=" + this.language + ", source=" + this.source + ", userLevel=" + this.userLevel + ")";
    }

    public /* synthetic */ AudienceLocalData(double d10, String str, String str2, String str3, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(d10, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3, i10);
    }
}
