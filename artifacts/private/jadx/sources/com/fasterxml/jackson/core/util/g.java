package com.fasterxml.jackson.core.util;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends ConcurrentHashMap<String, String> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f102816b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f102817c = 180;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f102818d = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f102819a;

    private g() {
        super(f102817c, 0.8f, 4);
        this.f102819a = new Object();
    }

    public String a(String str) {
        String str2 = get(str);
        if (str2 != null) {
            return str2;
        }
        if (size() >= f102817c) {
            synchronized (this.f102819a) {
                try {
                    if (size() >= f102817c) {
                        clear();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        String strIntern = str.intern();
        put(strIntern, strIntern);
        return strIntern;
    }
}
