package io.intercom.android.sdk.errorreporting;

import com.google.gson.annotations.c;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class ErrorReport {

    @c("exception_reports")
    private final List<ExceptionReport> exceptionReports;
    private final long timestamp;

    ErrorReport(List<ExceptionReport> list, long j10) {
        this.exceptionReports = list;
        this.timestamp = j10;
    }

    public List<ExceptionReport> getExceptionReports() {
        return this.exceptionReports;
    }

    public long getTimestamp() {
        return this.timestamp;
    }
}
