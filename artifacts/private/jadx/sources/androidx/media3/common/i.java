package androidx.media3.common;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.common.collect.l6;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public final class i extends Binder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f60627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f60628c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f60629d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f60630e = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l6<Bundle> f60631a;

    static {
        f60627b = androidx.media3.common.util.k1.f61540a >= 30 ? IBinder.getSuggestedMaxIpcSizeBytes() : 65536;
    }

    public i(List<Bundle> list) {
        this.f60631a = l6.w(list);
    }

    public static l6<Bundle> a(IBinder iBinder) {
        return iBinder instanceof i ? ((i) iBinder).f60631a : b(iBinder);
    }

    @androidx.annotation.l1
    static l6<Bundle> b(IBinder iBinder) {
        int i10;
        l6.a aVarS = l6.s();
        int i11 = 0;
        int i12 = 1;
        while (i12 != 0) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInt(i11);
                try {
                    iBinder.transact(1, parcelObtain, parcelObtain2, 0);
                    while (true) {
                        i10 = parcelObtain2.readInt();
                        if (i10 == 1) {
                            aVarS.a((Bundle) androidx.media3.common.util.a.g(parcelObtain2.readBundle()));
                            i11++;
                        }
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    i12 = i10;
                } catch (RemoteException e10) {
                    throw new RuntimeException(e10);
                }
            } catch (Throwable th2) {
                parcelObtain2.recycle();
                parcelObtain.recycle();
                throw th2;
            }
        }
        return aVarS.e();
    }

    @Override // android.os.Binder
    protected boolean onTransact(int i10, Parcel parcel, @androidx.annotation.p0 Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return super.onTransact(i10, parcel, parcel2, i11);
        }
        if (parcel2 == null) {
            return false;
        }
        int size = this.f60631a.size();
        int i12 = parcel.readInt();
        while (i12 < size && parcel2.dataSize() < f60627b) {
            parcel2.writeInt(1);
            parcel2.writeBundle(this.f60631a.get(i12));
            i12++;
        }
        parcel2.writeInt(i12 < size ? 2 : 0);
        return true;
    }
}
