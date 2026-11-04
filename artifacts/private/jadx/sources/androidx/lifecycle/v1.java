package androidx.lifecycle;

import android.os.Handler;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final q0 f52537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Handler f52538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private a f52539c;

    public static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final q0 f52540a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final c0.a f52541b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f52542c;

        public a(@NotNull q0 registry, @NotNull c0.a event) {
            Intrinsics.checkNotNullParameter(registry, "registry");
            Intrinsics.checkNotNullParameter(event, "event");
            this.f52540a = registry;
            this.f52541b = event;
        }

        @NotNull
        public final c0.a a() {
            return this.f52541b;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f52542c) {
                return;
            }
            this.f52540a.o(this.f52541b);
            this.f52542c = true;
        }
    }

    public v1(@NotNull o0 provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f52537a = new q0(provider);
        this.f52538b = new Handler();
    }

    private final void f(c0.a aVar) {
        a aVar2 = this.f52539c;
        if (aVar2 != null) {
            aVar2.run();
        }
        a aVar3 = new a(this.f52537a, aVar);
        this.f52539c = aVar3;
        Handler handler = this.f52538b;
        Intrinsics.checkNotNull(aVar3);
        handler.postAtFrontOfQueue(aVar3);
    }

    @NotNull
    public c0 a() {
        return this.f52537a;
    }

    public void b() {
        f(c0.a.ON_START);
    }

    public void c() {
        f(c0.a.ON_CREATE);
    }

    public void d() {
        f(c0.a.ON_STOP);
        f(c0.a.ON_DESTROY);
    }

    public void e() {
        f(c0.a.ON_START);
    }
}
