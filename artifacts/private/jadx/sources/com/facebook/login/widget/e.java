package com.facebook.login.widget;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.f1;
import androidx.fragment.app.Fragment;
import com.facebook.AccessToken;
import com.facebook.Profile;
import com.facebook.internal.b0;
import com.facebook.internal.e1;
import com.facebook.internal.x;
import com.facebook.internal.z0;
import com.facebook.login.d0;
import com.facebook.login.h0;
import com.facebook.login.p;
import com.facebook.login.z;
import com.facebook.o;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import kotlin.b1;
import kotlin.collections.CollectionsKt;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.q1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public class e extends o {

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    @NotNull
    public static final a f101590i3 = new a(null);

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private static final String f101591j3 = e.class.getName();

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    private static final int f101592k3 = 255;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private static final int f101593l3 = 0;
    private int H1;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    @Nullable
    private com.facebook.k f101594g3;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    @Nullable
    private androidx.activity.result.h<Collection<String>> f101595h3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f101596j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private String f101597k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private String f101598l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final b f101599m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f101600n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private l.c f101601o;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    private f0<? extends z> f101602p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @Nullable
    private Float f101603p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @NotNull
    private final String f101604p2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private d f101605s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f101606t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    private l f101607v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    private com.facebook.h f101608w;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private com.facebook.login.e f101609a = com.facebook.login.e.FRIENDS;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private List<String> f101610b = CollectionsKt.emptyList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private p f101611c = p.NATIVE_WITH_FALLBACK;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private String f101612d = z0.I;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private d0 f101613e = d0.FACEBOOK;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f101614f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        private String f101615g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f101616h;

        public final void a() {
            this.f101610b = CollectionsKt.emptyList();
        }

        @NotNull
        public final String b() {
            return this.f101612d;
        }

        @NotNull
        public final com.facebook.login.e c() {
            return this.f101609a;
        }

        @NotNull
        public final p d() {
            return this.f101611c;
        }

        @NotNull
        public final d0 e() {
            return this.f101613e;
        }

        @Nullable
        public final String f() {
            return this.f101615g;
        }

        @NotNull
        public final List<String> g() {
            return this.f101610b;
        }

        public final boolean h() {
            return this.f101616h;
        }

        public final boolean i() {
            return this.f101614f;
        }

        public final void j(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f101612d = str;
        }

        public final void k(@NotNull com.facebook.login.e eVar) {
            Intrinsics.checkNotNullParameter(eVar, "<set-?>");
            this.f101609a = eVar;
        }

        public final void l(@NotNull p pVar) {
            Intrinsics.checkNotNullParameter(pVar, "<set-?>");
            this.f101611c = pVar;
        }

        public final void m(@NotNull d0 d0Var) {
            Intrinsics.checkNotNullParameter(d0Var, "<set-?>");
            this.f101613e = d0Var;
        }

        public final void n(@Nullable String str) {
            this.f101615g = str;
        }

        public final void o(@NotNull List<String> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.f101610b = list;
        }

        public final void p(boolean z10) {
            this.f101616h = z10;
        }

        protected final void q(boolean z10) {
            this.f101614f = z10;
        }
    }

    protected class c implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f101617a;

        public c(e this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f101617a = this$0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void g(z loginManager, DialogInterface dialogInterface, int i10) {
            if (com.facebook.internal.instrument.crashshield.b.e(c.class)) {
                return;
            }
            try {
                Intrinsics.checkNotNullParameter(loginManager, "$loginManager");
                loginManager.f0();
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.b.c(th2, c.class);
            }
        }

        @NotNull
        protected z b() {
            if (com.facebook.internal.instrument.crashshield.b.e(this)) {
                return null;
            }
            try {
                z zVarE = z.f101684j.e();
                zVarE.D0(this.f101617a.getDefaultAudience());
                zVarE.G0(this.f101617a.getLoginBehavior());
                zVarE.H0(c());
                zVarE.C0(this.f101617a.getAuthType());
                zVarE.F0(d());
                zVarE.K0(this.f101617a.getShouldSkipAccountDeduplication());
                zVarE.I0(this.f101617a.getMessengerPageId());
                zVarE.J0(this.f101617a.getResetMessengerState());
                return zVarE;
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.b.c(th2, this);
                return null;
            }
        }

        @NotNull
        protected final d0 c() {
            if (com.facebook.internal.instrument.crashshield.b.e(this)) {
                return null;
            }
            try {
                return d0.FACEBOOK;
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.b.c(th2, this);
                return null;
            }
        }

        protected final boolean d() {
            com.facebook.internal.instrument.crashshield.b.e(this);
            return false;
        }

        protected final void e() {
            if (com.facebook.internal.instrument.crashshield.b.e(this)) {
                return;
            }
            try {
                z zVarB = b();
                androidx.activity.result.h hVar = this.f101617a.f101595h3;
                if (hVar != null) {
                    z.d dVar = (z.d) hVar.a();
                    com.facebook.k callbackManager = this.f101617a.getCallbackManager();
                    if (callbackManager == null) {
                        callbackManager = new com.facebook.internal.f();
                    }
                    dVar.e(callbackManager);
                    hVar.b(this.f101617a.getProperties().g());
                    return;
                }
                if (this.f101617a.getFragment() != null) {
                    Fragment fragment = this.f101617a.getFragment();
                    if (fragment == null) {
                        return;
                    }
                    e eVar = this.f101617a;
                    zVarB.O(fragment, eVar.getProperties().g(), eVar.getLoggerID());
                    return;
                }
                if (this.f101617a.getNativeFragment() == null) {
                    zVarB.H(this.f101617a.getActivity(), this.f101617a.getProperties().g(), this.f101617a.getLoggerID());
                    return;
                }
                android.app.Fragment nativeFragment = this.f101617a.getNativeFragment();
                if (nativeFragment == null) {
                    return;
                }
                e eVar2 = this.f101617a;
                zVarB.J(nativeFragment, eVar2.getProperties().g(), eVar2.getLoggerID());
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.b.c(th2, this);
            }
        }

        protected final void f(@NotNull Context context) {
            String string;
            if (com.facebook.internal.instrument.crashshield.b.e(this)) {
                return;
            }
            try {
                Intrinsics.checkNotNullParameter(context, "context");
                final z zVarB = b();
                if (!this.f101617a.f101596j) {
                    zVarB.f0();
                    return;
                }
                String string2 = this.f101617a.getResources().getString(h0.l.M);
                Intrinsics.checkNotNullExpressionValue(string2, "resources.getString(R.string.com_facebook_loginview_log_out_action)");
                String string3 = this.f101617a.getResources().getString(h0.l.I);
                Intrinsics.checkNotNullExpressionValue(string3, "resources.getString(R.string.com_facebook_loginview_cancel_action)");
                Profile profileB = Profile.f98555h.b();
                if ((profileB == null ? null : profileB.j()) != null) {
                    q1 q1Var = q1.f312784a;
                    String string4 = this.f101617a.getResources().getString(h0.l.O);
                    Intrinsics.checkNotNullExpressionValue(string4, "resources.getString(R.string.com_facebook_loginview_logged_in_as)");
                    string = String.format(string4, Arrays.copyOf(new Object[]{profileB.j()}, 1));
                    Intrinsics.checkNotNullExpressionValue(string, "java.lang.String.format(format, *args)");
                } else {
                    string = this.f101617a.getResources().getString(h0.l.P);
                    Intrinsics.checkNotNullExpressionValue(string, "{\n          resources.getString(R.string.com_facebook_loginview_logged_in_using_facebook)\n        }");
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setMessage(string).setCancelable(true).setPositiveButton(string2, new DialogInterface.OnClickListener() { // from class: com.facebook.login.widget.f
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        e.c.g(zVarB, dialogInterface, i10);
                    }
                }).setNegativeButton(string3, (DialogInterface.OnClickListener) null);
                builder.create().show();
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.b.c(th2, this);
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(@NotNull View v10) {
            if (!com.facebook.internal.instrument.crashshield.b.e(this)) {
                try {
                    if (!com.facebook.internal.instrument.crashshield.b.e(this)) {
                        try {
                            Intrinsics.checkNotNullParameter(v10, "v");
                            this.f101617a.b(v10);
                            AccessToken.d dVar = AccessToken.f98366l;
                            AccessToken accessTokenI = dVar.i();
                            boolean zK = dVar.k();
                            if (zK) {
                                Context context = this.f101617a.getContext();
                                Intrinsics.checkNotNullExpressionValue(context, "context");
                                f(context);
                            } else {
                                e();
                            }
                            com.facebook.appevents.f0 f0Var = new com.facebook.appevents.f0(this.f101617a.getContext());
                            Bundle bundle = new Bundle();
                            bundle.putInt("logging_in", accessTokenI != null ? 0 : 1);
                            bundle.putInt("access_token_expired", zK ? 1 : 0);
                            f0Var.m(com.facebook.internal.a.f99671g, bundle);
                        } catch (Throwable th2) {
                            com.facebook.internal.instrument.crashshield.b.c(th2, this);
                        }
                    }
                } catch (Throwable th3) {
                    com.facebook.internal.instrument.crashshield.b.c(th3, this);
                }
            }
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 com.facebook.login.widget.e$d, still in use, count: 1, list:
      (r0v0 com.facebook.login.widget.e$d) from 0x0037: SPUT (r0v0 com.facebook.login.widget.e$d) com.facebook.login.widget.e.d.d com.facebook.login.widget.e$d
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class d {
        AUTOMATIC("automatic", 0),
        DISPLAY_ALWAYS("display_always", 1),
        NEVER_DISPLAY("never_display", 2);


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private static final d f101619d = new d("automatic", 0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f101624a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f101625b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final a f101618c = new a(null);

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Nullable
            public final d a(int i10) {
                for (d dVar : d.values()) {
                    if (dVar.n() == i10) {
                        return dVar;
                    }
                }
                return null;
            }

            @NotNull
            public final d b() {
                return d.f101619d;
            }

            private a() {
            }
        }

        static {
        }

        private d(String str, int i10) {
            super(str, i);
            this.f101624a = str;
            this.f101625b = i10;
        }

        public static d valueOf(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return (d) Enum.valueOf(d.class, value);
        }

        public static d[] values() {
            d[] dVarArr = f101623h;
            return (d[]) Arrays.copyOf(dVarArr, dVarArr.length);
        }

        public final int n() {
            return this.f101625b;
        }

        @Override // java.lang.Enum
        @NotNull
        public String toString() {
            return this.f101624a;
        }
    }

    /* JADX INFO: renamed from: com.facebook.login.widget.e$e, reason: collision with other inner class name */
    public /* synthetic */ class C0914e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f101626a;

        static {
            int[] iArr = new int[d.values().length];
            iArr[d.AUTOMATIC.ordinal()] = 1;
            iArr[d.DISPLAY_ALWAYS.ordinal()] = 2;
            iArr[d.NEVER_DISPLAY.ordinal()] = 3;
            f101626a = iArr;
        }
    }

    public static final class f extends com.facebook.h {
        f() {
        }

        @Override // com.facebook.h
        protected void d(@Nullable AccessToken accessToken, @Nullable AccessToken accessToken2) {
            e.this.G();
            e.this.E();
        }
    }

    static final class g extends l0 implements Function0<z> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f101628a = new g();

        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final z invoke() {
            return z.f101684j.e();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected e(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11, @NotNull String analyticsButtonCreatedEventName, @NotNull String analyticsButtonTappedEventName) {
        super(context, attributeSet, i10, i11, analyticsButtonCreatedEventName, analyticsButtonTappedEventName);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(analyticsButtonCreatedEventName, "analyticsButtonCreatedEventName");
        Intrinsics.checkNotNullParameter(analyticsButtonTappedEventName, "analyticsButtonTappedEventName");
        this.f101599m = new b();
        this.f101601o = l.c.BLUE;
        this.f101605s = d.f101618c.b();
        this.f101606t = l.f101662j;
        this.f101602p0 = g0.c(g.f101628a);
        this.H1 = 255;
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
        this.f101604p2 = string;
    }

    private final int A(String str) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return 0;
        }
        try {
            return getCompoundPaddingLeft() + getCompoundDrawablePadding() + f(str) + getCompoundPaddingRight();
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(com.facebook.k.a aVar) {
    }

    private final void I(x xVar) {
        if (com.facebook.internal.instrument.crashshield.b.e(this) || xVar == null) {
            return;
        }
        try {
            if (xVar.j() && getVisibility() == 0) {
                y(xVar.i());
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    private final void t() {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            int i10 = C0914e.f101626a[this.f101605s.ordinal()];
            if (i10 == 1) {
                e1 e1Var = e1.f99794a;
                final String strF = e1.F(getContext());
                com.facebook.g0 g0Var = com.facebook.g0.f99617a;
                com.facebook.g0.y().execute(new Runnable() { // from class: com.facebook.login.widget.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        e.u(strF, this);
                    }
                });
                return;
            }
            if (i10 != 2) {
                return;
            }
            String string = getResources().getString(h0.l.X);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.com_facebook_tooltip_default)");
            y(string);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(String appId, final e this$0) {
        Intrinsics.checkNotNullParameter(appId, "$appId");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        b0 b0Var = b0.f99725a;
        final x xVarN = b0.n(appId, false);
        this$0.getActivity().runOnUiThread(new Runnable() { // from class: com.facebook.login.widget.b
            @Override // java.lang.Runnable
            public final void run() {
                e.v(this.f101586a, xVarN);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(e this$0, x xVar) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.I(xVar);
    }

    private final void y(String str) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            l lVar = new l(str, this);
            lVar.h(this.f101601o);
            lVar.g(this.f101606t);
            lVar.i();
            this.f101607v = lVar;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    protected final void C(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            d.a aVar = d.f101618c;
            this.f101605s = aVar.b();
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, h0.n.f101313h9, i10, i11);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context\n            .theme\n            .obtainStyledAttributes(\n                attrs, R.styleable.com_facebook_login_view, defStyleAttr, defStyleRes)");
            try {
                this.f101596j = typedArrayObtainStyledAttributes.getBoolean(h0.n.f101324i9, true);
                setLoginText(typedArrayObtainStyledAttributes.getString(h0.n.f101357l9));
                setLogoutText(typedArrayObtainStyledAttributes.getString(h0.n.f101368m9));
                d dVarA = aVar.a(typedArrayObtainStyledAttributes.getInt(h0.n.f101379n9, aVar.b().n()));
                if (dVarA == null) {
                    dVarA = aVar.b();
                }
                this.f101605s = dVarA;
                if (typedArrayObtainStyledAttributes.hasValue(h0.n.f101335j9)) {
                    this.f101603p1 = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(h0.n.f101335j9, 0.0f));
                }
                int integer = typedArrayObtainStyledAttributes.getInteger(h0.n.f101346k9, 255);
                this.H1 = integer;
                int iMax = Math.max(0, integer);
                this.H1 = iMax;
                this.H1 = Math.min(255, iMax);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        } catch (Throwable th3) {
            com.facebook.internal.instrument.crashshield.b.c(th3, this);
        }
    }

    public final void D(@NotNull com.facebook.k callbackManager, @NotNull com.facebook.p<com.facebook.login.b0> callback) {
        Intrinsics.checkNotNullParameter(callbackManager, "callbackManager");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f101602p0.getValue().p0(callbackManager, callback);
        if (this.f101594g3 == null) {
            this.f101594g3 = callbackManager;
        }
    }

    protected final void E() {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            setCompoundDrawablesWithIntrinsicBounds(j.a.b(getContext(), l5.b.g.I0), (Drawable) null, (Drawable) null, (Drawable) null);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    @e.b(29)
    protected final void F() {
        int stateCount;
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            Float f10 = this.f101603p1;
            if (f10 == null) {
                return;
            }
            float fFloatValue = f10.floatValue();
            Drawable background = getBackground();
            if ((background instanceof StateListDrawable) && (stateCount = ((StateListDrawable) background).getStateCount()) > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    Drawable stateDrawable = ((StateListDrawable) background).getStateDrawable(i10);
                    GradientDrawable gradientDrawable = stateDrawable instanceof GradientDrawable ? (GradientDrawable) stateDrawable : null;
                    if (gradientDrawable != null) {
                        gradientDrawable.setCornerRadius(fFloatValue);
                    }
                    if (i11 >= stateCount) {
                        break;
                    } else {
                        i10 = i11;
                    }
                }
            }
            if (background instanceof GradientDrawable) {
                ((GradientDrawable) background).setCornerRadius(fFloatValue);
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    protected final void G() {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            Resources resources = getResources();
            if (!isInEditMode() && AccessToken.f98366l.k()) {
                String string = this.f101598l;
                if (string == null) {
                    string = resources.getString(h0.l.N);
                }
                setText(string);
                return;
            }
            String str = this.f101597k;
            if (str != null) {
                setText(str);
                return;
            }
            String string2 = resources.getString(getLoginButtonContinueLabel());
            Intrinsics.checkNotNullExpressionValue(string2, "resources.getString(loginButtonContinueLabel)");
            int width = getWidth();
            if (width != 0 && A(string2) > width) {
                string2 = resources.getString(h0.l.J);
                Intrinsics.checkNotNullExpressionValue(string2, "resources.getString(R.string.com_facebook_loginview_log_in_button)");
            }
            setText(string2);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    protected final void H() {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            getBackground().setAlpha(this.H1);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    public final void J(@NotNull com.facebook.k callbackManager) {
        Intrinsics.checkNotNullParameter(callbackManager, "callbackManager");
        this.f101602p0.getValue().O0(callbackManager);
    }

    @Override // com.facebook.o
    protected void c(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            super.c(context, attributeSet, i10, i11);
            setInternalOnClickListener(getNewLoginClickListener());
            C(context, attributeSet, i10, i11);
            if (isInEditMode()) {
                setBackgroundColor(getResources().getColor(l5.b.e.V));
                setLoginText("Continue with Facebook");
            } else {
                this.f101608w = new f();
            }
            G();
            F();
            H();
            E();
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    @NotNull
    public final String getAuthType() {
        return this.f101599m.b();
    }

    @Nullable
    public final com.facebook.k getCallbackManager() {
        return this.f101594g3;
    }

    @NotNull
    public final com.facebook.login.e getDefaultAudience() {
        return this.f101599m.c();
    }

    @Override // com.facebook.o
    protected int getDefaultRequestCode() {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return 0;
        }
        try {
            return com.facebook.internal.f.c.Login.l();
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return 0;
        }
    }

    @Override // com.facebook.o
    protected int getDefaultStyleResource() {
        return h0.m.f101049a6;
    }

    @NotNull
    public final String getLoggerID() {
        return this.f101604p2;
    }

    @NotNull
    public final p getLoginBehavior() {
        return this.f101599m.d();
    }

    @f1
    protected final int getLoginButtonContinueLabel() {
        return h0.l.K;
    }

    @NotNull
    protected final f0<z> getLoginManagerLazy() {
        return this.f101602p0;
    }

    @NotNull
    public final d0 getLoginTargetApp() {
        return this.f101599m.e();
    }

    @Nullable
    public final String getLoginText() {
        return this.f101597k;
    }

    @Nullable
    public final String getLogoutText() {
        return this.f101598l;
    }

    @Nullable
    public final String getMessengerPageId() {
        return this.f101599m.f();
    }

    @NotNull
    protected c getNewLoginClickListener() {
        return new c(this);
    }

    @NotNull
    public final List<String> getPermissions() {
        return this.f101599m.g();
    }

    @NotNull
    protected final b getProperties() {
        return this.f101599m;
    }

    public final boolean getResetMessengerState() {
        return this.f101599m.h();
    }

    public final boolean getShouldSkipAccountDeduplication() {
        return this.f101599m.i();
    }

    public final long getToolTipDisplayTime() {
        return this.f101606t;
    }

    @NotNull
    public final d getToolTipMode() {
        return this.f101605s;
    }

    @NotNull
    public final l.c getToolTipStyle() {
        return this.f101601o;
    }

    @Override // com.facebook.o, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            super.onAttachedToWindow();
            if (getContext() instanceof androidx.activity.result.l) {
                Object context = getContext();
                if (context == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.activity.result.ActivityResultRegistryOwner");
                }
                this.f101595h3 = ((androidx.activity.result.l) context).getActivityResultRegistry().m("facebook-login", this.f101602p0.getValue().m(this.f101594g3, this.f101604p2), new androidx.activity.result.a() { // from class: com.facebook.login.widget.d
                    @Override // androidx.activity.result.a
                    public final void a(Object obj) {
                        e.B((com.facebook.k.a) obj);
                    }
                });
            }
            com.facebook.h hVar = this.f101608w;
            if (hVar != null && hVar.c()) {
                hVar.e();
                G();
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            super.onDetachedFromWindow();
            androidx.activity.result.h<Collection<String>> hVar = this.f101595h3;
            if (hVar != null) {
                hVar.d();
            }
            com.facebook.h hVar2 = this.f101608w;
            if (hVar2 != null) {
                hVar2.f();
            }
            x();
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    @Override // com.facebook.o, android.widget.TextView, android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        if (!com.facebook.internal.instrument.crashshield.b.e(this)) {
            try {
                Intrinsics.checkNotNullParameter(canvas, "canvas");
                super.onDraw(canvas);
                if (!this.f101600n && !isInEditMode()) {
                    this.f101600n = true;
                    t();
                }
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.b.c(th2, this);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            super.onLayout(z10, i10, i11, i12, i13);
            G();
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
            int compoundPaddingTop = getCompoundPaddingTop() + ((int) Math.ceil(Math.abs(fontMetrics.top) + Math.abs(fontMetrics.bottom))) + getCompoundPaddingBottom();
            Resources resources = getResources();
            int iZ = z(i10);
            String string = this.f101598l;
            if (string == null) {
                string = resources.getString(h0.l.N);
                Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.com_facebook_loginview_log_out_button)");
            }
            setMeasuredDimension(View.resolveSize(Math.max(iZ, A(string)), i10), compoundPaddingTop);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onVisibilityChanged(@NotNull View changedView, int i10) {
        if (!com.facebook.internal.instrument.crashshield.b.e(this)) {
            try {
                Intrinsics.checkNotNullParameter(changedView, "changedView");
                super.onVisibilityChanged(changedView, i10);
                if (i10 != 0) {
                    x();
                }
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.b.c(th2, this);
            }
        }
    }

    public final void setAuthType(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f101599m.j(value);
    }

    public final void setDefaultAudience(@NotNull com.facebook.login.e value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f101599m.k(value);
    }

    public final void setLoginBehavior(@NotNull p value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f101599m.l(value);
    }

    protected final void setLoginManagerLazy(@NotNull f0<? extends z> f0Var) {
        Intrinsics.checkNotNullParameter(f0Var, "<set-?>");
        this.f101602p0 = f0Var;
    }

    public final void setLoginTargetApp(@NotNull d0 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f101599m.m(value);
    }

    public final void setLoginText(@Nullable String str) {
        this.f101597k = str;
        G();
    }

    public final void setLogoutText(@Nullable String str) {
        this.f101598l = str;
        G();
    }

    public final void setMessengerPageId(@Nullable String str) {
        this.f101599m.n(str);
    }

    public final void setPermissions(@NotNull String... permissions) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        this.f101599m.o(CollectionsKt.listOfNotNull(Arrays.copyOf(permissions, permissions.length)));
    }

    @kotlin.l(message = "Use setPermissions instead", replaceWith = @b1(expression = "setPermissions", imports = {}))
    public final void setPublishPermissions(@NotNull List<String> permissions) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        this.f101599m.o(permissions);
    }

    @kotlin.l(message = "Use setPermissions instead", replaceWith = @b1(expression = "setPermissions", imports = {}))
    public final void setReadPermissions(@NotNull List<String> permissions) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        this.f101599m.o(permissions);
    }

    public final void setResetMessengerState(boolean z10) {
        this.f101599m.p(z10);
    }

    public final void setToolTipDisplayTime(long j10) {
        this.f101606t = j10;
    }

    public final void setToolTipMode(@NotNull d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<set-?>");
        this.f101605s = dVar;
    }

    public final void setToolTipStyle(@NotNull l.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f101601o = cVar;
    }

    public final void w() {
        this.f101599m.a();
    }

    public final void x() {
        l lVar = this.f101607v;
        if (lVar != null) {
            lVar.d();
        }
        this.f101607v = null;
    }

    protected final int z(int i10) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return 0;
        }
        try {
            Resources resources = getResources();
            String string = this.f101597k;
            if (string == null) {
                string = resources.getString(h0.l.K);
                int iA = A(string);
                if (View.resolveSize(iA, i10) < iA) {
                    string = resources.getString(h0.l.J);
                }
            }
            return A(string);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return 0;
        }
    }

    public final void setPermissions(@NotNull List<String> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f101599m.o(value);
    }

    @kotlin.l(message = "Use setPermissions instead", replaceWith = @b1(expression = "setPermissions", imports = {}))
    public final void setPublishPermissions(@NotNull String... permissions) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        this.f101599m.o(CollectionsKt.listOfNotNull(Arrays.copyOf(permissions, permissions.length)));
    }

    @kotlin.l(message = "Use setPermissions instead", replaceWith = @b1(expression = "setPermissions", imports = {}))
    public final void setReadPermissions(@NotNull String... permissions) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        this.f101599m.o(CollectionsKt.listOfNotNull(Arrays.copyOf(permissions, permissions.length)));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(@NotNull Context context) {
        this(context, null, 0, 0, com.facebook.internal.a.f99690p0, com.facebook.internal.a.f99702v0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, com.facebook.internal.a.f99690p0, com.facebook.internal.a.f99702v0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0, com.facebook.internal.a.f99690p0, com.facebook.internal.a.f99702v0);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
