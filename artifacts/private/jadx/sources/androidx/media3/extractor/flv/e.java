package androidx.media3.extractor.flv;

import androidx.media3.common.util.o0;
import androidx.media3.common.v0;
import androidx.media3.extractor.u0;

/* JADX INFO: loaded from: classes3.dex */
abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final u0 f67317a;

    public static final class a extends v0 {
        public a(String str) {
            super(str, null, false, 1);
        }
    }

    protected e(u0 u0Var) {
        this.f67317a = u0Var;
    }

    public final boolean a(o0 o0Var, long j10) throws v0 {
        return b(o0Var) && c(o0Var, j10);
    }

    protected abstract boolean b(o0 o0Var) throws v0;

    protected abstract boolean c(o0 o0Var, long j10) throws v0;

    public abstract void d();
}
