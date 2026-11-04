package androidx.compose.foundation.layout;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public abstract class g6 extends androidx.compose.ui.a0.d implements androidx.compose.ui.node.a2 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f16055s = androidx.compose.ui.a0.d.f36940o;

    @androidx.compose.runtime.internal.w0(parameters = 0)
    public static final class a extends g6 {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final int f16056v = 8;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        @NotNull
        private Function1<? super androidx.compose.ui.layout.e1, Integer> f16057t;

        public a(@NotNull Function1<? super androidx.compose.ui.layout.e1, Integer> function1) {
            super(null);
            this.f16057t = function1;
        }

        @Override // androidx.compose.foundation.layout.g6, androidx.compose.ui.node.a2
        @NotNull
        public Object V(@NotNull androidx.compose.ui.unit.d dVar, @Nullable Object obj) {
            t5 t5Var = obj instanceof t5 ? (t5) obj : null;
            if (t5Var == null) {
                t5Var = new t5(0.0f, false, null, null, 15, null);
            }
            t5Var.k(k1.f16162a.b(new f.a(this.f16057t)));
            return t5Var;
        }

        @NotNull
        public final Function1<androidx.compose.ui.layout.e1, Integer> v9() {
            return this.f16057t;
        }

        public final void w9(@NotNull Function1<? super androidx.compose.ui.layout.e1, Integer> function1) {
            this.f16057t = function1;
        }
    }

    @androidx.compose.runtime.internal.w0(parameters = 0)
    public static final class b extends g6 {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final int f16058v = 8;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        @NotNull
        private androidx.compose.ui.layout.a f16059t;

        public b(@NotNull androidx.compose.ui.layout.a aVar) {
            super(null);
            this.f16059t = aVar;
        }

        @Override // androidx.compose.foundation.layout.g6, androidx.compose.ui.node.a2
        @NotNull
        public Object V(@NotNull androidx.compose.ui.unit.d dVar, @Nullable Object obj) {
            t5 t5Var = obj instanceof t5 ? (t5) obj : null;
            if (t5Var == null) {
                t5Var = new t5(0.0f, false, null, null, 15, null);
            }
            t5Var.k(k1.f16162a.b(new f.b(this.f16059t)));
            return t5Var;
        }

        @NotNull
        public final androidx.compose.ui.layout.a v9() {
            return this.f16059t;
        }

        public final void w9(@NotNull androidx.compose.ui.layout.a aVar) {
            this.f16059t = aVar;
        }
    }

    public /* synthetic */ g6(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // androidx.compose.ui.node.a2
    @Nullable
    public abstract Object V(@NotNull androidx.compose.ui.unit.d dVar, @Nullable Object obj);

    private g6() {
    }
}
