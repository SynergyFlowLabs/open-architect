package androidx.media2.exoplayer.external.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.util.q0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class PrivFrame extends Id3Frame {
    public static final Parcelable.Creator<PrivFrame> CREATOR = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f55519d = "PRIV";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f55521c;

    class a implements Parcelable.Creator<PrivFrame> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PrivFrame createFromParcel(Parcel in) {
            return new PrivFrame(in);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public PrivFrame[] newArray(int size) {
            return new PrivFrame[size];
        }
    }

    public PrivFrame(String owner, byte[] privateData) {
        super("PRIV");
        this.f55520b = owner;
        this.f55521c = privateData;
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && PrivFrame.class == obj.getClass()) {
            PrivFrame privFrame = (PrivFrame) obj;
            if (q0.b(this.f55520b, privFrame.f55520b) && Arrays.equals(this.f55521c, privFrame.f55521c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f55520b;
        return ((527 + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f55521c);
    }

    @Override // androidx.media2.exoplayer.external.metadata.id3.Id3Frame
    public String toString() {
        String str = this.f55508a;
        String str2 = this.f55520b;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 8 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(": owner=");
        sb2.append(str2);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.f55520b);
        dest.writeByteArray(this.f55521c);
    }

    PrivFrame(Parcel in) {
        super("PRIV");
        this.f55520b = (String) q0.i(in.readString());
        this.f55521c = (byte[]) q0.i(in.createByteArray());
    }
}
