package androidx.compose.ui.node;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nDelegatingNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 NodeKind.kt\nandroidx/compose/ui/node/NodeKindKt\n*L\n1#1,279:1\n240#1,6:280\n240#1,6:286\n240#1,6:306\n240#1,6:312\n240#1,6:318\n240#1,6:324\n240#1,6:330\n57#2,4:292\n57#2,4:302\n82#3:296\n82#3:298\n82#3:300\n63#4:297\n63#4:299\n63#4:301\n*S KotlinDebug\n*F\n+ 1 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n*L\n44#1:280,6\n61#1:286,6\n249#1:306,6\n260#1:312,6\n266#1:318,6\n270#1:324,6\n276#1:330,6\n90#1:292,4\n187#1:302,4\n112#1:296\n168#1:298\n182#1:300\n112#1:297\n168#1:299\n182#1:301\n*E\n"})
public abstract class m extends androidx.compose.ui.a0.d {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f39907v = 8;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f39908s = n1.g(this);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.a0.d f39909t;

    public static /* synthetic */ void A9() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.ui.a0$d] */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.compose.ui.a0$d] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    private final void E9(int i10, boolean z10) {
        ?? W8;
        androidx.compose.ui.a0.d dVarO8;
        int iT8 = T8();
        p9(i10);
        if (iT8 != i10) {
            if (k.k(this)) {
                k9(i10);
            }
            if (a9()) {
                androidx.compose.ui.a0.d dVarW = w();
                while (true) {
                    if (W8 == 0) {
                        this = this;
                        break;
                    }
                    i10 |= W8.T8();
                    W8.p9(i10);
                    if (W8 == dVarW) {
                        this = this;
                        break;
                    } else {
                        this = this;
                        W8 = W8.W8();
                    }
                }
                if (z10 && W8 == dVarW) {
                    i10 = n1.h(dVarW);
                    dVarW.p9(i10);
                }
                int iN8 = i10 | ((W8 == 0 || (dVarO8 = W8.O8()) == null) ? 0 : dVarO8.N8());
                for (?? W9 = W8; W9 != 0; W9 = W9.W8()) {
                    iN8 |= W9.T8();
                    W9.k9(iN8);
                }
            }
        }
    }

    private final void F9(int i10, androidx.compose.ui.a0.d dVar) {
        int iT8 = T8();
        if ((i10 & m1.b(2)) == 0 || (m1.b(2) & iT8) == 0 || (this instanceof g0)) {
            return;
        }
        s0.a.i("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + dVar);
    }

    public final void B9(@Nullable androidx.compose.ui.a0.d dVar) {
        this.f39909t = dVar;
    }

    protected final void C9(@NotNull j jVar) {
        androidx.compose.ui.a0.d dVar = null;
        for (androidx.compose.ui.a0.d dVarO8 = this.f39909t; dVarO8 != null; dVarO8 = dVarO8.O8()) {
            if (dVarO8 == jVar) {
                if (dVarO8.a9()) {
                    n1.d(dVarO8);
                    dVarO8.j9();
                    dVarO8.d9();
                }
                dVarO8.l9(dVarO8);
                dVarO8.k9(0);
                if (dVar == null) {
                    this.f39909t = dVarO8.O8();
                } else {
                    dVar.m9(dVarO8.O8());
                }
                dVarO8.m9(null);
                dVarO8.r9(null);
                int iT8 = T8();
                int iH = n1.h(this);
                E9(iH, true);
                if (a9() && (iT8 & m1.b(2)) != 0 && (m1.b(2) & iH) == 0) {
                    i1 i1VarA0 = k.u(this).A0();
                    w().u9(null);
                    i1VarA0.K();
                    return;
                }
                return;
            }
            dVar = dVarO8;
        }
        throw new IllegalStateException(("Could not find delegate: " + jVar).toString());
    }

    public final void D9(@NotNull j jVar) {
        C9(jVar);
    }

    @Override // androidx.compose.ui.a0.d
    public void c9() {
        super.c9();
        for (androidx.compose.ui.a0.d dVarY9 = y9(); dVarY9 != null; dVarY9 = dVarY9.O8()) {
            dVarY9.u9(P8());
            if (!dVarY9.a9()) {
                dVarY9.c9();
            }
        }
    }

    @Override // androidx.compose.ui.a0.d
    public void d9() {
        for (androidx.compose.ui.a0.d dVarY9 = y9(); dVarY9 != null; dVarY9 = dVarY9.O8()) {
            dVarY9.d9();
        }
        super.d9();
    }

    @Override // androidx.compose.ui.a0.d
    public void h9() {
        super.h9();
        for (androidx.compose.ui.a0.d dVarY9 = y9(); dVarY9 != null; dVarY9 = dVarY9.O8()) {
            dVarY9.h9();
        }
    }

    @Override // androidx.compose.ui.a0.d
    public void i9() {
        for (androidx.compose.ui.a0.d dVarY9 = y9(); dVarY9 != null; dVarY9 = dVarY9.O8()) {
            dVarY9.i9();
        }
        super.i9();
    }

    @Override // androidx.compose.ui.a0.d
    public void j9() {
        super.j9();
        for (androidx.compose.ui.a0.d dVarY9 = y9(); dVarY9 != null; dVarY9 = dVarY9.O8()) {
            dVarY9.j9();
        }
    }

    @Override // androidx.compose.ui.a0.d
    public void l9(@NotNull androidx.compose.ui.a0.d dVar) {
        super.l9(dVar);
        for (androidx.compose.ui.a0.d dVarY9 = y9(); dVarY9 != null; dVarY9 = dVarY9.O8()) {
            dVarY9.l9(dVar);
        }
    }

    @Override // androidx.compose.ui.a0.d
    public void u9(@Nullable k1 k1Var) {
        super.u9(k1Var);
        for (androidx.compose.ui.a0.d dVarY9 = y9(); dVarY9 != null; dVarY9 = dVarY9.O8()) {
            dVarY9.u9(k1Var);
        }
    }

    @NotNull
    protected final <T extends j> T v9(@NotNull T t10) {
        androidx.compose.ui.a0.d dVarW = t10.w();
        if (dVarW != t10) {
            androidx.compose.ui.a0.d dVar = t10 instanceof androidx.compose.ui.a0.d ? (androidx.compose.ui.a0.d) t10 : null;
            androidx.compose.ui.a0.d dVarW8 = dVar != null ? dVar.W8() : null;
            if (dVarW == w() && Intrinsics.areEqual(dVarW8, this)) {
                return t10;
            }
            throw new IllegalStateException("Cannot delegate to an already delegated node");
        }
        if (dVarW.a9()) {
            s0.a.i("Cannot delegate to an already attached node");
        }
        dVarW.l9(w());
        int iT8 = T8();
        int iH = n1.h(dVarW);
        dVarW.p9(iH);
        F9(iH, dVarW);
        dVarW.m9(this.f39909t);
        this.f39909t = dVarW;
        dVarW.r9(this);
        E9(T8() | iH, false);
        if (a9()) {
            if ((iH & m1.b(2)) == 0 || (iT8 & m1.b(2)) != 0) {
                u9(P8());
            } else {
                i1 i1VarA0 = k.u(this).A0();
                w().u9(null);
                i1VarA0.K();
            }
            dVarW.c9();
            dVarW.i9();
            n1.a(dVarW);
        }
        return t10;
    }

    @NotNull
    public final <T extends j> T w9(@NotNull T t10) {
        return (T) v9(t10);
    }

    public final void x9(@NotNull Function1<? super androidx.compose.ui.a0.d, Unit> function1) {
        for (androidx.compose.ui.a0.d dVarY9 = y9(); dVarY9 != null; dVarY9 = dVarY9.O8()) {
            function1.invoke(dVarY9);
        }
    }

    @Nullable
    public final androidx.compose.ui.a0.d y9() {
        return this.f39909t;
    }

    public final int z9() {
        return this.f39908s;
    }
}
