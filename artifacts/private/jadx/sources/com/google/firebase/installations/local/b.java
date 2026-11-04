package com.google.firebase.installations.local;

import android.content.SharedPreferences;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.b0;
import androidx.annotation.l1;
import androidx.annotation.p0;
import com.google.firebase.h;
import com.google.firebase.messaging.FirebaseMessaging;
import com.planner5d.library.engine.input.f;
import com.planner5d.library.services.utility.e0;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f123222c = "com.google.android.gms.appid";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f123223d = "|S||P|";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f123224e = "|S|id";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f123225f = "|T|";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f123226g = "|";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f123227h = "token";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f123228i = "{";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String[] f123229j = {"*", FirebaseMessaging.f123333q, com.google.android.gms.stats.a.B1, ""};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @b0("iidPrefs")
    private final SharedPreferences f123230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f123231b;

    public b(@NonNull h hVar) {
        this.f123230a = hVar.n().getSharedPreferences(f123222c, 0);
        this.f123231b = b(hVar);
    }

    private String a(@NonNull String str, @NonNull String str2) {
        return f123225f + str + f123226g + str2;
    }

    private static String b(h hVar) {
        String strM = hVar.s().m();
        if (strM != null) {
            return strM;
        }
        String strJ = hVar.s().j();
        if (!strJ.startsWith("1:") && !strJ.startsWith("2:")) {
            return strJ;
        }
        String[] strArrSplit = strJ.split(":");
        if (strArrSplit.length != 4) {
            return null;
        }
        String str = strArrSplit[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    @p0
    private static String c(@NonNull PublicKey publicKey) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance(e0.f225194b).digest(publicKey.getEncoded());
            bArrDigest[0] = (byte) (((bArrDigest[0] & com.google.common.base.c.f116464q) + f.b.B) & 255);
            return Base64.encodeToString(bArrDigest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    private String d(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    @p0
    private PublicKey e(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e10) {
            e10.toString();
            return null;
        }
    }

    @p0
    private String g() {
        String string;
        synchronized (this.f123230a) {
            try {
                string = this.f123230a.getString(f123224e, null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return string;
    }

    @p0
    private String h() {
        synchronized (this.f123230a) {
            try {
                String string = this.f123230a.getString(f123223d, null);
                if (string == null) {
                    return null;
                }
                PublicKey publicKeyE = e(string);
                if (publicKeyE == null) {
                    return null;
                }
                return c(publicKeyE);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @p0
    public String f() {
        synchronized (this.f123230a) {
            try {
                String strG = g();
                if (strG != null) {
                    return strG;
                }
                return h();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @p0
    public String i() {
        synchronized (this.f123230a) {
            try {
                for (String str : f123229j) {
                    String string = this.f123230a.getString(a(this.f123231b, str), null);
                    if (string != null && !string.isEmpty()) {
                        if (string.startsWith(f123228i)) {
                            string = d(string);
                        }
                        return string;
                    }
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @l1
    public b(@NonNull SharedPreferences sharedPreferences, @p0 String str) {
        this.f123230a = sharedPreferences;
        this.f123231b = str;
    }
}
