package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.media.MediaDescription;
import android.media.browse.MediaBrowser;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.annotation.u;
import androidx.annotation.w0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public final class MediaBrowserCompat {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final String f9285b = "MediaBrowserCompat";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final boolean f9286c = Log.isLoggable(f9285b, 3);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f9287d = "android.media.browse.extra.PAGE";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f9288e = "android.media.browse.extra.PAGE_SIZE";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f9289f = "android.media.browse.extra.MEDIA_ID";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f9290g = "android.media.browse.extra.DOWNLOAD_PROGRESS";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f9291h = "android.support.v4.media.action.DOWNLOAD";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f9292i = "android.support.v4.media.action.REMOVE_DOWNLOADED_FILE";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f9293a;

    private static class CustomActionResultReceiver extends ResultReceiver {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f9294d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Bundle f9295e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final d f9296f;

        CustomActionResultReceiver(String action, Bundle extras, d callback, Handler handler) {
            super(handler);
            this.f9294d = action;
            this.f9295e = extras;
            this.f9296f = callback;
        }

        @Override // android.support.v4.os.ResultReceiver
        protected void a(int resultCode, Bundle resultData) {
            if (this.f9296f == null) {
                return;
            }
            MediaSessionCompat.b(resultData);
            if (resultCode == -1) {
                this.f9296f.a(this.f9294d, this.f9295e, resultData);
                return;
            }
            if (resultCode == 0) {
                this.f9296f.c(this.f9294d, this.f9295e, resultData);
            } else if (resultCode == 1) {
                this.f9296f.b(this.f9294d, this.f9295e, resultData);
            } else {
                Objects.toString(this.f9295e);
                Objects.toString(resultData);
            }
        }
    }

    private static class ItemReceiver extends ResultReceiver {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f9297d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final e f9298e;

        ItemReceiver(String mediaId, e callback, Handler handler) {
            super(handler);
            this.f9297d = mediaId;
            this.f9298e = callback;
        }

        @Override // android.support.v4.os.ResultReceiver
        protected void a(int resultCode, Bundle resultData) {
            if (resultData != null) {
                resultData = MediaSessionCompat.F(resultData);
            }
            if (resultCode == 0 && resultData != null && resultData.containsKey(androidx.media.e.f52773l)) {
                Parcelable parcelable = resultData.getParcelable(androidx.media.e.f52773l);
                if (parcelable == null || (parcelable instanceof MediaItem)) {
                    this.f9298e.b((MediaItem) parcelable);
                    return;
                } else {
                    this.f9298e.a(this.f9297d);
                    return;
                }
            }
            this.f9298e.a(this.f9297d);
        }
    }

    private static class SearchResultReceiver extends ResultReceiver {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f9303d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Bundle f9304e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final l f9305f;

        SearchResultReceiver(String query, Bundle extras, l callback, Handler handler) {
            super(handler);
            this.f9303d = query;
            this.f9304e = extras;
            this.f9305f = callback;
        }

        @Override // android.support.v4.os.ResultReceiver
        protected void a(int resultCode, Bundle resultData) {
            if (resultData != null) {
                resultData = MediaSessionCompat.F(resultData);
            }
            if (resultCode != 0 || resultData == null || !resultData.containsKey("search_results")) {
                this.f9305f.a(this.f9303d, this.f9304e);
                return;
            }
            Parcelable[] parcelableArray = resultData.getParcelableArray("search_results");
            if (parcelableArray == null) {
                this.f9305f.a(this.f9303d, this.f9304e);
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : parcelableArray) {
                arrayList.add((MediaItem) parcelable);
            }
            this.f9305f.b(this.f9303d, this.f9304e, arrayList);
        }
    }

    @w0(21)
    private static class a {
        private a() {
        }

        @u
        static MediaDescription a(MediaBrowser.MediaItem item) {
            return item.getDescription();
        }

        @u
        static int b(MediaBrowser.MediaItem item) {
            return item.getFlags();
        }
    }

    private static class b extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<k> f9306a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<Messenger> f9307b;

        b(k callbackImpl) {
            this.f9306a = new WeakReference<>(callbackImpl);
        }

        void a(Messenger callbacksMessenger) {
            this.f9307b = new WeakReference<>(callbacksMessenger);
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message msg) {
            WeakReference<Messenger> weakReference = this.f9307b;
            if (weakReference == null || weakReference.get() == null || this.f9306a.get() == null) {
                return;
            }
            Bundle data = msg.getData();
            MediaSessionCompat.b(data);
            k kVar = this.f9306a.get();
            Messenger messenger = this.f9307b.get();
            try {
                int i10 = msg.what;
                if (i10 == 1) {
                    Bundle bundle = data.getBundle(androidx.media.d.f52753k);
                    MediaSessionCompat.b(bundle);
                    kVar.l(messenger, data.getString(androidx.media.d.f52746d), (MediaSessionCompat.Token) data.getParcelable(androidx.media.d.f52748f), bundle);
                } else {
                    if (i10 == 2) {
                        kVar.h(messenger);
                        return;
                    }
                    if (i10 != 3) {
                        msg.toString();
                        return;
                    }
                    Bundle bundle2 = data.getBundle(androidx.media.d.f52749g);
                    MediaSessionCompat.b(bundle2);
                    Bundle bundle3 = data.getBundle(androidx.media.d.f52750h);
                    MediaSessionCompat.b(bundle3);
                    kVar.i(messenger, data.getString(androidx.media.d.f52746d), data.getParcelableArrayList(androidx.media.d.f52747e), bundle2, bundle3);
                }
            } catch (BadParcelableException unused) {
                if (msg.what == 1) {
                    kVar.h(messenger);
                }
            }
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final MediaBrowser.ConnectionCallback f9308a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        b f9309b;

        @w0(21)
        private class a extends MediaBrowser.ConnectionCallback {
            a() {
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnected() {
                b bVar = c.this.f9309b;
                if (bVar != null) {
                    bVar.j();
                }
                c.this.a();
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnectionFailed() {
                b bVar = c.this.f9309b;
                if (bVar != null) {
                    bVar.k();
                }
                c.this.b();
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnectionSuspended() {
                b bVar = c.this.f9309b;
                if (bVar != null) {
                    bVar.c();
                }
                c.this.c();
            }
        }

        interface b {
            void c();

            void j();

            void k();
        }

        public void a() {
        }

        public void b() {
        }

        public void c() {
        }

        void d(b connectionCallbackInternal) {
            this.f9309b = connectionCallbackInternal;
        }
    }

    public static abstract class d {
        public void a(String action, Bundle extras, Bundle data) {
        }

        public void b(String action, Bundle extras, Bundle data) {
        }

        public void c(String action, Bundle extras, Bundle resultData) {
        }
    }

    public static abstract class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final MediaBrowser.ItemCallback f9311a = new a();

        @w0(23)
        private class a extends MediaBrowser.ItemCallback {
            a() {
            }

            @Override // android.media.browse.MediaBrowser.ItemCallback
            public void onError(@NonNull String itemId) {
                e.this.a(itemId);
            }

            @Override // android.media.browse.MediaBrowser.ItemCallback
            public void onItemLoaded(MediaBrowser.MediaItem item) {
                e.this.b(MediaItem.a(item));
            }
        }

        public void a(@NonNull String itemId) {
        }

        public void b(MediaItem item) {
        }
    }

    interface f {
        void a();

        @NonNull
        MediaSessionCompat.Token b();

        void d();

        void e(@NonNull String action, Bundle extras, @p0 d callback);

        void f(@NonNull String query, Bundle extras, @NonNull l callback);

        ComponentName g();

        @p0
        Bundle getExtras();

        @NonNull
        String getRoot();

        boolean isConnected();

        void m(@NonNull String mediaId, @NonNull e cb2);

        void n(@NonNull String parentId, @p0 Bundle options, @NonNull o callback);

        void o(@NonNull String parentId, o callback);

        @p0
        Bundle p();
    }

    @w0(21)
    static class g implements f, k, c.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Context f9313a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected final MediaBrowser f9314b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected final Bundle f9315c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected final b f9316d = new b(this);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final androidx.collection.a<String, n> f9317e = new androidx.collection.a<>();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        protected int f9318f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        protected m f9319g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        protected Messenger f9320h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private MediaSessionCompat.Token f9321i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Bundle f9322j;

        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ e f9323a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f9324b;

            a(final e val$cb, final String val$mediaId) {
                this.f9323a = val$cb;
                this.f9324b = val$mediaId;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f9323a.a(this.f9324b);
            }
        }

        class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ e f9326a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f9327b;

            b(final e val$cb, final String val$mediaId) {
                this.f9326a = val$cb;
                this.f9327b = val$mediaId;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f9326a.a(this.f9327b);
            }
        }

        class c implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ e f9329a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f9330b;

            c(final e val$cb, final String val$mediaId) {
                this.f9329a = val$cb;
                this.f9330b = val$mediaId;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f9329a.a(this.f9330b);
            }
        }

        class d implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ l f9332a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f9333b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Bundle f9334c;

            d(final l val$callback, final String val$query, final Bundle val$extras) {
                this.f9332a = val$callback;
                this.f9333b = val$query;
                this.f9334c = val$extras;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f9332a.a(this.f9333b, this.f9334c);
            }
        }

        class e implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ l f9336a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f9337b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Bundle f9338c;

            e(final l val$callback, final String val$query, final Bundle val$extras) {
                this.f9336a = val$callback;
                this.f9337b = val$query;
                this.f9338c = val$extras;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f9336a.a(this.f9337b, this.f9338c);
            }
        }

        class f implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f9340a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f9341b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Bundle f9342c;

            f(final d val$callback, final String val$action, final Bundle val$extras) {
                this.f9340a = val$callback;
                this.f9341b = val$action;
                this.f9342c = val$extras;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f9340a.a(this.f9341b, this.f9342c, null);
            }
        }

        /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserCompat$g$g, reason: collision with other inner class name */
        class RunnableC0013g implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f9344a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f9345b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Bundle f9346c;

            RunnableC0013g(final d val$callback, final String val$action, final Bundle val$extras) {
                this.f9344a = val$callback;
                this.f9345b = val$action;
                this.f9346c = val$extras;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f9344a.a(this.f9345b, this.f9346c, null);
            }
        }

        g(Context context, ComponentName serviceComponent, c callback, Bundle rootHints) {
            this.f9313a = context;
            Bundle bundle = rootHints != null ? new Bundle(rootHints) : new Bundle();
            this.f9315c = bundle;
            bundle.putInt(androidx.media.d.f52758p, 1);
            bundle.putInt(androidx.media.d.f52759q, Process.myPid());
            callback.d(this);
            this.f9314b = new MediaBrowser(context, serviceComponent, callback.f9308a, bundle);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.f
        public void a() {
            this.f9314b.connect();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.f
        @NonNull
        public MediaSessionCompat.Token b() {
            if (this.f9321i == null) {
                this.f9321i = MediaSessionCompat.Token.b(this.f9314b.getSessionToken());
            }
            return this.f9321i;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.c.b
        public void c() {
            this.f9319g = null;
            this.f9320h = null;
            this.f9321i = null;
            this.f9316d.a(null);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.f
        public void d() {
            Messenger messenger;
            m mVar = this.f9319g;
            if (mVar != null && (messenger = this.f9320h) != null) {
                try {
                    mVar.j(messenger);
                } catch (RemoteException unused) {
                }
            }
            this.f9314b.disconnect();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.f
        public void e(@NonNull final String action, final Bundle extras, @p0 final d callback) {
            if (!isConnected()) {
                throw new IllegalStateException("Cannot send a custom action (" + action + ") with extras " + extras + " because the browser is not connected to the service.");
            }
            if (this.f9319g == null && callback != null) {
                this.f9316d.post(new f(callback, action, extras));
            }
            try {
                this.f9319g.h(action, extras, new CustomActionResultReceiver(action, extras, callback, this.f9316d), this.f9320h);
            } catch (RemoteException unused) {
                Objects.toString(extras);
                if (callback != null) {
                    this.f9316d.post(new RunnableC0013g(callback, action, extras));
                }
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.f
        public void f(@NonNull final String query, final Bundle extras, @NonNull final l callback) {
            if (!isConnected()) {
                throw new IllegalStateException("search() called while not connected");
            }
            if (this.f9319g == null) {
                this.f9316d.post(new d(callback, query, extras));
                return;
            }
            try {
                this.f9319g.g(query, extras, new SearchResultReceiver(query, extras, callback, this.f9316d), this.f9320h);
            } catch (RemoteException unused) {
                this.f9316d.post(new e(callback, query, extras));
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.f
        public ComponentName g() {
            return this.f9314b.getServiceComponent();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.f
        @p0
        public Bundle getExtras() {
            return this.f9314b.getExtras();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.f
        @NonNull
        public String getRoot() {
            return this.f9314b.getRoot();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.k
        public void h(Messenger callback) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.k
        public void i(Messenger callback, String parentId, List<MediaItem> list, Bundle options, Bundle notifyChildrenChangedOptions) {
            if (this.f9320h != callback) {
                return;
            }
            n nVar = this.f9317e.get(parentId);
            if (nVar == null) {
                boolean z10 = MediaBrowserCompat.f9286c;
                return;
            }
            o oVarA = nVar.a(options);
            if (oVarA != null) {
                if (options == null) {
                    if (list == null) {
                        oVarA.c(parentId);
                        return;
                    }
                    this.f9322j = notifyChildrenChangedOptions;
                    oVarA.a(parentId, list);
                    this.f9322j = null;
                    return;
                }
                if (list == null) {
                    oVarA.d(parentId, options);
                    return;
                }
                this.f9322j = notifyChildrenChangedOptions;
                oVarA.b(parentId, list, options);
                this.f9322j = null;
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.f
        public boolean isConnected() {
            return this.f9314b.isConnected();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.c.b
        public void j() {
            try {
                Bundle extras = this.f9314b.getExtras();
                if (extras == null) {
                    return;
                }
                this.f9318f = extras.getInt(androidx.media.d.f52760r, 0);
                IBinder iBinderA = androidx.core.app.l.a(extras, androidx.media.d.f52761s);
                if (iBinderA != null) {
                    this.f9319g = new m(iBinderA, this.f9315c);
                    Messenger messenger = new Messenger(this.f9316d);
                    this.f9320h = messenger;
                    this.f9316d.a(messenger);
                    try {
                        this.f9319g.e(this.f9313a, this.f9320h);
                    } catch (RemoteException unused) {
                    }
                }
                android.support.v4.media.session.b bVarI = android.support.v4.media.session.b.AbstractBinderC0018b.i(androidx.core.app.l.a(extras, androidx.media.d.f52762t));
                if (bVarI != null) {
                    this.f9321i = MediaSessionCompat.Token.c(this.f9314b.getSessionToken(), bVarI);
                }
            } catch (IllegalStateException unused2) {
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.c.b
        public void k() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.k
        public void l(final Messenger callback, final String root, final MediaSessionCompat.Token session, final Bundle extra) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.f
        public void m(@NonNull final String mediaId, @NonNull final e cb2) {
            if (TextUtils.isEmpty(mediaId)) {
                throw new IllegalArgumentException("mediaId is empty");
            }
            if (cb2 == null) {
                throw new IllegalArgumentException("cb is null");
            }
            if (!this.f9314b.isConnected()) {
                this.f9316d.post(new a(cb2, mediaId));
                return;
            }
            if (this.f9319g == null) {
                this.f9316d.post(new b(cb2, mediaId));
                return;
            }
            try {
                this.f9319g.d(mediaId, new ItemReceiver(mediaId, cb2, this.f9316d), this.f9320h);
            } catch (RemoteException unused) {
                this.f9316d.post(new c(cb2, mediaId));
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.f
        public void n(@NonNull final String parentId, final Bundle options, @NonNull final o callback) {
            n nVar = this.f9317e.get(parentId);
            if (nVar == null) {
                nVar = new n();
                this.f9317e.put(parentId, nVar);
            }
            callback.e(nVar);
            Bundle bundle = options == null ? null : new Bundle(options);
            nVar.e(bundle, callback);
            m mVar = this.f9319g;
            if (mVar == null) {
                this.f9314b.subscribe(parentId, callback.f9393a);
            } else {
                try {
                    mVar.a(parentId, callback.f9394b, bundle, this.f9320h);
                } catch (RemoteException unused) {
                }
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.f
        public void o(@NonNull String parentId, o callback) {
            n nVar = this.f9317e.get(parentId);
            if (nVar == null) {
                return;
            }
            m mVar = this.f9319g;
            if (mVar != null) {
                try {
                    if (callback == null) {
                        mVar.f(parentId, null, this.f9320h);
                    } else {
                        List<o> listB = nVar.b();
                        List<Bundle> listC = nVar.c();
                        for (int size = listB.size() - 1; size >= 0; size--) {
                            if (listB.get(size) == callback) {
                                this.f9319g.f(parentId, callback.f9394b, this.f9320h);
                                listB.remove(size);
                                listC.remove(size);
                            }
                        }
                    }
                } catch (RemoteException unused) {
                }
            } else if (callback == null) {
                this.f9314b.unsubscribe(parentId);
            } else {
                List<o> listB2 = nVar.b();
                List<Bundle> listC2 = nVar.c();
                for (int size2 = listB2.size() - 1; size2 >= 0; size2--) {
                    if (listB2.get(size2) == callback) {
                        listB2.remove(size2);
                        listC2.remove(size2);
                    }
                }
                if (listB2.size() == 0) {
                    this.f9314b.unsubscribe(parentId);
                }
            }
            if (nVar.d() || callback == null) {
                this.f9317e.remove(parentId);
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.f
        public Bundle p() {
            return this.f9322j;
        }
    }

    @w0(23)
    static class h extends g {
        h(Context context, ComponentName serviceComponent, c callback, Bundle rootHints) {
            super(context, serviceComponent, callback, rootHints);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.g, android.support.v4.media.MediaBrowserCompat.f
        public void m(@NonNull final String mediaId, @NonNull final e cb2) {
            if (this.f9319g == null) {
                this.f9314b.getItem(mediaId, cb2.f9311a);
            } else {
                super.m(mediaId, cb2);
            }
        }
    }

    @w0(26)
    static class i extends h {
        i(Context context, ComponentName serviceComponent, c callback, Bundle rootHints) {
            super(context, serviceComponent, callback, rootHints);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.g, android.support.v4.media.MediaBrowserCompat.f
        public void n(@NonNull String parentId, @p0 Bundle options, @NonNull o callback) {
            if (this.f9319g != null && this.f9318f >= 2) {
                super.n(parentId, options, callback);
            } else if (options == null) {
                this.f9314b.subscribe(parentId, callback.f9393a);
            } else {
                this.f9314b.subscribe(parentId, options, callback.f9393a);
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.g, android.support.v4.media.MediaBrowserCompat.f
        public void o(@NonNull String parentId, o callback) {
            if (this.f9319g != null && this.f9318f >= 2) {
                super.o(parentId, callback);
                return;
            }
            if (callback == null) {
                this.f9314b.unsubscribe(parentId);
            } else {
                this.f9314b.unsubscribe(parentId, callback.f9393a);
            }
        }
    }

    static class j implements f, k {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        static final int f9348o = 0;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        static final int f9349p = 1;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        static final int f9350q = 2;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        static final int f9351r = 3;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        static final int f9352s = 4;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Context f9353a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ComponentName f9354b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final c f9355c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Bundle f9356d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final b f9357e = new b(this);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final androidx.collection.a<String, n> f9358f = new androidx.collection.a<>();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f9359g = 1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        g f9360h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        m f9361i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Messenger f9362j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private String f9363k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private MediaSessionCompat.Token f9364l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private Bundle f9365m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Bundle f9366n;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean zBindService;
                j jVar = j.this;
                if (jVar.f9359g == 0) {
                    return;
                }
                jVar.f9359g = 2;
                if (MediaBrowserCompat.f9286c && jVar.f9360h != null) {
                    throw new RuntimeException("mServiceConnection should be null. Instead it is " + j.this.f9360h);
                }
                if (jVar.f9361i != null) {
                    throw new RuntimeException("mServiceBinderWrapper should be null. Instead it is " + j.this.f9361i);
                }
                if (jVar.f9362j != null) {
                    throw new RuntimeException("mCallbacksMessenger should be null. Instead it is " + j.this.f9362j);
                }
                Intent intent = new Intent(androidx.media.e.f52772k);
                intent.setComponent(j.this.f9354b);
                j jVar2 = j.this;
                jVar2.f9360h = jVar2.new g();
                try {
                    j jVar3 = j.this;
                    zBindService = jVar3.f9353a.bindService(intent, jVar3.f9360h, 1);
                } catch (Exception unused) {
                    Objects.toString(j.this.f9354b);
                    zBindService = false;
                }
                if (!zBindService) {
                    j.this.j();
                    j.this.f9355c.b();
                }
                if (MediaBrowserCompat.f9286c) {
                    j.this.c();
                }
            }
        }

        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                j jVar = j.this;
                Messenger messenger = jVar.f9362j;
                if (messenger != null) {
                    try {
                        jVar.f9361i.c(messenger);
                    } catch (RemoteException unused) {
                        Objects.toString(j.this.f9354b);
                    }
                }
                j jVar2 = j.this;
                int i10 = jVar2.f9359g;
                jVar2.j();
                if (i10 != 0) {
                    j.this.f9359g = i10;
                }
                if (MediaBrowserCompat.f9286c) {
                    j.this.c();
                }
            }
        }

        class c implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ e f9369a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f9370b;

            c(final e val$cb, final String val$mediaId) {
                this.f9369a = val$cb;
                this.f9370b = val$mediaId;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f9369a.a(this.f9370b);
            }
        }

        class d implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ e f9372a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f9373b;

            d(final e val$cb, final String val$mediaId) {
                this.f9372a = val$cb;
                this.f9373b = val$mediaId;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f9372a.a(this.f9373b);
            }
        }

        class e implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ l f9375a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f9376b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Bundle f9377c;

            e(final l val$callback, final String val$query, final Bundle val$extras) {
                this.f9375a = val$callback;
                this.f9376b = val$query;
                this.f9377c = val$extras;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f9375a.a(this.f9376b, this.f9377c);
            }
        }

        class f implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f9379a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f9380b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Bundle f9381c;

            f(final d val$callback, final String val$action, final Bundle val$extras) {
                this.f9379a = val$callback;
                this.f9380b = val$action;
                this.f9381c = val$extras;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f9379a.a(this.f9380b, this.f9381c, null);
            }
        }

        private class g implements ServiceConnection {

            class a implements Runnable {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ ComponentName f9384a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ IBinder f9385b;

                a(final ComponentName val$name, final IBinder val$binder) {
                    this.f9384a = val$name;
                    this.f9385b = val$binder;
                }

                @Override // java.lang.Runnable
                public void run() {
                    boolean z10 = MediaBrowserCompat.f9286c;
                    if (z10) {
                        Objects.toString(this.f9384a);
                        Objects.toString(this.f9385b);
                        j.this.c();
                    }
                    if (g.this.a("onServiceConnected")) {
                        j jVar = j.this;
                        jVar.f9361i = new m(this.f9385b, jVar.f9356d);
                        j.this.f9362j = new Messenger(j.this.f9357e);
                        j jVar2 = j.this;
                        jVar2.f9357e.a(jVar2.f9362j);
                        j jVar3 = j.this;
                        jVar3.f9359g = 2;
                        if (z10) {
                            try {
                                jVar3.c();
                            } catch (RemoteException unused) {
                                Objects.toString(j.this.f9354b);
                                if (MediaBrowserCompat.f9286c) {
                                    j.this.c();
                                    return;
                                }
                                return;
                            }
                        }
                        j jVar4 = j.this;
                        jVar4.f9361i.b(jVar4.f9353a, jVar4.f9362j);
                    }
                }
            }

            class b implements Runnable {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ ComponentName f9387a;

                b(final ComponentName val$name) {
                    this.f9387a = val$name;
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (MediaBrowserCompat.f9286c) {
                        Objects.toString(this.f9387a);
                        toString();
                        Objects.toString(j.this.f9360h);
                        j.this.c();
                    }
                    if (g.this.a("onServiceDisconnected")) {
                        j jVar = j.this;
                        jVar.f9361i = null;
                        jVar.f9362j = null;
                        jVar.f9357e.a(null);
                        j jVar2 = j.this;
                        jVar2.f9359g = 4;
                        jVar2.f9355c.c();
                    }
                }
            }

            g() {
            }

            private void b(Runnable r10) {
                if (Thread.currentThread() == j.this.f9357e.getLooper().getThread()) {
                    r10.run();
                } else {
                    j.this.f9357e.post(r10);
                }
            }

            boolean a(String funcName) {
                int i10;
                j jVar = j.this;
                if (jVar.f9360h == this && (i10 = jVar.f9359g) != 0 && i10 != 1) {
                    return true;
                }
                int i11 = jVar.f9359g;
                if (i11 != 0 && i11 != 1) {
                    Objects.toString(j.this.f9354b);
                    Objects.toString(j.this.f9360h);
                    toString();
                }
                return false;
            }

            @Override // android.content.ServiceConnection
            public void onServiceConnected(final ComponentName name, final IBinder binder) {
                b(new a(name, binder));
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(final ComponentName name) {
                b(new b(name));
            }
        }

        public j(Context context, ComponentName serviceComponent, c callback, Bundle rootHints) {
            int i10 = 6 | 1;
            if (context == null) {
                throw new IllegalArgumentException("context must not be null");
            }
            if (serviceComponent == null) {
                throw new IllegalArgumentException("service component must not be null");
            }
            if (callback == null) {
                throw new IllegalArgumentException("connection callback must not be null");
            }
            this.f9353a = context;
            this.f9354b = serviceComponent;
            this.f9355c = callback;
            this.f9356d = rootHints == null ? null : new Bundle(rootHints);
        }

        private static String k(int state) {
            if (state == 0) {
                return "CONNECT_STATE_DISCONNECTING";
            }
            if (state == 1) {
                return "CONNECT_STATE_DISCONNECTED";
            }
            if (state == 2) {
                return "CONNECT_STATE_CONNECTING";
            }
            if (state == 3) {
                return "CONNECT_STATE_CONNECTED";
            }
            if (state == 4) {
                return "CONNECT_STATE_SUSPENDED";
            }
            return "UNKNOWN/" + state;
        }

        private boolean q(Messenger callback, String funcName) {
            int i10;
            if (this.f9362j == callback && (i10 = this.f9359g) != 0 && i10 != 1) {
                return true;
            }
            int i11 = this.f9359g;
            if (i11 == 0 || i11 == 1) {
                return false;
            }
            Objects.toString(this.f9354b);
            Objects.toString(this.f9362j);
            toString();
            return false;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.f
        public void a() {
            int i10 = this.f9359g;
            if (i10 != 0 && i10 != 1) {
                throw new IllegalStateException("connect() called while neigther disconnecting nor disconnected (state=" + k(this.f9359g) + ")");
            }
            this.f9359g = 2;
            this.f9357e.post(new a());
        }

        @Override // android.support.v4.media.MediaBrowserCompat.f
        @NonNull
        public MediaSessionCompat.Token b() {
            if (isConnected()) {
                return this.f9364l;
            }
            throw new IllegalStateException("getSessionToken() called while not connected(state=" + this.f9359g + ")");
        }

        void c() {
            Objects.toString(this.f9354b);
            Objects.toString(this.f9355c);
            Objects.toString(this.f9356d);
            k(this.f9359g);
            Objects.toString(this.f9360h);
            Objects.toString(this.f9361i);
            Objects.toString(this.f9362j);
            Objects.toString(this.f9364l);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.f
        public void d() {
            this.f9359g = 0;
            this.f9357e.post(new b());
        }

        @Override // android.support.v4.media.MediaBrowserCompat.f
        public void e(@NonNull final String action, final Bundle extras, @p0 final d callback) {
            if (!isConnected()) {
                throw new IllegalStateException("Cannot send a custom action (" + action + ") with extras " + extras + " because the browser is not connected to the service.");
            }
            try {
                this.f9361i.h(action, extras, new CustomActionResultReceiver(action, extras, callback, this.f9357e), this.f9362j);
            } catch (RemoteException unused) {
                Objects.toString(extras);
                if (callback != null) {
                    this.f9357e.post(new f(callback, action, extras));
                }
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.f
        public void f(@NonNull final String query, final Bundle extras, @NonNull final l callback) {
            if (isConnected()) {
                try {
                    this.f9361i.g(query, extras, new SearchResultReceiver(query, extras, callback, this.f9357e), this.f9362j);
                    return;
                } catch (RemoteException unused) {
                    this.f9357e.post(new e(callback, query, extras));
                    return;
                }
            }
            throw new IllegalStateException("search() called while not connected (state=" + k(this.f9359g) + ")");
        }

        @Override // android.support.v4.media.MediaBrowserCompat.f
        @NonNull
        public ComponentName g() {
            if (isConnected()) {
                return this.f9354b;
            }
            throw new IllegalStateException("getServiceComponent() called while not connected (state=" + this.f9359g + ")");
        }

        @Override // android.support.v4.media.MediaBrowserCompat.f
        @p0
        public Bundle getExtras() {
            if (isConnected()) {
                return this.f9365m;
            }
            throw new IllegalStateException("getExtras() called while not connected (state=" + k(this.f9359g) + ")");
        }

        @Override // android.support.v4.media.MediaBrowserCompat.f
        @NonNull
        public String getRoot() {
            if (isConnected()) {
                return this.f9363k;
            }
            throw new IllegalStateException("getRoot() called while not connected(state=" + k(this.f9359g) + ")");
        }

        @Override // android.support.v4.media.MediaBrowserCompat.k
        public void h(final Messenger callback) {
            Objects.toString(this.f9354b);
            if (q(callback, "onConnectFailed")) {
                if (this.f9359g != 2) {
                    k(this.f9359g);
                } else {
                    j();
                    this.f9355c.b();
                }
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.k
        public void i(final Messenger callback, final String parentId, final List<MediaItem> list, final Bundle options, final Bundle notifyChildrenChangedOptions) {
            o oVarA;
            if (q(callback, "onLoadChildren")) {
                if (MediaBrowserCompat.f9286c) {
                    Objects.toString(this.f9354b);
                }
                n nVar = this.f9358f.get(parentId);
                if (nVar == null || (oVarA = nVar.a(options)) == null) {
                    return;
                }
                if (options == null) {
                    if (list == null) {
                        oVarA.c(parentId);
                        return;
                    }
                    this.f9366n = notifyChildrenChangedOptions;
                    oVarA.a(parentId, list);
                    this.f9366n = null;
                    return;
                }
                if (list == null) {
                    oVarA.d(parentId, options);
                    return;
                }
                this.f9366n = notifyChildrenChangedOptions;
                oVarA.b(parentId, list, options);
                this.f9366n = null;
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.f
        public boolean isConnected() {
            return this.f9359g == 3;
        }

        void j() {
            g gVar = this.f9360h;
            if (gVar != null) {
                this.f9353a.unbindService(gVar);
            }
            this.f9359g = 1;
            this.f9360h = null;
            this.f9361i = null;
            this.f9362j = null;
            this.f9357e.a(null);
            this.f9363k = null;
            this.f9364l = null;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.k
        public void l(final Messenger callback, final String root, final MediaSessionCompat.Token session, final Bundle extra) {
            if (q(callback, "onConnect")) {
                if (this.f9359g != 2) {
                    k(this.f9359g);
                    return;
                }
                this.f9363k = root;
                this.f9364l = session;
                this.f9365m = extra;
                this.f9359g = 3;
                if (MediaBrowserCompat.f9286c) {
                    c();
                }
                this.f9355c.a();
                try {
                    for (Map.Entry<String, n> entry : this.f9358f.entrySet()) {
                        String key = entry.getKey();
                        n value = entry.getValue();
                        List<o> listB = value.b();
                        List<Bundle> listC = value.c();
                        for (int i10 = 0; i10 < listB.size(); i10++) {
                            this.f9361i.a(key, listB.get(i10).f9394b, listC.get(i10), this.f9362j);
                        }
                    }
                } catch (RemoteException unused) {
                }
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.f
        public void m(@NonNull final String mediaId, @NonNull final e cb2) {
            if (TextUtils.isEmpty(mediaId)) {
                throw new IllegalArgumentException("mediaId is empty");
            }
            if (cb2 == null) {
                throw new IllegalArgumentException("cb is null");
            }
            if (!isConnected()) {
                this.f9357e.post(new c(cb2, mediaId));
                return;
            }
            try {
                this.f9361i.d(mediaId, new ItemReceiver(mediaId, cb2, this.f9357e), this.f9362j);
            } catch (RemoteException unused) {
                this.f9357e.post(new d(cb2, mediaId));
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.f
        public void n(@NonNull String parentId, Bundle options, @NonNull o callback) {
            n nVar = this.f9358f.get(parentId);
            if (nVar == null) {
                nVar = new n();
                this.f9358f.put(parentId, nVar);
            }
            Bundle bundle = options == null ? null : new Bundle(options);
            nVar.e(bundle, callback);
            if (isConnected()) {
                try {
                    this.f9361i.a(parentId, callback.f9394b, bundle, this.f9362j);
                } catch (RemoteException unused) {
                }
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.f
        public void o(@NonNull String parentId, o callback) {
            n nVar = this.f9358f.get(parentId);
            if (nVar != null) {
                try {
                    if (callback != null) {
                        List<o> listB = nVar.b();
                        List<Bundle> listC = nVar.c();
                        for (int size = listB.size() - 1; size >= 0; size--) {
                            if (listB.get(size) == callback) {
                                if (isConnected()) {
                                    this.f9361i.f(parentId, callback.f9394b, this.f9362j);
                                }
                                listB.remove(size);
                                listC.remove(size);
                            }
                        }
                    } else if (isConnected()) {
                        this.f9361i.f(parentId, null, this.f9362j);
                    }
                } catch (RemoteException unused) {
                }
                if (nVar.d() || callback == null) {
                    this.f9358f.remove(parentId);
                }
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.f
        public Bundle p() {
            return this.f9366n;
        }
    }

    interface k {
        void h(Messenger callback);

        void i(Messenger callback, String parentId, List<MediaItem> list, Bundle options, Bundle notifyChildrenChangedOptions);

        void l(Messenger callback, String root, MediaSessionCompat.Token session, Bundle extra);
    }

    public static abstract class l {
        public void a(@NonNull String query, Bundle extras) {
        }

        public void b(@NonNull String query, Bundle extras, @NonNull List<MediaItem> items) {
        }
    }

    private static class m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Messenger f9389a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Bundle f9390b;

        public m(IBinder target, Bundle rootHints) {
            this.f9389a = new Messenger(target);
            this.f9390b = rootHints;
        }

        private void i(int what, Bundle data, Messenger cbMessenger) throws RemoteException {
            Message messageObtain = Message.obtain();
            messageObtain.what = what;
            messageObtain.arg1 = 1;
            messageObtain.setData(data);
            messageObtain.replyTo = cbMessenger;
            this.f9389a.send(messageObtain);
        }

        void a(String parentId, IBinder callbackToken, Bundle options, Messenger callbacksMessenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString(androidx.media.d.f52746d, parentId);
            androidx.core.app.l.b(bundle, androidx.media.d.f52743a, callbackToken);
            bundle.putBundle(androidx.media.d.f52749g, options);
            i(3, bundle, callbacksMessenger);
        }

        void b(Context context, Messenger callbacksMessenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString(androidx.media.d.f52751i, context.getPackageName());
            bundle.putInt(androidx.media.d.f52745c, Process.myPid());
            bundle.putBundle(androidx.media.d.f52753k, this.f9390b);
            i(1, bundle, callbacksMessenger);
        }

        void c(Messenger callbacksMessenger) throws RemoteException {
            i(2, null, callbacksMessenger);
        }

        void d(String mediaId, ResultReceiver receiver, Messenger callbacksMessenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString(androidx.media.d.f52746d, mediaId);
            bundle.putParcelable(androidx.media.d.f52752j, receiver);
            i(5, bundle, callbacksMessenger);
        }

        void e(Context context, Messenger callbackMessenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString(androidx.media.d.f52751i, context.getPackageName());
            bundle.putInt(androidx.media.d.f52745c, Process.myPid());
            bundle.putBundle(androidx.media.d.f52753k, this.f9390b);
            i(6, bundle, callbackMessenger);
        }

        void f(String parentId, IBinder callbackToken, Messenger callbacksMessenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString(androidx.media.d.f52746d, parentId);
            androidx.core.app.l.b(bundle, androidx.media.d.f52743a, callbackToken);
            i(4, bundle, callbacksMessenger);
        }

        void g(String query, Bundle extras, ResultReceiver receiver, Messenger callbacksMessenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString(androidx.media.d.f52755m, query);
            bundle.putBundle(androidx.media.d.f52754l, extras);
            bundle.putParcelable(androidx.media.d.f52752j, receiver);
            i(8, bundle, callbacksMessenger);
        }

        void h(String action, Bundle extras, ResultReceiver receiver, Messenger callbacksMessenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString(androidx.media.d.f52756n, action);
            bundle.putBundle(androidx.media.d.f52757o, extras);
            bundle.putParcelable(androidx.media.d.f52752j, receiver);
            i(9, bundle, callbacksMessenger);
        }

        void j(Messenger callbackMessenger) throws RemoteException {
            i(7, null, callbackMessenger);
        }
    }

    private static class n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<o> f9391a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<Bundle> f9392b = new ArrayList();

        public o a(Bundle options) {
            for (int i10 = 0; i10 < this.f9392b.size(); i10++) {
                if (androidx.media.c.a(this.f9392b.get(i10), options)) {
                    return this.f9391a.get(i10);
                }
            }
            return null;
        }

        public List<o> b() {
            return this.f9391a;
        }

        public List<Bundle> c() {
            return this.f9392b;
        }

        public boolean d() {
            return this.f9391a.isEmpty();
        }

        public void e(Bundle options, o callback) {
            for (int i10 = 0; i10 < this.f9392b.size(); i10++) {
                if (androidx.media.c.a(this.f9392b.get(i10), options)) {
                    this.f9391a.set(i10, callback);
                    return;
                }
            }
            this.f9391a.add(callback);
            this.f9392b.add(options);
        }
    }

    public static abstract class o {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        WeakReference<n> f9395c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final IBinder f9394b = new Binder();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final MediaBrowser.SubscriptionCallback f9393a = new b();

        @w0(21)
        private class a extends MediaBrowser.SubscriptionCallback {
            a() {
            }

            List<MediaItem> a(List<MediaItem> list, final Bundle options) {
                if (list == null) {
                    return null;
                }
                int i10 = options.getInt(MediaBrowserCompat.f9287d, -1);
                int i11 = options.getInt(MediaBrowserCompat.f9288e, -1);
                if (i10 == -1 && i11 == -1) {
                    return list;
                }
                int i12 = i11 * i10;
                int size = i12 + i11;
                if (i10 >= 0 && i11 >= 1 && i12 < list.size()) {
                    if (size > list.size()) {
                        size = list.size();
                    }
                    return list.subList(i12, size);
                }
                return Collections.EMPTY_LIST;
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onChildrenLoaded(@NonNull String parentId, List<MediaBrowser.MediaItem> children) {
                WeakReference<n> weakReference = o.this.f9395c;
                n nVar = weakReference == null ? null : weakReference.get();
                if (nVar == null) {
                    o.this.a(parentId, MediaItem.b(children));
                    return;
                }
                List<MediaItem> listB = MediaItem.b(children);
                List<o> listB2 = nVar.b();
                List<Bundle> listC = nVar.c();
                for (int i10 = 0; i10 < listB2.size(); i10++) {
                    Bundle bundle = listC.get(i10);
                    if (bundle == null) {
                        o.this.a(parentId, listB);
                    } else {
                        o.this.b(parentId, a(listB, bundle), bundle);
                    }
                }
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onError(@NonNull String parentId) {
                o.this.c(parentId);
            }
        }

        @w0(26)
        private class b extends a {
            b() {
                super();
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onChildrenLoaded(@NonNull String parentId, @NonNull List<MediaBrowser.MediaItem> children, @NonNull Bundle options) {
                MediaSessionCompat.b(options);
                o.this.b(parentId, MediaItem.b(children), options);
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onError(@NonNull String parentId, @NonNull Bundle options) {
                MediaSessionCompat.b(options);
                o.this.d(parentId, options);
            }
        }

        public void a(@NonNull String parentId, @NonNull List<MediaItem> children) {
        }

        public void b(@NonNull String parentId, @NonNull List<MediaItem> children, @NonNull Bundle options) {
        }

        public void c(@NonNull String parentId) {
        }

        public void d(@NonNull String parentId, @NonNull Bundle options) {
        }

        void e(n subscription) {
            this.f9395c = new WeakReference<>(subscription);
        }
    }

    public MediaBrowserCompat(Context context, ComponentName serviceComponent, c callback, Bundle rootHints) {
        this.f9293a = new i(context, serviceComponent, callback, rootHints);
    }

    public void a() {
        this.f9293a.a();
    }

    public void b() {
        this.f9293a.d();
    }

    @p0
    public Bundle c() {
        return this.f9293a.getExtras();
    }

    public void d(@NonNull final String mediaId, @NonNull final e cb2) {
        this.f9293a.m(mediaId, cb2);
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    @p0
    public Bundle e() {
        return this.f9293a.p();
    }

    @NonNull
    public String f() {
        return this.f9293a.getRoot();
    }

    @NonNull
    public ComponentName g() {
        return this.f9293a.g();
    }

    @NonNull
    public MediaSessionCompat.Token h() {
        return this.f9293a.b();
    }

    public boolean i() {
        return this.f9293a.isConnected();
    }

    public void j(@NonNull final String query, final Bundle extras, @NonNull l callback) {
        if (TextUtils.isEmpty(query)) {
            throw new IllegalArgumentException("query cannot be empty");
        }
        if (callback == null) {
            throw new IllegalArgumentException("callback cannot be null");
        }
        this.f9293a.f(query, extras, callback);
    }

    public void k(@NonNull String action, Bundle extras, @p0 d callback) {
        if (TextUtils.isEmpty(action)) {
            throw new IllegalArgumentException("action cannot be empty");
        }
        this.f9293a.e(action, extras, callback);
    }

    public void l(@NonNull String parentId, @NonNull Bundle options, @NonNull o callback) {
        if (TextUtils.isEmpty(parentId)) {
            throw new IllegalArgumentException("parentId is empty");
        }
        if (callback == null) {
            throw new IllegalArgumentException("callback is null");
        }
        if (options == null) {
            throw new IllegalArgumentException("options are null");
        }
        this.f9293a.n(parentId, options, callback);
    }

    public void m(@NonNull String parentId, @NonNull o callback) {
        if (TextUtils.isEmpty(parentId)) {
            throw new IllegalArgumentException("parentId is empty");
        }
        if (callback == null) {
            throw new IllegalArgumentException("callback is null");
        }
        this.f9293a.n(parentId, null, callback);
    }

    public void n(@NonNull String parentId) {
        if (TextUtils.isEmpty(parentId)) {
            throw new IllegalArgumentException("parentId is empty");
        }
        this.f9293a.o(parentId, null);
    }

    public void o(@NonNull String parentId, @NonNull o callback) {
        if (TextUtils.isEmpty(parentId)) {
            throw new IllegalArgumentException("parentId is empty");
        }
        if (callback == null) {
            throw new IllegalArgumentException("callback is null");
        }
        this.f9293a.o(parentId, callback);
    }

    @e.a({"BanParcelableUsage"})
    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f9299c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f9300d = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f9301a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final MediaDescriptionCompat f9302b;

        class a implements Parcelable.Creator<MediaItem> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public MediaItem createFromParcel(Parcel in) {
                return new MediaItem(in);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public MediaItem[] newArray(int size) {
                return new MediaItem[size];
            }
        }

        public MediaItem(@NonNull MediaDescriptionCompat description, int flags) {
            if (description == null) {
                throw new IllegalArgumentException("description cannot be null");
            }
            if (TextUtils.isEmpty(description.h())) {
                throw new IllegalArgumentException("description must have a non-empty media id");
            }
            this.f9301a = flags;
            this.f9302b = description;
        }

        public static MediaItem a(Object itemObj) {
            if (itemObj == null) {
                return null;
            }
            MediaBrowser.MediaItem mediaItem = (MediaBrowser.MediaItem) itemObj;
            return new MediaItem(MediaDescriptionCompat.a(a.a(mediaItem)), a.b(mediaItem));
        }

        public static List<MediaItem> b(List<?> itemList) {
            if (itemList == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(itemList.size());
            Iterator<?> it = itemList.iterator();
            while (it.hasNext()) {
                arrayList.add(a(it.next()));
            }
            return arrayList;
        }

        @NonNull
        public MediaDescriptionCompat c() {
            return this.f9302b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public int e() {
            return this.f9301a;
        }

        @p0
        public String f() {
            return this.f9302b.h();
        }

        public boolean g() {
            return (this.f9301a & 1) != 0;
        }

        public boolean h() {
            return (this.f9301a & 2) != 0;
        }

        @NonNull
        public String toString() {
            return "MediaItem{mFlags=" + this.f9301a + ", mDescription=" + this.f9302b + AbstractJsonLexerKt.END_OBJ;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int flags) {
            out.writeInt(this.f9301a);
            this.f9302b.writeToParcel(out, flags);
        }

        MediaItem(Parcel in) {
            this.f9301a = in.readInt();
            this.f9302b = MediaDescriptionCompat.CREATOR.createFromParcel(in);
        }
    }
}
