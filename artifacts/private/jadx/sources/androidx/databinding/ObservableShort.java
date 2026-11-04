package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class ObservableShort extends b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableShort> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final long f49260c = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private short f49261b;

    class a implements Parcelable.Creator<ObservableShort> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ObservableShort createFromParcel(Parcel parcel) {
            return new ObservableShort((short) parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ObservableShort[] newArray(int i10) {
            return new ObservableShort[i10];
        }
    }

    public ObservableShort(short s10) {
        this.f49261b = s10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public short f() {
        return this.f49261b;
    }

    public void g(short s10) {
        if (s10 != this.f49261b) {
            this.f49261b = s10;
            c();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f49261b);
    }

    public ObservableShort() {
    }

    public ObservableShort(u... uVarArr) {
        super(uVarArr);
    }
}
