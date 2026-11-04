package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class ObservableLong extends b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableLong> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final long f49257c = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f49258b;

    class a implements Parcelable.Creator<ObservableLong> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ObservableLong createFromParcel(Parcel parcel) {
            return new ObservableLong(parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ObservableLong[] newArray(int i10) {
            return new ObservableLong[i10];
        }
    }

    public ObservableLong(long j10) {
        this.f49258b = j10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long f() {
        return this.f49258b;
    }

    public void g(long j10) {
        if (j10 != this.f49258b) {
            this.f49258b = j10;
            c();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f49258b);
    }

    public ObservableLong() {
    }

    public ObservableLong(u... uVarArr) {
        super(uVarArr);
    }
}
