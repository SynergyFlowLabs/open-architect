package androidx.compose.foundation.layout;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f15990a = 0;

    @androidx.compose.runtime.internal.w0(parameters = 1)
    public static final class a extends f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f15991c = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final Function1<androidx.compose.ui.layout.e1, Integer> f15992b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull Function1<? super androidx.compose.ui.layout.e1, Integer> function1) {
            super(null);
            this.f15992b = function1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ a d(a aVar, Function1 function1, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                function1 = aVar.f15992b;
            }
            return aVar.c(function1);
        }

        @Override // androidx.compose.foundation.layout.f
        public int a(@NotNull androidx.compose.ui.layout.i2 i2Var) {
            return this.f15992b.invoke(i2Var).intValue();
        }

        @NotNull
        public final Function1<androidx.compose.ui.layout.e1, Integer> b() {
            return this.f15992b;
        }

        @NotNull
        public final a c(@NotNull Function1<? super androidx.compose.ui.layout.e1, Integer> function1) {
            return new a(function1);
        }

        @NotNull
        public final Function1<androidx.compose.ui.layout.e1, Integer> e() {
            return this.f15992b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f15992b, ((a) obj).f15992b);
        }

        public int hashCode() {
            return this.f15992b.hashCode();
        }

        @NotNull
        public String toString() {
            return "Block(lineProviderBlock=" + this.f15992b + ')';
        }
    }

    @androidx.compose.runtime.internal.w0(parameters = 1)
    public static final class b extends f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f15993c = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final androidx.compose.ui.layout.a f15994b;

        public b(@NotNull androidx.compose.ui.layout.a aVar) {
            super(null);
            this.f15994b = aVar;
        }

        public static /* synthetic */ b d(b bVar, androidx.compose.ui.layout.a aVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                aVar = bVar.f15994b;
            }
            return bVar.c(aVar);
        }

        @Override // androidx.compose.foundation.layout.f
        public int a(@NotNull androidx.compose.ui.layout.i2 i2Var) {
            return i2Var.M(this.f15994b);
        }

        @NotNull
        public final androidx.compose.ui.layout.a b() {
            return this.f15994b;
        }

        @NotNull
        public final b c(@NotNull androidx.compose.ui.layout.a aVar) {
            return new b(aVar);
        }

        @NotNull
        public final androidx.compose.ui.layout.a e() {
            return this.f15994b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.f15994b, ((b) obj).f15994b);
        }

        public int hashCode() {
            return this.f15994b.hashCode();
        }

        @NotNull
        public String toString() {
            return "Value(alignmentLine=" + this.f15994b + ')';
        }
    }

    public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract int a(@NotNull androidx.compose.ui.layout.i2 i2Var);

    private f() {
    }
}
