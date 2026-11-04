package androidx.privacysandbox.ads.adservices.internal;

import android.os.Build;
import android.os.ext.SdkExtensions;
import androidx.annotation.u;
import androidx.annotation.w0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f73536a = new a();

    /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.internal.a$a, reason: collision with other inner class name */
    @w0(30)
    private static final class C0707a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C0707a f73537a = new C0707a();

        private C0707a() {
        }

        @u
        public final int a() {
            return SdkExtensions.getExtensionVersion(31);
        }
    }

    @w0(30)
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f73538a = new b();

        private b() {
        }

        @u
        public final int a() {
            return SdkExtensions.getExtensionVersion(1000000);
        }
    }

    private a() {
    }

    public final int a() {
        if (Build.VERSION.SDK_INT >= 33) {
            return b.f73538a.a();
        }
        return 0;
    }

    public final int b() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 31 || i10 == 32) {
            return C0707a.f73537a.a();
        }
        return 0;
    }
}
