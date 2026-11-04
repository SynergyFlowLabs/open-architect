package androidx.browser.trusted;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import androidx.annotation.p0;
import androidx.annotation.w0;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f11964a = "PackageIdentity";

    @w0(28)
    static class a implements c {
        a() {
        }

        @Override // androidx.browser.trusted.f.c
        @p0
        public List<byte[]> a(String str, PackageManager packageManager) throws PackageManager.NameNotFoundException {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, androidx.media3.common.j.W0);
            ArrayList arrayList = new ArrayList();
            SigningInfo signingInfo = packageInfo.signingInfo;
            if (!signingInfo.hasMultipleSigners()) {
                arrayList.add(f.a(signingInfo.getSigningCertificateHistory()[0]));
                return arrayList;
            }
            for (Signature signature : signingInfo.getApkContentsSigners()) {
                arrayList.add(f.a(signature));
            }
            return arrayList;
        }

        @Override // androidx.browser.trusted.f.c
        public boolean b(String str, PackageManager packageManager, j jVar) throws PackageManager.NameNotFoundException, IOException {
            List<byte[]> listA;
            if (jVar.h().equals(str) && (listA = a(str, packageManager)) != null) {
                return listA.size() == 1 ? packageManager.hasSigningCertificate(str, jVar.f(0), 1) : jVar.equals(j.c(str, listA));
            }
            return false;
        }
    }

    static class b implements c {
        b() {
        }

        @Override // androidx.browser.trusted.f.c
        @e.a({"PackageManagerGetSignatures"})
        @p0
        public List<byte[]> a(String str, PackageManager packageManager) throws PackageManager.NameNotFoundException {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 64);
            ArrayList arrayList = new ArrayList(packageInfo.signatures.length);
            int i10 = 7 ^ 0;
            for (Signature signature : packageInfo.signatures) {
                byte[] bArrA = f.a(signature);
                if (bArrA == null) {
                    return null;
                }
                arrayList.add(bArrA);
            }
            return arrayList;
        }

        @Override // androidx.browser.trusted.f.c
        public boolean b(String str, PackageManager packageManager, j jVar) throws PackageManager.NameNotFoundException, IOException {
            List<byte[]> listA;
            if (str.equals(jVar.h()) && (listA = a(str, packageManager)) != null) {
                return jVar.equals(j.c(str, listA));
            }
            return false;
        }
    }

    interface c {
        @p0
        List<byte[]> a(String str, PackageManager packageManager) throws PackageManager.NameNotFoundException;

        boolean b(String str, PackageManager packageManager, j jVar) throws PackageManager.NameNotFoundException, IOException;
    }

    private f() {
    }

    @p0
    static byte[] a(Signature signature) {
        try {
            return MessageDigest.getInstance("SHA256").digest(signature.toByteArray());
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    @p0
    static List<byte[]> b(String str, PackageManager packageManager) {
        try {
            return c().a(str, packageManager);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private static c c() {
        return new a();
    }

    static boolean d(String str, PackageManager packageManager, j jVar) {
        try {
            return c().b(str, packageManager, jVar);
        } catch (PackageManager.NameNotFoundException | IOException unused) {
            return false;
        }
    }
}
