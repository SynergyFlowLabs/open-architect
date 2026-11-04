package android.support.v4.media.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: android.support.v4.media.session.a$a, reason: collision with other inner class name */
    public static class C0016a implements a {
        @Override // android.support.v4.media.session.a
        public void Dd(boolean enabled) throws RemoteException {
        }

        @Override // android.support.v4.media.session.a
        public void Ed(CharSequence title) throws RemoteException {
        }

        @Override // android.support.v4.media.session.a
        public void G2(List<MediaSessionCompat.QueueItem> queue) throws RemoteException {
        }

        @Override // android.support.v4.media.session.a
        public void Lc(Bundle extras) throws RemoteException {
        }

        @Override // android.support.v4.media.session.a
        public void N3() throws RemoteException {
        }

        @Override // android.support.v4.media.session.a
        public void Pb(ParcelableVolumeInfo info) throws RemoteException {
        }

        @Override // android.support.v4.media.session.a
        public void Sa(MediaMetadataCompat metadata) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // android.support.v4.media.session.a
        public void of(PlaybackStateCompat state) throws RemoteException {
        }

        @Override // android.support.v4.media.session.a
        public void onEvent(String event, Bundle extras) throws RemoteException {
        }

        @Override // android.support.v4.media.session.a
        public void pb(int shuffleMode) throws RemoteException {
        }

        @Override // android.support.v4.media.session.a
        public void rd(boolean enabled) throws RemoteException {
        }

        @Override // android.support.v4.media.session.a
        public void x(int repeatMode) throws RemoteException {
        }

        @Override // android.support.v4.media.session.a
        public void y2() throws RemoteException {
        }
    }

    public static abstract class b extends Binder implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final String f9713a = "android.support.v4.media.session.IMediaControllerCallback";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final int f9714b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final int f9715c = 2;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final int f9716d = 3;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final int f9717e = 4;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final int f9718f = 5;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final int f9719g = 6;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        static final int f9720h = 7;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        static final int f9721i = 8;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        static final int f9722j = 9;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        static final int f9723k = 10;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        static final int f9724l = 11;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        static final int f9725m = 12;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final int f9726n = 13;

        /* JADX INFO: renamed from: android.support.v4.media.session.a$b$a, reason: collision with other inner class name */
        private static class C0017a implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static a f9727b;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f9728a;

            C0017a(IBinder remote) {
                this.f9728a = remote;
            }

            @Override // android.support.v4.media.session.a
            public void Dd(boolean z10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f9713a);
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    if (this.f9728a.transact(10, parcelObtain, null, 1) || b.k() == null) {
                        parcelObtain.recycle();
                    } else {
                        b.k().Dd(z10);
                        parcelObtain.recycle();
                    }
                } catch (Throwable th2) {
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // android.support.v4.media.session.a
            public void Ed(CharSequence title) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f9713a);
                    if (title != null) {
                        parcelObtain.writeInt(1);
                        TextUtils.writeToParcel(title, parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.f9728a.transact(6, parcelObtain, null, 1) || b.k() == null) {
                        return;
                    }
                    b.k().Ed(title);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.a
            public void G2(List<MediaSessionCompat.QueueItem> queue) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f9713a);
                    parcelObtain.writeTypedList(queue);
                    int i10 = 5 & 0;
                    if (this.f9728a.transact(5, parcelObtain, null, 1) || b.k() == null) {
                        return;
                    }
                    b.k().G2(queue);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.a
            public void Lc(Bundle extras) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f9713a);
                    if (extras != null) {
                        parcelObtain.writeInt(1);
                        extras.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.f9728a.transact(7, parcelObtain, null, 1) || b.k() == null) {
                        return;
                    }
                    b.k().Lc(extras);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.a
            public void N3() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f9713a);
                    if (this.f9728a.transact(2, parcelObtain, null, 1) || b.k() == null) {
                        parcelObtain.recycle();
                    } else {
                        b.k().N3();
                        parcelObtain.recycle();
                    }
                } catch (Throwable th2) {
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // android.support.v4.media.session.a
            public void Pb(ParcelableVolumeInfo info) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f9713a);
                    if (info != null) {
                        parcelObtain.writeInt(1);
                        info.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.f9728a.transact(8, parcelObtain, null, 1) || b.k() == null) {
                        parcelObtain.recycle();
                    } else {
                        b.k().Pb(info);
                        parcelObtain.recycle();
                    }
                } catch (Throwable th2) {
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // android.support.v4.media.session.a
            public void Sa(MediaMetadataCompat metadata) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f9713a);
                    if (metadata != null) {
                        parcelObtain.writeInt(1);
                        metadata.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.f9728a.transact(4, parcelObtain, null, 1) || b.k() == null) {
                        return;
                    }
                    b.k().Sa(metadata);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f9728a;
            }

            public String i() {
                return b.f9713a;
            }

            @Override // android.support.v4.media.session.a
            public void of(PlaybackStateCompat state) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f9713a);
                    if (state != null) {
                        parcelObtain.writeInt(1);
                        state.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.f9728a.transact(3, parcelObtain, null, 1) || b.k() == null) {
                        parcelObtain.recycle();
                    } else {
                        b.k().of(state);
                        parcelObtain.recycle();
                    }
                } catch (Throwable th2) {
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // android.support.v4.media.session.a
            public void onEvent(String event, Bundle extras) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f9713a);
                    parcelObtain.writeString(event);
                    if (extras != null) {
                        parcelObtain.writeInt(1);
                        extras.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.f9728a.transact(1, parcelObtain, null, 1) || b.k() == null) {
                        parcelObtain.recycle();
                    } else {
                        b.k().onEvent(event, extras);
                        parcelObtain.recycle();
                    }
                } catch (Throwable th2) {
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // android.support.v4.media.session.a
            public void pb(int shuffleMode) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f9713a);
                    parcelObtain.writeInt(shuffleMode);
                    if (this.f9728a.transact(12, parcelObtain, null, 1) || b.k() == null) {
                        parcelObtain.recycle();
                    } else {
                        b.k().pb(shuffleMode);
                        parcelObtain.recycle();
                    }
                } catch (Throwable th2) {
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // android.support.v4.media.session.a
            public void rd(boolean z10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f9713a);
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    if (this.f9728a.transact(11, parcelObtain, null, 1) || b.k() == null) {
                        return;
                    }
                    b.k().rd(z10);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.a
            public void x(int repeatMode) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f9713a);
                    parcelObtain.writeInt(repeatMode);
                    if (this.f9728a.transact(9, parcelObtain, null, 1) || b.k() == null) {
                        return;
                    }
                    b.k().x(repeatMode);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.a
            public void y2() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f9713a);
                    int i10 = 3 ^ 0;
                    if (this.f9728a.transact(13, parcelObtain, null, 1) || b.k() == null) {
                        parcelObtain.recycle();
                    } else {
                        b.k().y2();
                        parcelObtain.recycle();
                    }
                } catch (Throwable th2) {
                    parcelObtain.recycle();
                    throw th2;
                }
            }
        }

        public b() {
            attachInterface(this, f9713a);
        }

        public static a i(IBinder obj) {
            if (obj == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = obj.queryLocalInterface(f9713a);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C0017a(obj) : (a) iInterfaceQueryLocalInterface;
        }

        public static a k() {
            return C0017a.f9727b;
        }

        public static boolean n(a impl) {
            if (C0017a.f9727b != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (impl == null) {
                return false;
            }
            C0017a.f9727b = impl;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 == 1598968902) {
                parcel2.writeString(f9713a);
                return true;
            }
            switch (i10) {
                case 1:
                    parcel.enforceInterface(f9713a);
                    onEvent(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 2:
                    parcel.enforceInterface(f9713a);
                    N3();
                    return true;
                case 3:
                    parcel.enforceInterface(f9713a);
                    of(parcel.readInt() != 0 ? PlaybackStateCompat.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 4:
                    parcel.enforceInterface(f9713a);
                    Sa(parcel.readInt() != 0 ? MediaMetadataCompat.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 5:
                    parcel.enforceInterface(f9713a);
                    G2(parcel.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR));
                    return true;
                case 6:
                    parcel.enforceInterface(f9713a);
                    Ed(parcel.readInt() != 0 ? (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 7:
                    parcel.enforceInterface(f9713a);
                    Lc(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 8:
                    parcel.enforceInterface(f9713a);
                    Pb(parcel.readInt() != 0 ? ParcelableVolumeInfo.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 9:
                    parcel.enforceInterface(f9713a);
                    x(parcel.readInt());
                    return true;
                case 10:
                    parcel.enforceInterface(f9713a);
                    Dd(parcel.readInt() != 0);
                    return true;
                case 11:
                    parcel.enforceInterface(f9713a);
                    rd(parcel.readInt() != 0);
                    return true;
                case 12:
                    parcel.enforceInterface(f9713a);
                    pb(parcel.readInt());
                    return true;
                case 13:
                    parcel.enforceInterface(f9713a);
                    y2();
                    return true;
                default:
                    return super.onTransact(i10, parcel, parcel2, i11);
            }
        }
    }

    void Dd(boolean enabled) throws RemoteException;

    void Ed(CharSequence title) throws RemoteException;

    void G2(List<MediaSessionCompat.QueueItem> queue) throws RemoteException;

    void Lc(Bundle extras) throws RemoteException;

    void N3() throws RemoteException;

    void Pb(ParcelableVolumeInfo info) throws RemoteException;

    void Sa(MediaMetadataCompat metadata) throws RemoteException;

    void of(PlaybackStateCompat state) throws RemoteException;

    void onEvent(String event, Bundle extras) throws RemoteException;

    void pb(int shuffleMode) throws RemoteException;

    void rd(boolean enabled) throws RemoteException;

    void x(int repeatMode) throws RemoteException;

    void y2() throws RemoteException;
}
