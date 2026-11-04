package androidx.compose.foundation.text.input.internal;

import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputMethodManager;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class s3 implements q3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f19781d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final View f19782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f19783b = kotlin.g0.b(kotlin.j0.NONE, new Function0() { // from class: androidx.compose.foundation.text.input.internal.r3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return s3.j(this.f19778a);
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.core.view.i1 f19784c;

    public s3(@NotNull View view) {
        this.f19782a = view;
        this.f19784c = new androidx.core.view.i1(view);
    }

    private final InputMethodManager i() {
        return (InputMethodManager) this.f19783b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InputMethodManager j(s3 s3Var) {
        Object systemService = s3Var.f19782a.getContext().getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        return (InputMethodManager) systemService;
    }

    @Override // androidx.compose.foundation.text.input.internal.q3
    public void a(int i10, int i11, int i12, int i13) {
        i().updateSelection(this.f19782a, i10, i11, i12, i13);
    }

    @Override // androidx.compose.foundation.text.input.internal.q3
    public void b() {
        i().restartInput(this.f19782a);
    }

    @Override // androidx.compose.foundation.text.input.internal.q3
    public void c() {
        this.f19784c.a();
    }

    @Override // androidx.compose.foundation.text.input.internal.q3
    public void d(@NotNull CursorAnchorInfo cursorAnchorInfo) {
        i().updateCursorAnchorInfo(this.f19782a, cursorAnchorInfo);
    }

    @Override // androidx.compose.foundation.text.input.internal.q3
    public void e(int i10, @NotNull ExtractedText extractedText) {
        i().updateExtractedText(this.f19782a, i10, extractedText);
    }

    @Override // androidx.compose.foundation.text.input.internal.q3
    public void f() {
        this.f19784c.b();
    }

    @Override // androidx.compose.foundation.text.input.internal.q3
    public void g() {
        if (Build.VERSION.SDK_INT >= 34) {
            p.f19734a.a(i(), this.f19782a);
        }
    }

    @Override // androidx.compose.foundation.text.input.internal.q3
    public boolean isActive() {
        return i().isActive(this.f19782a);
    }
}
