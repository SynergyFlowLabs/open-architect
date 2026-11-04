package com.planner5d.library.services.bitmaploader;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.m1;
import androidx.annotation.p0;
import com.android.tools.r8.RecordTag;
import com.planner5d.library.activity.helper.s0;
import com.planner5d.library.services.download.l;
import com.planner5d.library.services.utility.c2;
import com.planner5d.library.services.utility.e0;
import com.planner5d.library.services.utility.i1;
import com.planner5d.library.services.utility.o3;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
@ij.f
public class d {
    public static final int A = 3;
    public static final int B = -3;
    public static final int C = 4;
    public static final int D = -4;
    public static final int E = 5;
    public static final int F = -5;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f224116p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f224117q = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f224118r = 2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f224119s = 4;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f224120t = 5;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f224121u = 7;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f224122v = 10;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f224123w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f224124x = 1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f224125y = 2;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f224126z = -2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.planner5d.library.services.bitmaploader.cache.a f224129c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.planner5d.library.services.bitmaploader.background.b f224131e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Handler f224133g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final c2 f224134h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final i1 f224135i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final g f224136j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ThreadPoolExecutor f224139m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.planner5d.library.services.bitmaploader.g f224140n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Application f224141o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<C1663d> f224127a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<C1663d> f224128b = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f224130d = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Handler f224132f = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AsyncTask[] f224137k = {null, null};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private AsyncTask f224138l = null;

    class a extends AsyncTask {
        a() {
        }

        @Override // android.os.AsyncTask
        protected Object doInBackground(Object[] objects) {
            C1663d c1663d;
            while (true) {
                synchronized (d.this.f224130d) {
                    try {
                        c1663d = d.this.f224127a.isEmpty() ? null : (C1663d) d.this.f224127a.remove(d.this.f224127a.size() - 1);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (c1663d == null) {
                    break;
                }
                d.this.m(c1663d);
            }
            synchronized (d.this.f224130d) {
                for (int i10 = 0; i10 < d.this.f224137k.length; i10++) {
                    try {
                        if (d.this.f224137k[i10] == this) {
                            d.this.f224137k[i10] = null;
                            break;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
            return null;
        }
    }

    class b extends AsyncTask {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(List list) {
            synchronized (d.this.f224130d) {
                try {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((C1663d) it.next()).d();
                    }
                    list.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // android.os.AsyncTask
        protected Object doInBackground(Object[] objects) {
            boolean zIsEmpty;
            final ArrayList arrayList = new ArrayList();
            Runnable runnable = new Runnable() { // from class: com.planner5d.library.services.bitmaploader.e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f224160a.b(arrayList);
                }
            };
            while (true) {
                synchronized (d.this.f224130d) {
                    try {
                        zIsEmpty = arrayList.isEmpty();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (zIsEmpty) {
                    synchronized (d.this.f224130d) {
                        try {
                            if (d.this.f224128b.isEmpty()) {
                                synchronized (d.this.f224130d) {
                                    d.this.f224138l = null;
                                }
                                return null;
                            }
                            arrayList.addAll(d.this.f224128b);
                            d.this.f224128b.clear();
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    d.this.f224132f.post(runnable);
                    o3.c(50L);
                } else {
                    Thread.yield();
                }
            }
        }
    }

    public static final class c extends RecordTag {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f224144a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        private final String f224145b;

        public c(int source, @NonNull String path) {
            this.f224144a = source;
            this.f224145b = path;
        }

        private /* synthetic */ boolean a(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f224144a == cVar.f224144a && Objects.equals(this.f224145b, cVar.f224145b);
        }

        private /* synthetic */ Object[] b() {
            return new Object[]{Integer.valueOf(this.f224144a), this.f224145b};
        }

        @NonNull
        public String c() {
            return this.f224145b;
        }

        public int d() {
            return this.f224144a;
        }

        public final boolean equals(Object o10) {
            return a(o10);
        }

        public final int hashCode() {
            return com.planner5d.library.services.bitmaploader.f.a(this.f224144a, this.f224145b);
        }

        public final String toString() {
            return s0.a(b(), c.class, "a;b");
        }
    }

    public interface f {
        @m1
        C1663d a(com.planner5d.library.services.bitmaploader.target.a target);
    }

    public interface g {
        <T> T a(@NonNull Context context, com.planner5d.library.services.download.g[] uris, @NonNull l<T> loader, @NonNull c2 networkStateUtility, @NonNull i1 internetStateMonitor) throws Throwable;
    }

    @ij.a
    public d(Application application, com.planner5d.library.services.bitmaploader.background.b client, com.planner5d.library.services.bitmaploader.cache.a cache, c2 networkStateUtility, i1 internetStateMonitor, g uriLoader) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3, 6, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque());
        this.f224139m = threadPoolExecutor;
        HandlerThread handlerThread = new HandlerThread("loader_poster");
        handlerThread.start();
        this.f224133g = new Handler(handlerThread.getLooper());
        this.f224129c = cache;
        this.f224131e = client;
        this.f224141o = application;
        this.f224140n = new com.planner5d.library.services.bitmaploader.g(application);
        this.f224134h = networkStateUtility;
        this.f224135i = internetStateMonitor;
        this.f224136j = uriLoader;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @m1
    public void m(final C1663d loadInfo) {
        Bitmap bitmapE = null;
        if (loadInfo.f224149d) {
            loadInfo.c(null, new Exception("Load canceled"));
            u(loadInfo);
            return;
        }
        try {
            e eVar = loadInfo.f224148c;
            String str = eVar.f224155a;
            bitmapE = str != null ? this.f224131e.e(eVar.f224159e, str, eVar.f224157c, eVar.f224158d, loadInfo.f224147b, loadInfo.f224152g) : (Bitmap) this.f224136j.a(this.f224141o, eVar.f224156b, new l() { // from class: com.planner5d.library.services.bitmaploader.c
                @Override // com.planner5d.library.services.download.l
                public final Object a(com.planner5d.library.services.download.g gVar) {
                    return this.f224106a.o(loadInfo, gVar);
                }
            }, this.f224134h, this.f224135i);
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        if (bitmapE != null && loadInfo.f224148c.f224159e != 10) {
            this.f224129c.g(loadInfo.b(), bitmapE);
        }
        loadInfo.c(bitmapE, th);
        u(loadInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bitmap o(C1663d c1663d, com.planner5d.library.services.download.g gVar) throws Throwable {
        com.planner5d.library.services.bitmaploader.background.b bVar = this.f224131e;
        int i10 = c1663d.f224148c.f224159e;
        String strB = gVar.b();
        e eVar = c1663d.f224148c;
        return bVar.e(i10, strB, eVar.f224157c, eVar.f224158d, c1663d.f224147b, c1663d.f224152g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p(C1663d c1663d) {
        synchronized (this.f224130d) {
            try {
                this.f224127a.add(c1663d);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        t();
    }

    private C1663d s(final C1663d loadInfo) {
        loadInfo.f224146a.i(this);
        Bitmap bitmapE = loadInfo.f224147b == 2 ? null : this.f224129c.e(loadInfo.b());
        if (bitmapE == null) {
            this.f224133g.post(new Runnable() { // from class: com.planner5d.library.services.bitmaploader.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f224040a.p(loadInfo);
                }
            });
            return loadInfo;
        }
        loadInfo.c(bitmapE, null);
        if (o3.b()) {
            loadInfo.d();
            return loadInfo;
        }
        u(loadInfo);
        return loadInfo;
    }

    private void t() {
        AsyncTask[] asyncTaskArr;
        synchronized (this.f224130d) {
            int i10 = 6 & 0;
            int i11 = 0;
            while (true) {
                try {
                    asyncTaskArr = this.f224137k;
                    if (i11 >= asyncTaskArr.length || asyncTaskArr[i11] == null) {
                        break;
                        break;
                    }
                    i11++;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (i11 < asyncTaskArr.length && asyncTaskArr[i11] == null) {
                asyncTaskArr[i11] = new a();
                this.f224137k[i11].executeOnExecutor(this.f224139m, new Object[0]);
            }
        }
    }

    private void u(C1663d loadInfo) {
        synchronized (this.f224130d) {
            try {
                if (this.f224138l == null) {
                    b bVar = new b();
                    this.f224138l = bVar;
                    bVar.executeOnExecutor(this.f224139m, new Object[0]);
                }
                this.f224128b.add(loadInfo);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void l(Bitmap bitmap) {
        this.f224129c.d(bitmap);
    }

    @m1
    public boolean n(URL url, @p0 String hash) {
        File fileD = this.f224140n.d(url);
        if (fileD == null || !fileD.isFile()) {
            return false;
        }
        if (hash == null) {
            return true;
        }
        try {
            return hash.equalsIgnoreCase(e0.d(fileD));
        } catch (Throwable unused) {
            return false;
        }
    }

    public C1663d q(int source, String path, int width, int height, com.planner5d.library.services.bitmaploader.target.a target, long cacheExpire, com.planner5d.library.services.bitmaploader.background.postprocess.a postProcess) {
        return s(new C1663d(source, path, width, height, target, cacheExpire, postProcess));
    }

    public C1663d r(int source, com.planner5d.library.services.download.g[] uris, int width, int height, com.planner5d.library.services.bitmaploader.target.a target, long cacheExpire, com.planner5d.library.services.bitmaploader.background.postprocess.a postProcess) {
        return s(new C1663d(source, uris, width, height, target, cacheExpire, postProcess));
    }

    public void v(com.planner5d.library.services.bitmaploader.target.a target) {
        w(target, null);
    }

    public void w(final com.planner5d.library.services.bitmaploader.target.a target, final Throwable throwable) {
        target.i(this);
        if (o3.b()) {
            target.j(null, throwable);
        } else {
            this.f224132f.post(new Runnable() { // from class: com.planner5d.library.services.bitmaploader.a
                @Override // java.lang.Runnable
                public final void run() {
                    target.j(null, throwable);
                }
            });
        }
    }

    private static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f224155a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.planner5d.library.services.download.g[] f224156b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f224157c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f224158d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f224159e;

        e(int source, com.planner5d.library.services.download.g[] uris, int width, int height) {
            this.f224156b = uris;
            this.f224157c = width;
            this.f224158d = height;
            this.f224159e = source;
            this.f224155a = null;
        }

        public boolean equals(Object object) {
            String str;
            if (object instanceof e) {
                e eVar = (e) object;
                if (eVar.f224157c == this.f224157c && eVar.f224158d == this.f224158d && eVar.f224159e == this.f224159e && (((str = eVar.f224155a) == null && this.f224155a == null) || (str != null && str.equals(this.f224155a)))) {
                    com.planner5d.library.services.download.g[] gVarArr = this.f224156b;
                    if (gVarArr == null) {
                        return eVar.f224156b == null;
                    }
                    com.planner5d.library.services.download.g[] gVarArr2 = eVar.f224156b;
                    if (gVarArr2 != null && gVarArr2.length == gVarArr.length) {
                        int i10 = 0;
                        while (true) {
                            com.planner5d.library.services.download.g[] gVarArr3 = this.f224156b;
                            if (i10 >= gVarArr3.length) {
                                return true;
                            }
                            if (!gVarArr3[i10].b().equals(eVar.f224156b[i10].b())) {
                                return false;
                            }
                            i10++;
                        }
                    }
                }
            }
            return false;
        }

        e(int source, String path, int width, int height) {
            this.f224155a = path;
            this.f224157c = width;
            this.f224158d = height;
            this.f224159e = source;
            this.f224156b = null;
        }
    }

    /* JADX INFO: renamed from: com.planner5d.library.services.bitmaploader.d$d, reason: collision with other inner class name */
    public class C1663d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.planner5d.library.services.bitmaploader.target.a f224146a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f224147b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final e f224148c;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final com.planner5d.library.services.bitmaploader.background.postprocess.a f224152g;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f224149d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f224150e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Bitmap f224151f = null;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Throwable f224153h = null;

        C1663d(int source, com.planner5d.library.services.download.g[] uris, int width, int height, com.planner5d.library.services.bitmaploader.target.a target, long cacheExpire, com.planner5d.library.services.bitmaploader.background.postprocess.a postProcess) {
            this.f224146a = target;
            this.f224147b = cacheExpire;
            this.f224152g = postProcess;
            this.f224148c = new e(source, uris, width, height);
        }

        public void a() {
            this.f224149d = true;
        }

        e b() {
            return this.f224148c;
        }

        void c(Bitmap bitmap, Throwable error) {
            synchronized (this) {
                try {
                    this.f224151f = bitmap;
                    if (bitmap == null && error == null) {
                        error = new Exception("Null bitmap");
                    }
                    this.f224153h = error;
                    this.f224150e = true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        void d() {
            synchronized (this) {
                try {
                    if (this.f224150e) {
                        if (this.f224146a.f()) {
                            d.this.f224129c.d(this.f224151f);
                        } else {
                            this.f224146a.j(this.f224151f, this.f224153h);
                        }
                        this.f224151f = null;
                        this.f224153h = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        C1663d(int source, String path, int width, int height, com.planner5d.library.services.bitmaploader.target.a target, long cacheExpire, com.planner5d.library.services.bitmaploader.background.postprocess.a postProcess) {
            int i10 = 2 | 0;
            this.f224146a = target;
            this.f224147b = cacheExpire;
            this.f224152g = postProcess;
            this.f224148c = new e(source, path, width, height);
        }
    }
}
