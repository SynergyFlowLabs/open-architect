package com.rabbitmq.utility;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class e {

    static class a extends Throwable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final long f266136a = 1;

        public a(Throwable th2) {
            super(th2.getClass() + " created elsewhere");
            setStackTrace(th2.getStackTrace());
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    public static <E> List<E> a(List<E> list) {
        ArrayList arrayList;
        synchronized (list) {
            try {
                arrayList = new ArrayList(list);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayList;
    }

    public static <K, V> Map<K, V> b(Map<K, V> map) {
        LinkedHashMap linkedHashMap;
        synchronized (map) {
            try {
                linkedHashMap = new LinkedHashMap(map);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return linkedHashMap;
    }

    public static <T extends Throwable & d<T>> T c(T t10) {
        T t11 = (T) ((Throwable) ((d) t10).Kk());
        if (t11.getCause() == null) {
            try {
                t11.initCause(new a(t11));
            } catch (IllegalStateException unused) {
            }
        }
        t11.fillInStackTrace();
        StackTraceElement[] stackTrace = t11.getStackTrace();
        int length = stackTrace.length - 1;
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[length];
        System.arraycopy(stackTrace, 1, stackTraceElementArr, 0, length);
        t11.setStackTrace(stackTraceElementArr);
        return t11;
    }

    public static String d(Throwable th2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream((OutputStream) byteArrayOutputStream, false);
        th2.printStackTrace(printStream);
        printStream.flush();
        String string = byteArrayOutputStream.toString();
        printStream.close();
        return string;
    }
}
