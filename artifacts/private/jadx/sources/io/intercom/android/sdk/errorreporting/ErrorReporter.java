package io.intercom.android.sdk.errorreporting;

import android.content.Context;
import com.google.gson.f;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.api.Api;

/* JADX INFO: loaded from: classes13.dex */
public class ErrorReporter {
    private final Provider<Api> apiProvider;
    private final ExceptionParser exceptionParser;
    private final ErrorReportStore reportStore;

    ErrorReporter(ErrorReportStore errorReportStore, Provider<Api> provider, ExceptionParser exceptionParser) {
        this.reportStore = errorReportStore;
        this.apiProvider = provider;
        this.exceptionParser = exceptionParser;
    }

    public static ErrorReporter create(Context context, f fVar, Provider<Api> provider) {
        return new ErrorReporter(ErrorReportStore.create(context.getApplicationContext(), fVar), provider, new ExceptionParser());
    }

    public void disableExceptionHandler() {
        IntercomExceptionHandler.disable();
        this.reportStore.deleteFromDisk();
    }

    public void enableExceptionHandler() {
        IntercomExceptionHandler.enable(this);
    }

    void saveReport(Throwable th2) {
        if (this.exceptionParser.containsIntercomMethod(th2)) {
            this.reportStore.saveToDisk(this.exceptionParser.createReportFrom(th2));
        }
    }

    public void sendSavedReport() {
        this.reportStore.sendSavedReport(this.apiProvider);
    }
}
