package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes4.dex */
@com.google.android.gms.common.internal.a0
@g6.a
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile int f106919a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f106920b = 0;

    @p0
    @g6.a
    @Deprecated
    public static byte[] a(@NonNull Context context, @NonNull String str) throws PackageManager.NameNotFoundException {
        MessageDigest messageDigestB;
        PackageInfo packageInfoF = com.google.android.gms.common.wrappers.d.a(context).f(str, 64);
        Signature[] signatureArr = packageInfoF.signatures;
        if (signatureArr == null || signatureArr.length != 1 || (messageDigestB = b(com.planner5d.library.services.utility.e0.f225194b)) == null) {
            return null;
        }
        return messageDigestB.digest(packageInfoF.signatures[0].toByteArray());
    }

    @p0
    public static MessageDigest b(@NonNull String str) {
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(str);
                if (messageDigest != null) {
                    return messageDigest;
                }
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }
}
