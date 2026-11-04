package com.facebook.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookActivity;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final k f99938a = new k();

    public interface a {
        @Nullable
        Bundle a();

        @Nullable
        Bundle getParameters();
    }

    public static final class b extends g.a<Intent, Pair<Integer, Intent>> {
        b() {
        }

        @Override // g.a
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Intent createIntent(@NotNull Context context, @NotNull Intent input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            return input;
        }

        @Override // g.a
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Pair<Integer, Intent> parseResult(int i10, @Nullable Intent intent) {
            Pair<Integer, Intent> pairCreate = Pair.create(Integer.valueOf(i10), intent);
            Intrinsics.checkNotNullExpressionValue(pairCreate, "create(resultCode, intent)");
            return pairCreate;
        }
    }

    private k() {
    }

    @oj.n
    public static final boolean b(@NotNull i feature) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        return e(feature).f() != -1;
    }

    @oj.n
    public static final boolean c(@NotNull i feature) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        return f99938a.d(feature) != null;
    }

    private final Uri d(i iVar) {
        String strName = iVar.name();
        String strK0 = iVar.k0();
        com.facebook.g0 g0Var = com.facebook.g0.f99617a;
        x.b bVarA = x.f100221t.a(com.facebook.g0.o(), strK0, strName);
        if (bVarA != null) {
            return bVarA.b();
        }
        return null;
    }

    @oj.n
    @NotNull
    public static final w0.f e(@NotNull i feature) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        com.facebook.g0 g0Var = com.facebook.g0.f99617a;
        String strO = com.facebook.g0.o();
        String strK0 = feature.k0();
        int[] iArrF = f99938a.f(strO, strK0, feature);
        w0 w0Var = w0.f100148a;
        return w0.v(strK0, iArrF);
    }

    private final int[] f(String str, String str2, i iVar) {
        x.b bVarA = x.f100221t.a(str, str2, iVar.name());
        int[] iArrD = bVarA == null ? null : bVarA.d();
        return iArrD == null ? new int[]{iVar.l0()} : iArrD;
    }

    @oj.n
    public static final void g(@NotNull Context context, @NotNull String eventName, @NotNull String outcome) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(outcome, "outcome");
        com.facebook.appevents.f0 f0Var = new com.facebook.appevents.f0(context);
        Bundle bundle = new Bundle();
        bundle.putString(com.facebook.internal.a.f99693r, outcome);
        f0Var.m(eventName, bundle);
    }

    @oj.n
    public static final void h(@NotNull com.facebook.internal.b appCall, @NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(appCall, "appCall");
        Intrinsics.checkNotNullParameter(activity, "activity");
        activity.startActivityForResult(appCall.f(), appCall.e());
        appCall.g();
    }

    @oj.n
    public static final void i(@NotNull com.facebook.internal.b appCall, @NotNull androidx.activity.result.k registry, @Nullable com.facebook.k kVar) {
        Intrinsics.checkNotNullParameter(appCall, "appCall");
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intent intentF = appCall.f();
        if (intentF == null) {
            return;
        }
        r(registry, kVar, intentF, appCall.e());
        appCall.g();
    }

    @oj.n
    public static final void j(@NotNull com.facebook.internal.b appCall, @NotNull h0 fragmentWrapper) {
        Intrinsics.checkNotNullParameter(appCall, "appCall");
        Intrinsics.checkNotNullParameter(fragmentWrapper, "fragmentWrapper");
        fragmentWrapper.d(appCall.f(), appCall.e());
        appCall.g();
    }

    @oj.n
    public static final void k(@NotNull com.facebook.internal.b appCall) {
        Intrinsics.checkNotNullParameter(appCall, "appCall");
        o(appCall, new com.facebook.u("Unable to show the provided content via the web or the installed version of the Facebook app. Some dialogs are only supported starting API 14."));
    }

    @oj.n
    public static final void l(@NotNull com.facebook.internal.b appCall, @Nullable String str, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(appCall, "appCall");
        f1 f1Var = f1.f99837a;
        com.facebook.g0 g0Var = com.facebook.g0.f99617a;
        Context contextN = com.facebook.g0.n();
        h hVar = h.f99880a;
        f1.h(contextN, h.b());
        f1.k(com.facebook.g0.n());
        Intent intent = new Intent(com.facebook.g0.n(), (Class<?>) CustomTabMainActivity.class);
        intent.putExtra(CustomTabMainActivity.f98464d, str);
        intent.putExtra(CustomTabMainActivity.f98465e, bundle);
        intent.putExtra(CustomTabMainActivity.f98466f, h.a());
        w0 w0Var = w0.f100148a;
        w0.E(intent, appCall.d().toString(), str, w0.y(), null);
        appCall.i(intent);
    }

    @oj.n
    public static final void m(@NotNull com.facebook.internal.b appCall, @Nullable com.facebook.u uVar) {
        Intrinsics.checkNotNullParameter(appCall, "appCall");
        if (uVar == null) {
            return;
        }
        f1 f1Var = f1.f99837a;
        com.facebook.g0 g0Var = com.facebook.g0.f99617a;
        f1.i(com.facebook.g0.n());
        Intent intent = new Intent();
        intent.setClass(com.facebook.g0.n(), FacebookActivity.class);
        intent.setAction(FacebookActivity.f98476c);
        w0 w0Var = w0.f100148a;
        w0.E(intent, appCall.d().toString(), null, w0.y(), w0.i(uVar));
        appCall.i(intent);
    }

    @oj.n
    public static final void n(@NotNull com.facebook.internal.b appCall, @NotNull a parameterProvider, @NotNull i feature) {
        Intrinsics.checkNotNullParameter(appCall, "appCall");
        Intrinsics.checkNotNullParameter(parameterProvider, "parameterProvider");
        Intrinsics.checkNotNullParameter(feature, "feature");
        com.facebook.g0 g0Var = com.facebook.g0.f99617a;
        Context contextN = com.facebook.g0.n();
        String strK0 = feature.k0();
        w0.f fVarE = e(feature);
        int iF = fVarE.f();
        if (iF == -1) {
            throw new com.facebook.u("Cannot present this dialog. This likely means that the Facebook app is not installed.");
        }
        w0 w0Var = w0.f100148a;
        Bundle parameters = w0.D(iF) ? parameterProvider.getParameters() : parameterProvider.a();
        if (parameters == null) {
            parameters = new Bundle();
        }
        Intent intentL = w0.l(contextN, appCall.d().toString(), strK0, fVarE, parameters);
        if (intentL == null) {
            throw new com.facebook.u("Unable to create Intent; this likely means theFacebook app is not installed.");
        }
        appCall.i(intentL);
    }

    @oj.n
    public static final void o(@NotNull com.facebook.internal.b appCall, @Nullable com.facebook.u uVar) {
        Intrinsics.checkNotNullParameter(appCall, "appCall");
        m(appCall, uVar);
    }

    @oj.n
    public static final void p(@NotNull com.facebook.internal.b appCall, @Nullable String str, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(appCall, "appCall");
        f1 f1Var = f1.f99837a;
        com.facebook.g0 g0Var = com.facebook.g0.f99617a;
        f1.i(com.facebook.g0.n());
        f1.k(com.facebook.g0.n());
        Bundle bundle2 = new Bundle();
        bundle2.putString(w0.f100156c1, str);
        bundle2.putBundle("params", bundle);
        Intent intent = new Intent();
        w0 w0Var = w0.f100148a;
        w0.E(intent, appCall.d().toString(), str, w0.y(), bundle2);
        intent.setClass(com.facebook.g0.n(), FacebookActivity.class);
        intent.setAction(o.f100020p2);
        appCall.i(intent);
    }

    @oj.n
    public static final void q(@NotNull com.facebook.internal.b appCall, @Nullable Bundle bundle, @NotNull i feature) {
        Uri uriG;
        Intrinsics.checkNotNullParameter(appCall, "appCall");
        Intrinsics.checkNotNullParameter(feature, "feature");
        f1 f1Var = f1.f99837a;
        com.facebook.g0 g0Var = com.facebook.g0.f99617a;
        f1.i(com.facebook.g0.n());
        f1.k(com.facebook.g0.n());
        String strName = feature.name();
        Uri uriD = f99938a.d(feature);
        if (uriD == null) {
            throw new com.facebook.u("Unable to fetch the Url for the DialogFeature : '" + strName + '\'');
        }
        w0 w0Var = w0.f100148a;
        int iY = w0.y();
        z0 z0Var = z0.f100267a;
        String string = appCall.d().toString();
        Intrinsics.checkNotNullExpressionValue(string, "appCall.callId.toString()");
        Bundle bundleL = z0.l(string, iY, bundle);
        if (bundleL == null) {
            throw new com.facebook.u("Unable to fetch the app's key-hash");
        }
        if (uriD.isRelative()) {
            e1 e1Var = e1.f99794a;
            uriG = e1.g(z0.b(), uriD.toString(), bundleL);
        } else {
            e1 e1Var2 = e1.f99794a;
            uriG = e1.g(uriD.getAuthority(), uriD.getPath(), bundleL);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("url", uriG.toString());
        bundle2.putBoolean(w0.f100162e1, true);
        Intent intent = new Intent();
        w0.E(intent, appCall.d().toString(), feature.k0(), w0.y(), bundle2);
        intent.setClass(com.facebook.g0.n(), FacebookActivity.class);
        intent.setAction(o.f100020p2);
        appCall.i(intent);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [T, androidx.activity.result.h] */
    @oj.n
    public static final void r(@NotNull androidx.activity.result.k registry, @Nullable final com.facebook.k kVar, @NotNull Intent intent, final int i10) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(intent, "intent");
        final kotlin.jvm.internal.i1.h hVar = new kotlin.jvm.internal.i1.h();
        ?? M = registry.m(Intrinsics.stringPlus("facebook-dialog-request-", Integer.valueOf(i10)), new b(), new androidx.activity.result.a() { // from class: com.facebook.internal.j
            @Override // androidx.activity.result.a
            public final void a(Object obj) {
                k.s(kVar, i10, hVar, (Pair) obj);
            }
        });
        hVar.f312751a = M;
        if (M == 0) {
            return;
        }
        M.b(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void s(com.facebook.k kVar, int i10, kotlin.jvm.internal.i1.h launcher, Pair pair) {
        Intrinsics.checkNotNullParameter(launcher, "$launcher");
        if (kVar == null) {
            kVar = new f();
        }
        Object obj = pair.first;
        Intrinsics.checkNotNullExpressionValue(obj, "result.first");
        kVar.e(i10, ((Number) obj).intValue(), (Intent) pair.second);
        androidx.activity.result.h hVar = (androidx.activity.result.h) launcher.f312751a;
        if (hVar == null) {
            return;
        }
        synchronized (hVar) {
            hVar.d();
            launcher.f312751a = null;
            Unit unit = Unit.f312394a;
        }
    }
}
