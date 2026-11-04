package androidx.media3.exoplayer.upstream;

import androidx.annotation.p0;
import androidx.media3.common.util.b1;
import androidx.media3.exoplayer.source.d0;
import androidx.media3.exoplayer.source.h0;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
@b1
public interface m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f66111a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f66112b = 2;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f66113a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f66114b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f66115c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f66116d;

        public a(int i10, int i11, int i12, int i13) {
            this.f66113a = i10;
            this.f66114b = i11;
            this.f66115c = i12;
            this.f66116d = i13;
        }

        public boolean a(int i10) {
            if (i10 == 1) {
                return this.f66113a - this.f66114b > 1;
            }
            return this.f66115c - this.f66116d > 1;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f66117a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f66118b;

        public b(int i10, long j10) {
            androidx.media3.common.util.a.a(j10 >= 0);
            this.f66117a = i10;
            this.f66118b = j10;
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d0 f66119a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final h0 f66120b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final IOException f66121c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f66122d;

        public d(d0 d0Var, h0 h0Var, IOException iOException, int i10) {
            this.f66119a = d0Var;
            this.f66120b = h0Var;
            this.f66121c = iOException;
            this.f66122d = i10;
        }
    }

    int a(int i10);

    default void b(long j10) {
    }

    @p0
    b c(a aVar, d dVar);

    long d(d dVar);
}
