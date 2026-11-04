package com.planner5d.library.widget.bitmaptarget;

import android.graphics.Bitmap;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.services.bitmaploader.target.m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@w0(parameters = 1)
public final class b extends d<m> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f249613l = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@NotNull m hasSetImageBitmap) {
        super(hasSetImageBitmap);
        Intrinsics.checkNotNullParameter(hasSetImageBitmap, "hasSetImageBitmap");
    }

    @Override // com.planner5d.library.widget.bitmaptarget.d
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void m(@NotNull m view, @Nullable Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setImageBitmap(bitmap);
    }
}
