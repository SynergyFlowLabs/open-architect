package com.google.api.client.http;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Logger f115584a = Logger.getLogger(b0.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f115585b;

    static {
        String[] strArr = {"DELETE", "GET", "POST", "PUT"};
        f115585b = strArr;
        Arrays.sort(strArr);
    }

    u a() {
        return new u(this, null);
    }

    protected abstract e0 b(String str, String str2) throws IOException;

    public final v c() {
        return d(null);
    }

    public final v d(w wVar) {
        return new v(this, wVar);
    }

    public void e() throws IOException {
    }

    public boolean f(String str) throws IOException {
        return Arrays.binarySearch(f115585b, str) >= 0;
    }
}
