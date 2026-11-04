package com.planner5d.library;

import android.content.Context;
import android.graphics.Typeface;
import androidx.core.content.res.i;
import java.lang.reflect.Field;
import kotlin.jvm.internal.Intrinsics;
import oj.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final g f179945a = new g();

    private g() {
    }

    @n
    public static final void a(@NotNull Context context, @NotNull String defaultFontNameToOverride, int i10) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(defaultFontNameToOverride, "defaultFontNameToOverride");
        try {
            Typeface typefaceJ = i.j(context, i10);
            Field declaredField = Typeface.class.getDeclaredField(defaultFontNameToOverride);
            Intrinsics.checkNotNullExpressionValue(declaredField, "getDeclaredField(...)");
            declaredField.setAccessible(true);
            declaredField.set(null, typefaceJ);
        } catch (Exception unused) {
            timber.log.b.f381052a.d("Can not set custom font", new Object[0]);
        }
    }
}
