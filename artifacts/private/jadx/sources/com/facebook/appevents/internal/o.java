package com.facebook.appevents.internal;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import com.facebook.g0;
import io.sentry.protocol.z;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f99078c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final String f99079d = "_fbSourceApplicationHasBeenSet";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final String f99080e = "com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final String f99081f = "com.facebook.appevents.SourceApplicationInfo.openedByApplink";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f99082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f99083b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @oj.n
        public final void a() {
            g0 g0Var = g0.f99617a;
            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(g0.n()).edit();
            editorEdit.remove(o.f99080e);
            editorEdit.remove(o.f99081f);
            editorEdit.apply();
        }

        @oj.n
        @Nullable
        public final o b() {
            g0 g0Var = g0.f99617a;
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(g0.n());
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (defaultSharedPreferences.contains(o.f99080e)) {
                return new o(defaultSharedPreferences.getString(o.f99080e, null), defaultSharedPreferences.getBoolean(o.f99081f, false), defaultConstructorMarker);
            }
            return null;
        }

        private a() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f99084a = new b();

        private b() {
        }

        @oj.n
        @Nullable
        public static final o a(@NotNull Activity activity) {
            String string;
            Intrinsics.checkNotNullParameter(activity, "activity");
            ComponentName callingActivity = activity.getCallingActivity();
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (callingActivity != null) {
                string = callingActivity.getPackageName();
                if (Intrinsics.areEqual(string, activity.getPackageName())) {
                    return null;
                }
            } else {
                string = "";
            }
            Intent intent = activity.getIntent();
            boolean z10 = false;
            if (intent != null && !intent.getBooleanExtra(o.f99079d, false)) {
                intent.putExtra(o.f99079d, true);
                com.facebook.bolts.e eVar = com.facebook.bolts.e.f99328a;
                Bundle bundleA = com.facebook.bolts.e.a(intent);
                if (bundleA != null) {
                    Bundle bundle = bundleA.getBundle("referer_app_link");
                    if (bundle != null) {
                        string = bundle.getString(z.b.f306542i);
                    }
                    z10 = true;
                }
            }
            if (intent != null) {
                intent.putExtra(o.f99079d, true);
            }
            return new o(string, z10, defaultConstructorMarker);
        }
    }

    public /* synthetic */ o(String str, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z10);
    }

    @oj.n
    public static final void a() {
        f99078c.a();
    }

    @oj.n
    @Nullable
    public static final o c() {
        return f99078c.b();
    }

    @Nullable
    public final String b() {
        return this.f99082a;
    }

    public final boolean d() {
        return this.f99083b;
    }

    public final void e() {
        g0 g0Var = g0.f99617a;
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(g0.n()).edit();
        editorEdit.putString(f99080e, this.f99082a);
        editorEdit.putBoolean(f99081f, this.f99083b);
        editorEdit.apply();
    }

    @NotNull
    public String toString() {
        String str = this.f99083b ? "Applink" : "Unclassified";
        if (this.f99082a == null) {
            return str;
        }
        return str + '(' + ((Object) this.f99082a) + ')';
    }

    private o(String str, boolean z10) {
        this.f99082a = str;
        this.f99083b = z10;
    }
}
