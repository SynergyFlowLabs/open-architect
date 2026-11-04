package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.b1;

/* JADX INFO: loaded from: classes3.dex */
@e.a({"BanParcelableUsage"})
@b1({b1.a.LIBRARY})
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f75983a;

    static class a implements Parcelable.Creator<ParcelImpl> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelImpl createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelImpl[] newArray(int i10) {
            return new ParcelImpl[i10];
        }
    }

    public ParcelImpl(h hVar) {
        this.f75983a = hVar;
    }

    public <T extends h> T a() {
        return (T) this.f75983a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        new f(parcel).l1(this.f75983a);
    }

    protected ParcelImpl(Parcel parcel) {
        this.f75983a = new f(parcel).g0();
    }
}
