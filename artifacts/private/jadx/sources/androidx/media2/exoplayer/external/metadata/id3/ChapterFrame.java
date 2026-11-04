package androidx.media2.exoplayer.external.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.util.q0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class ChapterFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterFrame> CREATOR = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f55486h = "CHAP";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f55488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f55489d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f55490e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f55491f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Id3Frame[] f55492g;

    class a implements Parcelable.Creator<ChapterFrame> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ChapterFrame createFromParcel(Parcel in) {
            return new ChapterFrame(in);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ChapterFrame[] newArray(int size) {
            return new ChapterFrame[size];
        }
    }

    public ChapterFrame(String chapterId, int startTimeMs, int endTimeMs, long startOffset, long endOffset, Id3Frame[] subFrames) {
        super("CHAP");
        this.f55487b = chapterId;
        this.f55488c = startTimeMs;
        this.f55489d = endTimeMs;
        this.f55490e = startOffset;
        this.f55491f = endOffset;
        this.f55492g = subFrames;
    }

    public Id3Frame a(int index) {
        return this.f55492g[index];
    }

    public int b() {
        return this.f55492g.length;
    }

    @Override // androidx.media2.exoplayer.external.metadata.id3.Id3Frame, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ChapterFrame.class == obj.getClass()) {
            ChapterFrame chapterFrame = (ChapterFrame) obj;
            if (this.f55488c == chapterFrame.f55488c && this.f55489d == chapterFrame.f55489d && this.f55490e == chapterFrame.f55490e && this.f55491f == chapterFrame.f55491f && q0.b(this.f55487b, chapterFrame.f55487b) && Arrays.equals(this.f55492g, chapterFrame.f55492g)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = (((((((527 + this.f55488c) * 31) + this.f55489d) * 31) + ((int) this.f55490e)) * 31) + ((int) this.f55491f)) * 31;
        String str = this.f55487b;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.f55487b);
        dest.writeInt(this.f55488c);
        dest.writeInt(this.f55489d);
        dest.writeLong(this.f55490e);
        dest.writeLong(this.f55491f);
        dest.writeInt(this.f55492g.length);
        for (Id3Frame id3Frame : this.f55492g) {
            dest.writeParcelable(id3Frame, 0);
        }
    }

    ChapterFrame(Parcel in) {
        super("CHAP");
        this.f55487b = (String) q0.i(in.readString());
        this.f55488c = in.readInt();
        this.f55489d = in.readInt();
        this.f55490e = in.readLong();
        this.f55491f = in.readLong();
        int i10 = in.readInt();
        this.f55492g = new Id3Frame[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.f55492g[i11] = (Id3Frame) in.readParcelable(Id3Frame.class.getClassLoader());
        }
    }
}
