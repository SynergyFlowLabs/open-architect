package io.ably.lib.realtime;

import io.ably.lib.types.r;
import java.util.Iterator;

/* JADX INFO: loaded from: classes13.dex */
public interface k {

    public static class b implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        j f287644a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        k f287645b;

        b(j jVar, k kVar) {
            this.f287644a = jVar;
            this.f287645b = kVar;
        }

        @Override // io.ably.lib.realtime.k
        public void c(a aVar) {
            if (aVar.f287641c == this.f287644a) {
                this.f287645b.c(aVar);
            }
        }
    }

    public static class c extends io.ably.lib.util.l<k> implements k {
        public c() {
            super(new k[0]);
        }

        @Override // io.ably.lib.realtime.k
        public void c(a aVar) {
            Iterator<k> it = i().iterator();
            while (it.hasNext()) {
                try {
                    it.next().c(aVar);
                } catch (Throwable unused) {
                }
            }
        }
    }

    void c(a aVar);

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f287639a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final j f287640b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final j f287641c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f287642d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final r f287643e;

        public a(j jVar, j jVar2, long j10, r rVar) {
            this.f287639a = jVar2.l();
            this.f287640b = jVar;
            this.f287641c = jVar2;
            this.f287642d = j10;
            this.f287643e = rVar;
        }

        public static a a(r rVar) {
            return new a(rVar);
        }

        private a(r rVar) {
            this.f287639a = i.update;
            j jVar = j.connected;
            this.f287640b = jVar;
            this.f287641c = jVar;
            this.f287642d = 0L;
            this.f287643e = rVar;
        }
    }
}
