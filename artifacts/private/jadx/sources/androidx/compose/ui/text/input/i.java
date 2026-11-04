package androidx.compose.ui.text.input;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nEditCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditCommand.kt\nandroidx/compose/ui/text/input/DeleteSurroundingTextInCodePointsCommand\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,558:1\n118#2,4:559\n*S KotlinDebug\n*F\n+ 1 EditCommand.kt\nandroidx/compose/ui/text/input/DeleteSurroundingTextInCodePointsCommand\n*L\n309#1:559,4\n*E\n"})
public final class i implements j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f41892c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f41893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f41894b;

    public i(int i10, int i11) {
        this.f41893a = i10;
        this.f41894b = i11;
        if (i10 >= 0 && i11 >= 0) {
            return;
        }
        x0.a.e("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i10 + " and " + i11 + " respectively.");
    }

    @Override // androidx.compose.ui.text.input.j
    public void a(@NotNull n nVar) {
        int i10 = this.f41893a;
        int iL = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = iL + 1;
            if (nVar.l() <= i12) {
                iL = nVar.l();
                break;
            }
            iL = k.b(nVar.d((nVar.l() - i12) + (-1)), nVar.d(nVar.l() - i12)) ? iL + 2 : i12;
        }
        int i13 = this.f41894b;
        int i14 = 0;
        for (int i15 = 0; i15 < i13; i15++) {
            int i16 = i14 + 1;
            if (nVar.k() + i16 >= nVar.i()) {
                i14 = nVar.i() - nVar.k();
                break;
            }
            i14 = k.b(nVar.d((nVar.k() + i16) + (-1)), nVar.d(nVar.k() + i16)) ? i14 + 2 : i16;
        }
        nVar.c(nVar.k(), nVar.k() + i14);
        nVar.c(nVar.l() - iL, nVar.l());
    }

    public final int b() {
        return this.f41894b;
    }

    public final int c() {
        return this.f41893a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f41893a == iVar.f41893a && this.f41894b == iVar.f41894b;
    }

    public int hashCode() {
        return (this.f41893a * 31) + this.f41894b;
    }

    @NotNull
    public String toString() {
        return "DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=" + this.f41893a + ", lengthAfterCursor=" + this.f41894b + ')';
    }
}
