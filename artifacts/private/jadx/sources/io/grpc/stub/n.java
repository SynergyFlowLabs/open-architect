package io.grpc.stub;

import androidx.constraintlayout.core.motion.utils.v;
import com.google.common.base.j0;
import io.grpc.e0;
import java.util.Iterator;

/* JADX INFO: loaded from: classes13.dex */
@e0("https://github.com/grpc/grpc-java/issues/4694")
@Deprecated
public final class n {

    final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f290969a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f290970b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Iterator f290971c;

        a(e eVar, Iterator it) {
            this.f290970b = eVar;
            this.f290971c = it;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f290969a) {
                return;
            }
            while (this.f290970b.c() && this.f290971c.hasNext()) {
                this.f290970b.onNext(this.f290971c.next());
            }
            if (this.f290971c.hasNext()) {
                return;
            }
            this.f290969a = true;
            this.f290970b.onCompleted();
        }
    }

    public static <V> void a(Iterable<V> iterable, e<V> eVar) {
        j0.F(iterable, "source");
        b(iterable.iterator(), eVar);
    }

    public static <V> void b(Iterator<V> it, e<V> eVar) {
        j0.F(it, "source");
        j0.F(eVar, v.a.M);
        eVar.f(new a(eVar, it));
    }
}
