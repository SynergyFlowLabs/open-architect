package com.planner5d.library.widget.colorpicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.annotation.l;
import androidx.compose.runtime.internal.w0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.d;
import com.google.android.material.shape.k;
import com.planner5d.library.application.e6;
import com.planner5d.library.services.utility.p0;
import com.planner5d.library.widget.c1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import oj.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import te.n;

/* JADX INFO: loaded from: classes12.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nColorPickerCompact.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorPickerCompact.kt\ncom/planner5d/library/widget/colorpicker/ColorPickerCompact\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,78:1\n1#2:79\n*E\n"})
public final class ColorPickerCompact extends ConstraintLayout {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f254213i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @ij.a
    public p0 f254214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @l
    private int f254215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final n f254216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f254217d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f254218e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f254219f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final k f254220g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private a f254221h;

    public interface a {
        void a(int i10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public ColorPickerCompact(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(ColorPickerCompact colorPickerCompact, View view, boolean z10) {
        if (z10) {
            return;
        }
        String strK2 = StringsKt.k2(String.valueOf(colorPickerCompact.f254216c.f380965b.getText()), "#", "", false, 4, null);
        if (strK2.length() != 3 && strK2.length() != 6) {
            strK2 = null;
        }
        if (strK2 != null) {
            colorPickerCompact.y(colorPickerCompact.getFormatter$P5D_Library_Widgets_release().c(strK2, 1.0d), true);
        }
    }

    private final void y(@l int i10, boolean z10) {
        this.f254220g.p0(ColorStateList.valueOf(i10));
        this.f254216c.f380966c.setBackground(this.f254220g);
        if (!z10 || this.f254215b == i10) {
            return;
        }
        this.f254215b = i10;
        a aVar = this.f254221h;
        if (aVar != null) {
            aVar.a(i10);
        }
    }

    @NotNull
    public final p0 getFormatter$P5D_Library_Widgets_release() {
        p0 p0Var = this.f254214a;
        if (p0Var != null) {
            return p0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("formatter");
        return null;
    }

    public final void setColor(@l int i10) {
        this.f254215b = i10;
        String strD = getFormatter$P5D_Library_Widgets_release().d(i10);
        Intrinsics.checkNotNullExpressionValue(strD, "color(...)");
        String strK2 = StringsKt.k2(strD, "#", "", false, 4, null);
        if (Intrinsics.areEqual(strK2, String.valueOf(this.f254216c.f380965b.getText()))) {
            strK2 = null;
        }
        if (strK2 != null) {
            this.f254216c.f380965b.setText(strK2);
        }
        y(i10, false);
    }

    public final void setColorChangeListener(@NotNull a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f254221h = listener;
    }

    public final void setFormatter$P5D_Library_Widgets_release(@NotNull p0 p0Var) {
        Intrinsics.checkNotNullParameter(p0Var, "<set-?>");
        this.f254214a = p0Var;
    }

    public final void setOnPreviewClickListener(@Nullable View.OnClickListener onClickListener) {
        this.f254216c.f380966c.setOnClickListener(onClickListener);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public ColorPickerCompact(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ColorPickerCompact(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @j
    public ColorPickerCompact(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f254215b = -1;
        n nVarB = n.b(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(nVarB, "inflate(...)");
        this.f254216c = nVarB;
        int iG = d.g(context, c1.e.Af);
        this.f254217d = iG;
        float dimension = getResources().getDimension(c1.f.Jc);
        this.f254218e = dimension;
        float dimension2 = getResources().getDimension(c1.f.Uc);
        this.f254219f = dimension2;
        k kVar = new k();
        kVar.E0(dimension, iG);
        kVar.l0(dimension2);
        this.f254220g = kVar;
        e6.a(this).i(this);
        nVarB.f380965b.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.planner5d.library.widget.colorpicker.a
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                ColorPickerCompact.x(this.f254240a, view, z10);
            }
        });
    }
}
