package androidx.media2.exoplayer.external.source;

import android.os.Handler;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
public interface z {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f56507a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f56508b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f56509c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f56510d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f56511e;

        public a(Object periodUid) {
            this(periodUid, -1L);
        }

        public a a(Object newPeriodUid) {
            return this.f56507a.equals(newPeriodUid) ? this : new a(newPeriodUid, this.f56508b, this.f56509c, this.f56510d, this.f56511e);
        }

        public boolean b() {
            return this.f56508b != -1;
        }

        public boolean equals(@androidx.annotation.p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f56507a.equals(aVar.f56507a) && this.f56508b == aVar.f56508b && this.f56509c == aVar.f56509c && this.f56510d == aVar.f56510d && this.f56511e == aVar.f56511e) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((((((((527 + this.f56507a.hashCode()) * 31) + this.f56508b) * 31) + this.f56509c) * 31) + ((int) this.f56510d)) * 31) + this.f56511e;
        }

        public a(Object periodUid, long windowSequenceNumber) {
            this(periodUid, -1, -1, windowSequenceNumber, -1);
        }

        public a(Object periodUid, long windowSequenceNumber, int nextAdGroupIndex) {
            this(periodUid, -1, -1, windowSequenceNumber, nextAdGroupIndex);
        }

        public a(Object periodUid, int adGroupIndex, int adIndexInAdGroup, long windowSequenceNumber) {
            this(periodUid, adGroupIndex, adIndexInAdGroup, windowSequenceNumber, -1);
        }

        private a(Object periodUid, int adGroupIndex, int adIndexInAdGroup, long windowSequenceNumber, int nextAdGroupIndex) {
            this.f56507a = periodUid;
            this.f56508b = adGroupIndex;
            this.f56509c = adIndexInAdGroup;
            this.f56510d = windowSequenceNumber;
            this.f56511e = nextAdGroupIndex;
        }
    }

    public interface b {
        void c(z source, androidx.media2.exoplayer.external.z0 timeline);
    }

    @Deprecated
    public interface c extends b {
        @Override // androidx.media2.exoplayer.external.source.z.b
        void c(z source, androidx.media2.exoplayer.external.z0 timeline);

        @Deprecated
        void e(z source, androidx.media2.exoplayer.external.z0 timeline, Object manifest);
    }

    @androidx.annotation.p0
    Object E();

    void a() throws IOException;

    void b(b caller, @androidx.annotation.p0 androidx.media2.exoplayer.external.upstream.q0 mediaTransferListener);

    void c(x mediaPeriod);

    void d(b caller);

    x e(a id2, androidx.media2.exoplayer.external.upstream.b allocator, long startPositionUs);

    void f(b caller);

    void g(Handler handler, k0 eventListener);

    void i(k0 eventListener);

    void j(b caller);
}
