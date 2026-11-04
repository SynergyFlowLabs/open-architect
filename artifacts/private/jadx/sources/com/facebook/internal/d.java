package com.facebook.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends BroadcastReceiver {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private static d f99785c = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final String f99787e = "event_name";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final String f99788f = "event_args";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final String f99789g = "bf_";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f99790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f99784b = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final String f99786d = "com.parse.bolts.measurement_event";

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @androidx.annotation.l1
        public static /* synthetic */ void c() {
        }

        @oj.n
        @Nullable
        public final d a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (d.b() != null) {
                return d.b();
            }
            d dVar = new d(context, null);
            d.c(dVar);
            d.d(dVar);
            return d.b();
        }

        @NotNull
        public final String b() {
            return d.a();
        }

        private a() {
        }
    }

    public /* synthetic */ d(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    public static final /* synthetic */ String a() {
        if (com.facebook.internal.instrument.crashshield.b.e(d.class)) {
            return null;
        }
        try {
            return f99786d;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, d.class);
            return null;
        }
    }

    public static final /* synthetic */ d b() {
        if (com.facebook.internal.instrument.crashshield.b.e(d.class)) {
            return null;
        }
        try {
            return f99785c;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, d.class);
            return null;
        }
    }

    public static final /* synthetic */ void c(d dVar) {
        if (com.facebook.internal.instrument.crashshield.b.e(d.class)) {
            return;
        }
        try {
            dVar.g();
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, d.class);
        }
    }

    public static final /* synthetic */ void d(d dVar) {
        if (com.facebook.internal.instrument.crashshield.b.e(d.class)) {
            return;
        }
        try {
            f99785c = dVar;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, d.class);
        }
    }

    private final void e() {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            androidx.localbroadcastmanager.content.a aVarB = androidx.localbroadcastmanager.content.a.b(this.f99790a);
            Intrinsics.checkNotNullExpressionValue(aVarB, "getInstance(applicationContext)");
            aVarB.f(this);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    @oj.n
    @Nullable
    public static final d f(@NotNull Context context) {
        if (com.facebook.internal.instrument.crashshield.b.e(d.class)) {
            return null;
        }
        try {
            return f99784b.a(context);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, d.class);
            return null;
        }
    }

    private final void g() {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            androidx.localbroadcastmanager.content.a aVarB = androidx.localbroadcastmanager.content.a.b(this.f99790a);
            Intrinsics.checkNotNullExpressionValue(aVarB, "getInstance(applicationContext)");
            aVarB.c(this, new IntentFilter(f99786d));
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    public final void finalize() throws Throwable {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            e();
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@Nullable Context context, @Nullable Intent intent) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            com.facebook.appevents.f0 f0Var = new com.facebook.appevents.f0(context);
            Set<String> setKeySet = null;
            String strStringPlus = Intrinsics.stringPlus(f99789g, intent == null ? null : intent.getStringExtra(f99787e));
            Bundle bundleExtra = intent == null ? null : intent.getBundleExtra(f99788f);
            Bundle bundle = new Bundle();
            if (bundleExtra != null) {
                setKeySet = bundleExtra.keySet();
            }
            if (setKeySet != null) {
                for (String key : setKeySet) {
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    bundle.putString(new Regex("[ -]*$").replace(new Regex("^[ -]*").replace(new Regex("[^0-9a-zA-Z _-]").replace(key, "-"), ""), ""), (String) bundleExtra.get(key));
                }
            }
            f0Var.j(strStringPlus, bundle);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    private d(Context context) {
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        this.f99790a = applicationContext;
    }
}
