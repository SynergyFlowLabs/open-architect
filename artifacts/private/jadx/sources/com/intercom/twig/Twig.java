package com.intercom.twig;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.annotation.p0;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes5.dex */
public class Twig {
    public static final int DISABLED = 8;
    private static final int MAX_LOG_LENGTH = 4000;
    private final boolean internalLoggingEnabled;
    private int logLevel;

    @NonNull
    private final String tag;

    @Retention(RetentionPolicy.SOURCE)
    public @interface LogLevel {
    }

    public Twig(int i10, @p0 String str, boolean z10) {
        this.logLevel = i10;
        this.tag = str == null ? "Twig" : str;
        this.internalLoggingEnabled = z10;
    }

    private String getStackTraceString(Throwable th2) {
        StringWriter stringWriter = new StringWriter(256);
        PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
        th2.printStackTrace(printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }

    private void prepareLog(int i10, @p0 Throwable th2, String str, Object... objArr) {
        String stackTraceString;
        if (i10 >= this.logLevel) {
            String tag = getTag();
            if (str != null && str.length() == 0) {
                str = null;
            }
            if (str != null) {
                if (objArr.length > 0) {
                    str = String.format(str, objArr);
                }
                if (th2 != null) {
                    stackTraceString = str + "\n" + getStackTraceString(th2);
                } else {
                    stackTraceString = str;
                }
            } else if (th2 != null) {
                stackTraceString = getStackTraceString(th2);
            }
            log(i10, tag, stackTraceString);
        }
    }

    private void printLog(int i10, String str, String str2) {
        if (i10 == 7) {
            Log.wtf(str, str2);
        } else {
            Log.println(i10, str, str2);
        }
    }

    public void d(String str, Object... objArr) {
        prepareLog(3, null, str, objArr);
    }

    public void e(String str, Object... objArr) {
        prepareLog(6, null, str, objArr);
    }

    @l1
    int getLogLevel() {
        return this.logLevel;
    }

    public String getTag() {
        return this.tag;
    }

    public void i(String str, Object... objArr) {
        prepareLog(4, null, str, objArr);
    }

    public void internal(String str, String str2) {
    }

    @l1
    void log(int i10, String str, Object... objArr) {
        prepareLog(i10, null, str, objArr);
    }

    public void setLogLevel(int i10) {
        this.logLevel = i10;
    }

    public void v(String str, Object... objArr) {
        prepareLog(2, null, str, objArr);
    }

    public void w(String str, Object... objArr) {
        prepareLog(5, null, str, objArr);
    }

    public void wtf(String str, Object... objArr) {
        prepareLog(7, null, str, objArr);
    }

    private void log(int i10, String str, String str2) {
        int iMin;
        if (str2.length() < MAX_LOG_LENGTH) {
            printLog(i10, str, str2);
            return;
        }
        int length = str2.length();
        int i11 = 0;
        while (i11 < length) {
            int iIndexOf = str2.indexOf(10, i11);
            if (iIndexOf == -1) {
                iIndexOf = length;
            }
            while (true) {
                iMin = Math.min(iIndexOf, i11 + MAX_LOG_LENGTH);
                printLog(i10, str, str2.substring(i11, iMin));
                if (iMin >= iIndexOf) {
                    break;
                } else {
                    i11 = iMin;
                }
            }
            i11 = iMin + 1;
        }
    }

    public void d(Throwable th2, String str, Object... objArr) {
        prepareLog(3, th2, str, objArr);
    }

    public void e(Throwable th2, String str, Object... objArr) {
        prepareLog(6, th2, str, objArr);
    }

    public void i(Throwable th2, String str, Object... objArr) {
        prepareLog(4, th2, str, objArr);
    }

    public void internal(String str) {
        internal(this.tag, str);
    }

    public void v(Throwable th2, String str, Object... objArr) {
        prepareLog(2, th2, str, objArr);
    }

    public void w(Throwable th2, String str, Object... objArr) {
        prepareLog(5, th2, str, objArr);
    }

    public void wtf(Throwable th2, String str, Object... objArr) {
        prepareLog(7, th2, str, objArr);
    }

    public void d(Throwable th2) {
        prepareLog(3, th2, null, new Object[0]);
    }

    public void e(Throwable th2) {
        prepareLog(6, th2, null, new Object[0]);
    }

    public void i(Throwable th2) {
        prepareLog(4, th2, null, new Object[0]);
    }

    public void v(Throwable th2) {
        int i10 = 5 << 2;
        prepareLog(2, th2, null, new Object[0]);
    }

    public void w(Throwable th2) {
        prepareLog(5, th2, null, new Object[0]);
    }

    public void wtf(Throwable th2) {
        prepareLog(7, th2, null, new Object[0]);
    }
}
