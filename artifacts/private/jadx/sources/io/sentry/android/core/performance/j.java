package io.sentry.android.core.performance;

import android.view.Window;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public class j extends io.sentry.android.core.internal.gestures.j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Runnable f304470b;

    public j(@NotNull Window.Callback callback, @NotNull Runnable runnable) {
        super(callback);
        this.f304470b = runnable;
    }

    @Override // io.sentry.android.core.internal.gestures.j, android.view.Window.Callback
    public void onContentChanged() {
        super.onContentChanged();
        this.f304470b.run();
    }
}
