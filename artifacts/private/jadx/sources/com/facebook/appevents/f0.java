package com.facebook.appevents;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.b1;
import com.facebook.AccessToken;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f98865b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final t f98866a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ f0 d(a aVar, Context context, String str, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                str = null;
            }
            return aVar.b(context, str);
        }

        @oj.n
        @NotNull
        @oj.j
        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        public final f0 a(@Nullable Context context) {
            return d(this, context, null, 2, null);
        }

        @oj.n
        @NotNull
        @oj.j
        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        public final f0 b(@Nullable Context context, @Nullable String str) {
            return new f0(context, str);
        }

        @oj.n
        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        @NotNull
        public final f0 c(@NotNull String activityName, @Nullable String str, @Nullable AccessToken accessToken) {
            Intrinsics.checkNotNullParameter(activityName, "activityName");
            return new f0(activityName, str, accessToken);
        }

        @oj.n
        @NotNull
        public final Executor e() {
            return t.f99255c.j();
        }

        @oj.n
        @NotNull
        public final q.b f() {
            return t.f99255c.l();
        }

        @oj.n
        @Nullable
        public final String g() {
            return t.f99255c.n();
        }

        @oj.n
        @b1({b1.a.GROUP_ID})
        public final void h(@NotNull Map<String, String> ud2) {
            Intrinsics.checkNotNullParameter(ud2, "ud");
            l0 l0Var = l0.f99122a;
            l0.m(ud2);
        }

        @oj.n
        public final void i(@Nullable Bundle bundle) {
            l0 l0Var = l0.f99122a;
            l0.n(bundle);
        }

        private a() {
        }
    }

    public f0(@NotNull t loggerImpl) {
        Intrinsics.checkNotNullParameter(loggerImpl, "loggerImpl");
        this.f98866a = loggerImpl;
    }

    @oj.n
    @NotNull
    @oj.j
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public static final f0 a(@Nullable Context context) {
        return f98865b.a(context);
    }

    @oj.n
    @NotNull
    @oj.j
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public static final f0 b(@Nullable Context context, @Nullable String str) {
        return f98865b.b(context, str);
    }

    @oj.n
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    @NotNull
    public static final f0 c(@NotNull String str, @Nullable String str2, @Nullable AccessToken accessToken) {
        return f98865b.c(str, str2, accessToken);
    }

    @oj.n
    @NotNull
    public static final Executor e() {
        return f98865b.e();
    }

    @oj.n
    @NotNull
    public static final q.b f() {
        return f98865b.f();
    }

    @oj.n
    @Nullable
    public static final String g() {
        return f98865b.g();
    }

    @oj.n
    @b1({b1.a.GROUP_ID})
    public static final void q(@NotNull Map<String, String> map) {
        f98865b.h(map);
    }

    @oj.n
    public static final void r(@Nullable Bundle bundle) {
        f98865b.i(bundle);
    }

    public final void d() {
        this.f98866a.o();
    }

    public final void h(@NotNull Bundle parameters) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        if (!((parameters.getInt("previous") & 2) != 0)) {
            com.facebook.g0 g0Var = com.facebook.g0.f99617a;
            if (!com.facebook.g0.s()) {
                return;
            }
        }
        this.f98866a.F("fb_sdk_settings_changed", null, parameters);
    }

    public final void i(@Nullable String str, double d10, @Nullable Bundle bundle) {
        com.facebook.g0 g0Var = com.facebook.g0.f99617a;
        if (com.facebook.g0.s()) {
            this.f98866a.A(str, d10, bundle);
        }
    }

    public final void j(@Nullable String str, @Nullable Bundle bundle) {
        com.facebook.g0 g0Var = com.facebook.g0.f99617a;
        if (com.facebook.g0.s()) {
            this.f98866a.B(str, bundle);
        }
    }

    public final void k(@Nullable String str, @Nullable String str2) {
        this.f98866a.E(str, str2);
    }

    public final void l(@Nullable String str) {
        com.facebook.g0 g0Var = com.facebook.g0.f99617a;
        if (com.facebook.g0.s()) {
            this.f98866a.F(str, null, null);
        }
    }

    public final void m(@Nullable String str, @Nullable Bundle bundle) {
        com.facebook.g0 g0Var = com.facebook.g0.f99617a;
        if (com.facebook.g0.s()) {
            this.f98866a.F(str, null, bundle);
        }
    }

    public final void n(@Nullable String str, @Nullable Double d10, @Nullable Bundle bundle) {
        com.facebook.g0 g0Var = com.facebook.g0.f99617a;
        if (com.facebook.g0.s()) {
            this.f98866a.F(str, d10, bundle);
        }
    }

    public final void o(@Nullable String str, @Nullable BigDecimal bigDecimal, @Nullable Currency currency, @Nullable Bundle bundle) {
        com.facebook.g0 g0Var = com.facebook.g0.f99617a;
        if (com.facebook.g0.s()) {
            this.f98866a.G(str, bigDecimal, currency, bundle);
        }
    }

    public final void p(@Nullable BigDecimal bigDecimal, @Nullable Currency currency, @Nullable Bundle bundle) {
        com.facebook.g0 g0Var = com.facebook.g0.f99617a;
        if (com.facebook.g0.s()) {
            this.f98866a.M(bigDecimal, currency, bundle);
        }
    }

    public f0(@Nullable Context context) {
        this(new t(context, (String) null, (AccessToken) null));
    }

    public f0(@Nullable Context context, @Nullable String str) {
        this(new t(context, str, (AccessToken) null));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f0(@NotNull String activityName, @Nullable String str, @Nullable AccessToken accessToken) {
        this(new t(activityName, str, accessToken));
        Intrinsics.checkNotNullParameter(activityName, "activityName");
    }
}
