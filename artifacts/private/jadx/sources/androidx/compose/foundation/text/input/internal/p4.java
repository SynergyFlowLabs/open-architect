package androidx.compose.foundation.text.input.internal;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Parcelable;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nStatelessInputConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StatelessInputConnection.android.kt\nandroidx/compose/foundation/text/input/internal/StatelessInputConnection\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,660:1\n1107#2:661\n1085#2,2:662\n*S KotlinDebug\n*F\n+ 1 StatelessInputConnection.android.kt\nandroidx/compose/foundation/text/input/internal/StatelessInputConnection\n*L\n112#1:661\n112#1:662,2\n*E\n"})
public final class p4 implements InputConnection {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f19737f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final o6 f19738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f19739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.collection.d<Function1<f3, Unit>> f19740c = new androidx.compose.runtime.collection.d<>(new Function1[16], 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final b f19741d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final InputConnection f19742e;

    public static final class a implements androidx.core.view.inputmethod.c.d {
        a() {
        }

        @Override // androidx.core.view.inputmethod.c.d
        public boolean a(androidx.core.view.inputmethod.d dVar, int i10, Bundle bundle) {
            if ((i10 & 1) != 0) {
                try {
                    dVar.e();
                    Object objF = dVar.f();
                    Intrinsics.checkNotNull(objF, "null cannot be cast to non-null type android.os.Parcelable");
                    Parcelable parcelable = (Parcelable) objF;
                    bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                    bundle.putParcelable("EXTRA_INPUT_CONTENT_INFO", parcelable);
                } catch (Exception e10) {
                    p4.this.h("Can't insert content from IME; requestPermission() failed, " + e10);
                    return false;
                }
            }
            return p4.this.f19738a.c(q4.i(dVar, bundle));
        }
    }

    public static final class b extends InputConnectionWrapper {
        b(p4 p4Var) {
            super(p4Var, false);
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
            return false;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean performPrivateCommand(String str, Bundle bundle) {
            return true;
        }
    }

    public p4(@NotNull o6 o6Var, @NotNull EditorInfo editorInfo) {
        this.f19738a = o6Var;
        b bVar = new b(this);
        this.f19741d = bVar;
        this.f19742e = androidx.core.view.inputmethod.c.e(bVar, editorInfo, new a());
    }

    private final boolean d() {
        return this.f19738a.beginBatchEdit();
    }

    private final boolean e() {
        return this.f19738a.endBatchEdit();
    }

    private static /* synthetic */ void f() {
    }

    private final androidx.compose.foundation.text.input.l g() {
        return this.f19738a.getText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(String str) {
    }

    private final void i(int i10) {
        sendKeyEvent(new KeyEvent(0, i10));
        int i11 = 4 >> 1;
        sendKeyEvent(new KeyEvent(1, i10));
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        h("beginBatchEdit()");
        return d();
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i10) {
        h("clearMetaKeyStates(" + i10 + ')');
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public void closeConnection() {
        h("closeConnection()");
        this.f19740c.r();
        this.f19739b = 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(@Nullable CompletionInfo completionInfo) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("commitCompletion(");
        sb2.append((Object) (completionInfo != null ? completionInfo.getText() : null));
        sb2.append(')');
        h(sb2.toString());
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(@NotNull InputContentInfo inputContentInfo, int i10, @Nullable Bundle bundle) {
        h("commitContent(" + inputContentInfo + ", " + i10 + ", " + bundle + ')');
        return j.f19632a.a(this.f19742e, inputContentInfo, i10, bundle);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(@Nullable CorrectionInfo correctionInfo) {
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(@Nullable CharSequence charSequence, int i10) {
        h("commitText(\"" + ((Object) charSequence) + "\", " + i10 + ')');
        if (charSequence == null) {
            return true;
        }
        n3.h(this.f19738a, charSequence.toString(), i10);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i10, int i11) {
        h("deleteSurroundingText(" + i10 + ", " + i11 + ')');
        n3.j(this.f19738a, i10, i11);
        boolean z10 = false | true;
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        h("deleteSurroundingTextInCodePoints(" + i10 + ", " + i11 + ')');
        n3.l(this.f19738a, i10, i11);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        h("endBatchEdit()");
        return e();
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        h("finishComposingText()");
        n3.n(this.f19738a);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int i10) {
        h("getCursorCapsMode(" + i10 + ')');
        return TextUtils.getCapsMode(g(), androidx.compose.ui.text.w3.l(g().h()), i10);
    }

    @Override // android.view.inputmethod.InputConnection
    @NotNull
    public ExtractedText getExtractedText(@Nullable ExtractedTextRequest extractedTextRequest, int i10) {
        h("getExtractedText(" + extractedTextRequest + ", " + i10 + ')');
        return q4.f(g());
    }

    @Override // android.view.inputmethod.InputConnection
    @Nullable
    public Handler getHandler() {
        h("getHandler()");
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    @Nullable
    public CharSequence getSelectedText(int i10) {
        String string = androidx.compose.ui.text.w3.h(g().h()) ? null : androidx.compose.foundation.text.input.m.a(g()).toString();
        h("getSelectedText(" + i10 + "): " + ((Object) string));
        return string;
    }

    @Override // android.view.inputmethod.InputConnection
    @NotNull
    public CharSequence getTextAfterCursor(int i10, int i11) {
        String string = androidx.compose.foundation.text.input.m.b(g(), i10).toString();
        h("getTextAfterCursor(" + i10 + ", " + i11 + "): " + string);
        return string;
    }

    @Override // android.view.inputmethod.InputConnection
    @NotNull
    public CharSequence getTextBeforeCursor(int i10, int i11) {
        String string = androidx.compose.foundation.text.input.m.c(g(), i10).toString();
        h("getTextBeforeCursor(" + i10 + ", " + i11 + "): " + string);
        return string;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i10) {
        h("performContextMenuAction(" + i10 + ')');
        switch (i10) {
            case R.id.selectAll:
                n3.x(this.f19738a, 0, g().length());
                return false;
            case R.id.cut:
                i(277);
                return false;
            case R.id.copy:
                i(278);
                return false;
            case R.id.paste:
                i(279);
                return false;
            default:
                return false;
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i10) {
        int iA;
        h("performEditorAction(" + i10 + ')');
        if (i10 != 0) {
            switch (i10) {
                case 2:
                    iA = androidx.compose.ui.text.input.t.f41944b.e();
                    break;
                case 3:
                    iA = androidx.compose.ui.text.input.t.f41944b.m();
                    break;
                case 4:
                    iA = androidx.compose.ui.text.input.t.f41944b.o();
                    break;
                case 5:
                    iA = androidx.compose.ui.text.input.t.f41944b.g();
                    break;
                case 6:
                    iA = androidx.compose.ui.text.input.t.f41944b.c();
                    break;
                case 7:
                    iA = androidx.compose.ui.text.input.t.f41944b.k();
                    break;
                default:
                    h("IME sent an unrecognized editor action: " + i10);
                    iA = androidx.compose.ui.text.input.t.f41944b.a();
                    break;
            }
        } else {
            iA = androidx.compose.ui.text.input.t.f41944b.a();
        }
        this.f19738a.a(iA);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public void performHandwritingGesture(@NotNull HandwritingGesture handwritingGesture, @Nullable Executor executor, @Nullable IntConsumer intConsumer) {
        h("performHandwritingGesture(" + handwritingGesture + ", " + executor + ", " + intConsumer + ')');
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        n.f19711a.b(this.f19738a, handwritingGesture, executor, intConsumer);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(@Nullable String str, @Nullable Bundle bundle) {
        h("performPrivateCommand(" + str + ", " + bundle + ')');
        return this.f19742e.performPrivateCommand(str, bundle);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean previewHandwritingGesture(@NotNull PreviewableHandwritingGesture previewableHandwritingGesture, @Nullable CancellationSignal cancellationSignal) {
        h("previewHandwritingGesture(" + previewableHandwritingGesture + ", " + cancellationSignal + ')');
        if (Build.VERSION.SDK_INT < 34) {
            return false;
        }
        return n.f19711a.d(this.f19738a, previewableHandwritingGesture, cancellationSignal);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean z10) {
        h("reportFullscreenMode(" + z10 + ')');
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int i10) {
        h("requestCursorUpdates(" + i10 + ')');
        this.f19738a.requestCursorUpdates(i10);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(@NotNull KeyEvent keyEvent) {
        h("sendKeyEvent(" + keyEvent + ')');
        this.f19738a.sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i10, int i11) {
        h("setComposingRegion(" + i10 + ", " + i11 + ')');
        n3.s(this.f19738a, i10, i11);
        int i12 = 6 >> 1;
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(@Nullable CharSequence charSequence, int i10) {
        h("setComposingText(\"" + ((Object) charSequence) + "\", " + i10 + ')');
        if (charSequence == null) {
            return true;
        }
        o6 o6Var = this.f19738a;
        String string = charSequence.toString();
        Spanned spanned = charSequence instanceof Spanned ? (Spanned) charSequence : null;
        n3.u(o6Var, string, i10, spanned != null ? q4.e(spanned) : null);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int i10, int i11) {
        h("setSelection(" + i10 + ", " + i11 + ')');
        n3.x(this.f19738a, i10, i11);
        return true;
    }
}
