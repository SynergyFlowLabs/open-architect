package androidx.media3.exoplayer.trackselection;

import androidx.annotation.p0;
import androidx.media3.common.b4;
import androidx.media3.common.util.b1;
import androidx.media3.common.z3;
import androidx.media3.exoplayer.source.t0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@b1
public interface c0 extends h0 {

    public static final class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final String f65675d = "ETSDefinition";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b4 f65676a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f65677b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f65678c;

        public a(b4 b4Var, int... iArr) {
            this(b4Var, iArr, 0);
        }

        public a(b4 b4Var, int[] iArr, int i10) {
            if (iArr.length == 0) {
                androidx.media3.common.util.z.e(f65675d, "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.f65676a = b4Var;
            this.f65677b = iArr;
            this.f65678c = i10;
        }
    }

    public interface b {
        c0[] a(a[] aVarArr, androidx.media3.exoplayer.upstream.d dVar, t0.b bVar, z3 z3Var);
    }

    int a();

    void d();

    default void e() {
    }

    void h();

    int i(long j10, List<? extends androidx.media3.exoplayer.source.chunk.m> list);

    int j();

    androidx.media3.common.w k();

    void m(float f10);

    @p0
    Object n();

    int o();

    default long p() {
        return -2147483647L;
    }

    boolean q(int i10, long j10);

    boolean r(int i10, long j10);

    default boolean s(long j10, androidx.media3.exoplayer.source.chunk.e eVar, List<? extends androidx.media3.exoplayer.source.chunk.m> list) {
        return false;
    }

    default void t() {
    }

    void v(long j10, long j11, long j12, List<? extends androidx.media3.exoplayer.source.chunk.m> list, androidx.media3.exoplayer.source.chunk.n[] nVarArr);

    default void w(boolean z10) {
    }
}
