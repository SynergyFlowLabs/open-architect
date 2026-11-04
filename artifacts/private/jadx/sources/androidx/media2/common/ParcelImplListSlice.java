package androidx.media2.common;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.versionedparcelable.ParcelImpl;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@e.a({"BanParcelableUsage"})
@b1({b1.a.LIBRARY_GROUP})
public class ParcelImplListSlice implements Parcelable {
    public static final Parcelable.Creator<ParcelImplListSlice> CREATOR = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f53033b = "ParcelImplListSlice";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f53034c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f53035d = 65536;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f53036e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final List<ParcelImpl> f53037a;

    class a extends Binder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f53038a;

        a(int i10) {
            this.f53038a = i10;
        }

        @Override // android.os.Binder
        protected boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 != 1) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            int i12 = parcel.readInt();
            while (i12 < this.f53038a && parcel2.dataSize() < 65536) {
                parcel2.writeInt(1);
                parcel2.writeParcelable(ParcelImplListSlice.this.f53037a.get(i12), i11);
                i12++;
            }
            if (i12 < this.f53038a) {
                parcel2.writeInt(0);
            }
            return true;
        }
    }

    class b implements Parcelable.Creator<ParcelImplListSlice> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelImplListSlice createFromParcel(Parcel parcel) {
            return new ParcelImplListSlice(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelImplListSlice[] newArray(int i10) {
            return new ParcelImplListSlice[i10];
        }
    }

    public ParcelImplListSlice(@NonNull List<ParcelImpl> list) {
        if (list == null) {
            throw new NullPointerException("list shouldn't be null");
        }
        this.f53037a = list;
    }

    @NonNull
    public List<ParcelImpl> a() {
        return this.f53037a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int size = this.f53037a.size();
        parcel.writeInt(size);
        if (size > 0) {
            int i11 = 0;
            while (i11 < size && i11 < 1 && parcel.dataSize() < 65536) {
                parcel.writeInt(1);
                parcel.writeParcelable(this.f53037a.get(i11), i10);
                i11++;
            }
            if (i11 < size) {
                parcel.writeInt(0);
                parcel.writeStrongBinder(new a(size));
            }
        }
    }

    ParcelImplListSlice(Parcel parcel) {
        int i10 = parcel.readInt();
        this.f53037a = new ArrayList(i10);
        if (i10 > 0) {
            int i11 = 0;
            while (i11 < i10 && parcel.readInt() != 0) {
                this.f53037a.add((ParcelImpl) parcel.readParcelable(ParcelImpl.class.getClassLoader()));
                i11++;
            }
            if (i11 < i10) {
                IBinder strongBinder = parcel.readStrongBinder();
                while (i11 < i10) {
                    Parcel parcelObtain = Parcel.obtain();
                    Parcel parcelObtain2 = Parcel.obtain();
                    try {
                        parcelObtain.writeInt(i11);
                        try {
                            strongBinder.transact(1, parcelObtain, parcelObtain2, 0);
                            while (i11 < i10 && parcelObtain2.readInt() != 0) {
                                this.f53037a.add((ParcelImpl) parcelObtain2.readParcelable(ParcelImpl.class.getClassLoader()));
                                i11++;
                            }
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                        } catch (RemoteException unused) {
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            return;
                        }
                    } catch (Throwable th2) {
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                        throw th2;
                    }
                }
            }
        }
    }
}
