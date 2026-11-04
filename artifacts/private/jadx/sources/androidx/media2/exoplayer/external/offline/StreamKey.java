package androidx.media2.exoplayer.external.offline;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class StreamKey implements Comparable<StreamKey>, Parcelable {
    public static final Parcelable.Creator<StreamKey> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f55607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f55608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f55609c;

    class a implements Parcelable.Creator<StreamKey> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public StreamKey createFromParcel(Parcel in) {
            return new StreamKey(in);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public StreamKey[] newArray(int size) {
            return new StreamKey[size];
        }
    }

    public StreamKey(int groupIndex, int trackIndex) {
        this(0, groupIndex, trackIndex);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NonNull StreamKey o10) {
        int i10 = this.f55607a - o10.f55607a;
        return (i10 == 0 && (i10 = this.f55608b - o10.f55608b) == 0) ? this.f55609c - o10.f55609c : i10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@p0 Object o10) {
        if (this == o10) {
            return true;
        }
        if (o10 != null && StreamKey.class == o10.getClass()) {
            StreamKey streamKey = (StreamKey) o10;
            if (this.f55607a == streamKey.f55607a && this.f55608b == streamKey.f55608b && this.f55609c == streamKey.f55609c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.f55607a * 31) + this.f55608b) * 31) + this.f55609c;
    }

    public String toString() {
        int i10 = this.f55607a;
        int i11 = this.f55608b;
        int i12 = this.f55609c;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append(i10);
        sb2.append(".");
        sb2.append(i11);
        sb2.append(".");
        sb2.append(i12);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.f55607a);
        dest.writeInt(this.f55608b);
        dest.writeInt(this.f55609c);
    }

    public StreamKey(int periodIndex, int groupIndex, int trackIndex) {
        this.f55607a = periodIndex;
        this.f55608b = groupIndex;
        this.f55609c = trackIndex;
    }

    StreamKey(Parcel in) {
        this.f55607a = in.readInt();
        this.f55608b = in.readInt();
        this.f55609c = in.readInt();
    }
}
