package com.bumptech.glide.load.resource.drawable;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.annotation.p0;
import androidx.annotation.v;
import androidx.core.content.res.i;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile boolean f97109a = true;

    private a() {
    }

    public static Drawable a(Context context, @v int i10, @p0 Resources.Theme theme) {
        return c(context, context, i10, theme);
    }

    public static Drawable b(Context context, Context context2, @v int i10) {
        return c(context, context2, i10, null);
    }

    private static Drawable c(Context context, Context context2, @v int i10, @p0 Resources.Theme theme) {
        try {
            if (f97109a) {
                return e(context2, i10, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e10) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e10;
            }
            return androidx.core.content.d.l(context2, i10);
        } catch (NoClassDefFoundError unused2) {
            f97109a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return d(context2, i10, theme);
    }

    private static Drawable d(Context context, @v int i10, @p0 Resources.Theme theme) {
        return i.g(context.getResources(), i10, theme);
    }

    private static Drawable e(Context context, @v int i10, @p0 Resources.Theme theme) {
        if (theme != null) {
            context = new androidx.appcompat.view.d(context, theme);
        }
        return j.a.b(context, i10);
    }
}
