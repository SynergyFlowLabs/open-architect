package androidx.compose.ui.text.input;

import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
class f0 implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<e0, Unit> f41879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private InputConnection f41880b;

    /* JADX WARN: Multi-variable type inference failed */
    public f0(@NotNull InputConnection inputConnection, @NotNull Function1<? super e0, Unit> function1) {
        this.f41879a = function1;
        this.f41880b = inputConnection;
    }

    @Override // androidx.compose.ui.text.input.e0
    public final void a() {
        InputConnection inputConnection = this.f41880b;
        if (inputConnection != null) {
            b(inputConnection);
            this.f41880b = null;
        }
    }

    protected void b(@NotNull InputConnection inputConnection) {
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        InputConnection inputConnection = this.f41880b;
        if (inputConnection != null) {
            return inputConnection.beginBatchEdit();
        }
        return false;
    }

    @Nullable
    protected final InputConnection c() {
        return this.f41880b;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i10) {
        InputConnection inputConnection = this.f41880b;
        if (inputConnection != null) {
            return inputConnection.clearMetaKeyStates(i10);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        if (this.f41880b != null) {
            a();
            this.f41879a.invoke(this);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(@Nullable CompletionInfo completionInfo) {
        InputConnection inputConnection = this.f41880b;
        if (inputConnection != null) {
            return inputConnection.commitCompletion(completionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(@NotNull InputContentInfo inputContentInfo, int i10, @Nullable Bundle bundle) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(@Nullable CorrectionInfo correctionInfo) {
        InputConnection inputConnection = this.f41880b;
        if (inputConnection != null) {
            return inputConnection.commitCorrection(correctionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(@Nullable CharSequence charSequence, int i10) {
        InputConnection inputConnection = this.f41880b;
        if (inputConnection != null) {
            return inputConnection.commitText(charSequence, i10);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i10, int i11) {
        InputConnection inputConnection = this.f41880b;
        if (inputConnection != null) {
            return inputConnection.deleteSurroundingText(i10, i11);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        InputConnection inputConnection = this.f41880b;
        if (inputConnection != null) {
            return inputConnection.endBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        InputConnection inputConnection = this.f41880b;
        if (inputConnection != null) {
            return inputConnection.finishComposingText();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int i10) {
        InputConnection inputConnection = this.f41880b;
        if (inputConnection != null) {
            return inputConnection.getCursorCapsMode(i10);
        }
        return 0;
    }

    @Override // android.view.inputmethod.InputConnection
    @Nullable
    public ExtractedText getExtractedText(@Nullable ExtractedTextRequest extractedTextRequest, int i10) {
        InputConnection inputConnection = this.f41880b;
        if (inputConnection != null) {
            return inputConnection.getExtractedText(extractedTextRequest, i10);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    @Nullable
    public Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    @Nullable
    public CharSequence getSelectedText(int i10) {
        InputConnection inputConnection = this.f41880b;
        if (inputConnection != null) {
            return inputConnection.getSelectedText(i10);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    @Nullable
    public CharSequence getTextAfterCursor(int i10, int i11) {
        InputConnection inputConnection = this.f41880b;
        if (inputConnection != null) {
            return inputConnection.getTextAfterCursor(i10, i11);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    @Nullable
    public CharSequence getTextBeforeCursor(int i10, int i11) {
        InputConnection inputConnection = this.f41880b;
        if (inputConnection != null) {
            return inputConnection.getTextBeforeCursor(i10, i11);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i10) {
        InputConnection inputConnection = this.f41880b;
        if (inputConnection != null) {
            return inputConnection.performContextMenuAction(i10);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i10) {
        InputConnection inputConnection = this.f41880b;
        if (inputConnection != null) {
            return inputConnection.performEditorAction(i10);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(@Nullable String str, @Nullable Bundle bundle) {
        InputConnection inputConnection = this.f41880b;
        if (inputConnection != null) {
            return inputConnection.performPrivateCommand(str, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean z10) {
        InputConnection inputConnection = this.f41880b;
        if (inputConnection != null) {
            return inputConnection.reportFullscreenMode(z10);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int i10) {
        InputConnection inputConnection = this.f41880b;
        if (inputConnection != null) {
            return inputConnection.requestCursorUpdates(i10);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(@Nullable KeyEvent keyEvent) {
        InputConnection inputConnection = this.f41880b;
        if (inputConnection != null) {
            return inputConnection.sendKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i10, int i11) {
        InputConnection inputConnection = this.f41880b;
        if (inputConnection != null) {
            return inputConnection.setComposingRegion(i10, i11);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(@Nullable CharSequence charSequence, int i10) {
        InputConnection inputConnection = this.f41880b;
        if (inputConnection != null) {
            return inputConnection.setComposingText(charSequence, i10);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int i10, int i11) {
        InputConnection inputConnection = this.f41880b;
        if (inputConnection != null) {
            return inputConnection.setSelection(i10, i11);
        }
        return false;
    }
}
