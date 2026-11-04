package androidx.compose.foundation.text;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class x7 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f21755g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f21756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private a f21757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private a f21758c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f21759d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private Long f21760e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f21761f;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private a f21762a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private androidx.compose.ui.text.input.y0 f21763b;

        public a(@Nullable a aVar, @NotNull androidx.compose.ui.text.input.y0 y0Var) {
            this.f21762a = aVar;
            this.f21763b = y0Var;
        }

        @Nullable
        public final a a() {
            return this.f21762a;
        }

        @NotNull
        public final androidx.compose.ui.text.input.y0 b() {
            return this.f21763b;
        }

        public final void c(@Nullable a aVar) {
            this.f21762a = aVar;
        }

        public final void d(@NotNull androidx.compose.ui.text.input.y0 y0Var) {
            this.f21763b = y0Var;
        }

        public /* synthetic */ a(a aVar, androidx.compose.ui.text.input.y0 y0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : aVar, y0Var);
        }
    }

    public x7() {
        this(0, 1, null);
    }

    private final void e() {
        a aVarA;
        a aVarA2 = this.f21757b;
        if ((aVarA2 != null ? aVarA2.a() : null) == null) {
            return;
        }
        while (true) {
            if (((aVarA2 == null || (aVarA = aVarA2.a()) == null) ? null : aVarA.a()) == null) {
                break;
            } else {
                aVarA2 = aVarA2.a();
            }
        }
        if (aVarA2 != null) {
            aVarA2.c(null);
        }
    }

    public static /* synthetic */ void g(x7 x7Var, androidx.compose.ui.text.input.y0 y0Var, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = z7.a();
        }
        x7Var.f(y0Var, j10);
    }

    public final void a() {
        this.f21761f = true;
    }

    public final int b() {
        return this.f21756a;
    }

    public final void c(@NotNull androidx.compose.ui.text.input.y0 y0Var) {
        androidx.compose.ui.text.input.y0 y0VarB;
        this.f21761f = false;
        a aVar = this.f21757b;
        int i10 = 7 ^ 0;
        if (Intrinsics.areEqual(y0Var, aVar != null ? aVar.b() : null)) {
            return;
        }
        String strM = y0Var.m();
        a aVar2 = this.f21757b;
        if (Intrinsics.areEqual(strM, (aVar2 == null || (y0VarB = aVar2.b()) == null) ? null : y0VarB.m())) {
            a aVar3 = this.f21757b;
            if (aVar3 != null) {
                aVar3.d(y0Var);
                return;
            }
            return;
        }
        this.f21757b = new a(this.f21757b, y0Var);
        this.f21758c = null;
        int length = this.f21759d + y0Var.m().length();
        this.f21759d = length;
        if (length > this.f21756a) {
            e();
        }
    }

    @Nullable
    public final androidx.compose.ui.text.input.y0 d() {
        a aVar = this.f21758c;
        if (aVar == null) {
            return null;
        }
        this.f21758c = aVar.a();
        this.f21757b = new a(this.f21757b, aVar.b());
        this.f21759d += aVar.b().m().length();
        return aVar.b();
    }

    public final void f(@NotNull androidx.compose.ui.text.input.y0 y0Var, long j10) {
        if (!this.f21761f) {
            Long l10 = this.f21760e;
            if (j10 <= (l10 != null ? l10.longValue() : 0L) + ((long) y7.a())) {
                return;
            }
        }
        this.f21760e = Long.valueOf(j10);
        c(y0Var);
    }

    @Nullable
    public final androidx.compose.ui.text.input.y0 h() {
        a aVarA;
        a aVar = this.f21757b;
        if (aVar == null || (aVarA = aVar.a()) == null) {
            return null;
        }
        this.f21757b = aVarA;
        this.f21759d -= aVar.b().m().length();
        this.f21758c = new a(this.f21758c, aVar.b());
        return aVarA.b();
    }

    public x7(int i10) {
        this.f21756a = i10;
    }

    public /* synthetic */ x7(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 100000 : i10);
    }
}
