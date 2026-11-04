package androidx.media2.session;

import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import android.view.KeyEvent;
import androidx.media2.common.MediaParcelUtils;
import androidx.versionedparcelable.ParcelImpl;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
class x implements w.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f59442f = "MSS2ImplBase";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final boolean f59443g = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.b0("mLock")
    a f59445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.b0("mLock")
    w f59446c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.b0("mLock")
    private s f59448e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f59444a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.b0("mLock")
    private Map<String, MediaSession> f59447d = new androidx.collection.a();

    private static final class a extends d.b implements Closeable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final WeakReference<x> f59449c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Handler f59450d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final androidx.media.f f59451e;

        /* JADX INFO: renamed from: androidx.media2.session.x$a$a, reason: collision with other inner class name */
        class RunnableC0555a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.media.f.b f59452a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ConnectionRequest f59453b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f59454c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Bundle f59455d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ b f59456e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ String f59457f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ int f59458g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ int f59459h;

            RunnableC0555a(androidx.media.f.b bVar, ConnectionRequest connectionRequest, boolean z10, Bundle bundle, b bVar2, String str, int i10, int i11) {
                this.f59452a = bVar;
                this.f59453b = connectionRequest;
                this.f59454c = z10;
                this.f59455d = bundle;
                this.f59456e = bVar2;
                this.f59457f = str;
                this.f59458g = i10;
                this.f59459h = i11;
            }

            @Override // java.lang.Runnable
            public void run() throws Throwable {
                w wVarI;
                boolean z10 = true;
                try {
                    x xVar = a.this.f59449c.get();
                    try {
                        if (xVar != null && (wVarI = xVar.i()) != null) {
                            MediaSession.d dVar = new MediaSession.d(this.f59452a, this.f59453b.g(), this.f59454c, null, this.f59455d);
                            dVar.toString();
                            try {
                                MediaSession mediaSessionD = wVarI.d(dVar);
                                if (mediaSessionD != null) {
                                    wVarI.a(mediaSessionD);
                                    try {
                                        mediaSessionD.f(this.f59456e, this.f59453b.g(), this.f59457f, this.f59458g, this.f59459h, this.f59455d);
                                    } catch (Exception unused) {
                                    } catch (Throwable th2) {
                                        th = th2;
                                        z10 = false;
                                        if (z10) {
                                            try {
                                                this.f59456e.O8(0);
                                            } catch (RemoteException unused2) {
                                            }
                                        }
                                        throw th;
                                    }
                                    z10 = false;
                                    if (z10) {
                                        this.f59456e.O8(0);
                                        return;
                                    }
                                    return;
                                }
                                dVar.toString();
                            } catch (Exception unused3) {
                            }
                        }
                        this.f59456e.O8(0);
                    } catch (RemoteException unused4) {
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        }

        a(x xVar) {
            this.f59449c = new WeakReference<>(xVar);
            this.f59450d = new Handler(xVar.i().getMainLooper());
            this.f59451e = androidx.media.f.b(xVar.i());
        }

        @Override // androidx.media2.session.d
        public void D3(b bVar, ParcelImpl parcelImpl) {
            if (this.f59449c.get() == null) {
                return;
            }
            int callingPid = Binder.getCallingPid();
            int callingUid = Binder.getCallingUid();
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            ConnectionRequest connectionRequest = (ConnectionRequest) MediaParcelUtils.a(parcelImpl);
            if (callingPid == 0) {
                callingPid = connectionRequest.f();
            }
            int i10 = callingPid;
            String packageName = parcelImpl == null ? null : connectionRequest.getPackageName();
            Bundle bundleD = parcelImpl != null ? connectionRequest.d() : null;
            androidx.media.f.b bVar2 = new androidx.media.f.b(packageName, i10, callingUid);
            try {
                this.f59450d.post(new RunnableC0555a(bVar2, connectionRequest, this.f59451e.c(bVar2), bundleD, bVar, packageName, i10, callingUid));
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f59449c.clear();
            this.f59450d.removeCallbacksAndMessages(null);
        }
    }

    x() {
    }

    @Override // androidx.media2.session.w.b
    public IBinder a(Intent intent) {
        MediaSession mediaSessionD;
        w wVarI = i();
        if (wVarI == null) {
            return null;
        }
        String action = intent.getAction();
        action.getClass();
        if (action.equals(w.f59438b)) {
            return j();
        }
        if (!action.equals(androidx.media.e.f52772k) || (mediaSessionD = wVarI.d(MediaSession.d.a())) == null) {
            return null;
        }
        c(mediaSessionD);
        return mediaSessionD.c();
    }

    @Override // androidx.media2.session.w.b
    public void b() {
        synchronized (this.f59444a) {
            try {
                this.f59446c = null;
                a aVar = this.f59445b;
                if (aVar != null) {
                    aVar.close();
                    this.f59445b = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media2.session.w.b
    public void c(MediaSession mediaSession) {
        MediaSession mediaSession2;
        s sVar;
        synchronized (this.f59444a) {
            try {
                mediaSession2 = this.f59447d.get(mediaSession.getId());
                if (mediaSession2 != null && mediaSession2 != mediaSession) {
                    throw new IllegalArgumentException("Session ID should be unique");
                }
                this.f59447d.put(mediaSession.getId(), mediaSession);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (mediaSession2 == null) {
            synchronized (this.f59444a) {
                sVar = this.f59448e;
            }
            sVar.b(mediaSession, mediaSession.J5().s0());
            mediaSession.u().p(sVar);
        }
    }

    @Override // androidx.media2.session.w.b
    public List<MediaSession> d() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f59444a) {
            try {
                arrayList.addAll(this.f59447d.values());
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayList;
    }

    @Override // androidx.media2.session.w.b
    public void e(MediaSession mediaSession) {
        synchronized (this.f59444a) {
            this.f59447d.remove(mediaSession.getId());
        }
    }

    @Override // androidx.media2.session.w.b
    public w.a f(MediaSession mediaSession) {
        s sVar;
        synchronized (this.f59444a) {
            try {
                sVar = this.f59448e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (sVar != null) {
            return sVar.i(mediaSession);
        }
        throw new IllegalStateException("Service hasn't created");
    }

    @Override // androidx.media2.session.w.b
    public int g(Intent intent, int i10, int i11) {
        KeyEvent keyEvent;
        if (intent != null && intent.getAction() != null) {
            String action = intent.getAction();
            action.getClass();
            if (action.equals("android.intent.action.MEDIA_BUTTON")) {
                w wVarI = i();
                if (wVarI == null) {
                    Log.wtf(f59442f, "Service hasn't created");
                }
                MediaSession mediaSessionD = MediaSession.d(intent.getData());
                if (mediaSessionD == null) {
                    mediaSessionD = wVarI.d(MediaSession.d.a());
                }
                if (mediaSessionD != null && (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) != null) {
                    mediaSessionD.cb().e().d(keyEvent);
                }
            }
        }
        return 1;
    }

    @Override // androidx.media2.session.w.b
    public void h(w wVar) {
        synchronized (this.f59444a) {
            this.f59446c = wVar;
            this.f59445b = new a(this);
            this.f59448e = new s(wVar);
        }
    }

    w i() {
        w wVar;
        synchronized (this.f59444a) {
            try {
                wVar = this.f59446c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return wVar;
    }

    IBinder j() {
        IBinder iBinderAsBinder;
        synchronized (this.f59444a) {
            try {
                a aVar = this.f59445b;
                iBinderAsBinder = aVar != null ? aVar.asBinder() : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iBinderAsBinder;
    }
}
