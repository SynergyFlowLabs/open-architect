package com.facebook.login;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Parcel;
import androidx.annotation.l1;
import androidx.fragment.app.Fragment;
import com.facebook.FacebookRequestError;
import com.facebook.internal.e1;
import com.facebook.internal.w0;
import com.facebook.internal.z0;
import com.facebook.j0;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@l1(otherwise = 3)
public abstract class NativeAppLoginMethodHandler extends LoginMethodHandler {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final com.facebook.g f100416g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAppLoginMethodHandler(@NotNull LoginClient loginClient) {
        super(loginClient);
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        this.f100416g = com.facebook.g.FACEBOOK_APPLICATION_WEB;
    }

    private final boolean E(Intent intent) {
        com.facebook.g0 g0Var = com.facebook.g0.f99617a;
        List<ResolveInfo> listQueryIntentActivities = com.facebook.g0.n().getPackageManager().queryIntentActivities(intent, 65536);
        Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "FacebookSdk.getApplicationContext()\n            .packageManager\n            .queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY)");
        return !listQueryIntentActivities.isEmpty();
    }

    private final void F(final LoginClient.Request request, final Bundle bundle) {
        if (bundle.containsKey("code")) {
            e1 e1Var = e1.f99794a;
            if (!e1.Z(bundle.getString("code"))) {
                com.facebook.g0 g0Var = com.facebook.g0.f99617a;
                com.facebook.g0.y().execute(new Runnable() { // from class: com.facebook.login.e0
                    @Override // java.lang.Runnable
                    public final void run() {
                        NativeAppLoginMethodHandler.G(this.f100472a, request, bundle);
                    }
                });
                return;
            }
        }
        D(request, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(NativeAppLoginMethodHandler this$0, LoginClient.Request request, Bundle extras) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(request, "$request");
        Intrinsics.checkNotNullParameter(extras, "$extras");
        try {
            this$0.D(request, this$0.q(request, extras));
        } catch (j0 e10) {
            FacebookRequestError facebookRequestErrorC = e10.c();
            this$0.C(request, facebookRequestErrorC.k(), facebookRequestErrorC.i(), String.valueOf(facebookRequestErrorC.h()));
        } catch (com.facebook.u e11) {
            this$0.C(request, null, e11.getMessage(), null);
        }
    }

    private final void x(LoginClient.Result result) {
        if (result != null) {
            i().i(result);
        } else {
            i().Q();
        }
    }

    @NotNull
    public com.facebook.g A() {
        return this.f100416g;
    }

    protected void B(@Nullable LoginClient.Request request, @NotNull Intent data) {
        Object obj;
        Intrinsics.checkNotNullParameter(data, "data");
        Bundle extras = data.getExtras();
        String strY = y(extras);
        String string = null;
        if (extras != null && (obj = extras.get(w0.R0)) != null) {
            string = obj.toString();
        }
        z0 z0Var = z0.f100267a;
        if (Intrinsics.areEqual(z0.c(), string)) {
            x(LoginClient.Result.f100396i.d(request, strY, z(extras), string));
        } else {
            x(LoginClient.Result.f100396i.a(request, strY));
        }
    }

    protected void C(@Nullable LoginClient.Request request, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        if (str != null && Intrinsics.areEqual(str, "logged_out")) {
            CustomTabLoginMethodHandler.b bVar = CustomTabLoginMethodHandler.f100313s;
            CustomTabLoginMethodHandler.Y = true;
            x(null);
            return;
        }
        z0 z0Var = z0.f100267a;
        if (CollectionsKt.contains(z0.d(), str)) {
            x(null);
        } else if (CollectionsKt.contains(z0.e(), str)) {
            x(LoginClient.Result.f100396i.a(request, null));
        } else {
            x(LoginClient.Result.f100396i.d(request, str, str2, str3));
        }
    }

    protected void D(@NotNull LoginClient.Request request, @NotNull Bundle extras) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(extras, "extras");
        try {
            LoginMethodHandler.a aVar = LoginMethodHandler.f100410c;
            x(LoginClient.Result.f100396i.b(request, aVar.b(request.o(), extras, A(), request.a()), aVar.d(extras, request.n())));
        } catch (com.facebook.u e10) {
            x(LoginClient.Result.c.e(LoginClient.Result.f100396i, request, null, e10.getMessage(), null, 8, null));
        }
    }

    protected boolean H(@Nullable Intent intent, int i10) {
        androidx.activity.result.h<Intent> hVarY;
        if (intent == null || !E(intent)) {
            return false;
        }
        Fragment fragmentQ = i().q();
        Unit unit = null;
        t tVar = fragmentQ instanceof t ? (t) fragmentQ : null;
        if (tVar != null && (hVarY = tVar.y()) != null) {
            hVarY.b(intent);
            unit = Unit.f312394a;
        }
        return unit != null;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public boolean p(int i10, int i11, @Nullable Intent intent) {
        LoginClient.Request requestY = i().y();
        if (intent == null) {
            x(LoginClient.Result.f100396i.a(requestY, "Operation canceled"));
        } else if (i11 == 0) {
            B(requestY, intent);
        } else if (i11 != -1) {
            x(LoginClient.Result.c.e(LoginClient.Result.f100396i, requestY, "Unexpected resultCode from authorization.", null, null, 8, null));
        } else {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                x(LoginClient.Result.c.e(LoginClient.Result.f100396i, requestY, "Unexpected null from returned authorization data.", null, null, 8, null));
                return true;
            }
            String strY = y(extras);
            Object obj = extras.get(w0.R0);
            String string = obj == null ? null : obj.toString();
            String strZ = z(extras);
            String string2 = extras.getString("e2e");
            e1 e1Var = e1.f99794a;
            if (!e1.Z(string2)) {
                n(string2);
            }
            if (strY == null && string == null && strZ == null && requestY != null) {
                F(requestY, extras);
            } else {
                C(requestY, strY, strZ, string);
            }
        }
        return true;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public abstract int v(@NotNull LoginClient.Request request);

    @Nullable
    protected String y(@Nullable Bundle bundle) {
        String string = bundle == null ? null : bundle.getString("error");
        if (string != null) {
            return string;
        }
        if (bundle == null) {
            return null;
        }
        return bundle.getString(w0.P0);
    }

    @Nullable
    protected String z(@Nullable Bundle bundle) {
        String string = bundle == null ? null : bundle.getString(com.facebook.internal.a.Y);
        if (string != null) {
            return string;
        }
        if (bundle == null) {
            return null;
        }
        return bundle.getString("error_description");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAppLoginMethodHandler(@NotNull Parcel source) {
        super(source);
        Intrinsics.checkNotNullParameter(source, "source");
        this.f100416g = com.facebook.g.FACEBOOK_APPLICATION_WEB;
    }
}
