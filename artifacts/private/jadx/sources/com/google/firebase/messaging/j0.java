package com.google.firebase.messaging;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes5.dex */
class j0 {
    private static final String A = "cliv";
    private static final String B = "gmp_app_id";
    private static final String C = "gmsv";
    private static final String D = "osv";
    private static final String E = "app_ver";
    private static final String F = "app_ver_name";
    private static final String G = "Goog-Firebase-Installations-Auth";
    private static final String H = "firebase-app-name-hash";
    static final String I = "RST_FULL";
    static final String J = "RST";
    static final String K = "SYNC";
    private static final String L = "*";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final String f123604g = "FirebaseMessaging";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f123605h = "registration_id";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f123606i = "unregistered";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f123607j = "error";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final String f123608k = "SERVICE_NOT_AVAILABLE";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final String f123609l = "INTERNAL_SERVER_ERROR";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final String f123610m = "TOO_MANY_SUBSCRIBERS";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final String f123611n = "fire-iid";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final String f123612o = "InternalServerError";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f123613p = "gcm.topic";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f123614q = "/topics/";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    static final String f123615r = "INSTANCE_ID_RESET";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f123616s = "subtype";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f123617t = "sender";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f123618u = "scope";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f123619v = "delete";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f123620w = "iid-operation";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f123621x = "appid";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f123622y = "Firebase-Client";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f123623z = "Firebase-Client-Log-Type";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.firebase.h f123624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p0 f123625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.cloudmessaging.d f123626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final z8.b<com.google.firebase.platforminfo.i> f123627d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final z8.b<com.google.firebase.heartbeatinfo.k> f123628e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.firebase.installations.k f123629f;

    j0(com.google.firebase.h hVar, p0 p0Var, z8.b<com.google.firebase.platforminfo.i> bVar, z8.b<com.google.firebase.heartbeatinfo.k> bVar2, com.google.firebase.installations.k kVar) {
        this(hVar, p0Var, new com.google.android.gms.cloudmessaging.d(hVar.n()), bVar, bVar2, kVar);
    }

    public static /* synthetic */ String a(j0 j0Var, Task task) {
        j0Var.getClass();
        return j0Var.h((Bundle) task.r(IOException.class));
    }

    private static String b(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    private Task<String> d(Task<Bundle> task) {
        return task.m(new androidx.media3.exoplayer.offline.b(), new com.google.android.gms.tasks.c() { // from class: com.google.firebase.messaging.i0
            @Override // com.google.android.gms.tasks.c
            public final Object a(Task task2) {
                return j0.a(this.f123598a, task2);
            }
        });
    }

    private String e() {
        try {
            return b(MessageDigest.getInstance(org.apache.commons.codec.digest.g.f335249c).digest(this.f123624a.r().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    @androidx.annotation.d
    private String h(Bundle bundle) throws IOException {
        if (bundle == null) {
            throw new IOException(f123608k);
        }
        String string = bundle.getString(f123605h);
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString(f123606i);
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString("error");
        if (J.equals(string3)) {
            throw new IOException(f123615r);
        }
        if (string3 != null) {
            throw new IOException(string3);
        }
        bundle.toString();
        new Throwable();
        throw new IOException(f123608k);
    }

    static boolean i(String str) {
        return f123608k.equals(str) || f123609l.equals(str) || f123612o.equals(str);
    }

    private void j(String str, String str2, Bundle bundle) throws ExecutionException, InterruptedException {
        com.google.firebase.heartbeatinfo.k.a aVarA;
        bundle.putString("scope", str2);
        bundle.putString(f123617t, str);
        bundle.putString(f123616s, str);
        bundle.putString(B, this.f123624a.s().j());
        bundle.putString(C, Integer.toString(this.f123625b.d()));
        bundle.putString(D, Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString(E, this.f123625b.a());
        bundle.putString(F, this.f123625b.b());
        bundle.putString(H, e());
        try {
            String strB = ((com.google.firebase.installations.p) com.google.android.gms.tasks.n.a(this.f123629f.b(false))).b();
            if (!TextUtils.isEmpty(strB)) {
                bundle.putString(G, strB);
            }
        } catch (InterruptedException | ExecutionException unused) {
        }
        bundle.putString("appid", (String) com.google.android.gms.tasks.n.a(this.f123629f.getId()));
        bundle.putString(A, "fcm-" + b.f123426d);
        com.google.firebase.heartbeatinfo.k kVar = this.f123628e.get();
        com.google.firebase.platforminfo.i iVar = this.f123627d.get();
        if (kVar != null && iVar != null && (aVarA = kVar.a(f123611n)) != com.google.firebase.heartbeatinfo.k.a.NONE) {
            bundle.putString(f123623z, Integer.toString(aVarA.l()));
            bundle.putString(f123622y, iVar.getUserAgent());
        }
    }

    private Task<Bundle> l(String str, String str2, Bundle bundle) {
        try {
            j(str, str2, bundle);
            return this.f123626c.c(bundle);
        } catch (InterruptedException | ExecutionException e10) {
            return com.google.android.gms.tasks.n.f(e10);
        }
    }

    Task<?> c() {
        Bundle bundle = new Bundle();
        bundle.putString(f123619v, "1");
        return d(l(p0.c(this.f123624a), "*", bundle));
    }

    Task<CloudMessage> f() {
        return this.f123626c.a();
    }

    Task<String> g() {
        return d(l(p0.c(this.f123624a), "*", new Bundle()));
    }

    Task<Void> k(boolean z10) {
        return this.f123626c.d(z10);
    }

    Task<?> m(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(f123613p, f123614q + str2);
        return d(l(str, f123614q + str2, bundle));
    }

    Task<?> n(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(f123613p, f123614q + str2);
        bundle.putString(f123619v, "1");
        return d(l(str, f123614q + str2, bundle));
    }

    @androidx.annotation.l1
    j0(com.google.firebase.h hVar, p0 p0Var, com.google.android.gms.cloudmessaging.d dVar, z8.b<com.google.firebase.platforminfo.i> bVar, z8.b<com.google.firebase.heartbeatinfo.k> bVar2, com.google.firebase.installations.k kVar) {
        this.f123624a = hVar;
        this.f123625b = p0Var;
        this.f123626c = dVar;
        this.f123627d = bVar;
        this.f123628e = bVar2;
        this.f123629f = kVar;
    }
}
