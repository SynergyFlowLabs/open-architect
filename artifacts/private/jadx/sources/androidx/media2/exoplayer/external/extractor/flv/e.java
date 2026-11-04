package androidx.media2.exoplayer.external.extractor.flv;

import androidx.annotation.b1;
import androidx.media2.exoplayer.external.extractor.s;
import androidx.media2.exoplayer.external.k0;
import androidx.media2.exoplayer.external.util.x;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final s f54063a;

    public static final class a extends k0 {
        public a(String msg) {
            super(msg);
        }
    }

    protected e(s output) {
        this.f54063a = output;
    }

    public final boolean a(x data, long timeUs) throws k0 {
        return b(data) && c(data, timeUs);
    }

    protected abstract boolean b(x data) throws k0;

    protected abstract boolean c(x data, long timeUs) throws k0;

    public abstract void d();
}
