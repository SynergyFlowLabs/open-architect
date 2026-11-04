package androidx.media2.exoplayer.external.util;

import android.os.Handler;
import androidx.annotation.b1;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class i<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CopyOnWriteArrayList<b<T>> f57567a = new CopyOnWriteArrayList<>();

    public interface a<T> {
        void a(T listener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f57568a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final T f57569b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f57570c;

        public b(Handler handler, T eventListener) {
            this.f57568a = handler;
            this.f57569b = eventListener;
        }

        public void b(final a<T> event) {
            this.f57568a.post(new Runnable(this, event) { // from class: androidx.media2.exoplayer.external.util.j

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final i.b f57572a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final i.a f57573b;

                {
                    this.f57572a = this;
                    this.f57573b = event;
                }

                @Override // java.lang.Runnable
                public void run() {
                    this.f57572a.c(this.f57573b);
                }
            });
        }

        final /* synthetic */ void c(a aVar) {
            if (this.f57570c) {
                return;
            }
            aVar.a(this.f57569b);
        }

        public void d() {
            this.f57570c = true;
        }
    }

    public void a(Handler handler, T eventListener) {
        androidx.media2.exoplayer.external.util.a.a((handler == null || eventListener == null) ? false : true);
        c(eventListener);
        this.f57567a.add(new b<>(handler, eventListener));
    }

    public void b(a<T> event) {
        Iterator<b<T>> it = this.f57567a.iterator();
        while (it.hasNext()) {
            it.next().b(event);
        }
    }

    public void c(T eventListener) {
        for (b<T> bVar : this.f57567a) {
            if (((b) bVar).f57569b == eventListener) {
                bVar.d();
                this.f57567a.remove(bVar);
            }
        }
    }
}
