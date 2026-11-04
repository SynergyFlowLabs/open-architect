package androidx.compose.ui;

import androidx.compose.runtime.k7;
import androidx.compose.ui.platform.t2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@k7
final class x extends l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final String f43005e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final Object f43006f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private final Object f43007g;

    public x(@NotNull String str, @Nullable Object obj, @Nullable Object obj2, @NotNull Function1<? super t2, Unit> function1, @NotNull pj.n<? super a0, ? super androidx.compose.runtime.c0, ? super Integer, ? extends a0> nVar) {
        super(function1, nVar);
        this.f43005e = str;
        this.f43006f = obj;
        this.f43007g = obj2;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof x) {
            x xVar = (x) obj;
            if (Intrinsics.areEqual(this.f43005e, xVar.f43005e) && Intrinsics.areEqual(this.f43006f, xVar.f43006f) && Intrinsics.areEqual(this.f43007g, xVar.f43007g)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.f43005e.hashCode() * 31;
        Object obj = this.f43006f;
        int iHashCode2 = (iHashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        Object obj2 = this.f43007g;
        return iHashCode2 + (obj2 != null ? obj2.hashCode() : 0);
    }

    @NotNull
    public final String j() {
        return this.f43005e;
    }

    @Nullable
    public final Object k() {
        return this.f43006f;
    }

    @Nullable
    public final Object l() {
        return this.f43007g;
    }
}
