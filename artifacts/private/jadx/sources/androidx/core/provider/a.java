package androidx.core.provider;

import android.graphics.Typeface;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final h.d f48092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final Executor f48093b;

    /* JADX INFO: renamed from: androidx.core.provider.a$a, reason: collision with other inner class name */
    class RunnableC0398a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h.d f48094a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Typeface f48095b;

        RunnableC0398a(h.d dVar, Typeface typeface) {
            this.f48094a = dVar;
            this.f48095b = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f48094a.b(this.f48095b);
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h.d f48097a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f48098b;

        b(h.d dVar, int i10) {
            this.f48097a = dVar;
            this.f48098b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f48097a.a(this.f48098b);
        }
    }

    a(@NonNull h.d dVar, @NonNull Executor executor) {
        this.f48092a = dVar;
        this.f48093b = executor;
    }

    private void a(int i10) {
        this.f48093b.execute(new b(this.f48092a, i10));
    }

    private void c(@NonNull Typeface typeface) {
        this.f48093b.execute(new RunnableC0398a(this.f48092a, typeface));
    }

    void b(@NonNull g.e eVar) {
        if (eVar.a()) {
            c(eVar.f48129a);
        } else {
            a(eVar.f48130b);
        }
    }

    a(@NonNull h.d dVar) {
        this(dVar, i.b(androidx.core.provider.b.a()));
    }
}
