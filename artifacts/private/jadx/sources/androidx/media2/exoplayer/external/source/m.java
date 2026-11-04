package androidx.media2.exoplayer.external.source;

import android.os.Looper;
import androidx.media2.exoplayer.external.Format;
import androidx.media2.exoplayer.external.drm.DrmInitData;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u0 f56290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.drm.r<?> f56291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.d0 f56292c = new androidx.media2.exoplayer.external.d0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f56293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Format f56294e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.p0
    private androidx.media2.exoplayer.external.drm.p<?> f56295f;

    public m(u0 upstream, androidx.media2.exoplayer.external.drm.r<?> sessionManager) {
        this.f56290a = upstream;
        this.f56291b = sessionManager;
        this.f56293d = (sessionManager.I() & 1) != 0;
    }

    private void c(Format format, androidx.media2.exoplayer.external.d0 outputFormatHolder) {
        outputFormatHolder.f53762c = format;
        Format format2 = this.f56294e;
        DrmInitData drmInitData = format2 != null ? format2.f53108l : null;
        this.f56294e = format;
        if (this.f56291b == androidx.media2.exoplayer.external.drm.r.f53895a) {
            return;
        }
        outputFormatHolder.f53760a = true;
        outputFormatHolder.f53761b = this.f56295f;
        if (androidx.media2.exoplayer.external.util.q0.b(drmInitData, format.f53108l)) {
            return;
        }
        androidx.media2.exoplayer.external.drm.p<?> pVar = this.f56295f;
        DrmInitData drmInitData2 = this.f56294e.f53108l;
        if (drmInitData2 != null) {
            this.f56295f = this.f56291b.d((Looper) androidx.media2.exoplayer.external.util.a.g(Looper.myLooper()), drmInitData2);
        } else {
            this.f56295f = null;
        }
        outputFormatHolder.f53761b = this.f56295f;
        if (pVar != null) {
            pVar.X();
        }
    }

    public boolean a(boolean loadingFinished) {
        int iW = this.f56290a.w();
        if (iW == 0) {
            return loadingFinished;
        }
        if (iW == 1) {
            return true;
        }
        if (iW == 2) {
            return this.f56295f == null || this.f56293d;
        }
        if (iW == 3) {
            return this.f56291b == androidx.media2.exoplayer.external.drm.r.f53895a || ((androidx.media2.exoplayer.external.drm.p) androidx.media2.exoplayer.external.util.a.g(this.f56295f)).getState() == 4;
        }
        throw new IllegalStateException();
    }

    public void b() throws IOException {
        androidx.media2.exoplayer.external.drm.p<?> pVar = this.f56295f;
        if (pVar != null && pVar.getState() == 1) {
            throw ((androidx.media2.exoplayer.external.drm.p.a) androidx.media2.exoplayer.external.util.a.g(this.f56295f.T()));
        }
    }

    public int d(androidx.media2.exoplayer.external.d0 outputFormatHolder, androidx.media2.exoplayer.external.decoder.e buffer, boolean formatRequired, boolean loadingFinished, long decodeOnlyUntilUs) {
        boolean z10;
        boolean z11;
        Format format = this.f56294e;
        boolean z12 = true;
        if (format == null || formatRequired) {
            z10 = true;
            z12 = false;
            z11 = false;
        } else if (this.f56291b == androidx.media2.exoplayer.external.drm.r.f53895a || format.f53108l == null || ((androidx.media2.exoplayer.external.drm.p) androidx.media2.exoplayer.external.util.a.g(this.f56295f)).getState() == 4) {
            z12 = false;
            z10 = false;
            z11 = false;
        } else if (this.f56293d) {
            z11 = true;
            z12 = false;
            z10 = false;
        } else {
            z10 = true;
            z11 = false;
        }
        int iA = this.f56290a.A(this.f56292c, buffer, z10, z11, loadingFinished, decodeOnlyUntilUs);
        if (iA == -5) {
            if (z12 && this.f56294e == this.f56292c.f53762c) {
                return -3;
            }
            c((Format) androidx.media2.exoplayer.external.util.a.g(this.f56292c.f53762c), outputFormatHolder);
        }
        return iA;
    }

    public void e() {
        androidx.media2.exoplayer.external.drm.p<?> pVar = this.f56295f;
        if (pVar != null) {
            pVar.X();
            this.f56295f = null;
        }
    }
}
