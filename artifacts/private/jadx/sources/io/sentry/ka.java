package io.sentry;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
interface ka {

    public static final class a implements ka {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final a f305809a = new a();

        private a() {
        }

        static ka c() {
            return f305809a;
        }

        @Override // io.sentry.ka
        public void a(@Nullable Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
        }

        @Override // io.sentry.ka
        public Thread.UncaughtExceptionHandler b() {
            return Thread.getDefaultUncaughtExceptionHandler();
        }
    }

    void a(@Nullable Thread.UncaughtExceptionHandler uncaughtExceptionHandler);

    Thread.UncaughtExceptionHandler b();
}
