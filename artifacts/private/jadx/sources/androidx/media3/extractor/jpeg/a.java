package androidx.media3.extractor.jpeg;

import androidx.media3.common.util.b1;
import androidx.media3.extractor.n0;
import androidx.media3.extractor.r;
import androidx.media3.extractor.r0;
import androidx.media3.extractor.s;
import androidx.media3.extractor.t;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class a implements r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f67381e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f67382f = 65496;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f67383g = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final r f67384d;

    /* JADX INFO: renamed from: androidx.media3.extractor.jpeg.a$a, reason: collision with other inner class name */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC0606a {
    }

    public a() {
        this(0);
    }

    @Override // androidx.media3.extractor.r
    public void a(long j10, long j11) {
        this.f67384d.a(j10, j11);
    }

    @Override // androidx.media3.extractor.r
    public int f(s sVar, n0 n0Var) throws IOException {
        return this.f67384d.f(sVar, n0Var);
    }

    @Override // androidx.media3.extractor.r
    public boolean g(s sVar) throws IOException {
        return this.f67384d.g(sVar);
    }

    @Override // androidx.media3.extractor.r
    public void h(t tVar) {
        this.f67384d.h(tVar);
    }

    @Override // androidx.media3.extractor.r
    public void release() {
        this.f67384d.release();
    }

    public a(int i10) {
        if ((i10 & 1) != 0) {
            this.f67384d = new r0(f67382f, 2, "image/jpeg");
        } else {
            this.f67384d = new b();
        }
    }
}
