package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class k implements e {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f96412k = "LruBitmapPool";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Bitmap.Config f96413l = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f96414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<Bitmap.Config> f96415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f96416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f96417d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f96418e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f96419f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f96420g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f96421h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f96422i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f96423j;

    private interface a {
        void a(Bitmap bitmap);

        void b(Bitmap bitmap);
    }

    private static final class b implements a {
        b() {
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.k.a
        public void a(Bitmap bitmap) {
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.k.a
        public void b(Bitmap bitmap) {
        }
    }

    private static class c implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set<Bitmap> f96424a = Collections.synchronizedSet(new HashSet());

        private c() {
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.k.a
        public void a(Bitmap bitmap) {
            if (!this.f96424a.contains(bitmap)) {
                this.f96424a.add(bitmap);
                return;
            }
            throw new IllegalStateException("Can't add already added bitmap: " + bitmap + " [" + bitmap.getWidth() + "x" + bitmap.getHeight() + "]");
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.k.a
        public void b(Bitmap bitmap) {
            if (!this.f96424a.contains(bitmap)) {
                throw new IllegalStateException("Cannot remove bitmap not in tracker");
            }
            this.f96424a.remove(bitmap);
        }
    }

    k(long j10, l lVar, Set<Bitmap.Config> set) {
        this.f96416c = j10;
        this.f96418e = j10;
        this.f96414a = lVar;
        this.f96415b = set;
        this.f96417d = new b();
    }

    @e.b(26)
    private static void h(Bitmap.Config config) {
        if (config != Bitmap.Config.HARDWARE) {
            return;
        }
        throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
    }

    @NonNull
    private static Bitmap i(int i10, int i11, @p0 Bitmap.Config config) {
        if (config == null) {
            config = f96413l;
        }
        return Bitmap.createBitmap(i10, i11, config);
    }

    private void j() {
        if (Log.isLoggable(f96412k, 2)) {
            k();
        }
    }

    private void k() {
        Objects.toString(this.f96414a);
    }

    private void l() {
        v(this.f96418e);
    }

    @e.b(26)
    private static Set<Bitmap.Config> o() {
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        hashSet.add(null);
        hashSet.remove(Bitmap.Config.HARDWARE);
        return Collections.unmodifiableSet(hashSet);
    }

    private static l p() {
        return new o();
    }

    @p0
    private synchronized Bitmap q(int i10, int i11, @p0 Bitmap.Config config) {
        Bitmap bitmapF;
        try {
            h(config);
            bitmapF = this.f96414a.f(i10, i11, config != null ? config : f96413l);
            if (bitmapF == null) {
                if (Log.isLoggable(f96412k, 3)) {
                    this.f96414a.a(i10, i11, config);
                }
                this.f96421h++;
            } else {
                this.f96420g++;
                this.f96419f -= (long) this.f96414a.b(bitmapF);
                this.f96417d.b(bitmapF);
                u(bitmapF);
            }
            if (Log.isLoggable(f96412k, 2)) {
                this.f96414a.a(i10, i11, config);
            }
            j();
        } catch (Throwable th2) {
            throw th2;
        }
        return bitmapF;
    }

    @e.b(19)
    private static void s(Bitmap bitmap) {
        bitmap.setPremultiplied(true);
    }

    private static void u(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        s(bitmap);
    }

    private synchronized void v(long j10) {
        while (this.f96419f > j10) {
            try {
                Bitmap bitmapRemoveLast = this.f96414a.removeLast();
                if (bitmapRemoveLast == null) {
                    if (Log.isLoggable(f96412k, 5)) {
                        k();
                    }
                    this.f96419f = 0L;
                    return;
                }
                this.f96417d.b(bitmapRemoveLast);
                this.f96419f -= (long) this.f96414a.b(bitmapRemoveLast);
                this.f96423j++;
                int i10 = 7 | 3;
                if (Log.isLoggable(f96412k, 3)) {
                    this.f96414a.c(bitmapRemoveLast);
                }
                j();
                bitmapRemoveLast.recycle();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    public long a() {
        return this.f96418e;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    @e.a({"InlinedApi"})
    public void b(int i10) {
        if (i10 < 40 && i10 < 20) {
            if (i10 < 20 && i10 != 15) {
                return;
            }
            v(a() / 2);
            return;
        }
        c();
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    public void c() {
        v(0L);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    public synchronized void d(float f10) {
        try {
            this.f96418e = Math.round(this.f96416c * f10);
            l();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    public synchronized void e(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable() && this.f96414a.b(bitmap) <= this.f96418e && this.f96415b.contains(bitmap.getConfig())) {
                int iB = this.f96414a.b(bitmap);
                this.f96414a.e(bitmap);
                this.f96417d.a(bitmap);
                this.f96422i++;
                this.f96419f += (long) iB;
                if (Log.isLoggable(f96412k, 2)) {
                    this.f96414a.c(bitmap);
                }
                j();
                l();
                return;
            }
            if (Log.isLoggable(f96412k, 2)) {
                this.f96414a.c(bitmap);
                bitmap.isMutable();
                this.f96415b.contains(bitmap.getConfig());
            }
            bitmap.recycle();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    @NonNull
    public Bitmap f(int i10, int i11, Bitmap.Config config) {
        Bitmap bitmapQ = q(i10, i11, config);
        if (bitmapQ == null) {
            return i(i10, i11, config);
        }
        bitmapQ.eraseColor(0);
        return bitmapQ;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    @NonNull
    public Bitmap g(int i10, int i11, Bitmap.Config config) {
        Bitmap bitmapQ = q(i10, i11, config);
        return bitmapQ == null ? i(i10, i11, config) : bitmapQ;
    }

    public long m() {
        return this.f96423j;
    }

    public long n() {
        return this.f96419f;
    }

    public long r() {
        return this.f96420g;
    }

    public long t() {
        return this.f96421h;
    }

    public k(long j10) {
        this(j10, p(), o());
    }

    public k(long j10, Set<Bitmap.Config> set) {
        this(j10, p(), set);
    }
}
