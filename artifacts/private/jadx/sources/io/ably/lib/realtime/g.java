package io.ably.lib.realtime;

import io.ably.lib.types.r;
import java.util.Iterator;

/* JADX INFO: loaded from: classes13.dex */
public interface g {

    public static class a implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final io.ably.lib.types.i<Void> f287609a;

        public a(io.ably.lib.types.i<Void> iVar) {
            this.f287609a = iVar;
        }

        @Override // io.ably.lib.realtime.g
        public void a(r rVar) {
            this.f287609a.a(rVar);
        }

        @Override // io.ably.lib.realtime.g
        public void onSuccess() {
            this.f287609a.b(null);
        }
    }

    public static class b extends io.ably.lib.util.l<g> implements g {
        public b(g... gVarArr) {
            super(gVarArr);
        }

        @Override // io.ably.lib.realtime.g
        public void a(r rVar) {
            Iterator<g> it = i().iterator();
            while (it.hasNext()) {
                try {
                    it.next().a(rVar);
                } catch (Throwable unused) {
                }
            }
        }

        @Override // io.ably.lib.realtime.g
        public void onSuccess() {
            Iterator<g> it = i().iterator();
            while (it.hasNext()) {
                try {
                    it.next().onSuccess();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static class c implements io.ably.lib.types.i<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private g f287610a;

        public c(g gVar) {
            this.f287610a = gVar;
        }

        @Override // io.ably.lib.types.i
        public void a(r rVar) {
            this.f287610a.a(rVar);
        }

        @Override // io.ably.lib.types.i
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(Void r10) {
            this.f287610a.onSuccess();
        }
    }

    void a(r rVar);

    void onSuccess();
}
