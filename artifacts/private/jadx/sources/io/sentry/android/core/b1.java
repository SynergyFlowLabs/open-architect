package io.sentry.android.core;

import android.app.Activity;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public class b1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final b1 f304081b = new b1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private WeakReference<Activity> f304082a;

    private b1() {
    }

    @NotNull
    public static b1 d() {
        return f304081b;
    }

    public void a() {
        this.f304082a = null;
    }

    public void b(@NotNull Activity activity) {
        WeakReference<Activity> weakReference = this.f304082a;
        if (weakReference == null || weakReference.get() == activity) {
            this.f304082a = null;
        }
    }

    @Nullable
    public Activity c() {
        WeakReference<Activity> weakReference = this.f304082a;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public void e(@NotNull Activity activity) {
        WeakReference<Activity> weakReference = this.f304082a;
        if (weakReference == null || weakReference.get() != activity) {
            this.f304082a = new WeakReference<>(activity);
        }
    }
}
