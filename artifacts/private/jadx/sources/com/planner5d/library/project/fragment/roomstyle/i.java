package com.planner5d.library.project.fragment.roomstyle;

import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.model.manager.y0;
import com.planner5d.library.services.q;
import com.planner5d.library.widget.d1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public class i extends RecyclerView.g0 implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final nd.f f223747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.bitmaploader.target.h f223748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final y0 f223749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f223750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private com.planner5d.library.services.bitmaploader.target.a f223751e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(@NotNull nd.f binding, @NotNull com.planner5d.library.services.bitmaploader.target.h bitmapTargetManager, @NotNull y0 imageManager, int i10) {
        super(binding.getRoot());
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(bitmapTargetManager, "bitmapTargetManager");
        Intrinsics.checkNotNullParameter(imageManager, "imageManager");
        this.f223747a = binding;
        this.f223748b = bitmapTargetManager;
        this.f223749c = imageManager;
        this.f223750d = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(j jVar, View view) {
        jVar.i().invoke();
    }

    @Override // com.planner5d.library.widget.d1
    public void a() {
        this.f223748b.d(this.f223751e);
        this.f223751e = null;
    }

    public void h(@NotNull final j data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f223747a.getRoot().setClipToOutline(true);
        this.f223747a.f332775d.setText(data.n());
        String strJ = data.j();
        if (strJ != null) {
            ImageView roomStyleImage = this.f223747a.f332774c;
            Intrinsics.checkNotNullExpressionValue(roomStyleImage, "roomStyleImage");
            com.planner5d.library.services.bitmaploader.target.a aVarB = com.planner5d.library.widget.bitmaptarget.a.b(roomStyleImage, this.f223748b);
            this.f223751e = aVarB;
            y0 y0Var = this.f223749c;
            int i10 = this.f223750d;
            q.a.a(y0Var, strJ, i10, i10, aVarB, 0L, 16, null);
        }
        this.f223747a.f332773b.setSelected(data.m());
        this.f223747a.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.project.fragment.roomstyle.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                i.i(data, view);
            }
        });
    }
}
