package com.google.android.gms.internal.p000authapi;

import android.util.Base64;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes4.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final SecureRandom f107539a = new SecureRandom();

    public static String a() {
        byte[] bArr = new byte[16];
        f107539a.nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }
}
