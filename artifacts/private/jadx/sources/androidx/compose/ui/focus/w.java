package androidx.compose.ui.focus;

import android.view.KeyEvent;
import androidx.collection.g2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface w extends q {

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class a extends kotlin.jvm.internal.l0 implements Function0<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f37466a = new a();

        a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class b extends kotlin.jvm.internal.l0 implements Function0<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f37467a = new b();

        b() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    static final class c extends kotlin.jvm.internal.l0 implements Function0<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f37468a = new c();

        c() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ boolean e(w wVar, androidx.compose.ui.input.indirect.c cVar, Function0 function0, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dispatchIndirectTouchEvent");
        }
        if ((i10 & 2) != 0) {
            function0 = a.f37466a;
        }
        return wVar.l(cVar, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ boolean g(w wVar, KeyEvent keyEvent, Function0 function0, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dispatchKeyEvent-YhN2O0w");
        }
        if ((i10 & 2) != 0) {
            function0 = b.f37467a;
        }
        return wVar.v(keyEvent, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ boolean k(w wVar, androidx.compose.ui.input.rotary.d dVar, Function0 function0, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dispatchRotaryEvent");
        }
        if ((i10 & 2) != 0) {
            function0 = c.f37468a;
        }
        return wVar.n(dVar, function0);
    }

    @NotNull
    androidx.compose.ui.a0 a();

    boolean b(@Nullable f fVar, @Nullable n0.j jVar);

    void c();

    @NotNull
    g2<p> d();

    void f(boolean z10);

    boolean h(@NotNull KeyEvent keyEvent);

    @Nullable
    Boolean i(int i10, @Nullable n0.j jVar, @NotNull Function1<? super FocusTargetNode, Boolean> function1);

    @Nullable
    FocusTargetNode j();

    boolean l(@NotNull androidx.compose.ui.input.indirect.c cVar, @NotNull Function0<Boolean> function0);

    void m();

    boolean n(@NotNull androidx.compose.ui.input.rotary.d dVar, @NotNull Function0<Boolean> function0);

    boolean p();

    boolean q(boolean z10, boolean z11, boolean z12, int i10);

    void r(@Nullable FocusTargetNode focusTargetNode);

    void s(@NotNull j jVar);

    void u(@NotNull FocusTargetNode focusTargetNode);

    boolean v(@NotNull KeyEvent keyEvent, @NotNull Function0<Boolean> function0);

    @NotNull
    p0 w();

    @Nullable
    n0.j x();

    void y();

    boolean z(int i10, @Nullable n0.j jVar);
}
