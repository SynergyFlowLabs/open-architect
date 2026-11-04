package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class ObservableDouble extends b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableDouble> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final long f49251c = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f49252b;

    class a implements Parcelable.Creator<ObservableDouble> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ObservableDouble createFromParcel(Parcel parcel) {
            return new ObservableDouble(parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ObservableDouble[] newArray(int i10) {
            return new ObservableDouble[i10];
        }
    }

    public ObservableDouble(double d10) {
        this.f49252b = d10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public double f() {
        return this.f49252b;
    }

    public void g(double d10) {
        if (d10 != this.f49252b) {
            this.f49252b = d10;
            c();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeDouble(this.f49252b);
    }

    public ObservableDouble() {
    }

    public ObservableDouble(u... uVarArr) {
        super(uVarArr);
    }
}
