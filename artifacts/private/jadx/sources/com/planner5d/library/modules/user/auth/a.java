package com.planner5d.library.modules.user.auth;

import android.app.Activity;
import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@w0(parameters = 0)
public abstract class a implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f222863b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f222864a;

    @Override // com.planner5d.library.modules.user.auth.l
    public void f(@NotNull Activity activity, boolean z10) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f222864a = z10;
    }

    protected final boolean g() {
        return this.f222864a;
    }

    protected final void h(boolean z10) {
        this.f222864a = z10;
    }
}
