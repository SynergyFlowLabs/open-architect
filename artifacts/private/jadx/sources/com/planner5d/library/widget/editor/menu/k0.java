package com.planner5d.library.widget.editor.menu;

import android.app.Activity;
import android.view.MenuItem;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.activity.fragment.dialog.message.PurchaseRequiredMessage;
import com.planner5d.library.model.manager.statistics.events.o3;
import com.planner5d.library.widget.editor.helper.g1;
import com.planner5d.library.widget.editor.helper.s2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
public final class k0 implements com.planner5d.library.widget.menu.p {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f257133f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final g1 f257134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.application.d f257135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.modules.user.user.t f257136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.fragment.dialog.k f257137d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.modules.user.user.t0 f257138e;

    public k0(@NotNull g1 helper, @NotNull com.planner5d.library.application.d configuration, @NotNull com.planner5d.library.modules.user.user.t userAuthorization, @NotNull com.planner5d.library.activity.fragment.dialog.k dialogLauncher, @NotNull com.planner5d.library.modules.user.user.t0 userPurchases) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        Intrinsics.checkNotNullParameter(dialogLauncher, "dialogLauncher");
        Intrinsics.checkNotNullParameter(userPurchases, "userPurchases");
        this.f257134a = helper;
        this.f257135b = configuration;
        this.f257136c = userAuthorization;
        this.f257137d = dialogLauncher;
        this.f257138e = userPurchases;
    }

    @Override // com.planner5d.library.widget.menu.p
    public void a(@NotNull Activity activity, @NotNull MenuItem item) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(item, "item");
        int i10 = 4 >> 2;
        s2.b(this.f257134a.B3, o3.a.save_to_file, null, 2, null);
        if (!this.f257135b.a() && !this.f257138e.c()) {
            this.f257134a.q(false);
            PurchaseRequiredMessage.show(this.f257137d, this.f257134a.t1(), true, false);
            return;
        }
        this.f257134a.P2();
    }
}
