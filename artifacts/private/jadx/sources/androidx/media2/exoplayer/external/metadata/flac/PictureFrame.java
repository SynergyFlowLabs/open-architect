package androidx.media2.exoplayer.external.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.Format;
import androidx.media2.exoplayer.external.metadata.Metadata;
import androidx.media2.exoplayer.external.util.q0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class PictureFrame implements Metadata.Entry {
    public static final Parcelable.Creator<PictureFrame> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f55449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f55451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f55452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f55453e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f55454f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f55455g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f55456h;

    class a implements Parcelable.Creator<PictureFrame> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PictureFrame createFromParcel(Parcel in) {
            return new PictureFrame(in);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public PictureFrame[] newArray(int size) {
            return new PictureFrame[size];
        }
    }

    public PictureFrame(int pictureType, String mimeType, String description, int width, int height, int depth, int colors, byte[] pictureData) {
        this.f55449a = pictureType;
        this.f55450b = mimeType;
        this.f55451c = description;
        this.f55452d = width;
        this.f55453e = height;
        this.f55454f = depth;
        this.f55455g = colors;
        this.f55456h = pictureData;
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

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && PictureFrame.class == obj.getClass()) {
            PictureFrame pictureFrame = (PictureFrame) obj;
            if (this.f55449a == pictureFrame.f55449a && this.f55450b.equals(pictureFrame.f55450b) && this.f55451c.equals(pictureFrame.f55451c) && this.f55452d == pictureFrame.f55452d && this.f55453e == pictureFrame.f55453e && this.f55454f == pictureFrame.f55454f && this.f55455g == pictureFrame.f55455g && Arrays.equals(this.f55456h, pictureFrame.f55456h)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((527 + this.f55449a) * 31) + this.f55450b.hashCode()) * 31) + this.f55451c.hashCode()) * 31) + this.f55452d) * 31) + this.f55453e) * 31) + this.f55454f) * 31) + this.f55455g) * 31) + Arrays.hashCode(this.f55456h);
    }

    public String toString() {
        String str = this.f55450b;
        String str2 = this.f55451c;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(str2).length());
        sb2.append("Picture: mimeType=");
        sb2.append(str);
        sb2.append(", description=");
        sb2.append(str2);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.f55449a);
        dest.writeString(this.f55450b);
        dest.writeString(this.f55451c);
        dest.writeInt(this.f55452d);
        dest.writeInt(this.f55453e);
        dest.writeInt(this.f55454f);
        dest.writeInt(this.f55455g);
        dest.writeByteArray(this.f55456h);
    }

    PictureFrame(Parcel in) {
        this.f55449a = in.readInt();
        this.f55450b = (String) q0.i(in.readString());
        this.f55451c = (String) q0.i(in.readString());
        this.f55452d = in.readInt();
        this.f55453e = in.readInt();
        this.f55454f = in.readInt();
        this.f55455g = in.readInt();
        this.f55456h = (byte[]) q0.i(in.createByteArray());
    }
}
