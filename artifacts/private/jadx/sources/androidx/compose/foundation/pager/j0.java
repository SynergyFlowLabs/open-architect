package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.j2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class j0 extends androidx.compose.foundation.lazy.layout.y<w> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final pj.o<v0, Integer, androidx.compose.runtime.c0, Integer, Unit> f18330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final Function1<Integer, Object> f18331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f18332d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.lazy.layout.m<w> f18333e;

    /* JADX WARN: Multi-variable type inference failed */
    public j0(@NotNull pj.o<? super v0, ? super Integer, ? super androidx.compose.runtime.c0, ? super Integer, Unit> oVar, @Nullable Function1<? super Integer, ? extends Object> function1, int i10) {
        this.f18330b = oVar;
        this.f18331c = function1;
        this.f18332d = i10;
        j2 j2Var = new j2();
        j2Var.c(i10, new w(function1, oVar));
        this.f18333e = j2Var;
    }

    @Override // androidx.compose.foundation.lazy.layout.y
    @NotNull
    public androidx.compose.foundation.lazy.layout.m<w> E() {
        return this.f18333e;
    }

    @Nullable
    public final Function1<Integer, Object> I() {
        return this.f18331c;
    }

    @NotNull
    public final pj.o<v0, Integer, androidx.compose.runtime.c0, Integer, Unit> J() {
        return this.f18330b;
    }

    public final int K() {
        return this.f18332d;
    }
}
