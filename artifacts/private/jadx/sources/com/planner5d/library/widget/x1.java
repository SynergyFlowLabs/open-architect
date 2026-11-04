package com.planner5d.library.widget;

import android.view.View;
import android.view.ViewStub;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class x1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f258878b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private WeakReference<View> f258879a;

    @Nullable
    public final View a() {
        WeakReference<View> weakReference = this.f258879a;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Nullable
    public final View b(@Nullable ViewStub viewStub) {
        if (viewStub == null) {
            WeakReference<View> weakReference = this.f258879a;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }
        if (viewStub.getParent() == null) {
            return viewStub;
        }
        View viewInflate = viewStub.inflate();
        this.f258879a = new WeakReference<>(viewInflate);
        return viewInflate;
    }
}
