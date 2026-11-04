package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.b0;
import androidx.annotation.b1;
import androidx.annotation.m1;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.core.graphics.h0;
import androidx.core.os.q0;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes2.dex */
public class l extends f.d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final b f51258k = new b();

    public static class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f51259a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f51260b;

        public a(long j10) {
            this.f51259a = j10;
        }

        @Override // androidx.emoji2.text.l.d
        public long a() {
            if (this.f51260b == 0) {
                this.f51260b = SystemClock.uptimeMillis();
                return 0L;
            }
            long jUptimeMillis = SystemClock.uptimeMillis() - this.f51260b;
            if (jUptimeMillis > this.f51259a) {
                return -1L;
            }
            return Math.min(Math.max(jUptimeMillis, 1000L), this.f51259a - jUptimeMillis);
        }
    }

    @b1({b1.a.LIBRARY})
    public static class b {
        @p0
        public Typeface a(@NonNull Context context, @NonNull androidx.core.provider.h.c cVar) throws PackageManager.NameNotFoundException {
            return androidx.core.provider.h.a(context, null, new androidx.core.provider.h.c[]{cVar});
        }

        @NonNull
        public androidx.core.provider.h.b b(@NonNull Context context, @NonNull androidx.core.provider.f fVar) throws PackageManager.NameNotFoundException {
            return androidx.core.provider.h.b(context, null, fVar);
        }

        public void c(@NonNull Context context, @NonNull Uri uri, @NonNull ContentObserver contentObserver) {
            context.getContentResolver().registerContentObserver(uri, false, contentObserver);
        }

        public void d(@NonNull Context context, @NonNull ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class c implements f.j {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f51261l = "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        private final Context f51262a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        private final androidx.core.provider.f f51263b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NonNull
        private final b f51264c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NonNull
        private final Object f51265d = new Object();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @b0("mLock")
        @p0
        private Handler f51266e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @b0("mLock")
        @p0
        private Executor f51267f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @b0("mLock")
        @p0
        private ThreadPoolExecutor f51268g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @b0("mLock")
        @p0
        private d f51269h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @b0("mLock")
        @p0
        f.k f51270i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @b0("mLock")
        @p0
        private ContentObserver f51271j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @b0("mLock")
        @p0
        private Runnable f51272k;

        class a extends ContentObserver {
            a(Handler handler) {
                super(handler);
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z10, Uri uri) {
                c.this.d();
            }
        }

        c(@NonNull Context context, @NonNull androidx.core.provider.f fVar, @NonNull b bVar) {
            androidx.core.util.t.m(context, "Context cannot be null");
            androidx.core.util.t.m(fVar, "FontRequest cannot be null");
            this.f51262a = context.getApplicationContext();
            this.f51263b = fVar;
            this.f51264c = bVar;
        }

        private void b() {
            synchronized (this.f51265d) {
                try {
                    this.f51270i = null;
                    ContentObserver contentObserver = this.f51271j;
                    if (contentObserver != null) {
                        this.f51264c.d(this.f51262a, contentObserver);
                        this.f51271j = null;
                    }
                    Handler handler = this.f51266e;
                    if (handler != null) {
                        handler.removeCallbacks(this.f51272k);
                    }
                    this.f51266e = null;
                    ThreadPoolExecutor threadPoolExecutor = this.f51268g;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdown();
                    }
                    this.f51267f = null;
                    this.f51268g = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @m1
        private androidx.core.provider.h.c e() {
            try {
                androidx.core.provider.h.b bVarB = this.f51264c.b(this.f51262a, this.f51263b);
                if (bVarB.e() == 0) {
                    androidx.core.provider.h.c[] cVarArrC = bVarB.c();
                    if (cVarArrC == null || cVarArrC.length == 0) {
                        throw new RuntimeException("fetchFonts failed (empty result)");
                    }
                    return cVarArrC[0];
                }
                throw new RuntimeException("fetchFonts failed (" + bVarB.e() + ")");
            } catch (PackageManager.NameNotFoundException e10) {
                throw new RuntimeException("provider not found", e10);
            }
        }

        @w0(19)
        @m1
        private void f(Uri uri, long j10) {
            synchronized (this.f51265d) {
                try {
                    Handler handlerD = this.f51266e;
                    if (handlerD == null) {
                        handlerD = androidx.emoji2.text.c.d();
                        this.f51266e = handlerD;
                    }
                    if (this.f51271j == null) {
                        a aVar = new a(handlerD);
                        this.f51271j = aVar;
                        this.f51264c.c(this.f51262a, uri, aVar);
                    }
                    if (this.f51272k == null) {
                        this.f51272k = new Runnable() { // from class: androidx.emoji2.text.n
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f51275a.d();
                            }
                        };
                    }
                    handlerD.postDelayed(this.f51272k, j10);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.emoji2.text.f.j
        @w0(19)
        public void a(@NonNull f.k kVar) {
            androidx.core.util.t.m(kVar, "LoaderCallback cannot be null");
            synchronized (this.f51265d) {
                try {
                    this.f51270i = kVar;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            d();
        }

        @w0(19)
        @m1
        void c() {
            synchronized (this.f51265d) {
                try {
                    if (this.f51270i == null) {
                        return;
                    }
                    try {
                        androidx.core.provider.h.c cVarE = e();
                        int iB = cVarE.b();
                        if (iB == 2) {
                            synchronized (this.f51265d) {
                                try {
                                    d dVar = this.f51269h;
                                    if (dVar != null) {
                                        long jA = dVar.a();
                                        if (jA >= 0) {
                                            f(cVarE.d(), jA);
                                            return;
                                        }
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        }
                        if (iB != 0) {
                            throw new RuntimeException("fetchFonts result is not OK. (" + iB + ")");
                        }
                        try {
                            q0.b(f51261l);
                            Typeface typefaceA = this.f51264c.a(this.f51262a, cVarE);
                            ByteBuffer byteBufferF = h0.f(this.f51262a, null, cVarE.d());
                            if (byteBufferF == null || typefaceA == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            p pVarE = p.e(typefaceA, byteBufferF);
                            q0.d();
                            synchronized (this.f51265d) {
                                try {
                                    f.k kVar = this.f51270i;
                                    if (kVar != null) {
                                        kVar.b(pVarE);
                                    }
                                } catch (Throwable th3) {
                                    throw th3;
                                }
                            }
                            b();
                        } catch (Throwable th4) {
                            q0.d();
                            throw th4;
                        }
                    } catch (Throwable th5) {
                        synchronized (this.f51265d) {
                            try {
                                f.k kVar2 = this.f51270i;
                                if (kVar2 != null) {
                                    kVar2.a(th5);
                                }
                                b();
                            } catch (Throwable th6) {
                                throw th6;
                            }
                        }
                    }
                } catch (Throwable th7) {
                    throw th7;
                }
            }
        }

        @w0(19)
        void d() {
            synchronized (this.f51265d) {
                try {
                    if (this.f51270i == null) {
                        return;
                    }
                    if (this.f51267f == null) {
                        ThreadPoolExecutor threadPoolExecutorC = androidx.emoji2.text.c.c("emojiCompat");
                        this.f51268g = threadPoolExecutorC;
                        this.f51267f = threadPoolExecutorC;
                    }
                    this.f51267f.execute(new Runnable() { // from class: androidx.emoji2.text.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f51274a.c();
                        }
                    });
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void g(@NonNull Executor executor) {
            synchronized (this.f51265d) {
                this.f51267f = executor;
            }
        }

        public void h(@p0 d dVar) {
            synchronized (this.f51265d) {
                try {
                    this.f51269h = dVar;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static abstract class d {
        public abstract long a();
    }

    public l(@NonNull Context context, @NonNull androidx.core.provider.f fVar) {
        super(new c(context, fVar, f51258k));
    }

    @NonNull
    @Deprecated
    public l l(@p0 Handler handler) {
        if (handler == null) {
            return this;
        }
        m(androidx.emoji2.text.c.b(handler));
        return this;
    }

    @NonNull
    public l m(@NonNull Executor executor) {
        ((c) a()).g(executor);
        return this;
    }

    @NonNull
    public l n(@p0 d dVar) {
        ((c) a()).h(dVar);
        return this;
    }

    @b1({b1.a.LIBRARY})
    public l(@NonNull Context context, @NonNull androidx.core.provider.f fVar, @NonNull b bVar) {
        super(new c(context, fVar, bVar));
    }
}
