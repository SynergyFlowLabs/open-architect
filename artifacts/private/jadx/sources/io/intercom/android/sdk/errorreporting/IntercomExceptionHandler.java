package io.intercom.android.sdk.errorreporting;

/* JADX INFO: loaded from: classes13.dex */
class IntercomExceptionHandler implements Thread.UncaughtExceptionHandler {
    private final Thread.UncaughtExceptionHandler originalHandler;
    private final ErrorReporter reporter;

    IntercomExceptionHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, ErrorReporter errorReporter) {
        this.originalHandler = uncaughtExceptionHandler;
        this.reporter = errorReporter;
    }

    static void disable() {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler instanceof IntercomExceptionHandler) {
            Thread.setDefaultUncaughtExceptionHandler(((IntercomExceptionHandler) defaultUncaughtExceptionHandler).originalHandler);
        }
    }

    static void enable(ErrorReporter errorReporter) {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler instanceof IntercomExceptionHandler) {
            return;
        }
        Thread.setDefaultUncaughtExceptionHandler(new IntercomExceptionHandler(defaultUncaughtExceptionHandler, errorReporter));
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th2) {
        this.reporter.saveReport(th2);
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.originalHandler;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th2);
        } else {
            System.err.printf("Exception in thread \"%s\" ", thread.getName());
            th2.printStackTrace(System.err);
        }
    }
}
