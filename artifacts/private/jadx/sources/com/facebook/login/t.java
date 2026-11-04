package com.facebook.login;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.annotation.j0;
import androidx.fragment.app.Fragment;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public class t extends Fragment {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f101539f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final String f101540g = "com.facebook.LoginFragment:Result";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final String f101541h = "com.facebook.LoginFragment:Request";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final String f101542i = "request";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private static final String f101543j = "LoginFragment";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private static final String f101544k = "Cannot call LoginFragment with a null calling package. This can occur if the launchMode of the caller is singleInstance.";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private static final String f101545l = "loginClient";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private String f101546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private LoginClient.Request f101547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LoginClient f101548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private androidx.activity.result.h<Intent> f101549d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private View f101550e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b extends l0 implements Function1<ActivityResult, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.s f101552b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.fragment.app.s sVar) {
            super(1);
            this.f101552b = sVar;
        }

        public final void c(@NotNull ActivityResult result) {
            Intrinsics.checkNotNullParameter(result, "result");
            if (result.b() == -1) {
                t.this.A().E(LoginClient.f100364m.b(), result.b(), result.a());
            } else {
                this.f101552b.finish();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ActivityResult activityResult) {
            c(activityResult);
            return Unit.f312394a;
        }
    }

    public static final class c implements LoginClient.a {
        c() {
        }

        @Override // com.facebook.login.LoginClient.a
        public void a() {
            t.this.J();
        }

        @Override // com.facebook.login.LoginClient.a
        public void b() {
            t.this.C();
        }
    }

    private final Function1<ActivityResult, Unit> B(androidx.fragment.app.s sVar) {
        return new b(sVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C() {
        View view = this.f101550e;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressBar");
            throw null;
        }
        view.setVisibility(8);
        H();
    }

    private final void D(Activity activity) {
        ComponentName callingActivity = activity.getCallingActivity();
        if (callingActivity == null) {
            return;
        }
        this.f101546a = callingActivity.getPackageName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(t this$0, LoginClient.Result outcome) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(outcome, "outcome");
        this$0.G(outcome);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(Function1 tmp0, ActivityResult activityResult) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(activityResult);
    }

    private final void G(LoginClient.Result result) {
        this.f101547b = null;
        int i10 = result.f100397a == LoginClient.Result.a.CANCEL ? 0 : -1;
        Bundle bundle = new Bundle();
        bundle.putParcelable(f101540g, result);
        Intent intent = new Intent();
        intent.putExtras(bundle);
        androidx.fragment.app.s activity = getActivity();
        if (!isAdded() || activity == null) {
            return;
        }
        activity.setResult(i10, intent);
        activity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J() {
        View view = this.f101550e;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressBar");
            throw null;
        }
        view.setVisibility(0);
        I();
    }

    @NotNull
    public final LoginClient A() {
        LoginClient loginClient = this.f101548c;
        if (loginClient != null) {
            return loginClient;
        }
        Intrinsics.throwUninitializedPropertyAccessException(f101545l);
        throw null;
    }

    protected void H() {
    }

    protected void I() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i10, int i11, @Nullable Intent intent) {
        super.onActivityResult(i10, i11, intent);
        A().E(i10, i11, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Bundle bundleExtra;
        super.onCreate(bundle);
        LoginClient loginClientX = bundle == null ? null : (LoginClient) bundle.getParcelable(f101545l);
        if (loginClientX != null) {
            loginClientX.J(this);
        } else {
            loginClientX = x();
        }
        this.f101548c = loginClientX;
        A().M(new LoginClient.d() { // from class: com.facebook.login.r
            @Override // com.facebook.login.LoginClient.d
            public final void a(LoginClient.Result result) {
                t.E(this.f101537a, result);
            }
        });
        androidx.fragment.app.s activity = getActivity();
        if (activity == null) {
            return;
        }
        D(activity);
        Intent intent = activity.getIntent();
        if (intent != null && (bundleExtra = intent.getBundleExtra(f101541h)) != null) {
            this.f101547b = (LoginClient.Request) bundleExtra.getParcelable("request");
        }
        g.b.m mVar = new g.b.m();
        final Function1<ActivityResult, Unit> function1B = B(activity);
        androidx.activity.result.h<Intent> hVarRegisterForActivityResult = registerForActivityResult(mVar, new androidx.activity.result.a() { // from class: com.facebook.login.s
            @Override // androidx.activity.result.a
            public final void a(Object obj) {
                t.F(function1B, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(hVarRegisterForActivityResult, "registerForActivityResult(\n            ActivityResultContracts.StartActivityForResult(),\n            getLoginMethodHandlerCallback(activity))");
        this.f101549d = hVarRegisterForActivityResult;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(z(), viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(l5.b.h.f316720w0);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "view.findViewById<View>(R.id.com_facebook_login_fragment_progress_bar)");
        this.f101550e = viewFindViewById;
        A().F(new c());
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        A().e();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        View view = getView();
        View viewFindViewById = view == null ? null : view.findViewById(l5.b.h.f316720w0);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.f101546a != null) {
            A().O(this.f101547b);
            return;
        }
        androidx.fragment.app.s activity = getActivity();
        if (activity == null) {
            return;
        }
        activity.finish();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putParcelable(f101545l, A());
    }

    @NotNull
    protected LoginClient x() {
        return new LoginClient(this);
    }

    @NotNull
    public final androidx.activity.result.h<Intent> y() {
        androidx.activity.result.h<Intent> hVar = this.f101549d;
        if (hVar != null) {
            return hVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException(MetricTracker.Object.LAUNCHER);
        throw null;
    }

    @j0
    protected int z() {
        return l5.b.k.G;
    }
}
