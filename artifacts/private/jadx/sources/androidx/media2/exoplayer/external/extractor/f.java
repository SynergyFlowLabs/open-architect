package androidx.media2.exoplayer.external.extractor;

import androidx.annotation.b1;
import androidx.media2.exoplayer.external.extractor.ts.g0;
import androidx.media2.exoplayer.external.extractor.ts.y;
import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class f implements l {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Constructor<? extends i> f54008j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f54009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f54010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f54011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f54012d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f54013e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f54014f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f54015g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f54016h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f54017i;

    static {
        Constructor<? extends i> constructor = null;
        try {
            constructor = Class.forName("androidx.media2.exoplayer.external.ext.flac.FlacExtractor").asSubclass(i.class).getConstructor(null);
        } catch (ClassNotFoundException unused) {
        } catch (Exception e10) {
            throw new RuntimeException("Error instantiating FLAC extension", e10);
        }
        f54008j = constructor;
    }

    public synchronized f a(int flags) {
        this.f54010b = flags;
        return this;
    }

    public synchronized f b(int flags) {
        this.f54011c = flags;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media2.exoplayer.external.extractor.l
    public synchronized i[] c() {
        i[] iVarArr;
        try {
            Constructor<? extends i> constructor = f54008j;
            iVarArr = new i[constructor == null ? 13 : 14];
            iVarArr[0] = new androidx.media2.exoplayer.external.extractor.mkv.e(this.f54012d);
            iVarArr[1] = new androidx.media2.exoplayer.external.extractor.mp4.f(this.f54014f);
            iVarArr[2] = new androidx.media2.exoplayer.external.extractor.mp4.i(this.f54013e);
            iVarArr[3] = new androidx.media2.exoplayer.external.extractor.mp3.e((this.f54015g | (this.f54009a ? 1 : 0)) == true ? 1 : 0);
            iVarArr[4] = new androidx.media2.exoplayer.external.extractor.ts.h((this.f54010b | (this.f54009a ? 1 : 0)) == true ? 1 : 0);
            iVarArr[5] = new androidx.media2.exoplayer.external.extractor.ts.b();
            iVarArr[6] = new g0(this.f54016h, this.f54017i);
            boolean z10 = 0 & 7;
            iVarArr[7] = new androidx.media2.exoplayer.external.extractor.flv.c();
            iVarArr[8] = new androidx.media2.exoplayer.external.extractor.ogg.d();
            iVarArr[9] = new y();
            iVarArr[10] = new androidx.media2.exoplayer.external.extractor.wav.b();
            iVarArr[11] = new androidx.media2.exoplayer.external.extractor.amr.b((this.f54011c | (this.f54009a ? 1 : 0)) == true ? 1 : 0);
            iVarArr[12] = new androidx.media2.exoplayer.external.extractor.ts.e();
            if (constructor != null) {
                try {
                    iVarArr[13] = constructor.newInstance(null);
                } catch (Exception e10) {
                    throw new IllegalStateException("Unexpected error creating FLAC extractor", e10);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return iVarArr;
    }

    public synchronized f d(boolean constantBitrateSeekingEnabled) {
        try {
            this.f54009a = constantBitrateSeekingEnabled;
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public synchronized f e(int flags) {
        try {
            this.f54014f = flags;
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public synchronized f f(int flags) {
        this.f54012d = flags;
        return this;
    }

    public synchronized f g(int flags) {
        this.f54015g = flags;
        return this;
    }

    public synchronized f h(int flags) {
        try {
            this.f54013e = flags;
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public synchronized f i(int flags) {
        try {
            this.f54017i = flags;
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public synchronized f j(int mode) {
        try {
            this.f54016h = mode;
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }
}
