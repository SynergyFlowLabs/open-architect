package com.planner5d.library.widget.editor.popup.itemproperties.pages.material;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.o0;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemNs;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
public final class k implements xe.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f257395e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f257396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final i f257397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.bitmaploader.target.h f257398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final o0 f257399d;

    public k(@NotNull Context context, @NotNull i viewModel, @NotNull com.planner5d.library.services.bitmaploader.target.h bitmapTargetManager, @NotNull o0 lifecycleOwner) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(bitmapTargetManager, "bitmapTargetManager");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.f257396a = context;
        this.f257397b = viewModel;
        this.f257398c = bitmapTargetManager;
        this.f257399d = lifecycleOwner;
    }

    @Override // xe.a
    @NotNull
    public View a() {
        Item itemG0 = this.f257397b.g0();
        if (itemG0 instanceof ItemNs) {
            ItemNs itemNs = (ItemNs) itemG0;
            if (this.f257397b.o0(itemNs)) {
                return new l(this.f257396a).d2(itemNs);
            }
        }
        return new n(this.f257396a, this.f257397b, this.f257398c, this.f257399d);
    }
}
