package androidx.compose.foundation.text.handwriting;

import androidx.compose.foundation.text.input.internal.d0;
import androidx.compose.foundation.text.input.internal.v;
import androidx.compose.ui.a0;
import androidx.compose.ui.focus.p0;
import androidx.compose.ui.node.l;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.g0;
import kotlin.j0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.k;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class f extends a0.d implements androidx.compose.ui.focus.j {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    private p0 f19354s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private final f0 f19355t = g0.b(j0.NONE, new Function0() { // from class: androidx.compose.foundation.text.handwriting.e
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return f.x9(this.f19353a);
        }
    });

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.handwriting.HandwritingHandlerNode$onFocusEvent$1", f = "HandwritingHandler.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f19356a;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return f.this.new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f19356a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            f.this.y9().h();
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v x9(f fVar) {
        return d0.b(l.a(fVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final v y9() {
        return (v) this.f19355t.getValue();
    }

    @Override // androidx.compose.ui.focus.j
    public void Z(@NotNull p0 p0Var) {
        if (!Intrinsics.areEqual(this.f19354s, p0Var)) {
            this.f19354s = p0Var;
            if (p0Var.n()) {
                int i10 = 3 | 0;
                k.f(Q8(), null, null, new a(null), 3, null);
            }
        }
    }
}
