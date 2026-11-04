package com.facebook.login;

import android.net.Uri;
import java.util.Collection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.e1;
import kotlin.jvm.internal.j1;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends z {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public static final b f101510t = new b(null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    private static final kotlin.f0<m> f101511u = kotlin.g0.c(a.f101514a);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    private Uri f101512r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    private String f101513s;

    static final class a extends l0 implements Function0<m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f101514a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final m invoke() {
            return new m();
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ kotlin.reflect.o<Object>[] f101515a = {j1.u(new e1(j1.d(b.class), "instance", "getInstance()Lcom/facebook/login/DeviceLoginManager;"))};

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final m a() {
            return (m) m.R0().getValue();
        }

        private b() {
        }
    }

    public static final /* synthetic */ kotlin.f0 R0() {
        if (com.facebook.internal.instrument.crashshield.b.e(m.class)) {
            return null;
        }
        try {
            return f101511u;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, m.class);
            return null;
        }
    }

    @Nullable
    public final String S0() {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return null;
        }
        try {
            return this.f101513s;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return null;
        }
    }

    @Nullable
    public final Uri T0() {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return null;
        }
        try {
            return this.f101512r;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return null;
        }
    }

    public final void U0(@Nullable String str) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            this.f101513s = str;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    public final void V0(@Nullable Uri uri) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            this.f101512r = uri;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    @Override // com.facebook.login.z
    @NotNull
    protected LoginClient.Request o(@Nullable Collection<String> collection) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return null;
        }
        try {
            LoginClient.Request requestO = super.o(collection);
            Uri uri = this.f101512r;
            if (uri != null) {
                requestO.x(uri.toString());
            }
            String str = this.f101513s;
            if (str == null) {
                return requestO;
            }
            requestO.w(str);
            return requestO;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return null;
        }
    }
}
