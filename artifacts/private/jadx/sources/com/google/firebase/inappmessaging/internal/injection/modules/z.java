package com.google.firebase.inappmessaging.internal.injection.modules;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import androidx.annotation.NonNull;
import io.grpc.v1;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes5.dex */
@q8.d
public class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.firebase.h f122813a;

    public z(com.google.firebase.h hVar) {
        this.f122813a = hVar;
    }

    public static String a(@NonNull PackageManager packageManager, @NonNull String str) {
        Signature[] signatureArr;
        Signature signature;
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 64);
            if (packageInfo != null && (signatureArr = packageInfo.signatures) != null && signatureArr.length != 0 && (signature = signatureArr[0]) != null) {
                return d(signature);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }

    private static String d(Signature signature) {
        try {
            return com.google.common.io.b.a().A().l(MessageDigest.getInstance(com.planner5d.library.services.utility.e0.f225194b).digest(signature.toByteArray()));
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    @q8.e
    public v1 b() {
        v1.d<String> dVar = v1.f291323f;
        v1.i iVarE = v1.i.e("X-Goog-Api-Key", dVar);
        v1.i iVarE2 = v1.i.e("X-Android-Package", dVar);
        v1.i iVarE3 = v1.i.e("X-Android-Cert", dVar);
        v1 v1Var = new v1();
        String packageName = this.f122813a.n().getPackageName();
        v1Var.w(iVarE, this.f122813a.s().i());
        v1Var.w(iVarE2, packageName);
        String strA = a(this.f122813a.n().getPackageManager(), packageName);
        if (strA != null) {
            v1Var.w(iVarE3, strA);
        }
        return v1Var;
    }

    @q8.e
    @x8.a
    public com.google.internal.firebase.inappmessaging.v1.sdkserving.l.e c(io.grpc.f fVar, v1 v1Var) {
        return com.google.internal.firebase.inappmessaging.v1.sdkserving.l.d(io.grpc.m.c(fVar, io.grpc.stub.j.a(v1Var)));
    }
}
