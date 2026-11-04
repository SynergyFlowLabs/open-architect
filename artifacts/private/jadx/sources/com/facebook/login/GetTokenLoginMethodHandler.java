package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.internal.e1;
import com.facebook.internal.w0;
import com.facebook.internal.x0;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class GetTokenLoginMethodHandler extends LoginMethodHandler {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private n f100354g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final String f100355h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final b f100353i = new b(null);

    @oj.f
    @NotNull
    public static final Parcelable.Creator<GetTokenLoginMethodHandler> CREATOR = new a();

    public static final class a implements Parcelable.Creator<GetTokenLoginMethodHandler> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public GetTokenLoginMethodHandler createFromParcel(@NotNull Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new GetTokenLoginMethodHandler(source);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public GetTokenLoginMethodHandler[] newArray(int i10) {
            return new GetTokenLoginMethodHandler[i10];
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public static final class c implements e1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Bundle f100356a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ GetTokenLoginMethodHandler f100357b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ LoginClient.Request f100358c;

        c(Bundle bundle, GetTokenLoginMethodHandler getTokenLoginMethodHandler, LoginClient.Request request) {
            this.f100356a = bundle;
            this.f100357b = getTokenLoginMethodHandler;
            this.f100358c = request;
        }

        @Override // com.facebook.internal.e1.a
        public void a(@Nullable JSONObject jSONObject) {
            try {
                this.f100356a.putString(w0.f100204t0, jSONObject == null ? null : jSONObject.getString("id"));
                this.f100357b.z(this.f100358c, this.f100356a);
            } catch (JSONException e10) {
                this.f100357b.i().h(LoginClient.Result.c.e(LoginClient.Result.f100396i, this.f100357b.i().y(), "Caught exception", e10.getMessage(), null, 8, null));
            }
        }

        @Override // com.facebook.internal.e1.a
        public void b(@Nullable com.facebook.u uVar) {
            this.f100357b.i().h(LoginClient.Result.c.e(LoginClient.Result.f100396i, this.f100357b.i().y(), "Caught exception", uVar == null ? null : uVar.getMessage(), null, 8, null));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTokenLoginMethodHandler(@NotNull LoginClient loginClient) {
        super(loginClient);
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        this.f100355h = "get_token";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(GetTokenLoginMethodHandler this$0, LoginClient.Request request, Bundle bundle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(request, "$request");
        this$0.y(request, bundle);
    }

    @Override // com.facebook.login.LoginMethodHandler
    public void b() {
        n nVar = this.f100354g;
        if (nVar == null) {
            return;
        }
        nVar.b();
        nVar.h(null);
        this.f100354g = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    @NotNull
    public String k() {
        return this.f100355h;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public int v(@NotNull final LoginClient.Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Context contextK = i().k();
        if (contextK == null) {
            com.facebook.g0 g0Var = com.facebook.g0.f99617a;
            contextK = com.facebook.g0.n();
        }
        n nVar = new n(contextK, request);
        this.f100354g = nVar;
        if (Intrinsics.areEqual(Boolean.valueOf(nVar.i()), Boolean.FALSE)) {
            return 0;
        }
        i().B();
        x0.b bVar = new x0.b() { // from class: com.facebook.login.o
            @Override // com.facebook.internal.x0.b
            public final void a(Bundle bundle) {
                GetTokenLoginMethodHandler.A(this.f101516a, request, bundle);
            }
        };
        n nVar2 = this.f100354g;
        if (nVar2 == null) {
            return 1;
        }
        nVar2.h(bVar);
        return 1;
    }

    public final void x(@NotNull LoginClient.Request request, @NotNull Bundle result) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(result, "result");
        String string = result.getString(w0.f100204t0);
        if (string != null && string.length() != 0) {
            z(request, result);
            return;
        }
        i().B();
        String string2 = result.getString(w0.f100214y0);
        if (string2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        e1 e1Var = e1.f99794a;
        e1.D(string2, new c(result, this, request));
    }

    public final void y(@NotNull LoginClient.Request request, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(request, "request");
        n nVar = this.f100354g;
        if (nVar != null) {
            nVar.h(null);
        }
        this.f100354g = null;
        i().C();
        if (bundle != null) {
            List stringArrayList = bundle.getStringArrayList(w0.f100197q0);
            if (stringArrayList == null) {
                stringArrayList = CollectionsKt.emptyList();
            }
            Set<String> setO = request.o();
            if (setO == null) {
                setO = SetsKt.emptySet();
            }
            String string = bundle.getString(w0.B0);
            if (setO.contains("openid") && (string == null || string.length() == 0)) {
                i().Q();
                return;
            }
            if (stringArrayList.containsAll(setO)) {
                x(request, bundle);
                return;
            }
            HashSet hashSet = new HashSet();
            for (String str : setO) {
                if (!stringArrayList.contains(str)) {
                    hashSet.add(str);
                }
            }
            if (!hashSet.isEmpty()) {
                a(v.E, TextUtils.join(",", hashSet));
            }
            request.A(hashSet);
        }
        i().Q();
    }

    public final void z(@NotNull LoginClient.Request request, @NotNull Bundle result) {
        LoginClient.Result resultE;
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(result, "result");
        try {
            LoginMethodHandler.a aVar = LoginMethodHandler.f100410c;
            resultE = LoginClient.Result.f100396i.b(request, aVar.a(result, com.facebook.g.FACEBOOK_APPLICATION_SERVICE, request.a()), aVar.c(result, request.n()));
        } catch (com.facebook.u e10) {
            resultE = LoginClient.Result.c.e(LoginClient.Result.f100396i, i().y(), null, e10.getMessage(), null, 8, null);
        }
        i().i(resultE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTokenLoginMethodHandler(@NotNull Parcel source) {
        super(source);
        Intrinsics.checkNotNullParameter(source, "source");
        this.f100355h = "get_token";
    }
}
