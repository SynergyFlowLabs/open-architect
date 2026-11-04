package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class ObservableChar extends b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableChar> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final long f49249c = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private char f49250b;

    class a implements Parcelable.Creator<ObservableChar> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ObservableChar createFromParcel(Parcel parcel) {
            return new ObservableChar((char) parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ObservableChar[] newArray(int i10) {
            return new ObservableChar[i10];
        }
    }

    public ObservableChar(char c10) {
        this.f49250b = c10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public char f() {
        return this.f49250b;
    }

    public void g(char c10) {
        if (c10 != this.f49250b) {
            this.f49250b = c10;
            c();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f49250b);
    }

    public ObservableChar() {
    }

    public ObservableChar(u... uVarArr) {
        super(uVarArr);
    }
}
