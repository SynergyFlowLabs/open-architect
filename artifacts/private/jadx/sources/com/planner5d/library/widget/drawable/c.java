package com.planner5d.library.widget.drawable;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.l;
import androidx.annotation.n;
import androidx.annotation.v;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.services.utility.h3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@w0(parameters = 1)
@SourceDebugExtension({"SMAP\nDrawableUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawableUtils.kt\ncom/planner5d/library/widget/drawable/DrawableUtils\n+ 2 BitmapDrawable.kt\nandroidx/core/graphics/drawable/BitmapDrawableKt\n+ 3 ColorDrawable.kt\nandroidx/core/graphics/drawable/ColorDrawableKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,78:1\n27#2:79\n28#3:80\n13409#4,2:81\n*S KotlinDebug\n*F\n+ 1 DrawableUtils.kt\ncom/planner5d/library/widget/drawable/DrawableUtils\n*L\n28#1:79\n28#1:80\n54#1:81,2\n*E\n"})
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c f254258a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f254259b = 0;

    public static final class a extends BitmapDrawable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f254260a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f254261b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Resources resources, Bitmap bitmap, int i10, int i11) {
            super(resources, bitmap);
            this.f254260a = i10;
            this.f254261b = i11;
        }

        @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
        public int getIntrinsicHeight() {
            return this.f254261b;
        }

        @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
        public int getIntrinsicWidth() {
            return this.f254260a;
        }
    }

    private c() {
    }

    public static /* synthetic */ Drawable f(c cVar, Context context, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = 0;
        }
        return cVar.d(context, i10, i11, i12);
    }

    public static /* synthetic */ Drawable g(c cVar, Resources resources, Bitmap bitmap, int i10, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return cVar.e(resources, bitmap, i10, i11);
    }

    @Override // com.planner5d.library.widget.drawable.d
    @Nullable
    public Drawable a(@Nullable Context context, @v int i10, @l @Nullable Integer num) {
        return k(context, i10, 0, num);
    }

    @oj.j
    @NotNull
    public final Drawable b(@NotNull Context context, @v int i10) {
        Intrinsics.checkNotNullParameter(context, "context");
        return f(this, context, i10, 0, 0, 12, null);
    }

    @oj.j
    @NotNull
    public final Drawable c(@NotNull Context context, @v int i10, int i11) {
        Intrinsics.checkNotNullParameter(context, "context");
        return f(this, context, i10, i11, 0, 8, null);
    }

    @oj.j
    @NotNull
    public final Drawable d(@NotNull Context context, @v int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(context, "context");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        return e(resources, BitmapFactory.decodeResource(context.getResources(), i10), i11, i12);
    }

    @NotNull
    public final Drawable e(@NotNull Resources resources, @Nullable Bitmap bitmap, int i10, int i11) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        if (i10 == 0 || i11 == 0) {
            return bitmap != null ? new BitmapDrawable(resources, bitmap) : new ColorDrawable(0);
        }
        return new a(resources, bitmap, i10, i11);
    }

    @Nullable
    public final Drawable h(@NotNull Context context, @v int i10, @n int i11) {
        Intrinsics.checkNotNullParameter(context, "context");
        androidx.vectordrawable.graphics.drawable.i iVarD = androidx.vectordrawable.graphics.drawable.i.d(context.getResources(), i10, null);
        if (iVarD == null) {
            return null;
        }
        androidx.core.graphics.drawable.c.o(androidx.core.graphics.drawable.c.r(iVarD), androidx.core.content.d.h(context, i11));
        return iVarD;
    }

    @Nullable
    public final <T extends Drawable> T i(@Nullable T t10, @l @Nullable Integer num) {
        if (t10 == null) {
            return null;
        }
        t10.mutate();
        if (num == null) {
            t10.clearColorFilter();
            return t10;
        }
        t10.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        return t10;
    }

    public final void j(@NotNull Drawable[] list, @l @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(list, "list");
        for (Drawable drawable : list) {
            f254258a.i(drawable, num);
        }
    }

    @Nullable
    public final Drawable k(@Nullable Context context, @v int i10, @v int i11, @l @Nullable Integer num) {
        Drawable drawableI = null;
        if (context == null) {
            return null;
        }
        Resources resources = context.getResources();
        if (i11 != 0 && h3.U(context)) {
            i10 = i11;
        }
        androidx.vectordrawable.graphics.drawable.i iVarD = androidx.vectordrawable.graphics.drawable.i.d(resources, i10, null);
        if (iVarD != null) {
            if (num == null) {
                return iVarD.mutate();
            }
            drawableI = f254258a.i(iVarD, num);
        }
        return drawableI;
    }
}
