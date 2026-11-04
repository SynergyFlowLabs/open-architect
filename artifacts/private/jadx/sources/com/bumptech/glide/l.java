package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.b0;
import androidx.annotation.p0;
import androidx.annotation.u0;
import androidx.annotation.v;
import com.bumptech.glide.manager.n;
import com.bumptech.glide.manager.p;
import java.io.File;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class l implements ComponentCallbacks2, com.bumptech.glide.manager.i, g<k<Drawable>> {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final com.bumptech.glide.request.h f96271m = com.bumptech.glide.request.h.Z0(Bitmap.class).n0();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final com.bumptech.glide.request.h f96272n = com.bumptech.glide.request.h.Z0(com.bumptech.glide.load.resource.gif.c.class).n0();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final com.bumptech.glide.request.h f96273o = com.bumptech.glide.request.h.a1(com.bumptech.glide.load.engine.j.f96621c).B0(h.LOW).J0(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final com.bumptech.glide.b f96274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Context f96275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final com.bumptech.glide.manager.h f96276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @b0("this")
    private final n f96277d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @b0("this")
    private final com.bumptech.glide.manager.m f96278e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @b0("this")
    private final p f96279f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Runnable f96280g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Handler f96281h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.bumptech.glide.manager.c f96282i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final CopyOnWriteArrayList<com.bumptech.glide.request.g<Object>> f96283j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @b0("this")
    private com.bumptech.glide.request.h f96284k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f96285l;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l lVar = l.this;
            lVar.f96276c.b(lVar);
        }
    }

    private static class b extends com.bumptech.glide.request.target.f<View, Object> {
        b(@NonNull View view) {
            super(view);
        }

        @Override // com.bumptech.glide.request.target.p
        public void i(@NonNull Object obj, @p0 com.bumptech.glide.request.transition.f<? super Object> fVar) {
        }

        @Override // com.bumptech.glide.request.target.f
        protected void k(@p0 Drawable drawable) {
        }

        @Override // com.bumptech.glide.request.target.p
        public void q(@p0 Drawable drawable) {
        }
    }

    private class c implements com.bumptech.glide.manager.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @b0("RequestManager.this")
        private final n f96287a;

        c(n nVar) {
            this.f96287a = nVar;
        }

        @Override // com.bumptech.glide.manager.c.a
        public void a(boolean z10) {
            if (z10) {
                synchronized (l.this) {
                    try {
                        this.f96287a.g();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    public l(@NonNull com.bumptech.glide.b bVar, @NonNull com.bumptech.glide.manager.h hVar, @NonNull com.bumptech.glide.manager.m mVar, @NonNull Context context) {
        this(bVar, hVar, mVar, new n(), bVar.h(), context);
    }

    private void c0(@NonNull com.bumptech.glide.request.target.p<?> pVar) {
        boolean zB0 = b0(pVar);
        com.bumptech.glide.request.d request = pVar.getRequest();
        if (zB0 || this.f96274a.v(pVar) || request == null) {
            return;
        }
        pVar.p(null);
        request.clear();
    }

    private synchronized void d0(@NonNull com.bumptech.glide.request.h hVar) {
        this.f96284k = this.f96284k.a(hVar);
    }

    public void A(@NonNull View view) {
        B(new b(view));
    }

    public void B(@p0 com.bumptech.glide.request.target.p<?> pVar) {
        if (pVar == null) {
            return;
        }
        c0(pVar);
    }

    @NonNull
    @androidx.annotation.j
    public k<File> C(@p0 Object obj) {
        return D().j(obj);
    }

    @NonNull
    @androidx.annotation.j
    public k<File> D() {
        return v(File.class).a(f96273o);
    }

    List<com.bumptech.glide.request.g<Object>> E() {
        return this.f96283j;
    }

    synchronized com.bumptech.glide.request.h F() {
        return this.f96284k;
    }

    @NonNull
    <T> m<?, T> G(Class<T> cls) {
        return this.f96274a.j().e(cls);
    }

    public synchronized boolean H() {
        return this.f96277d.d();
    }

    @Override // com.bumptech.glide.g
    @NonNull
    @androidx.annotation.j
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public k<Drawable> o(@p0 Bitmap bitmap) {
        return x().o(bitmap);
    }

    @Override // com.bumptech.glide.g
    @NonNull
    @androidx.annotation.j
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public k<Drawable> g(@p0 Drawable drawable) {
        return x().g(drawable);
    }

    @Override // com.bumptech.glide.g
    @NonNull
    @androidx.annotation.j
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public k<Drawable> k(@p0 Uri uri) {
        return x().k(uri);
    }

    @Override // com.bumptech.glide.g
    @NonNull
    @androidx.annotation.j
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public k<Drawable> f(@p0 File file) {
        return x().f(file);
    }

    @Override // com.bumptech.glide.g
    @NonNull
    @androidx.annotation.j
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public k<Drawable> r(@u0 @v @p0 Integer num) {
        return x().r(num);
    }

    @Override // com.bumptech.glide.g
    @NonNull
    @androidx.annotation.j
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public k<Drawable> j(@p0 Object obj) {
        return x().j(obj);
    }

    @Override // com.bumptech.glide.g
    @NonNull
    @androidx.annotation.j
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public k<Drawable> c(@p0 String str) {
        return x().c(str);
    }

    @Override // com.bumptech.glide.g
    @androidx.annotation.j
    @Deprecated
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public k<Drawable> e(@p0 URL url) {
        return x().e(url);
    }

    @Override // com.bumptech.glide.g
    @NonNull
    @androidx.annotation.j
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public k<Drawable> l(@p0 byte[] bArr) {
        return x().l(bArr);
    }

    public synchronized void R() {
        try {
            this.f96277d.e();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void S() {
        R();
        Iterator<l> it = this.f96278e.a().iterator();
        while (it.hasNext()) {
            it.next().R();
        }
    }

    public synchronized void T() {
        this.f96277d.f();
    }

    public synchronized void U() {
        T();
        Iterator<l> it = this.f96278e.a().iterator();
        while (it.hasNext()) {
            it.next().T();
        }
    }

    public synchronized void V() {
        this.f96277d.h();
    }

    public synchronized void W() {
        try {
            com.bumptech.glide.util.m.b();
            V();
            Iterator<l> it = this.f96278e.a().iterator();
            while (it.hasNext()) {
                it.next().V();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @NonNull
    public synchronized l X(@NonNull com.bumptech.glide.request.h hVar) {
        try {
            Z(hVar);
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public void Y(boolean z10) {
        this.f96285l = z10;
    }

    protected synchronized void Z(@NonNull com.bumptech.glide.request.h hVar) {
        try {
            this.f96284k = hVar.n().b();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.bumptech.glide.manager.i
    public synchronized void a() {
        try {
            T();
            this.f96279f.a();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    synchronized void a0(@NonNull com.bumptech.glide.request.target.p<?> pVar, @NonNull com.bumptech.glide.request.d dVar) {
        try {
            this.f96279f.f(pVar);
            this.f96277d.i(dVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.bumptech.glide.manager.i
    public synchronized void b() {
        try {
            this.f96279f.b();
            Iterator<com.bumptech.glide.request.target.p<?>> it = this.f96279f.e().iterator();
            while (it.hasNext()) {
                B(it.next());
            }
            this.f96279f.c();
            this.f96277d.c();
            this.f96276c.a(this);
            this.f96276c.a(this.f96282i);
            this.f96281h.removeCallbacks(this.f96280g);
            this.f96274a.A(this);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    synchronized boolean b0(@NonNull com.bumptech.glide.request.target.p<?> pVar) {
        try {
            com.bumptech.glide.request.d request = pVar.getRequest();
            if (request == null) {
                return true;
            }
            if (!this.f96277d.b(request)) {
                return false;
            }
            this.f96279f.g(pVar);
            pVar.p(null);
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.bumptech.glide.manager.i
    public synchronized void m() {
        try {
            V();
            this.f96279f.m();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        if (i10 == 60 && this.f96285l) {
            S();
        }
    }

    public l t(com.bumptech.glide.request.g<Object> gVar) {
        this.f96283j.add(gVar);
        return this;
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f96277d + ", treeNode=" + this.f96278e + "}";
    }

    @NonNull
    public synchronized l u(@NonNull com.bumptech.glide.request.h hVar) {
        try {
            d0(hVar);
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    @NonNull
    @androidx.annotation.j
    public <ResourceType> k<ResourceType> v(@NonNull Class<ResourceType> cls) {
        return new k<>(this.f96274a, this, cls, this.f96275b);
    }

    @NonNull
    @androidx.annotation.j
    public k<Bitmap> w() {
        return v(Bitmap.class).a(f96271m);
    }

    @NonNull
    @androidx.annotation.j
    public k<Drawable> x() {
        return v(Drawable.class);
    }

    @NonNull
    @androidx.annotation.j
    public k<File> y() {
        return v(File.class).a(com.bumptech.glide.request.h.u1(true));
    }

    @NonNull
    @androidx.annotation.j
    public k<com.bumptech.glide.load.resource.gif.c> z() {
        return v(com.bumptech.glide.load.resource.gif.c.class).a(f96272n);
    }

    l(com.bumptech.glide.b bVar, com.bumptech.glide.manager.h hVar, com.bumptech.glide.manager.m mVar, n nVar, com.bumptech.glide.manager.d dVar, Context context) {
        this.f96279f = new p();
        a aVar = new a();
        this.f96280g = aVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.f96281h = handler;
        this.f96274a = bVar;
        this.f96276c = hVar;
        this.f96278e = mVar;
        this.f96277d = nVar;
        this.f96275b = context;
        com.bumptech.glide.manager.c cVarA = dVar.a(context.getApplicationContext(), new c(nVar));
        this.f96282i = cVarA;
        if (com.bumptech.glide.util.m.s()) {
            handler.post(aVar);
        } else {
            hVar.b(this);
        }
        hVar.b(cVarA);
        this.f96283j = new CopyOnWriteArrayList<>(bVar.j().c());
        Z(bVar.j().d());
        bVar.u(this);
    }
}
