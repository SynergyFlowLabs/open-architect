package androidx.navigation.compose;

import androidx.navigation.a2;
import androidx.navigation.b2;
import androidx.navigation.d3;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@b2
public final class f extends a2<e.b> {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f70722p = 8;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final e f70723i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final pj.o<androidx.compose.animation.g, androidx.navigation.n0, androidx.compose.runtime.c0, Integer, Unit> f70724j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private Function1<androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.d0> f70725k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private Function1<androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.f0> f70726l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    private Function1<androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.d0> f70727m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    private Function1<androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.f0> f70728n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    private Function1<androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.g1> f70729o;

    /* JADX WARN: Multi-variable type inference failed */
    public f(@NotNull e eVar, @NotNull String str, @NotNull pj.o<? super androidx.compose.animation.g, ? super androidx.navigation.n0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> oVar) {
        super(eVar, str);
        this.f70723i = eVar;
        this.f70724j = oVar;
    }

    public final void A(@Nullable Function1<androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.f0> function1) {
        this.f70728n = function1;
    }

    public final void B(@Nullable Function1<androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.g1> function1) {
        this.f70729o = function1;
    }

    @Override // androidx.navigation.a2
    @NotNull
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public e.b d() {
        e.b bVar = (e.b) super.d();
        bVar.G0(this.f70725k);
        bVar.I0(this.f70726l);
        bVar.J0(this.f70727m);
        bVar.K0(this.f70728n);
        bVar.L0(this.f70729o);
        return bVar;
    }

    @Nullable
    public final Function1<androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.d0> r() {
        return this.f70725k;
    }

    @Nullable
    public final Function1<androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.f0> s() {
        return this.f70726l;
    }

    @Nullable
    public final Function1<androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.d0> t() {
        return this.f70727m;
    }

    @Nullable
    public final Function1<androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.f0> u() {
        return this.f70728n;
    }

    @Nullable
    public final Function1<androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.g1> v() {
        return this.f70729o;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.navigation.a2
    @NotNull
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public e.b o() {
        return new e.b(this.f70723i, this.f70724j);
    }

    public final void x(@Nullable Function1<androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.d0> function1) {
        this.f70725k = function1;
    }

    public final void y(@Nullable Function1<androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.f0> function1) {
        this.f70726l = function1;
    }

    public final void z(@Nullable Function1<androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.d0> function1) {
        this.f70727m = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(@NotNull e eVar, @NotNull kotlin.reflect.d<?> dVar, @NotNull Map<kotlin.reflect.s, d3<?>> map, @NotNull pj.o<? super androidx.compose.animation.g, ? super androidx.navigation.n0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> oVar) {
        super(eVar, dVar, map);
        this.f70723i = eVar;
        this.f70724j = oVar;
    }
}
