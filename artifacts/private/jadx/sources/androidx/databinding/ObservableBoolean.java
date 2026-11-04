package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class ObservableBoolean extends b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableBoolean> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final long f49245c = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f49246b;

    class a implements Parcelable.Creator<ObservableBoolean> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ObservableBoolean createFromParcel(Parcel parcel) {
            return new ObservableBoolean(parcel.readInt() == 1);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ObservableBoolean[] newArray(int i10) {
            return new ObservableBoolean[i10];
        }
    }

    public ObservableBoolean(boolean z10) {
        this.f49246b = z10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean f() {
        return this.f49246b;
    }

    public void g(boolean z10) {
        if (z10 != this.f49246b) {
            this.f49246b = z10;
            c();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f49246b ? 1 : 0);
    }

    public ObservableBoolean() {
    }

    public ObservableBoolean(u... uVarArr) {
        super(uVarArr);
    }
}
