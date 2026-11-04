package androidx.emoji2.text;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.m1;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.core.os.q0;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.c0;
import androidx.lifecycle.o0;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes2.dex */
public class EmojiCompatInitializer implements androidx.startup.b<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f51045a = 500;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f51046b = "EmojiCompatInitializer";

    class a implements DefaultLifecycleObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c0 f51047a;

        a(c0 c0Var) {
            this.f51047a = c0Var;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onResume(@NonNull o0 o0Var) {
            EmojiCompatInitializer.this.c();
            this.f51047a.g(this);
        }
    }

    @w0(19)
    static class b extends f.d {
        protected b(Context context) {
            super(new c(context));
            f(1);
        }
    }

    @w0(19)
    static class c implements f.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f51049a;

        class a extends f.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ f.k f51050a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ThreadPoolExecutor f51051b;

            a(f.k kVar, ThreadPoolExecutor threadPoolExecutor) {
                this.f51050a = kVar;
                this.f51051b = threadPoolExecutor;
            }

            @Override // androidx.emoji2.text.f.k
            public void a(@p0 Throwable th2) {
                try {
                    this.f51050a.a(th2);
                    this.f51051b.shutdown();
                } catch (Throwable th3) {
                    this.f51051b.shutdown();
                    throw th3;
                }
            }

            @Override // androidx.emoji2.text.f.k
            public void b(@NonNull p pVar) {
                try {
                    this.f51050a.b(pVar);
                    this.f51051b.shutdown();
                } catch (Throwable th2) {
                    this.f51051b.shutdown();
                    throw th2;
                }
            }
        }

        c(Context context) {
            this.f51049a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.f.j
        public void a(@NonNull final f.k kVar) {
            final ThreadPoolExecutor threadPoolExecutorC = androidx.emoji2.text.c.c(EmojiCompatInitializer.f51046b);
            threadPoolExecutorC.execute(new Runnable() { // from class: androidx.emoji2.text.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f51223a.c(kVar, threadPoolExecutorC);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @m1
        public void c(@NonNull f.k kVar, @NonNull ThreadPoolExecutor threadPoolExecutor) {
            try {
                l lVarA = androidx.emoji2.text.d.a(this.f51049a);
                if (lVarA == null) {
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                }
                lVarA.m(threadPoolExecutor);
                lVarA.a().a(new a(kVar, threadPoolExecutor));
            } catch (Throwable th2) {
                kVar.a(th2);
                threadPoolExecutor.shutdown();
            }
        }
    }

    static class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                q0.b("EmojiCompat.EmojiCompatInitializer.run");
                if (f.q()) {
                    f.c().t();
                }
            } finally {
                q0.d();
            }
        }
    }

    @Override // androidx.startup.b
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Boolean create(@NonNull Context context) {
        f.p(new b(context));
        b(context);
        return Boolean.TRUE;
    }

    @w0(19)
    void b(@NonNull Context context) {
        c0 lifecycle = ((o0) androidx.startup.a.e(context).f(ProcessLifecycleInitializer.class)).getLifecycle();
        lifecycle.c(new a(lifecycle));
    }

    @w0(19)
    void c() {
        androidx.emoji2.text.c.d().postDelayed(new d(), 500L);
    }

    @Override // androidx.startup.b
    @NonNull
    public List<Class<? extends androidx.startup.b<?>>> dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}
