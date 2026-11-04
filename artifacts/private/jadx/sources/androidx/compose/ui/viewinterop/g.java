package androidx.compose.ui.viewinterop;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.compose.ui.a0;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.focus.c0;
import androidx.compose.ui.focus.n;
import androidx.compose.ui.focus.u0;
import androidx.compose.ui.focus.w;
import androidx.compose.ui.focus.z;
import androidx.compose.ui.node.l;
import androidx.compose.ui.node.m;
import androidx.compose.ui.node.m1;
import androidx.compose.ui.node.x1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nFocusGroupNode.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusGroupNode.android.kt\nandroidx/compose/ui/viewinterop/FocusGroupPropertiesNode\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,268:1\n118#2:269\n241#3:270\n203#3,8:271\n211#3,6:283\n450#3,6:289\n460#3,2:296\n462#3,8:301\n470#3,9:312\n479#3,8:324\n218#3,3:332\n57#4,4:279\n247#5:295\n240#6,3:298\n243#6,3:321\n1107#7:309\n1085#7,2:310\n*S KotlinDebug\n*F\n+ 1 FocusGroupNode.android.kt\nandroidx/compose/ui/viewinterop/FocusGroupPropertiesNode\n*L\n142#1:269\n142#1:270\n142#1:271,8\n142#1:283,6\n142#1:289,6\n142#1:296,2\n142#1:301,8\n142#1:312,9\n142#1:324,8\n142#1:332,3\n142#1:279,4\n142#1:295\n142#1:298,3\n142#1:321,3\n142#1:309\n142#1:310,2\n*E\n"})
final class g extends a0.d implements c0, ViewTreeObserver.OnGlobalFocusChangeListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    private View f42828s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    private ViewTreeObserver f42829t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private final Function1<androidx.compose.ui.focus.g, Unit> f42830v = new a();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private final Function1<androidx.compose.ui.focus.g, Unit> f42831w = new b();

    static final class a extends l0 implements Function1<androidx.compose.ui.focus.g, Unit> {
        a() {
            super(1);
        }

        public final void c(androidx.compose.ui.focus.g gVar) {
            View viewG = f.g(g.this);
            if (!viewG.isFocused() && !viewG.hasFocus()) {
                if (!n.b(viewG, n.c(gVar.c()), f.f(androidx.compose.ui.node.k.v(g.this).getFocusOwner(), l.a(g.this), viewG))) {
                    gVar.a();
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.focus.g gVar) {
            c(gVar);
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nFocusGroupNode.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusGroupNode.android.kt\nandroidx/compose/ui/viewinterop/FocusGroupPropertiesNode$onExit$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,268:1\n1#2:269\n*E\n"})
    static final class b extends l0 implements Function1<androidx.compose.ui.focus.g, Unit> {
        b() {
            super(1);
        }

        public final void c(androidx.compose.ui.focus.g gVar) {
            View viewFindNextFocusFromRect;
            View viewG = f.g(g.this);
            if (androidx.compose.ui.k.f39201d) {
                if (viewG.hasFocus() || viewG.isFocused()) {
                    viewG.clearFocus();
                }
            } else if (viewG.hasFocus()) {
                w focusOwner = androidx.compose.ui.node.k.v(g.this).getFocusOwner();
                View viewA = l.a(g.this);
                if (viewG instanceof ViewGroup) {
                    Rect rectF = f.f(focusOwner, viewA, viewG);
                    Integer numC = n.c(gVar.c());
                    int iIntValue = numC != null ? numC.intValue() : 130;
                    FocusFinder focusFinder = FocusFinder.getInstance();
                    g gVar2 = g.this;
                    if (gVar2.x9() != null) {
                        Intrinsics.checkNotNull(viewA, "null cannot be cast to non-null type android.view.ViewGroup");
                        viewFindNextFocusFromRect = focusFinder.findNextFocus((ViewGroup) viewA, gVar2.x9(), iIntValue);
                    } else {
                        Intrinsics.checkNotNull(viewA, "null cannot be cast to non-null type android.view.ViewGroup");
                        viewFindNextFocusFromRect = focusFinder.findNextFocusFromRect((ViewGroup) viewA, rectF, iIntValue);
                    }
                    if (viewFindNextFocusFromRect != null && f.d(viewG, viewFindNextFocusFromRect)) {
                        viewFindNextFocusFromRect.requestFocus(iIntValue, rectF);
                        gVar.a();
                    } else if (!viewA.requestFocus()) {
                        throw new IllegalStateException("host view did not take focus");
                    }
                } else if (!viewA.requestFocus()) {
                    throw new IllegalStateException("host view did not take focus");
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.focus.g gVar) {
            c(gVar);
            return Unit.f312394a;
        }
    }

    private final FocusTargetNode w9() {
        int iB = m1.b(1024);
        if (!w().a9()) {
            s0.a.i("visitLocalDescendants called on an unattached node");
        }
        a0.d dVarW = w();
        if ((dVarW.N8() & iB) != 0) {
            boolean z10 = false;
            for (a0.d dVarO8 = dVarW.O8(); dVarO8 != null; dVarO8 = dVarO8.O8()) {
                if ((dVarO8.T8() & iB) != 0) {
                    a0.d dVarN = dVarO8;
                    androidx.compose.runtime.collection.d dVar = null;
                    while (dVarN != null) {
                        if (dVarN instanceof FocusTargetNode) {
                            FocusTargetNode focusTargetNode = (FocusTargetNode) dVarN;
                            if (z10) {
                                return focusTargetNode;
                            }
                            z10 = true;
                        } else if ((dVarN.T8() & iB) != 0 && (dVarN instanceof m)) {
                            int i10 = 0;
                            for (a0.d dVarY9 = ((m) dVarN).y9(); dVarY9 != null; dVarY9 = dVarY9.O8()) {
                                if ((dVarY9.T8() & iB) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        dVarN = dVarY9;
                                    } else {
                                        if (dVar == null) {
                                            dVar = new androidx.compose.runtime.collection.d(new a0.d[16], 0);
                                        }
                                        if (dVarN != null) {
                                            dVar.d(dVarN);
                                            dVarN = null;
                                        }
                                        dVar.d(dVarY9);
                                    }
                                }
                            }
                            if (i10 == 1) {
                            }
                        }
                        dVarN = androidx.compose.ui.node.k.n(dVar);
                    }
                }
            }
        }
        throw new IllegalStateException("Could not find focus target of embedded view wrapper");
    }

    public final void A9(@Nullable ViewTreeObserver viewTreeObserver) {
        this.f42829t = viewTreeObserver;
    }

    public final void B9(@Nullable View view) {
        this.f42828s = view;
    }

    @Override // androidx.compose.ui.focus.c0
    public void Z6(@NotNull z zVar) {
        zVar.D(false);
        zVar.N(this.f42830v);
        zVar.S(this.f42831w);
    }

    @Override // androidx.compose.ui.a0.d
    public void e9() {
        super.e9();
        ViewTreeObserver viewTreeObserver = l.a(this).getViewTreeObserver();
        this.f42829t = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    @Override // androidx.compose.ui.a0.d
    public void f9() {
        ViewTreeObserver viewTreeObserver = this.f42829t;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.f42829t = null;
        l.a(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
        this.f42828s = null;
        super.f9();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public void onGlobalFocusChanged(@Nullable View view, @Nullable View view2) {
        if (androidx.compose.ui.node.k.u(this).I0() == null) {
            return;
        }
        View viewG = f.g(this);
        w focusOwner = androidx.compose.ui.node.k.v(this).getFocusOwner();
        x1 x1VarV = androidx.compose.ui.node.k.v(this);
        int i10 = 7 & 1;
        boolean z10 = (view == null || Intrinsics.areEqual(view, x1VarV) || !f.d(viewG, view)) ? false : true;
        boolean z11 = (view2 == null || Intrinsics.areEqual(view2, x1VarV) || !f.d(viewG, view2)) ? false : true;
        if (z10 && z11) {
            this.f42828s = view2;
            return;
        }
        if (z11) {
            this.f42828s = view2;
            FocusTargetNode focusTargetNodeW9 = w9();
            if (focusTargetNodeW9.c5().n()) {
                return;
            }
            u0.l(focusTargetNodeW9);
            return;
        }
        if (!z10) {
            this.f42828s = null;
            return;
        }
        this.f42828s = null;
        if (w9().c5().k()) {
            focusOwner.q(false, true, false, androidx.compose.ui.focus.f.f37408b.c());
        }
    }

    @Nullable
    public final ViewTreeObserver v9() {
        return this.f42829t;
    }

    @Nullable
    public final View x9() {
        return this.f42828s;
    }

    @NotNull
    public final Function1<androidx.compose.ui.focus.g, Unit> y9() {
        return this.f42830v;
    }

    @NotNull
    public final Function1<androidx.compose.ui.focus.g, Unit> z9() {
        return this.f42831w;
    }
}
