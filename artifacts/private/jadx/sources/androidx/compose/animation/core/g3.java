package androidx.compose.animation.core;

import androidx.compose.animation.core.w;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animation.kt\nandroidx/compose/animation/core/TargetBasedAnimation\n+ 2 Preconditions.kt\nandroidx/compose/animation/core/PreconditionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,497:1\n53#2,4:498\n1#3:502\n*S KotlinDebug\n*F\n+ 1 Animation.kt\nandroidx/compose/animation/core/TargetBasedAnimation\n*L\n274#1:498,4\n*E\n"})
public final class g3<T, V extends w> implements g<T, V> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f12976j = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final u4<V> f12977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final z3<T, V> f12978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private T f12979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private T f12980d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private V f12981e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private V f12982f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final V f12983g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f12984h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private V f12985i;

    public g3(@NotNull u4<V> u4Var, @NotNull z3<T, V> z3Var, T t10, T t11, @Nullable V v10) {
        V v11;
        this.f12977a = u4Var;
        this.f12978b = z3Var;
        this.f12979c = t11;
        this.f12980d = t10;
        this.f12981e = f().a().invoke(t10);
        this.f12982f = f().a().invoke(t11);
        this.f12983g = (v10 == null || (v11 = (V) x.e(v10)) == null) ? (V) x.g(f().a().invoke(t10)) : v11;
        this.f12984h = -1L;
    }

    private final V j() {
        V v10 = this.f12985i;
        if (v10 != null) {
            return v10;
        }
        V v11 = (V) this.f12977a.e(this.f12981e, this.f12982f, this.f12983g);
        this.f12985i = v11;
        return v11;
    }

    @NotNull
    public final u4<V> a() {
        return this.f12977a;
    }

    @Override // androidx.compose.animation.core.g
    public boolean b() {
        return this.f12977a.b();
    }

    @Override // androidx.compose.animation.core.g
    public T c() {
        return this.f12979c;
    }

    @Override // androidx.compose.animation.core.g
    public long e() {
        if (this.f12984h < 0) {
            this.f12984h = this.f12977a.c(this.f12981e, this.f12982f, this.f12983g);
        }
        return this.f12984h;
    }

    @Override // androidx.compose.animation.core.g
    @NotNull
    public z3<T, V> f() {
        return this.f12978b;
    }

    @Override // androidx.compose.animation.core.g
    public T g(long j10) {
        if (d(j10)) {
            return c();
        }
        w wVarI = this.f12977a.i(j10, this.f12981e, this.f12982f, this.f12983g);
        int iB = wVarI.b();
        for (int i10 = 0; i10 < iB; i10++) {
            if (Float.isNaN(wVarI.a(i10))) {
                c2.e("AnimationVector cannot contain a NaN. " + wVarI + ". Animation: " + this + ", playTimeNanos: " + j10);
            }
        }
        return (T) f().b().invoke(wVarI);
    }

    @Override // androidx.compose.animation.core.g
    @NotNull
    public V i(long j10) {
        return !d(j10) ? (V) this.f12977a.g(j10, this.f12981e, this.f12982f, this.f12983g) : (V) j();
    }

    public final T k() {
        return this.f12980d;
    }

    public final T l() {
        return this.f12980d;
    }

    public final T m() {
        return this.f12979c;
    }

    public final void n(T t10) {
        if (Intrinsics.areEqual(t10, this.f12980d)) {
            return;
        }
        this.f12980d = t10;
        this.f12981e = f().a().invoke(t10);
        this.f12985i = null;
        this.f12984h = -1L;
    }

    public final void o(T t10) {
        if (!Intrinsics.areEqual(this.f12979c, t10)) {
            this.f12979c = t10;
            this.f12982f = f().a().invoke(t10);
            this.f12985i = null;
            this.f12984h = -1L;
        }
    }

    @NotNull
    public String toString() {
        return "TargetBasedAnimation: " + k() + " -> " + c() + ",initial velocity: " + this.f12983g + ", duration: " + l.i(this) + " ms,animationSpec: " + this.f12977a;
    }

    public /* synthetic */ g3(u4 u4Var, z3 z3Var, Object obj, Object obj2, w wVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((u4<w>) u4Var, (z3<Object, w>) z3Var, obj, obj2, (i10 & 16) != 0 ? null : wVar);
    }

    public /* synthetic */ g3(o oVar, z3 z3Var, Object obj, Object obj2, w wVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((o<Object>) oVar, (z3<Object, w>) z3Var, obj, obj2, (i10 & 16) != 0 ? null : wVar);
    }

    public g3(@NotNull o<T> oVar, @NotNull z3<T, V> z3Var, T t10, T t11, @Nullable V v10) {
        this(oVar.a(z3Var), z3Var, t10, t11, v10);
    }
}
