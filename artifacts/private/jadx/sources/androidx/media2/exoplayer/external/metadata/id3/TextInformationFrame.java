package androidx.media2.exoplayer.external.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.util.q0;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class TextInformationFrame extends Id3Frame {
    public static final Parcelable.Creator<TextInformationFrame> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    public final String f55522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f55523c;

    class a implements Parcelable.Creator<TextInformationFrame> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TextInformationFrame createFromParcel(Parcel in) {
            return new TextInformationFrame(in);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public TextInformationFrame[] newArray(int size) {
            return new TextInformationFrame[size];
        }
    }

    public TextInformationFrame(String id2, @p0 String description, String value) {
        super(id2);
        this.f55522b = description;
        this.f55523c = value;
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && TextInformationFrame.class == obj.getClass()) {
            TextInformationFrame textInformationFrame = (TextInformationFrame) obj;
            if (this.f55508a.equals(textInformationFrame.f55508a) && q0.b(this.f55522b, textInformationFrame.f55522b) && q0.b(this.f55523c, textInformationFrame.f55523c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (527 + this.f55508a.hashCode()) * 31;
        String str = this.f55522b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f55523c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // androidx.media2.exoplayer.external.metadata.id3.Id3Frame
    public String toString() {
        String str = this.f55508a;
        String str2 = this.f55522b;
        String str3 = this.f55523c;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 22 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb2.append(str);
        sb2.append(": description=");
        sb2.append(str2);
        sb2.append(": value=");
        sb2.append(str3);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.f55508a);
        dest.writeString(this.f55522b);
        dest.writeString(this.f55523c);
    }

    TextInformationFrame(Parcel in) {
        super((String) q0.i(in.readString()));
        this.f55522b = in.readString();
        this.f55523c = (String) q0.i(in.readString());
    }
}
