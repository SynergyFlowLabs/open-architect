package com.planner5d.library.services;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.planner5d.library.services.utility.o2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nCompatibility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Compatibility.kt\ncom/planner5d/library/services/Compatibility\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,62:1\n13409#2,2:63\n*S KotlinDebug\n*F\n+ 1 Compatibility.kt\ncom/planner5d/library/services/Compatibility\n*L\n25#1:63,2\n*E\n"})
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final d f224235a = new d();

    private d() {
    }

    private final void b(Drawable drawable, int i10, int i11, int i12) {
        androidx.core.graphics.drawable.c.o(drawable, new ColorStateList(new int[][]{new int[]{-16842910}, new int[]{R.attr.state_checked}, new int[0]}, new int[]{i12, i11, i10}));
    }

    @NotNull
    public final SwitchCompat a(@NotNull Context context, boolean z10) {
        Intrinsics.checkNotNullParameter(context, "context");
        SwitchCompat switchCompat = new SwitchCompat(context);
        d dVar = f224235a;
        Drawable thumbDrawable = switchCompat.getThumbDrawable();
        Intrinsics.checkNotNullExpressionValue(thumbDrawable, "getThumbDrawable(...)");
        dVar.b(thumbDrawable, androidx.core.content.d.g(context, z10 ? o2.e.f226506x3 : o2.e.f226437u3), androidx.core.content.d.g(context, z10 ? o2.e.f226506x3 : o2.e.f226460v3), androidx.core.content.d.g(context, o2.e.f226483w3));
        int iG = androidx.core.content.d.g(context, z10 ? o2.e.f226529y3 : o2.e.f226552z3);
        Drawable trackDrawable = switchCompat.getTrackDrawable();
        Intrinsics.checkNotNullExpressionValue(trackDrawable, "getTrackDrawable(...)");
        dVar.b(trackDrawable, iG, androidx.core.graphics.h.D(z10 ? iG : androidx.core.content.d.g(context, o2.e.f226460v3), 125), androidx.core.graphics.h.D(iG, Color.alpha(iG) / 2));
        return switchCompat;
    }

    public final void c(@NotNull TextView textView, @NotNull Spanned spanned) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        Intrinsics.checkNotNullParameter(spanned, "spanned");
        textView.setText(spanned);
    }
}
