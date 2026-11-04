package ah;

import android.graphics.Color;
import androidx.annotation.l;
import eh.d;
import ih.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class c {
    @l
    @Nullable
    public static final Integer a(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            return Integer.valueOf(Color.parseColor(str));
        } catch (IllegalArgumentException e10) {
            e.a.b(d.f274883c.w(), "Invalid color string " + str + ", " + e10.getMessage(), null, null, 6, null);
            return null;
        }
    }
}
