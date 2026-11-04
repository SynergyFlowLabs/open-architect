package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.annotation.p0;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.l;
import com.bumptech.glide.util.m;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;

/* JADX INFO: loaded from: classes3.dex */
public class a implements l<ByteBuffer, c> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f97119f = "BufferGifDecoder";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final C0870a f97120g = new C0870a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final b f97121h = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f97122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<ImageHeaderParser> f97123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f97124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C0870a f97125d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.bumptech.glide.load.resource.gif.b f97126e;

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.gif.a$a, reason: collision with other inner class name */
    @l1
    static class C0870a {
        C0870a() {
        }

        com.bumptech.glide.gifdecoder.a a(com.bumptech.glide.gifdecoder.a.InterfaceC0851a interfaceC0851a, com.bumptech.glide.gifdecoder.c cVar, ByteBuffer byteBuffer, int i10) {
            return new com.bumptech.glide.gifdecoder.f(interfaceC0851a, cVar, byteBuffer, i10);
        }
    }

    @l1
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Queue<com.bumptech.glide.gifdecoder.d> f97127a = m.f(0);

        b() {
        }

        synchronized com.bumptech.glide.gifdecoder.d a(ByteBuffer byteBuffer) {
            com.bumptech.glide.gifdecoder.d dVarPoll;
            try {
                dVarPoll = this.f97127a.poll();
                if (dVarPoll == null) {
                    dVarPoll = new com.bumptech.glide.gifdecoder.d();
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return dVarPoll.q(byteBuffer);
        }

        synchronized void b(com.bumptech.glide.gifdecoder.d dVar) {
            try {
                dVar.a();
                this.f97127a.offer(dVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public a(Context context) {
        this(context, com.bumptech.glide.b.d(context).m().g(), com.bumptech.glide.b.d(context).g(), com.bumptech.glide.b.d(context).f());
    }

    @p0
    private e c(ByteBuffer byteBuffer, int i10, int i11, com.bumptech.glide.gifdecoder.d dVar, com.bumptech.glide.load.j jVar) {
        long jB = com.bumptech.glide.util.g.b();
        try {
            com.bumptech.glide.gifdecoder.c cVarD = dVar.d();
            if (cVarD.b() > 0 && cVarD.c() == 0) {
                Bitmap.Config config = jVar.c(i.f97174a) == com.bumptech.glide.load.b.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                com.bumptech.glide.gifdecoder.a aVarA = this.f97125d.a(this.f97126e, cVarD, byteBuffer, e(cVarD, i10, i11));
                aVarA.c(config);
                aVarA.j();
                Bitmap bitmapI = aVarA.i();
                if (bitmapI == null) {
                    return null;
                }
                return new e(new c(this.f97122a, aVarA, com.bumptech.glide.load.resource.c.c(), i10, i11, bitmapI));
            }
            return null;
        } finally {
            if (Log.isLoggable(f97119f, 2)) {
                com.bumptech.glide.util.g.a(jB);
            }
        }
    }

    private static int e(com.bumptech.glide.gifdecoder.c cVar, int i10, int i11) {
        int iMin = Math.min(cVar.a() / i11, cVar.d() / i10);
        int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
        if (Log.isLoggable(f97119f, 2) && iMax > 1) {
            cVar.d();
            cVar.a();
        }
        return iMax;
    }

    @Override // com.bumptech.glide.load.l
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public e b(@NonNull ByteBuffer byteBuffer, int i10, int i11, @NonNull com.bumptech.glide.load.j jVar) {
        com.bumptech.glide.gifdecoder.d dVarA = this.f97124c.a(byteBuffer);
        try {
            e eVarC = c(byteBuffer, i10, i11, dVarA, jVar);
            b bVar = this.f97124c;
            return eVarC;
        } finally {
            this.f97124c.b(dVarA);
        }
    }

    @Override // com.bumptech.glide.load.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean a(@NonNull ByteBuffer byteBuffer, @NonNull com.bumptech.glide.load.j jVar) throws IOException {
        return !((Boolean) jVar.c(i.f97175b)).booleanValue() && com.bumptech.glide.load.f.f(this.f97123b, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    public a(Context context, List<ImageHeaderParser> list, com.bumptech.glide.load.engine.bitmap_recycle.e eVar, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        this(context, list, eVar, bVar, f97121h, f97120g);
    }

    @l1
    a(Context context, List<ImageHeaderParser> list, com.bumptech.glide.load.engine.bitmap_recycle.e eVar, com.bumptech.glide.load.engine.bitmap_recycle.b bVar, b bVar2, C0870a c0870a) {
        this.f97122a = context.getApplicationContext();
        this.f97123b = list;
        this.f97125d = c0870a;
        this.f97126e = new com.bumptech.glide.load.resource.gif.b(eVar, bVar);
        this.f97124c = bVar2;
    }
}
