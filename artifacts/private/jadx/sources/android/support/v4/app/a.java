package android.support.v4.app;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.annotation.b1;

/* JADX INFO: loaded from: classes.dex */
@b1({b1.a.LIBRARY})
public interface a extends IInterface {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f9280y = "android$support$v4$app$INotificationSideChannel".replace('$', '.');

    /* JADX INFO: renamed from: android.support.v4.app.a$a, reason: collision with other inner class name */
    public static class C0011a implements a {
        @Override // android.support.v4.app.a
        public void A8(String str, int i10, String str2, Notification notification) throws RemoteException {
        }

        @Override // android.support.v4.app.a
        public void P3(String str, int i10, String str2) throws RemoteException {
        }

        @Override // android.support.v4.app.a
        public void Vc(String str) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }
    }

    public static abstract class b extends Binder implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final int f9281a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final int f9282b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final int f9283c = 3;

        /* JADX INFO: renamed from: android.support.v4.app.a$b$a, reason: collision with other inner class name */
        private static class C0012a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f9284a;

            C0012a(IBinder iBinder) {
                this.f9284a = iBinder;
            }

            @Override // android.support.v4.app.a
            public void A8(String str, int i10, String str2, Notification notification) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f9280y);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeString(str2);
                    c.d(parcelObtain, notification, 0);
                    int i11 = 0 >> 0;
                    this.f9284a.transact(1, parcelObtain, null, 1);
                    parcelObtain.recycle();
                } catch (Throwable th2) {
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // android.support.v4.app.a
            public void P3(String str, int i10, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f9280y);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeString(str2);
                    this.f9284a.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.app.a
            public void Vc(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f9280y);
                    parcelObtain.writeString(str);
                    this.f9284a.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f9284a;
            }

            public String i() {
                return a.f9280y;
            }
        }

        public b() {
            attachInterface(this, a.f9280y);
        }

        public static a i(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(a.f9280y);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C0012a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            String str = a.f9280y;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i10 == 1) {
                A8(parcel.readString(), parcel.readInt(), parcel.readString(), (Notification) c.c(parcel, Notification.CREATOR));
            } else if (i10 == 2) {
                P3(parcel.readString(), parcel.readInt(), parcel.readString());
            } else {
                if (i10 != 3) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                Vc(parcel.readString());
            }
            return true;
        }
    }

    public static class c {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T c(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void d(Parcel parcel, T t10, int i10) {
            if (t10 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t10.writeToParcel(parcel, i10);
            }
        }
    }

    void A8(String str, int i10, String str2, Notification notification) throws RemoteException;

    void P3(String str, int i10, String str2) throws RemoteException;

    void Vc(String str) throws RemoteException;
}
