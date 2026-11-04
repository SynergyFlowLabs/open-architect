package androidx.compose.ui.node;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final a f39709a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Function1<androidx.compose.ui.node.c, Unit> f39710b = b.f39712a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final Function1<androidx.compose.ui.node.c, Unit> f39711c = c.f39713a;

    public static final class a implements androidx.compose.ui.modifier.n {
        a() {
        }

        @Override // androidx.compose.ui.modifier.n
        public <T> T I(androidx.compose.ui.modifier.c<T> cVar) {
            return cVar.a().invoke();
        }
    }

    static final class b extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.node.c, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f39712a = new b();

        b() {
            super(1);
        }

        public final void c(androidx.compose.ui.node.c cVar) {
            cVar.z9();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.node.c cVar) {
            c(cVar);
            return Unit.f312394a;
        }
    }

    static final class c extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.node.c, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f39713a = new c();

        c() {
            super(1);
        }

        public final void c(androidx.compose.ui.node.c cVar) {
            cVar.E9();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.node.c cVar) {
            c(cVar);
            return Unit.f312394a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(androidx.compose.ui.node.c cVar) {
        androidx.compose.ui.a0.d dVarQ = k.u(cVar).A0().q();
        Intrinsics.checkNotNull(dVarQ, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode");
        return ((m2) dVarQ).v9();
    }
}
