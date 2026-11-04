package androidx.media2.exoplayer.external.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.util.q0;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class InternalFrame extends Id3Frame {
    public static final Parcelable.Creator<InternalFrame> CREATOR = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f55509e = "----";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f55511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f55512d;

    class a implements Parcelable.Creator<InternalFrame> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public InternalFrame createFromParcel(Parcel in) {
            return new InternalFrame(in);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public InternalFrame[] newArray(int size) {
            return new InternalFrame[size];
        }
    }

    public InternalFrame(String domain, String description, String text) {
        super("----");
        this.f55510b = domain;
        this.f55511c = description;
        this.f55512d = text;
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && InternalFrame.class == obj.getClass()) {
            InternalFrame internalFrame = (InternalFrame) obj;
            if (q0.b(this.f55511c, internalFrame.f55511c) && q0.b(this.f55510b, internalFrame.f55510b) && q0.b(this.f55512d, internalFrame.f55512d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f55510b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f55511c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f55512d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // androidx.media2.exoplayer.external.metadata.id3.Id3Frame
    public String toString() {
        String str = this.f55508a;
        String str2 = this.f55510b;
        String str3 = this.f55511c;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 23 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb2.append(str);
        sb2.append(": domain=");
        sb2.append(str2);
        sb2.append(", description=");
        sb2.append(str3);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.f55508a);
        dest.writeString(this.f55510b);
        dest.writeString(this.f55512d);
    }

    InternalFrame(Parcel in) {
        super("----");
        this.f55510b = (String) q0.i(in.readString());
        this.f55511c = (String) q0.i(in.readString());
        this.f55512d = (String) q0.i(in.readString());
    }
}
