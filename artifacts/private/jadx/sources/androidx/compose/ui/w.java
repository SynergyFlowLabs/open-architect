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
final class w extends l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final String f42848e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final Object f42849f;

    public w(@NotNull String str, @Nullable Object obj, @NotNull Function1<? super t2, Unit> function1, @NotNull pj.n<? super a0, ? super androidx.compose.runtime.c0, ? super Integer, ? extends a0> nVar) {
        super(function1, nVar);
        this.f42848e = str;
        this.f42849f = obj;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof w) {
            w wVar = (w) obj;
            if (Intrinsics.areEqual(this.f42848e, wVar.f42848e) && Intrinsics.areEqual(this.f42849f, wVar.f42849f)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.f42848e.hashCode() * 31;
        Object obj = this.f42849f;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    @NotNull
    public final String j() {
        return this.f42848e;
    }

    @Nullable
    public final Object k() {
        return this.f42849f;
    }
}
