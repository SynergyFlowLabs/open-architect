package androidx.media2.session;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.versionedparcelable.ParcelImpl;

/* JADX INFO: loaded from: classes2.dex */
public interface d extends IInterface {

    public static class a implements d {
        @Override // androidx.media2.session.d
        public void D3(androidx.media2.session.b bVar, ParcelImpl parcelImpl) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }
    }

    public static abstract class b extends Binder implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final String f58827a = "androidx.media2.session.IMediaSessionService";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final int f58828b = 1;

        private static class a implements d {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static d f58829b;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f58830a;

            a(IBinder iBinder) {
                this.f58830a = iBinder;
            }

            @Override // androidx.media2.session.d
            public void D3(androidx.media2.session.b bVar, ParcelImpl parcelImpl) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f58827a);
                    parcelObtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    if (parcelImpl != null) {
                        parcelObtain.writeInt(1);
                        parcelImpl.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.f58830a.transact(1, parcelObtain, null, 1) || b.zf() == null) {
                        parcelObtain.recycle();
                    } else {
                        b.zf().D3(bVar, parcelImpl);
                        parcelObtain.recycle();
                    }
                } catch (Throwable th2) {
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f58830a;
            }

            public String i() {
                return b.f58827a;
            }
        }

        public b() {
            attachInterface(this, f58827a);
        }

        public static boolean Af(d dVar) {
            if (a.f58829b != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (dVar == null) {
                return false;
            }
            a.f58829b = dVar;
            return true;
        }

        public static d yf(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(f58827a);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof d)) ? new a(iBinder) : (d) iInterfaceQueryLocalInterface;
        }

        public static d zf() {
            return a.f58829b;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 == 1) {
                parcel.enforceInterface(f58827a);
                D3(androidx.media2.session.b.AbstractBinderC0546b.i(parcel.readStrongBinder()), parcel.readInt() != 0 ? ParcelImpl.CREATOR.createFromParcel(parcel) : null);
                return true;
            }
            if (i10 != 1598968902) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            parcel2.writeString(f58827a);
            return true;
        }
    }

    void D3(androidx.media2.session.b bVar, ParcelImpl parcelImpl) throws RemoteException;
}
