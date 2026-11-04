package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class x<H> extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Activity f52036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Context f52037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Handler f52038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f52039d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final FragmentManager f52040e;

    public x(@Nullable Activity activity, @NotNull Context context, @NotNull Handler handler, int i10) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f52036a = activity;
        this.f52037b = context;
        this.f52038c = handler;
        this.f52039d = i10;
        this.f52040e = new i0();
    }

    @Override // androidx.fragment.app.u
    @Nullable
    public View c(int i10) {
        return null;
    }

    @Override // androidx.fragment.app.u
    public boolean d() {
        return true;
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    @Nullable
    public final Activity e() {
        return this.f52036a;
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    @NotNull
    public final Context f() {
        return this.f52037b;
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    @NotNull
    public final FragmentManager g() {
        return this.f52040e;
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    @NotNull
    public final Handler h() {
        return this.f52038c;
    }

    public void i(@NotNull String prefix, @Nullable FileDescriptor fileDescriptor, @NotNull PrintWriter writer, @Nullable String[] strArr) {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(writer, "writer");
    }

    public abstract H j();

    @NotNull
    public LayoutInflater k() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f52037b);
        Intrinsics.checkNotNullExpressionValue(layoutInflaterFrom, "from(context)");
        return layoutInflaterFrom;
    }

    public int l() {
        return this.f52039d;
    }

    public boolean m() {
        return true;
    }

    @kotlin.l(message = "Have your FragmentHostCallback implement {@link ActivityResultRegistryOwner}\n      to allow Fragments to use\n      {@link Fragment#registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      with {@link RequestMultiplePermissions}. This method will still be called when Fragments\n      call the deprecated <code>requestPermissions()</code> method.")
    public void n(@NotNull Fragment fragment, @NotNull String[] permissions, int i10) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
    }

    public boolean o(@NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        return true;
    }

    public boolean p(@NotNull String permission) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        return false;
    }

    public void q(@NotNull Fragment fragment, @NotNull Intent intent, int i10) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(intent, "intent");
        r(fragment, intent, i10, null);
    }

    public void r(@NotNull Fragment fragment, @NotNull Intent intent, int i10, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (i10 != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        androidx.core.content.d.A(this.f52037b, intent, bundle);
    }

    @kotlin.l(message = "Have your FragmentHostCallback implement {@link ActivityResultRegistryOwner}\n      to allow Fragments to use\n      {@link Fragment#registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      with {@link StartIntentSenderForResult}. This method will still be called when Fragments\n      call the deprecated <code>startIntentSenderForResult()</code> method.")
    public void s(@NotNull Fragment fragment, @NotNull IntentSender intent, int i10, @Nullable Intent intent2, int i11, int i12, int i13, @Nullable Bundle bundle) throws IntentSender.SendIntentException {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (i10 != -1) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        Activity activity = this.f52036a;
        if (activity == null) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        androidx.core.app.b.U(activity, intent, i10, intent2, i11, i12, i13, bundle);
    }

    public void t() {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x(@NotNull Context context, @NotNull Handler handler, int i10) {
        this(context instanceof Activity ? (Activity) context : null, context, handler, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(handler, "handler");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x(@NotNull s activity) {
        this(activity, activity, new Handler(), 0);
        Intrinsics.checkNotNullParameter(activity, "activity");
    }
}
