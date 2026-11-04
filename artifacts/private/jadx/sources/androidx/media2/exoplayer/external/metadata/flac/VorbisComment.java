package androidx.media2.exoplayer.external.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.Format;
import androidx.media2.exoplayer.external.metadata.Metadata;
import androidx.media2.exoplayer.external.util.q0;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class VorbisComment implements Metadata.Entry {
    public static final Parcelable.Creator<VorbisComment> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f55457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55458b;

    class a implements Parcelable.Creator<VorbisComment> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public VorbisComment createFromParcel(Parcel in) {
            return new VorbisComment(in);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public VorbisComment[] newArray(int size) {
            return new VorbisComment[size];
        }
    }

    public VorbisComment(String key, String value) {
        this.f55457a = key;
        this.f55458b = value;
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
        if (obj != null && VorbisComment.class == obj.getClass()) {
            VorbisComment vorbisComment = (VorbisComment) obj;
            if (this.f55457a.equals(vorbisComment.f55457a) && this.f55458b.equals(vorbisComment.f55458b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.f55457a.hashCode()) * 31) + this.f55458b.hashCode();
    }

    public String toString() {
        String str = this.f55457a;
        String str2 = this.f55458b;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 5 + String.valueOf(str2).length());
        sb2.append("VC: ");
        sb2.append(str);
        sb2.append("=");
        sb2.append(str2);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.f55457a);
        dest.writeString(this.f55458b);
    }

    VorbisComment(Parcel in) {
        this.f55457a = (String) q0.i(in.readString());
        this.f55458b = (String) q0.i(in.readString());
    }
}
