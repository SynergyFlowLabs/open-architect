package androidx.media2.exoplayer.external.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.util.q0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class ApicFrame extends Id3Frame {
    public static final Parcelable.Creator<ApicFrame> CREATOR = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f55480f = "APIC";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    public final String f55482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f55483d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f55484e;

    class a implements Parcelable.Creator<ApicFrame> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ApicFrame createFromParcel(Parcel in) {
            return new ApicFrame(in);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ApicFrame[] newArray(int size) {
            return new ApicFrame[size];
        }
    }

    public ApicFrame(String mimeType, @p0 String description, int pictureType, byte[] pictureData) {
        super("APIC");
        this.f55481b = mimeType;
        this.f55482c = description;
        this.f55483d = pictureType;
        this.f55484e = pictureData;
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ApicFrame.class == obj.getClass()) {
            ApicFrame apicFrame = (ApicFrame) obj;
            if (this.f55483d == apicFrame.f55483d && q0.b(this.f55481b, apicFrame.f55481b) && q0.b(this.f55482c, apicFrame.f55482c) && Arrays.equals(this.f55484e, apicFrame.f55484e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = (527 + this.f55483d) * 31;
        String str = this.f55481b;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f55482c;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.f55484e);
    }

    @Override // androidx.media2.exoplayer.external.metadata.id3.Id3Frame
    public String toString() {
        String str = this.f55508a;
        String str2 = this.f55481b;
        String str3 = this.f55482c;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 25 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb2.append(str);
        sb2.append(": mimeType=");
        sb2.append(str2);
        sb2.append(", description=");
        sb2.append(str3);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.f55481b);
        dest.writeString(this.f55482c);
        dest.writeInt(this.f55483d);
        dest.writeByteArray(this.f55484e);
    }

    ApicFrame(Parcel in) {
        super("APIC");
        this.f55481b = (String) q0.i(in.readString());
        this.f55482c = (String) q0.i(in.readString());
        this.f55483d = in.readInt();
        this.f55484e = (byte[]) q0.i(in.createByteArray());
    }
}
