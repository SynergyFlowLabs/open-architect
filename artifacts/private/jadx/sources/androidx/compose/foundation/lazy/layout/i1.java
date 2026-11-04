package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.k7;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@k7
public final class i1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f17427h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private u2 f17428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private Function1<? super m2, Unit> f17429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final r2 f17430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private q2 f17431d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f17432e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f17433f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f17434g;

    private final class a implements m2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f17435a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final List<s2> f17436b = new ArrayList();

        public a(int i10) {
            this.f17435a = i10;
        }

        @Override // androidx.compose.foundation.lazy.layout.m2
        public void b(int i10, long j10) {
            q2 q2VarF = i1.this.f();
            if (q2VarF == null) {
                return;
            }
            this.f17436b.add(q2VarF.e(i10, j10, i1.this.f17430c));
        }

        @Override // androidx.compose.foundation.lazy.layout.m2
        public void d(int i10) {
            q2 q2VarF = i1.this.f();
            if (q2VarF == null) {
                return;
            }
            this.f17436b.add(q2VarF.d(i10, i1.this.f17430c));
        }

        @Override // androidx.compose.foundation.lazy.layout.m2
        public int e() {
            return this.f17435a;
        }

        @NotNull
        public final List<s2> f() {
            return this.f17436b;
        }
    }

    public interface b {
        void c();

        void cancel();
    }

    public interface c {
        long a(@androidx.annotation.g0(from = 0) int i10);

        int b();

        int getIndex();
    }

    public i1() {
        this.f17430c = new r2();
        this.f17432e = -1;
        this.f17433f = -1;
    }

    private static /* synthetic */ void e() {
    }

    public static /* synthetic */ void g() {
    }

    public static /* synthetic */ void i() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ b n(i1 i1Var, int i10, long j10, Function1 function1, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            function1 = null;
        }
        return i1Var.m(i10, j10, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ b p(i1 i1Var, int i10, long j10, boolean z10, Function1 function1, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            function1 = null;
        }
        return i1Var.o(i10, j10, z10, function1);
    }

    @NotNull
    public final List<s2> b() {
        Function1<? super m2, Unit> function1 = this.f17429b;
        if (function1 == null) {
            return CollectionsKt.emptyList();
        }
        a aVar = new a(this.f17432e);
        function1.invoke(aVar);
        List<s2> listF = aVar.f();
        this.f17434g = listF.size();
        return listF;
    }

    public final int c() {
        return this.f17433f;
    }

    public final int d() {
        return this.f17434g;
    }

    @Nullable
    public final q2 f() {
        return this.f17431d;
    }

    @Nullable
    public final u2 h() {
        return this.f17428a;
    }

    public final int j() {
        return this.f17432e;
    }

    @NotNull
    public final b k(@androidx.annotation.g0(from = 0) int i10) {
        return l(i10, true);
    }

    @NotNull
    public final b l(int i10, boolean z10) {
        b bVarJ;
        q2 q2Var = this.f17431d;
        return (q2Var == null || (bVarJ = q2Var.j(i10, z10, this.f17430c)) == null) ? k.f17452a : bVarJ;
    }

    @NotNull
    public final b m(@androidx.annotation.g0(from = 0) int i10, long j10, @Nullable Function1<? super c, Unit> function1) {
        return o(i10, j10, true, function1);
    }

    @NotNull
    public final b o(int i10, long j10, boolean z10, @Nullable Function1<? super c, Unit> function1) {
        b bVarK;
        q2 q2Var = this.f17431d;
        return (q2Var == null || (bVarK = q2Var.k(i10, j10, this.f17430c, z10, function1)) == null) ? k.f17452a : bVarK;
    }

    public final void q(int i10) {
        this.f17433f = i10;
    }

    public final void r(int i10) {
        this.f17434g = i10;
    }

    public final void s(@Nullable q2 q2Var) {
        this.f17431d = q2Var;
    }

    public final void t(@Nullable u2 u2Var) {
        this.f17428a = u2Var;
    }

    public final void u(int i10) {
        this.f17432e = i10;
    }

    public /* synthetic */ i1(u2 u2Var, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : u2Var, (i10 & 2) != 0 ? null : function1);
    }

    @kotlin.l(message = "Please use overload without Prefetch Scheduler.")
    @androidx.compose.foundation.b2
    public i1(@Nullable u2 u2Var, @Nullable Function1<? super m2, Unit> function1) {
        this();
        this.f17428a = u2Var;
        this.f17429b = function1;
    }

    public /* synthetic */ i1(Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : function1);
    }

    @androidx.compose.foundation.b2
    public i1(@Nullable Function1<? super m2, Unit> function1) {
        this();
        this.f17429b = function1;
    }
}
