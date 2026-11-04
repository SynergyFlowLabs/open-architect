package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.b1;
import com.facebook.internal.e1;
import com.facebook.internal.j1;
import com.facebook.internal.z0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public class WebViewLoginMethodHandler extends WebLoginMethodHandler {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private static final String f100422s = "oauth";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private j1 f100423k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private String f100424l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final String f100425m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final com.facebook.g f100426n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public static final c f100421o = new c(null);

    @oj.f
    @NotNull
    public static final Parcelable.Creator<WebViewLoginMethodHandler> CREATOR = new b();

    public final class a extends j1.a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        private String f100427h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        private p f100428i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        private d0 f100429j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f100430k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f100431l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public String f100432m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public String f100433n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ WebViewLoginMethodHandler f100434o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull WebViewLoginMethodHandler this$0, @NotNull Context context, @NotNull String applicationId, Bundle parameters) {
            super(context, applicationId, "oauth", parameters);
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            this.f100434o = this$0;
            this.f100427h = z0.Q;
            this.f100428i = p.NATIVE_WITH_FALLBACK;
            this.f100429j = d0.FACEBOOK;
        }

        @Override // com.facebook.internal.j1.a
        @NotNull
        public j1 a() {
            Bundle bundleF = f();
            if (bundleF == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.os.Bundle");
            }
            bundleF.putString(z0.f100292w, this.f100427h);
            bundleF.putString("client_id", c());
            bundleF.putString("e2e", k());
            bundleF.putString(z0.f100293x, this.f100429j == d0.INSTAGRAM ? z0.M : z0.N);
            bundleF.putString(z0.f100294y, z0.P);
            bundleF.putString(z0.f100277h, j());
            bundleF.putString("login_behavior", this.f100428i.name());
            if (this.f100430k) {
                bundleF.putString(z0.J, this.f100429j.toString());
            }
            if (this.f100431l) {
                bundleF.putString(z0.K, z0.P);
            }
            j1.b bVar = j1.f99903m;
            Context contextD = d();
            if (contextD != null) {
                return bVar.d(contextD, "oauth", bundleF, g(), this.f100429j, e());
            }
            throw new NullPointerException("null cannot be cast to non-null type android.content.Context");
        }

        @NotNull
        public final String j() {
            String str = this.f100433n;
            if (str != null) {
                return str;
            }
            Intrinsics.throwUninitializedPropertyAccessException("authType");
            throw null;
        }

        @NotNull
        public final String k() {
            String str = this.f100432m;
            if (str != null) {
                return str;
            }
            Intrinsics.throwUninitializedPropertyAccessException("e2e");
            throw null;
        }

        @NotNull
        public final a l(@NotNull String authType) {
            Intrinsics.checkNotNullParameter(authType, "authType");
            m(authType);
            return this;
        }

        public final void m(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f100433n = str;
        }

        @NotNull
        public final a n(@NotNull String e2e) {
            Intrinsics.checkNotNullParameter(e2e, "e2e");
            o(e2e);
            return this;
        }

        public final void o(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f100432m = str;
        }

        @NotNull
        public final a p(boolean z10) {
            this.f100430k = z10;
            return this;
        }

        @NotNull
        public final a q(boolean z10) {
            this.f100427h = z10 ? z0.R : z0.Q;
            return this;
        }

        @NotNull
        public final a r(boolean z10) {
            return this;
        }

        @NotNull
        public final a s(@NotNull p loginBehavior) {
            Intrinsics.checkNotNullParameter(loginBehavior, "loginBehavior");
            this.f100428i = loginBehavior;
            return this;
        }

        @NotNull
        public final a t(@NotNull d0 targetApp) {
            Intrinsics.checkNotNullParameter(targetApp, "targetApp");
            this.f100429j = targetApp;
            return this;
        }

        @NotNull
        public final a u(boolean z10) {
            this.f100431l = z10;
            return this;
        }
    }

    public static final class b implements Parcelable.Creator<WebViewLoginMethodHandler> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public WebViewLoginMethodHandler createFromParcel(@NotNull Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new WebViewLoginMethodHandler(source);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public WebViewLoginMethodHandler[] newArray(int i10) {
            return new WebViewLoginMethodHandler[i10];
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    public static final class d implements j1.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ LoginClient.Request f100436b;

        d(LoginClient.Request request) {
            this.f100436b = request;
        }

        @Override // com.facebook.internal.j1.e
        public void a(@Nullable Bundle bundle, @Nullable com.facebook.u uVar) {
            WebViewLoginMethodHandler.this.F(this.f100436b, bundle, uVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewLoginMethodHandler(@NotNull LoginClient loginClient) {
        super(loginClient);
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        this.f100425m = "web_view";
        this.f100426n = com.facebook.g.WEB_VIEW;
    }

    @Nullable
    public final String D() {
        return this.f100424l;
    }

    @Nullable
    public final j1 E() {
        return this.f100423k;
    }

    public final void F(@NotNull LoginClient.Request request, @Nullable Bundle bundle, @Nullable com.facebook.u uVar) {
        Intrinsics.checkNotNullParameter(request, "request");
        super.B(request, bundle, uVar);
    }

    public final void G(@Nullable String str) {
        this.f100424l = str;
    }

    public final void H(@Nullable j1 j1Var) {
        this.f100423k = j1Var;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public void b() {
        j1 j1Var = this.f100423k;
        if (j1Var != null) {
            if (j1Var != null) {
                j1Var.cancel();
            }
            this.f100423k = null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    @NotNull
    public String k() {
        return this.f100425m;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public boolean o() {
        return true;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public int v(@NotNull LoginClient.Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Bundle bundleX = x(request);
        d dVar = new d(request);
        String strA = LoginClient.f100364m.a();
        this.f100424l = strA;
        a("e2e", strA);
        androidx.fragment.app.s sVarK = i().k();
        if (sVarK == null) {
            return 0;
        }
        e1 e1Var = e1.f99794a;
        boolean zT = e1.T(sVarK);
        a aVar = new a(this, sVarK, request.a(), bundleX);
        String str = this.f100424l;
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        this.f100423k = aVar.n(str).q(zT).l(request.c()).s(request.k()).t(request.l()).p(request.r()).u(request.E()).h(dVar).a();
        com.facebook.internal.o oVar = new com.facebook.internal.o();
        oVar.setRetainInstance(true);
        oVar.I(this.f100423k);
        oVar.show(sVarK.getSupportFragmentManager(), com.facebook.internal.o.f100020p2);
        return 1;
    }

    @Override // com.facebook.login.LoginMethodHandler, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int i10) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        super.writeToParcel(dest, i10);
        dest.writeString(this.f100424l);
    }

    @Override // com.facebook.login.WebLoginMethodHandler
    @NotNull
    public com.facebook.g z() {
        return this.f100426n;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewLoginMethodHandler(@NotNull Parcel source) {
        super(source);
        Intrinsics.checkNotNullParameter(source, "source");
        this.f100425m = "web_view";
        this.f100426n = com.facebook.g.WEB_VIEW;
        this.f100424l = source.readString();
    }
}
