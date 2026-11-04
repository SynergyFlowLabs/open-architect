package androidx.media;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.browse.MediaBrowser;
import android.media.session.MediaSession;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.service.media.MediaBrowserService;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.annotation.w0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e extends Service {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final String f52769h = "MBServiceCompat";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final boolean f52770i = Log.isLoggable(f52769h, 3);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final float f52771j = 1.0E-5f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f52772k = "android.media.browse.MediaBrowserService";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @b1({b1.a.LIBRARY})
    public static final String f52773l = "media_item";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @b1({b1.a.LIBRARY})
    public static final String f52774m = "search_results";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final int f52775n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final int f52776o = 2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    static final int f52777s = 4;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @b1({b1.a.LIBRARY})
    public static final int f52778t = -1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @b1({b1.a.LIBRARY})
    public static final int f52779v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @b1({b1.a.LIBRARY})
    public static final int f52780w = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g f52781a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    f f52785e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    MediaSessionCompat.Token f52787g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final f f52782b = new f(androidx.media.f.b.f52906b, -1, -1, null, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final ArrayList<f> f52783c = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final androidx.collection.a<IBinder, f> f52784d = new androidx.collection.a<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final r f52786f = new r();

    class a extends m<List<MediaBrowserCompat.MediaItem>> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ f f52788f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f52789g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Bundle f52790h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ Bundle f52791i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Object debug, final f val$connection, final String val$parentId, final Bundle val$subscribeOptions, final Bundle val$notifyChildrenChangedOptions) {
            super(debug);
            this.f52788f = val$connection;
            this.f52789g = val$parentId;
            this.f52790h = val$subscribeOptions;
            this.f52791i = val$notifyChildrenChangedOptions;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.media.e.m
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void g(@p0 List<MediaBrowserCompat.MediaItem> list) {
            if (e.this.f52784d.get(this.f52788f.f52810f.asBinder()) != this.f52788f) {
                if (e.f52770i) {
                    String str = this.f52788f.f52805a;
                }
            } else {
                if ((c() & 1) != 0) {
                    list = e.this.b(list, this.f52790h);
                }
                try {
                    this.f52788f.f52810f.a(this.f52789g, list, this.f52790h, this.f52791i);
                } catch (RemoteException unused) {
                    String str2 = this.f52788f.f52805a;
                }
            }
        }
    }

    class b extends m<MediaBrowserCompat.MediaItem> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ ResultReceiver f52793f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Object debug, final ResultReceiver val$receiver) {
            super(debug);
            this.f52793f = val$receiver;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.media.e.m
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void g(@p0 MediaBrowserCompat.MediaItem item) {
            if ((c() & 2) != 0) {
                this.f52793f.b(-1, null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable(e.f52773l, item);
            this.f52793f.b(0, bundle);
        }
    }

    class c extends m<List<MediaBrowserCompat.MediaItem>> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ ResultReceiver f52795f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Object debug, final ResultReceiver val$receiver) {
            super(debug);
            this.f52795f = val$receiver;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.media.e.m
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void g(@p0 List<MediaBrowserCompat.MediaItem> items) {
            if ((c() & 4) != 0 || items == null) {
                this.f52795f.b(-1, null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelableArray("search_results", (Parcelable[]) items.toArray(new MediaBrowserCompat.MediaItem[0]));
            this.f52795f.b(0, bundle);
        }
    }

    class d extends m<Bundle> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ ResultReceiver f52797f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Object debug, final ResultReceiver val$receiver) {
            super(debug);
            this.f52797f = val$receiver;
        }

        @Override // androidx.media.e.m
        void e(@p0 Bundle data) {
            this.f52797f.b(-1, data);
        }

        @Override // androidx.media.e.m
        void f(@p0 Bundle data) {
            this.f52797f.b(1, data);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.media.e.m
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void g(@p0 Bundle result) {
            this.f52797f.b(0, result);
        }
    }

    /* JADX INFO: renamed from: androidx.media.e$e, reason: collision with other inner class name */
    public static final class C0493e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f52799c = "android.service.media.extra.RECENT";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f52800d = "android.service.media.extra.OFFLINE";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f52801e = "android.service.media.extra.SUGGESTED";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Deprecated
        public static final String f52802f = "android.service.media.extra.SUGGESTION_KEYWORDS";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f52803a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Bundle f52804b;

        public C0493e(@NonNull String rootId, @p0 Bundle extras) {
            if (rootId == null) {
                throw new IllegalArgumentException("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead");
            }
            this.f52803a = rootId;
            this.f52804b = extras;
        }

        public Bundle c() {
            return this.f52804b;
        }

        public String d() {
            return this.f52803a;
        }
    }

    private class f implements IBinder.DeathRecipient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f52805a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f52806b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f52807c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final androidx.media.f.b f52808d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Bundle f52809e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final p f52810f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final HashMap<String, List<androidx.core.util.p<IBinder, Bundle>>> f52811g = new HashMap<>();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public C0493e f52812h;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = f.this;
                e.this.f52784d.remove(fVar.f52810f.asBinder());
            }
        }

        f(String pkg, int pid, int uid, Bundle rootHints, p callback) {
            this.f52805a = pkg;
            this.f52806b = pid;
            this.f52807c = uid;
            this.f52808d = new androidx.media.f.b(pkg, pid, uid);
            this.f52809e = rootHints;
            this.f52810f = callback;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            e.this.f52786f.post(new a());
        }
    }

    interface g {
        IBinder a(Intent intent);

        androidx.media.f.b b();

        Bundle c();

        void d(String parentId, Bundle options);

        void e(MediaSessionCompat.Token token);

        void f(androidx.media.f.b remoteUserInfo, String parentId, Bundle options);

        void n();
    }

    @w0(21)
    class h implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final List<Bundle> f52815a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        MediaBrowserService f52816b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Messenger f52817c;

        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ MediaSessionCompat.Token f52819a;

            a(final MediaSessionCompat.Token val$token) {
                this.f52819a = val$token;
            }

            @Override // java.lang.Runnable
            public void run() {
                h.this.m(this.f52819a);
            }
        }

        class b extends m<List<MediaBrowserCompat.MediaItem>> {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ n f52821f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Object debug, final n val$resultWrapper) {
                super(debug);
                this.f52821f = val$resultWrapper;
            }

            @Override // androidx.media.e.m
            public void b() {
                this.f52821f.a();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.media.e.m
            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public void g(@p0 List<MediaBrowserCompat.MediaItem> list) {
                ArrayList arrayList;
                if (list != null) {
                    arrayList = new ArrayList();
                    for (MediaBrowserCompat.MediaItem mediaItem : list) {
                        Parcel parcelObtain = Parcel.obtain();
                        mediaItem.writeToParcel(parcelObtain, 0);
                        arrayList.add(parcelObtain);
                    }
                } else {
                    arrayList = null;
                }
                this.f52821f.c(arrayList);
            }
        }

        class c implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f52823a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Bundle f52824b;

            c(final String val$parentId, final Bundle val$options) {
                this.f52823a = val$parentId;
                this.f52824b = val$options;
            }

            @Override // java.lang.Runnable
            public void run() {
                Iterator<IBinder> it = e.this.f52784d.keySet().iterator();
                while (it.hasNext()) {
                    h.this.i(e.this.f52784d.get(it.next()), this.f52823a, this.f52824b);
                }
            }
        }

        class d implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.media.f.b f52826a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f52827b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Bundle f52828c;

            d(final androidx.media.f.b val$remoteUserInfo, final String val$parentId, final Bundle val$options) {
                this.f52826a = val$remoteUserInfo;
                this.f52827b = val$parentId;
                this.f52828c = val$options;
            }

            @Override // java.lang.Runnable
            public void run() {
                for (int i10 = 0; i10 < e.this.f52784d.size(); i10++) {
                    f fVarK = e.this.f52784d.k(i10);
                    if (fVarK.f52808d.equals(this.f52826a)) {
                        h.this.i(fVarK, this.f52827b, this.f52828c);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: androidx.media.e$h$e, reason: collision with other inner class name */
        @w0(21)
        class C0494e extends MediaBrowserService {
            C0494e(Context context) {
                attachBaseContext(context);
            }

            @Override // android.service.media.MediaBrowserService
            @e.a({"SyntheticAccessor"})
            public MediaBrowserService.BrowserRoot onGetRoot(String clientPackageName, int clientUid, Bundle rootHints) {
                MediaSessionCompat.b(rootHints);
                C0493e c0493eK = h.this.k(clientPackageName, clientUid, rootHints == null ? null : new Bundle(rootHints));
                if (c0493eK == null) {
                    return null;
                }
                return new MediaBrowserService.BrowserRoot(c0493eK.f52803a, c0493eK.f52804b);
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadChildren(String parentId, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result) {
                h.this.l(parentId, new n<>(result));
            }
        }

        h() {
        }

        @Override // androidx.media.e.g
        public IBinder a(Intent intent) {
            return this.f52816b.onBind(intent);
        }

        @Override // androidx.media.e.g
        public androidx.media.f.b b() {
            f fVar = e.this.f52785e;
            if (fVar != null) {
                return fVar.f52808d;
            }
            throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }

        @Override // androidx.media.e.g
        public Bundle c() {
            if (this.f52817c == null) {
                return null;
            }
            f fVar = e.this.f52785e;
            if (fVar == null) {
                throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
            }
            if (fVar.f52809e == null) {
                return null;
            }
            return new Bundle(e.this.f52785e.f52809e);
        }

        @Override // androidx.media.e.g
        public void d(final String parentId, final Bundle options) {
            j(parentId, options);
            h(parentId, options);
        }

        @Override // androidx.media.e.g
        public void e(final MediaSessionCompat.Token token) {
            e.this.f52786f.a(new a(token));
        }

        @Override // androidx.media.e.g
        public void f(final androidx.media.f.b remoteUserInfo, final String parentId, final Bundle options) {
            g(remoteUserInfo, parentId, options);
        }

        void g(final androidx.media.f.b remoteUserInfo, final String parentId, final Bundle options) {
            e.this.f52786f.post(new d(remoteUserInfo, parentId, options));
        }

        void h(final String parentId, final Bundle options) {
            e.this.f52786f.post(new c(parentId, options));
        }

        void i(final f connection, final String parentId, final Bundle options) {
            List<androidx.core.util.p<IBinder, Bundle>> list = connection.f52811g.get(parentId);
            if (list != null) {
                for (androidx.core.util.p<IBinder, Bundle> pVar : list) {
                    if (androidx.media.c.b(options, pVar.f48412b)) {
                        e.this.t(parentId, connection, pVar.f48412b, options);
                    }
                }
            }
        }

        void j(final String parentId, final Bundle options) {
            this.f52816b.notifyChildrenChanged(parentId);
        }

        public C0493e k(String clientPackageName, int clientUid, Bundle rootHints) {
            Bundle bundleC;
            int i10 = -1;
            if (rootHints == null || rootHints.getInt(androidx.media.d.f52758p, 0) == 0) {
                bundleC = null;
            } else {
                rootHints.remove(androidx.media.d.f52758p);
                this.f52817c = new Messenger(e.this.f52786f);
                bundleC = new Bundle();
                bundleC.putInt(androidx.media.d.f52760r, 2);
                androidx.core.app.l.b(bundleC, androidx.media.d.f52761s, this.f52817c.getBinder());
                MediaSessionCompat.Token token = e.this.f52787g;
                if (token != null) {
                    android.support.v4.media.session.b bVarE = token.e();
                    androidx.core.app.l.b(bundleC, androidx.media.d.f52762t, bVarE == null ? null : bVarE.asBinder());
                } else {
                    this.f52815a.add(bundleC);
                }
                i10 = rootHints.getInt(androidx.media.d.f52759q, -1);
                rootHints.remove(androidx.media.d.f52759q);
            }
            f fVar = e.this.new f(clientPackageName, i10, clientUid, rootHints, null);
            e eVar = e.this;
            eVar.f52785e = fVar;
            C0493e c0493eL = eVar.l(clientPackageName, clientUid, rootHints);
            e eVar2 = e.this;
            eVar2.f52785e = null;
            if (c0493eL == null) {
                return null;
            }
            if (this.f52817c != null) {
                eVar2.f52783c.add(fVar);
            }
            if (bundleC == null) {
                bundleC = c0493eL.c();
            } else if (c0493eL.c() != null) {
                bundleC.putAll(c0493eL.c());
            }
            return new C0493e(c0493eL.d(), bundleC);
        }

        public void l(String parentId, final n<List<Parcel>> resultWrapper) {
            b bVar = new b(parentId, resultWrapper);
            e eVar = e.this;
            eVar.f52785e = eVar.f52782b;
            eVar.m(parentId, bVar);
            e.this.f52785e = null;
        }

        void m(MediaSessionCompat.Token token) {
            if (!this.f52815a.isEmpty()) {
                android.support.v4.media.session.b bVarE = token.e();
                if (bVarE != null) {
                    Iterator<Bundle> it = this.f52815a.iterator();
                    while (it.hasNext()) {
                        androidx.core.app.l.b(it.next(), androidx.media.d.f52762t, bVarE.asBinder());
                    }
                }
                this.f52815a.clear();
            }
            this.f52816b.setSessionToken((MediaSession.Token) token.g());
        }

        @Override // androidx.media.e.g
        public void n() {
            C0494e c0494e = new C0494e(e.this);
            this.f52816b = c0494e;
            c0494e.onCreate();
        }
    }

    @w0(23)
    class i extends h {

        class a extends m<MediaBrowserCompat.MediaItem> {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ n f52832f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Object debug, final n val$resultWrapper) {
                super(debug);
                this.f52832f = val$resultWrapper;
            }

            @Override // androidx.media.e.m
            public void b() {
                this.f52832f.a();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.media.e.m
            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public void g(@p0 MediaBrowserCompat.MediaItem item) {
                if (item == null) {
                    this.f52832f.c(null);
                    return;
                }
                Parcel parcelObtain = Parcel.obtain();
                item.writeToParcel(parcelObtain, 0);
                this.f52832f.c(parcelObtain);
            }
        }

        class b extends h.C0494e {
            b(Context context) {
                super(context);
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadItem(String itemId, MediaBrowserService.Result<MediaBrowser.MediaItem> result) {
                i.this.o(itemId, new n<>(result));
            }
        }

        i() {
            super();
        }

        @Override // androidx.media.e.h, androidx.media.e.g
        public void n() {
            b bVar = new b(e.this);
            this.f52816b = bVar;
            bVar.onCreate();
        }

        public void o(String itemId, final n<Parcel> resultWrapper) {
            a aVar = new a(itemId, resultWrapper);
            e eVar = e.this;
            eVar.f52785e = eVar.f52782b;
            eVar.o(itemId, aVar);
            e.this.f52785e = null;
        }
    }

    @w0(26)
    class j extends i {

        class a extends m<List<MediaBrowserCompat.MediaItem>> {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ n f52836f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ Bundle f52837g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Object debug, final n val$resultWrapper, final Bundle val$options) {
                super(debug);
                this.f52836f = val$resultWrapper;
                this.f52837g = val$options;
            }

            @Override // androidx.media.e.m
            public void b() {
                this.f52836f.a();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.media.e.m
            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public void g(@p0 List<MediaBrowserCompat.MediaItem> list) {
                if (list == null) {
                    this.f52836f.c(null);
                    return;
                }
                if ((c() & 1) != 0) {
                    list = e.this.b(list, this.f52837g);
                }
                ArrayList arrayList = new ArrayList();
                for (MediaBrowserCompat.MediaItem mediaItem : list) {
                    Parcel parcelObtain = Parcel.obtain();
                    mediaItem.writeToParcel(parcelObtain, 0);
                    arrayList.add(parcelObtain);
                }
                this.f52836f.c(arrayList);
            }
        }

        class b extends i.b {
            b(Context context) {
                super(context);
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadChildren(String parentId, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result, Bundle options) {
                MediaSessionCompat.b(options);
                j jVar = j.this;
                e eVar = e.this;
                eVar.f52785e = eVar.f52782b;
                jVar.p(parentId, new n<>(result), options);
                boolean z10 = false & false;
                e.this.f52785e = null;
            }
        }

        j() {
            super();
        }

        @Override // androidx.media.e.h, androidx.media.e.g
        public Bundle c() {
            e eVar = e.this;
            f fVar = eVar.f52785e;
            if (fVar == null) {
                throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
            }
            if (fVar == eVar.f52782b) {
                return this.f52816b.getBrowserRootHints();
            }
            if (fVar.f52809e == null) {
                return null;
            }
            return new Bundle(e.this.f52785e.f52809e);
        }

        @Override // androidx.media.e.h
        void j(final String parentId, final Bundle options) {
            if (options != null) {
                this.f52816b.notifyChildrenChanged(parentId, options);
            } else {
                super.j(parentId, options);
            }
        }

        @Override // androidx.media.e.i, androidx.media.e.h, androidx.media.e.g
        public void n() {
            b bVar = new b(e.this);
            this.f52816b = bVar;
            bVar.onCreate();
        }

        public void p(String parentId, final n<List<Parcel>> resultWrapper, final Bundle options) {
            a aVar = new a(parentId, resultWrapper, options);
            e eVar = e.this;
            eVar.f52785e = eVar.f52782b;
            eVar.n(parentId, aVar, options);
            e.this.f52785e = null;
        }
    }

    @w0(28)
    class k extends j {
        k() {
            super();
        }

        @Override // androidx.media.e.h, androidx.media.e.g
        public androidx.media.f.b b() {
            e eVar = e.this;
            f fVar = eVar.f52785e;
            if (fVar != null) {
                return fVar == eVar.f52782b ? new androidx.media.f.b(this.f52816b.getCurrentBrowserInfo()) : fVar.f52808d;
            }
            throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }
    }

    class l implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Messenger f52841a;

        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ MediaSessionCompat.Token f52843a;

            a(final MediaSessionCompat.Token val$token) {
                this.f52843a = val$token;
            }

            @Override // java.lang.Runnable
            public void run() {
                Iterator<f> it = e.this.f52784d.values().iterator();
                while (it.hasNext()) {
                    f next = it.next();
                    try {
                        next.f52810f.b(next.f52812h.d(), this.f52843a, next.f52812h.c());
                    } catch (RemoteException unused) {
                        String str = next.f52805a;
                        it.remove();
                    }
                }
            }
        }

        class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f52845a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Bundle f52846b;

            b(final String val$parentId, final Bundle val$options) {
                this.f52845a = val$parentId;
                this.f52846b = val$options;
            }

            @Override // java.lang.Runnable
            public void run() {
                Iterator<IBinder> it = e.this.f52784d.keySet().iterator();
                while (it.hasNext()) {
                    l.this.g(e.this.f52784d.get(it.next()), this.f52845a, this.f52846b);
                }
            }
        }

        class c implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.media.f.b f52848a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f52849b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Bundle f52850c;

            c(final androidx.media.f.b val$remoteUserInfo, final String val$parentId, final Bundle val$options) {
                this.f52848a = val$remoteUserInfo;
                this.f52849b = val$parentId;
                this.f52850c = val$options;
            }

            @Override // java.lang.Runnable
            public void run() {
                for (int i10 = 0; i10 < e.this.f52784d.size(); i10++) {
                    f fVarK = e.this.f52784d.k(i10);
                    if (fVarK.f52808d.equals(this.f52848a)) {
                        l.this.g(fVarK, this.f52849b, this.f52850c);
                        return;
                    }
                }
            }
        }

        l() {
        }

        @Override // androidx.media.e.g
        public IBinder a(Intent intent) {
            if (e.f52772k.equals(intent.getAction())) {
                return this.f52841a.getBinder();
            }
            return null;
        }

        @Override // androidx.media.e.g
        public androidx.media.f.b b() {
            f fVar = e.this.f52785e;
            if (fVar != null) {
                return fVar.f52808d;
            }
            throw new IllegalStateException("This should be called inside of onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }

        @Override // androidx.media.e.g
        public Bundle c() {
            f fVar = e.this.f52785e;
            if (fVar == null) {
                throw new IllegalStateException("This should be called inside of onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
            }
            if (fVar.f52809e == null) {
                return null;
            }
            return new Bundle(e.this.f52785e.f52809e);
        }

        @Override // androidx.media.e.g
        public void d(@NonNull final String parentId, final Bundle options) {
            e.this.f52786f.post(new b(parentId, options));
        }

        @Override // androidx.media.e.g
        public void e(final MediaSessionCompat.Token token) {
            e.this.f52786f.post(new a(token));
        }

        @Override // androidx.media.e.g
        public void f(@NonNull final androidx.media.f.b remoteUserInfo, @NonNull final String parentId, final Bundle options) {
            e.this.f52786f.post(new c(remoteUserInfo, parentId, options));
        }

        void g(final f connection, final String parentId, final Bundle options) {
            List<androidx.core.util.p<IBinder, Bundle>> list = connection.f52811g.get(parentId);
            if (list != null) {
                for (androidx.core.util.p<IBinder, Bundle> pVar : list) {
                    if (androidx.media.c.b(options, pVar.f48412b)) {
                        e.this.t(parentId, connection, pVar.f48412b, options);
                    }
                }
            }
        }

        @Override // androidx.media.e.g
        public void n() {
            this.f52841a = new Messenger(e.this.f52786f);
        }
    }

    public static class m<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f52852a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f52853b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f52854c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f52855d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f52856e;

        m(Object debug) {
            this.f52852a = debug;
        }

        private void a(@p0 Bundle extras) {
            if (extras != null && extras.containsKey(MediaBrowserCompat.f9290g)) {
                float f10 = extras.getFloat(MediaBrowserCompat.f9290g);
                if (f10 < -1.0E-5f || f10 > 1.00001f) {
                    throw new IllegalArgumentException("The value of the EXTRA_DOWNLOAD_PROGRESS field must be a float number within [0.0, 1.0]");
                }
            }
        }

        public void b() {
            if (this.f52853b) {
                throw new IllegalStateException("detach() called when detach() had already been called for: " + this.f52852a);
            }
            if (this.f52854c) {
                throw new IllegalStateException("detach() called when sendResult() had already been called for: " + this.f52852a);
            }
            if (!this.f52855d) {
                this.f52853b = true;
                return;
            }
            throw new IllegalStateException("detach() called when sendError() had already been called for: " + this.f52852a);
        }

        int c() {
            return this.f52856e;
        }

        boolean d() {
            return this.f52853b || this.f52854c || this.f52855d;
        }

        void e(@p0 Bundle extras) {
            throw new UnsupportedOperationException("It is not supported to send an error for " + this.f52852a);
        }

        void f(@p0 Bundle extras) {
            throw new UnsupportedOperationException("It is not supported to send an interim update for " + this.f52852a);
        }

        void g(@p0 T result) {
        }

        public void h(@p0 Bundle extras) {
            if (!this.f52854c && !this.f52855d) {
                this.f52855d = true;
                e(extras);
            } else {
                throw new IllegalStateException("sendError() called when either sendResult() or sendError() had already been called for: " + this.f52852a);
            }
        }

        public void i(@p0 Bundle extras) {
            if (!this.f52854c && !this.f52855d) {
                a(extras);
                f(extras);
            } else {
                throw new IllegalStateException("sendProgressUpdate() called when either sendResult() or sendError() had already been called for: " + this.f52852a);
            }
        }

        public void j(@p0 T result) {
            if (!this.f52854c && !this.f52855d) {
                this.f52854c = true;
                g(result);
            } else {
                throw new IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + this.f52852a);
            }
        }

        void k(int flags) {
            this.f52856e = flags;
        }
    }

    @w0(21)
    static class n<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        MediaBrowserService.Result f52857a;

        n(MediaBrowserService.Result result) {
            this.f52857a = result;
        }

        public void a() {
            this.f52857a.detach();
        }

        List<MediaBrowser.MediaItem> b(List<Parcel> parcelList) {
            if (parcelList == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcel parcel : parcelList) {
                parcel.setDataPosition(0);
                arrayList.add((MediaBrowser.MediaItem) MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
            }
            return arrayList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void c(T result) {
            if (result instanceof List) {
                this.f52857a.sendResult(b((List) result));
                return;
            }
            if (!(result instanceof Parcel)) {
                this.f52857a.sendResult(null);
                return;
            }
            Parcel parcel = (Parcel) result;
            parcel.setDataPosition(0);
            this.f52857a.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
            parcel.recycle();
        }
    }

    private class o {

        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ p f52859a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f52860b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f52861c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f52862d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ Bundle f52863e;

            a(final p val$callbacks, final String val$pkg, final int val$pid, final int val$uid, final Bundle val$rootHints) {
                this.f52859a = val$callbacks;
                this.f52860b = val$pkg;
                this.f52861c = val$pid;
                this.f52862d = val$uid;
                this.f52863e = val$rootHints;
            }

            @Override // java.lang.Runnable
            public void run() {
                IBinder iBinderAsBinder = this.f52859a.asBinder();
                e.this.f52784d.remove(iBinderAsBinder);
                f fVar = e.this.new f(this.f52860b, this.f52861c, this.f52862d, this.f52863e, this.f52859a);
                e eVar = e.this;
                eVar.f52785e = fVar;
                C0493e c0493eL = eVar.l(this.f52860b, this.f52862d, this.f52863e);
                fVar.f52812h = c0493eL;
                e eVar2 = e.this;
                eVar2.f52785e = null;
                if (c0493eL == null) {
                    try {
                        this.f52859a.onConnectFailed();
                    } catch (RemoteException unused) {
                    }
                } else {
                    try {
                        eVar2.f52784d.put(iBinderAsBinder, fVar);
                        iBinderAsBinder.linkToDeath(fVar, 0);
                        if (e.this.f52787g != null) {
                            this.f52859a.b(fVar.f52812h.d(), e.this.f52787g, fVar.f52812h.c());
                        }
                    } catch (RemoteException unused2) {
                        e.this.f52784d.remove(iBinderAsBinder);
                    }
                }
            }
        }

        class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ p f52865a;

            b(final p val$callbacks) {
                this.f52865a = val$callbacks;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVarRemove = e.this.f52784d.remove(this.f52865a.asBinder());
                if (fVarRemove != null) {
                    fVarRemove.f52810f.asBinder().unlinkToDeath(fVarRemove, 0);
                }
            }
        }

        class c implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ p f52867a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f52868b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ IBinder f52869c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Bundle f52870d;

            c(final p val$callbacks, final String val$id, final IBinder val$token, final Bundle val$options) {
                this.f52867a = val$callbacks;
                this.f52868b = val$id;
                this.f52869c = val$token;
                this.f52870d = val$options;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = e.this.f52784d.get(this.f52867a.asBinder());
                if (fVar == null) {
                    return;
                }
                e.this.a(this.f52868b, fVar, this.f52869c, this.f52870d);
            }
        }

        class d implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ p f52872a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f52873b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ IBinder f52874c;

            d(final p val$callbacks, final String val$id, final IBinder val$token) {
                this.f52872a = val$callbacks;
                this.f52873b = val$id;
                this.f52874c = val$token;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = e.this.f52784d.get(this.f52872a.asBinder());
                if (fVar == null) {
                    return;
                }
                e.this.w(this.f52873b, fVar, this.f52874c);
            }
        }

        /* JADX INFO: renamed from: androidx.media.e$o$e, reason: collision with other inner class name */
        class RunnableC0495e implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ p f52876a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f52877b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ ResultReceiver f52878c;

            RunnableC0495e(final p val$callbacks, final String val$mediaId, final ResultReceiver val$receiver) {
                this.f52876a = val$callbacks;
                this.f52877b = val$mediaId;
                this.f52878c = val$receiver;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = e.this.f52784d.get(this.f52876a.asBinder());
                if (fVar == null) {
                    return;
                }
                e.this.u(this.f52877b, fVar, this.f52878c);
            }
        }

        class f implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ p f52880a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f52881b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f52882c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f52883d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ Bundle f52884e;

            f(final p val$callbacks, final int val$uid, final String val$pkg, final int val$pid, final Bundle val$rootHints) {
                this.f52880a = val$callbacks;
                this.f52881b = val$uid;
                this.f52882c = val$pkg;
                this.f52883d = val$pid;
                this.f52884e = val$rootHints;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar;
                IBinder iBinderAsBinder = this.f52880a.asBinder();
                e.this.f52784d.remove(iBinderAsBinder);
                Iterator<f> it = e.this.f52783c.iterator();
                while (true) {
                    fVar = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    f next = it.next();
                    if (next.f52807c == this.f52881b) {
                        fVar = (TextUtils.isEmpty(this.f52882c) || this.f52883d <= 0) ? e.this.new f(next.f52805a, next.f52806b, next.f52807c, this.f52884e, this.f52880a) : null;
                        it.remove();
                        break;
                    }
                }
                if (fVar == null) {
                    fVar = e.this.new f(this.f52882c, this.f52883d, this.f52881b, this.f52884e, this.f52880a);
                }
                e.this.f52784d.put(iBinderAsBinder, fVar);
                try {
                    iBinderAsBinder.linkToDeath(fVar, 0);
                } catch (RemoteException unused) {
                }
            }
        }

        class g implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ p f52886a;

            g(final p val$callbacks) {
                this.f52886a = val$callbacks;
            }

            @Override // java.lang.Runnable
            public void run() {
                IBinder iBinderAsBinder = this.f52886a.asBinder();
                f fVarRemove = e.this.f52784d.remove(iBinderAsBinder);
                if (fVarRemove != null) {
                    iBinderAsBinder.unlinkToDeath(fVarRemove, 0);
                }
            }
        }

        class h implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ p f52888a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f52889b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Bundle f52890c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ ResultReceiver f52891d;

            h(final p val$callbacks, final String val$query, final Bundle val$extras, final ResultReceiver val$receiver) {
                this.f52888a = val$callbacks;
                this.f52889b = val$query;
                this.f52890c = val$extras;
                this.f52891d = val$receiver;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = e.this.f52784d.get(this.f52888a.asBinder());
                if (fVar == null) {
                    return;
                }
                e.this.v(this.f52889b, this.f52890c, fVar, this.f52891d);
            }
        }

        class i implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ p f52893a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f52894b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Bundle f52895c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ ResultReceiver f52896d;

            i(final p val$callbacks, final String val$action, final Bundle val$extras, final ResultReceiver val$receiver) {
                this.f52893a = val$callbacks;
                this.f52894b = val$action;
                this.f52895c = val$extras;
                this.f52896d = val$receiver;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = e.this.f52784d.get(this.f52893a.asBinder());
                if (fVar == null) {
                    Objects.toString(this.f52895c);
                } else {
                    e.this.s(this.f52894b, this.f52895c, fVar, this.f52896d);
                }
            }
        }

        o() {
        }

        public void a(final String id2, final IBinder token, final Bundle options, final p callbacks) {
            e.this.f52786f.a(new c(callbacks, id2, token, options));
        }

        public void b(final String pkg, final int pid, final int uid, final Bundle rootHints, final p callbacks) {
            if (e.this.g(pkg, uid)) {
                e.this.f52786f.a(new a(callbacks, pkg, pid, uid, rootHints));
                return;
            }
            throw new IllegalArgumentException("Package/uid mismatch: uid=" + uid + " package=" + pkg);
        }

        public void c(final p callbacks) {
            e.this.f52786f.a(new b(callbacks));
        }

        public void d(final String mediaId, final ResultReceiver receiver, final p callbacks) {
            if (TextUtils.isEmpty(mediaId) || receiver == null) {
                return;
            }
            e.this.f52786f.a(new RunnableC0495e(callbacks, mediaId, receiver));
        }

        public void e(final p callbacks, final String pkg, final int pid, final int uid, final Bundle rootHints) {
            e.this.f52786f.a(new f(callbacks, uid, pkg, pid, rootHints));
        }

        public void f(final String id2, final IBinder token, final p callbacks) {
            e.this.f52786f.a(new d(callbacks, id2, token));
        }

        public void g(final String query, final Bundle extras, final ResultReceiver receiver, final p callbacks) {
            if (TextUtils.isEmpty(query) || receiver == null) {
                return;
            }
            e.this.f52786f.a(new h(callbacks, query, extras, receiver));
        }

        public void h(final String action, final Bundle extras, final ResultReceiver receiver, final p callbacks) {
            if (!TextUtils.isEmpty(action) && receiver != null) {
                e.this.f52786f.a(new i(callbacks, action, extras, receiver));
            }
        }

        public void i(final p callbacks) {
            e.this.f52786f.a(new g(callbacks));
        }
    }

    private interface p {
        void a(String mediaId, List<MediaBrowserCompat.MediaItem> list, Bundle options, Bundle notifyChildrenChangedOptions) throws RemoteException;

        IBinder asBinder();

        void b(String root, MediaSessionCompat.Token session, Bundle extras) throws RemoteException;

        void onConnectFailed() throws RemoteException;
    }

    private static class q implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Messenger f52898a;

        q(Messenger callbacks) {
            this.f52898a = callbacks;
        }

        private void c(int what, Bundle data) throws RemoteException {
            Message messageObtain = Message.obtain();
            messageObtain.what = what;
            messageObtain.arg1 = 2;
            messageObtain.setData(data);
            this.f52898a.send(messageObtain);
        }

        @Override // androidx.media.e.p
        public void a(String mediaId, List<MediaBrowserCompat.MediaItem> list, Bundle options, Bundle notifyChildrenChangedOptions) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString(androidx.media.d.f52746d, mediaId);
            bundle.putBundle(androidx.media.d.f52749g, options);
            bundle.putBundle(androidx.media.d.f52750h, notifyChildrenChangedOptions);
            if (list != null) {
                bundle.putParcelableArrayList(androidx.media.d.f52747e, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
            }
            c(3, bundle);
        }

        @Override // androidx.media.e.p
        public IBinder asBinder() {
            return this.f52898a.getBinder();
        }

        @Override // androidx.media.e.p
        public void b(String root, MediaSessionCompat.Token session, Bundle extras) throws RemoteException {
            if (extras == null) {
                extras = new Bundle();
            }
            extras.putInt(androidx.media.d.f52760r, 2);
            Bundle bundle = new Bundle();
            bundle.putString(androidx.media.d.f52746d, root);
            bundle.putParcelable(androidx.media.d.f52748f, session);
            bundle.putBundle(androidx.media.d.f52753k, extras);
            c(1, bundle);
        }

        @Override // androidx.media.e.p
        public void onConnectFailed() throws RemoteException {
            c(2, null);
        }
    }

    private final class r extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final o f52899a;

        r() {
            this.f52899a = e.this.new o();
        }

        public void a(Runnable r10) {
            if (Thread.currentThread() == getLooper().getThread()) {
                r10.run();
            } else {
                post(r10);
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            Bundle data = msg.getData();
            switch (msg.what) {
                case 1:
                    Bundle bundle = data.getBundle(androidx.media.d.f52753k);
                    MediaSessionCompat.b(bundle);
                    this.f52899a.b(data.getString(androidx.media.d.f52751i), data.getInt(androidx.media.d.f52745c), data.getInt(androidx.media.d.f52744b), bundle, new q(msg.replyTo));
                    break;
                case 2:
                    this.f52899a.c(new q(msg.replyTo));
                    break;
                case 3:
                    Bundle bundle2 = data.getBundle(androidx.media.d.f52749g);
                    MediaSessionCompat.b(bundle2);
                    this.f52899a.a(data.getString(androidx.media.d.f52746d), androidx.core.app.l.a(data, androidx.media.d.f52743a), bundle2, new q(msg.replyTo));
                    break;
                case 4:
                    this.f52899a.f(data.getString(androidx.media.d.f52746d), androidx.core.app.l.a(data, androidx.media.d.f52743a), new q(msg.replyTo));
                    break;
                case 5:
                    this.f52899a.d(data.getString(androidx.media.d.f52746d), (ResultReceiver) data.getParcelable(androidx.media.d.f52752j), new q(msg.replyTo));
                    break;
                case 6:
                    Bundle bundle3 = data.getBundle(androidx.media.d.f52753k);
                    MediaSessionCompat.b(bundle3);
                    this.f52899a.e(new q(msg.replyTo), data.getString(androidx.media.d.f52751i), data.getInt(androidx.media.d.f52745c), data.getInt(androidx.media.d.f52744b), bundle3);
                    break;
                case 7:
                    this.f52899a.i(new q(msg.replyTo));
                    break;
                case 8:
                    Bundle bundle4 = data.getBundle(androidx.media.d.f52754l);
                    MediaSessionCompat.b(bundle4);
                    this.f52899a.g(data.getString(androidx.media.d.f52755m), bundle4, (ResultReceiver) data.getParcelable(androidx.media.d.f52752j), new q(msg.replyTo));
                    break;
                case 9:
                    Bundle bundle5 = data.getBundle(androidx.media.d.f52757o);
                    MediaSessionCompat.b(bundle5);
                    this.f52899a.h(data.getString(androidx.media.d.f52756n), bundle5, (ResultReceiver) data.getParcelable(androidx.media.d.f52752j), new q(msg.replyTo));
                    break;
                default:
                    msg.toString();
                    break;
            }
        }

        @Override // android.os.Handler
        public boolean sendMessageAtTime(Message msg, long uptimeMillis) {
            Bundle data = msg.getData();
            data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            data.putInt(androidx.media.d.f52744b, Binder.getCallingUid());
            int callingPid = Binder.getCallingPid();
            if (callingPid > 0) {
                data.putInt(androidx.media.d.f52745c, callingPid);
            } else if (!data.containsKey(androidx.media.d.f52745c)) {
                data.putInt(androidx.media.d.f52745c, -1);
            }
            return super.sendMessageAtTime(msg, uptimeMillis);
        }
    }

    void a(String id2, f connection, IBinder token, Bundle options) {
        List<androidx.core.util.p<IBinder, Bundle>> arrayList = connection.f52811g.get(id2);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        for (androidx.core.util.p<IBinder, Bundle> pVar : arrayList) {
            if (token == pVar.f48411a && androidx.media.c.a(options, pVar.f48412b)) {
                return;
            }
        }
        arrayList.add(new androidx.core.util.p<>(token, options));
        connection.f52811g.put(id2, arrayList);
        t(id2, connection, options, null);
        this.f52785e = connection;
        q(id2, options);
        this.f52785e = null;
    }

    List<MediaBrowserCompat.MediaItem> b(List<MediaBrowserCompat.MediaItem> list, final Bundle options) {
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
        if (i10 < 0 || i11 < 1 || i12 >= list.size()) {
            return Collections.EMPTY_LIST;
        }
        if (size > list.size()) {
            size = list.size();
        }
        return list.subList(i12, size);
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void c(Context base) {
        attachBaseContext(base);
    }

    public final Bundle d() {
        return this.f52781a.c();
    }

    @Override // android.app.Service
    public void dump(FileDescriptor fd2, PrintWriter writer, String[] args) {
    }

    @NonNull
    public final androidx.media.f.b e() {
        return this.f52781a.b();
    }

    @p0
    public MediaSessionCompat.Token f() {
        return this.f52787g;
    }

    boolean g(String pkg, int uid) {
        if (pkg == null) {
            return false;
        }
        for (String str : getPackageManager().getPackagesForUid(uid)) {
            if (str.equals(pkg)) {
                return true;
            }
        }
        return false;
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void h(@NonNull androidx.media.f.b remoteUserInfo, @NonNull String parentId, @NonNull Bundle options) {
        if (remoteUserInfo == null) {
            throw new IllegalArgumentException("remoteUserInfo cannot be null in notifyChildrenChanged");
        }
        if (parentId == null) {
            throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
        }
        if (options == null) {
            throw new IllegalArgumentException("options cannot be null in notifyChildrenChanged");
        }
        this.f52781a.f(remoteUserInfo, parentId, options);
    }

    public void i(@NonNull String parentId) {
        if (parentId == null) {
            throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
        }
        this.f52781a.d(parentId, null);
    }

    public void j(@NonNull String parentId, @NonNull Bundle options) {
        if (parentId == null) {
            throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
        }
        if (options == null) {
            throw new IllegalArgumentException("options cannot be null in notifyChildrenChanged");
        }
        this.f52781a.d(parentId, options);
    }

    public void k(@NonNull String action, Bundle extras, @NonNull m<Bundle> result) {
        result.h(null);
    }

    @p0
    public abstract C0493e l(@NonNull String clientPackageName, int clientUid, @p0 Bundle rootHints);

    public abstract void m(@NonNull String parentId, @NonNull m<List<MediaBrowserCompat.MediaItem>> result);

    public void n(@NonNull String parentId, @NonNull m<List<MediaBrowserCompat.MediaItem>> result, @NonNull Bundle options) {
        result.k(1);
        m(parentId, result);
    }

    public void o(String itemId, @NonNull m<MediaBrowserCompat.MediaItem> result) {
        result.k(2);
        result.j(null);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f52781a.a(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        k kVar = new k();
        this.f52781a = kVar;
        kVar.n();
    }

    public void p(@NonNull String query, Bundle extras, @NonNull m<List<MediaBrowserCompat.MediaItem>> result) {
        result.k(4);
        result.j(null);
    }

    @b1({b1.a.LIBRARY})
    public void q(String id2, Bundle option) {
    }

    @b1({b1.a.LIBRARY})
    public void r(String id2) {
    }

    void s(final String action, Bundle extras, f connection, final ResultReceiver receiver) {
        d dVar = new d(action, receiver);
        this.f52785e = connection;
        k(action, extras, dVar);
        this.f52785e = null;
        if (dVar.d()) {
            return;
        }
        throw new IllegalStateException("onCustomAction must call detach() or sendResult() or sendError() before returning for action=" + action + " extras=" + extras);
    }

    void t(final String parentId, final f connection, final Bundle subscribeOptions, final Bundle notifyChildrenChangedOptions) {
        a aVar = new a(parentId, connection, parentId, subscribeOptions, notifyChildrenChangedOptions);
        this.f52785e = connection;
        if (subscribeOptions == null) {
            m(parentId, aVar);
        } else {
            n(parentId, aVar, subscribeOptions);
        }
        this.f52785e = null;
        if (aVar.d()) {
            return;
        }
        throw new IllegalStateException("onLoadChildren must call detach() or sendResult() before returning for package=" + connection.f52805a + " id=" + parentId);
    }

    void u(String itemId, f connection, final ResultReceiver receiver) {
        b bVar = new b(itemId, receiver);
        this.f52785e = connection;
        o(itemId, bVar);
        this.f52785e = null;
        if (bVar.d()) {
            return;
        }
        throw new IllegalStateException("onLoadItem must call detach() or sendResult() before returning for id=" + itemId);
    }

    void v(final String query, Bundle extras, f connection, final ResultReceiver receiver) {
        c cVar = new c(query, receiver);
        this.f52785e = connection;
        p(query, extras, cVar);
        this.f52785e = null;
        if (cVar.d()) {
            return;
        }
        throw new IllegalStateException("onSearch must call detach() or sendResult() before returning for query=" + query);
    }

    boolean w(String id2, f connection, IBinder token) {
        boolean z10 = false;
        try {
            if (token != null) {
                List<androidx.core.util.p<IBinder, Bundle>> list = connection.f52811g.get(id2);
                if (list != null) {
                    Iterator<androidx.core.util.p<IBinder, Bundle>> it = list.iterator();
                    while (it.hasNext()) {
                        if (token == it.next().f48411a) {
                            it.remove();
                            z10 = true;
                        }
                    }
                    if (list.size() == 0) {
                        connection.f52811g.remove(id2);
                    }
                }
            } else if (connection.f52811g.remove(id2) != null) {
                z10 = true;
            }
            this.f52785e = connection;
            r(id2);
            this.f52785e = null;
            return z10;
        } catch (Throwable th2) {
            this.f52785e = connection;
            r(id2);
            this.f52785e = null;
            throw th2;
        }
    }

    public void x(MediaSessionCompat.Token token) {
        if (token == null) {
            throw new IllegalArgumentException("Session token may not be null");
        }
        if (this.f52787g != null) {
            throw new IllegalStateException("The session token has already been set");
        }
        this.f52787g = token;
        this.f52781a.e(token);
    }
}
