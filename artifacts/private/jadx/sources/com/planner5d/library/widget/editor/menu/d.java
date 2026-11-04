package com.planner5d.library.widget.editor.menu;

import android.app.Activity;
import android.view.MenuItem;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.widget.editor.helper.f2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
public final class d implements com.planner5d.library.widget.menu.p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f257050c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final f2 f257051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f257052b;

    public d(@NotNull f2 helper, boolean z10) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        this.f257051a = helper;
        this.f257052b = z10;
    }

    @Override // com.planner5d.library.widget.menu.p
    public void a(@NotNull Activity activity, @NotNull MenuItem item) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(item, "item");
        this.f257051a.f(this.f257052b);
    }
}
