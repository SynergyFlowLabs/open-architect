package coil.size;

import androidx.annotation.t0;
import kotlin.b1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@oj.i(name = "-Sizes")
public final class b {
    @NotNull
    public static final i a(@t0 int i10, @t0 int i11) {
        return new i(a.a(i10), a.a(i11));
    }

    @NotNull
    public static final i b(@t0 int i10, @NotNull c cVar) {
        return new i(a.a(i10), cVar);
    }

    @NotNull
    public static final i c(@NotNull c cVar, @t0 int i10) {
        return new i(cVar, a.a(i10));
    }

    @NotNull
    public static final i d() {
        return i.f87783d;
    }

    @kotlin.l(message = "Migrate to 'coil.size.Size.ORIGINAL'.", replaceWith = @b1(expression = "Size.ORIGINAL", imports = {"coil.size.Size"}))
    public static /* synthetic */ void e() {
    }

    public static final boolean f(@NotNull i iVar) {
        return Intrinsics.areEqual(iVar, i.f87783d);
    }
}
