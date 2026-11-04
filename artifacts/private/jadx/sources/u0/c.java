package u0;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.annotation.v;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.o;
import androidx.compose.ui.graphics.t1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nImageResources.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageResources.android.kt\nandroidx/compose/ui/res/ImageResources_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,60:1\n75#2:61\n1282#3,6:62\n1282#3,6:68\n*S KotlinDebug\n*F\n+ 1 ImageResources.android.kt\nandroidx/compose/ui/res/ImageResources_androidKt\n*L\n54#1:61\n55#1:62,6\n58#1:68,6\n*E\n"})
public final class c {
    @o
    @NotNull
    public static final t1 a(@NotNull t1.a aVar, @v int i10, @Nullable c0 c0Var, int i11) {
        if (m0.l0()) {
            m0.A0(-304919470, i11, -1, "androidx.compose.ui.res.imageResource (ImageResources.android.kt:52)");
        }
        Resources resources = (Resources) c0Var.W(AndroidCompositionLocals_androidKt.k());
        Object objI0 = c0Var.i0();
        c0.a aVar2 = c0.f35327a;
        if (objI0 == aVar2.a()) {
            objI0 = new TypedValue();
            c0Var.Y(objI0);
        }
        TypedValue typedValue = (TypedValue) objI0;
        resources.getValue(i10, typedValue, true);
        CharSequence charSequence = typedValue.string;
        Intrinsics.checkNotNull(charSequence);
        boolean zD = c0Var.D(charSequence.toString());
        Object objI1 = c0Var.i0();
        if (zD || objI1 == aVar2.a()) {
            objI1 = b(aVar, resources, i10);
            c0Var.Y(objI1);
        }
        t1 t1Var = (t1) objI1;
        if (m0.l0()) {
            m0.z0();
        }
        return t1Var;
    }

    @NotNull
    public static final t1 b(@NotNull t1.a aVar, @NotNull Resources resources, @v int i10) {
        Drawable drawable = resources.getDrawable(i10, null);
        Intrinsics.checkNotNull(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
        return androidx.compose.ui.graphics.j.c(((BitmapDrawable) drawable).getBitmap());
    }
}
