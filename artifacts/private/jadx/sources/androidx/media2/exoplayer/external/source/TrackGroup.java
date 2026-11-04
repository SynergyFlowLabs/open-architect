package androidx.media2.exoplayer.external.source;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media2.exoplayer.external.Format;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
public final class TrackGroup implements Parcelable {
    public static final Parcelable.Creator<TrackGroup> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f55653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Format[] f55654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f55655c;

    class a implements Parcelable.Creator<TrackGroup> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TrackGroup createFromParcel(Parcel in) {
            return new TrackGroup(in);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public TrackGroup[] newArray(int size) {
            return new TrackGroup[size];
        }
    }

    public TrackGroup(Format... formats) {
        androidx.media2.exoplayer.external.util.a.i(formats.length > 0);
        this.f55654b = formats;
        this.f55653a = formats.length;
    }

    public Format a(int index) {
        return this.f55654b[index];
    }

    public int b(Format format) {
        int i10 = 0;
        while (true) {
            Format[] formatArr = this.f55654b;
            if (i10 >= formatArr.length) {
                return -1;
            }
            if (format == formatArr[i10]) {
                return i10;
            }
            i10++;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && TrackGroup.class == obj.getClass()) {
            TrackGroup trackGroup = (TrackGroup) obj;
            if (this.f55653a == trackGroup.f55653a && Arrays.equals(this.f55654b, trackGroup.f55654b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f55655c == 0) {
            this.f55655c = 527 + Arrays.hashCode(this.f55654b);
        }
        return this.f55655c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.f55653a);
        for (int i10 = 0; i10 < this.f55653a; i10++) {
            dest.writeParcelable(this.f55654b[i10], 0);
        }
    }

    TrackGroup(Parcel in) {
        int i10 = in.readInt();
        this.f55653a = i10;
        this.f55654b = new Format[i10];
        for (int i11 = 0; i11 < this.f55653a; i11++) {
            this.f55654b[i11] = (Format) in.readParcelable(Format.class.getClassLoader());
        }
    }
}
