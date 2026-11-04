package io.grpc.okhttp.internal;

import java.io.UnsupportedEncodingException;
import okio.o;

/* JADX INFO: loaded from: classes13.dex */
public final class c {
    private c() {
    }

    public static String a(String str, String str2) {
        try {
            return "Basic " + o.l0((str + ":" + str2).getBytes("ISO-8859-1")).n();
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError();
        }
    }
}
