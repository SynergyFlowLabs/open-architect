package androidx.compose.ui.platform;

import android.view.ActionMode;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class k0 implements e4 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f40592e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final View f40593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private ActionMode f40594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final t0.d f40595c = new t0.d(new a(), null, null, null, null, null, null, okhttp3.internal.ws.g.f334652s, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private g4 f40596d = g4.Hidden;

    static final class a extends kotlin.jvm.internal.l0 implements Function0<Unit> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            k0.this.f40594b = null;
        }
    }

    public k0(@NotNull View view) {
        this.f40593a = view;
        int i10 = (2 | 0) ^ 0;
    }

    @Override // androidx.compose.ui.platform.e4
    public void b() {
        this.f40596d = g4.Hidden;
        ActionMode actionMode = this.f40594b;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.f40594b = null;
    }

    @Override // androidx.compose.ui.platform.e4
    @NotNull
    public g4 t() {
        return this.f40596d;
    }

    @Override // androidx.compose.ui.platform.e4
    public void u(@NotNull n0.j jVar, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function1, @Nullable Function0<Unit> function2, @Nullable Function0<Unit> function3) {
        x(jVar, function0, function1, function2, function3, null);
    }

    @Override // androidx.compose.ui.platform.e4
    public void x(@NotNull n0.j jVar, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function1, @Nullable Function0<Unit> function2, @Nullable Function0<Unit> function3, @Nullable Function0<Unit> function4) {
        this.f40595c.s(jVar);
        this.f40595c.o(function0);
        this.f40595c.p(function2);
        this.f40595c.q(function1);
        this.f40595c.r(function3);
        this.f40595c.n(function4);
        ActionMode actionMode = this.f40594b;
        if (actionMode == null) {
            this.f40596d = g4.Shown;
            this.f40594b = f4.f40442a.b(this.f40593a, new t0.a(this.f40595c), 1);
        } else if (actionMode != null) {
            actionMode.invalidate();
        }
    }
}
