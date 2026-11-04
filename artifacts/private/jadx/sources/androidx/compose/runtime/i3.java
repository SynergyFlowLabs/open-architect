package androidx.compose.runtime;

import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@r2
public final class i3 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f35860i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final e3<Object> f35861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Object f35862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final l1 f35863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final w5 f35864d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final g f35865e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private List<? extends Pair<s4, ? extends Object>> f35866f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final e4 f35867g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private final List<i3> f35868h;

    public i3(@NotNull e3<Object> e3Var, @Nullable Object obj, @NotNull l1 l1Var, @NotNull w5 w5Var, @NotNull g gVar, @NotNull List<? extends Pair<s4, ? extends Object>> list, @NotNull e4 e4Var, @Nullable List<i3> list2) {
        this.f35861a = e3Var;
        this.f35862b = obj;
        this.f35863c = l1Var;
        this.f35864d = w5Var;
        this.f35865e = gVar;
        this.f35866f = list;
        this.f35867g = e4Var;
        this.f35868h = list2;
    }

    @NotNull
    public final g a() {
        return this.f35865e;
    }

    @NotNull
    public final l1 b() {
        return this.f35863c;
    }

    @NotNull
    public final e3<Object> c() {
        return this.f35861a;
    }

    @NotNull
    public final List<Pair<s4, Object>> d() {
        return this.f35866f;
    }

    @NotNull
    public final e4 e() {
        return this.f35867g;
    }

    @Nullable
    public final List<i3> f() {
        return this.f35868h;
    }

    @Nullable
    public final Object g() {
        return this.f35862b;
    }

    @NotNull
    public final w5 h() {
        return this.f35864d;
    }

    public final void i(@NotNull List<? extends Pair<s4, ? extends Object>> list) {
        this.f35866f = list;
    }

    public final void j() {
        List<? extends Pair<s4, ? extends Object>> list = this.f35866f;
        l1 l1Var = this.f35863c;
        Intrinsics.checkNotNull(l1Var, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
        this.f35866f = CollectionsKt.plus((Collection) list, (Iterable) ((s0) l1Var).A(this.f35865e));
    }
}
