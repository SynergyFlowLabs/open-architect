package com.facebook.login;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookRequestError;
import com.facebook.internal.e1;
import com.facebook.internal.f1;
import com.facebook.internal.o0;
import com.facebook.internal.w0;
import com.facebook.internal.z0;
import com.facebook.j0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class CustomTabLoginMethodHandler extends WebLoginMethodHandler {

    @NotNull
    public static final String X = "oauth";

    @oj.f
    public static boolean Y = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f100314t = 1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f100315v = 20;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f100316w = 4201;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private String f100317k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private String f100318l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private String f100319m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final String f100320n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final com.facebook.g f100321o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public static final b f100313s = new b(null);

    @oj.f
    @NotNull
    public static final Parcelable.Creator<CustomTabLoginMethodHandler> CREATOR = new a();

    public static final class a implements Parcelable.Creator<CustomTabLoginMethodHandler> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CustomTabLoginMethodHandler createFromParcel(@NotNull Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new CustomTabLoginMethodHandler(source);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public CustomTabLoginMethodHandler[] newArray(int i10) {
            return new CustomTabLoginMethodHandler[i10];
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomTabLoginMethodHandler(@NotNull LoginClient loginClient) {
        super(loginClient);
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        this.f100320n = "custom_tab";
        this.f100321o = com.facebook.g.CHROME_CUSTOM_TAB;
        e1 e1Var = e1.f99794a;
        this.f100318l = e1.s(20);
        Y = false;
        com.facebook.internal.h hVar = com.facebook.internal.h.f99880a;
        this.f100319m = com.facebook.internal.h.c(F());
    }

    private final String E() {
        String str = this.f100317k;
        if (str != null) {
            return str;
        }
        com.facebook.internal.h hVar = com.facebook.internal.h.f99880a;
        String strA = com.facebook.internal.h.a();
        this.f100317k = strA;
        return strA;
    }

    private final String F() {
        return super.l();
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00df  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e8  */
    private final void G(String str, final LoginClient.Request request) {
        int i10;
        if (str != null) {
            if (StringsKt.u2(str, f1.f99843g, false, 2, null) || StringsKt.u2(str, super.l(), false, 2, null)) {
                Uri uri = Uri.parse(str);
                e1 e1Var = e1.f99794a;
                final Bundle bundleL0 = e1.l0(uri.getQuery());
                bundleL0.putAll(e1.l0(uri.getFragment()));
                if (!I(bundleL0)) {
                    super.B(request, null, new com.facebook.u("Invalid state parameter"));
                    return;
                }
                String string = bundleL0.getString("error");
                if (string == null) {
                    string = bundleL0.getString(w0.P0);
                }
                String string2 = bundleL0.getString("error_msg");
                if (string2 == null) {
                    string2 = bundleL0.getString(com.facebook.internal.a.Y);
                }
                if (string2 == null) {
                    string2 = bundleL0.getString("error_description");
                }
                String string3 = bundleL0.getString(w0.R0);
                if (string3 != null) {
                    try {
                        i10 = Integer.parseInt(string3);
                    } catch (NumberFormatException unused) {
                        i10 = -1;
                    }
                    e1 e1Var2 = e1.f99794a;
                    if (!e1.Z(string) && e1.Z(string2) && i10 == -1) {
                        if (bundleL0.containsKey("access_token")) {
                            super.B(request, bundleL0, null);
                            return;
                        } else {
                            com.facebook.g0 g0Var = com.facebook.g0.f99617a;
                            com.facebook.g0.y().execute(new Runnable() { // from class: com.facebook.login.c
                                @Override // java.lang.Runnable
                                public final void run() {
                                    CustomTabLoginMethodHandler.H(this.f100449a, request, bundleL0);
                                }
                            });
                            return;
                        }
                    }
                    if (string == null && (Intrinsics.areEqual(string, "access_denied") || Intrinsics.areEqual(string, "OAuthAccessDeniedException"))) {
                        super.B(request, null, new com.facebook.w());
                        return;
                    } else if (i10 == f100316w) {
                        super.B(request, null, new com.facebook.w());
                    } else {
                        super.B(request, null, new j0(new FacebookRequestError(i10, string, string2), string2));
                    }
                }
                i10 = -1;
                e1 e1Var3 = e1.f99794a;
                if (!e1.Z(string)) {
                }
                if (string == null) {
                }
                if (i10 == f100316w) {
                    super.B(request, null, new com.facebook.w());
                } else {
                    super.B(request, null, new j0(new FacebookRequestError(i10, string, string2), string2));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(CustomTabLoginMethodHandler this$0, LoginClient.Request request, Bundle values) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(request, "$request");
        Intrinsics.checkNotNullParameter(values, "$values");
        try {
            this$0.B(request, this$0.q(request, values), null);
        } catch (com.facebook.u e10) {
            this$0.B(request, null, e10);
        }
    }

    private final boolean I(Bundle bundle) {
        try {
            String string = bundle.getString("state");
            if (string == null) {
                return false;
            }
            return Intrinsics.areEqual(new JSONObject(string).getString(v.A), this.f100318l);
        } catch (JSONException unused) {
            return false;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    @NotNull
    public String k() {
        return this.f100320n;
    }

    @Override // com.facebook.login.LoginMethodHandler
    @NotNull
    protected String l() {
        return this.f100319m;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public boolean p(int i10, int i11, @Nullable Intent intent) {
        if ((intent == null || !intent.getBooleanExtra(CustomTabMainActivity.f98470j, false)) && i10 == 1) {
            LoginClient.Request requestY = i().y();
            if (requestY == null) {
                return false;
            }
            if (i11 == -1) {
                G(intent != null ? intent.getStringExtra(CustomTabMainActivity.f98467g) : null, requestY);
                return true;
            }
            super.B(requestY, null, new com.facebook.w());
            return false;
        }
        return super.p(i10, i11, intent);
    }

    @Override // com.facebook.login.LoginMethodHandler
    public void r(@NotNull JSONObject param) throws JSONException {
        Intrinsics.checkNotNullParameter(param, "param");
        param.put(v.A, this.f100318l);
    }

    @Override // com.facebook.login.LoginMethodHandler
    public int v(@NotNull LoginClient.Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        LoginClient loginClientI = i();
        if (l().length() == 0) {
            return 0;
        }
        Bundle bundleW = w(x(request), request);
        if (Y) {
            bundleW.putString(z0.F, "1");
        }
        if (com.facebook.g0.L) {
            if (request.s()) {
                d.f100457b.c(o0.f100022c.a(X, bundleW));
            } else {
                d.f100457b.c(com.facebook.internal.g.f99844b.a(X, bundleW));
            }
        }
        androidx.fragment.app.s sVarK = loginClientI.k();
        if (sVarK == null) {
            return 0;
        }
        Intent intent = new Intent(sVarK, (Class<?>) CustomTabMainActivity.class);
        intent.putExtra(CustomTabMainActivity.f98464d, X);
        intent.putExtra(CustomTabMainActivity.f98465e, bundleW);
        intent.putExtra(CustomTabMainActivity.f98466f, E());
        intent.putExtra(CustomTabMainActivity.f98468h, request.l().toString());
        Fragment fragmentQ = loginClientI.q();
        if (fragmentQ != null) {
            fragmentQ.startActivityForResult(intent, 1);
        }
        return 1;
    }

    @Override // com.facebook.login.LoginMethodHandler, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int i10) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        super.writeToParcel(dest, i10);
        dest.writeString(this.f100318l);
    }

    @Override // com.facebook.login.WebLoginMethodHandler
    @Nullable
    protected String y() {
        return "chrome_custom_tab";
    }

    @Override // com.facebook.login.WebLoginMethodHandler
    @NotNull
    public com.facebook.g z() {
        return this.f100321o;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomTabLoginMethodHandler(@NotNull Parcel source) {
        super(source);
        Intrinsics.checkNotNullParameter(source, "source");
        this.f100320n = "custom_tab";
        this.f100321o = com.facebook.g.CHROME_CUSTOM_TAB;
        this.f100318l = source.readString();
        com.facebook.internal.h hVar = com.facebook.internal.h.f99880a;
        this.f100319m = com.facebook.internal.h.c(F());
    }
}
