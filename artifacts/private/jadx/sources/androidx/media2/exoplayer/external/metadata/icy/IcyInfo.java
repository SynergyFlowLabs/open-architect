package androidx.media2.exoplayer.external.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.Format;
import androidx.media2.exoplayer.external.metadata.Metadata;
import androidx.media2.exoplayer.external.util.q0;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class IcyInfo implements Metadata.Entry {
    public static final Parcelable.Creator<IcyInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    public final String f55474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    public final String f55475b;

    class a implements Parcelable.Creator<IcyInfo> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public IcyInfo createFromParcel(Parcel in) {
            return new IcyInfo(in);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public IcyInfo[] newArray(int size) {
            return new IcyInfo[size];
        }
    }

    public IcyInfo(@p0 String title, @p0 String url) {
        this.f55474a = title;
        this.f55475b = url;
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
        if (obj != null && IcyInfo.class == obj.getClass()) {
            IcyInfo icyInfo = (IcyInfo) obj;
            if (q0.b(this.f55474a, icyInfo.f55474a) && q0.b(this.f55475b, icyInfo.f55475b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f55474a;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f55475b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.f55474a;
        String str2 = this.f55475b;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length());
        sb2.append("ICY: title=\"");
        sb2.append(str);
        sb2.append("\", url=\"");
        sb2.append(str2);
        sb2.append("\"");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.f55474a);
        dest.writeString(this.f55475b);
    }

    IcyInfo(Parcel in) {
        this.f55474a = in.readString();
        this.f55475b = in.readString();
    }
}
