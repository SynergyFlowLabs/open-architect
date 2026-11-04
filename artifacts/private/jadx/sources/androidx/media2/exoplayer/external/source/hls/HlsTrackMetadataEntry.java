package androidx.media2.exoplayer.external.source.hls;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.Format;
import androidx.media2.exoplayer.external.metadata.Metadata;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class HlsTrackMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<HlsTrackMetadataEntry> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    public final String f55932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    public final String f55933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<VariantInfo> f55934c;

    class a implements Parcelable.Creator<HlsTrackMetadataEntry> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public HlsTrackMetadataEntry createFromParcel(Parcel in) {
            return new HlsTrackMetadataEntry(in);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public HlsTrackMetadataEntry[] newArray(int size) {
            return new HlsTrackMetadataEntry[size];
        }
    }

    public HlsTrackMetadataEntry(@p0 String groupId, @p0 String name, List<VariantInfo> variantInfos) {
        this.f55932a = groupId;
        this.f55933b = name;
        this.f55934c = Collections.unmodifiableList(new ArrayList(variantInfos));
    }

    @Override // androidx.media2.exoplayer.external.metadata.Metadata.Entry
    public Format O0() {
        return androidx.media2.exoplayer.external.metadata.a.b(this);
    }

    @Override // androidx.media2.exoplayer.external.metadata.Metadata.Entry
    public byte[] Y() {
        return androidx.media2.exoplayer.external.metadata.a.a(this);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@p0 Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && HlsTrackMetadataEntry.class == other.getClass()) {
            HlsTrackMetadataEntry hlsTrackMetadataEntry = (HlsTrackMetadataEntry) other;
            if (TextUtils.equals(this.f55932a, hlsTrackMetadataEntry.f55932a) && TextUtils.equals(this.f55933b, hlsTrackMetadataEntry.f55933b) && this.f55934c.equals(hlsTrackMetadataEntry.f55934c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f55932a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f55933b;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f55934c.hashCode();
    }

    public String toString() {
        String string;
        String str = this.f55932a;
        if (str != null) {
            String str2 = this.f55933b;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 5 + String.valueOf(str2).length());
            sb2.append(" [");
            sb2.append(str);
            sb2.append(", ");
            sb2.append(str2);
            sb2.append("]");
            string = sb2.toString();
        } else {
            string = "";
        }
        String strValueOf = String.valueOf(string);
        return strValueOf.length() != 0 ? "HlsTrackMetadataEntry".concat(strValueOf) : new String("HlsTrackMetadataEntry");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.f55932a);
        dest.writeString(this.f55933b);
        int size = this.f55934c.size();
        dest.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            dest.writeParcelable(this.f55934c.get(i10), 0);
        }
    }

    HlsTrackMetadataEntry(Parcel in) {
        this.f55932a = in.readString();
        this.f55933b = in.readString();
        int i10 = in.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add((VariantInfo) in.readParcelable(VariantInfo.class.getClassLoader()));
        }
        this.f55934c = Collections.unmodifiableList(arrayList);
    }

    public static final class VariantInfo implements Parcelable {
        public static final Parcelable.Creator<VariantInfo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f55935a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        public final String f55936b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @p0
        public final String f55937c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @p0
        public final String f55938d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @p0
        public final String f55939e;

        class a implements Parcelable.Creator<VariantInfo> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public VariantInfo createFromParcel(Parcel in) {
                return new VariantInfo(in);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public VariantInfo[] newArray(int size) {
                return new VariantInfo[size];
            }
        }

        public VariantInfo(long bitrate, @p0 String videoGroupId, @p0 String audioGroupId, @p0 String subtitleGroupId, @p0 String captionGroupId) {
            this.f55935a = bitrate;
            this.f55936b = videoGroupId;
            this.f55937c = audioGroupId;
            this.f55938d = subtitleGroupId;
            this.f55939e = captionGroupId;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@p0 Object other) {
            if (this == other) {
                return true;
            }
            if (other != null && VariantInfo.class == other.getClass()) {
                VariantInfo variantInfo = (VariantInfo) other;
                if (this.f55935a == variantInfo.f55935a && TextUtils.equals(this.f55936b, variantInfo.f55936b) && TextUtils.equals(this.f55937c, variantInfo.f55937c) && TextUtils.equals(this.f55938d, variantInfo.f55938d) && TextUtils.equals(this.f55939e, variantInfo.f55939e)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            long j10 = this.f55935a;
            int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
            String str = this.f55936b;
            int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f55937c;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f55938d;
            int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f55939e;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeLong(this.f55935a);
            dest.writeString(this.f55936b);
            dest.writeString(this.f55937c);
            dest.writeString(this.f55938d);
            dest.writeString(this.f55939e);
        }

        VariantInfo(Parcel in) {
            this.f55935a = in.readLong();
            this.f55936b = in.readString();
            this.f55937c = in.readString();
            this.f55938d = in.readString();
            this.f55939e = in.readString();
        }
    }
}
