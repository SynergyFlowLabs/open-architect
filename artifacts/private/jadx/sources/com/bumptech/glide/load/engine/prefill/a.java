package com.bumptech.glide.load.engine.prefill;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import com.bumptech.glide.load.engine.bitmap_recycle.e;
import com.bumptech.glide.load.engine.cache.j;
import com.bumptech.glide.load.g;
import com.bumptech.glide.util.m;
import java.security.MessageDigest;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
final class a implements Runnable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @l1
    static final String f96696i = "PreFillRunner";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final long f96698k = 32;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final long f96699l = 40;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final int f96700m = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f96702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j f96703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f96704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C0862a f96705d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set<d> f96706e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Handler f96707f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f96708g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f96709h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final C0862a f96697j = new C0862a();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final long f96701n = TimeUnit.SECONDS.toMillis(1);

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.prefill.a$a, reason: collision with other inner class name */
    @l1
    static class C0862a {
        C0862a() {
        }

        long a() {
            return SystemClock.currentThreadTimeMillis();
        }
    }

    private static final class b implements g {
        b() {
        }

        @Override // com.bumptech.glide.load.g
        public void b(@NonNull MessageDigest messageDigest) {
            throw new UnsupportedOperationException();
        }
    }

    public a(e eVar, j jVar, c cVar) {
        this(eVar, jVar, cVar, f96697j, new Handler(Looper.getMainLooper()));
    }

    private long c() {
        return this.f96703b.a() - this.f96703b.e();
    }

    private long d() {
        long j10 = this.f96708g;
        this.f96708g = Math.min(4 * j10, f96701n);
        return j10;
    }

    private boolean e(long j10) {
        return this.f96705d.a() - j10 >= 32;
    }

    @l1
    boolean a() {
        Bitmap bitmapCreateBitmap;
        long jA = this.f96705d.a();
        while (!this.f96704c.b() && !e(jA)) {
            d dVarC = this.f96704c.c();
            if (this.f96706e.contains(dVarC)) {
                bitmapCreateBitmap = Bitmap.createBitmap(dVarC.d(), dVarC.b(), dVarC.a());
            } else {
                this.f96706e.add(dVarC);
                bitmapCreateBitmap = this.f96702a.g(dVarC.d(), dVarC.b(), dVarC.a());
            }
            if (c() >= m.h(bitmapCreateBitmap)) {
                this.f96703b.f(new b(), com.bumptech.glide.load.resource.bitmap.g.d(bitmapCreateBitmap, this.f96702a));
            } else {
                this.f96702a.e(bitmapCreateBitmap);
            }
            if (Log.isLoggable(f96696i, 3)) {
                dVarC.d();
                dVarC.b();
                Objects.toString(dVarC.a());
            }
        }
        return (this.f96709h || this.f96704c.b()) ? false : true;
    }

    public void b() {
        this.f96709h = true;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (a()) {
            this.f96707f.postDelayed(this, d());
        }
    }

    @l1
    a(e eVar, j jVar, c cVar, C0862a c0862a, Handler handler) {
        this.f96706e = new HashSet();
        this.f96708g = f96699l;
        this.f96702a = eVar;
        this.f96703b = jVar;
        this.f96704c = cVar;
        this.f96705d = c0862a;
        this.f96707f = handler;
    }
}
