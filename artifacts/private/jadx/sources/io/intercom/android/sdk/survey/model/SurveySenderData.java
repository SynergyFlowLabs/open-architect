package io.intercom.android.sdk.survey.model;

import androidx.compose.runtime.internal.w0;
import com.google.gson.annotations.c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public final class SurveySenderData {
    public static final int $stable = 0;

    @c("avatar")
    @Nullable
    private final SurveySenderAvatar avatar;

    @c("first_name")
    @Nullable
    private final String firstName;

    @c("initial")
    @Nullable
    private final String initials;

    @c("name")
    @Nullable
    private final String name;

    public SurveySenderData() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ SurveySenderData copy$default(SurveySenderData surveySenderData, String str, String str2, String str3, SurveySenderAvatar surveySenderAvatar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = surveySenderData.firstName;
        }
        if ((i10 & 2) != 0) {
            str2 = surveySenderData.name;
        }
        if ((i10 & 4) != 0) {
            str3 = surveySenderData.initials;
        }
        if ((i10 & 8) != 0) {
            surveySenderAvatar = surveySenderData.avatar;
        }
        return surveySenderData.copy(str, str2, str3, surveySenderAvatar);
    }

    @Nullable
    public final String component1() {
        return this.firstName;
    }

    @Nullable
    public final String component2() {
        return this.name;
    }

    @Nullable
    public final String component3() {
        return this.initials;
    }

    @Nullable
    public final SurveySenderAvatar component4() {
        return this.avatar;
    }

    @NotNull
    public final SurveySenderData copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable SurveySenderAvatar surveySenderAvatar) {
        return new SurveySenderData(str, str2, str3, surveySenderAvatar);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SurveySenderData)) {
            return false;
        }
        SurveySenderData surveySenderData = (SurveySenderData) obj;
        return Intrinsics.areEqual(this.firstName, surveySenderData.firstName) && Intrinsics.areEqual(this.name, surveySenderData.name) && Intrinsics.areEqual(this.initials, surveySenderData.initials) && Intrinsics.areEqual(this.avatar, surveySenderData.avatar);
    }

    @Nullable
    public final SurveySenderAvatar getAvatar() {
        return this.avatar;
    }

    @Nullable
    public final String getFirstName() {
        return this.firstName;
    }

    @Nullable
    public final String getInitials() {
        return this.initials;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.firstName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.initials;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        SurveySenderAvatar surveySenderAvatar = this.avatar;
        return iHashCode3 + (surveySenderAvatar != null ? surveySenderAvatar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SurveySenderData(firstName=" + this.firstName + ", name=" + this.name + ", initials=" + this.initials + ", avatar=" + this.avatar + ')';
    }

    public SurveySenderData(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable SurveySenderAvatar surveySenderAvatar) {
        this.firstName = str;
        this.name = str2;
        this.initials = str3;
        this.avatar = surveySenderAvatar;
    }

    public /* synthetic */ SurveySenderData(String str, String str2, String str3, SurveySenderAvatar surveySenderAvatar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : surveySenderAvatar);
    }
}
