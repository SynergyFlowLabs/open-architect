package com.facebook.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f99844b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private Uri f99845a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @oj.n
        @NotNull
        public Uri a(@NotNull String action, @Nullable Bundle bundle) {
            Intrinsics.checkNotNullParameter(action, "action");
            e1 e1Var = e1.f99794a;
            z0 z0Var = z0.f100267a;
            String strB = z0.b();
            StringBuilder sb2 = new StringBuilder();
            com.facebook.g0 g0Var = com.facebook.g0.f99617a;
            sb2.append(com.facebook.g0.B());
            sb2.append("/dialog/");
            sb2.append(action);
            return e1.g(strB, sb2.toString(), bundle);
        }

        private a() {
        }
    }

    public g(@NotNull String action, @Nullable Bundle bundle) {
        Uri uriA;
        Intrinsics.checkNotNullParameter(action, "action");
        bundle = bundle == null ? new Bundle() : bundle;
        i0[] i0VarArrValuesCustom = i0.valuesCustom();
        ArrayList arrayList = new ArrayList(i0VarArrValuesCustom.length);
        for (i0 i0Var : i0VarArrValuesCustom) {
            arrayList.add(i0Var.l());
        }
        if (arrayList.contains(action)) {
            e1 e1Var = e1.f99794a;
            z0 z0Var = z0.f100267a;
            uriA = e1.g(z0.g(), Intrinsics.stringPlus("/dialog/", action), bundle);
        } else {
            uriA = f99844b.a(action, bundle);
        }
        this.f99845a = uriA;
    }

    @oj.n
    @NotNull
    public static Uri a(@NotNull String str, @Nullable Bundle bundle) {
        if (com.facebook.internal.instrument.crashshield.b.e(g.class)) {
            return null;
        }
        try {
            return f99844b.a(str, bundle);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, g.class);
            return null;
        }
    }

    @NotNull
    protected final Uri b() {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return null;
        }
        try {
            return this.f99845a;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return null;
        }
    }

    public final boolean c(@NotNull Activity activity, @Nullable String str) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return false;
        }
        try {
            Intrinsics.checkNotNullParameter(activity, "activity");
            androidx.browser.customtabs.d dVarD = new androidx.browser.customtabs.d.c(com.facebook.login.d.f100457b.b()).d();
            dVarD.f11897a.setPackage(str);
            try {
                dVarD.g(activity, this.f99845a);
                return true;
            } catch (ActivityNotFoundException unused) {
                return false;
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return false;
        }
    }

    protected final void d(@NotNull Uri uri) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(uri, "<set-?>");
            this.f99845a = uri;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }
}
