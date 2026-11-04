package com.planner5d.library.widget.editor.menu;

import android.app.Activity;
import android.view.MenuItem;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.widget.editor.helper.g1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
public final class n implements com.planner5d.library.widget.menu.p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f257152c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final g1 f257153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f257154b;

    public n(@NotNull g1 helper, boolean z10) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        this.f257153a = helper;
        this.f257154b = z10;
    }

    @Override // com.planner5d.library.widget.menu.p
    public void a(@NotNull Activity activity, @NotNull MenuItem item) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(item, "item");
        this.f257153a.b(this.f257154b);
    }
}
