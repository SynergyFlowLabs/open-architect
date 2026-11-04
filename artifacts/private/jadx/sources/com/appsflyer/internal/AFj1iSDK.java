package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.google.android.gms.appset.AppSet;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
public final class AFj1iSDK {
    public static boolean AFAdRevenueData(@androidx.annotation.p0 Context context) {
        if (context != null) {
            try {
                if (com.google.android.gms.common.f.x().j(context) == 0) {
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public static boolean L_(Context context, Intent intent) {
        return context.getPackageManager().queryIntentServices(intent, 0).size() > 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:9:0x003a  */
    public static Map<String, String> M_(Context context, Map<String, String> map, Uri uri) {
        Iterator<String> it = uri.getQueryParameterNames().iterator();
        while (true) {
            byte b10 = 0;
            String str = "media_source";
            if (!it.hasNext()) {
                try {
                    if (!map.containsKey("install_time")) {
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
                        long j10 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime;
                        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                        map.put("install_time", simpleDateFormat.format(new Date(j10)));
                    }
                } catch (Exception e10) {
                    AFLogger.afErrorLog("Could not fetch install time. ", e10);
                }
                if (map.containsKey("af_deeplink") && !map.containsKey("af_status")) {
                    map.put("af_status", "Non-organic");
                }
                if (map.containsKey("agency")) {
                    map.remove("media_source");
                }
                String path = uri.getPath();
                if (path != null) {
                    map.put("path", path);
                }
                String scheme = uri.getScheme();
                if (scheme != null) {
                    map.put("scheme", scheme);
                }
                String host = uri.getHost();
                if (host != null) {
                    map.put("host", host);
                }
                return map;
            }
            String next = it.next();
            String queryParameter = uri.getQueryParameter(next);
            if (map.containsKey(next)) {
                str = next;
            } else {
                next.getClass();
                int i10 = 0 ^ (-1);
                switch (next.hashCode()) {
                    case -1420799080:
                        if (!next.equals("af_prt")) {
                            b10 = -1;
                        }
                        break;
                    case 99:
                        if (!next.equals("c")) {
                            b10 = -1;
                        } else {
                            b10 = 1;
                        }
                        break;
                    case 110987:
                        if (!next.equals("pid")) {
                            b10 = -1;
                        } else {
                            b10 = 2;
                        }
                        break;
                    default:
                        b10 = -1;
                        break;
                }
                switch (b10) {
                    case 0:
                        str = "agency";
                        continue;
                    case 1:
                        str = "campaign";
                        continue;
                    case 2:
                        continue;
                }
                str = next;
            }
            map.put(str, queryParameter);
        }
    }

    @e.a({"PackageManagerGetSignatures"})
    public static String N_(PackageManager packageManager, String str) throws NoSuchAlgorithmException, PackageManager.NameNotFoundException, CertificateException {
        Signature[] signatureArr = packageManager.getPackageInfo(str, 64).signatures;
        if (signatureArr == null) {
            return null;
        }
        X509Certificate x509Certificate = (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()));
        MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
        messageDigest.update(x509Certificate.getEncoded());
        return String.format("%032X", new BigInteger(1, messageDigest.digest()));
    }

    @androidx.annotation.p0
    public static Application O_(@NonNull Context context) {
        if (context instanceof Application) {
            return (Application) context;
        }
        if (context instanceof Activity) {
            return ((Activity) context).getApplication();
        }
        try {
            return (Application) context.getApplicationContext();
        } catch (ClassCastException unused) {
            AFLogger.afErrorLog("Application or Activity Context should be used", new IllegalStateException(), true, true);
            return null;
        }
    }

    public static boolean getCurrencyIso4217Code(@androidx.annotation.p0 Context context) {
        if (context != null) {
            try {
                AppSet.getClient(context);
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public static boolean getMediationNetwork() {
        return Build.BRAND.equals("OPPO");
    }

    public static boolean getMonetizationNetwork(@androidx.annotation.p0 Context context) {
        if (context == null) {
            return false;
        }
        try {
            IntegrityManagerFactory.create(context);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    @e.a({"NewApi"})
    public static boolean getRevenue(@androidx.annotation.p0 Context context) {
        if (context != null && Build.VERSION.SDK_INT >= 33) {
            try {
                return androidx.privacysandbox.ads.adservices.measurement.n.a(context.getApplicationContext().getSystemService(androidx.privacysandbox.ads.adservices.measurement.m.a())) != null;
            } catch (Throwable th2) {
                AFLogger.INSTANCE.e(AFg1cSDK.PRIVACY_SANDBOX, th2.getMessage() != null ? th2.getMessage() : "", th2, false, false);
            }
        }
        return false;
    }

    public static String getMediationNetwork(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (PackageManager.NameNotFoundException e10) {
            AFLogger.afErrorLog(e10.getMessage(), e10);
            return "";
        }
    }

    public static boolean getMonetizationNetwork(Context context, String str) {
        int iCheckPermission = context.checkPermission(str, Process.myPid(), Process.myUid());
        StringBuilder sb2 = new StringBuilder("is Permission Available: ");
        sb2.append(str);
        sb2.append("; res: ");
        sb2.append(iCheckPermission);
        AFLogger.afRDLog(sb2.toString());
        return iCheckPermission == 0;
    }

    public static long AFAdRevenueData(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).getLongVersionCode();
        } catch (PackageManager.NameNotFoundException e10) {
            AFLogger.afErrorLog(e10.getMessage(), e10);
            return 0L;
        }
    }
}
