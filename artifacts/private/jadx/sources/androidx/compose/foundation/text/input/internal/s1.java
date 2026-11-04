package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.EditorInfo;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nEditorInfo.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditorInfo.android.kt\nandroidx/compose/foundation/text/input/internal/EditorInfo_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,195:1\n1#2:196\n*E\n"})
public final class s1 {
    private static final boolean a(int i10, int i11) {
        return (i10 & i11) == i11;
    }

    public static final void b(@NotNull EditorInfo editorInfo, @NotNull CharSequence charSequence, long j10, @NotNull androidx.compose.ui.text.input.u uVar, @Nullable String[] strArr) {
        String strA;
        int iK = uVar.k();
        androidx.compose.ui.text.input.t.a aVar = androidx.compose.ui.text.input.t.f41944b;
        int i10 = 3;
        int i11 = 3 | 2;
        int i12 = 6;
        if (androidx.compose.ui.text.input.t.m(iK, aVar.a())) {
            if (!uVar.n()) {
                i12 = 0;
            }
        } else if (androidx.compose.ui.text.input.t.m(iK, aVar.i())) {
            i12 = 1;
        } else if (androidx.compose.ui.text.input.t.m(iK, aVar.e())) {
            i12 = 2;
        } else if (androidx.compose.ui.text.input.t.m(iK, aVar.g())) {
            i12 = 5;
        } else if (androidx.compose.ui.text.input.t.m(iK, aVar.k())) {
            i12 = 7;
        } else if (androidx.compose.ui.text.input.t.m(iK, aVar.m())) {
            i12 = 3;
        } else if (androidx.compose.ui.text.input.t.m(iK, aVar.o())) {
            i12 = 4;
        } else if (!androidx.compose.ui.text.input.t.m(iK, aVar.c())) {
            throw new IllegalStateException("invalid ImeAction");
        }
        editorInfo.imeOptions = i12;
        androidx.compose.ui.text.input.p0 p0VarM = uVar.m();
        if (p0VarM != null && (strA = p0VarM.a()) != null) {
            editorInfo.privateImeOptions = strA;
        }
        d4.f19534a.a(editorInfo, uVar.j());
        int iL = uVar.l();
        androidx.compose.ui.text.input.b0.a aVar2 = androidx.compose.ui.text.input.b0.f41811b;
        if (androidx.compose.ui.text.input.b0.n(iL, aVar2.o())) {
            i10 = 1;
        } else if (androidx.compose.ui.text.input.b0.n(iL, aVar2.a())) {
            editorInfo.imeOptions |= Integer.MIN_VALUE;
            i10 = 1;
        } else if (androidx.compose.ui.text.input.b0.n(iL, aVar2.g())) {
            i10 = 2;
        } else if (!androidx.compose.ui.text.input.b0.n(iL, aVar2.m())) {
            if (androidx.compose.ui.text.input.b0.n(iL, aVar2.s())) {
                i10 = 17;
            } else if (androidx.compose.ui.text.input.b0.n(iL, aVar2.e())) {
                i10 = 33;
            } else if (androidx.compose.ui.text.input.b0.n(iL, aVar2.k())) {
                i10 = 129;
            } else if (androidx.compose.ui.text.input.b0.n(iL, aVar2.i())) {
                i10 = 18;
            } else {
                if (!androidx.compose.ui.text.input.b0.n(iL, aVar2.c())) {
                    throw new IllegalStateException("Invalid Keyboard Type");
                }
                i10 = 8194;
            }
        }
        editorInfo.inputType = i10;
        if (!uVar.n() && a(editorInfo.inputType, 1)) {
            editorInfo.inputType |= 131072;
            if (androidx.compose.ui.text.input.t.m(uVar.k(), aVar.a())) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if (a(editorInfo.inputType, 1)) {
            int i13 = uVar.i();
            androidx.compose.ui.text.input.a0.a aVar3 = androidx.compose.ui.text.input.a0.f41798b;
            if (androidx.compose.ui.text.input.a0.i(i13, aVar3.a())) {
                editorInfo.inputType |= 4096;
            } else if (androidx.compose.ui.text.input.a0.i(i13, aVar3.i())) {
                editorInfo.inputType |= 8192;
            } else if (androidx.compose.ui.text.input.a0.i(i13, aVar3.e())) {
                editorInfo.inputType |= 16384;
            }
            if (uVar.h()) {
                editorInfo.inputType |= 32768;
            }
        }
        editorInfo.initialSelStart = androidx.compose.ui.text.w3.n(j10);
        editorInfo.initialSelEnd = androidx.compose.ui.text.w3.i(j10);
        androidx.core.view.inputmethod.a.k(editorInfo, charSequence);
        if (strArr != null) {
            androidx.core.view.inputmethod.a.i(editorInfo, strArr);
        }
        editorInfo.imeOptions |= com.google.api.client.googleapis.media.a.f115410j;
        if (!androidx.compose.foundation.text.handwriting.j.a() || androidx.compose.ui.text.input.b0.n(uVar.l(), aVar2.k()) || androidx.compose.ui.text.input.b0.n(uVar.l(), aVar2.i())) {
            androidx.core.view.inputmethod.a.l(editorInfo, false);
        } else {
            androidx.core.view.inputmethod.a.l(editorInfo, true);
            r1.f19777a.a(editorInfo);
        }
    }

    public static /* synthetic */ void c(EditorInfo editorInfo, CharSequence charSequence, long j10, androidx.compose.ui.text.input.u uVar, String[] strArr, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            strArr = null;
        }
        b(editorInfo, charSequence, j10, uVar, strArr);
    }
}
