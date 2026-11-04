package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class ObservableInt extends b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableInt> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final long f49255c = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f49256b;

    class a implements Parcelable.Creator<ObservableInt> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ObservableInt createFromParcel(Parcel parcel) {
            return new ObservableInt(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ObservableInt[] newArray(int i10) {
            return new ObservableInt[i10];
        }
    }

    public ObservableInt(int i10) {
        this.f49256b = i10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int f() {
        return this.f49256b;
    }

    public void g(int i10) {
        if (i10 != this.f49256b) {
            this.f49256b = i10;
            c();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f49256b);
    }

    public ObservableInt() {
    }

    public ObservableInt(u... uVarArr) {
        super(uVarArr);
    }
}
