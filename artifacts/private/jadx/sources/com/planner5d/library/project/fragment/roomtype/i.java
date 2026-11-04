package com.planner5d.library.project.fragment.roomtype;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.model.a0;
import com.planner5d.library.model.manager.n1;
import com.planner5d.library.model.manager.y0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public class i extends RecyclerView.g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f223830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final nd.g f223831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.bitmaploader.target.h f223832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final y0 f223833d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final n1 f223834e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f223835f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private com.planner5d.library.services.bitmaploader.target.a f223836g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(@NotNull Context context, @NotNull nd.g binding, @NotNull com.planner5d.library.services.bitmaploader.target.h bitmapTargetManager, @NotNull y0 imageManager, @NotNull n1 languageManager, int i10) {
        super(binding.getRoot());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(bitmapTargetManager, "bitmapTargetManager");
        Intrinsics.checkNotNullParameter(imageManager, "imageManager");
        Intrinsics.checkNotNullParameter(languageManager, "languageManager");
        this.f223830a = context;
        this.f223831b = binding;
        this.f223832c = bitmapTargetManager;
        this.f223833d = imageManager;
        this.f223834e = languageManager;
        this.f223835f = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(j jVar, View view) {
        jVar.a().invoke();
    }

    public void a() {
        this.f223832c.d(this.f223836g);
        this.f223836g = null;
    }

    public void h(@NotNull final j data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f223831b.getRoot().setClipToOutline(true);
        TextView textView = this.f223831b.f332778c;
        a0 a0VarC = data.c();
        String strA = this.f223834e.a(this.f223830a);
        Intrinsics.checkNotNullExpressionValue(strA, "getLanguage(...)");
        String strA2 = a0VarC.a(strA);
        if (strA2 == null) {
            strA2 = "no title";
        }
        textView.setText(strA2);
        Integer numB = data.b();
        if (numB != null) {
            int iIntValue = numB.intValue();
            ImageView roomTypeImage = this.f223831b.f332777b;
            Intrinsics.checkNotNullExpressionValue(roomTypeImage, "roomTypeImage");
            com.planner5d.library.services.bitmaploader.target.a aVarB = com.planner5d.library.widget.bitmaptarget.a.b(roomTypeImage, this.f223832c);
            this.f223836g = aVarB;
            y0 y0Var = this.f223833d;
            Context context = this.f223830a;
            int i10 = this.f223835f;
            y0Var.j(context, iIntValue, i10, i10, aVarB, 5L);
        }
        this.f223831b.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.project.fragment.roomtype.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                i.i(data, view);
            }
        });
    }
}
