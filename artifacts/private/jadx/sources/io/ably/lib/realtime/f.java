package io.ably.lib.realtime;

import io.ably.lib.types.r;
import java.util.Iterator;

/* JADX INFO: loaded from: classes13.dex */
public interface f {

    public static class b implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        e f287607a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        f f287608b;

        b(e eVar, f fVar) {
            this.f287607a = eVar;
            this.f287608b = fVar;
        }

        @Override // io.ably.lib.realtime.f
        public void b(a aVar) {
            if (aVar.f287603b == this.f287607a) {
                this.f287608b.b(aVar);
            }
        }
    }

    public static class c extends io.ably.lib.util.l<f> implements f {
        public c() {
            super(new f[0]);
        }

        @Override // io.ably.lib.realtime.f
        public void b(a aVar) {
            Iterator<f> it = i().iterator();
            while (it.hasNext()) {
                try {
                    it.next().b(aVar);
                } catch (Throwable unused) {
                }
            }
        }
    }

    void b(a aVar);

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f287602a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e f287603b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final e f287604c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final r f287605d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f287606e;

        a(e eVar, e eVar2, r rVar, boolean z10) {
            this.f287602a = eVar.l();
            this.f287603b = eVar;
            this.f287604c = eVar2;
            this.f287605d = rVar;
            this.f287606e = z10;
        }

        static a a(r rVar, boolean z10) {
            return new a(rVar, z10);
        }

        private a(r rVar, boolean z10) {
            this.f287602a = d.update;
            e eVar = e.attached;
            this.f287604c = eVar;
            this.f287603b = eVar;
            this.f287605d = rVar;
            this.f287606e = z10;
        }
    }
}
