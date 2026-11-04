package com.planner5d.library.spaces.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.w0;
import gk.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@w0(parameters = 0)
@d
public final class SpacesProjectData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SpacesProjectData> CREATOR = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f230195h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private String f230196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private Integer f230197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private Integer f230198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private Long f230199d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private Integer f230200e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private String f230201f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private String f230202g;

    public static final class a implements Parcelable.Creator<SpacesProjectData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SpacesProjectData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SpacesProjectData(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SpacesProjectData[] newArray(int i10) {
            return new SpacesProjectData[i10];
        }
    }

    public SpacesProjectData(@Nullable String str, @Nullable Integer num, @Nullable Integer num2, @Nullable Long l10, @Nullable Integer num3, @Nullable String str2, @Nullable String str3) {
        this.f230196a = str;
        this.f230197b = num;
        this.f230198c = num2;
        this.f230199d = l10;
        this.f230200e = num3;
        this.f230201f = str2;
        this.f230202g = str3;
    }

    public static /* synthetic */ SpacesProjectData j(SpacesProjectData spacesProjectData, String str, Integer num, Integer num2, Long l10, Integer num3, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = spacesProjectData.f230196a;
        }
        if ((i10 & 2) != 0) {
            num = spacesProjectData.f230197b;
        }
        if ((i10 & 4) != 0) {
            num2 = spacesProjectData.f230198c;
        }
        if ((i10 & 8) != 0) {
            l10 = spacesProjectData.f230199d;
        }
        if ((i10 & 16) != 0) {
            num3 = spacesProjectData.f230200e;
        }
        if ((i10 & 32) != 0) {
            str2 = spacesProjectData.f230201f;
        }
        if ((i10 & 64) != 0) {
            str3 = spacesProjectData.f230202g;
        }
        String str4 = str2;
        String str5 = str3;
        Integer num4 = num3;
        Integer num5 = num2;
        return spacesProjectData.i(str, num, num5, l10, num4, str4, str5);
    }

    @Nullable
    public final String a() {
        return this.f230196a;
    }

    @Nullable
    public final Integer b() {
        return this.f230197b;
    }

    @Nullable
    public final Integer c() {
        return this.f230198c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Nullable
    public final Long e() {
        return this.f230199d;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpacesProjectData)) {
            return false;
        }
        SpacesProjectData spacesProjectData = (SpacesProjectData) obj;
        return Intrinsics.areEqual(this.f230196a, spacesProjectData.f230196a) && Intrinsics.areEqual(this.f230197b, spacesProjectData.f230197b) && Intrinsics.areEqual(this.f230198c, spacesProjectData.f230198c) && Intrinsics.areEqual(this.f230199d, spacesProjectData.f230199d) && Intrinsics.areEqual(this.f230200e, spacesProjectData.f230200e) && Intrinsics.areEqual(this.f230201f, spacesProjectData.f230201f) && Intrinsics.areEqual(this.f230202g, spacesProjectData.f230202g);
    }

    @Nullable
    public final Integer f() {
        return this.f230200e;
    }

    @Nullable
    public final String g() {
        return this.f230201f;
    }

    @Nullable
    public final String h() {
        return this.f230202g;
    }

    public int hashCode() {
        String str = this.f230196a;
        int iHashCode = 0;
        int iHashCode2 = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f230197b;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f230198c;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l10 = this.f230199d;
        int iHashCode5 = (iHashCode4 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Integer num3 = this.f230200e;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.f230201f;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f230202g;
        if (str3 != null) {
            iHashCode = str3.hashCode();
        }
        return iHashCode7 + iHashCode;
    }

    @NotNull
    public final SpacesProjectData i(@Nullable String str, @Nullable Integer num, @Nullable Integer num2, @Nullable Long l10, @Nullable Integer num3, @Nullable String str2, @Nullable String str3) {
        return new SpacesProjectData(str, num, num2, l10, num3, str2, str3);
    }

    @Nullable
    public final String k() {
        return this.f230196a;
    }

    @Nullable
    public final String l() {
        return this.f230202g;
    }

    @Nullable
    public final Integer m() {
        return this.f230197b;
    }

    @Nullable
    public final String n() {
        return this.f230201f;
    }

    @Nullable
    public final Integer o() {
        return this.f230198c;
    }

    @Nullable
    public final Long p() {
        return this.f230199d;
    }

    @Nullable
    public final Integer q() {
        return this.f230200e;
    }

    public final boolean r() {
        return this.f230196a == null;
    }

    public final void s(@Nullable String str) {
        this.f230196a = str;
    }

    public final void t(@Nullable String str) {
        this.f230202g = str;
    }

    @NotNull
    public String toString() {
        return "SpacesProjectData(address=" + this.f230196a + ", bedrooms=" + this.f230197b + ", livingAreaValue=" + this.f230198c + ", price=" + this.f230199d + ", yearBuilt=" + this.f230200e + ", idea=" + this.f230201f + ", backgroundImageUrl=" + this.f230202g + ")";
    }

    public final void u(@Nullable Integer num) {
        this.f230197b = num;
    }

    public final void v(@Nullable String str) {
        this.f230201f = str;
    }

    public final void w(@Nullable Integer num) {
        this.f230198c = num;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i10) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f230196a);
        Integer num = this.f230197b;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        Integer num2 = this.f230198c;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
        Long l10 = this.f230199d;
        if (l10 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l10.longValue());
        }
        Integer num3 = this.f230200e;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num3.intValue());
        }
        dest.writeString(this.f230201f);
        dest.writeString(this.f230202g);
    }

    public final void x(@Nullable Long l10) {
        this.f230199d = l10;
    }

    public final void y(@Nullable Integer num) {
        this.f230200e = num;
    }

    public SpacesProjectData() {
        this(null, null, null, null, null, null, null);
    }
}
