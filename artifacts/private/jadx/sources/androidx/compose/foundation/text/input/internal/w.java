package androidx.compose.foundation.text.input.internal;

import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputMethodManager;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nComposeInputMethodManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeInputMethodManager.android.kt\nandroidx/compose/foundation/text/input/internal/ComposeInputMethodManagerImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,204:1\n1#2:205\n*E\n"})
abstract class w implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final View f20152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private InputMethodManager f20153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.core.view.i1 f20154c;

    public w(@NotNull View view) {
        this.f20152a = view;
        this.f20154c = new androidx.core.view.i1(view);
    }

    private final InputMethodManager j() {
        Object systemService = this.f20152a.getContext().getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        return (InputMethodManager) systemService;
    }

    @Override // androidx.compose.foundation.text.input.internal.v
    public void a(int i10, int i11, int i12, int i13) {
        l().updateSelection(this.f20152a, i10, i11, i12, i13);
    }

    @Override // androidx.compose.foundation.text.input.internal.v
    public void b() {
        l().restartInput(this.f20152a);
    }

    @Override // androidx.compose.foundation.text.input.internal.v
    public void c() {
        this.f20154c.a();
    }

    @Override // androidx.compose.foundation.text.input.internal.v
    public void d(@NotNull CursorAnchorInfo cursorAnchorInfo) {
        l().updateCursorAnchorInfo(this.f20152a, cursorAnchorInfo);
    }

    @Override // androidx.compose.foundation.text.input.internal.v
    public void e(int i10, @NotNull ExtractedText extractedText) {
        l().updateExtractedText(this.f20152a, i10, extractedText);
    }

    @Override // androidx.compose.foundation.text.input.internal.v
    public void f() {
        this.f20154c.b();
    }

    @Override // androidx.compose.foundation.text.input.internal.v
    public void g() {
    }

    @Override // androidx.compose.foundation.text.input.internal.v
    public void h() {
    }

    @Override // androidx.compose.foundation.text.input.internal.v
    public void i() {
    }

    @NotNull
    protected final View k() {
        return this.f20152a;
    }

    @NotNull
    protected final InputMethodManager l() {
        InputMethodManager inputMethodManager = this.f20153b;
        if (inputMethodManager != null) {
            return inputMethodManager;
        }
        InputMethodManager inputMethodManagerJ = j();
        this.f20153b = inputMethodManagerJ;
        return inputMethodManagerJ;
    }
}
