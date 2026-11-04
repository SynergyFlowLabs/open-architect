package androidx.core.hardware.fingerprint;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.a1;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.core.os.f;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP_PREFIX})
@Deprecated
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f47860a;

    /* JADX INFO: renamed from: androidx.core.hardware.fingerprint.a$a, reason: collision with other inner class name */
    class C0389a extends FingerprintManager.AuthenticationCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f47861a;

        C0389a(c cVar) {
            this.f47861a = cVar;
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationError(int i10, CharSequence charSequence) {
            this.f47861a.a(i10, charSequence);
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationFailed() {
            this.f47861a.b();
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationHelp(int i10, CharSequence charSequence) {
            this.f47861a.c(i10, charSequence);
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
            this.f47861a.d(new d(a.g(b.b(authenticationResult))));
        }
    }

    @w0(23)
    static class b {
        private b() {
        }

        @a1("android.permission.USE_FINGERPRINT")
        static void a(Object obj, Object obj2, CancellationSignal cancellationSignal, int i10, Object obj3, Handler handler) {
            ((FingerprintManager) obj).authenticate((FingerprintManager.CryptoObject) obj2, cancellationSignal, i10, (FingerprintManager.AuthenticationCallback) obj3, handler);
        }

        static FingerprintManager.CryptoObject b(Object obj) {
            return ((FingerprintManager.AuthenticationResult) obj).getCryptoObject();
        }

        public static FingerprintManager c(Context context) {
            if (context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
                return (FingerprintManager) context.getSystemService(FingerprintManager.class);
            }
            return null;
        }

        @a1("android.permission.USE_FINGERPRINT")
        static boolean d(Object obj) {
            return ((FingerprintManager) obj).hasEnrolledFingerprints();
        }

        @a1("android.permission.USE_FINGERPRINT")
        static boolean e(Object obj) {
            return ((FingerprintManager) obj).isHardwareDetected();
        }

        public static e f(Object obj) {
            FingerprintManager.CryptoObject cryptoObject = (FingerprintManager.CryptoObject) obj;
            if (cryptoObject == null) {
                return null;
            }
            if (cryptoObject.getCipher() != null) {
                return new e(cryptoObject.getCipher());
            }
            if (cryptoObject.getSignature() != null) {
                return new e(cryptoObject.getSignature());
            }
            return cryptoObject.getMac() != null ? new e(cryptoObject.getMac()) : null;
        }

        public static FingerprintManager.CryptoObject g(e eVar) {
            if (eVar == null) {
                return null;
            }
            if (eVar.a() != null) {
                return new FingerprintManager.CryptoObject(eVar.a());
            }
            if (eVar.c() != null) {
                return new FingerprintManager.CryptoObject(eVar.c());
            }
            return eVar.b() != null ? new FingerprintManager.CryptoObject(eVar.b()) : null;
        }
    }

    public static abstract class c {
        public void a(int i10, @NonNull CharSequence charSequence) {
        }

        public void b() {
        }

        public void c(int i10, @NonNull CharSequence charSequence) {
        }

        public void d(@NonNull d dVar) {
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f47862a;

        public d(@NonNull e eVar) {
            this.f47862a = eVar;
        }

        @NonNull
        public e a() {
            return this.f47862a;
        }
    }

    private a(Context context) {
        this.f47860a = context;
    }

    @NonNull
    public static a c(@NonNull Context context) {
        return new a(context);
    }

    @w0(23)
    @p0
    private static FingerprintManager d(@NonNull Context context) {
        return b.c(context);
    }

    @w0(23)
    static e g(FingerprintManager.CryptoObject cryptoObject) {
        return b.f(cryptoObject);
    }

    @w0(23)
    private static FingerprintManager.AuthenticationCallback h(c cVar) {
        return new C0389a(cVar);
    }

    @w0(23)
    private static FingerprintManager.CryptoObject i(e eVar) {
        return b.g(eVar);
    }

    @a1("android.permission.USE_FINGERPRINT")
    public void a(@p0 e eVar, int i10, @p0 CancellationSignal cancellationSignal, @NonNull c cVar, @p0 Handler handler) {
        FingerprintManager fingerprintManagerD = d(this.f47860a);
        if (fingerprintManagerD != null) {
            b.a(fingerprintManagerD, i(eVar), cancellationSignal, i10, h(cVar), handler);
        }
    }

    @a1("android.permission.USE_FINGERPRINT")
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public void b(@p0 e eVar, int i10, @p0 f fVar, @NonNull c cVar, @p0 Handler handler) {
        a(eVar, i10, fVar != null ? (CancellationSignal) fVar.b() : null, cVar, handler);
    }

    @a1("android.permission.USE_FINGERPRINT")
    public boolean e() {
        FingerprintManager fingerprintManagerD = d(this.f47860a);
        return fingerprintManagerD != null && b.d(fingerprintManagerD);
    }

    @a1("android.permission.USE_FINGERPRINT")
    public boolean f() {
        FingerprintManager fingerprintManagerD = d(this.f47860a);
        return fingerprintManagerD != null && b.e(fingerprintManagerD);
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Signature f47863a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Cipher f47864b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Mac f47865c;

        public e(@NonNull Signature signature) {
            this.f47863a = signature;
            this.f47864b = null;
            this.f47865c = null;
        }

        @p0
        public Cipher a() {
            return this.f47864b;
        }

        @p0
        public Mac b() {
            return this.f47865c;
        }

        @p0
        public Signature c() {
            return this.f47863a;
        }

        public e(@NonNull Cipher cipher) {
            this.f47864b = cipher;
            this.f47863a = null;
            this.f47865c = null;
        }

        public e(@NonNull Mac mac) {
            this.f47865c = mac;
            this.f47864b = null;
            this.f47863a = null;
        }
    }
}
