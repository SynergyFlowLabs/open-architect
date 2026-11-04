package com.facebook.internal;

import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.devtodev.core.data.metrics.MetricConsts;
import com.facebook.AccessToken;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final p0 f100047a = new p0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String f100048b = "is_referrer_updated";

    public interface a {
        void a(@Nullable String str);
    }

    public static final class b implements InstallReferrerStateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InstallReferrerClient f100049a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f100050b;

        b(InstallReferrerClient installReferrerClient, a aVar) {
            this.f100049a = installReferrerClient;
            this.f100050b = aVar;
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void onInstallReferrerServiceDisconnected() {
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void onInstallReferrerSetupFinished(int i10) {
            if (com.facebook.internal.instrument.crashshield.b.e(this)) {
                return;
            }
            try {
                if (i10 != 0) {
                    if (i10 != 2) {
                        return;
                    }
                    p0.f100047a.e();
                    return;
                }
                try {
                    ReferrerDetails installReferrer = this.f100049a.getInstallReferrer();
                    Intrinsics.checkNotNullExpressionValue(installReferrer, "{\n                      referrerClient.installReferrer\n                    }");
                    String installReferrer2 = installReferrer.getInstallReferrer();
                    if (installReferrer2 != null && (StringsKt.V2(installReferrer2, MetricConsts.FacebookInfo, false, 2, null) || StringsKt.V2(installReferrer2, AccessToken.f98376v, false, 2, null))) {
                        this.f100050b.a(installReferrer2);
                    }
                    p0.f100047a.e();
                } catch (RemoteException unused) {
                }
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.b.c(th2, this);
            }
        }
    }

    private p0() {
    }

    private final boolean b() {
        com.facebook.g0 g0Var = com.facebook.g0.f99617a;
        return com.facebook.g0.n().getSharedPreferences(com.facebook.g0.f99639w, 0).getBoolean(f100048b, false);
    }

    private final void c(a aVar) {
        com.facebook.g0 g0Var = com.facebook.g0.f99617a;
        InstallReferrerClient installReferrerClientBuild = InstallReferrerClient.newBuilder(com.facebook.g0.n()).build();
        try {
            installReferrerClientBuild.startConnection(new b(installReferrerClientBuild, aVar));
        } catch (Exception unused) {
        }
    }

    @oj.n
    public static final void d(@NotNull a callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        p0 p0Var = f100047a;
        if (p0Var.b()) {
            return;
        }
        p0Var.c(callback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e() {
        com.facebook.g0 g0Var = com.facebook.g0.f99617a;
        com.facebook.g0.n().getSharedPreferences(com.facebook.g0.f99639w, 0).edit().putBoolean(f100048b, true).apply();
    }
}
