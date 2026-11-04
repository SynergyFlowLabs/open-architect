package androidx.compose.foundation.text.input.internal;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nRecordingInputConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecordingInputConnection.android.kt\nandroidx/compose/foundation/text/input/internal/RecordingInputConnection\n*L\n1#1,625:1\n110#1,5:626\n110#1,5:631\n110#1,5:636\n110#1,5:641\n110#1,5:646\n110#1,5:651\n110#1,5:656\n110#1,5:661\n110#1,5:666\n110#1,5:671\n110#1,5:676\n110#1,5:681\n110#1,5:686\n110#1,5:691\n110#1,5:696\n110#1,5:701\n110#1,5:706\n*S KotlinDebug\n*F\n+ 1 RecordingInputConnection.android.kt\nandroidx/compose/foundation/text/input/internal/RecordingInputConnection\n*L\n169#1:626,5\n210#1:631,5\n217#1:636,5\n225#1:641,5\n233#1:646,5\n244#1:651,5\n252#1:656,5\n260#1:661,5\n268#1:666,5\n312#1:671,5\n396#1:676,5\n424#1:681,5\n489#1:686,5\n502#1:691,5\n518#1:696,5\n545#1:701,5\n556#1:706,5\n*E\n"})
public final class l4 implements InputConnection {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f19688l = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final p3 f19689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f19690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final androidx.compose.foundation.text.g4 f19691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final androidx.compose.foundation.text.selection.u3 f19692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final androidx.compose.ui.platform.o4 f19693e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f19694f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.text.input.y0 f19695g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f19696h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f19697i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final List<androidx.compose.ui.text.input.j> f19698j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f19699k;

    public l4(@NotNull androidx.compose.ui.text.input.y0 y0Var, @NotNull p3 p3Var, boolean z10, @Nullable androidx.compose.foundation.text.g4 g4Var, @Nullable androidx.compose.foundation.text.selection.u3 u3Var, @Nullable androidx.compose.ui.platform.o4 o4Var) {
        this.f19689a = p3Var;
        this.f19690b = z10;
        this.f19691c = g4Var;
        this.f19692d = u3Var;
        this.f19693e = o4Var;
        this.f19695g = y0Var;
        this.f19698j = new ArrayList();
        this.f19699k = true;
    }

    private final void c(androidx.compose.ui.text.input.j jVar) {
        d();
        try {
            this.f19698j.add(jVar);
            e();
        } catch (Throwable th2) {
            e();
            throw th2;
        }
    }

    private final boolean d() {
        this.f19694f++;
        return true;
    }

    private final boolean e() {
        int i10 = this.f19694f - 1;
        this.f19694f = i10;
        if (i10 == 0 && !this.f19698j.isEmpty()) {
            this.f19689a.b(CollectionsKt.toMutableList((Collection) this.f19698j));
            this.f19698j.clear();
        }
        return this.f19694f > 0;
    }

    private final boolean f(Function0<Unit> function0) {
        boolean z10 = this.f19699k;
        if (z10) {
            function0.invoke();
        }
        return z10;
    }

    private final void m(String str) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(l4 l4Var, androidx.compose.ui.text.input.j jVar) {
        l4Var.c(jVar);
        return Unit.f312394a;
    }

    private final void o(int i10) {
        sendKeyEvent(new KeyEvent(0, i10));
        sendKeyEvent(new KeyEvent(1, i10));
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        boolean z10 = this.f19699k;
        return z10 ? d() : z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i10) {
        boolean z10 = this.f19699k;
        if (z10) {
            z10 = false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public void closeConnection() {
        this.f19698j.clear();
        this.f19694f = 0;
        this.f19699k = false;
        this.f19689a.e(this);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(@Nullable CompletionInfo completionInfo) {
        boolean z10 = this.f19699k;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(@NotNull InputContentInfo inputContentInfo, int i10, @Nullable Bundle bundle) {
        boolean z10 = this.f19699k;
        if (z10) {
            z10 = false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(@Nullable CorrectionInfo correctionInfo) {
        boolean z10 = this.f19699k;
        return z10 ? this.f19690b : z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(@Nullable CharSequence charSequence, int i10) {
        boolean z10 = this.f19699k;
        if (z10) {
            c(new androidx.compose.ui.text.input.b(String.valueOf(charSequence), i10));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i10, int i11) {
        boolean z10 = this.f19699k;
        if (!z10) {
            return z10;
        }
        c(new androidx.compose.ui.text.input.h(i10, i11));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        boolean z10 = this.f19699k;
        if (!z10) {
            return z10;
        }
        c(new androidx.compose.ui.text.input.i(i10, i11));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        return e();
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        boolean z10 = this.f19699k;
        if (!z10) {
            return z10;
        }
        c(new androidx.compose.ui.text.input.p());
        return true;
    }

    public final boolean g() {
        return this.f19690b;
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int i10) {
        return TextUtils.getCapsMode(this.f19695g.m(), androidx.compose.ui.text.w3.l(this.f19695g.l()), i10);
    }

    @Override // android.view.inputmethod.InputConnection
    @NotNull
    public ExtractedText getExtractedText(@Nullable ExtractedTextRequest extractedTextRequest, int i10) {
        boolean z10 = true | false;
        boolean z11 = (i10 & 1) != 0;
        this.f19697i = z11;
        if (z11) {
            this.f19696h = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return m4.b(this.f19695g);
    }

    @Override // android.view.inputmethod.InputConnection
    @Nullable
    public Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    @Nullable
    public CharSequence getSelectedText(int i10) {
        if (androidx.compose.ui.text.w3.h(this.f19695g.l())) {
            return null;
        }
        return androidx.compose.ui.text.input.z0.a(this.f19695g).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    @NotNull
    public CharSequence getTextAfterCursor(int i10, int i11) {
        return androidx.compose.ui.text.input.z0.b(this.f19695g, i10).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    @NotNull
    public CharSequence getTextBeforeCursor(int i10, int i11) {
        return androidx.compose.ui.text.input.z0.c(this.f19695g, i10).toString();
    }

    @NotNull
    public final p3 h() {
        return this.f19689a;
    }

    @Nullable
    public final androidx.compose.foundation.text.g4 i() {
        return this.f19691c;
    }

    @Nullable
    public final androidx.compose.foundation.text.selection.u3 j() {
        return this.f19692d;
    }

    @NotNull
    public final androidx.compose.ui.text.input.y0 k() {
        return this.f19695g;
    }

    @Nullable
    public final androidx.compose.ui.platform.o4 l() {
        return this.f19693e;
    }

    public final void p(@NotNull androidx.compose.ui.text.input.y0 y0Var) {
        this.f19695g = y0Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i10) {
        boolean z10 = this.f19699k;
        if (z10) {
            z10 = false;
            switch (i10) {
                case R.id.selectAll:
                    c(new androidx.compose.ui.text.input.v0(0, this.f19695g.m().length()));
                    break;
                case R.id.cut:
                    o(277);
                    break;
                case R.id.copy:
                    o(278);
                    break;
                case R.id.paste:
                    o(279);
                    break;
            }
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i10) {
        int iA;
        boolean z10 = this.f19699k;
        if (!z10) {
            return z10;
        }
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
                    iA = androidx.compose.ui.text.input.t.f41944b.a();
                    break;
            }
        } else {
            iA = androidx.compose.ui.text.input.t.f41944b.a();
        }
        this.f19689a.a(iA);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public void performHandwritingGesture(@NotNull HandwritingGesture handwritingGesture, @Nullable Executor executor, @Nullable IntConsumer intConsumer) {
        if (Build.VERSION.SDK_INT >= 34) {
            l.f19686a.b(this.f19691c, this.f19692d, handwritingGesture, this.f19693e, executor, intConsumer, new Function1() { // from class: androidx.compose.foundation.text.input.internal.k4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return l4.n(this.f19684a, (androidx.compose.ui.text.input.j) obj);
                }
            });
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(@Nullable String str, @Nullable Bundle bundle) {
        boolean z10 = this.f19699k;
        if (z10) {
            return true;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean previewHandwritingGesture(@NotNull PreviewableHandwritingGesture previewableHandwritingGesture, @Nullable CancellationSignal cancellationSignal) {
        if (Build.VERSION.SDK_INT >= 34) {
            return l.f19686a.d(this.f19691c, this.f19692d, previewableHandwritingGesture, cancellationSignal);
        }
        return false;
    }

    public final void q(@NotNull androidx.compose.ui.text.input.y0 y0Var, @NotNull q3 q3Var) {
        if (this.f19699k) {
            p(y0Var);
            if (this.f19697i) {
                q3Var.e(this.f19696h, m4.b(y0Var));
            }
            androidx.compose.ui.text.w3 w3VarK = y0Var.k();
            int iL = w3VarK != null ? androidx.compose.ui.text.w3.l(w3VarK.r()) : -1;
            androidx.compose.ui.text.w3 w3VarK2 = y0Var.k();
            q3Var.a(androidx.compose.ui.text.w3.l(y0Var.l()), androidx.compose.ui.text.w3.k(y0Var.l()), iL, w3VarK2 != null ? androidx.compose.ui.text.w3.k(w3VarK2.r()) : -1);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean z10) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14 = this.f19699k;
        if (!z14) {
            return z14;
        }
        boolean z15 = false;
        boolean z16 = (i10 & 1) != 0;
        boolean z17 = (i10 & 2) != 0;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33) {
            boolean z18 = (i10 & 16) != 0;
            boolean z19 = (i10 & 8) != 0;
            boolean z20 = (i10 & 4) != 0;
            if (i11 >= 34 && (i10 & 32) != 0) {
                z15 = true;
            }
            if (z18 || z19 || z20 || z15) {
                z11 = z15;
                z10 = z20;
                z13 = z19;
                z12 = z18;
            } else if (i11 >= 34) {
                z12 = true;
                z13 = true;
                z10 = true;
                z11 = true;
            } else {
                z11 = z15;
                z12 = true;
                z13 = true;
                z10 = true;
            }
        } else {
            z10 = false;
            z11 = false;
            z12 = true;
            z13 = true;
        }
        this.f19689a.d(z16, z17, z12, z13, z10, z11);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(@NotNull KeyEvent keyEvent) {
        boolean z10 = this.f19699k;
        if (!z10) {
            return z10;
        }
        this.f19689a.c(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i10, int i11) {
        boolean z10 = this.f19699k;
        if (z10) {
            c(new androidx.compose.ui.text.input.t0(i10, i11));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(@Nullable CharSequence charSequence, int i10) {
        boolean z10 = this.f19699k;
        if (z10) {
            c(new androidx.compose.ui.text.input.u0(String.valueOf(charSequence), i10));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int i10, int i11) {
        boolean z10 = this.f19699k;
        if (!z10) {
            return z10;
        }
        c(new androidx.compose.ui.text.input.v0(i10, i11));
        return true;
    }

    public /* synthetic */ l4(androidx.compose.ui.text.input.y0 y0Var, p3 p3Var, boolean z10, androidx.compose.foundation.text.g4 g4Var, androidx.compose.foundation.text.selection.u3 u3Var, androidx.compose.ui.platform.o4 o4Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(y0Var, p3Var, z10, (i10 & 8) != 0 ? null : g4Var, (i10 & 16) != 0 ? null : u3Var, (i10 & 32) != 0 ? null : o4Var);
    }
}
