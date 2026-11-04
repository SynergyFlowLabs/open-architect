package u5;

import android.util.Base64;
import com.facebook.g0;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.superwall.sdk.network.Api;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.io.x;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.i1;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c f381188a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String f381189b = "/.well-known/oauth/openid/keys/";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final String f381190c = "SHA256withRSA";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f381191d = 5000;

    private c() {
    }

    @n
    @NotNull
    public static final PublicKey c(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        int i10 = 7 & 4;
        byte[] bArrDecode = Base64.decode(StringsKt.k2(StringsKt.k2(StringsKt.k2(key, "\n", "", false, 4, null), "-----BEGIN PUBLIC KEY-----", "", false, 4, null), "-----END PUBLIC KEY-----", "", false, 4, null), 0);
        Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(pubKeyString, Base64.DEFAULT)");
        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(bArrDecode));
        Intrinsics.checkNotNullExpressionValue(publicKeyGeneratePublic, "kf.generatePublic(x509publicKey)");
        return publicKeyGeneratePublic;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n
    @Nullable
    public static final String d(@NotNull final String kid) {
        Intrinsics.checkNotNullParameter(kid, "kid");
        g0 g0Var = g0.f99617a;
        final URL url = new URL(Api.scheme, Intrinsics.stringPlus("www.", g0.z()), f381189b);
        final ReentrantLock reentrantLock = new ReentrantLock();
        final Condition conditionNewCondition = reentrantLock.newCondition();
        final i1.h hVar = new i1.h();
        g0.y().execute(new Runnable() { // from class: u5.b
            @Override // java.lang.Runnable
            public final void run() {
                c.e(url, hVar, kid, reentrantLock, conditionNewCondition);
            }
        });
        reentrantLock.lock();
        try {
            conditionNewCondition.await(5000L, TimeUnit.MILLISECONDS);
            return (String) hVar.f312751a;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r6v2, types: [T, java.lang.String] */
    public static final void e(URL openIdKeyUrl, i1.h result, String kid, ReentrantLock lock, Condition condition) {
        Intrinsics.checkNotNullParameter(openIdKeyUrl, "$openIdKeyUrl");
        Intrinsics.checkNotNullParameter(result, "$result");
        Intrinsics.checkNotNullParameter(kid, "$kid");
        Intrinsics.checkNotNullParameter(lock, "$lock");
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(openIdKeyUrl.openConnection());
        if (uRLConnection == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
        try {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                Intrinsics.checkNotNullExpressionValue(inputStream, "connection.inputStream");
                String strK = x.k(new BufferedReader(new InputStreamReader(inputStream, Charsets.UTF_8), 8192));
                httpURLConnection.getInputStream().close();
                result.f312751a = new JSONObject(strK).optString(kid);
                httpURLConnection.disconnect();
                lock.lock();
                try {
                    condition.signal();
                    Unit unit = Unit.f312394a;
                } finally {
                    lock.unlock();
                }
            } catch (Throwable th2) {
                httpURLConnection.disconnect();
                lock.lock();
                try {
                    condition.signal();
                    Unit unit2 = Unit.f312394a;
                    throw th2;
                } finally {
                    lock.unlock();
                }
            }
        } catch (Exception e10) {
            f381188a.getClass();
            e10.getMessage();
            httpURLConnection.disconnect();
            lock.lock();
            try {
                condition.signal();
                Unit unit3 = Unit.f312394a;
                lock.unlock();
            } catch (Throwable th3) {
                lock.unlock();
                throw th3;
            }
        }
    }

    @n
    public static final boolean f(@NotNull PublicKey publicKey, @NotNull String data, @NotNull String signature) {
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(signature, "signature");
        try {
            Signature signature2 = Signature.getInstance(f381190c);
            signature2.initVerify(publicKey);
            byte[] bytes = data.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            signature2.update(bytes);
            byte[] bArrDecode = Base64.decode(signature, 8);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(signature, Base64.URL_SAFE)");
            return signature2.verify(bArrDecode);
        } catch (Exception unused) {
            return false;
        }
    }

    @NotNull
    public final String b() {
        return f381189b;
    }
}
