package androidx.media2.exoplayer.external.drm;

import android.os.Looper;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.drm.t;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public interface r<T extends t> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r<t> f53895a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f53896b = 1;

    class a implements r<t> {
        static {
            q.a();
        }

        a() {
        }

        @Override // androidx.media2.exoplayer.external.drm.r
        public int I() {
            return q.c(this);
        }

        @Override // androidx.media2.exoplayer.external.drm.r
        public boolean c(DrmInitData drmInitData) {
            return false;
        }

        @Override // androidx.media2.exoplayer.external.drm.r
        public p<t> d(Looper playbackLooper, DrmInitData drmInitData) {
            return new s(new p.a(new e0(1)));
        }

        @Override // androidx.media2.exoplayer.external.drm.r
        @p0
        public Class<t> f(DrmInitData drmInitData) {
            return null;
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    int I();

    boolean c(DrmInitData drmInitData);

    p<T> d(Looper playbackLooper, DrmInitData drmInitData);

    @p0
    Class<? extends t> f(DrmInitData drmInitData);
}
