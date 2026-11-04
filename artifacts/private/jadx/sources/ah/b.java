package ah;

import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.l;
import androidx.annotation.n;
import androidx.annotation.v;
import androidx.core.content.d;
import ih.e;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class b {
    @l
    @Nullable
    public static final Integer a(@NotNull Context context, @n int i10) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            return Integer.valueOf(d.g(context, i10));
        } catch (Resources.NotFoundException e10) {
            e.a.b(eh.d.f274883c.w(), "Invalid resource " + i10 + ", " + e10.getMessage(), null, null, 6, null);
            return null;
        }
    }

    @e.a({"DiscouragedApi"})
    @v
    @Nullable
    public static final Integer b(@NotNull Context context, @Nullable String str) {
        Resources resources;
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (str != null && !StringsKt.w3(str) && (resources = context.getResources()) != null) {
            Integer numValueOf = Integer.valueOf(resources.getIdentifier(str, "drawable", context.getPackageName()));
            if (numValueOf.intValue() == 0) {
                return null;
            }
            return numValueOf;
        }
        return null;
    }
}
