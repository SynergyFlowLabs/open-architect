package com.planner5d.library.widget.preloader.shimmer;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Point;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.services.utility.h3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nShimmerDrawable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShimmerDrawable.kt\ncom/planner5d/library/widget/preloader/shimmer/ShimmerDrawable\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,118:1\n1#2:119\n*E\n"})
public class ShimmerDrawable extends Drawable implements g.b, Animatable {
    public static final int $stable = 8;

    @NotNull
    private final List<Drawable.Callback> attachedTargets;

    @Nullable
    private b drawer;

    @Nullable
    private c options;

    @NotNull
    private final g ticker;

    public ShimmerDrawable() {
        this.ticker = g.f258608d.a();
        this.attachedTargets = new ArrayList();
    }

    public final void attachAsBackground(@NotNull View targetView) {
        Intrinsics.checkNotNullParameter(targetView, "targetView");
        targetView.setBackground(this);
        if (this.attachedTargets.contains(targetView)) {
            return;
        }
        this.attachedTargets.add(targetView);
    }

    public final void attachAsImage(@NotNull ImageView targetImageView) {
        Intrinsics.checkNotNullParameter(targetImageView, "targetImageView");
        targetImageView.setImageDrawable(this);
        if (this.attachedTargets.contains(targetImageView)) {
            return;
        }
        this.attachedTargets.add(targetImageView);
    }

    protected final void configure(@NotNull Resources resources, @NotNull c options) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(options, "options");
        this.options = options;
        int[] iArrF = h3.F(resources);
        this.drawer = new b(options, new d(new Point(iArrF[0], iArrF[1]), options));
    }

    public final void detachAsBackground(@NotNull View targetView) {
        Intrinsics.checkNotNullParameter(targetView, "targetView");
        if (Intrinsics.areEqual(targetView.getBackground(), this)) {
            targetView.setBackground(null);
        }
        this.attachedTargets.remove(targetView);
    }

    public final void detachAsImage(@NotNull ImageView targetImageView) {
        Intrinsics.checkNotNullParameter(targetImageView, "targetImageView");
        if (Intrinsics.areEqual(targetImageView.getDrawable(), this)) {
            targetImageView.setImageDrawable(null);
        }
        this.attachedTargets.remove(targetImageView);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        b bVar = this.drawer;
        if (bVar != null) {
            bVar.b(canvas, this.ticker.f());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    @Nullable
    public final c getOptions() {
        return this.options;
    }

    public final boolean hasAttachedTargets() {
        return this.attachedTargets.size() > 0 || getCallback() != null;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(@NotNull Resources resources, @NotNull XmlPullParser parser, @NotNull AttributeSet attrs, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(parser, "parser");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        super.inflate(resources, parser, attrs, theme);
        configure(resources, new c(resources));
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.ticker.d(this);
    }

    @Override // com.planner5d.library.widget.preloader.shimmer.g.b
    public void onNewShimmerFrameAvailable() {
        invalidateSelf();
        int i10 = 0;
        while (i10 < this.attachedTargets.size()) {
            int i11 = i10 + 1;
            Drawable.Callback callback = this.attachedTargets.get(i10);
            if (Intrinsics.areEqual(callback, getCallback())) {
                callback = null;
            }
            Drawable.Callback callback2 = callback;
            if (callback2 != null) {
                callback2.invalidateDrawable(this);
            }
            i10 = i11;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.ticker.c(this);
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.ticker.g(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShimmerDrawable(@NotNull Resources resources, @NotNull c options) {
        this();
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(options, "options");
        configure(resources, options);
    }
}
