package com.planner5d.library.services.bitmaploader.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.annotation.v;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final WeakReference<m> f224188h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public f(@NotNull Context context, @NotNull m imageContainer) {
        this(context, imageContainer, null, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageContainer, "imageContainer");
    }

    @Override // com.planner5d.library.services.bitmaploader.target.a
    protected void b(boolean z10) {
        m mVar;
        if (z10 || (mVar = this.f224188h.get()) == null) {
            return;
        }
        mVar.setImageBitmap(null);
    }

    @Override // com.planner5d.library.services.bitmaploader.target.a
    protected void h(@Nullable Bitmap bitmap) {
        m mVar = this.f224188h.get();
        if (mVar != null) {
            mVar.setImageBitmap(bitmap);
        }
    }

    public /* synthetic */ f(Context context, m mVar, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, mVar, (i10 & 4) != 0 ? null : num);
    }

    @oj.j
    public f(@NotNull Context context, @NotNull m imageContainer, @v @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageContainer, "imageContainer");
        this.f224188h = new WeakReference<>(imageContainer);
        if (num != null) {
            imageContainer.setImageBitmap(BitmapFactory.decodeResource(context.getResources(), num.intValue()));
        }
    }
}
