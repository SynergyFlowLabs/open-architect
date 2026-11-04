package com.planner5d.library.activity.fragment.smartwizard.roomstyle;

import android.view.View;
import android.widget.ImageView;
import androidx.compose.runtime.internal.w0;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.databinding.v2;
import com.planner5d.library.model.manager.y0;
import com.planner5d.library.widget.d1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomStyleAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomStyleAdapter.kt\ncom/planner5d/library/activity/fragment/smartwizard/roomstyle/RoomStyleHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,98:1\n1#2:99\n*E\n"})
public final class s extends RecyclerView.g0 implements d1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f135847f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final v2 f135848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.bitmaploader.target.h f135849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final y0 f135850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f135851d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private com.planner5d.library.services.bitmaploader.target.a f135852e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(@NotNull v2 binding, @NotNull com.planner5d.library.services.bitmaploader.target.h bitmapTargetManager, @NotNull y0 imageManager, int i10) {
        super(binding.getRoot());
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(bitmapTargetManager, "bitmapTargetManager");
        Intrinsics.checkNotNullParameter(imageManager, "imageManager");
        this.f135848a = binding;
        this.f135849b = bitmapTargetManager;
        this.f135850c = imageManager;
        this.f135851d = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(Function1 function1, com.planner5d.library.smartwizard.data.e eVar, View view) {
        function1.invoke(eVar);
    }

    @Override // com.planner5d.library.widget.d1
    public void a() {
        com.planner5d.library.services.bitmaploader.target.a aVar = this.f135852e;
        if (aVar != null) {
            this.f135849b.d(aVar);
        }
    }

    public final void h(@NotNull final com.planner5d.library.smartwizard.data.e style, boolean z10, @NotNull final Function1<? super com.planner5d.library.smartwizard.data.e, Unit> onStyleSelected) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(onStyleSelected, "onStyleSelected");
        this.f135848a.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.smartwizard.roomstyle.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                s.i(onStyleSelected, style, view);
            }
        });
        ImageView image = this.f135848a.f159810b;
        Intrinsics.checkNotNullExpressionValue(image, "image");
        this.f135852e = com.planner5d.library.widget.bitmaptarget.a.b(image, this.f135849b);
        y0 y0Var = this.f135850c;
        String strA = style.a();
        int i10 = this.f135851d;
        y0Var.b(strA, i10, i10, this.f135852e, 5L);
        this.f135848a.f159810b.setClipToOutline(true);
        this.f135848a.f159810b.setCropToPadding(true);
        v2 v2Var = this.f135848a;
        v2Var.f159810b.setForeground(androidx.core.content.d.l(v2Var.getRoot().getContext(), z10 ? com.planner5d.library.f.h.A3 : com.planner5d.library.f.h.C3));
        this.f135848a.f159811c.setText(style.d());
    }
}
