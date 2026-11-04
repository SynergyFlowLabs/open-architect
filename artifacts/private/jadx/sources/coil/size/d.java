package coil.size;

import android.content.Context;
import android.util.DisplayMetrics;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f87769a;

    public d(@NotNull Context context) {
        this.f87769a = context;
    }

    @Override // coil.size.j
    @Nullable
    public Object a(@NotNull kotlin.coroutines.d<? super i> dVar) {
        DisplayMetrics displayMetrics = this.f87769a.getResources().getDisplayMetrics();
        c.a aVarA = a.a(Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels));
        return new i(aVarA, aVarA);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.areEqual(this.f87769a, ((d) obj).f87769a);
    }

    public int hashCode() {
        return this.f87769a.hashCode();
    }
}
