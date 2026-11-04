package com.facebook.login;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.j0;
import androidx.annotation.l1;
import com.facebook.AccessToken;
import com.facebook.FacebookActivity;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.internal.a1;
import com.facebook.internal.e1;
import com.facebook.internal.f1;
import com.facebook.internal.z0;
import com.facebook.o0;
import com.facebook.q0;
import com.facebook.r0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.EnumSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class DeviceAuthDialog extends androidx.fragment.app.m {

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    @NotNull
    private static final String f100325r3 = "request_state";

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    private static final int f100326s3 = 1349172;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    private static final int f100327t3 = 1349173;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    private static final int f100329v3 = 1349152;
    private TextView H1;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    @Nullable
    private DeviceAuthMethodHandler f100330g3;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f100331h3 = new AtomicBoolean();

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    @Nullable
    private volatile o0 f100332i3;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    @Nullable
    private volatile ScheduledFuture<?> f100333j3;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    @Nullable
    private volatile RequestState f100334k3;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private boolean f100335l3;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private boolean f100336m3;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    @Nullable
    private LoginClient.Request f100337n3;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private View f100338p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private TextView f100339p2;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    @NotNull
    public static final a f100322o3 = new a(null);

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    @NotNull
    private static final String f100323p3 = "device/login";

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    @NotNull
    private static final String f100324q3 = "device/login_status";

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    private static final int f100328u3 = 1349174;

    private static final class RequestState implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private String f100341a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private String f100342b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private String f100343c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f100344d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f100345e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public static final b f100340f = new b(null);

        @oj.f
        @NotNull
        public static final Parcelable.Creator<RequestState> CREATOR = new a();

        public static final class a implements Parcelable.Creator<RequestState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public RequestState createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RequestState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public RequestState[] newArray(int i10) {
                return new RequestState[i10];
            }
        }

        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private b() {
            }
        }

        public RequestState() {
        }

        @Nullable
        public final String a() {
            return this.f100341a;
        }

        public final long b() {
            return this.f100344d;
        }

        @Nullable
        public final String c() {
            return this.f100343c;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Nullable
        public final String e() {
            return this.f100342b;
        }

        public final void f(long j10) {
            this.f100344d = j10;
        }

        public final void g(long j10) {
            this.f100345e = j10;
        }

        public final void h(@Nullable String str) {
            this.f100343c = str;
        }

        public final void i(@Nullable String str) {
            this.f100342b = str;
            q1 q1Var = q1.f312784a;
            int i10 = 6 | 1;
            String str2 = String.format(Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", Arrays.copyOf(new Object[]{str}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "java.lang.String.format(locale, format, *args)");
            this.f100341a = str2;
        }

        public final boolean j() {
            return this.f100345e != 0 && (new Date().getTime() - this.f100345e) - (this.f100344d * 1000) < 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel dest, int i10) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100341a);
            dest.writeString(this.f100342b);
            dest.writeString(this.f100343c);
            dest.writeLong(this.f100344d);
            dest.writeLong(this.f100345e);
        }

        protected RequestState(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            this.f100341a = parcel.readString();
            this.f100342b = parcel.readString();
            this.f100343c = parcel.readString();
            this.f100344d = parcel.readLong();
            this.f100345e = parcel.readLong();
        }
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @l1
        public static /* synthetic */ void c() {
        }

        @l1
        public static /* synthetic */ void e() {
        }

        @l1
        public static /* synthetic */ void g() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final b h(JSONObject jSONObject) throws JSONException {
            String strOptString;
            JSONArray jSONArray = jSONObject.getJSONObject("permissions").getJSONArray("data");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int length = jSONArray.length();
            if (length > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                    String permission = jSONObjectOptJSONObject.optString("permission");
                    Intrinsics.checkNotNullExpressionValue(permission, "permission");
                    if (permission.length() != 0 && !Intrinsics.areEqual(permission, "installed") && (strOptString = jSONObjectOptJSONObject.optString("status")) != null) {
                        int iHashCode = strOptString.hashCode();
                        if (iHashCode != -1309235419) {
                            if (iHashCode != 280295099) {
                                if (iHashCode == 568196142 && strOptString.equals("declined")) {
                                    arrayList2.add(permission);
                                }
                            } else if (strOptString.equals("granted")) {
                                arrayList.add(permission);
                            }
                        } else if (strOptString.equals("expired")) {
                            arrayList3.add(permission);
                        }
                    }
                    if (i11 >= length) {
                        break;
                    }
                    i10 = i11;
                }
            }
            return new b(arrayList, arrayList2, arrayList3);
        }

        @NotNull
        public final String b() {
            return DeviceAuthDialog.f100323p3;
        }

        @NotNull
        public final String d() {
            return DeviceAuthDialog.f100324q3;
        }

        public final int f() {
            return DeviceAuthDialog.f100328u3;
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private List<String> f100346a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private List<String> f100347b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private List<String> f100348c;

        public b(@NotNull List<String> grantedPermissions, @NotNull List<String> declinedPermissions, @NotNull List<String> expiredPermissions) {
            Intrinsics.checkNotNullParameter(grantedPermissions, "grantedPermissions");
            Intrinsics.checkNotNullParameter(declinedPermissions, "declinedPermissions");
            Intrinsics.checkNotNullParameter(expiredPermissions, "expiredPermissions");
            this.f100346a = grantedPermissions;
            this.f100347b = declinedPermissions;
            this.f100348c = expiredPermissions;
        }

        @NotNull
        public final List<String> a() {
            return this.f100347b;
        }

        @NotNull
        public final List<String> b() {
            return this.f100348c;
        }

        @NotNull
        public final List<String> c() {
            return this.f100346a;
        }

        public final void d(@NotNull List<String> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.f100347b = list;
        }

        public final void e(@NotNull List<String> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.f100348c = list;
        }

        public final void f(@NotNull List<String> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.f100346a = list;
        }
    }

    public static final class c extends Dialog {
        c(androidx.fragment.app.s sVar, int i10) {
            super(sVar, i10);
        }

        @Override // android.app.Dialog
        public void onBackPressed() {
            if (DeviceAuthDialog.this.S()) {
                super.onBackPressed();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(DeviceAuthDialog this$0, q0 response) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(response, "response");
        if (this$0.f100331h3.get()) {
            return;
        }
        FacebookRequestError facebookRequestErrorG = response.g();
        if (facebookRequestErrorG == null) {
            try {
                JSONObject jSONObjectI = response.i();
                if (jSONObjectI == null) {
                    jSONObjectI = new JSONObject();
                }
                String string = jSONObjectI.getString("access_token");
                Intrinsics.checkNotNullExpressionValue(string, "resultObject.getString(\"access_token\")");
                this$0.V(string, jSONObjectI.getLong(AccessToken.f98369n), Long.valueOf(jSONObjectI.optLong(AccessToken.f98374s)));
                return;
            } catch (JSONException e10) {
                this$0.U(new com.facebook.u(e10));
                return;
            }
        }
        int iR = facebookRequestErrorG.r();
        if (iR != f100328u3 && iR != f100326s3) {
            if (iR != f100329v3) {
                if (iR == f100327t3) {
                    this$0.T();
                    return;
                }
                FacebookRequestError facebookRequestErrorG2 = response.g();
                com.facebook.u uVarN = facebookRequestErrorG2 == null ? null : facebookRequestErrorG2.n();
                if (uVarN == null) {
                    uVarN = new com.facebook.u();
                }
                this$0.U(uVarN);
                return;
            }
            RequestState requestState = this$0.f100334k3;
            if (requestState != null) {
                com.facebook.devicerequests.internal.a aVar = com.facebook.devicerequests.internal.a.f99534a;
                com.facebook.devicerequests.internal.a.a(requestState.e());
            }
            LoginClient.Request request = this$0.f100337n3;
            if (request != null) {
                this$0.e0(request);
                return;
            } else {
                this$0.T();
                return;
            }
        }
        this$0.b0();
    }

    private final void M(String str, b bVar, String str2, Date date, Date date2) {
        DeviceAuthMethodHandler deviceAuthMethodHandler = this.f100330g3;
        if (deviceAuthMethodHandler != null) {
            com.facebook.g0 g0Var = com.facebook.g0.f99617a;
            deviceAuthMethodHandler.C(str2, com.facebook.g0.o(), str, bVar.c(), bVar.a(), bVar.b(), com.facebook.g.DEVICE_AUTH, date, null, date2);
        }
        Dialog dialog = getDialog();
        if (dialog == null) {
            return;
        }
        dialog.dismiss();
    }

    private final GraphRequest P() {
        Bundle bundle = new Bundle();
        RequestState requestState = this.f100334k3;
        bundle.putString("code", requestState == null ? null : requestState.c());
        bundle.putString("access_token", N());
        return GraphRequest.f98518n.O(null, f100324q3, bundle, new GraphRequest.b() { // from class: com.facebook.login.k
            @Override // com.facebook.GraphRequest.b
            public final void a(q0 q0Var) {
                DeviceAuthDialog.H(this.f101508a, q0Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R(DeviceAuthDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.T();
    }

    private final void V(final String str, long j10, Long l10) {
        Bundle bundle = new Bundle();
        bundle.putString(GraphRequest.f98513a0, "id,permissions,name");
        Date date = null;
        Date date2 = j10 != 0 ? new Date(new Date().getTime() + (j10 * 1000)) : null;
        if ((l10 == null || l10.longValue() != 0) && l10 != null) {
            date = new Date(l10.longValue() * 1000);
        }
        final Date date3 = date;
        com.facebook.g0 g0Var = com.facebook.g0.f99617a;
        final Date date4 = date2;
        GraphRequest graphRequestH = GraphRequest.f98518n.H(new AccessToken(str, com.facebook.g0.o(), com.facebook.appevents.p.f99189d0, null, null, null, null, date2, null, date3, null, 1024, null), "me", new GraphRequest.b() { // from class: com.facebook.login.i
            @Override // com.facebook.GraphRequest.b
            public final void a(q0 q0Var) {
                DeviceAuthDialog.W(this.f101503a, str, date4, date3, q0Var);
            }
        });
        graphRequestH.q0(r0.GET);
        graphRequestH.r0(bundle);
        graphRequestH.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W(DeviceAuthDialog this$0, String accessToken, Date date, Date date2, q0 response) {
        JSONException jSONException;
        EnumSet<a1> enumSetQ;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(accessToken, "$accessToken");
        Intrinsics.checkNotNullParameter(response, "response");
        if (this$0.f100331h3.get()) {
            return;
        }
        FacebookRequestError facebookRequestErrorG = response.g();
        if (facebookRequestErrorG != null) {
            com.facebook.u uVarN = facebookRequestErrorG.n();
            if (uVarN == null) {
                uVarN = new com.facebook.u();
            }
            this$0.U(uVarN);
            return;
        }
        try {
            JSONObject jSONObjectI = response.i();
            if (jSONObjectI == null) {
                try {
                    jSONObjectI = new JSONObject();
                } catch (JSONException e10) {
                    jSONException = e10;
                    this$0.U(new com.facebook.u(jSONException));
                    return;
                }
            }
            String string = jSONObjectI.getString("id");
            Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(\"id\")");
            b bVarH = f100322o3.h(jSONObjectI);
            String string2 = jSONObjectI.getString("name");
            Intrinsics.checkNotNullExpressionValue(string2, "jsonObject.getString(\"name\")");
            RequestState requestState = this$0.f100334k3;
            if (requestState != null) {
                com.facebook.devicerequests.internal.a aVar = com.facebook.devicerequests.internal.a.f99534a;
                com.facebook.devicerequests.internal.a.a(requestState.e());
            }
            com.facebook.internal.b0 b0Var = com.facebook.internal.b0.f99725a;
            com.facebook.g0 g0Var = com.facebook.g0.f99617a;
            com.facebook.internal.x xVarF = com.facebook.internal.b0.f(com.facebook.g0.o());
            Boolean boolValueOf = null;
            if (xVarF != null && (enumSetQ = xVarF.q()) != null) {
                boolValueOf = Boolean.valueOf(enumSetQ.contains(a1.RequireConfirm));
            }
            if (!Intrinsics.areEqual(boolValueOf, Boolean.TRUE) || this$0.f100336m3) {
                this$0.M(string, bVarH, accessToken, date, date2);
                return;
            }
            int i10 = 4 << 1;
            this$0.f100336m3 = true;
            this$0.Y(string, bVarH, accessToken, string2, date, date2);
        } catch (JSONException e11) {
            jSONException = e11;
        }
    }

    private final void X() {
        RequestState requestState = this.f100334k3;
        if (requestState != null) {
            requestState.g(new Date().getTime());
        }
        this.f100332i3 = P().n();
    }

    private final void Y(final String str, final b bVar, final String str2, String str3, final Date date, final Date date2) {
        String string = getResources().getString(l5.b.l.W);
        Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.com_facebook_smart_login_confirmation_title)");
        String string2 = getResources().getString(l5.b.l.V);
        Intrinsics.checkNotNullExpressionValue(string2, "resources.getString(R.string.com_facebook_smart_login_confirmation_continue_as)");
        String string3 = getResources().getString(l5.b.l.U);
        Intrinsics.checkNotNullExpressionValue(string3, "resources.getString(R.string.com_facebook_smart_login_confirmation_cancel)");
        q1 q1Var = q1.f312784a;
        String str4 = String.format(string2, Arrays.copyOf(new Object[]{str3}, 1));
        Intrinsics.checkNotNullExpressionValue(str4, "java.lang.String.format(format, *args)");
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setMessage(string).setCancelable(true).setNegativeButton(str4, new DialogInterface.OnClickListener() { // from class: com.facebook.login.g
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                DeviceAuthDialog.Z(this.f100477a, str, bVar, str2, date, date2, dialogInterface, i10);
            }
        }).setPositiveButton(string3, new DialogInterface.OnClickListener() { // from class: com.facebook.login.h
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                DeviceAuthDialog.a0(this.f100484a, dialogInterface, i10);
            }
        });
        builder.create().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z(DeviceAuthDialog this$0, String userId, b permissions, String accessToken, Date date, Date date2, DialogInterface dialogInterface, int i10) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(userId, "$userId");
        Intrinsics.checkNotNullParameter(permissions, "$permissions");
        Intrinsics.checkNotNullParameter(accessToken, "$accessToken");
        this$0.M(userId, permissions, accessToken, date, date2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a0(DeviceAuthDialog this$0, DialogInterface dialogInterface, int i10) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        View viewQ = this$0.Q(false);
        Dialog dialog = this$0.getDialog();
        if (dialog != null) {
            dialog.setContentView(viewQ);
        }
        LoginClient.Request request = this$0.f100337n3;
        if (request == null) {
            return;
        }
        this$0.e0(request);
    }

    private final void b0() {
        RequestState requestState = this.f100334k3;
        Long lValueOf = requestState == null ? null : Long.valueOf(requestState.b());
        if (lValueOf != null) {
            this.f100333j3 = DeviceAuthMethodHandler.f100350h.a().schedule(new Runnable() { // from class: com.facebook.login.j
                @Override // java.lang.Runnable
                public final void run() {
                    DeviceAuthDialog.c0(this.f101507a);
                }
            }, lValueOf.longValue(), TimeUnit.SECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c0(DeviceAuthDialog this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.X();
    }

    private final void d0(RequestState requestState) {
        this.f100334k3 = requestState;
        TextView textView = this.H1;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("confirmationCode");
            throw null;
        }
        textView.setText(requestState.e());
        com.facebook.devicerequests.internal.a aVar = com.facebook.devicerequests.internal.a.f99534a;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), com.facebook.devicerequests.internal.a.c(requestState.a()));
        TextView textView2 = this.f100339p2;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("instructions");
            throw null;
        }
        textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, bitmapDrawable, (Drawable) null, (Drawable) null);
        TextView textView3 = this.H1;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("confirmationCode");
            throw null;
        }
        textView3.setVisibility(0);
        View view = this.f100338p1;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressBar");
            throw null;
        }
        view.setVisibility(8);
        if (!this.f100336m3 && com.facebook.devicerequests.internal.a.g(requestState.e())) {
            new com.facebook.appevents.f0(getContext()).l(com.facebook.internal.a.f99708y0);
        }
        if (requestState.j()) {
            b0();
        } else {
            X();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f0(DeviceAuthDialog this$0, q0 response) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(response, "response");
        if (this$0.f100335l3) {
            return;
        }
        if (response.g() != null) {
            FacebookRequestError facebookRequestErrorG = response.g();
            com.facebook.u uVarN = facebookRequestErrorG == null ? null : facebookRequestErrorG.n();
            if (uVarN == null) {
                uVarN = new com.facebook.u();
            }
            this$0.U(uVarN);
            return;
        }
        JSONObject jSONObjectI = response.i();
        if (jSONObjectI == null) {
            jSONObjectI = new JSONObject();
        }
        RequestState requestState = new RequestState();
        try {
            requestState.i(jSONObjectI.getString("user_code"));
            requestState.h(jSONObjectI.getString("code"));
            requestState.f(jSONObjectI.getLong("interval"));
            this$0.d0(requestState);
        } catch (JSONException e10) {
            this$0.U(new com.facebook.u(e10));
        }
    }

    @Nullable
    public Map<String, String> L() {
        return null;
    }

    @NotNull
    public String N() {
        StringBuilder sb2 = new StringBuilder();
        f1 f1Var = f1.f99837a;
        sb2.append(f1.c());
        sb2.append('|');
        sb2.append(f1.f());
        return sb2.toString();
    }

    @j0
    protected int O(boolean z10) {
        return z10 ? l5.b.k.H : l5.b.k.F;
    }

    @NotNull
    protected View Q(boolean z10) {
        LayoutInflater layoutInflater = requireActivity().getLayoutInflater();
        Intrinsics.checkNotNullExpressionValue(layoutInflater, "requireActivity().layoutInflater");
        View viewInflate = layoutInflater.inflate(O(z10), (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflater.inflate(getLayoutResId(isSmartLogin), null)");
        View viewFindViewById = viewInflate.findViewById(l5.b.h.f316689o1);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "view.findViewById(R.id.progress_bar)");
        this.f100338p1 = viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(l5.b.h.f316731z0);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.H1 = (TextView) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(l5.b.h.f316692p0);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.Button");
        }
        ((Button) viewFindViewById3).setOnClickListener(new View.OnClickListener() { // from class: com.facebook.login.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeviceAuthDialog.R(this.f100475a, view);
            }
        });
        View viewFindViewById4 = viewInflate.findViewById(l5.b.h.f316712u0);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById4;
        this.f100339p2 = textView;
        textView.setText(Html.fromHtml(getString(l5.b.l.B)));
        return viewInflate;
    }

    protected boolean S() {
        return true;
    }

    protected void T() {
        if (this.f100331h3.compareAndSet(false, true)) {
            RequestState requestState = this.f100334k3;
            if (requestState != null) {
                com.facebook.devicerequests.internal.a aVar = com.facebook.devicerequests.internal.a.f99534a;
                com.facebook.devicerequests.internal.a.a(requestState.e());
            }
            DeviceAuthMethodHandler deviceAuthMethodHandler = this.f100330g3;
            if (deviceAuthMethodHandler != null) {
                deviceAuthMethodHandler.A();
            }
            Dialog dialog = getDialog();
            if (dialog == null) {
                return;
            }
            dialog.dismiss();
        }
    }

    protected void U(@NotNull com.facebook.u ex) {
        Intrinsics.checkNotNullParameter(ex, "ex");
        if (this.f100331h3.compareAndSet(false, true)) {
            RequestState requestState = this.f100334k3;
            if (requestState != null) {
                com.facebook.devicerequests.internal.a aVar = com.facebook.devicerequests.internal.a.f99534a;
                com.facebook.devicerequests.internal.a.a(requestState.e());
            }
            DeviceAuthMethodHandler deviceAuthMethodHandler = this.f100330g3;
            if (deviceAuthMethodHandler != null) {
                deviceAuthMethodHandler.B(ex);
            }
            Dialog dialog = getDialog();
            if (dialog == null) {
                return;
            }
            dialog.dismiss();
        }
    }

    public void e0(@NotNull LoginClient.Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f100337n3 = request;
        Bundle bundle = new Bundle();
        bundle.putString("scope", TextUtils.join(",", request.o()));
        e1 e1Var = e1.f99794a;
        e1.o0(bundle, z0.f100292w, request.j());
        e1.o0(bundle, com.facebook.devicerequests.internal.a.f99537d, request.i());
        bundle.putString("access_token", N());
        com.facebook.devicerequests.internal.a aVar = com.facebook.devicerequests.internal.a.f99534a;
        Map<String, String> mapL = L();
        bundle.putString(com.facebook.devicerequests.internal.a.f99536c, com.facebook.devicerequests.internal.a.e(mapL == null ? null : MapsKt.toMutableMap(mapL)));
        GraphRequest.f98518n.O(null, f100323p3, bundle, new GraphRequest.b() { // from class: com.facebook.login.l
            @Override // com.facebook.GraphRequest.b
            public final void a(q0 q0Var) {
                DeviceAuthDialog.f0(this.f101509a, q0Var);
            }
        }).n();
    }

    @Override // androidx.fragment.app.m
    @NotNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        c cVar = new c(requireActivity(), l5.b.m.W5);
        com.facebook.devicerequests.internal.a aVar = com.facebook.devicerequests.internal.a.f99534a;
        cVar.setContentView(Q(com.facebook.devicerequests.internal.a.f() && !this.f100336m3));
        return cVar;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        RequestState requestState;
        LoginClient loginClientA;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewOnCreateView = super.onCreateView(inflater, viewGroup, bundle);
        t tVar = (t) ((FacebookActivity) requireActivity()).C();
        LoginMethodHandler loginMethodHandlerN = null;
        if (tVar != null && (loginClientA = tVar.A()) != null) {
            loginMethodHandlerN = loginClientA.n();
        }
        this.f100330g3 = (DeviceAuthMethodHandler) loginMethodHandlerN;
        if (bundle == null || (requestState = (RequestState) bundle.getParcelable(f100325r3)) == null) {
            return viewOnCreateView;
        }
        d0(requestState);
        return viewOnCreateView;
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f100335l3 = true;
        this.f100331h3.set(true);
        super.onDestroyView();
        o0 o0Var = this.f100332i3;
        if (o0Var != null) {
            o0Var.cancel(true);
        }
        ScheduledFuture<?> scheduledFuture = this.f100333j3;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(true);
    }

    @Override // androidx.fragment.app.m, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        if (!this.f100335l3) {
            T();
        }
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        if (this.f100334k3 != null) {
            outState.putParcelable(f100325r3, this.f100334k3);
        }
    }
}
