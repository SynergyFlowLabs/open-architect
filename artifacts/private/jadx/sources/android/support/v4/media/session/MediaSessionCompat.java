package android.support.v4.media.session;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaDescription;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.RemoteControlClient;
import android.media.VolumeProvider;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import androidx.annotation.NonNull;
import androidx.annotation.b0;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.annotation.u;
import androidx.annotation.w0;
import androidx.core.app.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class MediaSessionCompat {

    @b1({b1.a.LIBRARY})
    public static final String A = "android.support.v4.media.session.action.SET_PLAYBACK_SPEED";

    @b1({b1.a.LIBRARY})
    public static final String B = "android.support.v4.media.session.action.ARGUMENT_MEDIA_ID";

    @b1({b1.a.LIBRARY})
    public static final String C = "android.support.v4.media.session.action.ARGUMENT_QUERY";

    @b1({b1.a.LIBRARY})
    public static final String D = "android.support.v4.media.session.action.ARGUMENT_URI";

    @b1({b1.a.LIBRARY})
    public static final String E = "android.support.v4.media.session.action.ARGUMENT_RATING";

    @b1({b1.a.LIBRARY})
    public static final String F = "android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED";

    @b1({b1.a.LIBRARY})
    public static final String G = "android.support.v4.media.session.action.ARGUMENT_EXTRAS";

    @b1({b1.a.LIBRARY})
    public static final String H = "android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED";

    @b1({b1.a.LIBRARY})
    public static final String I = "android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE";

    @b1({b1.a.LIBRARY})
    public static final String J = "android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE";

    @b1({b1.a.LIBRARY})
    public static final String K = "android.support.v4.media.session.TOKEN";

    @b1({b1.a.LIBRARY})
    public static final String L = "android.support.v4.media.session.EXTRA_BINDER";

    @b1({b1.a.LIBRARY})
    public static final String M = "android.support.v4.media.session.SESSION_TOKEN2";
    private static final int N = 320;
    private static final String O = "data_calling_pkg";
    private static final String P = "data_calling_pid";
    private static final String Q = "data_calling_uid";
    private static final String R = "data_extras";
    static int S = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final String f9529d = "MediaSessionCompat";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @b1({b1.a.LIBRARY})
    public static final int f9530e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final int f9531f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final int f9532g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f9533h = 4;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f9534i = "android.support.v4.media.session.action.FLAG_AS_INAPPROPRIATE";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f9535j = "android.support.v4.media.session.action.SKIP_AD";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f9536k = "android.support.v4.media.session.action.FOLLOW";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f9537l = "android.support.v4.media.session.action.UNFOLLOW";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f9538m = "android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f9539n = "android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE_VALUE";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f9540o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f9541p = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f9542q = 2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @b1({b1.a.LIBRARY})
    public static final String f9543r = "android.support.v4.media.session.action.PLAY_FROM_URI";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @b1({b1.a.LIBRARY})
    public static final String f9544s = "android.support.v4.media.session.action.PREPARE";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @b1({b1.a.LIBRARY})
    public static final String f9545t = "android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @b1({b1.a.LIBRARY})
    public static final String f9546u = "android.support.v4.media.session.action.PREPARE_FROM_SEARCH";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @b1({b1.a.LIBRARY})
    public static final String f9547v = "android.support.v4.media.session.action.PREPARE_FROM_URI";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @b1({b1.a.LIBRARY})
    public static final String f9548w = "android.support.v4.media.session.action.SET_CAPTIONING_ENABLED";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @b1({b1.a.LIBRARY})
    public static final String f9549x = "android.support.v4.media.session.action.SET_REPEAT_MODE";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @b1({b1.a.LIBRARY})
    public static final String f9550y = "android.support.v4.media.session.action.SET_SHUFFLE_MODE";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @b1({b1.a.LIBRARY})
    public static final String f9551z = "android.support.v4.media.session.action.SET_RATING";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f9552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MediaControllerCompat f9553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList<k> f9554c;

    @e.a({"BanParcelableUsage"})
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f9555d = -1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final MediaDescriptionCompat f9556a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f9557b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private MediaSession.QueueItem f9558c;

        class a implements Parcelable.Creator<QueueItem> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public QueueItem createFromParcel(Parcel p10) {
                return new QueueItem(p10);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public QueueItem[] newArray(int size) {
                return new QueueItem[size];
            }
        }

        @w0(21)
        private static class b {
            private b() {
            }

            @u
            static MediaSession.QueueItem a(MediaDescription description, long id2) {
                return new MediaSession.QueueItem(description, id2);
            }

            @u
            static MediaDescription b(MediaSession.QueueItem queueItem) {
                return queueItem.getDescription();
            }

            @u
            static long c(MediaSession.QueueItem queueItem) {
                return queueItem.getQueueId();
            }
        }

        public QueueItem(MediaDescriptionCompat description, long id2) {
            this(null, description, id2);
        }

        public static QueueItem a(Object queueItem) {
            if (queueItem == null) {
                return null;
            }
            MediaSession.QueueItem queueItem2 = (MediaSession.QueueItem) queueItem;
            return new QueueItem(queueItem2, MediaDescriptionCompat.a(b.b(queueItem2)), b.c(queueItem2));
        }

        public static List<QueueItem> b(List<?> itemList) {
            if (itemList == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<?> it = itemList.iterator();
            while (it.hasNext()) {
                arrayList.add(a(it.next()));
            }
            return arrayList;
        }

        public MediaDescriptionCompat c() {
            return this.f9556a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public long e() {
            return this.f9557b;
        }

        public Object f() {
            MediaSession.QueueItem queueItem = this.f9558c;
            if (queueItem != null) {
                return queueItem;
            }
            MediaSession.QueueItem queueItemA = b.a((MediaDescription) this.f9556a.g(), this.f9557b);
            this.f9558c = queueItemA;
            return queueItemA;
        }

        public String toString() {
            return "MediaSession.QueueItem {Description=" + this.f9556a + ", Id=" + this.f9557b + " }";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            this.f9556a.writeToParcel(dest, flags);
            dest.writeLong(this.f9557b);
        }

        private QueueItem(MediaSession.QueueItem queueItem, MediaDescriptionCompat description, long id2) {
            if (description == null) {
                throw new IllegalArgumentException("Description cannot be null");
            }
            if (id2 == -1) {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
            this.f9556a = description;
            this.f9557b = id2;
            this.f9558c = queueItem;
        }

        QueueItem(Parcel in) {
            this.f9556a = MediaDescriptionCompat.CREATOR.createFromParcel(in);
            this.f9557b = in.readLong();
        }
    }

    @e.a({"BanParcelableUsage"})
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f9560a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f9561b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @b0("mLock")
        private android.support.v4.media.session.b f9562c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @b0("mLock")
        private androidx.versionedparcelable.h f9563d;

        class a implements Parcelable.Creator<Token> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Token createFromParcel(Parcel in) {
                return new Token(in.readParcelable(null));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Token[] newArray(int size) {
                return new Token[size];
            }
        }

        Token(Object inner) {
            this(inner, null, null);
        }

        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        public static Token a(Bundle tokenBundle) {
            if (tokenBundle == null) {
                return null;
            }
            tokenBundle.setClassLoader(Token.class.getClassLoader());
            android.support.v4.media.session.b bVarI = android.support.v4.media.session.b.AbstractBinderC0018b.i(l.a(tokenBundle, MediaSessionCompat.L));
            androidx.versionedparcelable.h hVarC = androidx.versionedparcelable.c.c(tokenBundle, MediaSessionCompat.M);
            Token token = (Token) tokenBundle.getParcelable(MediaSessionCompat.K);
            if (token == null) {
                return null;
            }
            return new Token(token.f9561b, bVarI, hVarC);
        }

        public static Token b(Object token) {
            return c(token, null);
        }

        @b1({b1.a.LIBRARY})
        public static Token c(Object token, android.support.v4.media.session.b extraBinder) {
            if (token == null) {
                return null;
            }
            if (token instanceof MediaSession.Token) {
                return new Token(token, extraBinder);
            }
            throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @b1({b1.a.LIBRARY})
        public android.support.v4.media.session.b e() {
            android.support.v4.media.session.b bVar;
            synchronized (this.f9560a) {
                try {
                    bVar = this.f9562c;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return bVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.f9561b;
            if (obj2 == null) {
                return token.f9561b == null;
            }
            Object obj3 = token.f9561b;
            if (obj3 == null) {
                return false;
            }
            return obj2.equals(obj3);
        }

        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        public androidx.versionedparcelable.h f() {
            androidx.versionedparcelable.h hVar;
            synchronized (this.f9560a) {
                try {
                    hVar = this.f9563d;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return hVar;
        }

        public Object g() {
            return this.f9561b;
        }

        @b1({b1.a.LIBRARY})
        public void h(android.support.v4.media.session.b extraBinder) {
            synchronized (this.f9560a) {
                try {
                    this.f9562c = extraBinder;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public int hashCode() {
            Object obj = this.f9561b;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        public void i(androidx.versionedparcelable.h session2Token) {
            synchronized (this.f9560a) {
                this.f9563d = session2Token;
            }
        }

        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        public Bundle j() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(MediaSessionCompat.K, this);
            synchronized (this.f9560a) {
                try {
                    android.support.v4.media.session.b bVar = this.f9562c;
                    if (bVar != null) {
                        l.b(bundle, MediaSessionCompat.L, bVar.asBinder());
                    }
                    androidx.versionedparcelable.h hVar = this.f9563d;
                    if (hVar != null) {
                        androidx.versionedparcelable.c.e(bundle, MediaSessionCompat.M, hVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return bundle;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeParcelable((Parcelable) this.f9561b, flags);
        }

        Token(Object inner, android.support.v4.media.session.b extraBinder) {
            this(inner, extraBinder, null);
        }

        Token(Object inner, android.support.v4.media.session.b extraBinder, androidx.versionedparcelable.h session2Token) {
            this.f9560a = new Object();
            this.f9561b = inner;
            this.f9562c = extraBinder;
            this.f9563d = session2Token;
        }
    }

    class a extends b {
        a() {
        }
    }

    public static abstract class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f9567c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @b0("mLock")
        a f9569e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f9565a = new Object();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final MediaSession.Callback f9566b = new C0015b();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @b0("mLock")
        WeakReference<c> f9568d = new WeakReference<>(null);

        private class a extends Handler {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final int f9570b = 1;

            a(Looper looper) {
                super(looper);
            }

            @Override // android.os.Handler
            public void handleMessage(Message msg) {
                c cVar;
                b bVar;
                a aVar;
                if (msg.what == 1) {
                    synchronized (b.this.f9565a) {
                        cVar = b.this.f9568d.get();
                        bVar = b.this;
                        aVar = bVar.f9569e;
                    }
                    if (cVar != null && bVar == cVar.u() && aVar != null) {
                        cVar.G((androidx.media.f.b) msg.obj);
                        b.this.a(cVar, aVar);
                        cVar.G(null);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: android.support.v4.media.session.MediaSessionCompat$b$b, reason: collision with other inner class name */
        @w0(21)
        private class C0015b extends MediaSession.Callback {
            C0015b() {
            }

            private void a(c sessionImpl) {
                sessionImpl.G(null);
            }

            private f b() {
                f fVar;
                synchronized (b.this.f9565a) {
                    try {
                        fVar = (f) b.this.f9568d.get();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (fVar == null || b.this != fVar.u()) {
                    return null;
                }
                return fVar;
            }

            private void d(c sessionImpl) {
            }

            public void c(Rating ratingFwk, Bundle extras) {
            }

            @Override // android.media.session.MediaSession.Callback
            public void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
                f fVarB = b();
                if (fVarB == null) {
                    return;
                }
                MediaSessionCompat.b(bundle);
                d(fVarB);
                try {
                    QueueItem queueItem = null;
                    IBinder iBinderAsBinder = null;
                    queueItem = null;
                    if (str.equals(MediaControllerCompat.f9480e)) {
                        Bundle bundle2 = new Bundle();
                        Token tokenB = fVarB.b();
                        android.support.v4.media.session.b bVarE = tokenB.e();
                        if (bVarE != null) {
                            iBinderAsBinder = bVarE.asBinder();
                        }
                        l.b(bundle2, MediaSessionCompat.L, iBinderAsBinder);
                        androidx.versionedparcelable.c.e(bundle2, MediaSessionCompat.M, tokenB.f());
                        resultReceiver.send(0, bundle2);
                    } else if (str.equals(MediaControllerCompat.f9481f)) {
                        b.this.b((MediaDescriptionCompat) bundle.getParcelable(MediaControllerCompat.f9485j));
                    } else if (str.equals(MediaControllerCompat.f9482g)) {
                        b.this.c((MediaDescriptionCompat) bundle.getParcelable(MediaControllerCompat.f9485j), bundle.getInt(MediaControllerCompat.f9486k));
                    } else if (str.equals(MediaControllerCompat.f9483h)) {
                        b.this.y((MediaDescriptionCompat) bundle.getParcelable(MediaControllerCompat.f9485j));
                    } else if (!str.equals(MediaControllerCompat.f9484i)) {
                        b.this.d(str, bundle, resultReceiver);
                    } else if (fVarB.f9582h != null) {
                        int i10 = bundle.getInt(MediaControllerCompat.f9486k, -1);
                        if (i10 >= 0 && i10 < fVarB.f9582h.size()) {
                            queueItem = fVarB.f9582h.get(i10);
                        }
                        if (queueItem != null) {
                            b.this.y(queueItem.c());
                        }
                    }
                } catch (BadParcelableException unused) {
                }
                a(fVarB);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onCustomAction(String action, Bundle extras) {
                f fVarB = b();
                if (fVarB == null) {
                    return;
                }
                MediaSessionCompat.b(extras);
                d(fVarB);
                try {
                    if (action.equals(MediaSessionCompat.f9543r)) {
                        Uri uri = (Uri) extras.getParcelable(MediaSessionCompat.D);
                        Bundle bundle = extras.getBundle(MediaSessionCompat.G);
                        MediaSessionCompat.b(bundle);
                        b.this.o(uri, bundle);
                    } else if (action.equals(MediaSessionCompat.f9544s)) {
                        b.this.q();
                    } else if (action.equals(MediaSessionCompat.f9545t)) {
                        String string = extras.getString(MediaSessionCompat.B);
                        Bundle bundle2 = extras.getBundle(MediaSessionCompat.G);
                        MediaSessionCompat.b(bundle2);
                        b.this.r(string, bundle2);
                    } else if (action.equals(MediaSessionCompat.f9546u)) {
                        String string2 = extras.getString(MediaSessionCompat.C);
                        Bundle bundle3 = extras.getBundle(MediaSessionCompat.G);
                        MediaSessionCompat.b(bundle3);
                        b.this.t(string2, bundle3);
                    } else if (action.equals(MediaSessionCompat.f9547v)) {
                        Uri uri2 = (Uri) extras.getParcelable(MediaSessionCompat.D);
                        Bundle bundle4 = extras.getBundle(MediaSessionCompat.G);
                        MediaSessionCompat.b(bundle4);
                        b.this.x(uri2, bundle4);
                    } else if (action.equals(MediaSessionCompat.f9548w)) {
                        b.this.N(extras.getBoolean(MediaSessionCompat.H));
                    } else if (action.equals(MediaSessionCompat.f9549x)) {
                        b.this.Y(extras.getInt(MediaSessionCompat.I));
                    } else if (action.equals(MediaSessionCompat.f9550y)) {
                        b.this.d0(extras.getInt(MediaSessionCompat.J));
                    } else if (action.equals(MediaSessionCompat.f9551z)) {
                        RatingCompat ratingCompat = (RatingCompat) extras.getParcelable(MediaSessionCompat.E);
                        Bundle bundle5 = extras.getBundle(MediaSessionCompat.G);
                        MediaSessionCompat.b(bundle5);
                        b.this.X(ratingCompat, bundle5);
                    } else if (action.equals(MediaSessionCompat.A)) {
                        b.this.R(extras.getFloat(MediaSessionCompat.F, 1.0f));
                    } else {
                        b.this.e(action, extras);
                    }
                } catch (BadParcelableException unused) {
                }
                a(fVarB);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onFastForward() {
                f fVarB = b();
                if (fVarB == null) {
                    return;
                }
                d(fVarB);
                b.this.f();
                a(fVarB);
            }

            @Override // android.media.session.MediaSession.Callback
            public boolean onMediaButtonEvent(Intent mediaButtonIntent) {
                f fVarB = b();
                if (fVarB == null) {
                    return false;
                }
                d(fVarB);
                boolean zG = b.this.g(mediaButtonIntent);
                a(fVarB);
                return zG || super.onMediaButtonEvent(mediaButtonIntent);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPause() {
                f fVarB = b();
                if (fVarB == null) {
                    return;
                }
                d(fVarB);
                b.this.h();
                a(fVarB);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlay() {
                f fVarB = b();
                if (fVarB == null) {
                    return;
                }
                d(fVarB);
                b.this.j();
                a(fVarB);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlayFromMediaId(String mediaId, Bundle extras) {
                f fVarB = b();
                if (fVarB == null) {
                    return;
                }
                MediaSessionCompat.b(extras);
                d(fVarB);
                b.this.l(mediaId, extras);
                a(fVarB);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlayFromSearch(String search, Bundle extras) {
                f fVarB = b();
                if (fVarB == null) {
                    return;
                }
                MediaSessionCompat.b(extras);
                d(fVarB);
                b.this.m(search, extras);
                a(fVarB);
            }

            @Override // android.media.session.MediaSession.Callback
            @w0(23)
            public void onPlayFromUri(Uri uri, Bundle extras) {
                f fVarB = b();
                if (fVarB == null) {
                    return;
                }
                MediaSessionCompat.b(extras);
                d(fVarB);
                b.this.o(uri, extras);
                a(fVarB);
            }

            @Override // android.media.session.MediaSession.Callback
            @w0(24)
            public void onPrepare() {
                f fVarB = b();
                if (fVarB == null) {
                    return;
                }
                d(fVarB);
                b.this.q();
                a(fVarB);
            }

            @Override // android.media.session.MediaSession.Callback
            @w0(24)
            public void onPrepareFromMediaId(String mediaId, Bundle extras) {
                f fVarB = b();
                if (fVarB == null) {
                    return;
                }
                MediaSessionCompat.b(extras);
                d(fVarB);
                b.this.r(mediaId, extras);
                a(fVarB);
            }

            @Override // android.media.session.MediaSession.Callback
            @w0(24)
            public void onPrepareFromSearch(String query, Bundle extras) {
                f fVarB = b();
                if (fVarB == null) {
                    return;
                }
                MediaSessionCompat.b(extras);
                d(fVarB);
                b.this.t(query, extras);
                a(fVarB);
            }

            @Override // android.media.session.MediaSession.Callback
            @w0(24)
            public void onPrepareFromUri(Uri uri, Bundle extras) {
                f fVarB = b();
                if (fVarB == null) {
                    return;
                }
                MediaSessionCompat.b(extras);
                d(fVarB);
                b.this.x(uri, extras);
                a(fVarB);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onRewind() {
                f fVarB = b();
                if (fVarB == null) {
                    return;
                }
                d(fVarB);
                b.this.H();
                a(fVarB);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSeekTo(long pos) {
                f fVarB = b();
                if (fVarB == null) {
                    return;
                }
                d(fVarB);
                b.this.I(pos);
                a(fVarB);
            }

            @Override // android.media.session.MediaSession.Callback
            @w0(29)
            public void onSetPlaybackSpeed(float speed) {
                f fVarB = b();
                if (fVarB == null) {
                    return;
                }
                d(fVarB);
                b.this.R(speed);
                a(fVarB);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSetRating(Rating ratingFwk) {
                f fVarB = b();
                if (fVarB == null) {
                    return;
                }
                d(fVarB);
                b.this.T(RatingCompat.a(ratingFwk));
                a(fVarB);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSkipToNext() {
                f fVarB = b();
                if (fVarB == null) {
                    return;
                }
                d(fVarB);
                b.this.f0();
                a(fVarB);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSkipToPrevious() {
                f fVarB = b();
                if (fVarB == null) {
                    return;
                }
                d(fVarB);
                b.this.g0();
                a(fVarB);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSkipToQueueItem(long id2) {
                f fVarB = b();
                if (fVarB == null) {
                    return;
                }
                d(fVarB);
                b.this.j0(id2);
                a(fVarB);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onStop() {
                f fVarB = b();
                if (fVarB == null) {
                    return;
                }
                d(fVarB);
                b.this.k0();
                a(fVarB);
            }
        }

        @Deprecated
        public void E(int index) {
        }

        public void H() {
        }

        public void I(long pos) {
        }

        public void N(boolean enabled) {
        }

        public void R(float speed) {
        }

        public void T(RatingCompat rating) {
        }

        public void X(RatingCompat rating, Bundle extras) {
        }

        public void Y(int repeatMode) {
        }

        void a(c impl, Handler callbackHandler) {
            if (this.f9567c) {
                this.f9567c = false;
                callbackHandler.removeMessages(1);
                PlaybackStateCompat playbackStateCompatH = impl.H();
                long jB = playbackStateCompatH == null ? 0L : playbackStateCompatH.b();
                boolean z10 = playbackStateCompatH != null && playbackStateCompatH.o() == 3;
                boolean z11 = (516 & jB) != 0;
                boolean z12 = (jB & 514) != 0;
                if (z10 && z12) {
                    h();
                } else if (!z10 && z11) {
                    j();
                }
            }
        }

        public void b(MediaDescriptionCompat description) {
        }

        public void c(MediaDescriptionCompat description, int index) {
        }

        public void d(String command, Bundle extras, ResultReceiver cb2) {
        }

        public void d0(int shuffleMode) {
        }

        public void e(String action, Bundle extras) {
        }

        public void f() {
        }

        public void f0() {
        }

        public boolean g(Intent mediaButtonEvent) {
            return false;
        }

        public void g0() {
        }

        public void h() {
        }

        public void j() {
        }

        public void j0(long id2) {
        }

        public void k0() {
        }

        public void l(String mediaId, Bundle extras) {
        }

        public void m(String query, Bundle extras) {
        }

        public void o(Uri uri, Bundle extras) {
        }

        void o0(c impl, Handler handler) {
            synchronized (this.f9565a) {
                try {
                    this.f9568d = new WeakReference<>(impl);
                    a aVar = this.f9569e;
                    a aVar2 = null;
                    if (aVar != null) {
                        aVar.removeCallbacksAndMessages(null);
                    }
                    if (impl != null && handler != null) {
                        aVar2 = new a(handler.getLooper());
                    }
                    this.f9569e = aVar2;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void q() {
        }

        public void r(String mediaId, Bundle extras) {
        }

        public void t(String query, Bundle extras) {
        }

        public void x(Uri uri, Bundle extras) {
        }

        public void y(MediaDescriptionCompat description) {
        }
    }

    interface c {
        String A();

        void B(int stream);

        void C(PendingIntent mbr);

        void D(int repeatMode);

        Object E();

        void F(boolean active);

        void G(androidx.media.f.b remoteUserInfo);

        PlaybackStateCompat H();

        void I(androidx.media.k volumeProvider);

        void J(CharSequence title);

        void K(int shuffleMode);

        void L(MediaMetadataCompat metadata);

        void M(List<QueueItem> queue);

        void N(PendingIntent pi2);

        Object O();

        androidx.media.f.b P();

        Token b();

        boolean isActive();

        void r0(boolean enabled);

        void release();

        void setExtras(Bundle extras);

        b u();

        void v(int flags);

        void w(String event, Bundle extras);

        void x(b callback, Handler handler);

        void y(int type);

        void z(PlaybackStateCompat state);
    }

    @w0(18)
    static class d extends j {
        private static boolean H = true;

        class a implements RemoteControlClient.OnPlaybackPositionUpdateListener {
            a() {
            }

            @Override // android.media.RemoteControlClient.OnPlaybackPositionUpdateListener
            public void onPlaybackPositionUpdate(long newPositionMs) {
                int i10 = 1 ^ (-1);
                d.this.g(18, -1, -1, Long.valueOf(newPositionMs), null);
            }
        }

        d(Context context, String tag, ComponentName mbrComponent, PendingIntent mbrIntent, androidx.versionedparcelable.h session2Token, Bundle sessionInfo) {
            super(context, tag, mbrComponent, mbrIntent, session2Token, sessionInfo);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.j
        void R(PendingIntent mbrIntent, ComponentName mbrComponent) {
            if (H) {
                this.f9598i.unregisterMediaButtonEventReceiver(mbrIntent);
            } else {
                super.R(mbrIntent, mbrComponent);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.j
        int f(long actions) {
            int iF = super.f(actions);
            return (actions & 256) != 0 ? iF | 256 : iF;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.j
        void h(PendingIntent mbrIntent, ComponentName mbrComponent) {
            if (H) {
                try {
                    this.f9598i.registerMediaButtonEventReceiver(mbrIntent);
                } catch (NullPointerException unused) {
                    H = false;
                }
            }
            if (!H) {
                super.h(mbrIntent, mbrComponent);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.j
        void t(PlaybackStateCompat state) {
            long jN = state.n();
            float fL = state.l();
            long jK = state.k();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (state.o() == 3) {
                long j10 = 0;
                if (jN > 0) {
                    if (jK > 0) {
                        j10 = jElapsedRealtime - jK;
                        if (fL > 0.0f && fL != 1.0f) {
                            j10 = (long) (j10 * fL);
                        }
                    }
                    jN += j10;
                }
            }
            this.f9599j.setPlaybackState(e(state.o()), jN, fL);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.j, android.support.v4.media.session.MediaSessionCompat.c
        public void x(b callback, Handler handler) {
            super.x(callback, handler);
            if (callback == null) {
                this.f9599j.setPlaybackPositionUpdateListener(null);
            } else {
                this.f9599j.setPlaybackPositionUpdateListener(new a());
            }
        }
    }

    @w0(19)
    static class e extends d {

        class a implements RemoteControlClient.OnMetadataUpdateListener {
            a() {
            }

            @Override // android.media.RemoteControlClient.OnMetadataUpdateListener
            public void onMetadataUpdate(int key, Object newValue) {
                if (key == 268435457 && (newValue instanceof Rating)) {
                    e.this.g(19, -1, -1, RatingCompat.a(newValue), null);
                }
            }
        }

        e(Context context, String tag, ComponentName mbrComponent, PendingIntent mbrIntent, androidx.versionedparcelable.h session2Token, Bundle sessionInfo) {
            super(context, tag, mbrComponent, mbrIntent, session2Token, sessionInfo);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.j
        RemoteControlClient.MetadataEditor c(Bundle metadata) {
            RemoteControlClient.MetadataEditor metadataEditorC = super.c(metadata);
            PlaybackStateCompat playbackStateCompat = this.f9609t;
            if (((playbackStateCompat == null ? 0L : playbackStateCompat.b()) & 128) != 0) {
                metadataEditorC.addEditableKey(268435457);
            }
            if (metadata != null) {
                if (metadata.containsKey("android.media.metadata.YEAR")) {
                    metadataEditorC.putLong(8, metadata.getLong("android.media.metadata.YEAR"));
                }
                if (metadata.containsKey("android.media.metadata.RATING")) {
                    metadataEditorC.putObject(101, (Object) metadata.getParcelable("android.media.metadata.RATING"));
                }
                if (metadata.containsKey("android.media.metadata.USER_RATING")) {
                    metadataEditorC.putObject(268435457, (Object) metadata.getParcelable("android.media.metadata.USER_RATING"));
                }
            }
            return metadataEditorC;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d, android.support.v4.media.session.MediaSessionCompat.j
        int f(long actions) {
            int iF = super.f(actions);
            return (actions & 128) != 0 ? iF | 512 : iF;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d, android.support.v4.media.session.MediaSessionCompat.j, android.support.v4.media.session.MediaSessionCompat.c
        public void x(b callback, Handler handler) {
            super.x(callback, handler);
            if (callback == null) {
                this.f9599j.setMetadataUpdateListener(null);
            } else {
                this.f9599j.setMetadataUpdateListener(new a());
            }
        }
    }

    @w0(22)
    static class g extends f {
        g(Context context, String tag, androidx.versionedparcelable.h session2Token, Bundle sessionInfo) {
            super(context, tag, session2Token, sessionInfo);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.f, android.support.v4.media.session.MediaSessionCompat.c
        public void y(int type) {
            this.f9575a.setRatingType(type);
        }

        g(Object mediaSession) {
            super(mediaSession);
        }
    }

    @w0(28)
    static class h extends g {
        h(Context context, String tag, androidx.versionedparcelable.h session2Token, Bundle sessionInfo) {
            super(context, tag, session2Token, sessionInfo);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.f, android.support.v4.media.session.MediaSessionCompat.c
        public void G(androidx.media.f.b remoteUserInfo) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.f, android.support.v4.media.session.MediaSessionCompat.c
        @NonNull
        public final androidx.media.f.b P() {
            return new androidx.media.f.b(this.f9575a.getCurrentControllerInfo());
        }

        h(Object mediaSession) {
            super(mediaSession);
        }
    }

    @w0(29)
    static class i extends h {
        i(Context context, String tag, androidx.versionedparcelable.h session2Token, Bundle sessionInfo) {
            super(context, tag, session2Token, sessionInfo);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.f
        public MediaSession a(Context context, String tag, Bundle sessionInfo) {
            return new MediaSession(context, tag, sessionInfo);
        }

        i(Object mediaSession) {
            super(mediaSession);
            this.f9578d = ((MediaSession) mediaSession).getController().getSessionInfo();
        }
    }

    static class j implements c {
        static final int G = 0;
        int A;
        Bundle B;
        int C;
        int D;
        androidx.media.k E;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f9590a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ComponentName f9591b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final PendingIntent f9592c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final c f9593d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Token f9594e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final String f9595f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final Bundle f9596g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final String f9597h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final AudioManager f9598i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final RemoteControlClient f9599j;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private d f9602m;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        volatile b f9605p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private androidx.media.f.b f9606q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        MediaMetadataCompat f9608s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        PlaybackStateCompat f9609t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        PendingIntent f9610u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        List<QueueItem> f9611v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        CharSequence f9612w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f9613x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        boolean f9614y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int f9615z;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final Object f9600k = new Object();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final RemoteCallbackList<android.support.v4.media.session.a> f9601l = new RemoteCallbackList<>();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f9603n = false;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f9604o = false;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f9607r = 3;
        private androidx.media.k.d F = new a();

        class a extends androidx.media.k.d {
            a() {
            }

            @Override // androidx.media.k.d
            public void a(androidx.media.k volumeProvider) {
                if (j.this.E != volumeProvider) {
                    return;
                }
                j jVar = j.this;
                j.this.s(new ParcelableVolumeInfo(jVar.C, jVar.D, volumeProvider.c(), volumeProvider.b(), volumeProvider.a()));
            }
        }

        private static final class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f9617a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Bundle f9618b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final ResultReceiver f9619c;

            public b(String command, Bundle extras, ResultReceiver stub) {
                this.f9617a = command;
                this.f9618b = extras;
                this.f9619c = stub;
            }
        }

        class c extends android.support.v4.media.session.b.AbstractBinderC0018b {
            c() {
            }

            @Override // android.support.v4.media.session.b
            public void A() throws RemoteException {
                p(3);
            }

            @Override // android.support.v4.media.session.b
            public void A6(android.support.v4.media.session.a cb2) {
                j.this.f9601l.unregister(cb2);
            }

            @Override // android.support.v4.media.session.b
            public boolean Aa(KeyEvent mediaButton) {
                u(21, mediaButton);
                return true;
            }

            @Override // android.support.v4.media.session.b
            public void B() throws RemoteException {
                p(7);
            }

            @Override // android.support.v4.media.session.b
            public int C() {
                return j.this.f9615z;
            }

            @Override // android.support.v4.media.session.b
            public void D(int repeatMode) throws RemoteException {
                s(23, repeatMode);
            }

            @Override // android.support.v4.media.session.b
            public void D1() throws RemoteException {
                p(16);
            }

            @Override // android.support.v4.media.session.b
            public String E() {
                return j.this.f9597h;
            }

            @Override // android.support.v4.media.session.b
            public void E1(String action, Bundle args) throws RemoteException {
                w(20, action, args);
            }

            @Override // android.support.v4.media.session.b
            public void Ec(String query, Bundle extras) throws RemoteException {
                w(5, query, extras);
            }

            @Override // android.support.v4.media.session.b
            public void F(long pos) throws RemoteException {
                u(18, Long.valueOf(pos));
            }

            @Override // android.support.v4.media.session.b
            public void G(float speed) throws RemoteException {
                u(32, Float.valueOf(speed));
            }

            @Override // android.support.v4.media.session.b
            public PlaybackStateCompat H() {
                PlaybackStateCompat playbackStateCompat;
                MediaMetadataCompat mediaMetadataCompat;
                synchronized (j.this.f9600k) {
                    try {
                        j jVar = j.this;
                        playbackStateCompat = jVar.f9609t;
                        mediaMetadataCompat = jVar.f9608s;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return MediaSessionCompat.j(playbackStateCompat, mediaMetadataCompat);
            }

            @Override // android.support.v4.media.session.b
            public void Hd(int direction, int flags, String packageName) {
                j.this.a(direction, flags);
            }

            @Override // android.support.v4.media.session.b
            public long I() {
                long j10;
                synchronized (j.this.f9600k) {
                    try {
                        j10 = j.this.f9607r;
                    } finally {
                    }
                }
                return j10;
            }

            @Override // android.support.v4.media.session.b
            public int J() {
                return j.this.A;
            }

            @Override // android.support.v4.media.session.b
            public void Jb(long id2) {
                u(11, Long.valueOf(id2));
            }

            @Override // android.support.v4.media.session.b
            public void K(int shuffleMode) throws RemoteException {
                s(30, shuffleMode);
            }

            @Override // android.support.v4.media.session.b
            public void M3(RatingCompat rating, Bundle extras) throws RemoteException {
                w(31, rating, extras);
            }

            @Override // android.support.v4.media.session.b
            public int O0() {
                return j.this.f9613x;
            }

            @Override // android.support.v4.media.session.b
            public boolean O1() {
                return false;
            }

            @Override // android.support.v4.media.session.b
            public void P() throws RemoteException {
                p(17);
            }

            @Override // android.support.v4.media.session.b
            public void R4(boolean enabled) throws RemoteException {
            }

            @Override // android.support.v4.media.session.b
            public void Ra(MediaDescriptionCompat description, int index) {
                v(26, description, index);
            }

            @Override // android.support.v4.media.session.b
            public boolean S5() {
                return true;
            }

            @Override // android.support.v4.media.session.b
            public Bundle T0() {
                if (j.this.f9596g == null) {
                    return null;
                }
                return new Bundle(j.this.f9596g);
            }

            @Override // android.support.v4.media.session.b
            public void T2(String mediaId, Bundle extras) throws RemoteException {
                w(4, mediaId, extras);
            }

            @Override // android.support.v4.media.session.b
            public void X9(String query, Bundle extras) throws RemoteException {
                w(9, query, extras);
            }

            @Override // android.support.v4.media.session.b
            public void a3(String mediaId, Bundle extras) throws RemoteException {
                w(8, mediaId, extras);
            }

            @Override // android.support.v4.media.session.b
            public void c2(Uri uri, Bundle extras) throws RemoteException {
                w(6, uri, extras);
            }

            @Override // android.support.v4.media.session.b
            public boolean d0() {
                return j.this.f9614y;
            }

            @Override // android.support.v4.media.session.b
            public List<QueueItem> e() {
                List<QueueItem> list;
                synchronized (j.this.f9600k) {
                    try {
                        list = j.this.f9611v;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return list;
            }

            @Override // android.support.v4.media.session.b
            public void ea(Uri uri, Bundle extras) throws RemoteException {
                w(10, uri, extras);
            }

            @Override // android.support.v4.media.session.b
            public Bundle getExtras() {
                Bundle bundle;
                synchronized (j.this.f9600k) {
                    try {
                        bundle = j.this.B;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return bundle;
            }

            @Override // android.support.v4.media.session.b
            public String getPackageName() {
                return j.this.f9595f;
            }

            @Override // android.support.v4.media.session.b
            public void h1(MediaDescriptionCompat description) {
                u(27, description);
            }

            @Override // android.support.v4.media.session.b
            public void h4(int index) {
                s(28, index);
            }

            @Override // android.support.v4.media.session.b
            public void j1(MediaDescriptionCompat description) {
                u(25, description);
            }

            @Override // android.support.v4.media.session.b
            public CharSequence k0() {
                return j.this.f9612w;
            }

            @Override // android.support.v4.media.session.b
            public ParcelableVolumeInfo m8() {
                int i10;
                int i11;
                int iC;
                int streamVolume;
                int iB;
                synchronized (j.this.f9600k) {
                    try {
                        j jVar = j.this;
                        i10 = jVar.C;
                        i11 = jVar.D;
                        androidx.media.k kVar = jVar.E;
                        iC = 2;
                        if (i10 == 2) {
                            iC = kVar.c();
                            iB = kVar.b();
                            streamVolume = kVar.a();
                        } else {
                            int streamMaxVolume = jVar.f9598i.getStreamMaxVolume(i11);
                            streamVolume = j.this.f9598i.getStreamVolume(i11);
                            iB = streamMaxVolume;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return new ParcelableVolumeInfo(i10, i11, iC, iB, streamVolume);
            }

            @Override // android.support.v4.media.session.b
            public void mc(RatingCompat rating) throws RemoteException {
                u(19, rating);
            }

            @Override // android.support.v4.media.session.b
            public PendingIntent n2() {
                PendingIntent pendingIntent;
                synchronized (j.this.f9600k) {
                    pendingIntent = j.this.f9610u;
                }
                return pendingIntent;
            }

            @Override // android.support.v4.media.session.b
            public void nc(int value, int flags, String packageName) {
                j.this.Q(value, flags);
            }

            @Override // android.support.v4.media.session.b
            public void next() throws RemoteException {
                p(14);
            }

            void p(int what) {
                j.this.g(what, 0, 0, null, null);
            }

            @Override // android.support.v4.media.session.b
            public void pause() throws RemoteException {
                p(12);
            }

            @Override // android.support.v4.media.session.b
            public void previous() throws RemoteException {
                p(15);
            }

            @Override // android.support.v4.media.session.b
            public void r0(boolean enabled) throws RemoteException {
                u(29, Boolean.valueOf(enabled));
            }

            @Override // android.support.v4.media.session.b
            public void r4(String command, Bundle args, ResultReceiverWrapper cb2) {
                u(1, new b(command, args, cb2 == null ? null : cb2.f9559a));
            }

            void s(int what, int arg1) {
                j.this.g(what, arg1, 0, null, null);
            }

            @Override // android.support.v4.media.session.b
            public void stop() throws RemoteException {
                p(13);
            }

            void u(int what, Object obj) {
                j.this.g(what, 0, 0, obj, null);
            }

            void v(int what, Object obj, int arg1) {
                j.this.g(what, arg1, 0, obj, null);
            }

            void w(int what, Object obj, Bundle extras) {
                j.this.g(what, 0, 0, obj, extras);
            }

            @Override // android.support.v4.media.session.b
            public void x5(android.support.v4.media.session.a cb2) {
                if (j.this.f9603n) {
                    try {
                        cb2.N3();
                    } catch (Exception unused) {
                    }
                    return;
                }
                j.this.f9601l.register(cb2, new androidx.media.f.b(j.this.d(Binder.getCallingUid()), Binder.getCallingPid(), Binder.getCallingUid()));
            }

            @Override // android.support.v4.media.session.b
            public MediaMetadataCompat z() {
                return j.this.f9608s;
            }
        }

        class d extends Handler {
            private static final int A = 25;
            private static final int B = 26;
            private static final int C = 27;
            private static final int D = 28;
            private static final int E = 29;
            private static final int F = 30;
            private static final int G = 127;
            private static final int H = 126;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final int f9620b = 1;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final int f9621c = 2;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static final int f9622d = 3;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static final int f9623e = 4;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private static final int f9624f = 5;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private static final int f9625g = 6;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private static final int f9626h = 7;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private static final int f9627i = 8;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private static final int f9628j = 9;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private static final int f9629k = 10;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private static final int f9630l = 11;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private static final int f9631m = 12;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private static final int f9632n = 13;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private static final int f9633o = 14;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            private static final int f9634p = 15;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            private static final int f9635q = 16;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private static final int f9636r = 17;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            private static final int f9637s = 18;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private static final int f9638t = 19;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            private static final int f9639u = 31;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            private static final int f9640v = 32;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            private static final int f9641w = 20;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            private static final int f9642x = 21;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            private static final int f9643y = 22;

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            private static final int f9644z = 23;

            public d(Looper looper) {
                super(looper);
            }

            private void a(KeyEvent ke2, b cb2) {
                if (ke2 != null && ke2.getAction() == 0) {
                    PlaybackStateCompat playbackStateCompat = j.this.f9609t;
                    long jB = playbackStateCompat == null ? 0L : playbackStateCompat.b();
                    int keyCode = ke2.getKeyCode();
                    if (keyCode != 126) {
                        if (keyCode != 127) {
                            switch (keyCode) {
                                case com.planner5d.library.engine.input.f.b.f160702k0 /* 86 */:
                                    if ((1 & jB) != 0) {
                                        cb2.k0();
                                        return;
                                    }
                                    break;
                                case com.planner5d.library.engine.input.f.b.f160690g0 /* 87 */:
                                    if ((32 & jB) != 0) {
                                        cb2.f0();
                                        return;
                                    }
                                    break;
                                case com.planner5d.library.engine.input.f.b.f160696i0 /* 88 */:
                                    if ((16 & jB) != 0) {
                                        cb2.g0();
                                        return;
                                    }
                                    break;
                                case 89:
                                    if ((8 & jB) != 0) {
                                        cb2.H();
                                        return;
                                    }
                                    break;
                                case 90:
                                    if ((64 & jB) != 0) {
                                        cb2.f();
                                        return;
                                    }
                                    break;
                            }
                        } else if ((2 & jB) != 0) {
                            cb2.h();
                        }
                    } else if ((4 & jB) != 0) {
                        cb2.j();
                    }
                }
            }

            @Override // android.os.Handler
            public void handleMessage(Message msg) {
                b bVar = j.this.f9605p;
                if (bVar == null) {
                    return;
                }
                Bundle data = msg.getData();
                MediaSessionCompat.b(data);
                j.this.G(new androidx.media.f.b(data.getString(MediaSessionCompat.O), data.getInt("data_calling_pid"), data.getInt("data_calling_uid")));
                Bundle bundle = data.getBundle(MediaSessionCompat.R);
                MediaSessionCompat.b(bundle);
                try {
                    switch (msg.what) {
                        case 1:
                            b bVar2 = (b) msg.obj;
                            bVar.d(bVar2.f9617a, bVar2.f9618b, bVar2.f9619c);
                            break;
                        case 2:
                            j.this.a(msg.arg1, 0);
                            break;
                        case 3:
                            bVar.q();
                            break;
                        case 4:
                            bVar.r((String) msg.obj, bundle);
                            break;
                        case 5:
                            bVar.t((String) msg.obj, bundle);
                            break;
                        case 6:
                            bVar.x((Uri) msg.obj, bundle);
                            break;
                        case 7:
                            bVar.j();
                            break;
                        case 8:
                            bVar.l((String) msg.obj, bundle);
                            break;
                        case 9:
                            bVar.m((String) msg.obj, bundle);
                            break;
                        case 10:
                            bVar.o((Uri) msg.obj, bundle);
                            break;
                        case 11:
                            bVar.j0(((Long) msg.obj).longValue());
                            break;
                        case 12:
                            bVar.h();
                            break;
                        case 13:
                            bVar.k0();
                            break;
                        case 14:
                            bVar.f0();
                            break;
                        case 15:
                            bVar.g0();
                            break;
                        case 16:
                            bVar.f();
                            break;
                        case 17:
                            bVar.H();
                            break;
                        case 18:
                            bVar.I(((Long) msg.obj).longValue());
                            break;
                        case 19:
                            bVar.T((RatingCompat) msg.obj);
                            break;
                        case 20:
                            bVar.e((String) msg.obj, bundle);
                            break;
                        case 21:
                            KeyEvent keyEvent = (KeyEvent) msg.obj;
                            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                            intent.putExtra("android.intent.extra.KEY_EVENT", keyEvent);
                            if (!bVar.g(intent)) {
                                a(keyEvent, bVar);
                            }
                            break;
                        case 22:
                            j.this.Q(msg.arg1, 0);
                            break;
                        case 23:
                            bVar.Y(msg.arg1);
                            break;
                        case 25:
                            bVar.b((MediaDescriptionCompat) msg.obj);
                            break;
                        case 26:
                            bVar.c((MediaDescriptionCompat) msg.obj, msg.arg1);
                            break;
                        case 27:
                            bVar.y((MediaDescriptionCompat) msg.obj);
                            break;
                        case 28:
                            List<QueueItem> list = j.this.f9611v;
                            if (list != null) {
                                int i10 = msg.arg1;
                                QueueItem queueItem = (i10 < 0 || i10 >= list.size()) ? null : j.this.f9611v.get(msg.arg1);
                                if (queueItem != null) {
                                    bVar.y(queueItem.c());
                                }
                            }
                            break;
                        case 29:
                            bVar.N(((Boolean) msg.obj).booleanValue());
                            break;
                        case 30:
                            bVar.d0(msg.arg1);
                            break;
                        case 31:
                            bVar.X((RatingCompat) msg.obj, bundle);
                            break;
                        case 32:
                            bVar.R(((Float) msg.obj).floatValue());
                            break;
                    }
                } finally {
                    j.this.G(null);
                }
            }
        }

        public j(Context context, String tag, ComponentName mbrComponent, PendingIntent mbrIntent, androidx.versionedparcelable.h session2Token, Bundle sessionInfo) {
            if (mbrComponent == null) {
                throw new IllegalArgumentException("MediaButtonReceiver component may not be null");
            }
            this.f9590a = context;
            this.f9595f = context.getPackageName();
            this.f9596g = sessionInfo;
            this.f9598i = (AudioManager) context.getSystemService("audio");
            this.f9597h = tag;
            this.f9591b = mbrComponent;
            this.f9592c = mbrIntent;
            c cVar = new c();
            this.f9593d = cVar;
            this.f9594e = new Token(cVar, null, session2Token);
            this.f9613x = 0;
            this.C = 1;
            this.D = 3;
            this.f9599j = new RemoteControlClient(mbrIntent);
        }

        private void i(boolean enabled) {
            for (int iBeginBroadcast = this.f9601l.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                try {
                    ((android.support.v4.media.session.a) this.f9601l.getBroadcastItem(iBeginBroadcast)).rd(enabled);
                } catch (RemoteException unused) {
                }
            }
            this.f9601l.finishBroadcast();
        }

        private void j(String event, Bundle extras) {
            for (int iBeginBroadcast = this.f9601l.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                try {
                    ((android.support.v4.media.session.a) this.f9601l.getBroadcastItem(iBeginBroadcast)).onEvent(event, extras);
                } catch (RemoteException unused) {
                }
            }
            this.f9601l.finishBroadcast();
        }

        private void k(Bundle extras) {
            for (int iBeginBroadcast = this.f9601l.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                try {
                    ((android.support.v4.media.session.a) this.f9601l.getBroadcastItem(iBeginBroadcast)).Lc(extras);
                } catch (RemoteException unused) {
                }
            }
            this.f9601l.finishBroadcast();
        }

        /*  JADX ERROR: NullPointerException in pass: BlockProcessor
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.BlockNode.getPredecessors()" because "to" is null
            	at jadx.core.dex.visitors.blocks.BlockSplitter.connect(BlockSplitter.java:159)
            	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectSplittersAndHandlers(BlockExceptionHandler.java:501)
            	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.wrapBlocksWithTryCatch(BlockExceptionHandler.java:382)
            	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:91)
            	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:62)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:422)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
            */
        private void l(android.support.v4.media.MediaMetadataCompat r4) {
            /*
                r3 = this;
                r2 = 4
                android.os.RemoteCallbackList<android.support.v4.media.session.a> r0 = r3.f9601l
                int r0 = r0.beginBroadcast()
                r2 = 4
                int r0 = r0 + (-1)
            La:
                r2 = 5
                if (r0 < 0) goto L1e
                r2 = 1
                android.os.RemoteCallbackList<android.support.v4.media.session.a> r1 = r3.f9601l
                r2 = 0
                android.os.IInterface r1 = r1.getBroadcastItem(r0)
                r2 = 2
                android.support.v4.media.session.a r1 = (android.support.v4.media.session.a) r1
                r1.Sa(r4)     // Catch: android.os.RemoteException -> L1b
            L1b:
                int r0 = r0 + (-1)
                goto La
            L1e:
                android.os.RemoteCallbackList<android.support.v4.media.session.a> r3 = r3.f9601l
                r3.finishBroadcast()
                r2 = 2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat.j.l(android.support.v4.media.MediaMetadataCompat):void");
        }

        /*  JADX ERROR: NullPointerException in pass: BlockProcessor
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.BlockNode.getPredecessors()" because "to" is null
            	at jadx.core.dex.visitors.blocks.BlockSplitter.connect(BlockSplitter.java:159)
            	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectSplittersAndHandlers(BlockExceptionHandler.java:501)
            	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.wrapBlocksWithTryCatch(BlockExceptionHandler.java:382)
            	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:91)
            	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:62)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:422)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
            */
        private void m(java.util.List<android.support.v4.media.session.MediaSessionCompat.QueueItem> r4) {
            /*
                r3 = this;
                android.os.RemoteCallbackList<android.support.v4.media.session.a> r0 = r3.f9601l
                r2 = 6
                int r0 = r0.beginBroadcast()
                int r0 = r0 + (-1)
            L9:
                r2 = 5
                if (r0 < 0) goto L1b
                android.os.RemoteCallbackList<android.support.v4.media.session.a> r1 = r3.f9601l
                android.os.IInterface r1 = r1.getBroadcastItem(r0)
                r2 = 4
                android.support.v4.media.session.a r1 = (android.support.v4.media.session.a) r1
                r1.G2(r4)     // Catch: android.os.RemoteException -> L18
            L18:
                int r0 = r0 + (-1)
                goto L9
            L1b:
                android.os.RemoteCallbackList<android.support.v4.media.session.a> r3 = r3.f9601l
                r3.finishBroadcast()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat.j.m(java.util.List):void");
        }

        private void n(CharSequence queueTitle) {
            for (int iBeginBroadcast = this.f9601l.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                try {
                    ((android.support.v4.media.session.a) this.f9601l.getBroadcastItem(iBeginBroadcast)).Ed(queueTitle);
                } catch (RemoteException unused) {
                }
            }
            this.f9601l.finishBroadcast();
        }

        private void o(int repeatMode) {
            for (int iBeginBroadcast = this.f9601l.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                try {
                    ((android.support.v4.media.session.a) this.f9601l.getBroadcastItem(iBeginBroadcast)).x(repeatMode);
                } catch (RemoteException unused) {
                }
            }
            this.f9601l.finishBroadcast();
        }

        /*  JADX ERROR: NullPointerException in pass: BlockProcessor
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.BlockNode.getPredecessors()" because "to" is null
            	at jadx.core.dex.visitors.blocks.BlockSplitter.connect(BlockSplitter.java:159)
            	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectSplittersAndHandlers(BlockExceptionHandler.java:501)
            	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.wrapBlocksWithTryCatch(BlockExceptionHandler.java:382)
            	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:91)
            	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:62)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:422)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
            */
        private void p() {
            /*
                r3 = this;
                android.os.RemoteCallbackList<android.support.v4.media.session.a> r0 = r3.f9601l
                int r0 = r0.beginBroadcast()
                r2 = 6
                int r0 = r0 + (-1)
            L9:
                r2 = 4
                if (r0 < 0) goto L1b
                android.os.RemoteCallbackList<android.support.v4.media.session.a> r1 = r3.f9601l
                r2 = 0
                android.os.IInterface r1 = r1.getBroadcastItem(r0)
                android.support.v4.media.session.a r1 = (android.support.v4.media.session.a) r1
                r1.N3()     // Catch: android.os.RemoteException -> L18
            L18:
                int r0 = r0 + (-1)
                goto L9
            L1b:
                android.os.RemoteCallbackList<android.support.v4.media.session.a> r0 = r3.f9601l
                r0.finishBroadcast()
                r2 = 7
                android.os.RemoteCallbackList<android.support.v4.media.session.a> r3 = r3.f9601l
                r3.kill()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat.j.p():void");
        }

        private void q(int shuffleMode) {
            for (int iBeginBroadcast = this.f9601l.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                try {
                    ((android.support.v4.media.session.a) this.f9601l.getBroadcastItem(iBeginBroadcast)).pb(shuffleMode);
                } catch (RemoteException unused) {
                }
            }
            this.f9601l.finishBroadcast();
        }

        private void r(PlaybackStateCompat state) {
            for (int iBeginBroadcast = this.f9601l.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                try {
                    ((android.support.v4.media.session.a) this.f9601l.getBroadcastItem(iBeginBroadcast)).of(state);
                } catch (RemoteException unused) {
                }
            }
            this.f9601l.finishBroadcast();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public String A() {
            return null;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void B(int stream) {
            androidx.media.k kVar = this.E;
            if (kVar != null) {
                kVar.h(null);
            }
            this.D = stream;
            this.C = 1;
            int i10 = this.C;
            int i11 = this.D;
            s(new ParcelableVolumeInfo(i10, i11, 2, this.f9598i.getStreamMaxVolume(i11), this.f9598i.getStreamVolume(this.D)));
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void C(PendingIntent mbr) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void D(int repeatMode) {
            if (this.f9615z != repeatMode) {
                this.f9615z = repeatMode;
                o(repeatMode);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public Object E() {
            return null;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void F(boolean active) {
            if (active == this.f9604o) {
                return;
            }
            this.f9604o = active;
            S();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void G(androidx.media.f.b remoteUserInfo) {
            synchronized (this.f9600k) {
                try {
                    this.f9606q = remoteUserInfo;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public PlaybackStateCompat H() {
            PlaybackStateCompat playbackStateCompat;
            synchronized (this.f9600k) {
                try {
                    playbackStateCompat = this.f9609t;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return playbackStateCompat;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void I(androidx.media.k volumeProvider) {
            if (volumeProvider == null) {
                throw new IllegalArgumentException("volumeProvider may not be null");
            }
            androidx.media.k kVar = this.E;
            if (kVar != null) {
                kVar.h(null);
            }
            this.C = 2;
            this.E = volumeProvider;
            s(new ParcelableVolumeInfo(this.C, this.D, this.E.c(), this.E.b(), this.E.a()));
            volumeProvider.h(this.F);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void J(CharSequence title) {
            this.f9612w = title;
            n(title);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void K(int shuffleMode) {
            if (this.A != shuffleMode) {
                this.A = shuffleMode;
                q(shuffleMode);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void L(MediaMetadataCompat metadata) {
            if (metadata != null) {
                metadata = new MediaMetadataCompat.b(metadata, MediaSessionCompat.S).a();
            }
            synchronized (this.f9600k) {
                try {
                    this.f9608s = metadata;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            l(metadata);
            if (this.f9604o) {
                c(metadata == null ? null : metadata.e()).apply();
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void M(List<QueueItem> queue) {
            this.f9611v = queue;
            m(queue);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void N(PendingIntent pi2) {
            synchronized (this.f9600k) {
                try {
                    this.f9610u = pi2;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public Object O() {
            return null;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public androidx.media.f.b P() {
            androidx.media.f.b bVar;
            synchronized (this.f9600k) {
                try {
                    bVar = this.f9606q;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return bVar;
        }

        void Q(int value, int flags) {
            if (this.C != 2) {
                this.f9598i.setStreamVolume(this.D, value, flags);
                return;
            }
            androidx.media.k kVar = this.E;
            if (kVar != null) {
                kVar.g(value);
            }
        }

        void R(PendingIntent mbrIntent, ComponentName mbrComponent) {
            this.f9598i.unregisterMediaButtonEventReceiver(mbrComponent);
        }

        void S() {
            if (this.f9604o) {
                h(this.f9592c, this.f9591b);
                this.f9598i.registerRemoteControlClient(this.f9599j);
                L(this.f9608s);
                z(this.f9609t);
                return;
            }
            R(this.f9592c, this.f9591b);
            int i10 = 5 << 0;
            this.f9599j.setPlaybackState(0);
            this.f9598i.unregisterRemoteControlClient(this.f9599j);
        }

        void a(int direction, int flags) {
            if (this.C != 2) {
                this.f9598i.adjustStreamVolume(this.D, direction, flags);
                return;
            }
            androidx.media.k kVar = this.E;
            if (kVar != null) {
                kVar.f(direction);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public Token b() {
            return this.f9594e;
        }

        RemoteControlClient.MetadataEditor c(Bundle metadata) {
            RemoteControlClient.MetadataEditor metadataEditorEditMetadata = this.f9599j.editMetadata(true);
            if (metadata != null) {
                if (metadata.containsKey("android.media.metadata.ART")) {
                    Bitmap bitmapCopy = (Bitmap) metadata.getParcelable("android.media.metadata.ART");
                    if (bitmapCopy != null) {
                        bitmapCopy = bitmapCopy.copy(bitmapCopy.getConfig(), false);
                    }
                    metadataEditorEditMetadata.putBitmap(100, bitmapCopy);
                } else if (metadata.containsKey("android.media.metadata.ALBUM_ART")) {
                    Bitmap bitmapCopy2 = (Bitmap) metadata.getParcelable("android.media.metadata.ALBUM_ART");
                    if (bitmapCopy2 != null) {
                        bitmapCopy2 = bitmapCopy2.copy(bitmapCopy2.getConfig(), false);
                    }
                    metadataEditorEditMetadata.putBitmap(100, bitmapCopy2);
                }
                if (metadata.containsKey("android.media.metadata.ALBUM")) {
                    metadataEditorEditMetadata.putString(1, metadata.getString("android.media.metadata.ALBUM"));
                }
                if (metadata.containsKey("android.media.metadata.ALBUM_ARTIST")) {
                    metadataEditorEditMetadata.putString(13, metadata.getString("android.media.metadata.ALBUM_ARTIST"));
                }
                if (metadata.containsKey("android.media.metadata.ARTIST")) {
                    metadataEditorEditMetadata.putString(2, metadata.getString("android.media.metadata.ARTIST"));
                }
                if (metadata.containsKey("android.media.metadata.AUTHOR")) {
                    metadataEditorEditMetadata.putString(3, metadata.getString("android.media.metadata.AUTHOR"));
                }
                if (metadata.containsKey("android.media.metadata.COMPILATION")) {
                    metadataEditorEditMetadata.putString(15, metadata.getString("android.media.metadata.COMPILATION"));
                }
                if (metadata.containsKey("android.media.metadata.COMPOSER")) {
                    metadataEditorEditMetadata.putString(4, metadata.getString("android.media.metadata.COMPOSER"));
                }
                if (metadata.containsKey("android.media.metadata.DATE")) {
                    metadataEditorEditMetadata.putString(5, metadata.getString("android.media.metadata.DATE"));
                }
                if (metadata.containsKey("android.media.metadata.DISC_NUMBER")) {
                    metadataEditorEditMetadata.putLong(14, metadata.getLong("android.media.metadata.DISC_NUMBER"));
                }
                if (metadata.containsKey("android.media.metadata.DURATION")) {
                    metadataEditorEditMetadata.putLong(9, metadata.getLong("android.media.metadata.DURATION"));
                }
                if (metadata.containsKey("android.media.metadata.GENRE")) {
                    metadataEditorEditMetadata.putString(6, metadata.getString("android.media.metadata.GENRE"));
                }
                if (metadata.containsKey("android.media.metadata.TITLE")) {
                    metadataEditorEditMetadata.putString(7, metadata.getString("android.media.metadata.TITLE"));
                }
                if (metadata.containsKey("android.media.metadata.TRACK_NUMBER")) {
                    metadataEditorEditMetadata.putLong(0, metadata.getLong("android.media.metadata.TRACK_NUMBER"));
                }
                if (metadata.containsKey("android.media.metadata.WRITER")) {
                    metadataEditorEditMetadata.putString(11, metadata.getString("android.media.metadata.WRITER"));
                }
            }
            return metadataEditorEditMetadata;
        }

        String d(int uid) {
            String nameForUid = this.f9590a.getPackageManager().getNameForUid(uid);
            return TextUtils.isEmpty(nameForUid) ? androidx.media.f.b.f52906b : nameForUid;
        }

        int e(int state) {
            switch (state) {
                case 0:
                    return 0;
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 3;
                case 4:
                    return 4;
                case 5:
                    return 5;
                case 6:
                case 8:
                    return 8;
                case 7:
                    return 9;
                case 9:
                    return 7;
                case 10:
                case 11:
                    return 6;
                default:
                    return -1;
            }
        }

        int f(long actions) {
            int i10 = (1 & actions) != 0 ? 32 : 0;
            if ((2 & actions) != 0) {
                i10 |= 16;
            }
            if ((4 & actions) != 0) {
                i10 |= 4;
            }
            if ((8 & actions) != 0) {
                i10 |= 2;
            }
            if ((16 & actions) != 0) {
                i10 |= 1;
            }
            if ((32 & actions) != 0) {
                i10 |= 128;
            }
            if ((64 & actions) != 0) {
                i10 |= 64;
            }
            return (actions & 512) != 0 ? i10 | 8 : i10;
        }

        void g(int what, int arg1, int arg2, Object obj, Bundle extras) {
            synchronized (this.f9600k) {
                try {
                    d dVar = this.f9602m;
                    if (dVar != null) {
                        Message messageObtainMessage = dVar.obtainMessage(what, arg1, arg2, obj);
                        Bundle bundle = new Bundle();
                        int callingUid = Binder.getCallingUid();
                        bundle.putInt("data_calling_uid", callingUid);
                        bundle.putString(MediaSessionCompat.O, d(callingUid));
                        int callingPid = Binder.getCallingPid();
                        if (callingPid > 0) {
                            bundle.putInt("data_calling_pid", callingPid);
                        } else {
                            bundle.putInt("data_calling_pid", -1);
                        }
                        if (extras != null) {
                            bundle.putBundle(MediaSessionCompat.R, extras);
                        }
                        messageObtainMessage.setData(bundle);
                        messageObtainMessage.sendToTarget();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        void h(PendingIntent mbrIntent, ComponentName mbrComponent) {
            this.f9598i.registerMediaButtonEventReceiver(mbrComponent);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public boolean isActive() {
            return this.f9604o;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void r0(boolean enabled) {
            if (this.f9614y != enabled) {
                this.f9614y = enabled;
                i(enabled);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void release() {
            this.f9604o = false;
            this.f9603n = true;
            S();
            p();
            x(null, null);
        }

        void s(ParcelableVolumeInfo info) {
            for (int iBeginBroadcast = this.f9601l.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                try {
                    ((android.support.v4.media.session.a) this.f9601l.getBroadcastItem(iBeginBroadcast)).Pb(info);
                } catch (RemoteException unused) {
                }
            }
            this.f9601l.finishBroadcast();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void setExtras(Bundle extras) {
            this.B = extras;
            k(extras);
        }

        void t(PlaybackStateCompat state) {
            this.f9599j.setPlaybackState(e(state.o()));
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public b u() {
            b bVar;
            synchronized (this.f9600k) {
                bVar = this.f9605p;
            }
            return bVar;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void v(int flags) {
            synchronized (this.f9600k) {
                try {
                    this.f9607r = flags | 3;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void w(String event, Bundle extras) {
            j(event, extras);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void x(b callback, Handler handler) {
            synchronized (this.f9600k) {
                try {
                    d dVar = this.f9602m;
                    if (dVar != null) {
                        dVar.removeCallbacksAndMessages(null);
                    }
                    this.f9602m = (callback == null || handler == null) ? null : new d(handler.getLooper());
                    if (this.f9605p != callback && this.f9605p != null) {
                        this.f9605p.o0(null, null);
                    }
                    this.f9605p = callback;
                    if (this.f9605p != null) {
                        this.f9605p.o0(this, handler);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void y(int type) {
            this.f9613x = type;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void z(PlaybackStateCompat state) {
            synchronized (this.f9600k) {
                try {
                    this.f9609t = state;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            r(state);
            if (this.f9604o) {
                if (state == null) {
                    this.f9599j.setPlaybackState(0);
                    this.f9599j.setTransportControlFlags(0);
                } else {
                    t(state);
                    this.f9599j.setTransportControlFlags(f(state.b()));
                }
            }
        }
    }

    public interface k {
        void a();
    }

    static {
        f9530e = androidx.core.os.b.i() ? com.google.api.client.googleapis.media.a.f115410j : 0;
    }

    public MediaSessionCompat(@NonNull Context context, @NonNull String tag) {
        this(context, tag, null, null);
    }

    @b1({b1.a.LIBRARY})
    @p0
    public static Bundle F(@p0 Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        b(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            return null;
        }
    }

    @b1({b1.a.LIBRARY})
    public static void b(@p0 Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    public static MediaSessionCompat c(Context context, Object mediaSession) {
        if (context == null || mediaSession == null) {
            return null;
        }
        return new MediaSessionCompat(context, new i(mediaSession));
    }

    static PlaybackStateCompat j(PlaybackStateCompat state, MediaMetadataCompat metadata) {
        long j10;
        if (state == null) {
            return state;
        }
        long jG = -1;
        if (state.n() == -1) {
            return state;
        }
        if (state.o() != 3 && state.o() != 4 && state.o() != 5) {
            return state;
        }
        long jK = state.k();
        if (jK <= 0) {
            return state;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jL = ((long) (state.l() * (jElapsedRealtime - jK))) + state.n();
        if (metadata != null && metadata.a("android.media.metadata.DURATION")) {
            jG = metadata.g("android.media.metadata.DURATION");
        }
        if (jG < 0 || jL <= jG) {
            j10 = jL < 0 ? 0L : jL;
        } else {
            j10 = jG;
        }
        return new PlaybackStateCompat.e(state).k(state.o(), j10, state.l(), jElapsedRealtime).c();
    }

    public void A(CharSequence title) {
        this.f9552a.J(title);
    }

    public void B(int type) {
        this.f9552a.y(type);
    }

    public void C(int repeatMode) {
        this.f9552a.D(repeatMode);
    }

    public void D(PendingIntent pi2) {
        this.f9552a.N(pi2);
    }

    public void E(int shuffleMode) {
        this.f9552a.K(shuffleMode);
    }

    public void a(k listener) {
        if (listener == null) {
            throw new IllegalArgumentException("Listener may not be null");
        }
        this.f9554c.add(listener);
    }

    @b1({b1.a.LIBRARY})
    public String d() {
        return this.f9552a.A();
    }

    public MediaControllerCompat e() {
        return this.f9553b;
    }

    @NonNull
    public final androidx.media.f.b f() {
        return this.f9552a.P();
    }

    public Object g() {
        return this.f9552a.O();
    }

    public Object h() {
        return this.f9552a.E();
    }

    public Token i() {
        return this.f9552a.b();
    }

    public boolean k() {
        return this.f9552a.isActive();
    }

    public void l() {
        this.f9552a.release();
    }

    public void m(k listener) {
        if (listener == null) {
            throw new IllegalArgumentException("Listener may not be null");
        }
        this.f9554c.remove(listener);
    }

    public void n(String event, Bundle extras) {
        if (TextUtils.isEmpty(event)) {
            throw new IllegalArgumentException("event cannot be null or empty");
        }
        this.f9552a.w(event, extras);
    }

    public void o(boolean active) {
        this.f9552a.F(active);
        Iterator<k> it = this.f9554c.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public void p(b callback) {
        q(callback, null);
    }

    public void q(b callback, Handler handler) {
        if (callback == null) {
            this.f9552a.x(null, null);
            return;
        }
        c cVar = this.f9552a;
        if (handler == null) {
            handler = new Handler();
        }
        cVar.x(callback, handler);
    }

    public void r(boolean enabled) {
        this.f9552a.r0(enabled);
    }

    public void s(Bundle extras) {
        this.f9552a.setExtras(extras);
    }

    public void t(int flags) {
        this.f9552a.v(flags);
    }

    public void u(PendingIntent mbr) {
        this.f9552a.C(mbr);
    }

    public void v(MediaMetadataCompat metadata) {
        this.f9552a.L(metadata);
    }

    public void w(PlaybackStateCompat state) {
        this.f9552a.z(state);
    }

    public void x(int stream) {
        this.f9552a.B(stream);
    }

    public void y(androidx.media.k volumeProvider) {
        if (volumeProvider == null) {
            throw new IllegalArgumentException("volumeProvider may not be null!");
        }
        this.f9552a.I(volumeProvider);
    }

    public void z(List<QueueItem> queue) {
        if (queue != null) {
            HashSet hashSet = new HashSet();
            for (QueueItem queueItem : queue) {
                if (queueItem == null) {
                    throw new IllegalArgumentException("queue shouldn't have null items");
                }
                if (hashSet.contains(Long.valueOf(queueItem.e()))) {
                    queueItem.e();
                    new IllegalArgumentException("id of each queue item should be unique");
                }
                hashSet.add(Long.valueOf(queueItem.e()));
            }
        }
        this.f9552a.M(queue);
    }

    @e.a({"BanParcelableUsage"})
    static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ResultReceiver f9559a;

        class a implements Parcelable.Creator<ResultReceiverWrapper> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public ResultReceiverWrapper createFromParcel(Parcel p10) {
                return new ResultReceiverWrapper(p10);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public ResultReceiverWrapper[] newArray(int size) {
                return new ResultReceiverWrapper[size];
            }
        }

        public ResultReceiverWrapper(@NonNull ResultReceiver resultReceiver) {
            this.f9559a = resultReceiver;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            this.f9559a.writeToParcel(dest, flags);
        }

        ResultReceiverWrapper(Parcel in) {
            this.f9559a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(in);
        }
    }

    public MediaSessionCompat(@NonNull Context context, @NonNull String tag, @p0 ComponentName mbrComponent, @p0 PendingIntent mbrIntent) {
        this(context, tag, mbrComponent, mbrIntent, null);
    }

    public MediaSessionCompat(@NonNull Context context, @NonNull String tag, @p0 ComponentName mbrComponent, @p0 PendingIntent mbrIntent, @p0 Bundle sessionInfo) {
        this(context, tag, mbrComponent, mbrIntent, sessionInfo, null);
    }

    @e.a({"WrongConstant"})
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public MediaSessionCompat(@NonNull Context context, @NonNull String tag, @p0 ComponentName mbrComponent, @p0 PendingIntent mbrIntent, @p0 Bundle sessionInfo, @p0 androidx.versionedparcelable.h session2Token) {
        this.f9554c = new ArrayList<>();
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        if (!TextUtils.isEmpty(tag)) {
            mbrComponent = mbrComponent == null ? androidx.media.session.a.c(context) : mbrComponent;
            if (mbrComponent != null && mbrIntent == null) {
                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                intent.setComponent(mbrComponent);
                mbrIntent = PendingIntent.getBroadcast(context, 0, intent, f9530e);
            }
            i iVar = new i(context, tag, session2Token, sessionInfo);
            this.f9552a = iVar;
            q(new a(), new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()));
            iVar.C(mbrIntent);
            this.f9553b = new MediaControllerCompat(context, this);
            if (S == 0) {
                S = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
            }
            return;
        }
        throw new IllegalArgumentException("tag must not be null or empty");
    }

    @w0(21)
    static class f implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final MediaSession f9575a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Token f9576b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Bundle f9578d;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        PlaybackStateCompat f9581g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        List<QueueItem> f9582h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        MediaMetadataCompat f9583i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f9584j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        boolean f9585k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f9586l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f9587m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @b0("mLock")
        b f9588n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @b0("mLock")
        androidx.media.f.b f9589o;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Object f9577c = new Object();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f9579e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final RemoteCallbackList<android.support.v4.media.session.a> f9580f = new RemoteCallbackList<>();

        class a extends android.support.v4.media.session.b.AbstractBinderC0018b {
            a() {
            }

            @Override // android.support.v4.media.session.b
            public void A() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void A6(android.support.v4.media.session.a cb2) {
                f.this.f9580f.unregister(cb2);
            }

            @Override // android.support.v4.media.session.b
            public boolean Aa(KeyEvent mediaButton) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void B() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public int C() {
                return f.this.f9586l;
            }

            @Override // android.support.v4.media.session.b
            public void D(int repeatMode) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void D1() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public String E() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void E1(String action, Bundle args) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void Ec(String query, Bundle extras) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void F(long pos) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void G(float speed) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public PlaybackStateCompat H() {
                f fVar = f.this;
                return MediaSessionCompat.j(fVar.f9581g, fVar.f9583i);
            }

            @Override // android.support.v4.media.session.b
            public void Hd(int direction, int flags, String packageName) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public long I() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public int J() {
                return f.this.f9587m;
            }

            @Override // android.support.v4.media.session.b
            public void Jb(long id2) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void K(int shuffleMode) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void M3(RatingCompat rating, Bundle extras) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public int O0() {
                return f.this.f9584j;
            }

            @Override // android.support.v4.media.session.b
            public boolean O1() {
                return false;
            }

            @Override // android.support.v4.media.session.b
            public void P() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void R4(boolean enabled) throws RemoteException {
            }

            @Override // android.support.v4.media.session.b
            public void Ra(MediaDescriptionCompat descriptionCompat, int index) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public boolean S5() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public Bundle T0() {
                if (f.this.f9578d == null) {
                    return null;
                }
                return new Bundle(f.this.f9578d);
            }

            @Override // android.support.v4.media.session.b
            public void T2(String mediaId, Bundle extras) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void X9(String query, Bundle extras) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void a3(String mediaId, Bundle extras) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void c2(Uri uri, Bundle extras) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public boolean d0() {
                return f.this.f9585k;
            }

            @Override // android.support.v4.media.session.b
            public List<QueueItem> e() {
                return null;
            }

            @Override // android.support.v4.media.session.b
            public void ea(Uri uri, Bundle extras) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public Bundle getExtras() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public String getPackageName() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void h1(MediaDescriptionCompat description) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void h4(int index) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void j1(MediaDescriptionCompat descriptionCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public CharSequence k0() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public ParcelableVolumeInfo m8() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void mc(RatingCompat rating) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public PendingIntent n2() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void nc(int value, int flags, String packageName) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void next() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void pause() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void previous() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void r0(boolean enabled) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void r4(String command, Bundle args, ResultReceiverWrapper cb2) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void stop() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void x5(android.support.v4.media.session.a cb2) {
                if (!f.this.f9579e) {
                    f.this.f9580f.register(cb2, new androidx.media.f.b(androidx.media.f.b.f52906b, Binder.getCallingPid(), Binder.getCallingUid()));
                }
            }

            @Override // android.support.v4.media.session.b
            public MediaMetadataCompat z() {
                throw new AssertionError();
            }
        }

        f(Context context, String tag, androidx.versionedparcelable.h session2Token, Bundle sessionInfo) {
            MediaSession mediaSessionA = a(context, tag, sessionInfo);
            this.f9575a = mediaSessionA;
            this.f9576b = new Token(mediaSessionA.getSessionToken(), new a(), session2Token);
            this.f9578d = sessionInfo;
            v(3);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public String A() {
            try {
                return (String) this.f9575a.getClass().getMethod("getCallingPackage", null).invoke(this.f9575a, null);
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void B(int stream) {
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(stream);
            this.f9575a.setPlaybackToLocal(builder.build());
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void C(PendingIntent mbr) {
            this.f9575a.setMediaButtonReceiver(mbr);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void D(int repeatMode) {
            if (this.f9586l != repeatMode) {
                this.f9586l = repeatMode;
                for (int iBeginBroadcast = this.f9580f.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                    try {
                        ((android.support.v4.media.session.a) this.f9580f.getBroadcastItem(iBeginBroadcast)).x(repeatMode);
                    } catch (RemoteException unused) {
                    }
                }
                this.f9580f.finishBroadcast();
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public Object E() {
            return null;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void F(boolean active) {
            this.f9575a.setActive(active);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void G(androidx.media.f.b remoteUserInfo) {
            synchronized (this.f9577c) {
                try {
                    this.f9589o = remoteUserInfo;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public PlaybackStateCompat H() {
            return this.f9581g;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void I(androidx.media.k volumeProvider) {
            this.f9575a.setPlaybackToRemote((VolumeProvider) volumeProvider.e());
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void J(CharSequence title) {
            this.f9575a.setQueueTitle(title);
        }

        /*  JADX ERROR: NullPointerException in pass: BlockProcessor
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.BlockNode.getPredecessors()" because "to" is null
            	at jadx.core.dex.visitors.blocks.BlockSplitter.connect(BlockSplitter.java:159)
            	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectSplittersAndHandlers(BlockExceptionHandler.java:501)
            	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.wrapBlocksWithTryCatch(BlockExceptionHandler.java:382)
            	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:91)
            	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:62)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:422)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
            */
        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void K(int r4) {
            /*
                r3 = this;
                int r0 = r3.f9587m
                if (r0 == r4) goto L26
                r2 = 7
                r3.f9587m = r4
                android.os.RemoteCallbackList<android.support.v4.media.session.a> r0 = r3.f9580f
                int r0 = r0.beginBroadcast()
                r2 = 3
                int r0 = r0 + (-1)
            L10:
                r2 = 0
                if (r0 < 0) goto L21
                android.os.RemoteCallbackList<android.support.v4.media.session.a> r1 = r3.f9580f
                android.os.IInterface r1 = r1.getBroadcastItem(r0)
                android.support.v4.media.session.a r1 = (android.support.v4.media.session.a) r1
                r1.pb(r4)     // Catch: android.os.RemoteException -> L1e
            L1e:
                int r0 = r0 + (-1)
                goto L10
            L21:
                android.os.RemoteCallbackList<android.support.v4.media.session.a> r3 = r3.f9580f
                r3.finishBroadcast()
            L26:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat.f.K(int):void");
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void L(MediaMetadataCompat metadata) {
            this.f9583i = metadata;
            this.f9575a.setMetadata(metadata == null ? null : (MediaMetadata) metadata.h());
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void M(List<QueueItem> queue) {
            this.f9582h = queue;
            if (queue == null) {
                this.f9575a.setQueue(null);
                return;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<QueueItem> it = queue.iterator();
            while (it.hasNext()) {
                arrayList.add((MediaSession.QueueItem) it.next().f());
            }
            this.f9575a.setQueue(arrayList);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void N(PendingIntent pi2) {
            this.f9575a.setSessionActivity(pi2);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public Object O() {
            return this.f9575a;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public androidx.media.f.b P() {
            androidx.media.f.b bVar;
            synchronized (this.f9577c) {
                try {
                    bVar = this.f9589o;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return bVar;
        }

        public MediaSession a(Context context, String tag, Bundle sessionInfo) {
            return new MediaSession(context, tag);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public Token b() {
            return this.f9576b;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public boolean isActive() {
            return this.f9575a.isActive();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void r0(boolean enabled) {
            if (this.f9585k != enabled) {
                this.f9585k = enabled;
                for (int iBeginBroadcast = this.f9580f.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                    try {
                        ((android.support.v4.media.session.a) this.f9580f.getBroadcastItem(iBeginBroadcast)).rd(enabled);
                    } catch (RemoteException unused) {
                    }
                }
                this.f9580f.finishBroadcast();
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void release() {
            this.f9579e = true;
            this.f9580f.kill();
            this.f9575a.setCallback(null);
            this.f9575a.release();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void setExtras(Bundle extras) {
            this.f9575a.setExtras(extras);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public b u() {
            b bVar;
            synchronized (this.f9577c) {
                bVar = this.f9588n;
            }
            return bVar;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        @e.a({"WrongConstant"})
        public void v(int flags) {
            this.f9575a.setFlags(flags | 3);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void w(String event, Bundle extras) {
            this.f9575a.sendSessionEvent(event, extras);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void x(b callback, Handler handler) {
            synchronized (this.f9577c) {
                try {
                    this.f9588n = callback;
                    this.f9575a.setCallback(callback == null ? null : callback.f9566b, handler);
                    if (callback != null) {
                        callback.o0(this, handler);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void y(int type) {
            this.f9584j = type;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void z(PlaybackStateCompat state) {
            this.f9581g = state;
            for (int iBeginBroadcast = this.f9580f.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                try {
                    ((android.support.v4.media.session.a) this.f9580f.getBroadcastItem(iBeginBroadcast)).of(state);
                } catch (RemoteException unused) {
                }
            }
            this.f9580f.finishBroadcast();
            this.f9575a.setPlaybackState(state == null ? null : (PlaybackState) state.m());
        }

        f(Object mediaSession) {
            if (!(mediaSession instanceof MediaSession)) {
                throw new IllegalArgumentException("mediaSession is not a valid MediaSession object");
            }
            MediaSession mediaSession2 = (MediaSession) mediaSession;
            this.f9575a = mediaSession2;
            this.f9576b = new Token(mediaSession2.getSessionToken(), new a());
            this.f9578d = null;
            v(3);
        }
    }

    private MediaSessionCompat(Context context, c impl) {
        this.f9554c = new ArrayList<>();
        this.f9552a = impl;
        this.f9553b = new MediaControllerCompat(context, this);
    }
}
