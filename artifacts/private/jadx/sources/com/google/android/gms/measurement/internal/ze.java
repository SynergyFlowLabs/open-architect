package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public final class ze extends l8 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String[] f110833i = {"firebase_", "google_", "ga_"};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String[] f110834j = {"_err"};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f110835k = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SecureRandom f110836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicLong f110837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f110838e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private androidx.privacysandbox.ads.adservices.java.measurement.a f110839f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Boolean f110840g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Integer f110841h;

    ze(h7 h7Var) {
        super(h7Var);
        this.f110841h = null;
        this.f110837d = new AtomicLong(0L);
    }

    static MessageDigest C() {
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                if (messageDigest != null) {
                    return messageDigest;
                }
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    @androidx.annotation.l1
    static long D(byte[] bArr) {
        com.google.android.gms.common.internal.w.r(bArr);
        int length = bArr.length;
        int i10 = 0;
        com.google.android.gms.common.internal.w.x(length > 0);
        long j10 = 0;
        for (int i11 = length - 1; i11 >= 0 && i11 >= bArr.length - 8; i11--) {
            j10 += (((long) bArr[i11]) & 255) << i10;
            i10 += 8;
        }
        return j10;
    }

    static boolean E(Context context, boolean z10) {
        com.google.android.gms.common.internal.w.r(context);
        return F(context, "com.google.android.gms.measurement.AppMeasurementJobService");
    }

    static boolean F(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) != null && serviceInfo.enabled) {
                return true;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    static boolean N(String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith("_")) {
            return false;
        }
        int i10 = 3 | 1;
        return true;
    }

    private static boolean O(String str, String[] strArr) {
        com.google.android.gms.common.internal.w.r(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean U(String str) {
        return !f110834j[0].equals(str);
    }

    public static ArrayList h0(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzah zzahVar = (zzah) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", zzahVar.f110845a);
            bundle.putString("origin", zzahVar.f110846b);
            bundle.putLong(n6.a.C2338a.f332745m, zzahVar.f110848d);
            bundle.putString("name", zzahVar.f110847c.f110875b);
            n8.a(bundle, com.google.android.gms.common.internal.w.r(zzahVar.f110847c.O1()));
            bundle.putBoolean("active", zzahVar.f110849e);
            String str = zzahVar.f110850f;
            if (str != null) {
                bundle.putString(n6.a.C2338a.f332736d, str);
            }
            zzbg zzbgVar = zzahVar.f110851g;
            if (zzbgVar != null) {
                bundle.putString(n6.a.C2338a.f332738f, zzbgVar.f110858a);
                zzbe zzbeVar = zzbgVar.f110859b;
                if (zzbeVar != null) {
                    bundle.putBundle(n6.a.C2338a.f332739g, zzbeVar.n2());
                }
            }
            bundle.putLong(n6.a.C2338a.f332737e, zzahVar.f110852h);
            zzbg zzbgVar2 = zzahVar.f110853i;
            if (zzbgVar2 != null) {
                bundle.putString(n6.a.C2338a.f332740h, zzbgVar2.f110858a);
                zzbe zzbeVar2 = zzbgVar2.f110859b;
                if (zzbeVar2 != null) {
                    bundle.putBundle(n6.a.C2338a.f332741i, zzbeVar2.n2());
                }
            }
            bundle.putLong(n6.a.C2338a.f332747o, zzahVar.f110847c.f110876c);
            bundle.putLong(n6.a.C2338a.f332742j, zzahVar.f110854j);
            zzbg zzbgVar3 = zzahVar.f110855k;
            if (zzbgVar3 != null) {
                bundle.putString(n6.a.C2338a.f332743k, zzbgVar3.f110858a);
                zzbe zzbeVar3 = zzbgVar3.f110859b;
                if (zzbeVar3 != null) {
                    bundle.putBundle(n6.a.C2338a.f332744l, zzbeVar3.n2());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    static boolean j0(Context context) {
        ActivityInfo receiverInfo;
        com.google.android.gms.common.internal.w.r(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) == null || !receiverInfo.enabled) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    @androidx.annotation.m1
    public static void k0(eb ebVar, Bundle bundle, boolean z10) {
        if (bundle != null && ebVar != null) {
            if (!bundle.containsKey("_sc") || z10) {
                String str = ebVar.f109922a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = ebVar.f109923b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", ebVar.f109924c);
                return;
            }
            z10 = false;
        }
        if (bundle != null && ebVar == null && z10) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    static final boolean m0(Bundle bundle, int i10) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i10);
        return true;
    }

    private final Object n0(int i10, Object obj, boolean z10, boolean z11, String str) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
            if (!z11 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : (Parcelable[]) obj) {
                if (parcelable instanceof Bundle) {
                    Bundle bundleQ = Q((Bundle) parcelable, null);
                    if (!bundleQ.isEmpty()) {
                        arrayList.add(bundleQ);
                    }
                }
            }
            return arrayList.toArray(new Bundle[arrayList.size()]);
        }
        return q(obj.toString(), i10, z10);
    }

    private final int o0(String str) {
        if ("_ldl".equals(str)) {
            this.f110184a.w();
            return 2048;
        }
        if ("_id".equals(str)) {
            this.f110184a.w();
            return 256;
        }
        if ("_lgclid".equals(str)) {
            this.f110184a.w();
            return 100;
        }
        this.f110184a.w();
        return 36;
    }

    static boolean r0(String str) {
        com.google.android.gms.common.internal.w.l(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    final void A(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            String simpleName = obj != null ? obj.getClass().getSimpleName() : null;
            h7 h7Var = this.f110184a;
            h7Var.a().t().c("Not putting event parameter. Invalid value type. name, type", h7Var.D().b(str), simpleName);
        }
    }

    final int A0(String str) {
        if (!u0("event param", str)) {
            return 3;
        }
        if (!v0("event param", null, null, str)) {
            return 14;
        }
        this.f110184a.w();
        return !w0("event param", 40, str) ? 3 : 0;
    }

    final void B(ye yeVar, String str, int i10, String str2, String str3, int i11) {
        Bundle bundle = new Bundle();
        m0(bundle, i10);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i10 == 6 || i10 == 7 || i10 == 2) {
            bundle.putLong("_el", i11);
        }
        yeVar.a(str, "_err", bundle);
    }

    final boolean B0(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    final boolean C0(String str, String str2, int i10, Object obj) {
        if (obj == null) {
            return true;
        }
        if (!(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String string = obj.toString();
            if (string.codePointCount(0, string.length()) > i10) {
                this.f110184a.a().t().d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(string.length()));
                return false;
            }
        }
        return true;
    }

    final void D0(String str, String str2, String str3, Bundle bundle, List list, boolean z10) {
        int iZ0;
        String str4;
        int iR;
        list = list;
        if (bundle == null) {
            return;
        }
        h7 h7Var = this.f110184a;
        int i10 = true != h7Var.w().f110184a.C().V(231100000, true) ? 0 : 35;
        int i11 = 0;
        boolean z11 = false;
        for (String str5 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str5)) {
                iZ0 = !z10 ? z0(str5) : 0;
                if (iZ0 == 0) {
                    iZ0 = A0(str5);
                }
            } else {
                iZ0 = 0;
            }
            if (iZ0 != 0) {
                x(bundle, iZ0, str5, iZ0 == 3 ? str5 : null);
                bundle.remove(str5);
            } else {
                if (B0(bundle.get(str5))) {
                    h7Var.a().t().d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str5);
                    iR = 22;
                    str4 = null;
                } else {
                    str4 = null;
                    iR = r(str, str2, str5, bundle.get(str5), bundle, list, z10, false);
                }
                if (iR != 0 && !"_ev".equals(str5)) {
                    x(bundle, iR, str5, bundle.get(str5));
                    bundle.remove(str5);
                } else if (r0(str5) && !O(str5, t8.f110529d)) {
                    i11++;
                    if (!V(231100000, true)) {
                        h7Var.a().q().c("Item array not supported on client's version of Google Play Services (Android Only)", h7Var.D().a(str2), h7Var.D().e(bundle));
                        m0(bundle, 23);
                        bundle.remove(str5);
                    } else if (i11 > i10) {
                        if (!h7Var.w().H(str4, z4.f110762f1) || !z11) {
                            u5 u5VarQ = h7Var.a().q();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 55);
                            sb2.append("Item can't contain more than ");
                            sb2.append(i10);
                            sb2.append(" item-scoped custom params");
                            u5VarQ.c(sb2.toString(), h7Var.D().a(str2), h7Var.D().e(bundle));
                        }
                        m0(bundle, 28);
                        bundle.remove(str5);
                        z11 = true;
                    }
                }
            }
        }
    }

    @androidx.annotation.m1
    final boolean G() {
        h();
        return J() == 1;
    }

    final androidx.privacysandbox.ads.adservices.java.measurement.a H() {
        if (this.f110839f == null) {
            this.f110839f = androidx.privacysandbox.ads.adservices.java.measurement.a.b(this.f110184a.d());
        }
        return this.f110839f;
    }

    final int I() {
        if (Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) <= 3) {
            return 0;
        }
        return SdkExtensions.getExtensionVersion(1000000);
    }

    @androidx.annotation.m1
    final long J() {
        long j10;
        h();
        if (!L(this.f110184a.L().q())) {
            return 0L;
        }
        if (Build.VERSION.SDK_INT < 30) {
            j10 = 4;
        } else if (SdkExtensions.getExtensionVersion(30) < 4) {
            j10 = 8;
        } else {
            h7 h7Var = this.f110184a;
            int I = I();
            h7Var.w();
            int i10 = 4 | 0;
            j10 = I < ((Integer) z4.f110782m0.b(null)).intValue() ? 16L : 0L;
        }
        if (!M("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            j10 |= 2;
        }
        if (j10 == 0 && !K()) {
            j10 = 64;
        }
        if (j10 == 0) {
            return 1L;
        }
        return j10;
    }

    @e.b(30)
    @androidx.annotation.m1
    final boolean K() {
        Object e10;
        Integer num;
        if (this.f110840g == null) {
            androidx.privacysandbox.ads.adservices.java.measurement.a aVarH = H();
            boolean z10 = false;
            int i10 = 2 | 0;
            if (aVarH == null) {
                return false;
            }
            try {
                num = aVarH.c().get(10000L, TimeUnit.MILLISECONDS);
                if (num != null) {
                    try {
                        if (num.intValue() == 1) {
                            z10 = true;
                        }
                    } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e11) {
                        e10 = e11;
                        this.f110184a.a().r().b("Measurement manager api exception", e10);
                        this.f110840g = Boolean.FALSE;
                    }
                }
                this.f110840g = Boolean.valueOf(z10);
            } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e12) {
                e10 = e12;
                num = null;
            }
            this.f110184a.a().w().b("Measurement manager api status result", num);
        }
        return this.f110840g.booleanValue();
    }

    final boolean L(String str) {
        String str2 = (String) z4.f110794s0.b(null);
        return str2.equals("*") || Arrays.asList(str2.split(",")).contains(str);
    }

    @androidx.annotation.m1
    final boolean M(String str) {
        h();
        h7 h7Var = this.f110184a;
        if (com.google.android.gms.common.wrappers.d.a(h7Var.d()).a(str) == 0) {
            return true;
        }
        h7Var.a().v().b("Permission not granted", str);
        return false;
    }

    final boolean P(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        h7 h7Var = this.f110184a;
        String strI = h7Var.w().i();
        h7Var.c();
        return strI.equals(str);
    }

    final Bundle Q(Bundle bundle, String str) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str2 : bundle.keySet()) {
                Object objS = s(str2, bundle.get(str2));
                if (objS == null) {
                    h7 h7Var = this.f110184a;
                    h7Var.a().t().b("Param value can't be null", h7Var.D().b(str2));
                } else {
                    A(bundle2, str2, objS);
                }
            }
        }
        return bundle2;
    }

    final zzbg R(String str, String str2, Bundle bundle, String str3, long j10, boolean z10, boolean z11) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (x0(str2) != 0) {
            h7 h7Var = this.f110184a;
            h7Var.a().o().b("Invalid conditional property event name", h7Var.D().c(str2));
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str3);
        Bundle bundleT = t(str, str2, bundle2, com.google.android.gms.common.util.h.c("_o"), true);
        if (z10) {
            bundleT = Q(bundleT, str);
        }
        com.google.android.gms.common.internal.w.r(bundleT);
        return new zzbg(str2, new zzbe(bundleT), str3, j10);
    }

    @androidx.annotation.l1
    final boolean S(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfoF = com.google.android.gms.common.wrappers.d.a(context).f(str, 64);
            if (packageInfoF != null && (signatureArr = packageInfoF.signatures) != null && signatureArr.length > 0) {
                return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
            }
        } catch (PackageManager.NameNotFoundException e10) {
            this.f110184a.a().o().b("Package name not found", e10);
        } catch (CertificateException e11) {
            this.f110184a.a().o().b("Error obtaining certificate", e11);
        }
        return true;
    }

    final byte[] T(Parcelable parcelable) {
        if (parcelable == null) {
            int i10 = 0 << 0;
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    public final boolean V(int i10, boolean z10) {
        Boolean boolX = this.f110184a.J().x();
        if (W() < i10 / 1000) {
            return (boolX == null || boolX.booleanValue()) ? false : true;
        }
        return true;
    }

    @il.d({"this.apkVersion"})
    public final int W() {
        if (this.f110841h == null) {
            this.f110841h = Integer.valueOf(com.google.android.gms.common.g.i().b(this.f110184a.d()) / 1000);
        }
        return this.f110841h.intValue();
    }

    public final int X(int i10) {
        return com.google.android.gms.common.g.i().k(this.f110184a.d(), 12451000);
    }

    public final long Y(long j10, long j11) {
        return (j10 + (j11 * 60000)) / 86400000;
    }

    @androidx.annotation.m1
    final void Z(Bundle bundle, long j10) {
        long j11 = bundle.getLong("_et");
        if (j11 != 0) {
            this.f110184a.a().r().b("Params already contained engagement", Long.valueOf(j11));
        } else {
            j11 = 0;
        }
        bundle.putLong("_et", j10 + j11);
    }

    public final void a0(com.google.android.gms.internal.measurement.x1 x1Var, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            x1Var.r(bundle);
        } catch (RemoteException e10) {
            this.f110184a.a().r().b("Error returning string value to wrapper", e10);
        }
    }

    public final void b0(com.google.android.gms.internal.measurement.x1 x1Var, long j10) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j10);
        try {
            x1Var.r(bundle);
        } catch (RemoteException e10) {
            this.f110184a.a().r().b("Error returning long value to wrapper", e10);
        }
    }

    public final void c0(com.google.android.gms.internal.measurement.x1 x1Var, int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i10);
        try {
            x1Var.r(bundle);
        } catch (RemoteException e10) {
            this.f110184a.a().r().b("Error returning int value to wrapper", e10);
        }
    }

    public final void d0(com.google.android.gms.internal.measurement.x1 x1Var, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            x1Var.r(bundle);
        } catch (RemoteException e10) {
            this.f110184a.a().r().b("Error returning byte array to wrapper", e10);
        }
    }

    public final void e0(com.google.android.gms.internal.measurement.x1 x1Var, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z10);
        try {
            x1Var.r(bundle);
        } catch (RemoteException e10) {
            this.f110184a.a().r().b("Error returning boolean value to wrapper", e10);
        }
    }

    public final void f0(com.google.android.gms.internal.measurement.x1 x1Var, Bundle bundle) {
        try {
            x1Var.r(bundle);
        } catch (RemoteException e10) {
            this.f110184a.a().r().b("Error returning bundle value to wrapper", e10);
        }
    }

    public final void g0(com.google.android.gms.internal.measurement.x1 x1Var, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            x1Var.r(bundle);
        } catch (RemoteException e10) {
            this.f110184a.a().r().b("Error returning bundle list to wrapper", e10);
        }
    }

    @Override // com.google.android.gms.measurement.internal.l8
    protected final boolean i() {
        return true;
    }

    public final URL i0(long j10, String str, String str2, long j11, String str3) {
        try {
            com.google.android.gms.common.internal.w.l(str2);
            com.google.android.gms.common.internal.w.l(str);
            String strConcat = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", 133005L, Integer.valueOf(W())), str2, str, Long.valueOf(j11));
            if (str.equals(this.f110184a.w().j())) {
                strConcat = strConcat.concat("&ddl_test=1");
            }
            if (!str3.isEmpty()) {
                if (str3.charAt(0) != '&') {
                    strConcat = strConcat.concat("&");
                }
                strConcat = strConcat.concat(str3);
            }
            return new URL(strConcat);
        } catch (IllegalArgumentException | MalformedURLException e10) {
            this.f110184a.a().o().b("Failed to create BOW URL for Deferred Deep Link. exception", e10.getMessage());
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.l8
    @androidx.annotation.m1
    protected final void j() {
        h();
        SecureRandom secureRandom = new SecureRandom();
        long jNextLong = secureRandom.nextLong();
        if (jNextLong == 0) {
            jNextLong = secureRandom.nextLong();
            if (jNextLong == 0) {
                this.f110184a.a().r().a("Utils falling back to Random for random id");
            }
        }
        this.f110837d.set(jNextLong);
    }

    final String l0() {
        byte[] bArr = new byte[16];
        q0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    final boolean o(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f110184a.a().q().a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            return false;
        }
        com.google.android.gms.common.internal.w.r(str);
        if (str.matches("^1:\\d+:android:[a-f0-9]+$")) {
            return true;
        }
        this.f110184a.a().q().b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", w5.x(str));
        return false;
    }

    final boolean p(String str, String str2) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        boolean zIsEmpty2 = TextUtils.isEmpty(str2);
        if (!zIsEmpty && !zIsEmpty2) {
            com.google.android.gms.common.internal.w.r(str);
            if (!str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public final long p0() {
        long andIncrement;
        long j10;
        AtomicLong atomicLong = this.f110837d;
        if (atomicLong.get() != 0) {
            AtomicLong atomicLong2 = this.f110837d;
            synchronized (atomicLong2) {
                atomicLong2.compareAndSet(-1L, 1L);
                andIncrement = atomicLong2.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (atomicLong) {
            long jNextLong = new Random(System.nanoTime() ^ this.f110184a.e().currentTimeMillis()).nextLong();
            int i10 = this.f110838e + 1;
            this.f110838e = i10;
            j10 = jNextLong + ((long) i10);
        }
        return j10;
    }

    public final String q(String str, int i10, boolean z10) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) > i10) {
            return z10 ? String.valueOf(str.substring(0, str.offsetByCodePoints(0, i10))).concat("...") : null;
        }
        return str;
    }

    @il.d({"this.secureRandom"})
    @androidx.annotation.m1
    final SecureRandom q0() {
        h();
        if (this.f110836c == null) {
            this.f110836c = new SecureRandom();
        }
        return this.f110836c;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a6  */
    @androidx.annotation.m1
    final int r(String str, String str2, String str3, Object obj, Bundle bundle, List list, boolean z10, boolean z11) {
        int i10;
        int size;
        h();
        if (!B0(obj)) {
            i10 = 0;
        } else {
            if (!z11) {
                return 21;
            }
            if (!O(str3, t8.f110528c)) {
                return 20;
            }
            xc xcVarJ = this.f110184a.J();
            xcVarJ.h();
            xcVarJ.j();
            if (xcVarJ.y() && xcVarJ.f110184a.C().W() < 200900) {
                return 25;
            }
            h7 h7Var = this.f110184a;
            h7Var.w();
            boolean z12 = obj instanceof Parcelable[];
            if (z12) {
                size = ((Parcelable[]) obj).length;
            } else if (obj instanceof ArrayList) {
                size = ((ArrayList) obj).size();
            } else {
                i10 = 0;
            }
            if (size > 200) {
                h7Var.a().t().d("Parameter array is too long; discarded. Value kind, name, array length", "param", str3, Integer.valueOf(size));
                h7Var.w();
                if (z12) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    if (parcelableArr.length > 200) {
                        bundle.putParcelableArray(str3, (Parcelable[]) Arrays.copyOf(parcelableArr, 200));
                    }
                } else if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    if (arrayList.size() > 200) {
                        bundle.putParcelableArrayList(str3, new ArrayList<>(arrayList.subList(0, 200)));
                    }
                }
                i10 = 17;
            } else {
                i10 = 0;
            }
        }
        if (!C0("param", str3, (N(str2) || N(str3)) ? this.f110184a.w().y(null, false) : this.f110184a.w().x(null, false), obj)) {
            if (!z11) {
                return 4;
            }
            if (obj instanceof Bundle) {
                D0(str, str2, str3, (Bundle) obj, list, z10);
                return i10;
            }
            if (obj instanceof Parcelable[]) {
                for (Parcelable parcelable : (Parcelable[]) obj) {
                    if (!(parcelable instanceof Bundle)) {
                        this.f110184a.a().t().c("All Parcelable[] elements must be of type Bundle. Value type, name", parcelable.getClass(), str3);
                        return 4;
                    }
                    D0(str, str2, str3, (Bundle) parcelable, list, z10);
                }
            } else {
                if (!(obj instanceof ArrayList)) {
                    return 4;
                }
                ArrayList arrayList2 = (ArrayList) obj;
                int size2 = arrayList2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    Object obj2 = arrayList2.get(i11);
                    if (!(obj2 instanceof Bundle)) {
                        this.f110184a.a().t().c("All ArrayList elements must be of type Bundle. Value type, name", obj2 != null ? obj2.getClass() : AbstractJsonLexerKt.NULL, str3);
                        return 4;
                    }
                    D0(str, str2, str3, (Bundle) obj2, list, z10);
                }
            }
        }
        return i10;
    }

    final Object s(String str, Object obj) {
        if ("_ev".equals(str)) {
            return n0(this.f110184a.w().y(null, false), obj, true, true, null);
        }
        return n0(N(str) ? this.f110184a.w().y(null, false) : this.f110184a.w().x(null, false), obj, false, true, null);
    }

    final Bundle s0(Uri uri) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        String queryParameter5;
        String queryParameter6;
        String queryParameter7;
        String queryParameter8;
        String queryParameter9;
        if (uri != null) {
            try {
                if (uri.isHierarchical()) {
                    queryParameter = uri.getQueryParameter("utm_campaign");
                    queryParameter2 = uri.getQueryParameter("utm_source");
                    queryParameter3 = uri.getQueryParameter("utm_medium");
                    queryParameter4 = uri.getQueryParameter("gclid");
                    queryParameter5 = uri.getQueryParameter("gbraid");
                    queryParameter6 = uri.getQueryParameter("utm_id");
                    queryParameter7 = uri.getQueryParameter("dclid");
                    queryParameter8 = uri.getQueryParameter("srsltid");
                    queryParameter9 = uri.getQueryParameter("sfmc_id");
                } else {
                    queryParameter = null;
                    queryParameter2 = null;
                    queryParameter3 = null;
                    queryParameter4 = null;
                    queryParameter5 = null;
                    queryParameter6 = null;
                    queryParameter7 = null;
                    queryParameter8 = null;
                    queryParameter9 = null;
                }
                if (TextUtils.isEmpty(queryParameter) && TextUtils.isEmpty(queryParameter2) && TextUtils.isEmpty(queryParameter3) && TextUtils.isEmpty(queryParameter4) && TextUtils.isEmpty(queryParameter5) && TextUtils.isEmpty(queryParameter6) && TextUtils.isEmpty(queryParameter7) && TextUtils.isEmpty(queryParameter8) && TextUtils.isEmpty(queryParameter9)) {
                    return null;
                }
                Bundle bundle = new Bundle();
                if (!TextUtils.isEmpty(queryParameter)) {
                    bundle.putString("campaign", queryParameter);
                }
                if (!TextUtils.isEmpty(queryParameter2)) {
                    bundle.putString("source", queryParameter2);
                }
                if (!TextUtils.isEmpty(queryParameter3)) {
                    bundle.putString("medium", queryParameter3);
                }
                if (!TextUtils.isEmpty(queryParameter4)) {
                    bundle.putString("gclid", queryParameter4);
                }
                if (!TextUtils.isEmpty(queryParameter5)) {
                    bundle.putString("gbraid", queryParameter5);
                }
                String queryParameter10 = uri.getQueryParameter("gad_source");
                if (!TextUtils.isEmpty(queryParameter10)) {
                    bundle.putString("gad_source", queryParameter10);
                }
                String queryParameter11 = uri.getQueryParameter("utm_term");
                if (!TextUtils.isEmpty(queryParameter11)) {
                    bundle.putString(FirebaseAnalytics.d.O, queryParameter11);
                }
                String queryParameter12 = uri.getQueryParameter("utm_content");
                if (!TextUtils.isEmpty(queryParameter12)) {
                    bundle.putString(FirebaseAnalytics.d.P, queryParameter12);
                }
                String queryParameter13 = uri.getQueryParameter(FirebaseAnalytics.d.Q);
                if (!TextUtils.isEmpty(queryParameter13)) {
                    bundle.putString(FirebaseAnalytics.d.Q, queryParameter13);
                }
                String queryParameter14 = uri.getQueryParameter(FirebaseAnalytics.d.R);
                if (!TextUtils.isEmpty(queryParameter14)) {
                    bundle.putString(FirebaseAnalytics.d.R, queryParameter14);
                }
                String queryParameter15 = uri.getQueryParameter("anid");
                if (!TextUtils.isEmpty(queryParameter15)) {
                    bundle.putString("anid", queryParameter15);
                }
                if (!TextUtils.isEmpty(queryParameter6)) {
                    bundle.putString(FirebaseAnalytics.d.S, queryParameter6);
                }
                if (!TextUtils.isEmpty(queryParameter7)) {
                    bundle.putString("dclid", queryParameter7);
                }
                String queryParameter16 = uri.getQueryParameter("utm_source_platform");
                if (!TextUtils.isEmpty(queryParameter16)) {
                    bundle.putString(FirebaseAnalytics.d.T, queryParameter16);
                }
                String queryParameter17 = uri.getQueryParameter("utm_creative_format");
                if (!TextUtils.isEmpty(queryParameter17)) {
                    bundle.putString(FirebaseAnalytics.d.U, queryParameter17);
                }
                String queryParameter18 = uri.getQueryParameter("utm_marketing_tactic");
                if (!TextUtils.isEmpty(queryParameter18)) {
                    bundle.putString(FirebaseAnalytics.d.V, queryParameter18);
                }
                if (!TextUtils.isEmpty(queryParameter8)) {
                    bundle.putString("srsltid", queryParameter8);
                }
                if (!TextUtils.isEmpty(queryParameter9)) {
                    bundle.putString("sfmc_id", queryParameter9);
                }
                for (String str : uri.getQueryParameterNames()) {
                    if (str.startsWith("gad_")) {
                        String queryParameter19 = uri.getQueryParameter(str);
                        if (!TextUtils.isEmpty(queryParameter19)) {
                            bundle.putString(str, queryParameter19);
                        }
                    }
                }
                return bundle;
            } catch (UnsupportedOperationException e10) {
                this.f110184a.a().r().b("Install referrer url isn't a hierarchical URI", e10);
            }
        }
        return null;
    }

    final Bundle t(String str, String str2, Bundle bundle, List list, boolean z10) {
        int iZ0;
        boolean zO = O(str2, s8.f110478d);
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        h7 h7Var = this.f110184a;
        int iV = h7Var.w().v();
        int i10 = 0;
        boolean z11 = false;
        for (String str3 : new TreeSet(bundle.keySet())) {
            if (list == 0 || !list.contains(str3)) {
                iZ0 = !z10 ? z0(str3) : 0;
                if (iZ0 == 0) {
                    iZ0 = A0(str3);
                }
            } else {
                iZ0 = 0;
            }
            if (iZ0 != 0) {
                x(bundle2, iZ0, str3, iZ0 == 3 ? str3 : null);
                bundle2.remove(str3);
            } else {
                int iR = r(str, str2, str3, bundle.get(str3), bundle2, list, z10, zO);
                if (iR == 17) {
                    x(bundle2, 17, str3, Boolean.FALSE);
                } else if (iR != 0 && !"_ev".equals(str3)) {
                    x(bundle2, iR, iR == 21 ? str2 : str3, bundle.get(str3));
                    bundle2.remove(str3);
                }
                if (r0(str3) && (i10 = i10 + 1) > iV) {
                    if (!h7Var.w().H(null, z4.f110762f1) || !z11) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(iV).length() + 37);
                        sb2.append("Event can't contain more than ");
                        sb2.append(iV);
                        sb2.append(" params");
                        h7Var.a().q().c(sb2.toString(), h7Var.D().a(str2), h7Var.D().e(bundle));
                    }
                    m0(bundle2, 5);
                    bundle2.remove(str3);
                    z11 = true;
                }
            }
        }
        return bundle2;
    }

    final boolean t0(String str, String str2) {
        if (str2 == null) {
            this.f110184a.a().q().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            this.f110184a.a().q().b("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            this.f110184a.a().q().c("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                this.f110184a.a().q().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    final void u(x5 x5Var, int i10) {
        Bundle bundle = x5Var.f110667d;
        int i11 = 0;
        boolean z10 = false;
        for (String str : new TreeSet(bundle.keySet())) {
            if (r0(str) && (i11 = i11 + 1) > i10) {
                h7 h7Var = this.f110184a;
                if (!h7Var.w().H(null, z4.f110762f1) || !z10) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 37);
                    sb2.append("Event can't contain more than ");
                    sb2.append(i10);
                    sb2.append(" params");
                    h7Var.a().q().c(sb2.toString(), h7Var.D().a(x5Var.f110664a), h7Var.D().e(bundle));
                    m0(bundle, 5);
                }
                bundle.remove(str);
                z10 = true;
            }
        }
    }

    final boolean u0(String str, String str2) {
        if (str2 == null) {
            this.f110184a.a().q().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            this.f110184a.a().q().b("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            if (iCodePointAt != 95) {
                this.f110184a.a().q().c("Name must start with a letter or _ (underscore). Type, name", str, str2);
                return false;
            }
            iCodePointAt = 95;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                this.f110184a.a().q().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    final void v(Parcelable[] parcelableArr, int i10) {
        com.google.android.gms.common.internal.w.r(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            int i11 = 0;
            boolean z10 = false;
            for (String str : new TreeSet(bundle.keySet())) {
                if (r0(str) && !O(str, t8.f110529d) && (i11 = i11 + 1) > i10) {
                    h7 h7Var = this.f110184a;
                    if (!h7Var.w().H(null, z4.f110762f1) || !z10) {
                        u5 u5VarQ = h7Var.a().q();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 60);
                        sb2.append("Param can't contain more than ");
                        sb2.append(i10);
                        sb2.append(" item-scoped custom parameters");
                        u5VarQ.c(sb2.toString(), h7Var.D().b(str), h7Var.D().e(bundle));
                    }
                    m0(bundle, 28);
                    bundle.remove(str);
                    z10 = true;
                }
            }
        }
    }

    final boolean v0(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            this.f110184a.a().q().b("Name is required and can't be null. Type", str);
            return false;
        }
        com.google.android.gms.common.internal.w.r(str2);
        String[] strArr3 = f110833i;
        for (int i10 = 0; i10 < 3; i10++) {
            if (str2.startsWith(strArr3[i10])) {
                this.f110184a.a().q().c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !O(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && O(str2, strArr2)) {
            return true;
        }
        this.f110184a.a().q().c("Name is reserved. Type, name", str, str2);
        return false;
    }

    final void w(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                this.f110184a.C().A(bundle, str, bundle2.get(str));
            }
        }
    }

    final boolean w0(String str, int i10, String str2) {
        if (str2 == null) {
            this.f110184a.a().q().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i10) {
            return true;
        }
        this.f110184a.a().q().d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i10), str2);
        return false;
    }

    final void x(Bundle bundle, int i10, String str, Object obj) {
        if (m0(bundle, i10)) {
            this.f110184a.w();
            bundle.putString("_ev", q(str, 40, true));
            if (obj != null) {
                com.google.android.gms.common.internal.w.r(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    final int x0(String str) {
        if (!u0(androidx.core.app.w.I0, str)) {
            return 2;
        }
        if (!v0(androidx.core.app.w.I0, s8.f110475a, s8.f110476b, str)) {
            return 13;
        }
        this.f110184a.w();
        return !w0(androidx.core.app.w.I0, 40, str) ? 2 : 0;
    }

    final int y(String str, Object obj) {
        return "_ldl".equals(str) ? C0("user property referrer", str, o0(str), obj) : C0("user property", str, o0(str), obj) ? 0 : 7;
    }

    final int y0(String str) {
        if (!u0("user property", str)) {
            return 6;
        }
        if (!v0("user property", u8.f110583a, null, str)) {
            return 15;
        }
        this.f110184a.w();
        return !w0("user property", 24, str) ? 6 : 0;
    }

    final Object z(String str, Object obj) {
        if ("_ldl".equals(str)) {
            return n0(o0(str), obj, true, false, null);
        }
        boolean z10 = false | false;
        return n0(o0(str), obj, false, false, null);
    }

    final int z0(String str) {
        if (!t0("event param", str)) {
            return 3;
        }
        if (!v0("event param", null, null, str)) {
            return 14;
        }
        this.f110184a.w();
        return !w0("event param", 40, str) ? 3 : 0;
    }
}
