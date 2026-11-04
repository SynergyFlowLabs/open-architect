package androidx.compose.ui.text.input;

import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputMethodManager;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@kotlin.l(message = "Only exists to support the legacy TextInputService APIs. It is not used by any Compose code. A copy of this class in foundation is used by the legacy BasicTextField.")
public final class y implements x {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f41974d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final View f41975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f41976b = kotlin.g0.b(kotlin.j0.NONE, new a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.core.view.i1 f41977c;

    static final class a extends kotlin.jvm.internal.l0 implements Function0<InputMethodManager> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final InputMethodManager invoke() {
            Object systemService = y.this.f41975a.getContext().getSystemService("input_method");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            return (InputMethodManager) systemService;
        }
    }

    public y(@NotNull View view) {
        this.f41975a = view;
        this.f41977c = new androidx.core.view.i1(view);
    }

    private final InputMethodManager h() {
        return (InputMethodManager) this.f41976b.getValue();
    }

    @Override // androidx.compose.ui.text.input.x
    public void a(int i10, int i11, int i12, int i13) {
        h().updateSelection(this.f41975a, i10, i11, i12, i13);
    }

    @Override // androidx.compose.ui.text.input.x
    public void b() {
        h().restartInput(this.f41975a);
    }

    @Override // androidx.compose.ui.text.input.x
    public void c() {
        this.f41977c.a();
    }

    @Override // androidx.compose.ui.text.input.x
    public void d(@NotNull CursorAnchorInfo cursorAnchorInfo) {
        h().updateCursorAnchorInfo(this.f41975a, cursorAnchorInfo);
    }

    @Override // androidx.compose.ui.text.input.x
    public void e(int i10, @NotNull ExtractedText extractedText) {
        h().updateExtractedText(this.f41975a, i10, extractedText);
    }

    @Override // androidx.compose.ui.text.input.x
    public void f() {
        this.f41977c.b();
    }

    @Override // androidx.compose.ui.text.input.x
    public boolean isActive() {
        return h().isActive(this.f41975a);
    }
}
