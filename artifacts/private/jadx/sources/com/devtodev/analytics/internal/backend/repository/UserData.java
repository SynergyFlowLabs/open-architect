package com.devtodev.analytics.internal.backend.repository;

import com.rabbitmq.client.r;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBackendUserData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackendUserData.kt\ncom/devtodev/analytics/internal/backend/repository/UserData\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,95:1\n1#2:96\n*E\n"})
public final class UserData extends BackendUserData {

    @Nullable
    private Long campaign;

    @Nullable
    private Long channel;

    @Nullable
    private Long created;

    @Nullable
    private String firstVersion;

    @Nullable
    private Boolean isNewUser;

    @Nullable
    private Long payingCapacity;

    @Nullable
    private Long paymentsCount;

    @Nullable
    private Double paymentsSum;

    @Nullable
    private Long sbsPaymentsCount;

    @Nullable
    private Double sbsPaymentsSum;

    @Nullable
    private Long sbsStatus;

    public UserData() {
        this(null, null, null, null, null, null, null, null, null, null, null, r.f265987x3, null);
    }

    public static /* synthetic */ UserData copy$default(UserData userData, Long l10, Boolean bool, String str, Long l11, Long l12, Double d10, Long l13, Double d11, Long l14, Long l15, Long l16, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l10 = userData.created;
        }
        if ((i10 & 2) != 0) {
            bool = userData.isNewUser;
        }
        if ((i10 & 4) != 0) {
            str = userData.firstVersion;
        }
        if ((i10 & 8) != 0) {
            l11 = userData.payingCapacity;
        }
        if ((i10 & 16) != 0) {
            l12 = userData.paymentsCount;
        }
        if ((i10 & 32) != 0) {
            d10 = userData.paymentsSum;
        }
        if ((i10 & 64) != 0) {
            l13 = userData.sbsPaymentsCount;
        }
        if ((i10 & 128) != 0) {
            d11 = userData.sbsPaymentsSum;
        }
        if ((i10 & 256) != 0) {
            l14 = userData.sbsStatus;
        }
        if ((i10 & 512) != 0) {
            l15 = userData.channel;
        }
        if ((i10 & 1024) != 0) {
            l16 = userData.campaign;
        }
        Long l17 = l15;
        Long l18 = l16;
        Double d12 = d11;
        Long l19 = l14;
        Double d13 = d10;
        Long l20 = l13;
        Long l21 = l12;
        String str2 = str;
        return userData.copy(l10, bool, str2, l11, l21, d13, l20, d12, l19, l17, l18);
    }

    @Nullable
    public final Long component1() {
        return this.created;
    }

    @Nullable
    public final Long component10() {
        return this.channel;
    }

    @Nullable
    public final Long component11() {
        return this.campaign;
    }

    @Nullable
    public final Boolean component2() {
        return this.isNewUser;
    }

    @Nullable
    public final String component3() {
        return this.firstVersion;
    }

    @Nullable
    public final Long component4() {
        return this.payingCapacity;
    }

    @Nullable
    public final Long component5() {
        return this.paymentsCount;
    }

    @Nullable
    public final Double component6() {
        return this.paymentsSum;
    }

    @Nullable
    public final Long component7() {
        return this.sbsPaymentsCount;
    }

    @Nullable
    public final Double component8() {
        return this.sbsPaymentsSum;
    }

    @Nullable
    public final Long component9() {
        return this.sbsStatus;
    }

    @NotNull
    public final UserData copy(@Nullable Long l10, @Nullable Boolean bool, @Nullable String str, @Nullable Long l11, @Nullable Long l12, @Nullable Double d10, @Nullable Long l13, @Nullable Double d11, @Nullable Long l14, @Nullable Long l15, @Nullable Long l16) {
        return new UserData(l10, bool, str, l11, l12, d10, l13, d11, l14, l15, l16);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserData)) {
            return false;
        }
        UserData userData = (UserData) obj;
        return Intrinsics.areEqual(this.created, userData.created) && Intrinsics.areEqual(this.isNewUser, userData.isNewUser) && Intrinsics.areEqual(this.firstVersion, userData.firstVersion) && Intrinsics.areEqual(this.payingCapacity, userData.payingCapacity) && Intrinsics.areEqual(this.paymentsCount, userData.paymentsCount) && Intrinsics.areEqual((Object) this.paymentsSum, (Object) userData.paymentsSum) && Intrinsics.areEqual(this.sbsPaymentsCount, userData.sbsPaymentsCount) && Intrinsics.areEqual((Object) this.sbsPaymentsSum, (Object) userData.sbsPaymentsSum) && Intrinsics.areEqual(this.sbsStatus, userData.sbsStatus) && Intrinsics.areEqual(this.channel, userData.channel) && Intrinsics.areEqual(this.campaign, userData.campaign);
    }

    @Nullable
    public final Long getCampaign() {
        return this.campaign;
    }

    @Nullable
    public final Long getChannel() {
        return this.channel;
    }

    @Nullable
    public final Long getCreated() {
        return this.created;
    }

    @Nullable
    public final String getFirstVersion() {
        return this.firstVersion;
    }

    @Nullable
    public final Long getPayingCapacity() {
        return this.payingCapacity;
    }

    @Nullable
    public final Long getPaymentsCount() {
        return this.paymentsCount;
    }

    @Nullable
    public final Double getPaymentsSum() {
        return this.paymentsSum;
    }

    @Nullable
    public final Long getSbsPaymentsCount() {
        return this.sbsPaymentsCount;
    }

    @Nullable
    public final Double getSbsPaymentsSum() {
        return this.sbsPaymentsSum;
    }

    @Nullable
    public final Long getSbsStatus() {
        return this.sbsStatus;
    }

    public int hashCode() {
        Long l10 = this.created;
        int iHashCode = (l10 == null ? 0 : l10.hashCode()) * 31;
        Boolean bool = this.isNewUser;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.firstVersion;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l11 = this.payingCapacity;
        int iHashCode4 = (iHashCode3 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.paymentsCount;
        int iHashCode5 = (iHashCode4 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Double d10 = this.paymentsSum;
        int iHashCode6 = (iHashCode5 + (d10 == null ? 0 : d10.hashCode())) * 31;
        Long l13 = this.sbsPaymentsCount;
        int iHashCode7 = (iHashCode6 + (l13 == null ? 0 : l13.hashCode())) * 31;
        Double d11 = this.sbsPaymentsSum;
        int iHashCode8 = (iHashCode7 + (d11 == null ? 0 : d11.hashCode())) * 31;
        Long l14 = this.sbsStatus;
        int iHashCode9 = (iHashCode8 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.channel;
        int iHashCode10 = (iHashCode9 + (l15 == null ? 0 : l15.hashCode())) * 31;
        Long l16 = this.campaign;
        return iHashCode10 + (l16 != null ? l16.hashCode() : 0);
    }

    @Nullable
    public final Boolean isNewUser() {
        return this.isNewUser;
    }

    public final void setCampaign(@Nullable Long l10) {
        this.campaign = l10;
    }

    public final void setChannel(@Nullable Long l10) {
        this.channel = l10;
    }

    public final void setCreated(@Nullable Long l10) {
        this.created = l10;
    }

    public final void setFirstVersion(@Nullable String str) {
        this.firstVersion = str;
    }

    public final void setNewUser(@Nullable Boolean bool) {
        this.isNewUser = bool;
    }

    public final void setPayingCapacity(@Nullable Long l10) {
        this.payingCapacity = l10;
    }

    public final void setPaymentsCount(@Nullable Long l10) {
        this.paymentsCount = l10;
    }

    public final void setPaymentsSum(@Nullable Double d10) {
        this.paymentsSum = d10;
    }

    public final void setSbsPaymentsCount(@Nullable Long l10) {
        this.sbsPaymentsCount = l10;
    }

    public final void setSbsPaymentsSum(@Nullable Double d10) {
        this.sbsPaymentsSum = d10;
    }

    public final void setSbsStatus(@Nullable Long l10) {
        this.sbsStatus = l10;
    }

    @NotNull
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        Long l10 = this.created;
        if (l10 != null) {
            stringBuffer.append("\tcreated: " + l10 + "\n");
        }
        Boolean bool = this.isNewUser;
        if (bool != null) {
            stringBuffer.append("\tisNewUser: " + bool + "\n");
        }
        String str = this.firstVersion;
        if (str != null) {
            stringBuffer.append("\tfirstVersion: " + str + "\n");
        }
        Long l11 = this.payingCapacity;
        if (l11 != null) {
            stringBuffer.append("\tpayingCapacity: " + l11 + "\n");
        }
        Long l12 = this.paymentsCount;
        if (l12 != null) {
            stringBuffer.append("\tpaymentsCount: " + l12 + "\n");
        }
        Double d10 = this.paymentsSum;
        if (d10 != null) {
            stringBuffer.append("\tpaymentsSum: " + d10 + "\n");
        }
        Long l13 = this.sbsPaymentsCount;
        if (l13 != null) {
            stringBuffer.append("\tsubscriptionPaymentsCount: " + l13 + "\n");
        }
        Double d11 = this.sbsPaymentsSum;
        if (d11 != null) {
            stringBuffer.append("\tsubscriptionPaymentsSum: " + d11 + "\n");
        }
        Long l14 = this.sbsStatus;
        if (l14 != null) {
            stringBuffer.append("\tsubscriptionStatus: " + l14 + "\n");
        }
        Long l15 = this.channel;
        if (l15 != null) {
            stringBuffer.append("\tchannel: " + l15 + "\n");
        }
        Long l16 = this.campaign;
        if (l16 != null) {
            stringBuffer.append("\tcampaign: " + l16 + "\n");
        }
        if (stringBuffer.length() == 0) {
            return "Empty failed";
        }
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "result.toString()");
        return string;
    }

    public /* synthetic */ UserData(Long l10, Boolean bool, String str, Long l11, Long l12, Double d10, Long l13, Double d11, Long l14, Long l15, Long l16, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : l10, (i10 & 2) != 0 ? null : bool, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : l11, (i10 & 16) != 0 ? null : l12, (i10 & 32) != 0 ? null : d10, (i10 & 64) != 0 ? null : l13, (i10 & 128) != 0 ? null : d11, (i10 & 256) != 0 ? null : l14, (i10 & 512) != 0 ? null : l15, (i10 & 1024) != 0 ? null : l16);
    }

    public UserData(@Nullable Long l10, @Nullable Boolean bool, @Nullable String str, @Nullable Long l11, @Nullable Long l12, @Nullable Double d10, @Nullable Long l13, @Nullable Double d11, @Nullable Long l14, @Nullable Long l15, @Nullable Long l16) {
        super(null);
        this.created = l10;
        this.isNewUser = bool;
        this.firstVersion = str;
        this.payingCapacity = l11;
        this.paymentsCount = l12;
        this.paymentsSum = d10;
        this.sbsPaymentsCount = l13;
        this.sbsPaymentsSum = d11;
        this.sbsStatus = l14;
        this.channel = l15;
        this.campaign = l16;
    }
}
