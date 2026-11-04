package androidx.compose.foundation.text.input.internal;

import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nComposeInputMethodManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeInputMethodManager.android.kt\nandroidx/compose/foundation/text/input/internal/ComposeInputMethodManagerImplApi21\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,204:1\n1#2:205\n*E\n"})
class x extends w {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private BaseInputConnection f20195d;

    public x(@NotNull View view) {
        super(view);
    }

    @Override // androidx.compose.foundation.text.input.internal.v
    public void sendKeyEvent(@NotNull KeyEvent keyEvent) {
        BaseInputConnection baseInputConnection = this.f20195d;
        if (baseInputConnection == null) {
            baseInputConnection = new BaseInputConnection(k(), false);
            this.f20195d = baseInputConnection;
        }
        baseInputConnection.sendKeyEvent(keyEvent);
    }
}
