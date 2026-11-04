package androidx.core.content.pm;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import androidx.annotation.NonNull;
import androidx.annotation.d1;
import androidx.annotation.p0;
import androidx.annotation.w0;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    @w0(28)
    private static class a {
        private a() {
        }

        @p0
        static Signature[] a(@NonNull SigningInfo signingInfo) {
            return signingInfo.getApkContentsSigners();
        }

        static long b(PackageInfo packageInfo) {
            return packageInfo.getLongVersionCode();
        }

        @p0
        static Signature[] c(@NonNull SigningInfo signingInfo) {
            return signingInfo.getSigningCertificateHistory();
        }

        static boolean d(@NonNull SigningInfo signingInfo) {
            return signingInfo.hasMultipleSigners();
        }

        static boolean e(@NonNull PackageManager packageManager, @NonNull String str, @NonNull byte[] bArr, int i10) {
            return packageManager.hasSigningCertificate(str, bArr, i10);
        }
    }

    private b() {
    }

    private static boolean a(@NonNull byte[][] bArr, @NonNull byte[] bArr2) {
        for (byte[] bArr3 : bArr) {
            if (Arrays.equals(bArr2, bArr3)) {
                return true;
            }
        }
        return false;
    }

    private static byte[] b(byte[] bArr) {
        try {
            return MessageDigest.getInstance("SHA256").digest(bArr);
        } catch (NoSuchAlgorithmException e10) {
            throw new RuntimeException("Device doesn't support SHA256 cert checking", e10);
        }
    }

    public static long c(@NonNull PackageInfo packageInfo) {
        return a.b(packageInfo);
    }

    @NonNull
    public static List<Signature> d(@NonNull PackageManager packageManager, @NonNull String str) throws PackageManager.NameNotFoundException {
        SigningInfo signingInfo = packageManager.getPackageInfo(str, androidx.media3.common.j.W0).signingInfo;
        Signature[] signatureArrA = a.d(signingInfo) ? a.a(signingInfo) : a.c(signingInfo);
        return signatureArrA == null ? Collections.EMPTY_LIST : Arrays.asList(signatureArrA);
    }

    public static boolean e(@NonNull PackageManager packageManager, @NonNull String str, @NonNull @d1(min = 1) Map<byte[], Integer> map, boolean z10) throws PackageManager.NameNotFoundException {
        byte[][] bArr;
        if (map.isEmpty()) {
            return false;
        }
        Set<byte[]> setKeySet = map.keySet();
        for (byte[] bArr2 : setKeySet) {
            if (bArr2 == null) {
                throw new IllegalArgumentException("Cert byte array cannot be null when verifying " + str);
            }
            Integer num = map.get(bArr2);
            if (num == null) {
                throw new IllegalArgumentException("Type must be specified for cert when verifying " + str);
            }
            int iIntValue = num.intValue();
            if (iIntValue != 0 && iIntValue != 1) {
                throw new IllegalArgumentException("Unsupported certificate type " + num + " when verifying " + str);
            }
        }
        List<Signature> listD = d(packageManager, str);
        if (!z10) {
            for (byte[] bArr3 : setKeySet) {
                if (!a.e(packageManager, str, bArr3, map.get(bArr3).intValue())) {
                    return false;
                }
            }
            return true;
        }
        if (listD.size() != 0 && map.size() <= listD.size() && (!z10 || map.size() == listD.size())) {
            if (map.containsValue(1)) {
                bArr = new byte[listD.size()][];
                for (int i10 = 0; i10 < listD.size(); i10++) {
                    bArr[i10] = b(listD.get(i10).toByteArray());
                }
            } else {
                bArr = null;
            }
            Iterator<byte[]> it = setKeySet.iterator();
            if (it.hasNext()) {
                byte[] next = it.next();
                Integer num2 = map.get(next);
                int iIntValue2 = num2.intValue();
                if (iIntValue2 != 0) {
                    if (iIntValue2 != 1) {
                        throw new IllegalArgumentException("Unsupported certificate type " + num2);
                    }
                    if (!a(bArr, next)) {
                        return false;
                    }
                } else if (!listD.contains(new Signature(next))) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}
