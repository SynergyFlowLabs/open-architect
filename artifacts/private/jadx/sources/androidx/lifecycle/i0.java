package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final i0 f52360a = new i0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final AtomicBoolean f52361b = new AtomicBoolean(false);

    @androidx.annotation.l1
    public static final class a extends t {
        @Override // androidx.lifecycle.t, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            k1.f52422b.d(activity);
        }
    }

    private i0() {
    }

    @oj.n
    public static final void a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (f52361b.getAndSet(true)) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new a());
    }
}
