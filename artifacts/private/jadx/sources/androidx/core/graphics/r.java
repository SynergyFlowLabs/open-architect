package androidx.core.graphics;

import android.graphics.Canvas;
import android.graphics.Picture;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class r {
    @NotNull
    public static final Picture a(@NotNull Picture picture, int i10, int i11, @NotNull Function1<? super Canvas, Unit> function1) {
        try {
            function1.invoke(picture.beginRecording(i10, i11));
            kotlin.jvm.internal.h0.d(1);
            picture.endRecording();
            kotlin.jvm.internal.h0.c(1);
            return picture;
        } catch (Throwable th2) {
            kotlin.jvm.internal.h0.d(1);
            picture.endRecording();
            kotlin.jvm.internal.h0.c(1);
            throw th2;
        }
    }
}
