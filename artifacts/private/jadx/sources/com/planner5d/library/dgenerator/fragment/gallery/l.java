package com.planner5d.library.dgenerator.fragment.gallery;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.planner5d.library.model.manager.y0;
import com.planner5d.library.widget.d1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public class l extends m implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final mb.h f160164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.bitmaploader.target.h f160165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final y0 f160166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private com.planner5d.library.services.bitmaploader.target.a f160167d;

    /* JADX WARN: Illegal instructions before constructor call */
    public l(@NotNull mb.h binding, @NotNull com.planner5d.library.services.bitmaploader.target.h bitmapTargetManager, @NotNull y0 imageManager) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(bitmapTargetManager, "bitmapTargetManager");
        Intrinsics.checkNotNullParameter(imageManager, "imageManager");
        ConstraintLayout root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        super(root, null);
        this.f160164a = binding;
        this.f160165b = bitmapTargetManager;
        this.f160166c = imageManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(p pVar, View view) {
        Function1<Integer, Unit> function1A = pVar.a();
        if (function1A != null) {
            function1A.invoke(Integer.valueOf(pVar.c()));
        }
    }

    @Override // com.planner5d.library.dgenerator.fragment.gallery.m, com.planner5d.library.widget.d1
    public void a() {
        super.a();
        this.f160165b.d(this.f160167d);
        this.f160167d = null;
    }

    @Override // com.planner5d.library.dgenerator.fragment.gallery.m
    public void g(@NotNull final p data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f160164a.getRoot().setClipToOutline(true);
        ImageView autoStyleImage = this.f160164a.f322887b;
        Intrinsics.checkNotNullExpressionValue(autoStyleImage, "autoStyleImage");
        this.f160167d = com.planner5d.library.widget.bitmaptarget.a.b(autoStyleImage, this.f160165b);
        com.planner5d.library.services.q.a.a(this.f160166c, data.d(), 0, 0, this.f160167d, 0L, 16, null);
        this.f160164a.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.dgenerator.fragment.gallery.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                l.i(data, view);
            }
        });
    }
}
