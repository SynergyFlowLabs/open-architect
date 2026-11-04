package androidx.media2.exoplayer.external.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.util.q0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class ChapterTocFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterTocFrame> CREATOR = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f55493g = "CTOC";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f55495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f55496d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f55497e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Id3Frame[] f55498f;

    class a implements Parcelable.Creator<ChapterTocFrame> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ChapterTocFrame createFromParcel(Parcel in) {
            return new ChapterTocFrame(in);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ChapterTocFrame[] newArray(int size) {
            return new ChapterTocFrame[size];
        }
    }

    public ChapterTocFrame(String elementId, boolean isRoot, boolean isOrdered, String[] children, Id3Frame[] subFrames) {
        super("CTOC");
        this.f55494b = elementId;
        this.f55495c = isRoot;
        this.f55496d = isOrdered;
        this.f55497e = children;
        this.f55498f = subFrames;
    }

    public Id3Frame a(int index) {
        return this.f55498f[index];
    }

    public int b() {
        return this.f55498f.length;
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ChapterTocFrame.class == obj.getClass()) {
            ChapterTocFrame chapterTocFrame = (ChapterTocFrame) obj;
            if (this.f55495c == chapterTocFrame.f55495c && this.f55496d == chapterTocFrame.f55496d && q0.b(this.f55494b, chapterTocFrame.f55494b) && Arrays.equals(this.f55497e, chapterTocFrame.f55497e) && Arrays.equals(this.f55498f, chapterTocFrame.f55498f)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = (((527 + (this.f55495c ? 1 : 0)) * 31) + (this.f55496d ? 1 : 0)) * 31;
        String str = this.f55494b;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f55494b);
        parcel.writeByte(this.f55495c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f55496d ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f55497e);
        parcel.writeInt(this.f55498f.length);
        for (Id3Frame id3Frame : this.f55498f) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }

    ChapterTocFrame(Parcel in) {
        super("CTOC");
        this.f55494b = (String) q0.i(in.readString());
        this.f55495c = in.readByte() != 0;
        this.f55496d = in.readByte() != 0;
        this.f55497e = (String[]) q0.i(in.createStringArray());
        int i10 = in.readInt();
        this.f55498f = new Id3Frame[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.f55498f[i11] = (Id3Frame) in.readParcelable(Id3Frame.class.getClassLoader());
        }
    }
}
