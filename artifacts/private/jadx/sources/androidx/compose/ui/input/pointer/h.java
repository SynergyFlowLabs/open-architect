package androidx.compose.ui.input.pointer;

import androidx.compose.ui.node.d2;
import androidx.compose.ui.node.n2;
import androidx.compose.ui.node.p2;
import androidx.compose.ui.node.q2;
import androidx.compose.ui.platform.q1;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.i1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nPointerIcon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerIcon.kt\nandroidx/compose/ui/input/pointer/HoverIconModifierNode\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,422:1\n103#2:423\n35#2,5:424\n104#2:429\n1#3:430\n*S KotlinDebug\n*F\n+ 1 PointerIcon.kt\nandroidx/compose/ui/input/pointer/HoverIconModifierNode\n*L\n253#1:423\n253#1:424,5\n253#1:429\n*E\n"})
public abstract class h extends androidx.compose.ui.a0.d implements p2, d2, androidx.compose.ui.node.h {
    public static final int X = 8;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.node.s f39042s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private x f39043t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f39044v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f39045w;

    static final class a extends kotlin.jvm.internal.l0 implements Function1<h, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i1.h<h> f39046a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i1.h<h> hVar) {
            super(1);
            this.f39046a = hVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(h hVar) {
            if (this.f39046a.f312751a == null && hVar.f39045w) {
                this.f39046a.f312751a = hVar;
            } else if (this.f39046a.f312751a != null && hVar.F9() && hVar.f39045w) {
                this.f39046a.f312751a = hVar;
            }
            return Boolean.TRUE;
        }
    }

    static final class b extends kotlin.jvm.internal.l0 implements Function1<h, p2.a.EnumC0311a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i1.a f39047a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(i1.a aVar) {
            super(1);
            this.f39047a = aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final p2.a.EnumC0311a invoke(h hVar) {
            if (!hVar.f39045w) {
                return p2.a.EnumC0311a.ContinueTraversal;
            }
            this.f39047a.f312744a = false;
            return p2.a.EnumC0311a.CancelTraversal;
        }
    }

    static final class c extends kotlin.jvm.internal.l0 implements Function1<h, p2.a.EnumC0311a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i1.h<h> f39048a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(i1.h<h> hVar) {
            super(1);
            this.f39048a = hVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final p2.a.EnumC0311a invoke(h hVar) {
            p2.a.EnumC0311a enumC0311a = p2.a.EnumC0311a.ContinueTraversal;
            if (hVar.f39045w) {
                this.f39048a.f312751a = hVar;
                if (hVar.F9()) {
                    return p2.a.EnumC0311a.SkipSubtreeAndContinueTraversal;
                }
            }
            return enumC0311a;
        }
    }

    static final class d extends kotlin.jvm.internal.l0 implements Function1<h, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i1.h<h> f39049a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(i1.h<h> hVar) {
            super(1);
            this.f39049a = hVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(h hVar) {
            if (hVar.F9() && hVar.f39045w) {
                this.f39049a.f312751a = hVar;
            }
            return Boolean.TRUE;
        }
    }

    public /* synthetic */ h(x xVar, boolean z10, androidx.compose.ui.node.s sVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(xVar, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? null : sVar);
    }

    private final void A9() {
        i1.a aVar = new i1.a();
        int i10 = 3 >> 1;
        aVar.f312744a = true;
        if (!this.f39044v) {
            q2.h(this, new b(aVar));
        }
        if (aVar.f312744a) {
            w9();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final h B9() {
        i1.h hVar = new i1.h();
        q2.h(this, new c(hVar));
        return (h) hVar.f312751a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final h C9() {
        i1.h hVar = new i1.h();
        q2.d(this, new d(hVar));
        return (h) hVar.f312751a;
    }

    private final void I9() {
        this.f39045w = true;
        A9();
    }

    private final void J9() {
        if (this.f39045w) {
            this.f39045w = false;
            if (a9()) {
                y9();
            }
        }
    }

    private final void w9() {
        x xVar;
        h hVarC9 = C9();
        if (hVarC9 == null || (xVar = hVarC9.f39043t) == null) {
            xVar = this.f39043t;
        }
        x9(xVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void y9() {
        i1.h hVar = new i1.h();
        q2.d(this, new a(hVar));
        h hVar2 = (h) hVar.f312751a;
        if (hVar2 != null) {
            hVar2.w9();
        } else {
            x9(null);
        }
    }

    private final void z9() {
        h hVarB9;
        if (this.f39045w) {
            if (!this.f39044v && (hVarB9 = B9()) != null) {
                this = hVarB9;
            }
            this.w9();
        }
    }

    @Nullable
    public final androidx.compose.ui.node.s D9() {
        return this.f39042s;
    }

    @NotNull
    public final x E9() {
        return this.f39043t;
    }

    public final boolean F9() {
        return this.f39044v;
    }

    @Nullable
    protected final z G9() {
        return (z) androidx.compose.ui.node.i.a(this, q1.v());
    }

    public abstract boolean H9(int i10);

    public final void K9(@Nullable androidx.compose.ui.node.s sVar) {
        this.f39042s = sVar;
    }

    public final void L9(@NotNull x xVar) {
        if (Intrinsics.areEqual(this.f39043t, xVar)) {
            return;
        }
        this.f39043t = xVar;
        if (this.f39045w) {
            A9();
        }
    }

    public final void M9(boolean z10) {
        if (this.f39044v != z10) {
            this.f39044v = z10;
            if (z10) {
                if (this.f39045w) {
                    w9();
                }
            } else if (this.f39045w) {
                z9();
            }
        }
    }

    @Override // androidx.compose.ui.a0.d
    public void f9() {
        J9();
        super.f9();
    }

    @Override // androidx.compose.ui.node.d2
    public void p3() {
        J9();
    }

    @Override // androidx.compose.ui.node.d2
    public void p5(@NotNull q qVar, @NotNull s sVar, long j10) {
        if (sVar == s.Main) {
            List<c0> listE = qVar.e();
            int size = listE.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (H9(listE.get(i10).C())) {
                    int iJ = qVar.j();
                    u.a aVar = u.f39127b;
                    if (!u.k(iJ, aVar.a())) {
                        if (!u.k(qVar.j(), aVar.b())) {
                            break;
                        }
                        J9();
                        return;
                    }
                    I9();
                    return;
                }
            }
        }
    }

    public abstract void x9(@Nullable x xVar);

    @Override // androidx.compose.ui.node.d2
    public long z2() {
        androidx.compose.ui.node.s sVar = this.f39042s;
        return sVar != null ? sVar.m(androidx.compose.ui.node.k.q(this)) : n2.f39928b.d();
    }

    public h(@NotNull x xVar, boolean z10, @Nullable androidx.compose.ui.node.s sVar) {
        this.f39042s = sVar;
        this.f39043t = xVar;
        this.f39044v = z10;
    }
}
