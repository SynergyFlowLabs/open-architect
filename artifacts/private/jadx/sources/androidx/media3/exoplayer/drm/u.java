package androidx.media3.exoplayer.drm;

import android.os.Looper;
import androidx.media3.common.util.b1;
import androidx.media3.exoplayer.analytics.j4;

/* JADX INFO: loaded from: classes3.dex */
@b1
public interface u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f63739a = new a();

    class a implements u {
        a() {
        }

        @Override // androidx.media3.exoplayer.drm.u
        public int a(androidx.media3.common.w wVar) {
            return wVar.f61765s != null ? 1 : 0;
        }

        @Override // androidx.media3.exoplayer.drm.u
        public void b(Looper looper, j4 j4Var) {
        }

        @Override // androidx.media3.exoplayer.drm.u
        @androidx.annotation.p0
        public m c(@androidx.annotation.p0 t.a aVar, androidx.media3.common.w wVar) {
            if (wVar.f61765s == null) {
                return null;
            }
            int i10 = 3 ^ 1;
            return new z(new m.a(new w0(1), androidx.media3.common.x0.A3));
        }
    }

    public interface b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f63740a = new b() { // from class: androidx.media3.exoplayer.drm.v
            @Override // androidx.media3.exoplayer.drm.u.b
            public final void release() {
                u.b.a();
            }
        };

        static /* synthetic */ void a() {
        }

        void release();
    }

    default void A() {
    }

    int a(androidx.media3.common.w wVar);

    void b(Looper looper, j4 j4Var);

    @androidx.annotation.p0
    m c(@androidx.annotation.p0 t.a aVar, androidx.media3.common.w wVar);

    default b d(@androidx.annotation.p0 t.a aVar, androidx.media3.common.w wVar) {
        return b.f63740a;
    }

    default void release() {
    }
}
