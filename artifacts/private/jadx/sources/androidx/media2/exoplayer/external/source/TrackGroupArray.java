package androidx.media2.exoplayer.external.source;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
public final class TrackGroupArray implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f55657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TrackGroup[] f55658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f55659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final TrackGroupArray f55656d = new TrackGroupArray(new TrackGroup[0]);
    public static final Parcelable.Creator<TrackGroupArray> CREATOR = new a();

    class a implements Parcelable.Creator<TrackGroupArray> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TrackGroupArray createFromParcel(Parcel in) {
            return new TrackGroupArray(in);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public TrackGroupArray[] newArray(int size) {
            return new TrackGroupArray[size];
        }
    }

    public TrackGroupArray(TrackGroup... trackGroups) {
        this.f55658b = trackGroups;
        this.f55657a = trackGroups.length;
    }

    public TrackGroup a(int index) {
        return this.f55658b[index];
    }

    public int b(TrackGroup group) {
        for (int i10 = 0; i10 < this.f55657a; i10++) {
            if (this.f55658b[i10] == group) {
                return i10;
            }
        }
        return -1;
    }

    public boolean c() {
        return this.f55657a == 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && TrackGroupArray.class == obj.getClass()) {
            TrackGroupArray trackGroupArray = (TrackGroupArray) obj;
            if (this.f55657a == trackGroupArray.f55657a && Arrays.equals(this.f55658b, trackGroupArray.f55658b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f55659c == 0) {
            this.f55659c = Arrays.hashCode(this.f55658b);
        }
        return this.f55659c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.f55657a);
        for (int i10 = 0; i10 < this.f55657a; i10++) {
            dest.writeParcelable(this.f55658b[i10], 0);
        }
    }

    TrackGroupArray(Parcel in) {
        int i10 = in.readInt();
        this.f55657a = i10;
        this.f55658b = new TrackGroup[i10];
        int i11 = 3 | 0;
        for (int i12 = 0; i12 < this.f55657a; i12++) {
            this.f55658b[i12] = (TrackGroup) in.readParcelable(TrackGroup.class.getClassLoader());
        }
    }
}
