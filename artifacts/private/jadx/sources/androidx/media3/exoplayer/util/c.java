package androidx.media3.exoplayer.util;

import androidx.media3.common.util.b1;
import androidx.media3.common.util.o;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
@b1
public interface c extends Executor {

    class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Executor f66188a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o f66189b;

        a(Executor executor, o oVar) {
            this.f66188a = executor;
            this.f66189b = oVar;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f66188a.execute(runnable);
        }

        @Override // androidx.media3.exoplayer.util.c
        public void release() {
            this.f66189b.accept(this.f66188a);
        }
    }

    static <T extends Executor> c y3(T t10, o<T> oVar) {
        return new a(t10, oVar);
    }

    void release();
}
