package androidx.media3.common;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public final class StreamKey implements Comparable<StreamKey>, Parcelable {
    public static final Parcelable.Creator<StreamKey> CREATOR = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f60274d = androidx.media3.common.util.k1.c1(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f60275e = androidx.media3.common.util.k1.c1(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f60276f = androidx.media3.common.util.k1.c1(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f60277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f60278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f60279c;

    class a implements Parcelable.Creator<StreamKey> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public StreamKey createFromParcel(Parcel parcel) {
            return new StreamKey(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public StreamKey[] newArray(int i10) {
            return new StreamKey[i10];
        }
    }

    public StreamKey(int i10, int i11) {
        this(0, i10, i11);
    }

    public static StreamKey c(Bundle bundle) {
        return new StreamKey(bundle.getInt(f60274d, 0), bundle.getInt(f60275e, 0), bundle.getInt(f60276f, 0));
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(StreamKey streamKey) {
        int i10 = this.f60277a - streamKey.f60277a;
        return (i10 == 0 && (i10 = this.f60278b - streamKey.f60278b) == 0) ? this.f60279c - streamKey.f60279c : i10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && StreamKey.class == obj.getClass()) {
            StreamKey streamKey = (StreamKey) obj;
            if (this.f60277a == streamKey.f60277a && this.f60278b == streamKey.f60278b && this.f60279c == streamKey.f60279c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.f60277a * 31) + this.f60278b) * 31) + this.f60279c;
    }

    public Bundle k() {
        Bundle bundle = new Bundle();
        int i10 = this.f60277a;
        if (i10 != 0) {
            bundle.putInt(f60274d, i10);
        }
        int i11 = this.f60278b;
        if (i11 != 0) {
            bundle.putInt(f60275e, i11);
        }
        int i12 = this.f60279c;
        if (i12 != 0) {
            bundle.putInt(f60276f, i12);
        }
        return bundle;
    }

    public String toString() {
        return this.f60277a + "." + this.f60278b + "." + this.f60279c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f60277a);
        parcel.writeInt(this.f60278b);
        parcel.writeInt(this.f60279c);
    }

    public StreamKey(int i10, int i11, int i12) {
        this.f60277a = i10;
        this.f60278b = i11;
        this.f60279c = i12;
    }

    StreamKey(Parcel parcel) {
        this.f60277a = parcel.readInt();
        this.f60278b = parcel.readInt();
        this.f60279c = parcel.readInt();
    }
}
