package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class ObservableFloat extends b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableFloat> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final long f49253c = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f49254b;

    class a implements Parcelable.Creator<ObservableFloat> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ObservableFloat createFromParcel(Parcel parcel) {
            return new ObservableFloat(parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ObservableFloat[] newArray(int i10) {
            return new ObservableFloat[i10];
        }
    }

    public ObservableFloat(float f10) {
        this.f49254b = f10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public float f() {
        return this.f49254b;
    }

    public void g(float f10) {
        if (f10 != this.f49254b) {
            this.f49254b = f10;
            c();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f49254b);
    }

    public ObservableFloat() {
    }

    public ObservableFloat(u... uVarArr) {
        super(uVarArr);
    }
}
