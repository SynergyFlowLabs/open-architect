package androidx.compose.ui.node;

import android.view.View;
import androidx.compose.ui.platform.e4;
import androidx.compose.ui.platform.n3;
import androidx.compose.ui.platform.o4;
import androidx.compose.ui.platform.w4;
import androidx.compose.ui.platform.z3;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface x1 extends androidx.compose.ui.input.pointer.s0 {

    @NotNull
    public static final a J = a.f40095a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f40095a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static boolean f40096b;

        private a() {
        }

        public final boolean a() {
            return f40096b;
        }

        public final void b(boolean z10) {
            f40096b = z10;
        }
    }

    public interface b {
        void q();
    }

    static /* synthetic */ void C(x1 x1Var, l0 l0Var, boolean z10, boolean z11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestRelayout");
        }
        int i11 = 3 >> 0;
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        x1Var.A(l0Var, z10, z11);
    }

    static /* synthetic */ w1 L(x1 x1Var, Function2 function2, Function0 function0, androidx.compose.ui.graphics.layer.c cVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createLayer");
        }
        if ((i10 & 4) != 0) {
            cVar = null;
        }
        return x1Var.p(function2, function0, cVar);
    }

    static /* synthetic */ void W(x1 x1Var, l0 l0Var, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestMeasure");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        if ((i10 & 8) != 0) {
            z12 = true;
        }
        x1Var.u(l0Var, z10, z11, z12);
    }

    static /* synthetic */ void d(x1 x1Var, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: measureAndLayout");
        }
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        x1Var.a(z10);
    }

    @kotlin.l(message = "fontLoader is deprecated, use fontFamilyResolver", replaceWith = @kotlin.b1(expression = "fontFamilyResolver", imports = {}))
    static /* synthetic */ void getFontLoader$annotations() {
    }

    static /* synthetic */ void i(x1 x1Var, l0 l0Var, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: forceMeasureTheSubtree");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        x1Var.H(l0Var, z10);
    }

    void A(@NotNull l0 l0Var, boolean z10, boolean z11);

    default void B() {
    }

    long D(long j10);

    default void E(@NotNull l0 l0Var, int i10) {
    }

    default void F() {
    }

    void G(@NotNull l0 l0Var);

    void H(@NotNull l0 l0Var, boolean z10);

    default void I(long j10) {
    }

    void J(@NotNull l0 l0Var);

    void M(@NotNull l0 l0Var);

    @Nullable
    Object O(@NotNull Function2<? super n3, ? super kotlin.coroutines.d<?>, ? extends Object> function2, @NotNull kotlin.coroutines.d<?> dVar);

    default void Q(float f10) {
    }

    void R(@NotNull l0 l0Var);

    void T(@NotNull Function0<Unit> function0);

    void U();

    void V(@NotNull l0 l0Var);

    void a(boolean z10);

    void f(@NotNull l0 l0Var);

    default void g(@NotNull l0 l0Var, int i10) {
    }

    @NotNull
    androidx.compose.ui.platform.c getAccessibilityManager();

    @Nullable
    androidx.compose.ui.autofill.h getAutofill();

    @Nullable
    androidx.compose.ui.autofill.m getAutofillManager();

    @NotNull
    androidx.compose.ui.autofill.q getAutofillTree();

    @NotNull
    androidx.compose.ui.platform.m1 getClipboard();

    @NotNull
    androidx.compose.ui.platform.o1 getClipboardManager();

    @NotNull
    CoroutineContext getCoroutineContext();

    @NotNull
    androidx.compose.ui.unit.d getDensity();

    @NotNull
    androidx.compose.ui.draganddrop.c getDragAndDropManager();

    @NotNull
    androidx.compose.ui.focus.w getFocusOwner();

    @NotNull
    androidx.compose.ui.text.font.y.b getFontFamilyResolver();

    @NotNull
    androidx.compose.ui.text.font.x.b getFontLoader();

    @NotNull
    androidx.compose.ui.graphics.o1 getGraphicsContext();

    @NotNull
    p0.a getHapticFeedBack();

    @NotNull
    q0.b getInputModeManager();

    @NotNull
    androidx.compose.ui.unit.w getLayoutDirection();

    @NotNull
    androidx.collection.j0<l0> getLayoutNodes();

    long getMeasureIteration();

    @NotNull
    androidx.compose.ui.modifier.h getModifierLocalManager();

    @Nullable
    default v1 getOutOfFrameExecutor() {
        return null;
    }

    @NotNull
    default androidx.compose.ui.layout.i2.a getPlacementScope() {
        return androidx.compose.ui.layout.j2.b(this);
    }

    @NotNull
    androidx.compose.ui.input.pointer.z getPointerIconService();

    @NotNull
    androidx.compose.ui.spatial.f getRectManager();

    @NotNull
    l0 getRoot();

    @NotNull
    g2 getRootForTest();

    @NotNull
    androidx.compose.ui.semantics.x getSemanticsOwner();

    @NotNull
    n0 getSharedDrawScope();

    boolean getShowLayoutBounds();

    @NotNull
    z1 getSnapshotObserver();

    @NotNull
    z3 getSoftwareKeyboardController();

    @NotNull
    androidx.compose.ui.text.input.a1 getTextInputService();

    @NotNull
    e4 getTextToolbar();

    @NotNull
    o4 getViewConfiguration();

    @NotNull
    w4 getWindowInfo();

    @androidx.compose.ui.t
    void h(@NotNull View view);

    void k(@NotNull l0 l0Var);

    void l(@NotNull b bVar);

    @NotNull
    w1 p(@NotNull Function2<? super androidx.compose.ui.graphics.k0, ? super androidx.compose.ui.graphics.layer.c, Unit> function2, @NotNull Function0<Unit> function0, @Nullable androidx.compose.ui.graphics.layer.c cVar);

    void q(@NotNull l0 l0Var, long j10);

    long s(long j10);

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    @a0
    void setShowLayoutBounds(boolean z10);

    void u(@NotNull l0 l0Var, boolean z10, boolean z11, boolean z12);

    default void v() {
    }

    void x();

    default void y() {
    }
}
