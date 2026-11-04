package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class ObservableByte extends b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableByte> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final long f49247c = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte f49248b;

    class a implements Parcelable.Creator<ObservableByte> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ObservableByte createFromParcel(Parcel parcel) {
            return new ObservableByte(parcel.readByte());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ObservableByte[] newArray(int i10) {
            return new ObservableByte[i10];
        }
    }

    public ObservableByte(byte b10) {
        this.f49248b = b10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public byte f() {
        return this.f49248b;
    }

    public void g(byte b10) {
        if (b10 != this.f49248b) {
            this.f49248b = b10;
            c();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByte(this.f49248b);
    }

    public ObservableByte() {
    }

    public ObservableByte(u... uVarArr) {
        super(uVarArr);
    }
}
