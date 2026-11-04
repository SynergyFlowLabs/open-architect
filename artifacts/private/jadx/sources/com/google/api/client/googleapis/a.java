package com.google.api.client.googleapis;

import com.google.api.client.util.i0;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Integer f115271a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Integer f115272b = 25;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Integer f115273c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f115274d = (((Object) 1) + "." + ((Object) 25) + "." + ((Object) 0) + "").toString();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static KeyStore f115275e;

    static {
        int i10 = 2 >> 0;
    }

    private a() {
    }

    public static synchronized KeyStore a() throws GeneralSecurityException, IOException {
        try {
            if (f115275e == null) {
                f115275e = i0.b();
                i0.i(f115275e, a.class.getResourceAsStream("google.jks"), "notasecret");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f115275e;
    }
}
