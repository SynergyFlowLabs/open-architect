package com.google.vr.sdk.deps;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes5.dex */
public final class a7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static final Charset f127703a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f127704b;

    static {
        Charset.forName("ISO-8859-1");
        f127704b = new Object();
    }

    public static void a(w6 w6Var, w6 w6Var2) {
        y6 y6Var = w6Var.f129659b;
        if (y6Var != null) {
            w6Var2.f129659b = y6Var.clone();
        }
    }
}
