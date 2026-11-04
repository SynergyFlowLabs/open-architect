package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
public final class d0<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f41092e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f41093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function2<T, T, T> f41094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f41095c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private String f41096d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class a extends l0 implements Function2<T, T, T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f41097a = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final T invoke(T t10, T t11) {
            return t10 == null ? t11 : t10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d0(@NotNull String str, @NotNull Function2<? super T, ? super T, ? extends T> function2) {
        this.f41093a = str;
        this.f41094b = function2;
    }

    @Nullable
    public final String a() {
        return this.f41096d;
    }

    @NotNull
    public final Function2<T, T, T> b() {
        return this.f41094b;
    }

    @NotNull
    public final String c() {
        return this.f41093a;
    }

    public final T d(@NotNull e0 e0Var, @NotNull kotlin.reflect.o<?> oVar) {
        return (T) b0.g2();
    }

    public final boolean e() {
        return this.f41095c;
    }

    @Nullable
    public final T f(@Nullable T t10, T t11) {
        return this.f41094b.invoke(t10, t11);
    }

    public final void g(@Nullable String str) {
        this.f41096d = str;
    }

    public final void h(@NotNull e0 e0Var, @NotNull kotlin.reflect.o<?> oVar, T t10) {
        e0Var.c(this, t10);
    }

    @NotNull
    public String toString() {
        return "AccessibilityKey: " + this.f41093a;
    }

    public /* synthetic */ d0(String str, Function2 function2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? a.f41097a : function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d0(@NotNull String str, boolean z10) {
        this(str, (Function2) null, 2, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        this.f41095c = z10;
    }

    public /* synthetic */ d0(String str, boolean z10, Function2 function2, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z10, function2, (i10 & 8) != 0 ? null : str2);
    }

    public d0(@NotNull String str, boolean z10, @NotNull Function2<? super T, ? super T, ? extends T> function2, @Nullable String str2) {
        this(str, function2);
        this.f41095c = z10;
        this.f41096d = str2;
    }
}
