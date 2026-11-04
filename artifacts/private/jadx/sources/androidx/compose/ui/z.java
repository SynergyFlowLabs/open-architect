package androidx.compose.ui;

import androidx.compose.runtime.k7;
import androidx.compose.ui.platform.t2;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@k7
final class z extends l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final String f43012e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final Object[] f43013f;

    public z(@NotNull String str, @NotNull Object[] objArr, @NotNull Function1<? super t2, Unit> function1, @NotNull pj.n<? super a0, ? super androidx.compose.runtime.c0, ? super Integer, ? extends a0> nVar) {
        super(function1, nVar);
        this.f43012e = str;
        this.f43013f = objArr;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof z) {
            z zVar = (z) obj;
            if (Intrinsics.areEqual(this.f43012e, zVar.f43012e) && Arrays.equals(this.f43013f, zVar.f43013f)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f43012e.hashCode() * 31) + Arrays.hashCode(this.f43013f);
    }

    @NotNull
    public final String j() {
        return this.f43012e;
    }

    @NotNull
    public final Object[] k() {
        return this.f43013f;
    }
}
