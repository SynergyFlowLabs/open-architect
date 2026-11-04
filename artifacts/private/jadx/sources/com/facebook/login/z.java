package com.facebook.login;

import android.app.Activity;
import android.app.Fragment;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import androidx.annotation.b1;
import androidx.annotation.l1;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.FacebookActivity;
import com.facebook.Profile;
import com.facebook.internal.e1;
import com.facebook.internal.f1;
import com.facebook.internal.w0;
import com.facebook.internal.x0;
import com.facebook.internal.z0;
import com.facebook.q0;
import com.facebook.u0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public class z {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final c f101684j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private static final String f101685k = "publish";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private static final String f101686l = "manage";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private static final String f101687m = "express_login_allowed";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private static final String f101688n = "com.facebook.loginManager";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private static final Set<String> f101689o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    private static final String f101690p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static volatile z f101691q;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final SharedPreferences f101694c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private String f101696e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f101697f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f101699h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f101700i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private p f101692a = p.NATIVE_WITH_FALLBACK;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private com.facebook.login.e f101693b = com.facebook.login.e.FRIENDS;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private String f101695d = z0.I;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private d0 f101698g = d0.FACEBOOK;

    private static final class a implements i0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Activity f101701a;

        public a(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.f101701a = activity;
        }

        @Override // com.facebook.login.i0
        @NotNull
        public Activity a() {
            return this.f101701a;
        }

        @Override // com.facebook.login.i0
        public void startActivityForResult(@NotNull Intent intent, int i10) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            a().startActivityForResult(intent, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b implements i0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final androidx.activity.result.l f101702a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final com.facebook.k f101703b;

        public static final class a extends g.a<Intent, Pair<Integer, Intent>> {
            a() {
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

        /* JADX INFO: renamed from: com.facebook.login.z$b$b, reason: collision with other inner class name */
        public static final class C0915b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @Nullable
            private androidx.activity.result.h<Intent> f101704a;

            @Nullable
            public final androidx.activity.result.h<Intent> a() {
                return this.f101704a;
            }

            public final void b(@Nullable androidx.activity.result.h<Intent> hVar) {
                this.f101704a = hVar;
            }
        }

        public b(@NotNull androidx.activity.result.l activityResultRegistryOwner, @NotNull com.facebook.k callbackManager) {
            Intrinsics.checkNotNullParameter(activityResultRegistryOwner, "activityResultRegistryOwner");
            Intrinsics.checkNotNullParameter(callbackManager, "callbackManager");
            this.f101702a = activityResultRegistryOwner;
            this.f101703b = callbackManager;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(b this$0, C0915b launcherHolder, Pair pair) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(launcherHolder, "$launcherHolder");
            com.facebook.k kVar = this$0.f101703b;
            int iL = com.facebook.internal.f.c.Login.l();
            Object obj = pair.first;
            Intrinsics.checkNotNullExpressionValue(obj, "result.first");
            kVar.e(iL, ((Number) obj).intValue(), (Intent) pair.second);
            androidx.activity.result.h<Intent> hVarA = launcherHolder.a();
            if (hVarA != null) {
                hVarA.d();
            }
            launcherHolder.b(null);
        }

        @Override // com.facebook.login.i0
        @Nullable
        public Activity a() {
            Object obj = this.f101702a;
            if (obj instanceof Activity) {
                return (Activity) obj;
            }
            return null;
        }

        @Override // com.facebook.login.i0
        public void startActivityForResult(@NotNull Intent intent, int i10) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            final C0915b c0915b = new C0915b();
            c0915b.b(this.f101702a.getActivityResultRegistry().m("facebook-login", new a(), new androidx.activity.result.a() { // from class: com.facebook.login.a0
                @Override // androidx.activity.result.a
                public final void a(Object obj) {
                    z.b.c(this.f100440a, c0915b, (Pair) obj);
                }
            }));
            androidx.activity.result.h<Intent> hVarA = c0915b.a();
            if (hVarA == null) {
                return;
            }
            hVarA.b(intent);
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Set<String> f() {
            return SetsKt.setOf((Object[]) new String[]{"ads_management", "create_event", "rsvp_event"});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void g(String str, String str2, String str3, v vVar, u0 u0Var) {
            com.facebook.u uVar = new com.facebook.u(str + ": " + ((Object) str2));
            vVar.q(str3, uVar);
            u0Var.a(uVar);
        }

        @oj.n
        @l1(otherwise = 2)
        @NotNull
        public final b0 c(@NotNull LoginClient.Request request, @NotNull AccessToken newToken, @Nullable AuthenticationToken authenticationToken) {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(newToken, "newToken");
            Set<String> setO = request.o();
            Set mutableSet = CollectionsKt.toMutableSet(CollectionsKt.filterNotNull(newToken.q()));
            if (request.t()) {
                mutableSet.retainAll(setO);
            }
            Set mutableSet2 = CollectionsKt.toMutableSet(CollectionsKt.filterNotNull(setO));
            mutableSet2.removeAll(mutableSet);
            return new b0(newToken, authenticationToken, mutableSet, mutableSet2);
        }

        @oj.n
        @b1({b1.a.LIBRARY_GROUP})
        @Nullable
        public final Map<String, String> d(@Nullable Intent intent) {
            if (intent == null) {
                return null;
            }
            intent.setExtrasClassLoader(LoginClient.Result.class.getClassLoader());
            LoginClient.Result result = (LoginClient.Result) intent.getParcelableExtra(t.f101540g);
            if (result == null) {
                return null;
            }
            return result.f100404h;
        }

        @oj.n
        @NotNull
        public z e() {
            if (z.f101691q == null) {
                synchronized (this) {
                    try {
                        c cVar = z.f101684j;
                        z.f101691q = new z();
                        Unit unit = Unit.f312394a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            z zVar = z.f101691q;
            if (zVar != null) {
                return zVar;
            }
            Intrinsics.throwUninitializedPropertyAccessException("instance");
            throw null;
        }

        @oj.n
        @b1({b1.a.LIBRARY_GROUP})
        public final boolean h(@Nullable String str) {
            boolean z10 = false;
            if (str != null && (StringsKt.u2(str, z.f101685k, false, 2, null) || StringsKt.u2(str, z.f101686l, false, 2, null) || z.f101689o.contains(str))) {
                z10 = true;
            }
            return z10;
        }

        private c() {
        }
    }

    private static final class e implements i0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final com.facebook.internal.h0 f101708a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private final Activity f101709b;

        public e(@NotNull com.facebook.internal.h0 fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            this.f101708a = fragment;
            this.f101709b = fragment.a();
        }

        @Override // com.facebook.login.i0
        @Nullable
        public Activity a() {
            return this.f101709b;
        }

        @Override // com.facebook.login.i0
        public void startActivityForResult(@NotNull Intent intent, int i10) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            this.f101708a.d(intent, i10);
        }
    }

    private static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final f f101710a = new f();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private static v f101711b;

        private f() {
        }

        @Nullable
        public final synchronized v a(@Nullable Context context) {
            if (context == null) {
                try {
                    com.facebook.g0 g0Var = com.facebook.g0.f99617a;
                    context = com.facebook.g0.n();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (context == null) {
                return null;
            }
            if (f101711b == null) {
                com.facebook.g0 g0Var2 = com.facebook.g0.f99617a;
                f101711b = new v(context, com.facebook.g0.o());
            }
            return f101711b;
        }
    }

    static {
        c cVar = new c(null);
        f101684j = cVar;
        f101689o = cVar.f();
        String string = z.class.toString();
        Intrinsics.checkNotNullExpressionValue(string, "LoginManager::class.java.toString()");
        f101690p = string;
    }

    public z() {
        f1 f1Var = f1.f99837a;
        f1.w();
        com.facebook.g0 g0Var = com.facebook.g0.f99617a;
        SharedPreferences sharedPreferences = com.facebook.g0.n().getSharedPreferences(f101688n, 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getApplicationContext().getSharedPreferences(PREFERENCE_LOGIN_MANAGER, Context.MODE_PRIVATE)");
        this.f101694c = sharedPreferences;
        if (com.facebook.g0.L) {
            com.facebook.internal.h hVar = com.facebook.internal.h.f99880a;
            if (com.facebook.internal.h.a() != null) {
                androidx.browser.customtabs.c.b(com.facebook.g0.n(), net.openid.appauth.browser.g.a.f332842a, new com.facebook.login.d());
                androidx.browser.customtabs.c.d(com.facebook.g0.n(), com.facebook.g0.n().getPackageName());
            }
        }
    }

    private final void A0(Context context, final u0 u0Var, long j10) {
        com.facebook.g0 g0Var = com.facebook.g0.f99617a;
        final String strO = com.facebook.g0.o();
        final String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
        final v vVar = new v(context == null ? com.facebook.g0.n() : context, strO);
        if (!B()) {
            vVar.r(string);
            u0Var.onFailure();
            return;
        }
        c0 c0VarA = c0.f100452n.a(context, strO, string, com.facebook.g0.B(), j10, null);
        c0VarA.h(new x0.b() { // from class: com.facebook.login.x
            @Override // com.facebook.internal.x0.b
            public final void a(Bundle bundle) {
                z.B0(string, vVar, u0Var, strO, bundle);
            }
        });
        vVar.s(string);
        if (c0VarA.i()) {
            return;
        }
        vVar.r(string);
        u0Var.onFailure();
    }

    private final boolean B() {
        return this.f101694c.getBoolean(f101687m, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B0(String loggerRef, v logger, u0 responseCallback, String applicationId, Bundle bundle) {
        Intrinsics.checkNotNullParameter(loggerRef, "$loggerRef");
        Intrinsics.checkNotNullParameter(logger, "$logger");
        Intrinsics.checkNotNullParameter(responseCallback, "$responseCallback");
        Intrinsics.checkNotNullParameter(applicationId, "$applicationId");
        if (bundle == null) {
            logger.r(loggerRef);
            responseCallback.onFailure();
            return;
        }
        String string = bundle.getString(w0.K0);
        String string2 = bundle.getString(w0.L0);
        if (string != null) {
            f101684j.g(string, string2, loggerRef, logger, responseCallback);
            return;
        }
        String string3 = bundle.getString(w0.f100214y0);
        e1 e1Var = e1.f99794a;
        Date dateW = e1.w(bundle, w0.f100216z0, new Date(0L));
        ArrayList<String> stringArrayList = bundle.getStringArrayList(w0.f100197q0);
        String string4 = bundle.getString(w0.E0);
        String string5 = bundle.getString("graph_domain");
        Date dateW2 = e1.w(bundle, w0.A0, new Date(0L));
        String strE = (string4 == null || string4.length() == 0) ? null : LoginMethodHandler.f100410c.e(string4);
        if (string3 == null || string3.length() == 0 || stringArrayList == null || stringArrayList.isEmpty() || strE == null || strE.length() == 0) {
            logger.r(loggerRef);
            responseCallback.onFailure();
            return;
        }
        AccessToken accessToken = new AccessToken(string3, applicationId, strE, stringArrayList, null, null, null, dateW, null, dateW2, string5);
        AccessToken.f98366l.p(accessToken);
        Profile.f98555h.a();
        logger.t(loggerRef);
        responseCallback.b(accessToken);
    }

    @oj.n
    @b1({b1.a.LIBRARY_GROUP})
    public static final boolean D(@Nullable String str) {
        return f101684j.h(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E(Context context, LoginClient.Result.a aVar, Map<String, String> map, Exception exc, boolean z10, LoginClient.Request request) {
        v vVarA = f.f101710a.a(context);
        if (vVarA == null) {
            return;
        }
        if (request == null) {
            v.z(vVarA, v.f101562j, "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", null, 4, null);
            return;
        }
        HashMap map2 = new HashMap();
        map2.put(v.B, z10 ? "1" : com.facebook.appevents.p.f99189d0);
        vVarA.m(request.b(), map2, aVar, map, exc, request.r() ? v.f101571s : v.f101562j);
    }

    private final void E0(boolean z10) {
        SharedPreferences.Editor editorEdit = this.f101694c.edit();
        editorEdit.putBoolean(f101687m, z10);
        editorEdit.apply();
    }

    private final void K(androidx.activity.result.l lVar, com.facebook.k kVar, q qVar) {
        L0(new b(lVar, kVar), q(qVar));
    }

    private final void L0(i0 i0Var, LoginClient.Request request) throws com.facebook.u {
        g0(i0Var.a(), request);
        com.facebook.internal.f.f99815b.c(com.facebook.internal.f.c.Login.l(), new com.facebook.internal.f.a() { // from class: com.facebook.login.y
            @Override // com.facebook.internal.f.a
            public final boolean a(int i10, Intent intent) {
                return z.M0(this.f101683a, i10, intent);
            }
        });
        if (N0(i0Var, request)) {
            return;
        }
        com.facebook.u uVar = new com.facebook.u("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
        E(i0Var.a(), LoginClient.Result.a.ERROR, null, uVar, false, request);
        throw uVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean M0(z this$0, int i10, Intent intent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return l0(this$0, i10, intent, null, 4, null);
    }

    private final boolean N0(i0 i0Var, LoginClient.Request request) {
        Intent intentW = w(request);
        if (!x0(intentW)) {
            return false;
        }
        try {
            i0Var.startActivityForResult(intentW, LoginClient.f100364m.b());
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    private final void P0(Collection<String> collection) {
        if (collection == null) {
            return;
        }
        for (String str : collection) {
            if (!f101684j.h(str)) {
                throw new com.facebook.u("Cannot pass a read permission (" + str + ") to a request for publish authorization");
            }
        }
    }

    private final void Q0(Collection<String> collection) {
        if (collection == null) {
            return;
        }
        for (String str : collection) {
            if (f101684j.h(str)) {
                throw new com.facebook.u("Cannot pass a publish or manage permission (" + str + ") to a request for read authorization");
            }
        }
    }

    private final void Y(com.facebook.internal.h0 h0Var, Collection<String> collection) {
        P0(collection);
        i0(h0Var, new q(collection, null, 2, null));
    }

    private final void e0(com.facebook.internal.h0 h0Var, Collection<String> collection) {
        Q0(collection);
        P(h0Var, new q(collection, null, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g0(Context context, LoginClient.Request request) {
        v vVarA = f.f101710a.a(context);
        if (vVarA == null || request == null) {
            return;
        }
        vVarA.v(request, request.r() ? v.f101570r : v.f101561i);
    }

    private final void i0(com.facebook.internal.h0 h0Var, q qVar) {
        P(h0Var, qVar);
    }

    @oj.n
    @l1(otherwise = 2)
    @NotNull
    public static final b0 j(@NotNull LoginClient.Request request, @NotNull AccessToken accessToken, @Nullable AuthenticationToken authenticationToken) {
        return f101684j.c(request, accessToken, authenticationToken);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean l0(z zVar, int i10, Intent intent, com.facebook.p pVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onActivityResult");
        }
        if ((i11 & 4) != 0) {
            pVar = null;
        }
        return zVar.k0(i10, intent, pVar);
    }

    public static /* synthetic */ d n(z zVar, com.facebook.k kVar, String str, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createLogInActivityResultContract");
        }
        if ((i10 & 1) != 0) {
            kVar = null;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        return zVar.m(kVar, str);
    }

    private final void o0(com.facebook.internal.h0 h0Var) {
        L0(new e(h0Var), r());
    }

    private final LoginClient.Request p(q0 q0Var) {
        Set<String> setQ;
        AccessToken accessTokenY = q0Var.m().y();
        List listFilterNotNull = null;
        if (accessTokenY != null && (setQ = accessTokenY.q()) != null) {
            listFilterNotNull = CollectionsKt.filterNotNull(setQ);
        }
        return o(listFilterNotNull);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean q0(z this$0, com.facebook.p pVar, int i10, Intent intent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.k0(i10, intent, pVar);
    }

    private final void s(AccessToken accessToken, AuthenticationToken authenticationToken, LoginClient.Request request, com.facebook.u uVar, boolean z10, com.facebook.p<b0> pVar) {
        if (accessToken != null) {
            AccessToken.f98366l.p(accessToken);
            Profile.f98555h.a();
        }
        if (authenticationToken != null) {
            AuthenticationToken.f98393f.b(authenticationToken);
        }
        if (pVar != null) {
            b0 b0VarC = (accessToken == null || request == null) ? null : f101684j.c(request, accessToken, authenticationToken);
            if (z10 || (b0VarC != null && b0VarC.j().isEmpty())) {
                pVar.onCancel();
                return;
            }
            if (uVar != null) {
                pVar.a(uVar);
            } else {
                if (accessToken == null || b0VarC == null) {
                    return;
                }
                E0(true);
                pVar.b(b0VarC);
            }
        }
    }

    @oj.n
    @b1({b1.a.LIBRARY_GROUP})
    @Nullable
    public static final Map<String, String> v(@Nullable Intent intent) {
        return f101684j.d(intent);
    }

    private final void w0(com.facebook.internal.h0 h0Var, q0 q0Var) {
        L0(new e(h0Var), p(q0Var));
    }

    @oj.n
    @NotNull
    public static z x() {
        return f101684j.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean x0(Intent intent) {
        com.facebook.g0 g0Var = com.facebook.g0.f99617a;
        return com.facebook.g0.n().getPackageManager().resolveActivity(intent, 0) != null;
    }

    public final boolean A() {
        return this.f101700i;
    }

    public final boolean C() {
        return this.f101699h;
    }

    @NotNull
    public final z C0(@NotNull String authType) {
        Intrinsics.checkNotNullParameter(authType, "authType");
        this.f101695d = authType;
        return this;
    }

    @NotNull
    public final z D0(@NotNull com.facebook.login.e defaultAudience) {
        Intrinsics.checkNotNullParameter(defaultAudience, "defaultAudience");
        this.f101693b = defaultAudience;
        return this;
    }

    public final void F(@NotNull Activity activity, @NotNull q loginConfig) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(loginConfig, "loginConfig");
        L0(new a(activity), q(loginConfig));
    }

    @NotNull
    public final z F0(boolean z10) {
        this.f101699h = z10;
        return this;
    }

    public final void G(@NotNull Activity activity, @Nullable Collection<String> collection) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        F(activity, new q(collection, null, 2, null));
    }

    @NotNull
    public final z G0(@NotNull p loginBehavior) {
        Intrinsics.checkNotNullParameter(loginBehavior, "loginBehavior");
        this.f101692a = loginBehavior;
        return this;
    }

    public final void H(@NotNull Activity activity, @Nullable Collection<String> collection, @Nullable String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        int i10 = 5 << 2;
        LoginClient.Request requestQ = q(new q(collection, null, 2, null));
        if (str != null) {
            requestQ.u(str);
        }
        L0(new a(activity), requestQ);
    }

    @NotNull
    public final z H0(@NotNull d0 targetApp) {
        Intrinsics.checkNotNullParameter(targetApp, "targetApp");
        this.f101698g = targetApp;
        return this;
    }

    public final void I(@NotNull Fragment fragment, @Nullable Collection<String> collection) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Q(new com.facebook.internal.h0(fragment), collection);
    }

    @NotNull
    public final z I0(@Nullable String str) {
        this.f101696e = str;
        return this;
    }

    public final void J(@NotNull Fragment fragment, @Nullable Collection<String> collection, @Nullable String str) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        R(new com.facebook.internal.h0(fragment), collection, str);
    }

    @NotNull
    public final z J0(boolean z10) {
        this.f101697f = z10;
        return this;
    }

    @NotNull
    public final z K0(boolean z10) {
        this.f101700i = z10;
        return this;
    }

    public final void L(@NotNull androidx.activity.result.l activityResultRegistryOwner, @NotNull com.facebook.k callbackManager, @NotNull Collection<String> permissions) {
        Intrinsics.checkNotNullParameter(activityResultRegistryOwner, "activityResultRegistryOwner");
        Intrinsics.checkNotNullParameter(callbackManager, "callbackManager");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        K(activityResultRegistryOwner, callbackManager, new q(permissions, null, 2, null));
    }

    public final void M(@NotNull androidx.activity.result.l activityResultRegistryOwner, @NotNull com.facebook.k callbackManager, @NotNull Collection<String> permissions, @Nullable String str) {
        Intrinsics.checkNotNullParameter(activityResultRegistryOwner, "activityResultRegistryOwner");
        Intrinsics.checkNotNullParameter(callbackManager, "callbackManager");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        LoginClient.Request requestQ = q(new q(permissions, null, 2, null));
        if (str != null) {
            requestQ.u(str);
        }
        L0(new b(activityResultRegistryOwner, callbackManager), requestQ);
    }

    public final void N(@NotNull androidx.fragment.app.Fragment fragment, @Nullable Collection<String> collection) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Q(new com.facebook.internal.h0(fragment), collection);
    }

    public final void O(@NotNull androidx.fragment.app.Fragment fragment, @Nullable Collection<String> collection, @Nullable String str) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        R(new com.facebook.internal.h0(fragment), collection, str);
    }

    public final void O0(@Nullable com.facebook.k kVar) {
        if (!(kVar instanceof com.facebook.internal.f)) {
            throw new com.facebook.u("Unexpected CallbackManager, please use the provided Factory.");
        }
        ((com.facebook.internal.f) kVar).d(com.facebook.internal.f.c.Login.l());
    }

    public final void P(@NotNull com.facebook.internal.h0 fragment, @NotNull q loginConfig) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(loginConfig, "loginConfig");
        L0(new e(fragment), q(loginConfig));
    }

    public final void Q(@NotNull com.facebook.internal.h0 fragment, @Nullable Collection<String> collection) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        P(fragment, new q(collection, null, 2, null));
    }

    public final void R(@NotNull com.facebook.internal.h0 fragment, @Nullable Collection<String> collection, @Nullable String str) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        LoginClient.Request requestQ = q(new q(collection, null, 2, null));
        if (str != null) {
            requestQ.u(str);
        }
        L0(new e(fragment), requestQ);
    }

    public final void S(@NotNull androidx.fragment.app.Fragment fragment, @NotNull q loginConfig) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(loginConfig, "loginConfig");
        i0(new com.facebook.internal.h0(fragment), loginConfig);
    }

    public final void T(@NotNull Activity activity, @Nullable Collection<String> collection) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        P0(collection);
        h0(activity, new q(collection, null, 2, null));
    }

    public final void U(@NotNull Fragment fragment, @NotNull Collection<String> permissions) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Y(new com.facebook.internal.h0(fragment), permissions);
    }

    public final void V(@NotNull androidx.activity.result.l activityResultRegistryOwner, @NotNull com.facebook.k callbackManager, @NotNull Collection<String> permissions) {
        Intrinsics.checkNotNullParameter(activityResultRegistryOwner, "activityResultRegistryOwner");
        Intrinsics.checkNotNullParameter(callbackManager, "callbackManager");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        P0(permissions);
        K(activityResultRegistryOwner, callbackManager, new q(permissions, null, 2, null));
    }

    public final void W(@NotNull androidx.fragment.app.Fragment fragment, @NotNull com.facebook.k callbackManager, @NotNull Collection<String> permissions) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(callbackManager, "callbackManager");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        androidx.fragment.app.s activity = fragment.getActivity();
        if (activity == null) {
            throw new com.facebook.u(Intrinsics.stringPlus("Cannot obtain activity context on the fragment ", fragment));
        }
        V(activity, callbackManager, permissions);
    }

    @kotlin.l(message = "")
    public final void X(@NotNull androidx.fragment.app.Fragment fragment, @NotNull Collection<String> permissions) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Y(new com.facebook.internal.h0(fragment), permissions);
    }

    public final void Z(@NotNull Activity activity, @Nullable Collection<String> collection) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Q0(collection);
        F(activity, new q(collection, null, 2, null));
    }

    public final void a0(@NotNull Fragment fragment, @NotNull Collection<String> permissions) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        e0(new com.facebook.internal.h0(fragment), permissions);
    }

    public final void b0(@NotNull androidx.activity.result.l activityResultRegistryOwner, @NotNull com.facebook.k callbackManager, @NotNull Collection<String> permissions) {
        Intrinsics.checkNotNullParameter(activityResultRegistryOwner, "activityResultRegistryOwner");
        Intrinsics.checkNotNullParameter(callbackManager, "callbackManager");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Q0(permissions);
        K(activityResultRegistryOwner, callbackManager, new q(permissions, null, 2, null));
    }

    public final void c0(@NotNull androidx.fragment.app.Fragment fragment, @NotNull com.facebook.k callbackManager, @NotNull Collection<String> permissions) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(callbackManager, "callbackManager");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        androidx.fragment.app.s activity = fragment.getActivity();
        if (activity == null) {
            throw new com.facebook.u(Intrinsics.stringPlus("Cannot obtain activity context on the fragment ", fragment));
        }
        b0(activity, callbackManager, permissions);
    }

    @kotlin.l(message = "")
    public final void d0(@NotNull androidx.fragment.app.Fragment fragment, @NotNull Collection<String> permissions) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        e0(new com.facebook.internal.h0(fragment), permissions);
    }

    public void f0() {
        AccessToken.f98366l.p(null);
        AuthenticationToken.f98393f.b(null);
        Profile.f98555h.c(null);
        E0(false);
    }

    public final void h0(@NotNull Activity activity, @NotNull q loginConfig) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(loginConfig, "loginConfig");
        F(activity, loginConfig);
    }

    @oj.j
    @l1(otherwise = 3)
    public final boolean j0(int i10, @Nullable Intent intent) {
        return l0(this, i10, intent, null, 4, null);
    }

    @oj.j
    @NotNull
    public final d k() {
        return n(this, null, null, 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0056  */
    @oj.j
    @l1(otherwise = 3)
    public boolean k0(int i10, @Nullable Intent intent, @Nullable com.facebook.p<b0> pVar) {
        LoginClient.Result.a aVar;
        boolean z10;
        AccessToken accessToken;
        AuthenticationToken authenticationToken;
        Map<String, String> map;
        LoginClient.Request request;
        AuthenticationToken authenticationToken2;
        LoginClient.Result.a aVar2 = LoginClient.Result.a.ERROR;
        com.facebook.u uVar = null;
        boolean z11 = false;
        if (intent != null) {
            intent.setExtrasClassLoader(LoginClient.Result.class.getClassLoader());
            LoginClient.Result result = (LoginClient.Result) intent.getParcelableExtra(t.f101540g);
            if (result != null) {
                LoginClient.Request request2 = result.f100402f;
                LoginClient.Result.a aVar3 = result.f100397a;
                if (i10 != -1) {
                    z11 = i10 == 0;
                    accessToken = null;
                    authenticationToken2 = null;
                } else if (aVar3 == LoginClient.Result.a.SUCCESS) {
                    accessToken = result.f100398b;
                    authenticationToken2 = result.f100399c;
                } else {
                    authenticationToken2 = null;
                    uVar = new com.facebook.l(result.f100400d);
                    accessToken = null;
                }
                map = result.f100403g;
                request = request2;
                z10 = z11;
                authenticationToken = authenticationToken2;
                aVar = aVar3;
            } else {
                aVar = aVar2;
                accessToken = null;
                authenticationToken = null;
                map = null;
                request = null;
                z10 = false;
            }
        } else if (i10 == 0) {
            aVar = LoginClient.Result.a.CANCEL;
            z10 = true;
            accessToken = null;
            authenticationToken = null;
            map = null;
            request = null;
        } else {
            aVar = aVar2;
            accessToken = null;
            authenticationToken = null;
            map = null;
            request = null;
            z10 = false;
        }
        if (uVar == null && accessToken == null && !z10) {
            uVar = new com.facebook.u("Unexpected call to LoginManager.onActivityResult");
        }
        com.facebook.u uVar2 = uVar;
        E(null, aVar, map, uVar2, true, request);
        s(accessToken, authenticationToken, request, uVar2, z10, pVar);
        return true;
    }

    @oj.j
    @NotNull
    public final d l(@Nullable com.facebook.k kVar) {
        return n(this, kVar, null, 2, null);
    }

    @oj.j
    @NotNull
    public final d m(@Nullable com.facebook.k kVar, @Nullable String str) {
        return new d(this, kVar, str);
    }

    public final void m0(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        L0(new a(activity), r());
    }

    public final void n0(@NotNull androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        o0(new com.facebook.internal.h0(fragment));
    }

    @NotNull
    protected LoginClient.Request o(@Nullable Collection<String> collection) {
        p pVar = this.f101692a;
        Set set = collection == null ? null : CollectionsKt.toSet(collection);
        com.facebook.login.e eVar = this.f101693b;
        String str = this.f101695d;
        com.facebook.g0 g0Var = com.facebook.g0.f99617a;
        String strO = com.facebook.g0.o();
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
        LoginClient.Request request = new LoginClient.Request(pVar, set, eVar, str, strO, string, this.f101698g, null, null, null, null, 1920, null);
        request.B(AccessToken.f98366l.k());
        request.z(this.f101696e);
        request.C(this.f101697f);
        request.y(this.f101699h);
        request.D(this.f101700i);
        return request;
    }

    public final void p0(@Nullable com.facebook.k kVar, @Nullable final com.facebook.p<b0> pVar) {
        if (!(kVar instanceof com.facebook.internal.f)) {
            throw new com.facebook.u("Unexpected CallbackManager, please use the provided Factory.");
        }
        ((com.facebook.internal.f) kVar).b(com.facebook.internal.f.c.Login.l(), new com.facebook.internal.f.a() { // from class: com.facebook.login.w
            @Override // com.facebook.internal.f.a
            public final boolean a(int i10, Intent intent) {
                return z.q0(this.f101582a, pVar, i10, intent);
            }
        });
    }

    @NotNull
    protected LoginClient.Request q(@NotNull q loginConfig) {
        String strA;
        Intrinsics.checkNotNullParameter(loginConfig, "loginConfig");
        com.facebook.login.b bVar = com.facebook.login.b.S256;
        try {
            g0 g0Var = g0.f100483a;
            strA = g0.b(loginConfig.a(), bVar);
        } catch (com.facebook.u unused) {
            bVar = com.facebook.login.b.PLAIN;
            strA = loginConfig.a();
        }
        com.facebook.login.b bVar2 = bVar;
        String str = strA;
        p pVar = this.f101692a;
        Set set = CollectionsKt.toSet(loginConfig.c());
        com.facebook.login.e eVar = this.f101693b;
        String str2 = this.f101695d;
        com.facebook.g0 g0Var2 = com.facebook.g0.f99617a;
        String strO = com.facebook.g0.o();
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
        LoginClient.Request request = new LoginClient.Request(pVar, set, eVar, str2, strO, string, this.f101698g, loginConfig.b(), loginConfig.a(), str, bVar2);
        request.B(AccessToken.f98366l.k());
        request.z(this.f101696e);
        request.C(this.f101697f);
        request.y(this.f101699h);
        request.D(this.f101700i);
        return request;
    }

    @NotNull
    protected LoginClient.Request r() {
        p pVar = p.DIALOG_ONLY;
        HashSet hashSet = new HashSet();
        com.facebook.login.e eVar = this.f101693b;
        com.facebook.g0 g0Var = com.facebook.g0.f99617a;
        String strO = com.facebook.g0.o();
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
        int i10 = 7 & 0 & 0;
        LoginClient.Request request = new LoginClient.Request(pVar, hashSet, eVar, "reauthorize", strO, string, this.f101698g, null, null, null, null, 1920, null);
        request.y(this.f101699h);
        request.D(this.f101700i);
        return request;
    }

    public final void r0(@NotNull Activity activity, @NotNull q0 response) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(response, "response");
        L0(new a(activity), p(response));
    }

    public final void s0(@NotNull Fragment fragment, @NotNull q0 response) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(response, "response");
        w0(new com.facebook.internal.h0(fragment), response);
    }

    @NotNull
    public final String t() {
        return this.f101695d;
    }

    public final void t0(@NotNull androidx.activity.result.l activityResultRegistryOwner, @NotNull com.facebook.k callbackManager, @NotNull q0 response) {
        Intrinsics.checkNotNullParameter(activityResultRegistryOwner, "activityResultRegistryOwner");
        Intrinsics.checkNotNullParameter(callbackManager, "callbackManager");
        Intrinsics.checkNotNullParameter(response, "response");
        L0(new b(activityResultRegistryOwner, callbackManager), p(response));
    }

    @NotNull
    public final com.facebook.login.e u() {
        return this.f101693b;
    }

    public final void u0(@NotNull androidx.fragment.app.Fragment fragment, @NotNull com.facebook.k callbackManager, @NotNull q0 response) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(callbackManager, "callbackManager");
        Intrinsics.checkNotNullParameter(response, "response");
        androidx.fragment.app.s activity = fragment.getActivity();
        if (activity == null) {
            throw new com.facebook.u(Intrinsics.stringPlus("Cannot obtain activity context on the fragment ", fragment));
        }
        t0(activity, callbackManager, response);
    }

    @kotlin.l(message = "")
    public final void v0(@NotNull androidx.fragment.app.Fragment fragment, @NotNull q0 response) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(response, "response");
        w0(new com.facebook.internal.h0(fragment), response);
    }

    @NotNull
    protected Intent w(@NotNull LoginClient.Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intent intent = new Intent();
        com.facebook.g0 g0Var = com.facebook.g0.f99617a;
        intent.setClass(com.facebook.g0.n(), FacebookActivity.class);
        intent.setAction(request.k().toString());
        Bundle bundle = new Bundle();
        bundle.putParcelable("request", request);
        intent.putExtra(t.f101541h, bundle);
        return intent;
    }

    @NotNull
    public final p y() {
        return this.f101692a;
    }

    public final void y0(@NotNull Context context, long j10, @NotNull u0 responseCallback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(responseCallback, "responseCallback");
        A0(context, responseCallback, j10);
    }

    @NotNull
    public final d0 z() {
        return this.f101698g;
    }

    public final void z0(@NotNull Context context, @NotNull u0 responseCallback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(responseCallback, "responseCallback");
        y0(context, 5000L, responseCallback);
    }

    public final class d extends g.a<Collection<? extends String>, com.facebook.k.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private com.facebook.k f101705a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private String f101706b;

        public d(@Nullable z this$0, @Nullable com.facebook.k kVar, String str) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            z.this = this$0;
            this.f101705a = kVar;
            this.f101706b = str;
        }

        @Override // g.a
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Intent createIntent(@NotNull Context context, @NotNull Collection<String> permissions) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(permissions, "permissions");
            LoginClient.Request requestQ = z.this.q(new q(permissions, null, 2, null));
            String str = this.f101706b;
            if (str != null) {
                requestQ.u(str);
            }
            z.this.g0(context, requestQ);
            Intent intentW = z.this.w(requestQ);
            if (z.this.x0(intentW)) {
                return intentW;
            }
            com.facebook.u uVar = new com.facebook.u("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
            z.this.E(context, LoginClient.Result.a.ERROR, null, uVar, false, requestQ);
            throw uVar;
        }

        @Nullable
        public final com.facebook.k b() {
            return this.f101705a;
        }

        @Nullable
        public final String c() {
            return this.f101706b;
        }

        @Override // g.a
        @NotNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public com.facebook.k.a parseResult(int i10, @Nullable Intent intent) {
            z.l0(z.this, i10, intent, null, 4, null);
            int iL = com.facebook.internal.f.c.Login.l();
            com.facebook.k kVar = this.f101705a;
            if (kVar != null) {
                kVar.e(iL, i10, intent);
            }
            return new com.facebook.k.a(iL, i10, intent);
        }

        public final void e(@Nullable com.facebook.k kVar) {
            this.f101705a = kVar;
        }

        public final void f(@Nullable String str) {
            this.f101706b = str;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ d(com.facebook.k kVar, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(z.this, (i10 & 1) != 0 ? null : kVar, (i10 & 2) != 0 ? null : str);
            int i11 = 2 >> 0;
        }
    }
}
