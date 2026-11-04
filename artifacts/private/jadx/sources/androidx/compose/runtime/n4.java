package androidx.compose.runtime;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ProvidedValue\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,5012:1\n1#2:5013\n*E\n"})
public final class n4<T> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f36267i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final u0<T> f36268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f36269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final u6<T> f36270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final n3<T> f36271d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final Function1<v0, T> f36272e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f36273f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private final T f36274g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f36275h = true;

    /* JADX WARN: Multi-variable type inference failed */
    public n4(@NotNull u0<T> u0Var, @Nullable T t10, boolean z10, @Nullable u6<T> u6Var, @Nullable n3<T> n3Var, @Nullable Function1<? super v0, ? extends T> function1, boolean z11) {
        this.f36268a = u0Var;
        this.f36269b = z10;
        this.f36270c = u6Var;
        this.f36271d = n3Var;
        this.f36272e = function1;
        this.f36273f = z11;
        this.f36274g = t10;
    }

    public static /* synthetic */ void e() {
    }

    public static /* synthetic */ void i() {
    }

    @oj.i(name = "getCanOverride")
    public final boolean a() {
        return this.f36275h;
    }

    @NotNull
    public final u0<T> b() {
        return this.f36268a;
    }

    @Nullable
    public final Function1<v0, T> c() {
        return this.f36272e;
    }

    public final T d() {
        if (this.f36269b) {
            return null;
        }
        n3<T> n3Var = this.f36271d;
        if (n3Var != null) {
            return n3Var.getValue();
        }
        T t10 = this.f36274g;
        if (t10 != null) {
            return t10;
        }
        m0.z("Unexpected form of a provided value");
        throw new kotlin.a0();
    }

    @Nullable
    public final u6<T> f() {
        return this.f36270c;
    }

    @Nullable
    public final n3<T> g() {
        return this.f36271d;
    }

    public final T h() {
        return this.f36274g;
    }

    @NotNull
    public final n4<T> j() {
        this.f36275h = false;
        return this;
    }

    public final boolean k() {
        return this.f36273f;
    }

    public final boolean l() {
        return (this.f36269b || h() != null) && !this.f36273f;
    }
}
