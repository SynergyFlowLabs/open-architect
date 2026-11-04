package android.support.v4.media.session;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.text.TextUtils;
import android.view.KeyEvent;
import androidx.annotation.NonNull;
import androidx.annotation.b0;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.core.app.l;
import androidx.media.AudioAttributesCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class MediaControllerCompat {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final String f9479d = "MediaControllerCompat";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @b1({b1.a.LIBRARY})
    public static final String f9480e = "android.support.v4.media.session.command.GET_EXTRA_BINDER";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @b1({b1.a.LIBRARY})
    public static final String f9481f = "android.support.v4.media.session.command.ADD_QUEUE_ITEM";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @b1({b1.a.LIBRARY})
    public static final String f9482g = "android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @b1({b1.a.LIBRARY})
    public static final String f9483h = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @b1({b1.a.LIBRARY})
    public static final String f9484i = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @b1({b1.a.LIBRARY})
    public static final String f9485j = "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @b1({b1.a.LIBRARY})
    public static final String f9486k = "android.support.v4.media.session.command.ARGUMENT_INDEX";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f9487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MediaSessionCompat.Token f9488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @e.a({"BanConcurrentHashMap"})
    private final ConcurrentHashMap<a, Boolean> f9489c = new ConcurrentHashMap<>();

    @w0(21)
    static class MediaControllerImplApi21 implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final MediaController f9490a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Object f9491b = new Object();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @b0("mLock")
        private final List<a> f9492c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private HashMap<a, a> f9493d = new HashMap<>();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        protected Bundle f9494e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final MediaSessionCompat.Token f9495f;

        private static class ExtraBinderRequestResultReceiver extends ResultReceiver {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private WeakReference<MediaControllerImplApi21> f9496a;

            ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImpl) {
                super(null);
                this.f9496a = new WeakReference<>(mediaControllerImpl);
            }

            @Override // android.os.ResultReceiver
            protected void onReceiveResult(int resultCode, Bundle resultData) {
                MediaControllerImplApi21 mediaControllerImplApi21 = this.f9496a.get();
                if (mediaControllerImplApi21 != null && resultData != null) {
                    synchronized (mediaControllerImplApi21.f9491b) {
                        try {
                            mediaControllerImplApi21.f9495f.h(android.support.v4.media.session.b.AbstractBinderC0018b.i(l.a(resultData, MediaSessionCompat.L)));
                            mediaControllerImplApi21.f9495f.i(androidx.versionedparcelable.c.c(resultData, MediaSessionCompat.M));
                            mediaControllerImplApi21.b();
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
        }

        private static class a extends a.c {
            a(a callback) {
                super(callback);
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.c, android.support.v4.media.session.a
            public void Ed(CharSequence title) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.c, android.support.v4.media.session.a
            public void G2(List<MediaSessionCompat.QueueItem> queue) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.c, android.support.v4.media.session.a
            public void Lc(Bundle extras) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.c, android.support.v4.media.session.a
            public void N3() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.c, android.support.v4.media.session.a
            public void Pb(ParcelableVolumeInfo info) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.c, android.support.v4.media.session.a
            public void Sa(MediaMetadataCompat metadata) throws RemoteException {
                throw new AssertionError();
            }
        }

        MediaControllerImplApi21(Context context, MediaSessionCompat.Token sessionToken) {
            this.f9495f = sessionToken;
            this.f9490a = new MediaController(context, (MediaSession.Token) sessionToken.g());
            if (sessionToken.e() == null) {
                c();
            }
        }

        @p0
        static MediaControllerCompat a(@NonNull Activity activity) {
            MediaController mediaController = activity.getMediaController();
            if (mediaController == null) {
                return null;
            }
            return new MediaControllerCompat(activity, MediaSessionCompat.Token.b(mediaController.getSessionToken()));
        }

        private void c() {
            D1(MediaControllerCompat.f9480e, null, new ExtraBinderRequestResultReceiver(this));
        }

        static void d(@NonNull Activity activity, @p0 MediaControllerCompat mediaControllerCompat) {
            activity.setMediaController(mediaControllerCompat != null ? new MediaController(activity, (MediaSession.Token) mediaControllerCompat.t().g()) : null);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public void A1(int direction, int flags) {
            this.f9490a.adjustVolume(direction, flags);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public final void B1(a callback) {
            this.f9490a.unregisterCallback(callback.f9497a);
            synchronized (this.f9491b) {
                try {
                    if (this.f9495f.e() != null) {
                        try {
                            a aVarRemove = this.f9493d.remove(callback);
                            if (aVarRemove != null) {
                                callback.f9499c = null;
                                this.f9495f.e().A6(aVarRemove);
                            }
                        } catch (RemoteException unused) {
                        }
                    } else {
                        this.f9492c.remove(callback);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public int C() {
            if (this.f9495f.e() != null) {
                try {
                    return this.f9495f.e().C();
                } catch (RemoteException unused) {
                }
            }
            return -1;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public void C1(MediaDescriptionCompat description, int index) {
            if ((I() & 4) == 0) {
                throw new UnsupportedOperationException("This session doesn't support queue management operations");
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable(MediaControllerCompat.f9485j, description);
            bundle.putInt(MediaControllerCompat.f9486k, index);
            D1(MediaControllerCompat.f9482g, bundle, null);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public void D1(String command, Bundle params, ResultReceiver cb2) {
            this.f9490a.sendCommand(command, params, cb2);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public boolean E1() {
            return this.f9495f.e() != null;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public f F1() {
            return new j(this.f9490a.getTransportControls());
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public boolean G1(KeyEvent event) {
            return this.f9490a.dispatchMediaButtonEvent(event);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public PlaybackStateCompat H() {
            if (this.f9495f.e() != null) {
                try {
                    return this.f9495f.e().H();
                } catch (RemoteException unused) {
                }
            }
            PlaybackState playbackState = this.f9490a.getPlaybackState();
            if (playbackState != null) {
                return PlaybackStateCompat.a(playbackState);
            }
            return null;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public Object H1() {
            return this.f9490a;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public long I() {
            return this.f9490a.getFlags();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public final void I1(a callback, Handler handler) {
            this.f9490a.registerCallback(callback.f9497a, handler);
            synchronized (this.f9491b) {
                try {
                    if (this.f9495f.e() != null) {
                        a aVar = new a(callback);
                        this.f9493d.put(callback, aVar);
                        callback.f9499c = aVar;
                        try {
                            this.f9495f.e().x5(aVar);
                            callback.n(13, null, null);
                        } catch (RemoteException unused) {
                        }
                    } else {
                        callback.f9499c = null;
                        this.f9492c.add(callback);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public int J() {
            if (this.f9495f.e() != null) {
                try {
                    return this.f9495f.e().J();
                } catch (RemoteException unused) {
                }
            }
            return -1;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public void L0(int value, int flags) {
            this.f9490a.setVolumeTo(value, flags);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public PendingIntent M() {
            return this.f9490a.getSessionActivity();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public int O0() {
            return this.f9490a.getRatingType();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public Bundle T0() {
            if (this.f9494e != null) {
                return new Bundle(this.f9494e);
            }
            if (this.f9495f.e() != null) {
                try {
                    this.f9494e = this.f9495f.e().T0();
                } catch (RemoteException unused) {
                    this.f9494e = Bundle.EMPTY;
                }
            }
            Bundle bundleF = MediaSessionCompat.F(this.f9494e);
            this.f9494e = bundleF;
            return bundleF == null ? Bundle.EMPTY : new Bundle(this.f9494e);
        }

        @b0("mLock")
        void b() {
            if (this.f9495f.e() == null) {
                return;
            }
            for (a aVar : this.f9492c) {
                a aVar2 = new a(aVar);
                this.f9493d.put(aVar, aVar2);
                aVar.f9499c = aVar2;
                try {
                    this.f9495f.e().x5(aVar2);
                    aVar.n(13, null, null);
                } catch (RemoteException unused) {
                }
            }
            this.f9492c.clear();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public e b0() {
            MediaController.PlaybackInfo playbackInfo = this.f9490a.getPlaybackInfo();
            if (playbackInfo != null) {
                return new e(playbackInfo.getPlaybackType(), AudioAttributesCompat.i(playbackInfo.getAudioAttributes()), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume());
            }
            return null;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public boolean d0() {
            if (this.f9495f.e() != null) {
                try {
                    return this.f9495f.e().d0();
                } catch (RemoteException unused) {
                }
            }
            return false;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public List<MediaSessionCompat.QueueItem> e() {
            List<MediaSession.QueueItem> queue = this.f9490a.getQueue();
            if (queue != null) {
                return MediaSessionCompat.QueueItem.b(queue);
            }
            return null;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public Bundle getExtras() {
            return this.f9490a.getExtras();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public String getPackageName() {
            return this.f9490a.getPackageName();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public void h1(MediaDescriptionCompat description) {
            if ((I() & 4) == 0) {
                throw new UnsupportedOperationException("This session doesn't support queue management operations");
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable(MediaControllerCompat.f9485j, description);
            D1(MediaControllerCompat.f9483h, bundle, null);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public void j1(MediaDescriptionCompat description) {
            if ((I() & 4) == 0) {
                throw new UnsupportedOperationException("This session doesn't support queue management operations");
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable(MediaControllerCompat.f9485j, description);
            D1(MediaControllerCompat.f9481f, bundle, null);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public CharSequence k0() {
            return this.f9490a.getQueueTitle();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public MediaMetadataCompat z() {
            MediaMetadata metadata = this.f9490a.getMetadata();
            if (metadata != null) {
                return MediaMetadataCompat.b(metadata);
            }
            return null;
        }
    }

    public static abstract class a implements IBinder.DeathRecipient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final MediaController.Callback f9497a = new C0014a(this);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        b f9498b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        android.support.v4.media.session.a f9499c;

        /* JADX INFO: renamed from: android.support.v4.media.session.MediaControllerCompat$a$a, reason: collision with other inner class name */
        @w0(21)
        private static class C0014a extends MediaController.Callback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final WeakReference<a> f9500a;

            C0014a(a callback) {
                this.f9500a = new WeakReference<>(callback);
            }

            @Override // android.media.session.MediaController.Callback
            public void onAudioInfoChanged(MediaController.PlaybackInfo info) {
                a aVar = this.f9500a.get();
                if (aVar != null) {
                    aVar.b(new e(info.getPlaybackType(), AudioAttributesCompat.i(info.getAudioAttributes()), info.getVolumeControl(), info.getMaxVolume(), info.getCurrentVolume()));
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onExtrasChanged(Bundle extras) {
                MediaSessionCompat.b(extras);
                a aVar = this.f9500a.get();
                if (aVar != null) {
                    aVar.d(extras);
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onMetadataChanged(MediaMetadata metadataObj) {
                a aVar = this.f9500a.get();
                if (aVar != null) {
                    aVar.e(MediaMetadataCompat.b(metadataObj));
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onPlaybackStateChanged(PlaybackState stateObj) {
                a aVar = this.f9500a.get();
                if (aVar != null && aVar.f9499c == null) {
                    aVar.f(PlaybackStateCompat.a(stateObj));
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onQueueChanged(List<MediaSession.QueueItem> queue) {
                a aVar = this.f9500a.get();
                if (aVar != null) {
                    aVar.g(MediaSessionCompat.QueueItem.b(queue));
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onQueueTitleChanged(CharSequence title) {
                a aVar = this.f9500a.get();
                if (aVar != null) {
                    aVar.h(title);
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onSessionDestroyed() {
                a aVar = this.f9500a.get();
                if (aVar != null) {
                    aVar.j();
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onSessionEvent(String event, Bundle extras) {
                MediaSessionCompat.b(extras);
                a aVar = this.f9500a.get();
                if (aVar != null) {
                    aVar.k(event, extras);
                }
            }
        }

        private class b extends Handler {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final int f9501c = 1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static final int f9502d = 2;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static final int f9503e = 3;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private static final int f9504f = 4;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private static final int f9505g = 5;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private static final int f9506h = 6;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private static final int f9507i = 7;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private static final int f9508j = 8;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private static final int f9509k = 9;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private static final int f9510l = 11;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private static final int f9511m = 12;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private static final int f9512n = 13;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            boolean f9513a;

            b(Looper looper) {
                super(looper);
                this.f9513a = false;
            }

            @Override // android.os.Handler
            public void handleMessage(Message msg) {
                if (this.f9513a) {
                    switch (msg.what) {
                        case 1:
                            Bundle data = msg.getData();
                            MediaSessionCompat.b(data);
                            a.this.k((String) msg.obj, data);
                            break;
                        case 2:
                            a.this.f((PlaybackStateCompat) msg.obj);
                            break;
                        case 3:
                            a.this.e((MediaMetadataCompat) msg.obj);
                            break;
                        case 4:
                            a.this.b((e) msg.obj);
                            break;
                        case 5:
                            a.this.g((List) msg.obj);
                            break;
                        case 6:
                            a.this.h((CharSequence) msg.obj);
                            break;
                        case 7:
                            Bundle bundle = (Bundle) msg.obj;
                            MediaSessionCompat.b(bundle);
                            a.this.d(bundle);
                            break;
                        case 8:
                            a.this.j();
                            break;
                        case 9:
                            a.this.i(((Integer) msg.obj).intValue());
                            break;
                        case 11:
                            a.this.c(((Boolean) msg.obj).booleanValue());
                            break;
                        case 12:
                            a.this.m(((Integer) msg.obj).intValue());
                            break;
                        case 13:
                            a.this.l();
                            break;
                    }
                }
            }
        }

        private static class c extends android.support.v4.media.session.a.b {

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private final WeakReference<a> f9515o;

            c(a callback) {
                this.f9515o = new WeakReference<>(callback);
            }

            @Override // android.support.v4.media.session.a
            public void Dd(boolean enabled) throws RemoteException {
            }

            public void Ed(CharSequence title) throws RemoteException {
                a aVar = this.f9515o.get();
                if (aVar != null) {
                    aVar.n(6, title, null);
                }
            }

            public void G2(List<MediaSessionCompat.QueueItem> queue) throws RemoteException {
                a aVar = this.f9515o.get();
                if (aVar != null) {
                    aVar.n(5, queue, null);
                }
            }

            public void Lc(Bundle extras) throws RemoteException {
                a aVar = this.f9515o.get();
                if (aVar != null) {
                    aVar.n(7, extras, null);
                }
            }

            public void N3() throws RemoteException {
                a aVar = this.f9515o.get();
                if (aVar != null) {
                    aVar.n(8, null, null);
                }
            }

            public void Pb(ParcelableVolumeInfo info) throws RemoteException {
                a aVar = this.f9515o.get();
                if (aVar != null) {
                    aVar.n(4, info != null ? new e(info.f9646a, info.f9647b, info.f9648c, info.f9649d, info.f9650e) : null, null);
                }
            }

            public void Sa(MediaMetadataCompat metadata) throws RemoteException {
                a aVar = this.f9515o.get();
                if (aVar != null) {
                    aVar.n(3, metadata, null);
                }
            }

            @Override // android.support.v4.media.session.a
            public void of(PlaybackStateCompat state) throws RemoteException {
                a aVar = this.f9515o.get();
                if (aVar != null) {
                    aVar.n(2, state, null);
                }
            }

            @Override // android.support.v4.media.session.a
            public void onEvent(String event, Bundle extras) throws RemoteException {
                a aVar = this.f9515o.get();
                if (aVar != null) {
                    aVar.n(1, event, extras);
                }
            }

            @Override // android.support.v4.media.session.a
            public void pb(int shuffleMode) throws RemoteException {
                a aVar = this.f9515o.get();
                if (aVar != null) {
                    aVar.n(12, Integer.valueOf(shuffleMode), null);
                }
            }

            @Override // android.support.v4.media.session.a
            public void rd(boolean enabled) throws RemoteException {
                a aVar = this.f9515o.get();
                if (aVar != null) {
                    aVar.n(11, Boolean.valueOf(enabled), null);
                }
            }

            @Override // android.support.v4.media.session.a
            public void x(int repeatMode) throws RemoteException {
                a aVar = this.f9515o.get();
                if (aVar != null) {
                    aVar.n(9, Integer.valueOf(repeatMode), null);
                }
            }

            @Override // android.support.v4.media.session.a
            public void y2() throws RemoteException {
                a aVar = this.f9515o.get();
                if (aVar != null) {
                    aVar.n(13, null, null);
                }
            }
        }

        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        public android.support.v4.media.session.a a() {
            return this.f9499c;
        }

        public void b(e info) {
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            n(8, null, null);
        }

        public void c(boolean enabled) {
        }

        public void d(Bundle extras) {
        }

        public void e(MediaMetadataCompat metadata) {
        }

        public void f(PlaybackStateCompat state) {
        }

        public void g(List<MediaSessionCompat.QueueItem> queue) {
        }

        public void h(CharSequence title) {
        }

        public void i(int repeatMode) {
        }

        public void j() {
        }

        public void k(String event, Bundle extras) {
        }

        public void l() {
        }

        public void m(int shuffleMode) {
        }

        void n(int what, Object obj, Bundle data) {
            b bVar = this.f9498b;
            if (bVar != null) {
                Message messageObtainMessage = bVar.obtainMessage(what, obj);
                messageObtainMessage.setData(data);
                messageObtainMessage.sendToTarget();
            }
        }

        void o(Handler handler) {
            if (handler != null) {
                b bVar = new b(handler.getLooper());
                this.f9498b = bVar;
                bVar.f9513a = true;
            } else {
                b bVar2 = this.f9498b;
                if (bVar2 != null) {
                    bVar2.f9513a = false;
                    bVar2.removeCallbacksAndMessages(null);
                    this.f9498b = null;
                }
            }
        }
    }

    interface b {
        void A1(int direction, int flags);

        void B1(a callback);

        int C();

        void C1(MediaDescriptionCompat description, int index);

        void D1(String command, Bundle params, ResultReceiver cb2);

        boolean E1();

        f F1();

        boolean G1(KeyEvent keyEvent);

        PlaybackStateCompat H();

        Object H1();

        long I();

        void I1(a callback, Handler handler);

        int J();

        void L0(int value, int flags);

        PendingIntent M();

        int O0();

        Bundle T0();

        e b0();

        boolean d0();

        List<MediaSessionCompat.QueueItem> e();

        Bundle getExtras();

        String getPackageName();

        void h1(MediaDescriptionCompat description);

        void j1(MediaDescriptionCompat description);

        CharSequence k0();

        MediaMetadataCompat z();
    }

    @w0(29)
    static class c extends MediaControllerImplApi21 {
        c(Context context, MediaSessionCompat.Token sessionToken) {
            super(context, sessionToken);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImplApi21, android.support.v4.media.session.MediaControllerCompat.b
        public Bundle T0() {
            if (this.f9494e != null) {
                return new Bundle(this.f9494e);
            }
            Bundle sessionInfo = this.f9490a.getSessionInfo();
            this.f9494e = sessionInfo;
            Bundle bundleF = MediaSessionCompat.F(sessionInfo);
            this.f9494e = bundleF;
            return bundleF == null ? Bundle.EMPTY : new Bundle(this.f9494e);
        }
    }

    static class d implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private android.support.v4.media.session.b f9516a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private f f9517b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Bundle f9518c;

        d(MediaSessionCompat.Token token) {
            this.f9516a = android.support.v4.media.session.b.AbstractBinderC0018b.i((IBinder) token.g());
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public void A1(int direction, int flags) {
            try {
                this.f9516a.Hd(direction, flags, null);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public void B1(a callback) {
            if (callback == null) {
                throw new IllegalArgumentException("callback may not be null.");
            }
            try {
                this.f9516a.A6(callback.f9499c);
                this.f9516a.asBinder().unlinkToDeath(callback, 0);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public int C() {
            try {
                return this.f9516a.C();
            } catch (RemoteException unused) {
                return -1;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public void C1(MediaDescriptionCompat description, int index) {
            try {
                if ((this.f9516a.I() & 4) == 0) {
                    throw new UnsupportedOperationException("This session doesn't support queue management operations");
                }
                this.f9516a.Ra(description, index);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public void D1(String command, Bundle params, ResultReceiver cb2) {
            try {
                this.f9516a.r4(command, params, cb2 == null ? null : new MediaSessionCompat.ResultReceiverWrapper(cb2));
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public boolean E1() {
            return true;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public f F1() {
            if (this.f9517b == null) {
                this.f9517b = new k(this.f9516a);
            }
            return this.f9517b;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public boolean G1(KeyEvent event) {
            if (event == null) {
                throw new IllegalArgumentException("event may not be null.");
            }
            try {
                this.f9516a.Aa(event);
            } catch (RemoteException unused) {
            }
            return false;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public PlaybackStateCompat H() {
            try {
                return this.f9516a.H();
            } catch (RemoteException unused) {
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public Object H1() {
            return null;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public long I() {
            try {
                return this.f9516a.I();
            } catch (RemoteException unused) {
                return 0L;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public void I1(a callback, Handler handler) {
            if (callback == null) {
                throw new IllegalArgumentException("callback may not be null.");
            }
            try {
                this.f9516a.asBinder().linkToDeath(callback, 0);
                this.f9516a.x5(callback.f9499c);
                callback.n(13, null, null);
            } catch (RemoteException unused) {
                callback.n(8, null, null);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public int J() {
            try {
                return this.f9516a.J();
            } catch (RemoteException unused) {
                return -1;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public void L0(int value, int flags) {
            try {
                this.f9516a.nc(value, flags, null);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public PendingIntent M() {
            try {
                return this.f9516a.n2();
            } catch (RemoteException unused) {
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public int O0() {
            try {
                return this.f9516a.O0();
            } catch (RemoteException unused) {
                return 0;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public Bundle T0() {
            try {
                this.f9518c = this.f9516a.T0();
            } catch (RemoteException unused) {
            }
            Bundle bundleF = MediaSessionCompat.F(this.f9518c);
            this.f9518c = bundleF;
            return bundleF == null ? Bundle.EMPTY : new Bundle(this.f9518c);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public e b0() {
            try {
                ParcelableVolumeInfo parcelableVolumeInfoM8 = this.f9516a.m8();
                return new e(parcelableVolumeInfoM8.f9646a, parcelableVolumeInfoM8.f9647b, parcelableVolumeInfoM8.f9648c, parcelableVolumeInfoM8.f9649d, parcelableVolumeInfoM8.f9650e);
            } catch (RemoteException unused) {
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public boolean d0() {
            try {
                return this.f9516a.d0();
            } catch (RemoteException unused) {
                return false;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public List<MediaSessionCompat.QueueItem> e() {
            try {
                return this.f9516a.e();
            } catch (RemoteException unused) {
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public Bundle getExtras() {
            try {
                return this.f9516a.getExtras();
            } catch (RemoteException unused) {
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public String getPackageName() {
            try {
                return this.f9516a.getPackageName();
            } catch (RemoteException unused) {
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public void h1(MediaDescriptionCompat description) {
            try {
                if ((this.f9516a.I() & 4) == 0) {
                    throw new UnsupportedOperationException("This session doesn't support queue management operations");
                }
                this.f9516a.h1(description);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public void j1(MediaDescriptionCompat description) {
            try {
                if ((this.f9516a.I() & 4) == 0) {
                    throw new UnsupportedOperationException("This session doesn't support queue management operations");
                }
                this.f9516a.j1(description);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public CharSequence k0() {
            try {
                return this.f9516a.k0();
            } catch (RemoteException unused) {
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public MediaMetadataCompat z() {
            try {
                return this.f9516a.z();
            } catch (RemoteException unused) {
                return null;
            }
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f9519f = 1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f9520g = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f9521a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AudioAttributesCompat f9522b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f9523c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f9524d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f9525e;

        e(int type, int stream, int control, int max, int current) {
            this(type, new AudioAttributesCompat.d().d(stream).a(), control, max, current);
        }

        @NonNull
        public AudioAttributesCompat a() {
            return this.f9522b;
        }

        @Deprecated
        public int b() {
            return this.f9522b.a5();
        }

        public int c() {
            return this.f9525e;
        }

        public int d() {
            return this.f9524d;
        }

        public int e() {
            return this.f9521a;
        }

        public int f() {
            return this.f9523c;
        }

        e(int type, @NonNull AudioAttributesCompat attrsCompat, int control, int max, int current) {
            this.f9521a = type;
            this.f9522b = attrsCompat;
            this.f9523c = control;
            this.f9524d = max;
            this.f9525e = current;
        }
    }

    public static abstract class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Deprecated
        public static final String f9526a = "android.media.session.extra.LEGACY_STREAM_TYPE";

        f() {
        }

        public abstract void a();

        public abstract void b();

        public abstract void c();

        public abstract void d(String mediaId, Bundle extras);

        public abstract void e(String query, Bundle extras);

        public abstract void f(Uri uri, Bundle extras);

        public abstract void g();

        public abstract void h(String mediaId, Bundle extras);

        public abstract void i(String query, Bundle extras);

        public abstract void j(Uri uri, Bundle extras);

        public abstract void k();

        public abstract void l(long pos);

        public abstract void m(PlaybackStateCompat.CustomAction customAction, Bundle args);

        public abstract void n(String action, Bundle args);

        public abstract void o(boolean enabled);

        public void p(float speed) {
        }

        public abstract void q(RatingCompat rating);

        public abstract void r(RatingCompat rating, Bundle extras);

        public abstract void s(int repeatMode);

        public abstract void t(int shuffleMode);

        public abstract void u();

        public abstract void v();

        public abstract void w(long id2);

        public abstract void x();
    }

    @w0(21)
    static class g extends f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected final MediaController.TransportControls f9527b;

        g(MediaController.TransportControls controlsFwk) {
            this.f9527b = controlsFwk;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void a() {
            this.f9527b.fastForward();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void b() {
            this.f9527b.pause();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void c() {
            this.f9527b.play();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void d(String mediaId, Bundle extras) {
            this.f9527b.playFromMediaId(mediaId, extras);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void e(String query, Bundle extras) {
            this.f9527b.playFromSearch(query, extras);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void f(Uri uri, Bundle extras) {
            if (uri == null || Uri.EMPTY.equals(uri)) {
                throw new IllegalArgumentException("You must specify a non-empty Uri for playFromUri.");
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable(MediaSessionCompat.D, uri);
            bundle.putBundle(MediaSessionCompat.G, extras);
            n(MediaSessionCompat.f9543r, bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void g() {
            n(MediaSessionCompat.f9544s, null);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void h(String mediaId, Bundle extras) {
            Bundle bundle = new Bundle();
            bundle.putString(MediaSessionCompat.B, mediaId);
            bundle.putBundle(MediaSessionCompat.G, extras);
            n(MediaSessionCompat.f9545t, bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void i(String query, Bundle extras) {
            Bundle bundle = new Bundle();
            bundle.putString(MediaSessionCompat.C, query);
            bundle.putBundle(MediaSessionCompat.G, extras);
            n(MediaSessionCompat.f9546u, bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void j(Uri uri, Bundle extras) {
            Bundle bundle = new Bundle();
            bundle.putParcelable(MediaSessionCompat.D, uri);
            bundle.putBundle(MediaSessionCompat.G, extras);
            n(MediaSessionCompat.f9547v, bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void k() {
            this.f9527b.rewind();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void l(long pos) {
            this.f9527b.seekTo(pos);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void m(PlaybackStateCompat.CustomAction customAction, Bundle args) {
            MediaControllerCompat.G(customAction.b(), args);
            this.f9527b.sendCustomAction(customAction.b(), args);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void n(String action, Bundle args) {
            MediaControllerCompat.G(action, args);
            this.f9527b.sendCustomAction(action, args);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void o(boolean enabled) {
            Bundle bundle = new Bundle();
            bundle.putBoolean(MediaSessionCompat.H, enabled);
            n(MediaSessionCompat.f9548w, bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void p(float speed) {
            if (speed == 0.0f) {
                throw new IllegalArgumentException("speed must not be zero");
            }
            Bundle bundle = new Bundle();
            bundle.putFloat(MediaSessionCompat.F, speed);
            n(MediaSessionCompat.A, bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void q(RatingCompat rating) {
            this.f9527b.setRating(rating != null ? (Rating) rating.c() : null);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void r(RatingCompat rating, Bundle extras) {
            Bundle bundle = new Bundle();
            bundle.putParcelable(MediaSessionCompat.E, rating);
            bundle.putBundle(MediaSessionCompat.G, extras);
            n(MediaSessionCompat.f9551z, bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void s(int repeatMode) {
            Bundle bundle = new Bundle();
            bundle.putInt(MediaSessionCompat.I, repeatMode);
            n(MediaSessionCompat.f9549x, bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void t(int shuffleMode) {
            Bundle bundle = new Bundle();
            bundle.putInt(MediaSessionCompat.J, shuffleMode);
            n(MediaSessionCompat.f9550y, bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void u() {
            this.f9527b.skipToNext();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void v() {
            this.f9527b.skipToPrevious();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void w(long id2) {
            this.f9527b.skipToQueueItem(id2);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void x() {
            this.f9527b.stop();
        }
    }

    @w0(23)
    static class h extends g {
        h(MediaController.TransportControls controlsFwk) {
            super(controlsFwk);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.g, android.support.v4.media.session.MediaControllerCompat.f
        public void f(Uri uri, Bundle extras) {
            this.f9527b.playFromUri(uri, extras);
        }
    }

    @w0(24)
    static class i extends h {
        i(MediaController.TransportControls controlsFwk) {
            super(controlsFwk);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.g, android.support.v4.media.session.MediaControllerCompat.f
        public void g() {
            this.f9527b.prepare();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.g, android.support.v4.media.session.MediaControllerCompat.f
        public void h(String mediaId, Bundle extras) {
            this.f9527b.prepareFromMediaId(mediaId, extras);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.g, android.support.v4.media.session.MediaControllerCompat.f
        public void i(String query, Bundle extras) {
            this.f9527b.prepareFromSearch(query, extras);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.g, android.support.v4.media.session.MediaControllerCompat.f
        public void j(Uri uri, Bundle extras) {
            this.f9527b.prepareFromUri(uri, extras);
        }
    }

    @w0(29)
    static class j extends i {
        j(MediaController.TransportControls controlsFwk) {
            super(controlsFwk);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.g, android.support.v4.media.session.MediaControllerCompat.f
        public void p(float speed) {
            if (speed == 0.0f) {
                throw new IllegalArgumentException("speed must not be zero");
            }
            this.f9527b.setPlaybackSpeed(speed);
        }
    }

    static class k extends f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private android.support.v4.media.session.b f9528b;

        public k(android.support.v4.media.session.b binder) {
            this.f9528b = binder;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void a() {
            try {
                this.f9528b.D1();
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void b() {
            try {
                this.f9528b.pause();
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void c() {
            try {
                this.f9528b.B();
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void d(String mediaId, Bundle extras) {
            try {
                this.f9528b.a3(mediaId, extras);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void e(String query, Bundle extras) {
            try {
                this.f9528b.X9(query, extras);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void f(Uri uri, Bundle extras) {
            try {
                this.f9528b.ea(uri, extras);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void g() {
            try {
                this.f9528b.A();
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void h(String mediaId, Bundle extras) {
            try {
                this.f9528b.T2(mediaId, extras);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void i(String query, Bundle extras) {
            try {
                this.f9528b.Ec(query, extras);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void j(Uri uri, Bundle extras) {
            try {
                this.f9528b.c2(uri, extras);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void k() {
            try {
                this.f9528b.P();
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void l(long pos) {
            try {
                this.f9528b.F(pos);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void m(PlaybackStateCompat.CustomAction customAction, Bundle args) {
            n(customAction.b(), args);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void n(String action, Bundle args) {
            MediaControllerCompat.G(action, args);
            try {
                this.f9528b.E1(action, args);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void o(boolean enabled) {
            try {
                this.f9528b.r0(enabled);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void p(float speed) {
            if (speed == 0.0f) {
                throw new IllegalArgumentException("speed must not be zero");
            }
            try {
                this.f9528b.G(speed);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void q(RatingCompat rating) {
            try {
                this.f9528b.mc(rating);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void r(RatingCompat rating, Bundle extras) {
            try {
                this.f9528b.M3(rating, extras);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void s(int repeatMode) {
            try {
                this.f9528b.D(repeatMode);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void t(int shuffleMode) {
            try {
                this.f9528b.K(shuffleMode);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void u() {
            try {
                this.f9528b.next();
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void v() {
            try {
                this.f9528b.previous();
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void w(long id2) {
            try {
                this.f9528b.Jb(id2);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void x() {
            try {
                this.f9528b.stop();
            } catch (RemoteException unused) {
            }
        }
    }

    public MediaControllerCompat(Context context, @NonNull MediaSessionCompat session) {
        if (session == null) {
            throw new IllegalArgumentException("session must not be null");
        }
        MediaSessionCompat.Token tokenI = session.i();
        this.f9488b = tokenI;
        this.f9487a = new c(context, tokenI);
    }

    public static void D(@NonNull Activity activity, MediaControllerCompat mediaController) {
        activity.getWindow().getDecorView().setTag(androidx.media.j.b.f52935k, mediaController);
        MediaControllerImplApi21.d(activity, mediaController);
    }

    static void G(String action, Bundle args) {
        if (action == null) {
            return;
        }
        if (action.equals(MediaSessionCompat.f9536k) || action.equals(MediaSessionCompat.f9537l)) {
            if (args == null || !args.containsKey(MediaSessionCompat.f9538m)) {
                throw new IllegalArgumentException("An extra field android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE is required for this action " + action + ".");
            }
        }
    }

    public static MediaControllerCompat g(@NonNull Activity activity) {
        Object tag = activity.getWindow().getDecorView().getTag(androidx.media.j.b.f52935k);
        return tag instanceof MediaControllerCompat ? (MediaControllerCompat) tag : MediaControllerImplApi21.a(activity);
    }

    public void A(MediaDescriptionCompat description) {
        this.f9487a.h1(description);
    }

    @Deprecated
    public void B(int index) {
        MediaSessionCompat.QueueItem queueItem;
        List<MediaSessionCompat.QueueItem> listM = m();
        if (listM == null || index < 0 || index >= listM.size() || (queueItem = listM.get(index)) == null) {
            return;
        }
        A(queueItem.c());
    }

    public void C(@NonNull String command, @p0 Bundle params, @p0 ResultReceiver cb2) {
        if (TextUtils.isEmpty(command)) {
            throw new IllegalArgumentException("command must neither be null nor empty");
        }
        this.f9487a.D1(command, params, cb2);
    }

    public void E(int value, int flags) {
        this.f9487a.L0(value, flags);
    }

    public void F(@NonNull a callback) {
        if (callback == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        if (this.f9489c.remove(callback) == null) {
            return;
        }
        try {
            this.f9487a.B1(callback);
            callback.o(null);
        } catch (Throwable th2) {
            callback.o(null);
            throw th2;
        }
    }

    public void a(MediaDescriptionCompat description) {
        this.f9487a.j1(description);
    }

    public void b(MediaDescriptionCompat description, int index) {
        this.f9487a.C1(description, index);
    }

    public void c(int direction, int flags) {
        this.f9487a.A1(direction, flags);
    }

    public boolean d(KeyEvent keyEvent) {
        if (keyEvent != null) {
            return this.f9487a.G1(keyEvent);
        }
        throw new IllegalArgumentException("KeyEvent may not be null");
    }

    public Bundle e() {
        return this.f9487a.getExtras();
    }

    public long f() {
        return this.f9487a.I();
    }

    public Object h() {
        return this.f9487a.H1();
    }

    public MediaMetadataCompat i() {
        return this.f9487a.z();
    }

    public String j() {
        return this.f9487a.getPackageName();
    }

    public e k() {
        return this.f9487a.b0();
    }

    public PlaybackStateCompat l() {
        return this.f9487a.H();
    }

    public List<MediaSessionCompat.QueueItem> m() {
        return this.f9487a.e();
    }

    public CharSequence n() {
        return this.f9487a.k0();
    }

    public int o() {
        return this.f9487a.O0();
    }

    public int p() {
        return this.f9487a.C();
    }

    @b1({b1.a.LIBRARY})
    @p0
    public androidx.versionedparcelable.h q() {
        return this.f9488b.f();
    }

    public PendingIntent r() {
        return this.f9487a.M();
    }

    @NonNull
    public Bundle s() {
        return this.f9487a.T0();
    }

    public MediaSessionCompat.Token t() {
        return this.f9488b;
    }

    public int u() {
        return this.f9487a.J();
    }

    public f v() {
        return this.f9487a.F1();
    }

    public boolean w() {
        return this.f9487a.d0();
    }

    public boolean x() {
        return this.f9487a.E1();
    }

    public void y(@NonNull a callback) {
        z(callback, null);
    }

    public void z(@NonNull a callback, Handler handler) {
        if (callback == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        if (this.f9489c.putIfAbsent(callback, Boolean.TRUE) != null) {
            return;
        }
        if (handler == null) {
            handler = new Handler();
        }
        callback.o(handler);
        this.f9487a.I1(callback, handler);
    }

    public MediaControllerCompat(Context context, @NonNull MediaSessionCompat.Token sessionToken) {
        if (sessionToken == null) {
            throw new IllegalArgumentException("sessionToken must not be null");
        }
        this.f9488b = sessionToken;
        this.f9487a = new MediaControllerImplApi21(context, sessionToken);
    }
}
