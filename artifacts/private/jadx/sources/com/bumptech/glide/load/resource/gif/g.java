package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.annotation.p0;
import com.bumptech.glide.k;
import com.bumptech.glide.l;
import com.bumptech.glide.load.n;
import com.bumptech.glide.util.m;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.gifdecoder.a f97147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f97148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<b> f97149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final l f97150d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.e f97151e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f97152f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f97153g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f97154h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private k<Bitmap> f97155i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private a f97156j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f97157k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private a f97158l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Bitmap f97159m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private n<Bitmap> f97160n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private a f97161o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @p0
    private d f97162p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f97163q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f97164r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f97165s;

    @l1
    static class a extends com.bumptech.glide.request.target.e<Bitmap> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Handler f97166d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f97167e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final long f97168f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Bitmap f97169g;

        a(Handler handler, int i10, long j10) {
            this.f97166d = handler;
            this.f97167e = i10;
            this.f97168f = j10;
        }

        Bitmap c() {
            return this.f97169g;
        }

        @Override // com.bumptech.glide.request.target.p
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void i(@NonNull Bitmap bitmap, @p0 com.bumptech.glide.request.transition.f<? super Bitmap> fVar) {
            this.f97169g = bitmap;
            this.f97166d.sendMessageAtTime(this.f97166d.obtainMessage(1, this), this.f97168f);
        }

        @Override // com.bumptech.glide.request.target.p
        public void h(@p0 Drawable drawable) {
            this.f97169g = null;
        }
    }

    public interface b {
        void a();
    }

    private class c implements Handler.Callback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final int f97170b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final int f97171c = 2;

        c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                g.this.o((a) message.obj);
                return true;
            }
            if (i10 != 2) {
                return false;
            }
            g.this.f97150d.B((a) message.obj);
            return false;
        }
    }

    @l1
    interface d {
        void a();
    }

    g(com.bumptech.glide.b bVar, com.bumptech.glide.gifdecoder.a aVar, int i10, int i11, n<Bitmap> nVar, Bitmap bitmap) {
        this(bVar.g(), com.bumptech.glide.b.D(bVar.i()), aVar, null, k(com.bumptech.glide.b.D(bVar.i()), i10, i11), nVar, bitmap);
    }

    private static com.bumptech.glide.load.g g() {
        return new com.bumptech.glide.signature.e(Double.valueOf(Math.random()));
    }

    private static k<Bitmap> k(l lVar, int i10, int i11) {
        return lVar.w().a(com.bumptech.glide.request.h.a1(com.bumptech.glide.load.engine.j.f96620b).T0(true).J0(true).y0(i10, i11));
    }

    private void n() {
        if (this.f97152f && !this.f97153g) {
            if (this.f97154h) {
                com.bumptech.glide.util.k.a(this.f97161o == null, "Pending target must be null when starting from the first frame");
                this.f97147a.f();
                this.f97154h = false;
            }
            a aVar = this.f97161o;
            if (aVar != null) {
                this.f97161o = null;
                o(aVar);
            } else {
                this.f97153g = true;
                long jUptimeMillis = SystemClock.uptimeMillis() + ((long) this.f97147a.m());
                this.f97147a.j();
                this.f97158l = new a(this.f97148b, this.f97147a.g(), jUptimeMillis);
                this.f97155i.a(com.bumptech.glide.request.h.s1(g())).j(this.f97147a).i1(this.f97158l);
            }
        }
    }

    private void p() {
        Bitmap bitmap = this.f97159m;
        if (bitmap != null) {
            this.f97151e.e(bitmap);
            this.f97159m = null;
        }
    }

    private void t() {
        if (this.f97152f) {
            return;
        }
        this.f97152f = true;
        this.f97157k = false;
        n();
    }

    private void u() {
        this.f97152f = false;
    }

    void a() {
        this.f97149c.clear();
        p();
        u();
        a aVar = this.f97156j;
        if (aVar != null) {
            this.f97150d.B(aVar);
            this.f97156j = null;
        }
        a aVar2 = this.f97158l;
        if (aVar2 != null) {
            this.f97150d.B(aVar2);
            this.f97158l = null;
        }
        a aVar3 = this.f97161o;
        if (aVar3 != null) {
            this.f97150d.B(aVar3);
            this.f97161o = null;
        }
        this.f97147a.clear();
        this.f97157k = true;
    }

    ByteBuffer b() {
        return this.f97147a.getData().asReadOnlyBuffer();
    }

    Bitmap c() {
        a aVar = this.f97156j;
        return aVar != null ? aVar.c() : this.f97159m;
    }

    int d() {
        a aVar = this.f97156j;
        if (aVar != null) {
            return aVar.f97167e;
        }
        return -1;
    }

    Bitmap e() {
        return this.f97159m;
    }

    int f() {
        return this.f97147a.k();
    }

    n<Bitmap> h() {
        return this.f97160n;
    }

    int i() {
        return this.f97165s;
    }

    int j() {
        return this.f97147a.l();
    }

    int l() {
        return this.f97147a.h() + this.f97163q;
    }

    int m() {
        return this.f97164r;
    }

    @l1
    void o(a aVar) {
        d dVar = this.f97162p;
        if (dVar != null) {
            dVar.a();
        }
        this.f97153g = false;
        if (this.f97157k) {
            this.f97148b.obtainMessage(2, aVar).sendToTarget();
            return;
        }
        if (!this.f97152f) {
            this.f97161o = aVar;
            return;
        }
        if (aVar.c() != null) {
            p();
            a aVar2 = this.f97156j;
            this.f97156j = aVar;
            int size = this.f97149c.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    this.f97149c.get(size).a();
                }
            }
            if (aVar2 != null) {
                this.f97148b.obtainMessage(2, aVar2).sendToTarget();
            }
        }
        n();
    }

    void q(n<Bitmap> nVar, Bitmap bitmap) {
        this.f97160n = (n) com.bumptech.glide.util.k.d(nVar);
        this.f97159m = (Bitmap) com.bumptech.glide.util.k.d(bitmap);
        this.f97155i = this.f97155i.a(new com.bumptech.glide.request.h().M0(nVar));
        this.f97163q = m.h(bitmap);
        this.f97164r = bitmap.getWidth();
        this.f97165s = bitmap.getHeight();
    }

    void r() {
        com.bumptech.glide.util.k.a(!this.f97152f, "Can't restart a running animation");
        this.f97154h = true;
        a aVar = this.f97161o;
        if (aVar != null) {
            this.f97150d.B(aVar);
            this.f97161o = null;
        }
    }

    @l1
    void s(@p0 d dVar) {
        this.f97162p = dVar;
    }

    void v(b bVar) {
        if (this.f97157k) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        if (this.f97149c.contains(bVar)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean zIsEmpty = this.f97149c.isEmpty();
        this.f97149c.add(bVar);
        if (zIsEmpty) {
            t();
        }
    }

    void w(b bVar) {
        this.f97149c.remove(bVar);
        if (this.f97149c.isEmpty()) {
            u();
        }
    }

    g(com.bumptech.glide.load.engine.bitmap_recycle.e eVar, l lVar, com.bumptech.glide.gifdecoder.a aVar, Handler handler, k<Bitmap> kVar, n<Bitmap> nVar, Bitmap bitmap) {
        this.f97149c = new ArrayList();
        this.f97150d = lVar;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new c()) : handler;
        this.f97151e = eVar;
        this.f97148b = handler;
        this.f97155i = kVar;
        this.f97147a = aVar;
        q(nVar, bitmap);
    }
}
