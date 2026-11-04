package com.planner5d.library.widget.editor.catalog.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.compose.runtime.internal.w0;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.databinding.c3;
import com.planner5d.library.widget.preloader.shimmer.ShimmerDrawable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@w0(parameters = 0)
public final class d extends FrameLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f254394c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final c3 f254395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final ImageView f254396b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@NotNull Context context, @NotNull Point catalogItemViewSize) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(catalogItemViewSize, "catalogItemViewSize");
        c3 c3VarB = c3.b(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c3VarB, "inflate(...)");
        this.f254395a = c3VarB;
        setLayoutParams(new RecyclerView.q(catalogItemViewSize.x, catalogItemViewSize.y));
        setBackgroundColor(getResources().getColor(com.planner5d.library.f.C1549f.Xn));
        ImageView imageView = c3VarB.f158803b;
        this.f254396b = imageView;
        Resources resources = imageView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        Resources resources2 = imageView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        imageView.setImageDrawable(new ShimmerDrawable(resources, new com.planner5d.library.widget.preloader.shimmer.c(resources2, true)));
        imageView.setClipToOutline(true);
    }

    public final void a() {
        if (this.f254396b.getDrawable() instanceof ShimmerDrawable) {
            Drawable drawable = this.f254396b.getDrawable();
            Intrinsics.checkNotNull(drawable, "null cannot be cast to non-null type com.planner5d.library.widget.preloader.shimmer.ShimmerDrawable");
            ((ShimmerDrawable) drawable).start();
        }
    }

    public final void b() {
        if (this.f254396b.getDrawable() instanceof ShimmerDrawable) {
            Drawable drawable = this.f254396b.getDrawable();
            Intrinsics.checkNotNull(drawable, "null cannot be cast to non-null type com.planner5d.library.widget.preloader.shimmer.ShimmerDrawable");
            ((ShimmerDrawable) drawable).stop();
        }
    }
}
