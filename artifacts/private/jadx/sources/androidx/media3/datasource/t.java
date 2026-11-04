package androidx.media3.datasource;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.google.common.util.concurrent.a2;
import com.google.common.util.concurrent.x1;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public final class t implements androidx.media3.common.util.h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final com.google.common.base.s0<x1> f62574e = com.google.common.base.t0.b(new com.google.common.base.s0() { // from class: androidx.media3.datasource.q
        @Override // com.google.common.base.s0
        public final Object get() {
            return a2.j(Executors.newSingleThreadExecutor());
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x1 f62575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p.a f62576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    private final BitmapFactory.Options f62577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f62578d;

    public t(Context context) {
        this((x1) androidx.media3.common.util.a.k(f62574e.get()), new y.a(context));
    }

    public static /* synthetic */ Bitmap e(t tVar, byte[] bArr) {
        tVar.getClass();
        return f.a(bArr, bArr.length, tVar.f62577c, tVar.f62578d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bitmap h(p pVar, Uri uri, @androidx.annotation.p0 BitmapFactory.Options options, int i10) throws IOException {
        try {
            pVar.c(new x(uri));
            byte[] bArrC = w.c(pVar);
            return f.a(bArrC, bArrC.length, options, i10);
        } finally {
            pVar.close();
        }
    }

    @Override // androidx.media3.common.util.h
    public com.google.common.util.concurrent.t1<Bitmap> a(final byte[] bArr) {
        return this.f62575a.submit(new Callable() { // from class: androidx.media3.datasource.r
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return t.e(this.f62558a, bArr);
            }
        });
    }

    @Override // androidx.media3.common.util.h
    public boolean b(String str) {
        return androidx.media3.common.util.k1.f1(str);
    }

    @Override // androidx.media3.common.util.h
    public com.google.common.util.concurrent.t1<Bitmap> d(final Uri uri) {
        return this.f62575a.submit(new Callable() { // from class: androidx.media3.datasource.s
            @Override // java.util.concurrent.Callable
            public final Object call() {
                t tVar = this.f62560a;
                return t.h(tVar.f62576b.a(), uri, tVar.f62577c, tVar.f62578d);
            }
        });
    }

    public t(x1 x1Var, p.a aVar) {
        this(x1Var, aVar, null);
    }

    public t(x1 x1Var, p.a aVar, @androidx.annotation.p0 BitmapFactory.Options options) {
        this(x1Var, aVar, options, -1);
    }

    public t(x1 x1Var, p.a aVar, @androidx.annotation.p0 BitmapFactory.Options options, int i10) {
        this.f62575a = x1Var;
        this.f62576b = aVar;
        this.f62577c = options;
        this.f62578d = i10;
    }
}
