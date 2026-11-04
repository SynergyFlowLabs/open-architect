package com.google.firebase.sessions;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final r0 f125074a = new r0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final com.google.firebase.encoders.a f125075b;

    static {
        com.google.firebase.encoders.a aVarJ = new com.google.firebase.encoders.json.e().k(c.f124925b).l(true).j();
        Intrinsics.checkNotNullExpressionValue(aVarJ, "build(...)");
        f125075b = aVarJ;
    }

    private r0() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ q0 b(r0 r0Var, com.google.firebase.h hVar, SessionDetails sessionDetails, com.google.firebase.sessions.settings.i iVar, Map map, String str, String str2, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            map = MapsKt.emptyMap();
        }
        return r0Var.a(hVar, sessionDetails, iVar, map, (i10 & 16) != 0 ? "" : str, (i10 & 32) != 0 ? "" : str2);
    }

    private final f e(com.google.firebase.sessions.api.c cVar) {
        if (cVar == null) {
            return f.COLLECTION_SDK_NOT_INSTALLED;
        }
        return cVar.a() ? f.COLLECTION_ENABLED : f.COLLECTION_DISABLED;
    }

    @NotNull
    public final q0 a(@NotNull com.google.firebase.h firebaseApp, @NotNull SessionDetails sessionDetails, @NotNull com.google.firebase.sessions.settings.i sessionsSettings, @NotNull Map<com.google.firebase.sessions.api.c.a, ? extends com.google.firebase.sessions.api.c> subscribers, @NotNull String firebaseInstallationId, @NotNull String firebaseAuthenticationToken) {
        Intrinsics.checkNotNullParameter(firebaseApp, "firebaseApp");
        Intrinsics.checkNotNullParameter(sessionDetails, "sessionDetails");
        Intrinsics.checkNotNullParameter(sessionsSettings, "sessionsSettings");
        Intrinsics.checkNotNullParameter(subscribers, "subscribers");
        Intrinsics.checkNotNullParameter(firebaseInstallationId, "firebaseInstallationId");
        Intrinsics.checkNotNullParameter(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        return new q0(l.SESSION_START, new x0(sessionDetails.h(), sessionDetails.g(), sessionDetails.i(), sessionDetails.j(), new g(e(subscribers.get(com.google.firebase.sessions.api.c.a.PERFORMANCE)), e(subscribers.get(com.google.firebase.sessions.api.c.a.CRASHLYTICS)), sessionsSettings.a()), firebaseInstallationId, firebaseAuthenticationToken), c(firebaseApp));
    }

    @NotNull
    public final b c(@NotNull com.google.firebase.h firebaseApp) throws PackageManager.NameNotFoundException {
        Intrinsics.checkNotNullParameter(firebaseApp, "firebaseApp");
        Context contextN = firebaseApp.n();
        Intrinsics.checkNotNullExpressionValue(contextN, "getApplicationContext(...)");
        String packageName = contextN.getPackageName();
        PackageInfo packageInfo = contextN.getPackageManager().getPackageInfo(packageName, 0);
        String strValueOf = String.valueOf(packageInfo.getLongVersionCode());
        String strJ = firebaseApp.s().j();
        Intrinsics.checkNotNullExpressionValue(strJ, "getApplicationId(...)");
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        String RELEASE = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
        d0 d0Var = d0.LOG_ENVIRONMENT_PROD;
        Intrinsics.checkNotNull(packageName);
        String str = packageInfo.versionName;
        String str2 = str == null ? strValueOf : str;
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
        l0 l0Var = l0.f125056a;
        Context contextN2 = firebaseApp.n();
        Intrinsics.checkNotNullExpressionValue(contextN2, "getApplicationContext(...)");
        k0 k0VarB = l0Var.b(contextN2);
        Context contextN3 = firebaseApp.n();
        Intrinsics.checkNotNullExpressionValue(contextN3, "getApplicationContext(...)");
        return new b(strJ, MODEL, d.f124971d, RELEASE, d0Var, new a(packageName, str2, strValueOf, MANUFACTURER, k0VarB, l0Var.a(contextN3)));
    }

    @NotNull
    public final com.google.firebase.encoders.a d() {
        return f125075b;
    }
}
