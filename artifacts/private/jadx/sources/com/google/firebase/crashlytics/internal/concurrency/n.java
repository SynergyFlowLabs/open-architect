package com.google.firebase.crashlytics.internal.concurrency;

import android.os.Looper;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g0;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f121231e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f121232f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oj.f
    @NotNull
    public final j f121233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    @NotNull
    public final j f121234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oj.f
    @NotNull
    public final j f121235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oj.f
    @NotNull
    public final j f121236d;

    public static final class a {

        /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.concurrency.n$a$a, reason: collision with other inner class name */
        /* synthetic */ class C1125a extends g0 implements Function0<Boolean> {
            C1125a(Object obj) {
                super(0, obj, a.class, "isBackgroundThread", "isBackgroundThread()Z", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((a) this.receiver).q());
            }
        }

        /* synthetic */ class b extends g0 implements Function0<Boolean> {
            b(Object obj) {
                super(0, obj, a.class, "isBlockingThread", "isBlockingThread()Z", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((a) this.receiver).r());
            }
        }

        /* synthetic */ class c extends g0 implements Function0<Boolean> {
            c(Object obj) {
                super(0, obj, a.class, "isNotMainThread", "isNotMainThread()Z", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((a) this.receiver).s());
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String h() {
            return "Must be called on a background thread, was called on " + n.f121231e.p() + '.';
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String j() {
            return "Must be called on a blocking thread, was called on " + n.f121231e.p() + '.';
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String l() {
            return "Must not be called on a main thread, was called on " + n.f121231e.p() + '.';
        }

        private final void m(Function0<Boolean> function0, Function0<String> function1) {
            if (!function0.invoke().booleanValue()) {
                com.google.firebase.crashlytics.internal.g.f().b(function1.invoke());
                n();
            }
        }

        @oj.n
        public static /* synthetic */ void o() {
        }

        private final String p() {
            return Thread.currentThread().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean q() {
            String strP = p();
            Intrinsics.checkNotNullExpressionValue(strP, "<get-threadName>(...)");
            return StringsKt.V2(strP, "Firebase Background Thread #", false, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean r() {
            String strP = p();
            Intrinsics.checkNotNullExpressionValue(strP, "<get-threadName>(...)");
            return StringsKt.V2(strP, "Firebase Blocking Thread #", false, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean s() {
            return !Looper.getMainLooper().isCurrentThread();
        }

        @oj.n
        public final void g() {
            m(new C1125a(this), new Function0() { // from class: com.google.firebase.crashlytics.internal.concurrency.k
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return n.a.h();
                }
            });
        }

        @oj.n
        public final void i() {
            m(new b(this), new Function0() { // from class: com.google.firebase.crashlytics.internal.concurrency.m
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return n.a.j();
                }
            });
        }

        @oj.n
        public final void k() {
            m(new c(this), new Function0() { // from class: com.google.firebase.crashlytics.internal.concurrency.l
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return n.a.l();
                }
            });
        }

        public final boolean n() {
            return n.f121232f;
        }

        public final void t(boolean z10) {
            n.f121232f = z10;
        }

        private a() {
        }
    }

    public n(@NotNull ExecutorService backgroundExecutorService, @NotNull ExecutorService blockingExecutorService) {
        Intrinsics.checkNotNullParameter(backgroundExecutorService, "backgroundExecutorService");
        Intrinsics.checkNotNullParameter(blockingExecutorService, "blockingExecutorService");
        this.f121233a = new j(backgroundExecutorService);
        this.f121234b = new j(backgroundExecutorService);
        this.f121235c = new j(backgroundExecutorService);
        this.f121236d = new j(blockingExecutorService);
    }

    @oj.n
    public static final void c() {
        f121231e.g();
    }

    @oj.n
    public static final void d() {
        f121231e.i();
    }

    @oj.n
    public static final void e() {
        f121231e.k();
    }

    public static final boolean f() {
        return f121231e.n();
    }

    public static final void g(boolean z10) {
        f121231e.t(z10);
    }
}
