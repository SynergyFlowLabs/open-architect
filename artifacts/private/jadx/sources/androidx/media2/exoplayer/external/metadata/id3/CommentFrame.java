package androidx.media2.exoplayer.external.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.util.q0;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class CommentFrame extends Id3Frame {
    public static final Parcelable.Creator<CommentFrame> CREATOR = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f55499e = "COMM";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f55501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f55502d;

    class a implements Parcelable.Creator<CommentFrame> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CommentFrame createFromParcel(Parcel in) {
            return new CommentFrame(in);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public CommentFrame[] newArray(int size) {
            return new CommentFrame[size];
        }
    }

    public CommentFrame(String language, String description, String text) {
        super("COMM");
        this.f55500b = language;
        this.f55501c = description;
        this.f55502d = text;
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && CommentFrame.class == obj.getClass()) {
            CommentFrame commentFrame = (CommentFrame) obj;
            if (q0.b(this.f55501c, commentFrame.f55501c) && q0.b(this.f55500b, commentFrame.f55500b) && q0.b(this.f55502d, commentFrame.f55502d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f55500b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f55501c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f55502d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // androidx.media2.exoplayer.external.metadata.id3.Id3Frame
    public String toString() {
        String str = this.f55508a;
        String str2 = this.f55500b;
        String str3 = this.f55501c;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 25 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb2.append(str);
        sb2.append(": language=");
        sb2.append(str2);
        sb2.append(", description=");
        sb2.append(str3);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.f55508a);
        dest.writeString(this.f55500b);
        dest.writeString(this.f55502d);
    }

    CommentFrame(Parcel in) {
        super("COMM");
        this.f55500b = (String) q0.i(in.readString());
        this.f55501c = (String) q0.i(in.readString());
        this.f55502d = (String) q0.i(in.readString());
    }
}
