package com.planner5d.library.widget.drawable;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.annotation.l;
import androidx.annotation.v;
import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@w0(parameters = 1)
public final class e implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f254262b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ c f254263a;

    public e(@NotNull c drawableUtils) {
        Intrinsics.checkNotNullParameter(drawableUtils, "drawableUtils");
        this.f254263a = drawableUtils;
    }

    @Override // com.planner5d.library.widget.drawable.d
    @Nullable
    public Drawable a(@Nullable Context context, @v int i10, @l @Nullable Integer num) {
        return this.f254263a.a(context, i10, num);
    }
}
