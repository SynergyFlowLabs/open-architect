package androidx.media2.exoplayer.external.video;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.util.q0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class ColorInfo implements Parcelable {
    public static final Parcelable.Creator<ColorInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f57730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f57731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f57732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    public final byte[] f57733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f57734e;

    class a implements Parcelable.Creator<ColorInfo> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ColorInfo createFromParcel(Parcel in) {
            return new ColorInfo(in);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ColorInfo[] newArray(int size) {
            return new ColorInfo[size];
        }
    }

    public ColorInfo(int colorSpace, int colorRange, int colorTransfer, @p0 byte[] hdrStaticInfo) {
        this.f57730a = colorSpace;
        this.f57731b = colorRange;
        this.f57732c = colorTransfer;
        this.f57733d = hdrStaticInfo;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ColorInfo.class == obj.getClass()) {
            ColorInfo colorInfo = (ColorInfo) obj;
            if (this.f57730a == colorInfo.f57730a && this.f57731b == colorInfo.f57731b && this.f57732c == colorInfo.f57732c && Arrays.equals(this.f57733d, colorInfo.f57733d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f57734e == 0) {
            this.f57734e = ((((((527 + this.f57730a) * 31) + this.f57731b) * 31) + this.f57732c) * 31) + Arrays.hashCode(this.f57733d);
        }
        return this.f57734e;
    }

    public String toString() {
        int i10 = this.f57730a;
        int i11 = this.f57731b;
        int i12 = this.f57732c;
        boolean z10 = this.f57733d != null;
        StringBuilder sb2 = new StringBuilder(55);
        sb2.append("ColorInfo(");
        sb2.append(i10);
        sb2.append(", ");
        sb2.append(i11);
        sb2.append(", ");
        sb2.append(i12);
        sb2.append(", ");
        sb2.append(z10);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.f57730a);
        dest.writeInt(this.f57731b);
        dest.writeInt(this.f57732c);
        q0.Y0(dest, this.f57733d != null);
        byte[] bArr = this.f57733d;
        if (bArr != null) {
            dest.writeByteArray(bArr);
        }
    }

    ColorInfo(Parcel in) {
        this.f57730a = in.readInt();
        this.f57731b = in.readInt();
        this.f57732c = in.readInt();
        this.f57733d = q0.E0(in) ? in.createByteArray() : null;
    }
}
