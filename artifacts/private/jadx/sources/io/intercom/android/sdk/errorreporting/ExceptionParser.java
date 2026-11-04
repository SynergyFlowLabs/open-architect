package io.intercom.android.sdk.errorreporting;

import io.intercom.android.sdk.utilities.commons.TimeProvider;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
class ExceptionParser {
    private static final String[] ALLOWED_PACKAGES = {"io.intercom.android.sdk", "java.", "kotlin.", "kotlinx.", "android.", "androidx.", "com.android.", "com.google."};
    private static final String INTERCOM_SDK_PACKAGE = "io.intercom.android.sdk";
    private static final String REDACTION_LINE = "[Non Intercom/OS method]";

    ExceptionParser() {
    }

    private List<ExceptionReport> createExceptionReports(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        while (th2 != null) {
            arrayList.add(new ExceptionReport(th2.getClass().getName(), th2.getLocalizedMessage(), getStacktraceString(th2.getStackTrace())));
            th2 = th2.getCause();
        }
        return arrayList;
    }

    private String getStacktraceString(StackTraceElement[] stackTraceElementArr) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < stackTraceElementArr.length; i10++) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i10];
            sb2.append(isFromAllowedPackage(stackTraceElement) ? stackTraceElement.toString() : REDACTION_LINE);
            if (i10 < stackTraceElementArr.length - 1) {
                sb2.append("\n");
            }
        }
        return sb2.toString();
    }

    private boolean isFromAllowedPackage(StackTraceElement stackTraceElement) {
        String className = stackTraceElement.getClassName();
        for (String str : ALLOWED_PACKAGES) {
            if (className.startsWith(str)) {
                return true;
            }
        }
        return false;
    }

    boolean containsIntercomMethod(Throwable th2) {
        while (true) {
            if (th2 == null) {
                return false;
            }
            for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                if (stackTraceElement.getClassName().startsWith("io.intercom.android.sdk")) {
                    return true;
                }
            }
            th2 = th2.getCause();
        }
    }

    ErrorReport createReportFrom(Throwable th2) {
        return new ErrorReport(createExceptionReports(th2), TimeProvider.SYSTEM.currentTimeMillis());
    }
}
