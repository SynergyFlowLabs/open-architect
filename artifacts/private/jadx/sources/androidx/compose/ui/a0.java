package androidx.compose.ui;

import androidx.compose.runtime.internal.w0;
import androidx.compose.runtime.k7;
import androidx.compose.ui.node.k1;
import androidx.compose.ui.node.s1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.s2;
import kotlinx.coroutines.t0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@k7
public interface a0 {

    @NotNull
    public static final a E = a.f36939a;

    public static final class a implements a0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f36939a = new a();

        private a() {
        }

        @Override // androidx.compose.ui.a0
        @NotNull
        public a0 B2(@NotNull a0 a0Var) {
            return a0Var;
        }

        @Override // androidx.compose.ui.a0
        public <R> R J(R r10, @NotNull Function2<? super R, ? super c, ? extends R> function2) {
            return r10;
        }

        @Override // androidx.compose.ui.a0
        public boolean N(@NotNull Function1<? super c, Boolean> function1) {
            return true;
        }

        @Override // androidx.compose.ui.a0
        public boolean X(@NotNull Function1<? super c, Boolean> function1) {
            return false;
        }

        @Override // androidx.compose.ui.a0
        public <R> R b0(R r10, @NotNull Function2<? super c, ? super R, ? extends R> function2) {
            return r10;
        }

        @NotNull
        public String toString() {
            return "Modifier";
        }
    }

    public static final class b {
        @Deprecated
        @NotNull
        public static a0 a(@NotNull a0 a0Var, @NotNull a0 a0Var2) {
            return a0.super.B2(a0Var2);
        }
    }

    public interface c extends a0 {

        public static final class a {
            @Deprecated
            public static boolean a(@NotNull c cVar, @NotNull Function1<? super c, Boolean> function1) {
                return c.super.N(function1);
            }

            @Deprecated
            public static boolean b(@NotNull c cVar, @NotNull Function1<? super c, Boolean> function1) {
                return c.super.X(function1);
            }

            @Deprecated
            public static <R> R c(@NotNull c cVar, R r10, @NotNull Function2<? super R, ? super c, ? extends R> function2) {
                return (R) c.super.J(r10, function2);
            }

            @Deprecated
            public static <R> R d(@NotNull c cVar, R r10, @NotNull Function2<? super c, ? super R, ? extends R> function2) {
                return (R) c.super.b0(r10, function2);
            }

            @Deprecated
            @NotNull
            public static a0 e(@NotNull c cVar, @NotNull a0 a0Var) {
                return c.super.B2(a0Var);
            }
        }

        @Override // androidx.compose.ui.a0
        default <R> R J(R r10, @NotNull Function2<? super R, ? super c, ? extends R> function2) {
            return function2.invoke(r10, this);
        }

        @Override // androidx.compose.ui.a0
        default boolean N(@NotNull Function1<? super c, Boolean> function1) {
            return function1.invoke(this).booleanValue();
        }

        @Override // androidx.compose.ui.a0
        default boolean X(@NotNull Function1<? super c, Boolean> function1) {
            return function1.invoke(this).booleanValue();
        }

        @Override // androidx.compose.ui.a0
        default <R> R b0(R r10, @NotNull Function2<? super c, ? super R, ? extends R> function2) {
            return function2.invoke(this, r10);
        }
    }

    @w0(parameters = 0)
    @SourceDebugExtension({"SMAP\nModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,416:1\n1#2:417\n57#3,4:418\n57#3,4:422\n57#3,4:426\n57#3,4:430\n57#3,4:434\n57#3,4:438\n57#3,4:442\n57#3,4:446\n57#3,4:450\n57#3,4:454\n57#3,4:458\n*S KotlinDebug\n*F\n+ 1 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n*L\n250#1:418,4\n251#1:422,4\n259#1:426,4\n262#1:430,4\n271#1:434,4\n272#1:438,4\n275#1:442,4\n285#1:446,4\n286#1:450,4\n289#1:454,4\n301#1:458,4\n*E\n"})
    public static abstract class d implements androidx.compose.ui.node.j {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final int f36940o = 8;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private s0 f36942b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f36943c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        private d f36945e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        private d f36946f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        private s1 f36947g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        private k1 f36948h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f36949i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f36950j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f36951k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f36952l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @Nullable
        private Function0<Unit> f36953m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f36954n;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private d f36941a = this;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f36944d = -1;

        public static /* synthetic */ void U8() {
        }

        public static /* synthetic */ void Y8() {
        }

        public final int N8() {
            return this.f36944d;
        }

        @Nullable
        public final d O8() {
            return this.f36946f;
        }

        @Nullable
        public final k1 P8() {
            return this.f36948h;
        }

        @NotNull
        public final s0 Q8() {
            s0 s0Var = this.f36942b;
            if (s0Var != null) {
                return s0Var;
            }
            s0 s0VarA = t0.a(androidx.compose.ui.node.k.v(this).getCoroutineContext().plus(s2.a((p2) androidx.compose.ui.node.k.v(this).getCoroutineContext().get(p2.M2))));
            this.f36942b = s0VarA;
            return s0VarA;
        }

        @Nullable
        public final Function0<Unit> R8() {
            return this.f36953m;
        }

        public final boolean S8() {
            return this.f36949i;
        }

        public final int T8() {
            return this.f36943c;
        }

        @Nullable
        public final s1 V8() {
            return this.f36947g;
        }

        @Nullable
        public final d W8() {
            return this.f36945e;
        }

        public boolean X8() {
            return true;
        }

        public final boolean Z8() {
            return this.f36950j;
        }

        public final boolean a9() {
            return this.f36954n;
        }

        public final boolean b9(int i10) {
            return (T8() & i10) != 0;
        }

        public void c9() {
            if (this.f36954n) {
                s0.a.i("node attached multiple times");
            }
            if (!(this.f36948h != null)) {
                s0.a.i("attach invoked on a node without a coordinator");
            }
            this.f36954n = true;
            this.f36951k = true;
        }

        public void d9() {
            if (!this.f36954n) {
                s0.a.i("Cannot detach a node that is not attached");
            }
            if (this.f36951k) {
                s0.a.i("Must run runAttachLifecycle() before markAsDetached()");
            }
            if (this.f36952l) {
                s0.a.i("Must run runDetachLifecycle() before markAsDetached()");
            }
            this.f36954n = false;
            s0 s0Var = this.f36942b;
            if (s0Var != null) {
                t0.d(s0Var, new b0());
                this.f36942b = null;
            }
        }

        public void e9() {
        }

        public void f9() {
        }

        public void g9() {
        }

        public void h9() {
            if (!this.f36954n) {
                s0.a.i("reset() called on an unattached node");
            }
            g9();
        }

        public void i9() {
            if (!this.f36954n) {
                s0.a.i("Must run markAsAttached() prior to runAttachLifecycle");
            }
            if (!this.f36951k) {
                s0.a.i("Must run runAttachLifecycle() only once after markAsAttached()");
            }
            this.f36951k = false;
            e9();
            this.f36952l = true;
        }

        public void j9() {
            if (!this.f36954n) {
                s0.a.i("node detached multiple times");
            }
            if (!(this.f36948h != null)) {
                s0.a.i("detach invoked on a node without a coordinator");
            }
            if (!this.f36952l) {
                s0.a.i("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
            }
            this.f36952l = false;
            Function0<Unit> function0 = this.f36953m;
            if (function0 != null) {
                function0.invoke();
            }
            f9();
        }

        public final void k9(int i10) {
            this.f36944d = i10;
        }

        public void l9(@NotNull d dVar) {
            this.f36941a = dVar;
        }

        public final void m9(@Nullable d dVar) {
            this.f36946f = dVar;
        }

        public final void n9(@Nullable Function0<Unit> function0) {
            this.f36953m = function0;
        }

        public final void o9(boolean z10) {
            this.f36949i = z10;
        }

        public final void p9(int i10) {
            this.f36943c = i10;
        }

        public final void q9(@Nullable s1 s1Var) {
            this.f36947g = s1Var;
        }

        public final void r9(@Nullable d dVar) {
            this.f36945e = dVar;
        }

        public final void s9(boolean z10) {
            this.f36950j = z10;
        }

        public final void t9(@NotNull Function0<Unit> function0) {
            androidx.compose.ui.node.k.v(this).T(function0);
        }

        public void u9(@Nullable k1 k1Var) {
            this.f36948h = k1Var;
        }

        @Override // androidx.compose.ui.node.j
        @NotNull
        public final d w() {
            return this.f36941a;
        }
    }

    @NotNull
    default a0 B2(@NotNull a0 a0Var) {
        return a0Var == E ? this : new j(this, a0Var);
    }

    <R> R J(R r10, @NotNull Function2<? super R, ? super c, ? extends R> function2);

    boolean N(@NotNull Function1<? super c, Boolean> function1);

    boolean X(@NotNull Function1<? super c, Boolean> function1);

    <R> R b0(R r10, @NotNull Function2<? super c, ? super R, ? extends R> function2);
}
