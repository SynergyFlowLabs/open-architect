package androidx.media2.session;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.media2.common.MediaItem;
import androidx.media2.common.MediaMetadata;
import com.google.common.util.concurrent.t1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
class g extends MediaControllerImplLegacy implements androidx.media2.session.e.InterfaceC0547e {

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private static final String f58874q3 = "MB2ImplLegacy";

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    @androidx.annotation.b0("mLock")
    final HashMap<MediaLibraryService.LibraryParams, MediaBrowserCompat> f58875o3;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    @androidx.annotation.b0("mLock")
    private final HashMap<String, List<C0550g>> f58876p3;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MediaLibraryService.LibraryParams f58877a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.concurrent.futures.e f58878b;

        a(MediaLibraryService.LibraryParams libraryParams, androidx.concurrent.futures.e eVar) {
            this.f58877a = libraryParams;
            this.f58878b = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(g.this.getContext(), g.this.A3().f5(), g.this.new f(this.f58878b, this.f58877a), a0.w(this.f58877a));
            synchronized (g.this.f58540e) {
                g.this.f58875o3.put(this.f58877a, mediaBrowserCompat);
            }
            mediaBrowserCompat.a();
        }
    }

    class b extends MediaBrowserCompat.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.concurrent.futures.e f58880b;

        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ MediaBrowserCompat.MediaItem f58882a;

            a(MediaBrowserCompat.MediaItem mediaItem) {
                this.f58882a = mediaItem;
            }

            @Override // java.lang.Runnable
            public void run() {
                MediaBrowserCompat.MediaItem mediaItem = this.f58882a;
                if (mediaItem != null) {
                    b.this.f58880b.E(new LibraryResult(0, a0.i(mediaItem), (MediaLibraryService.LibraryParams) null));
                } else {
                    b.this.f58880b.E(new LibraryResult(-3));
                }
            }
        }

        /* JADX INFO: renamed from: androidx.media2.session.g$b$b, reason: collision with other inner class name */
        class RunnableC0549b implements Runnable {
            RunnableC0549b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f58880b.E(new LibraryResult(-1));
            }
        }

        b(androidx.concurrent.futures.e eVar) {
            this.f58880b = eVar;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        public void a(@NonNull String str) {
            g.this.f58539d.post(new RunnableC0549b());
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        public void b(MediaBrowserCompat.MediaItem mediaItem) {
            g.this.f58539d.post(new a(mediaItem));
        }
    }

    class c extends MediaBrowserCompat.l {

        class a implements androidx.media2.session.e.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f58886a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ List f58887b;

            a(String str, List list) {
                this.f58886a = str;
                this.f58887b = list;
            }

            @Override // androidx.media2.session.e.c
            public void a(@NonNull androidx.media2.session.e.b bVar) {
                bVar.x(g.this.o(), this.f58886a, this.f58887b.size(), null);
            }
        }

        class b implements androidx.media2.session.e.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f58889a;

            b(String str) {
                this.f58889a = str;
            }

            @Override // androidx.media2.session.e.c
            public void a(@NonNull androidx.media2.session.e.b bVar) {
                bVar.x(g.this.o(), this.f58889a, 0, null);
            }
        }

        c() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.l
        public void a(@NonNull String str, Bundle bundle) {
            g.this.o().x(new b(str));
        }

        @Override // android.support.v4.media.MediaBrowserCompat.l
        public void b(@NonNull String str, Bundle bundle, @NonNull List<MediaBrowserCompat.MediaItem> list) {
            g.this.o().x(new a(str, list));
        }
    }

    class d extends MediaBrowserCompat.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.concurrent.futures.e f58891a;

        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f58893a;

            a(List list) {
                this.f58893a = list;
            }

            @Override // java.lang.Runnable
            public void run() {
                int i10 = 5 << 0;
                d.this.f58891a.E(new LibraryResult(0, a0.b(this.f58893a), (MediaLibraryService.LibraryParams) null));
            }
        }

        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.f58891a.E(new LibraryResult(-1));
            }
        }

        d(androidx.concurrent.futures.e eVar) {
            this.f58891a = eVar;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.l
        public void a(@NonNull String str, Bundle bundle) {
            g.this.f58539d.post(new b());
        }

        @Override // android.support.v4.media.MediaBrowserCompat.l
        public void b(@NonNull String str, Bundle bundle, @NonNull List<MediaBrowserCompat.MediaItem> list) {
            g.this.f58539d.post(new a(list));
        }
    }

    private class e extends MediaBrowserCompat.o {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final androidx.concurrent.futures.e<LibraryResult> f58896d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final String f58897e;

        e(androidx.concurrent.futures.e<LibraryResult> eVar, String str) {
            this.f58896d = eVar;
            this.f58897e = str;
        }

        private void f(@NonNull String str, @NonNull List<MediaBrowserCompat.MediaItem> list) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            MediaBrowserCompat mediaBrowserCompatNb = g.this.nb();
            if (mediaBrowserCompatNb == null) {
                this.f58896d.E(new LibraryResult(-100));
                return;
            }
            mediaBrowserCompatNb.o(this.f58897e, this);
            ArrayList arrayList = new ArrayList();
            if (list == null) {
                int i10 = 0 ^ (-1);
                this.f58896d.E(new LibraryResult(-1));
                return;
            }
            for (int i11 = 0; i11 < list.size(); i11++) {
                arrayList.add(a0.i(list.get(i11)));
            }
            this.f58896d.E(new LibraryResult(0, arrayList, (MediaLibraryService.LibraryParams) null));
        }

        private void g() {
            this.f58896d.E(new LibraryResult(-1));
        }

        @Override // android.support.v4.media.MediaBrowserCompat.o
        public void a(@NonNull String str, @NonNull List<MediaBrowserCompat.MediaItem> list) {
            f(str, list);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.o
        public void b(@NonNull String str, @NonNull List<MediaBrowserCompat.MediaItem> list, @NonNull Bundle bundle) {
            f(str, list);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.o
        public void c(@NonNull String str) {
            g();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.o
        public void d(@NonNull String str, @NonNull Bundle bundle) {
            g();
        }
    }

    private class f extends MediaBrowserCompat.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final androidx.concurrent.futures.e<LibraryResult> f58899c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final MediaLibraryService.LibraryParams f58900d;

        f(androidx.concurrent.futures.e<LibraryResult> eVar, MediaLibraryService.LibraryParams libraryParams) {
            this.f58899c = eVar;
            this.f58900d = libraryParams;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.c
        public void a() {
            MediaBrowserCompat mediaBrowserCompat;
            synchronized (g.this.f58540e) {
                try {
                    mediaBrowserCompat = g.this.f58875o3.get(this.f58900d);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (mediaBrowserCompat == null) {
                this.f58899c.E(new LibraryResult(-1));
            } else {
                this.f58899c.E(new LibraryResult(0, g.this.j(mediaBrowserCompat), a0.g(g.this.f58536a, mediaBrowserCompat.c())));
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.c
        public void b() {
            this.f58899c.E(new LibraryResult(-3));
            g.this.close();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.c
        public void c() {
            b();
        }
    }

    /* JADX INFO: renamed from: androidx.media2.session.g$g, reason: collision with other inner class name */
    private class C0550g extends MediaBrowserCompat.o {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final androidx.concurrent.futures.e<LibraryResult> f58902d;

        /* JADX INFO: renamed from: androidx.media2.session.g$g$a */
        class a implements androidx.media2.session.e.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f58904a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f58905b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ MediaLibraryService.LibraryParams f58906c;

            a(String str, int i10, MediaLibraryService.LibraryParams libraryParams) {
                this.f58904a = str;
                this.f58905b = i10;
                this.f58906c = libraryParams;
            }

            @Override // androidx.media2.session.e.c
            public void a(@NonNull androidx.media2.session.e.b bVar) {
                bVar.w(g.this.o(), this.f58904a, this.f58905b, this.f58906c);
            }
        }

        C0550g(androidx.concurrent.futures.e<LibraryResult> eVar) {
            this.f58902d = eVar;
        }

        private void f(@NonNull String str, @p0 List<MediaBrowserCompat.MediaItem> list) {
            MediaBrowserCompat mediaBrowserCompatNb;
            if (TextUtils.isEmpty(str) || (mediaBrowserCompatNb = g.this.nb()) == null || list == null) {
                return;
            }
            g.this.o().x(new a(str, list.size(), a0.g(g.this.f58536a, mediaBrowserCompatNb.e())));
            this.f58902d.E(new LibraryResult(0));
        }

        private void g() {
            this.f58902d.E(new LibraryResult(-1));
        }

        @Override // android.support.v4.media.MediaBrowserCompat.o
        public void a(@NonNull String str, @NonNull List<MediaBrowserCompat.MediaItem> list) {
            f(str, list);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.o
        public void b(@NonNull String str, @NonNull List<MediaBrowserCompat.MediaItem> list, @NonNull Bundle bundle) {
            f(str, list);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.o
        public void c(@NonNull String str) {
            g();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.o
        public void d(@NonNull String str, @NonNull Bundle bundle) {
            g();
        }
    }

    g(@NonNull Context context, androidx.media2.session.e eVar, @NonNull SessionToken sessionToken) {
        super(context, eVar, sessionToken);
        this.f58875o3 = new HashMap<>();
        this.f58876p3 = new HashMap<>();
    }

    private static Bundle g(@p0 MediaLibraryService.LibraryParams libraryParams) {
        return (libraryParams == null || libraryParams.getExtras() == null) ? new Bundle() : new Bundle(libraryParams.getExtras());
    }

    private static Bundle h(@p0 MediaLibraryService.LibraryParams libraryParams, int i10, int i11) {
        Bundle bundleG = g(libraryParams);
        bundleG.putInt(MediaBrowserCompat.f9287d, i10);
        bundleG.putInt(MediaBrowserCompat.f9288e, i11);
        return bundleG;
    }

    private MediaBrowserCompat l(MediaLibraryService.LibraryParams libraryParams) {
        MediaBrowserCompat mediaBrowserCompat;
        synchronized (this.f58540e) {
            try {
                mediaBrowserCompat = this.f58875o3.get(libraryParams);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mediaBrowserCompat;
    }

    private static Bundle m(@p0 MediaLibraryService.LibraryParams libraryParams) {
        if (libraryParams != null) {
            return libraryParams.getExtras();
        }
        return null;
    }

    @Override // androidx.media2.session.e.InterfaceC0547e
    public t1<LibraryResult> D5(@NonNull String str, @p0 MediaLibraryService.LibraryParams libraryParams) {
        MediaBrowserCompat mediaBrowserCompatNb = nb();
        if (mediaBrowserCompatNb == null) {
            return LibraryResult.j(-100);
        }
        androidx.concurrent.futures.e eVarN = androidx.concurrent.futures.e.N();
        C0550g c0550g = new C0550g(eVarN);
        synchronized (this.f58540e) {
            try {
                List<C0550g> arrayList = this.f58876p3.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.f58876p3.put(str, arrayList);
                }
                arrayList.add(c0550g);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        mediaBrowserCompatNb.l(str, g(libraryParams), c0550g);
        return eVarN;
    }

    @Override // androidx.media2.session.e.InterfaceC0547e
    public t1<LibraryResult> G4(@NonNull String str) {
        MediaBrowserCompat mediaBrowserCompatNb = nb();
        if (mediaBrowserCompatNb == null) {
            return LibraryResult.j(-100);
        }
        androidx.concurrent.futures.e eVarN = androidx.concurrent.futures.e.N();
        mediaBrowserCompatNb.d(str, new b(eVarN));
        return eVarN;
    }

    @Override // androidx.media2.session.e.InterfaceC0547e
    public t1<LibraryResult> S1(@NonNull String str, @p0 MediaLibraryService.LibraryParams libraryParams) {
        MediaBrowserCompat mediaBrowserCompatNb = nb();
        if (mediaBrowserCompatNb == null) {
            return LibraryResult.j(-100);
        }
        mediaBrowserCompatNb.j(str, m(libraryParams), new c());
        return LibraryResult.j(0);
    }

    @Override // androidx.media2.session.e.InterfaceC0547e
    public t1<LibraryResult> S4(@NonNull String str) {
        MediaBrowserCompat mediaBrowserCompatNb = nb();
        if (mediaBrowserCompatNb == null) {
            return LibraryResult.j(-100);
        }
        synchronized (this.f58540e) {
            try {
                List<C0550g> list = this.f58876p3.get(str);
                if (list == null) {
                    return LibraryResult.j(-3);
                }
                for (int i10 = 0; i10 < list.size(); i10++) {
                    mediaBrowserCompatNb.o(str, list.get(i10));
                }
                return LibraryResult.j(0);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media2.session.e.InterfaceC0547e
    public t1<LibraryResult> Sd(@NonNull String str, int i10, int i11, @p0 MediaLibraryService.LibraryParams libraryParams) {
        MediaBrowserCompat mediaBrowserCompatNb = nb();
        if (mediaBrowserCompatNb == null) {
            return LibraryResult.j(-100);
        }
        androidx.concurrent.futures.e eVarN = androidx.concurrent.futures.e.N();
        mediaBrowserCompatNb.j(str, h(libraryParams, i10, i11), new d(eVarN));
        return eVarN;
    }

    @Override // androidx.media2.session.e.InterfaceC0547e
    public t1<LibraryResult> Wd(@p0 MediaLibraryService.LibraryParams libraryParams) {
        androidx.concurrent.futures.e eVarN = androidx.concurrent.futures.e.N();
        MediaBrowserCompat mediaBrowserCompatL = l(libraryParams);
        if (mediaBrowserCompatL != null) {
            eVarN.E(new LibraryResult(0, j(mediaBrowserCompatL), (MediaLibraryService.LibraryParams) null));
            return eVarN;
        }
        this.f58539d.post(new a(libraryParams, eVarN));
        return eVarN;
    }

    @Override // androidx.media2.session.MediaControllerImplLegacy, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f58540e) {
            try {
                Iterator<MediaBrowserCompat> it = this.f58875o3.values().iterator();
                while (it.hasNext()) {
                    it.next().b();
                }
                this.f58875o3.clear();
                super.close();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media2.session.e.InterfaceC0547e
    public t1<LibraryResult> h7(@NonNull String str, int i10, int i11, @p0 MediaLibraryService.LibraryParams libraryParams) {
        MediaBrowserCompat mediaBrowserCompatNb = nb();
        if (mediaBrowserCompatNb == null) {
            return LibraryResult.j(-100);
        }
        androidx.concurrent.futures.e eVarN = androidx.concurrent.futures.e.N();
        mediaBrowserCompatNb.l(str, h(libraryParams, i10, i11), new e(eVarN, str));
        return eVarN;
    }

    MediaItem j(@NonNull MediaBrowserCompat mediaBrowserCompat) {
        return new MediaItem.b().c(new MediaMetadata.b().f("android.media.metadata.MEDIA_ID", mediaBrowserCompat.f()).d(MediaMetadata.Y, 0L).d(MediaMetadata.f53003h0, 0L).h(mediaBrowserCompat.c()).a()).a();
    }

    @NonNull
    androidx.media2.session.e o() {
        return (androidx.media2.session.e) this.f58541f;
    }
}
