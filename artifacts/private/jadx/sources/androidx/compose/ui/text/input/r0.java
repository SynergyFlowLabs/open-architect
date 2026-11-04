package androidx.compose.ui.text.input;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import androidx.compose.ui.text.w3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@kotlin.l(message = "Only exists to support the legacy TextInputService APIs. It is not used by any Compose code. A copy of this class in foundation is used by the legacy BasicTextField.")
@SourceDebugExtension({"SMAP\nRecordingInputConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecordingInputConnection.android.kt\nandroidx/compose/ui/text/input/RecordingInputConnection\n*L\n1#1,515:1\n87#1,5:516\n87#1,5:521\n87#1,5:526\n87#1,5:531\n87#1,5:536\n87#1,5:541\n87#1,5:546\n87#1,5:551\n87#1,5:556\n87#1,5:561\n87#1,5:566\n87#1,5:571\n87#1,5:576\n87#1,5:581\n87#1,5:586\n87#1,5:591\n87#1,5:596\n*S KotlinDebug\n*F\n+ 1 RecordingInputConnection.android.kt\nandroidx/compose/ui/text/input/RecordingInputConnection\n*L\n151#1:516,5\n193#1:521,5\n200#1:526,5\n208#1:531,5\n216#1:536,5\n227#1:541,5\n235#1:546,5\n243#1:551,5\n251#1:556,5\n296#1:561,5\n381#1:566,5\n409#1:571,5\n435#1:576,5\n448#1:581,5\n464#1:586,5\n491#1:591,5\n502#1:596,5\n*E\n"})
public final class r0 implements InputConnection {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f41932i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final v f41933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f41934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f41935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private y0 f41936d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f41937e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f41938f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final List<j> f41939g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f41940h = true;

    public r0(@NotNull y0 y0Var, @NotNull v vVar, boolean z10) {
        this.f41933a = vVar;
        this.f41934b = z10;
        this.f41936d = y0Var;
    }

    private final void b(j jVar) {
        c();
        try {
            this.f41939g.add(jVar);
        } finally {
            d();
        }
    }

    private final boolean c() {
        this.f41935c++;
        return true;
    }

    private final boolean d() {
        int i10 = this.f41935c - 1;
        this.f41935c = i10;
        if (i10 == 0 && !this.f41939g.isEmpty()) {
            this.f41933a.b(CollectionsKt.toMutableList((Collection) this.f41939g));
            this.f41939g.clear();
        }
        return this.f41935c > 0;
    }

    private final boolean e(Function0<Unit> function0) {
        boolean z10 = this.f41940h;
        if (z10) {
            function0.invoke();
        }
        return z10;
    }

    private final void i(String str) {
    }

    private final void j(int i10) {
        sendKeyEvent(new KeyEvent(0, i10));
        sendKeyEvent(new KeyEvent(1, i10));
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        boolean z10 = this.f41940h;
        return z10 ? c() : z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i10) {
        boolean z10 = this.f41940h;
        if (!z10) {
            return z10;
        }
        int i11 = 6 & 0;
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public void closeConnection() {
        this.f41939g.clear();
        int i10 = 0 << 0;
        this.f41935c = 0;
        this.f41940h = false;
        this.f41933a.e(this);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(@Nullable CompletionInfo completionInfo) {
        boolean z10 = this.f41940h;
        if (z10) {
            z10 = false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(@NotNull InputContentInfo inputContentInfo, int i10, @Nullable Bundle bundle) {
        boolean z10 = this.f41940h;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(@Nullable CorrectionInfo correctionInfo) {
        boolean z10 = this.f41940h;
        return z10 ? this.f41934b : z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(@Nullable CharSequence charSequence, int i10) {
        boolean z10 = this.f41940h;
        if (z10) {
            b(new b(String.valueOf(charSequence), i10));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i10, int i11) {
        boolean z10 = this.f41940h;
        if (!z10) {
            return z10;
        }
        b(new h(i10, i11));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        boolean z10 = this.f41940h;
        if (!z10) {
            return z10;
        }
        b(new i(i10, i11));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        return d();
    }

    public final boolean f() {
        return this.f41934b;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        boolean z10 = this.f41940h;
        if (!z10) {
            return z10;
        }
        b(new p());
        return true;
    }

    @NotNull
    public final v g() {
        return this.f41933a;
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int i10) {
        return TextUtils.getCapsMode(this.f41936d.m(), w3.l(this.f41936d.l()), i10);
    }

    @Override // android.view.inputmethod.InputConnection
    @NotNull
    public ExtractedText getExtractedText(@Nullable ExtractedTextRequest extractedTextRequest, int i10) {
        boolean z10 = (i10 & 1) != 0;
        this.f41938f = z10;
        if (z10) {
            this.f41937e = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return z.a(this.f41936d);
    }

    @Override // android.view.inputmethod.InputConnection
    @Nullable
    public Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    @Nullable
    public CharSequence getSelectedText(int i10) {
        if (w3.h(this.f41936d.l())) {
            return null;
        }
        return z0.a(this.f41936d).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    @NotNull
    public CharSequence getTextAfterCursor(int i10, int i11) {
        return z0.b(this.f41936d, i10).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    @NotNull
    public CharSequence getTextBeforeCursor(int i10, int i11) {
        return z0.c(this.f41936d, i10).toString();
    }

    @NotNull
    public final y0 h() {
        return this.f41936d;
    }

    public final void k(@NotNull y0 y0Var) {
        this.f41936d = y0Var;
    }

    public final void l(@NotNull y0 y0Var, @NotNull x xVar) {
        if (this.f41940h) {
            k(y0Var);
            if (this.f41938f) {
                xVar.e(this.f41937e, z.a(y0Var));
            }
            w3 w3VarK = y0Var.k();
            int iL = w3VarK != null ? w3.l(w3VarK.r()) : -1;
            w3 w3VarK2 = y0Var.k();
            xVar.a(w3.l(y0Var.l()), w3.k(y0Var.l()), iL, w3VarK2 != null ? w3.k(w3VarK2.r()) : -1);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i10) {
        boolean z10 = this.f41940h;
        if (z10) {
            z10 = false;
            switch (i10) {
                case R.id.selectAll:
                    b(new v0(0, this.f41936d.m().length()));
                    break;
                case R.id.cut:
                    j(277);
                    break;
                case R.id.copy:
                    j(278);
                    break;
                case R.id.paste:
                    j(279);
                    break;
                default:
                    break;
            }
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i10) {
        int iA;
        boolean z10 = this.f41940h;
        if (!z10) {
            return z10;
        }
        if (i10 != 0) {
            switch (i10) {
                case 2:
                    iA = t.f41944b.e();
                    break;
                case 3:
                    iA = t.f41944b.m();
                    break;
                case 4:
                    iA = t.f41944b.o();
                    break;
                case 5:
                    iA = t.f41944b.g();
                    break;
                case 6:
                    iA = t.f41944b.c();
                    break;
                case 7:
                    iA = t.f41944b.k();
                    break;
                default:
                    iA = t.f41944b.a();
                    break;
            }
        } else {
            iA = t.f41944b.a();
        }
        this.f41933a.a(iA);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(@Nullable String str, @Nullable Bundle bundle) {
        boolean z10 = this.f41940h;
        if (z10) {
            return true;
        }
        return z10;
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
        boolean z14 = this.f41940h;
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
        this.f41933a.d(z16, z17, z12, z13, z10, z11);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(@NotNull KeyEvent keyEvent) {
        boolean z10 = this.f41940h;
        if (!z10) {
            return z10;
        }
        this.f41933a.c(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i10, int i11) {
        boolean z10 = this.f41940h;
        if (z10) {
            b(new t0(i10, i11));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(@Nullable CharSequence charSequence, int i10) {
        boolean z10 = this.f41940h;
        if (z10) {
            b(new u0(String.valueOf(charSequence), i10));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int i10, int i11) {
        boolean z10 = this.f41940h;
        if (!z10) {
            return z10;
        }
        b(new v0(i10, i11));
        return true;
    }
}
