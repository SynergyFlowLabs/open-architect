package androidx.compose.ui.text.input;

import android.view.Choreographer;
import android.view.inputmethod.EditorInfo;
import androidx.compose.ui.text.w3;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nTextInputServiceAndroid.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextInputServiceAndroid.android.kt\nandroidx/compose/ui/text/input/TextInputServiceAndroid_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,582:1\n1#2:583\n*E\n"})
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final String f41881a = "TextInputServiceAndroid";

    @NotNull
    public static final Executor d(@NotNull final Choreographer choreographer) {
        return new Executor() { // from class: androidx.compose.ui.text.input.e1
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                f1.e(choreographer, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Choreographer choreographer, final Runnable runnable) {
        choreographer.postFrameCallback(new Choreographer.FrameCallback() { // from class: androidx.compose.ui.text.input.d1
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j10) {
                f1.f(runnable, j10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(Runnable runnable, long j10) {
        runnable.run();
    }

    private static final boolean g(int i10, int i11) {
        return (i10 & i11) == i11;
    }

    public static final void h(@NotNull EditorInfo editorInfo, @NotNull u uVar, @NotNull y0 y0Var) {
        String strA;
        int iK = uVar.k();
        t.a aVar = t.f41944b;
        int i10 = 6;
        if (t.m(iK, aVar.a())) {
            if (!uVar.n()) {
                i10 = 0;
            }
        } else if (t.m(iK, aVar.i())) {
            i10 = 1;
        } else if (t.m(iK, aVar.e())) {
            i10 = 2;
        } else if (t.m(iK, aVar.g())) {
            i10 = 5;
        } else if (t.m(iK, aVar.k())) {
            i10 = 7;
        } else if (t.m(iK, aVar.m())) {
            i10 = 3;
        } else if (t.m(iK, aVar.o())) {
            i10 = 4;
        } else if (!t.m(iK, aVar.c())) {
            throw new IllegalStateException("invalid ImeAction");
        }
        editorInfo.imeOptions = i10;
        p0 p0VarM = uVar.m();
        if (p0VarM != null && (strA = p0VarM.a()) != null) {
            editorInfo.privateImeOptions = strA;
        }
        int iL = uVar.l();
        b0.a aVar2 = b0.f41811b;
        if (b0.n(iL, aVar2.o())) {
            editorInfo.inputType = 1;
        } else if (b0.n(iL, aVar2.a())) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions |= Integer.MIN_VALUE;
        } else if (b0.n(iL, aVar2.g())) {
            editorInfo.inputType = 2;
        } else if (b0.n(iL, aVar2.m())) {
            editorInfo.inputType = 3;
        } else if (b0.n(iL, aVar2.s())) {
            editorInfo.inputType = 17;
        } else if (b0.n(iL, aVar2.e())) {
            editorInfo.inputType = 33;
        } else if (b0.n(iL, aVar2.k())) {
            editorInfo.inputType = 129;
        } else if (b0.n(iL, aVar2.i())) {
            editorInfo.inputType = 18;
        } else {
            if (!b0.n(iL, aVar2.c())) {
                throw new IllegalStateException("Invalid Keyboard Type");
            }
            editorInfo.inputType = 8194;
        }
        if (!uVar.n() && g(editorInfo.inputType, 1)) {
            editorInfo.inputType |= 131072;
            if (t.m(uVar.k(), aVar.a())) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if (g(editorInfo.inputType, 1)) {
            int i11 = uVar.i();
            a0.a aVar3 = a0.f41798b;
            if (a0.i(i11, aVar3.a())) {
                editorInfo.inputType |= 4096;
            } else if (a0.i(i11, aVar3.i())) {
                editorInfo.inputType |= 8192;
            } else if (a0.i(i11, aVar3.e())) {
                editorInfo.inputType |= 16384;
            }
            if (uVar.h()) {
                editorInfo.inputType |= 32768;
            }
        }
        editorInfo.initialSelStart = w3.n(y0Var.l());
        editorInfo.initialSelEnd = w3.i(y0Var.l());
        androidx.core.view.inputmethod.a.k(editorInfo, y0Var.m());
        editorInfo.imeOptions |= com.google.api.client.googleapis.media.a.f115410j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(EditorInfo editorInfo) {
        if (androidx.emoji2.text.f.q()) {
            androidx.emoji2.text.f.c().G(editorInfo);
        }
    }
}
