package androidx.media2.exoplayer.external.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.util.q0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class GeobFrame extends Id3Frame {
    public static final Parcelable.Creator<GeobFrame> CREATOR = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f55503f = "GEOB";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f55505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f55506d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f55507e;

    class a implements Parcelable.Creator<GeobFrame> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public GeobFrame createFromParcel(Parcel in) {
            return new GeobFrame(in);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public GeobFrame[] newArray(int size) {
            return new GeobFrame[size];
        }
    }

    public GeobFrame(String mimeType, String filename, String description, byte[] data) {
        super("GEOB");
        this.f55504b = mimeType;
        this.f55505c = filename;
        this.f55506d = description;
        this.f55507e = data;
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && GeobFrame.class == obj.getClass()) {
            GeobFrame geobFrame = (GeobFrame) obj;
            if (q0.b(this.f55504b, geobFrame.f55504b) && q0.b(this.f55505c, geobFrame.f55505c) && q0.b(this.f55506d, geobFrame.f55506d) && Arrays.equals(this.f55507e, geobFrame.f55507e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f55504b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f55505c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f55506d;
        return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Arrays.hashCode(this.f55507e);
    }

    @Override // androidx.media2.exoplayer.external.metadata.id3.Id3Frame
    public String toString() {
        String str = this.f55508a;
        String str2 = this.f55504b;
        String str3 = this.f55505c;
        String str4 = this.f55506d;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 36 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb2.append(str);
        sb2.append(": mimeType=");
        sb2.append(str2);
        sb2.append(", filename=");
        sb2.append(str3);
        sb2.append(", description=");
        sb2.append(str4);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.f55504b);
        dest.writeString(this.f55505c);
        dest.writeString(this.f55506d);
        dest.writeByteArray(this.f55507e);
    }

    GeobFrame(Parcel in) {
        super("GEOB");
        this.f55504b = (String) q0.i(in.readString());
        this.f55505c = (String) q0.i(in.readString());
        this.f55506d = (String) q0.i(in.readString());
        this.f55507e = (byte[]) q0.i(in.createByteArray());
    }
}
