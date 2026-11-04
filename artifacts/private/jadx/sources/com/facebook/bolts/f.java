package com.facebook.bolts;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f99331d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final f f99332e = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ExecutorService f99333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final ScheduledExecutorService f99334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Executor f99335c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean d() {
            String property = System.getProperty("java.runtime.name");
            if (property == null) {
                return false;
            }
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = property.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            return StringsKt.V2(lowerCase, "android", false, 2, null);
        }

        @oj.n
        @NotNull
        public final ExecutorService b() {
            return f.f99332e.f99333a;
        }

        @oj.n
        @NotNull
        public final Executor c() {
            return f.f99332e.f99335c;
        }

        @oj.n
        @NotNull
        public final ScheduledExecutorService e() {
            return f.f99332e.f99334b;
        }

        private a() {
        }
    }

    private static final class b implements Executor {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final a f99336b = new a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f99337c = 15;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final ThreadLocal<Integer> f99338a = new ThreadLocal<>();

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        private final int a() {
            Integer num = this.f99338a.get();
            if (num == null) {
                num = 0;
            }
            int iIntValue = num.intValue() - 1;
            if (iIntValue == 0) {
                this.f99338a.remove();
                return iIntValue;
            }
            this.f99338a.set(Integer.valueOf(iIntValue));
            return iIntValue;
        }

        private final int b() {
            Integer num = this.f99338a.get();
            if (num == null) {
                num = 0;
            }
            int iIntValue = num.intValue() + 1;
            this.f99338a.set(Integer.valueOf(iIntValue));
            return iIntValue;
        }

        @Override // java.util.concurrent.Executor
        public void execute(@NotNull Runnable command) {
            Intrinsics.checkNotNullParameter(command, "command");
            try {
                if (b() <= 15) {
                    command.run();
                } else {
                    f.f99331d.b().execute(command);
                }
                a();
            } catch (Throwable th2) {
                a();
                throw th2;
            }
        }
    }

    private f() {
        ExecutorService executorServiceA;
        if (f99331d.d()) {
            executorServiceA = com.facebook.bolts.b.f99283b.a();
        } else {
            executorServiceA = Executors.newCachedThreadPool();
            Intrinsics.checkNotNullExpressionValue(executorServiceA, "newCachedThreadPool()");
        }
        this.f99333a = executorServiceA;
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        Intrinsics.checkNotNullExpressionValue(scheduledExecutorServiceNewSingleThreadScheduledExecutor, "newSingleThreadScheduledExecutor()");
        this.f99334b = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        this.f99335c = new b();
    }

    @oj.n
    @NotNull
    public static final ExecutorService e() {
        return f99331d.b();
    }

    @oj.n
    @NotNull
    public static final Executor f() {
        return f99331d.c();
    }

    @oj.n
    @NotNull
    public static final ScheduledExecutorService g() {
        return f99331d.e();
    }
}
