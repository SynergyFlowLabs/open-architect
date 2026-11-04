package com.planner5d.library.widget.editor.popup.properties.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
public final class MaterialImageView extends View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f257977b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private e f257978a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaterialImageView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a(@NotNull Object[] images, int i10, float f10) {
        Intrinsics.checkNotNullParameter(images, "images");
        e gVar = this.f257978a;
        if (gVar == null) {
            gVar = images.length == 4 ? new g(getContext()) : new f(getContext());
            this.f257978a = gVar;
        }
        int i11 = (int) f10;
        gVar.setBounds(0, 0, i11, i11);
        gVar.a(images, i10);
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        e eVar = this.f257978a;
        if (eVar != null) {
            eVar.draw(canvas);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaterialImageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaterialImageView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        setLayerType(1, null);
    }
}
