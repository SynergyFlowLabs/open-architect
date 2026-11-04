package android.support.v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.text.TextUtils;
import android.view.KeyEvent;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface b extends IInterface {

    public static class a implements b {
        @Override // android.support.v4.media.session.b
        public void A() throws RemoteException {
        }

        @Override // android.support.v4.media.session.b
        public void A6(android.support.v4.media.session.a cb2) throws RemoteException {
        }

        @Override // android.support.v4.media.session.b
        public boolean Aa(KeyEvent mediaButton) throws RemoteException {
            return false;
        }

        @Override // android.support.v4.media.session.b
        public void B() throws RemoteException {
        }

        @Override // android.support.v4.media.session.b
        public int C() throws RemoteException {
            return 0;
        }

        @Override // android.support.v4.media.session.b
        public void D(int repeatMode) throws RemoteException {
        }

        @Override // android.support.v4.media.session.b
        public void D1() throws RemoteException {
        }

        @Override // android.support.v4.media.session.b
        public String E() throws RemoteException {
            return null;
        }

        @Override // android.support.v4.media.session.b
        public void E1(String action, Bundle args) throws RemoteException {
        }

        @Override // android.support.v4.media.session.b
        public void Ec(String string, Bundle extras) throws RemoteException {
        }

        @Override // android.support.v4.media.session.b
        public void F(long pos) throws RemoteException {
        }

        @Override // android.support.v4.media.session.b
        public void G(float speed) throws RemoteException {
        }

        @Override // android.support.v4.media.session.b
        public PlaybackStateCompat H() throws RemoteException {
            return null;
        }

        @Override // android.support.v4.media.session.b
        public void Hd(int direction, int flags, String packageName) throws RemoteException {
        }

        @Override // android.support.v4.media.session.b
        public long I() throws RemoteException {
            return 0L;
        }

        @Override // android.support.v4.media.session.b
        public int J() throws RemoteException {
            return 0;
        }

        @Override // android.support.v4.media.session.b
        public void Jb(long id2) throws RemoteException {
        }

        @Override // android.support.v4.media.session.b
        public void K(int shuffleMode) throws RemoteException {
        }

        @Override // android.support.v4.media.session.b
        public void M3(RatingCompat rating, Bundle extras) throws RemoteException {
        }

        @Override // android.support.v4.media.session.b
        public int O0() throws RemoteException {
            return 0;
        }

        @Override // android.support.v4.media.session.b
        public boolean O1() throws RemoteException {
            return false;
        }

        @Override // android.support.v4.media.session.b
        public void P() throws RemoteException {
        }

        @Override // android.support.v4.media.session.b
        public void R4(boolean shuffleMode) throws RemoteException {
        }

        @Override // android.support.v4.media.session.b
        public void Ra(MediaDescriptionCompat description, int index) throws RemoteException {
        }

        @Override // android.support.v4.media.session.b
        public boolean S5() throws RemoteException {
            return false;
        }

        @Override // android.support.v4.media.session.b
        public Bundle T0() throws RemoteException {
            return null;
        }

        @Override // android.support.v4.media.session.b
        public void T2(String uri, Bundle extras) throws RemoteException {
        }

        @Override // android.support.v4.media.session.b
        public void X9(String string, Bundle extras) throws RemoteException {
        }

        @Override // android.support.v4.media.session.b
        public void a3(String uri, Bundle extras) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // android.support.v4.media.session.b
        public void c2(Uri uri, Bundle extras) throws RemoteException {
        }

        @Override // android.support.v4.media.session.b
        public boolean d0() throws RemoteException {
            return false;
        }

        @Override // android.support.v4.media.session.b
        public List<MediaSessionCompat.QueueItem> e() throws RemoteException {
            return null;
        }

        @Override // android.support.v4.media.session.b
        public void ea(Uri uri, Bundle extras) throws RemoteException {
        }

        @Override // android.support.v4.media.session.b
        public Bundle getExtras() throws RemoteException {
            return null;
        }

        @Override // android.support.v4.media.session.b
        public String getPackageName() throws RemoteException {
            return null;
        }

        @Override // android.support.v4.media.session.b
        public void h1(MediaDescriptionCompat description) throws RemoteException {
        }

        @Override // android.support.v4.media.session.b
        public void h4(int index) throws RemoteException {
        }

        @Override // android.support.v4.media.session.b
        public void j1(MediaDescriptionCompat description) throws RemoteException {
        }

        @Override // android.support.v4.media.session.b
        public CharSequence k0() throws RemoteException {
            return null;
        }

        @Override // android.support.v4.media.session.b
        public ParcelableVolumeInfo m8() throws RemoteException {
            return null;
        }

        @Override // android.support.v4.media.session.b
        public void mc(RatingCompat rating) throws RemoteException {
        }

        @Override // android.support.v4.media.session.b
        public PendingIntent n2() throws RemoteException {
            return null;
        }

        @Override // android.support.v4.media.session.b
        public void nc(int value, int flags, String packageName) throws RemoteException {
        }

        @Override // android.support.v4.media.session.b
        public void next() throws RemoteException {
        }

        @Override // android.support.v4.media.session.b
        public void pause() throws RemoteException {
        }

        @Override // android.support.v4.media.session.b
        public void previous() throws RemoteException {
        }

        @Override // android.support.v4.media.session.b
        public void r0(boolean enabled) throws RemoteException {
        }

        @Override // android.support.v4.media.session.b
        public void r4(String command, Bundle args, MediaSessionCompat.ResultReceiverWrapper cb2) throws RemoteException {
        }

        @Override // android.support.v4.media.session.b
        public void stop() throws RemoteException {
        }

        @Override // android.support.v4.media.session.b
        public void x5(android.support.v4.media.session.a cb2) throws RemoteException {
        }

        @Override // android.support.v4.media.session.b
        public MediaMetadataCompat z() throws RemoteException {
            return null;
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.session.b$b, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0018b extends Binder implements b {
        static final int A3 = 49;
        static final int B3 = 46;
        static final int C3 = 39;
        static final int D3 = 40;
        static final int E3 = 48;
        static final int F3 = 26;
        static final int H1 = 42;
        static final int X = 45;
        static final int Y = 37;
        static final int Z = 38;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final String f9729a = "android.support.v4.media.session.IMediaSession";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final int f9730b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final int f9731c = 2;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final int f9732d = 3;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final int f9733e = 4;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final int f9734f = 5;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final int f9735g = 6;

        /* JADX INFO: renamed from: g3, reason: collision with root package name */
        static final int f9736g3 = 44;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        static final int f9737h = 7;

        /* JADX INFO: renamed from: h3, reason: collision with root package name */
        static final int f9738h3 = 50;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        static final int f9739i = 8;

        /* JADX INFO: renamed from: i3, reason: collision with root package name */
        static final int f9740i3 = 33;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        static final int f9741j = 9;

        /* JADX INFO: renamed from: j3, reason: collision with root package name */
        static final int f9742j3 = 34;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        static final int f9743k = 10;

        /* JADX INFO: renamed from: k3, reason: collision with root package name */
        static final int f9744k3 = 35;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        static final int f9745l = 11;

        /* JADX INFO: renamed from: l3, reason: collision with root package name */
        static final int f9746l3 = 36;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        static final int f9747m = 12;

        /* JADX INFO: renamed from: m3, reason: collision with root package name */
        static final int f9748m3 = 13;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final int f9749n = 27;

        /* JADX INFO: renamed from: n3, reason: collision with root package name */
        static final int f9750n3 = 14;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        static final int f9751o = 28;

        /* JADX INFO: renamed from: o3, reason: collision with root package name */
        static final int f9752o3 = 15;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        static final int f9753p0 = 47;

        /* JADX INFO: renamed from: p1, reason: collision with root package name */
        static final int f9754p1 = 41;

        /* JADX INFO: renamed from: p2, reason: collision with root package name */
        static final int f9755p2 = 43;

        /* JADX INFO: renamed from: p3, reason: collision with root package name */
        static final int f9756p3 = 16;

        /* JADX INFO: renamed from: q3, reason: collision with root package name */
        static final int f9757q3 = 17;

        /* JADX INFO: renamed from: r3, reason: collision with root package name */
        static final int f9758r3 = 18;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        static final int f9759s = 29;

        /* JADX INFO: renamed from: s3, reason: collision with root package name */
        static final int f9760s3 = 19;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        static final int f9761t = 30;

        /* JADX INFO: renamed from: t3, reason: collision with root package name */
        static final int f9762t3 = 20;

        /* JADX INFO: renamed from: u3, reason: collision with root package name */
        static final int f9763u3 = 21;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        static final int f9764v = 31;

        /* JADX INFO: renamed from: v3, reason: collision with root package name */
        static final int f9765v3 = 22;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        static final int f9766w = 32;

        /* JADX INFO: renamed from: w3, reason: collision with root package name */
        static final int f9767w3 = 23;

        /* JADX INFO: renamed from: x3, reason: collision with root package name */
        static final int f9768x3 = 24;

        /* JADX INFO: renamed from: y3, reason: collision with root package name */
        static final int f9769y3 = 25;

        /* JADX INFO: renamed from: z3, reason: collision with root package name */
        static final int f9770z3 = 51;

        /* JADX INFO: renamed from: android.support.v4.media.session.b$b$a */
        private static class a implements b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static b f9771b;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f9772a;

            a(IBinder remote) {
                this.f9772a = remote;
            }

            @Override // android.support.v4.media.session.b
            public void A() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0018b.f9729a);
                    if (this.f9772a.transact(33, parcelObtain, parcelObtain2, 0) || AbstractBinderC0018b.k() == null) {
                        parcelObtain2.readException();
                    } else {
                        AbstractBinderC0018b.k().A();
                    }
                    parcelObtain2.recycle();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void A6(android.support.v4.media.session.a cb2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0018b.f9729a);
                    parcelObtain.writeStrongBinder(cb2 != null ? cb2.asBinder() : null);
                    if (this.f9772a.transact(4, parcelObtain, parcelObtain2, 0) || AbstractBinderC0018b.k() == null) {
                        parcelObtain2.readException();
                    } else {
                        AbstractBinderC0018b.k().A6(cb2);
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                } catch (Throwable th2) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // android.support.v4.media.session.b
            public boolean Aa(KeyEvent mediaButton) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0018b.f9729a);
                    if (mediaButton != null) {
                        parcelObtain.writeInt(1);
                        mediaButton.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.f9772a.transact(2, parcelObtain, parcelObtain2, 0) && AbstractBinderC0018b.k() != null) {
                        return AbstractBinderC0018b.k().Aa(mediaButton);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void B() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0018b.f9729a);
                    if (this.f9772a.transact(13, parcelObtain, parcelObtain2, 0) || AbstractBinderC0018b.k() == null) {
                        parcelObtain2.readException();
                    } else {
                        AbstractBinderC0018b.k().B();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public int C() throws RemoteException {
                int iC;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0018b.f9729a);
                    if (this.f9772a.transact(37, parcelObtain, parcelObtain2, 0) || AbstractBinderC0018b.k() == null) {
                        parcelObtain2.readException();
                        iC = parcelObtain2.readInt();
                    } else {
                        iC = AbstractBinderC0018b.k().C();
                    }
                    parcelObtain2.recycle();
                    return iC;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void D(int repeatMode) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0018b.f9729a);
                    parcelObtain.writeInt(repeatMode);
                    if (this.f9772a.transact(39, parcelObtain, parcelObtain2, 0) || AbstractBinderC0018b.k() == null) {
                        parcelObtain2.readException();
                    } else {
                        AbstractBinderC0018b.k().D(repeatMode);
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                } catch (Throwable th2) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // android.support.v4.media.session.b
            public void D1() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0018b.f9729a);
                    if (this.f9772a.transact(22, parcelObtain, parcelObtain2, 0) || AbstractBinderC0018b.k() == null) {
                        parcelObtain2.readException();
                    } else {
                        AbstractBinderC0018b.k().D1();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public String E() throws RemoteException {
                String string;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0018b.f9729a);
                    if (this.f9772a.transact(7, parcelObtain, parcelObtain2, 0) || AbstractBinderC0018b.k() == null) {
                        parcelObtain2.readException();
                        string = parcelObtain2.readString();
                    } else {
                        string = AbstractBinderC0018b.k().E();
                    }
                    parcelObtain2.recycle();
                    return string;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void E1(String action, Bundle args) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0018b.f9729a);
                    parcelObtain.writeString(action);
                    if (args != null) {
                        parcelObtain.writeInt(1);
                        args.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.f9772a.transact(26, parcelObtain, parcelObtain2, 0) || AbstractBinderC0018b.k() == null) {
                        parcelObtain2.readException();
                    } else {
                        AbstractBinderC0018b.k().E1(action, args);
                    }
                    parcelObtain2.recycle();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void Ec(String string, Bundle extras) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0018b.f9729a);
                    parcelObtain.writeString(string);
                    if (extras != null) {
                        parcelObtain.writeInt(1);
                        extras.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.f9772a.transact(35, parcelObtain, parcelObtain2, 0) || AbstractBinderC0018b.k() == null) {
                        parcelObtain2.readException();
                    } else {
                        AbstractBinderC0018b.k().Ec(string, extras);
                    }
                    parcelObtain2.recycle();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void F(long pos) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0018b.f9729a);
                    parcelObtain.writeLong(pos);
                    if (this.f9772a.transact(24, parcelObtain, parcelObtain2, 0) || AbstractBinderC0018b.k() == null) {
                        parcelObtain2.readException();
                    } else {
                        AbstractBinderC0018b.k().F(pos);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void G(float speed) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0018b.f9729a);
                    parcelObtain.writeFloat(speed);
                    if (this.f9772a.transact(49, parcelObtain, parcelObtain2, 0) || AbstractBinderC0018b.k() == null) {
                        parcelObtain2.readException();
                    } else {
                        AbstractBinderC0018b.k().G(speed);
                    }
                    parcelObtain2.recycle();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public PlaybackStateCompat H() throws RemoteException {
                PlaybackStateCompat playbackStateCompatCreateFromParcel;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0018b.f9729a);
                    if (this.f9772a.transact(28, parcelObtain, parcelObtain2, 0) || AbstractBinderC0018b.k() == null) {
                        parcelObtain2.readException();
                        playbackStateCompatCreateFromParcel = parcelObtain2.readInt() != 0 ? PlaybackStateCompat.CREATOR.createFromParcel(parcelObtain2) : null;
                    } else {
                        playbackStateCompatCreateFromParcel = AbstractBinderC0018b.k().H();
                    }
                    return playbackStateCompatCreateFromParcel;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void Hd(int direction, int flags, String packageName) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0018b.f9729a);
                    parcelObtain.writeInt(direction);
                    parcelObtain.writeInt(flags);
                    parcelObtain.writeString(packageName);
                    if (this.f9772a.transact(11, parcelObtain, parcelObtain2, 0) || AbstractBinderC0018b.k() == null) {
                        parcelObtain2.readException();
                    } else {
                        AbstractBinderC0018b.k().Hd(direction, flags, packageName);
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                } catch (Throwable th2) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // android.support.v4.media.session.b
            public long I() throws RemoteException {
                long jI;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0018b.f9729a);
                    if (this.f9772a.transact(9, parcelObtain, parcelObtain2, 0) || AbstractBinderC0018b.k() == null) {
                        parcelObtain2.readException();
                        jI = parcelObtain2.readLong();
                    } else {
                        jI = AbstractBinderC0018b.k().I();
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return jI;
                } catch (Throwable th2) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // android.support.v4.media.session.b
            public int J() throws RemoteException {
                int iJ;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0018b.f9729a);
                    if (this.f9772a.transact(47, parcelObtain, parcelObtain2, 0) || AbstractBinderC0018b.k() == null) {
                        parcelObtain2.readException();
                        iJ = parcelObtain2.readInt();
                    } else {
                        iJ = AbstractBinderC0018b.k().J();
                    }
                    parcelObtain2.recycle();
                    return iJ;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void Jb(long id2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0018b.f9729a);
                    parcelObtain.writeLong(id2);
                    if (this.f9772a.transact(17, parcelObtain, parcelObtain2, 0) || AbstractBinderC0018b.k() == null) {
                        parcelObtain2.readException();
                    } else {
                        AbstractBinderC0018b.k().Jb(id2);
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                } catch (Throwable th2) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // android.support.v4.media.session.b
            public void K(int shuffleMode) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0018b.f9729a);
                    parcelObtain.writeInt(shuffleMode);
                    if (this.f9772a.transact(48, parcelObtain, parcelObtain2, 0) || AbstractBinderC0018b.k() == null) {
                        parcelObtain2.readException();
                    } else {
                        AbstractBinderC0018b.k().K(shuffleMode);
                    }
                    parcelObtain2.recycle();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void M3(RatingCompat rating, Bundle extras) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0018b.f9729a);
                    if (rating != null) {
                        parcelObtain.writeInt(1);
                        rating.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (extras != null) {
                        parcelObtain.writeInt(1);
                        extras.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.f9772a.transact(51, parcelObtain, parcelObtain2, 0) || AbstractBinderC0018b.k() == null) {
                        parcelObtain2.readException();
                    } else {
                        AbstractBinderC0018b.k().M3(rating, extras);
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                } catch (Throwable th2) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // android.support.v4.media.session.b
            public int O0() throws RemoteException {
                int iO0;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0018b.f9729a);
                    if (this.f9772a.transact(32, parcelObtain, parcelObtain2, 0) || AbstractBinderC0018b.k() == null) {
                        parcelObtain2.readException();
                        iO0 = parcelObtain2.readInt();
                    } else {
                        iO0 = AbstractBinderC0018b.k().O0();
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return iO0;
                } catch (Throwable th2) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // android.support.v4.media.session.b
            public boolean O1() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0018b.f9729a);
                    if (!this.f9772a.transact(38, parcelObtain, parcelObtain2, 0) && AbstractBinderC0018b.k() != null) {
                        boolean zO1 = AbstractBinderC0018b.k().O1();
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                        return zO1;
                    }
                    parcelObtain2.readException();
                    boolean z10 = parcelObtain2.readInt() != 0;
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return z10;
                } catch (Throwable th2) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // android.support.v4.media.session.b
            public void P() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0018b.f9729a);
                    if (this.f9772a.transact(23, parcelObtain, parcelObtain2, 0) || AbstractBinderC0018b.k() == null) {
                        parcelObtain2.readException();
                    } else {
                        AbstractBinderC0018b.k().P();
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                } catch (Throwable th2) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // android.support.v4.media.session.b
            public void R4(boolean z10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0018b.f9729a);
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    if (this.f9772a.transact(40, parcelObtain, parcelObtain2, 0) || AbstractBinderC0018b.k() == null) {
                        parcelObtain2.readException();
                    } else {
                        AbstractBinderC0018b.k().R4(z10);
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                } catch (Throwable th2) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // android.support.v4.media.session.b
            public void Ra(MediaDescriptionCompat description, int index) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0018b.f9729a);
                    if (description != null) {
                        parcelObtain.writeInt(1);
                        description.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeInt(index);
                    if (this.f9772a.transact(42, parcelObtain, parcelObtain2, 0) || AbstractBinderC0018b.k() == null) {
                        parcelObtain2.readException();
                    } else {
                        AbstractBinderC0018b.k().Ra(description, index);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public boolean S5() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0018b.f9729a);
                    if (!this.f9772a.transact(5, parcelObtain, parcelObtain2, 0) && AbstractBinderC0018b.k() != null) {
                        boolean zS5 = AbstractBinderC0018b.k().S5();
                        parcelObtain2.recycle();
                        return zS5;
                    }
                    parcelObtain2.readException();
                    boolean z10 = parcelObtain2.readInt() != 0;
                    parcelObtain2.recycle();
                    return z10;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public Bundle T0() throws RemoteException {
                Bundle bundleT0;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0018b.f9729a);
                    if (this.f9772a.transact(50, parcelObtain, parcelObtain2, 0) || AbstractBinderC0018b.k() == null) {
                        parcelObtain2.readException();
                        bundleT0 = parcelObtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcelObtain2) : null;
                    } else {
                        bundleT0 = AbstractBinderC0018b.k().T0();
                    }
                    return bundleT0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void T2(String uri, Bundle extras) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0018b.f9729a);
                    parcelObtain.writeString(uri);
                    if (extras != null) {
                        parcelObtain.writeInt(1);
                        extras.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.f9772a.transact(34, parcelObtain, parcelObtain2, 0) || AbstractBinderC0018b.k() == null) {
                        parcelObtain2.readException();
                    } else {
                        AbstractBinderC0018b.k().T2(uri, extras);
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                } catch (Throwable th2) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // android.support.v4.media.session.b
            public void X9(String string, Bundle extras) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0018b.f9729a);
                    parcelObtain.writeString(string);
                    if (extras != null) {
                        parcelObtain.writeInt(1);
                        extras.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.f9772a.transact(15, parcelObtain, parcelObtain2, 0) || AbstractBinderC0018b.k() == null) {
                        parcelObtain2.readException();
                    } else {
                        AbstractBinderC0018b.k().X9(string, extras);
                    }
                    parcelObtain2.recycle();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void a3(String uri, Bundle extras) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0018b.f9729a);
                    parcelObtain.writeString(uri);
                    if (extras != null) {
                        parcelObtain.writeInt(1);
                        extras.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.f9772a.transact(14, parcelObtain, parcelObtain2, 0) || AbstractBinderC0018b.k() == null) {
                        parcelObtain2.readException();
                    } else {
                        AbstractBinderC0018b.k().a3(uri, extras);
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                } catch (Throwable th2) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f9772a;
            }

            @Override // android.support.v4.media.session.b
            public void c2(Uri uri, Bundle extras) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0018b.f9729a);
                    if (uri != null) {
                        parcelObtain.writeInt(1);
                        uri.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (extras != null) {
                        parcelObtain.writeInt(1);
                        extras.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.f9772a.transact(36, parcelObtain, parcelObtain2, 0) || AbstractBinderC0018b.k() == null) {
                        parcelObtain2.readException();
                    } else {
                        AbstractBinderC0018b.k().c2(uri, extras);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public boolean d0() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0018b.f9729a);
                    if (!this.f9772a.transact(45, parcelObtain, parcelObtain2, 0) && AbstractBinderC0018b.k() != null) {
                        boolean zD0 = AbstractBinderC0018b.k().d0();
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                        return zD0;
                    }
                    parcelObtain2.readException();
                    boolean z10 = parcelObtain2.readInt() != 0;
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return z10;
                } catch (Throwable th2) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // android.support.v4.media.session.b
            public List<MediaSessionCompat.QueueItem> e() throws RemoteException {
                List<MediaSessionCompat.QueueItem> listCreateTypedArrayList;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0018b.f9729a);
                    if (this.f9772a.transact(29, parcelObtain, parcelObtain2, 0) || AbstractBinderC0018b.k() == null) {
                        parcelObtain2.readException();
                        listCreateTypedArrayList = parcelObtain2.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR);
                    } else {
                        listCreateTypedArrayList = AbstractBinderC0018b.k().e();
                    }
                    parcelObtain2.recycle();
                    return listCreateTypedArrayList;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void ea(Uri uri, Bundle extras) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0018b.f9729a);
                    if (uri != null) {
                        parcelObtain.writeInt(1);
                        uri.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (extras != null) {
                        parcelObtain.writeInt(1);
                        extras.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.f9772a.transact(16, parcelObtain, parcelObtain2, 0) || AbstractBinderC0018b.k() == null) {
                        parcelObtain2.readException();
                    } else {
                        AbstractBinderC0018b.k().ea(uri, extras);
                    }
                    parcelObtain2.recycle();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public Bundle getExtras() throws RemoteException {
                Bundle extras;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0018b.f9729a);
                    if (this.f9772a.transact(31, parcelObtain, parcelObtain2, 0) || AbstractBinderC0018b.k() == null) {
                        parcelObtain2.readException();
                        extras = parcelObtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcelObtain2) : null;
                    } else {
                        extras = AbstractBinderC0018b.k().getExtras();
                    }
                    return extras;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public String getPackageName() throws RemoteException {
                String string;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0018b.f9729a);
                    if (this.f9772a.transact(6, parcelObtain, parcelObtain2, 0) || AbstractBinderC0018b.k() == null) {
                        parcelObtain2.readException();
                        string = parcelObtain2.readString();
                    } else {
                        string = AbstractBinderC0018b.k().getPackageName();
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return string;
                } catch (Throwable th2) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // android.support.v4.media.session.b
            public void h1(MediaDescriptionCompat description) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0018b.f9729a);
                    if (description != null) {
                        parcelObtain.writeInt(1);
                        description.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.f9772a.transact(43, parcelObtain, parcelObtain2, 0) || AbstractBinderC0018b.k() == null) {
                        parcelObtain2.readException();
                    } else {
                        AbstractBinderC0018b.k().h1(description);
                    }
                    parcelObtain2.recycle();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void h4(int index) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0018b.f9729a);
                    parcelObtain.writeInt(index);
                    if (this.f9772a.transact(44, parcelObtain, parcelObtain2, 0) || AbstractBinderC0018b.k() == null) {
                        parcelObtain2.readException();
                    } else {
                        AbstractBinderC0018b.k().h4(index);
                    }
                    parcelObtain2.recycle();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String i() {
                return AbstractBinderC0018b.f9729a;
            }

            @Override // android.support.v4.media.session.b
            public void j1(MediaDescriptionCompat description) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0018b.f9729a);
                    if (description != null) {
                        parcelObtain.writeInt(1);
                        description.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.f9772a.transact(41, parcelObtain, parcelObtain2, 0) || AbstractBinderC0018b.k() == null) {
                        parcelObtain2.readException();
                    } else {
                        AbstractBinderC0018b.k().j1(description);
                    }
                    parcelObtain2.recycle();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public CharSequence k0() throws RemoteException {
                CharSequence charSequenceK0;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0018b.f9729a);
                    if (this.f9772a.transact(30, parcelObtain, parcelObtain2, 0) || AbstractBinderC0018b.k() == null) {
                        parcelObtain2.readException();
                        charSequenceK0 = parcelObtain2.readInt() != 0 ? (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcelObtain2) : null;
                    } else {
                        charSequenceK0 = AbstractBinderC0018b.k().k0();
                    }
                    return charSequenceK0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public ParcelableVolumeInfo m8() throws RemoteException {
                ParcelableVolumeInfo parcelableVolumeInfoCreateFromParcel;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0018b.f9729a);
                    if (this.f9772a.transact(10, parcelObtain, parcelObtain2, 0) || AbstractBinderC0018b.k() == null) {
                        parcelObtain2.readException();
                        parcelableVolumeInfoCreateFromParcel = parcelObtain2.readInt() != 0 ? ParcelableVolumeInfo.CREATOR.createFromParcel(parcelObtain2) : null;
                    } else {
                        parcelableVolumeInfoCreateFromParcel = AbstractBinderC0018b.k().m8();
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return parcelableVolumeInfoCreateFromParcel;
                } catch (Throwable th2) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // android.support.v4.media.session.b
            public void mc(RatingCompat rating) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0018b.f9729a);
                    if (rating != null) {
                        parcelObtain.writeInt(1);
                        rating.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.f9772a.transact(25, parcelObtain, parcelObtain2, 0) || AbstractBinderC0018b.k() == null) {
                        parcelObtain2.readException();
                    } else {
                        AbstractBinderC0018b.k().mc(rating);
                    }
                    parcelObtain2.recycle();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public PendingIntent n2() throws RemoteException {
                PendingIntent pendingIntentN2;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0018b.f9729a);
                    if (this.f9772a.transact(8, parcelObtain, parcelObtain2, 0) || AbstractBinderC0018b.k() == null) {
                        parcelObtain2.readException();
                        pendingIntentN2 = parcelObtain2.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcelObtain2) : null;
                    } else {
                        pendingIntentN2 = AbstractBinderC0018b.k().n2();
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return pendingIntentN2;
                } catch (Throwable th2) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // android.support.v4.media.session.b
            public void nc(int value, int flags, String packageName) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0018b.f9729a);
                    parcelObtain.writeInt(value);
                    parcelObtain.writeInt(flags);
                    parcelObtain.writeString(packageName);
                    if (this.f9772a.transact(12, parcelObtain, parcelObtain2, 0) || AbstractBinderC0018b.k() == null) {
                        parcelObtain2.readException();
                    } else {
                        AbstractBinderC0018b.k().nc(value, flags, packageName);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void next() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0018b.f9729a);
                    if (this.f9772a.transact(20, parcelObtain, parcelObtain2, 0) || AbstractBinderC0018b.k() == null) {
                        parcelObtain2.readException();
                    } else {
                        AbstractBinderC0018b.k().next();
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                } catch (Throwable th2) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // android.support.v4.media.session.b
            public void pause() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0018b.f9729a);
                    if (this.f9772a.transact(18, parcelObtain, parcelObtain2, 0) || AbstractBinderC0018b.k() == null) {
                        parcelObtain2.readException();
                    } else {
                        AbstractBinderC0018b.k().pause();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void previous() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0018b.f9729a);
                    if (this.f9772a.transact(21, parcelObtain, parcelObtain2, 0) || AbstractBinderC0018b.k() == null) {
                        parcelObtain2.readException();
                    } else {
                        AbstractBinderC0018b.k().previous();
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                } catch (Throwable th2) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // android.support.v4.media.session.b
            public void r0(boolean z10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0018b.f9729a);
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    if (this.f9772a.transact(46, parcelObtain, parcelObtain2, 0) || AbstractBinderC0018b.k() == null) {
                        parcelObtain2.readException();
                    } else {
                        AbstractBinderC0018b.k().r0(z10);
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                } catch (Throwable th2) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // android.support.v4.media.session.b
            public void r4(String command, Bundle args, MediaSessionCompat.ResultReceiverWrapper cb2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0018b.f9729a);
                    parcelObtain.writeString(command);
                    if (args != null) {
                        parcelObtain.writeInt(1);
                        args.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (cb2 != null) {
                        parcelObtain.writeInt(1);
                        cb2.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.f9772a.transact(1, parcelObtain, parcelObtain2, 0) || AbstractBinderC0018b.k() == null) {
                        parcelObtain2.readException();
                    } else {
                        AbstractBinderC0018b.k().r4(command, args, cb2);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void stop() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0018b.f9729a);
                    if (this.f9772a.transact(19, parcelObtain, parcelObtain2, 0) || AbstractBinderC0018b.k() == null) {
                        parcelObtain2.readException();
                    } else {
                        AbstractBinderC0018b.k().stop();
                    }
                    parcelObtain2.recycle();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void x5(android.support.v4.media.session.a cb2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0018b.f9729a);
                    parcelObtain.writeStrongBinder(cb2 != null ? cb2.asBinder() : null);
                    if (this.f9772a.transact(3, parcelObtain, parcelObtain2, 0) || AbstractBinderC0018b.k() == null) {
                        parcelObtain2.readException();
                    } else {
                        AbstractBinderC0018b.k().x5(cb2);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public MediaMetadataCompat z() throws RemoteException {
                MediaMetadataCompat mediaMetadataCompatCreateFromParcel;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0018b.f9729a);
                    if (this.f9772a.transact(27, parcelObtain, parcelObtain2, 0) || AbstractBinderC0018b.k() == null) {
                        parcelObtain2.readException();
                        mediaMetadataCompatCreateFromParcel = parcelObtain2.readInt() != 0 ? MediaMetadataCompat.CREATOR.createFromParcel(parcelObtain2) : null;
                    } else {
                        mediaMetadataCompatCreateFromParcel = AbstractBinderC0018b.k().z();
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return mediaMetadataCompatCreateFromParcel;
                } catch (Throwable th2) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th2;
                }
            }
        }

        public AbstractBinderC0018b() {
            attachInterface(this, f9729a);
        }

        public static b i(IBinder obj) {
            if (obj == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = obj.queryLocalInterface(f9729a);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) ? new a(obj) : (b) iInterfaceQueryLocalInterface;
        }

        public static b k() {
            return a.f9771b;
        }

        public static boolean n(b impl) {
            if (a.f9771b != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (impl == null) {
                return false;
            }
            a.f9771b = impl;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 == 1598968902) {
                parcel2.writeString(f9729a);
                return true;
            }
            switch (i10) {
                case 1:
                    parcel.enforceInterface(f9729a);
                    r4(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? MediaSessionCompat.ResultReceiverWrapper.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface(f9729a);
                    boolean zAa = Aa(parcel.readInt() != 0 ? (KeyEvent) KeyEvent.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(zAa ? 1 : 0);
                    return true;
                case 3:
                    parcel.enforceInterface(f9729a);
                    x5(android.support.v4.media.session.a.b.i(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface(f9729a);
                    A6(android.support.v4.media.session.a.b.i(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface(f9729a);
                    boolean zS5 = S5();
                    parcel2.writeNoException();
                    parcel2.writeInt(zS5 ? 1 : 0);
                    return true;
                case 6:
                    parcel.enforceInterface(f9729a);
                    String packageName = getPackageName();
                    parcel2.writeNoException();
                    parcel2.writeString(packageName);
                    return true;
                case 7:
                    parcel.enforceInterface(f9729a);
                    String strE = E();
                    parcel2.writeNoException();
                    parcel2.writeString(strE);
                    return true;
                case 8:
                    parcel.enforceInterface(f9729a);
                    PendingIntent pendingIntentN2 = n2();
                    parcel2.writeNoException();
                    if (pendingIntentN2 != null) {
                        parcel2.writeInt(1);
                        pendingIntentN2.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 9:
                    parcel.enforceInterface(f9729a);
                    long jI = I();
                    parcel2.writeNoException();
                    parcel2.writeLong(jI);
                    return true;
                case 10:
                    parcel.enforceInterface(f9729a);
                    ParcelableVolumeInfo parcelableVolumeInfoM8 = m8();
                    parcel2.writeNoException();
                    if (parcelableVolumeInfoM8 != null) {
                        parcel2.writeInt(1);
                        parcelableVolumeInfoM8.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 11:
                    parcel.enforceInterface(f9729a);
                    Hd(parcel.readInt(), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 12:
                    parcel.enforceInterface(f9729a);
                    nc(parcel.readInt(), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 13:
                    parcel.enforceInterface(f9729a);
                    B();
                    parcel2.writeNoException();
                    return true;
                case 14:
                    parcel.enforceInterface(f9729a);
                    a3(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 15:
                    parcel.enforceInterface(f9729a);
                    X9(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 16:
                    parcel.enforceInterface(f9729a);
                    ea(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 17:
                    parcel.enforceInterface(f9729a);
                    Jb(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 18:
                    parcel.enforceInterface(f9729a);
                    pause();
                    parcel2.writeNoException();
                    return true;
                case 19:
                    parcel.enforceInterface(f9729a);
                    stop();
                    parcel2.writeNoException();
                    return true;
                case 20:
                    parcel.enforceInterface(f9729a);
                    next();
                    parcel2.writeNoException();
                    return true;
                case 21:
                    parcel.enforceInterface(f9729a);
                    previous();
                    parcel2.writeNoException();
                    return true;
                case 22:
                    parcel.enforceInterface(f9729a);
                    D1();
                    parcel2.writeNoException();
                    return true;
                case 23:
                    parcel.enforceInterface(f9729a);
                    P();
                    parcel2.writeNoException();
                    return true;
                case 24:
                    parcel.enforceInterface(f9729a);
                    F(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 25:
                    parcel.enforceInterface(f9729a);
                    mc(parcel.readInt() != 0 ? RatingCompat.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 26:
                    parcel.enforceInterface(f9729a);
                    E1(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 27:
                    parcel.enforceInterface(f9729a);
                    MediaMetadataCompat mediaMetadataCompatZ = z();
                    parcel2.writeNoException();
                    if (mediaMetadataCompatZ != null) {
                        parcel2.writeInt(1);
                        mediaMetadataCompatZ.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 28:
                    parcel.enforceInterface(f9729a);
                    PlaybackStateCompat playbackStateCompatH = H();
                    parcel2.writeNoException();
                    if (playbackStateCompatH != null) {
                        parcel2.writeInt(1);
                        playbackStateCompatH.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 29:
                    parcel.enforceInterface(f9729a);
                    List<MediaSessionCompat.QueueItem> listE = e();
                    parcel2.writeNoException();
                    parcel2.writeTypedList(listE);
                    return true;
                case 30:
                    parcel.enforceInterface(f9729a);
                    CharSequence charSequenceK0 = k0();
                    parcel2.writeNoException();
                    if (charSequenceK0 != null) {
                        parcel2.writeInt(1);
                        TextUtils.writeToParcel(charSequenceK0, parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 31:
                    parcel.enforceInterface(f9729a);
                    Bundle extras = getExtras();
                    parcel2.writeNoException();
                    if (extras != null) {
                        parcel2.writeInt(1);
                        extras.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 32:
                    parcel.enforceInterface(f9729a);
                    int iO0 = O0();
                    parcel2.writeNoException();
                    parcel2.writeInt(iO0);
                    return true;
                case 33:
                    parcel.enforceInterface(f9729a);
                    A();
                    parcel2.writeNoException();
                    return true;
                case 34:
                    parcel.enforceInterface(f9729a);
                    T2(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 35:
                    parcel.enforceInterface(f9729a);
                    Ec(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 36:
                    parcel.enforceInterface(f9729a);
                    c2(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 37:
                    parcel.enforceInterface(f9729a);
                    int iC = C();
                    parcel2.writeNoException();
                    parcel2.writeInt(iC);
                    return true;
                case 38:
                    parcel.enforceInterface(f9729a);
                    boolean zO1 = O1();
                    parcel2.writeNoException();
                    parcel2.writeInt(zO1 ? 1 : 0);
                    return true;
                case 39:
                    parcel.enforceInterface(f9729a);
                    D(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 40:
                    parcel.enforceInterface(f9729a);
                    R4(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 41:
                    parcel.enforceInterface(f9729a);
                    j1(parcel.readInt() != 0 ? MediaDescriptionCompat.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 42:
                    parcel.enforceInterface(f9729a);
                    Ra(parcel.readInt() != 0 ? MediaDescriptionCompat.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 43:
                    parcel.enforceInterface(f9729a);
                    h1(parcel.readInt() != 0 ? MediaDescriptionCompat.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 44:
                    parcel.enforceInterface(f9729a);
                    h4(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 45:
                    parcel.enforceInterface(f9729a);
                    boolean zD0 = d0();
                    parcel2.writeNoException();
                    parcel2.writeInt(zD0 ? 1 : 0);
                    return true;
                case 46:
                    parcel.enforceInterface(f9729a);
                    r0(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 47:
                    parcel.enforceInterface(f9729a);
                    int iJ = J();
                    parcel2.writeNoException();
                    parcel2.writeInt(iJ);
                    return true;
                case 48:
                    parcel.enforceInterface(f9729a);
                    K(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 49:
                    parcel.enforceInterface(f9729a);
                    G(parcel.readFloat());
                    parcel2.writeNoException();
                    return true;
                case 50:
                    parcel.enforceInterface(f9729a);
                    Bundle bundleT0 = T0();
                    parcel2.writeNoException();
                    if (bundleT0 != null) {
                        parcel2.writeInt(1);
                        bundleT0.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 51:
                    parcel.enforceInterface(f9729a);
                    M3(parcel.readInt() != 0 ? RatingCompat.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i10, parcel, parcel2, i11);
            }
        }
    }

    void A() throws RemoteException;

    void A6(android.support.v4.media.session.a cb2) throws RemoteException;

    boolean Aa(KeyEvent mediaButton) throws RemoteException;

    void B() throws RemoteException;

    int C() throws RemoteException;

    void D(int repeatMode) throws RemoteException;

    void D1() throws RemoteException;

    String E() throws RemoteException;

    void E1(String action, Bundle args) throws RemoteException;

    void Ec(String string, Bundle extras) throws RemoteException;

    void F(long pos) throws RemoteException;

    void G(float speed) throws RemoteException;

    PlaybackStateCompat H() throws RemoteException;

    void Hd(int direction, int flags, String packageName) throws RemoteException;

    long I() throws RemoteException;

    int J() throws RemoteException;

    void Jb(long id2) throws RemoteException;

    void K(int shuffleMode) throws RemoteException;

    void M3(RatingCompat rating, Bundle extras) throws RemoteException;

    int O0() throws RemoteException;

    boolean O1() throws RemoteException;

    void P() throws RemoteException;

    void R4(boolean shuffleMode) throws RemoteException;

    void Ra(MediaDescriptionCompat description, int index) throws RemoteException;

    boolean S5() throws RemoteException;

    Bundle T0() throws RemoteException;

    void T2(String uri, Bundle extras) throws RemoteException;

    void X9(String string, Bundle extras) throws RemoteException;

    void a3(String uri, Bundle extras) throws RemoteException;

    void c2(Uri uri, Bundle extras) throws RemoteException;

    boolean d0() throws RemoteException;

    List<MediaSessionCompat.QueueItem> e() throws RemoteException;

    void ea(Uri uri, Bundle extras) throws RemoteException;

    Bundle getExtras() throws RemoteException;

    String getPackageName() throws RemoteException;

    void h1(MediaDescriptionCompat description) throws RemoteException;

    void h4(int index) throws RemoteException;

    void j1(MediaDescriptionCompat description) throws RemoteException;

    CharSequence k0() throws RemoteException;

    ParcelableVolumeInfo m8() throws RemoteException;

    void mc(RatingCompat rating) throws RemoteException;

    PendingIntent n2() throws RemoteException;

    void nc(int value, int flags, String packageName) throws RemoteException;

    void next() throws RemoteException;

    void pause() throws RemoteException;

    void previous() throws RemoteException;

    void r0(boolean enabled) throws RemoteException;

    void r4(String command, Bundle args, MediaSessionCompat.ResultReceiverWrapper cb2) throws RemoteException;

    void stop() throws RemoteException;

    void x5(android.support.v4.media.session.a cb2) throws RemoteException;

    MediaMetadataCompat z() throws RemoteException;
}
