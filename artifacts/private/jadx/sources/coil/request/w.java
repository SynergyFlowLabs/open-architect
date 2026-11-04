package coil.request;

import android.view.View;
import androidx.annotation.l0;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.a1;
import kotlinx.coroutines.f2;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nViewTargetRequestManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewTargetRequestManager.kt\ncoil/request/ViewTargetRequestManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,94:1\n1#2:95\n*E\n"})
public final class w implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final View f87760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private u f87761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private p2 f87762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private v f87763d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f87764e;

    @kotlin.coroutines.jvm.internal.f(c = "coil.request.ViewTargetRequestManager$dispose$1", f = "ViewTargetRequestManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f87765a;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return w.this.new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f87765a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            w.this.e(null);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public w(@NotNull View view) {
        this.f87760a = view;
    }

    public final synchronized void a() {
        try {
            p2 p2Var = this.f87762c;
            if (p2Var != null) {
                p2.a.b(p2Var, null, 1, null);
            }
            this.f87762c = kotlinx.coroutines.k.f(f2.f314023a, l1.e().R0(), null, new a(null), 2, null);
            this.f87761b = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @NotNull
    public final synchronized u b(@NotNull a1<? extends j> a1Var) {
        try {
            u uVar = this.f87761b;
            if (uVar != null && coil.util.l.A() && this.f87764e) {
                this.f87764e = false;
                uVar.b(a1Var);
                return uVar;
            }
            p2 p2Var = this.f87762c;
            if (p2Var != null) {
                p2.a.b(p2Var, null, 1, null);
            }
            this.f87762c = null;
            u uVar2 = new u(this.f87760a, a1Var);
            this.f87761b = uVar2;
            return uVar2;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Nullable
    public final synchronized j c() {
        u uVar;
        a1<j> a1VarA;
        uVar = this.f87761b;
        return (uVar == null || (a1VarA = uVar.a()) == null) ? null : (j) coil.util.l.i(a1VarA);
    }

    public final synchronized boolean d(@NotNull u uVar) {
        return uVar != this.f87761b;
    }

    @l0
    public final void e(@Nullable v vVar) {
        v vVar2 = this.f87763d;
        if (vVar2 != null) {
            vVar2.dispose();
        }
        this.f87763d = vVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    @l0
    public void onViewAttachedToWindow(@NotNull View view) {
        v vVar = this.f87763d;
        if (vVar == null) {
            return;
        }
        this.f87764e = true;
        vVar.a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    @l0
    public void onViewDetachedFromWindow(@NotNull View view) {
        v vVar = this.f87763d;
        if (vVar != null) {
            vVar.dispose();
        }
    }
}
