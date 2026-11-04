package io.customer.sdk.data.store;

import android.content.Context;
import androidx.core.app.c0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class d implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f288524a;

    public d(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f288524a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String f(d dVar) {
        return dVar.f288524a.getApplicationInfo().loadLabel(dVar.f288524a.getPackageManager()).toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String i(d dVar) {
        String versionName = dVar.f288524a.getPackageManager().getPackageInfo(dVar.f288524a.getPackageName(), 0).versionName;
        Intrinsics.checkNotNullExpressionValue(versionName, "versionName");
        return versionName;
    }

    private final String n(Function0<String> function0) {
        try {
            return function0.invoke();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // io.customer.sdk.data.store.a
    @Nullable
    public String b() {
        return n(new Function0() { // from class: io.customer.sdk.data.store.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d.i(this.f288522a);
            }
        });
    }

    @Override // io.customer.sdk.data.store.a
    @NotNull
    public String e() {
        String packageName = this.f288524a.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        return packageName;
    }

    @Override // io.customer.sdk.data.store.a
    @Nullable
    public String j() {
        return n(new Function0() { // from class: io.customer.sdk.data.store.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d.f(this.f288523a);
            }
        });
    }

    @NotNull
    public final Context k() {
        return this.f288524a;
    }

    @Override // io.customer.sdk.data.store.a
    public boolean m() {
        return c0.q(this.f288524a).a();
    }
}
