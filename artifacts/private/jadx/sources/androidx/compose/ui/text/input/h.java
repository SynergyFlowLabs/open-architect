package androidx.compose.ui.text.input;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nEditCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditCommand.kt\nandroidx/compose/ui/text/input/DeleteSurroundingTextCommand\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n+ 3 MathUtils.kt\nandroidx/compose/ui/text/input/MathUtilsKt\n*L\n1#1,558:1\n118#2,4:559\n28#3,3:563\n38#3,4:566\n*S KotlinDebug\n*F\n+ 1 EditCommand.kt\nandroidx/compose/ui/text/input/DeleteSurroundingTextCommand\n*L\n250#1:559,4\n259#1:563,3\n264#1:566,4\n*E\n"})
public final class h implements j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f41886c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f41887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f41888b;

    public h(int i10, int i11) {
        this.f41887a = i10;
        this.f41888b = i11;
        if (i10 >= 0 && i11 >= 0) {
            return;
        }
        x0.a.e("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i10 + " and " + i11 + " respectively.");
    }

    @Override // androidx.compose.ui.text.input.j
    public void a(@NotNull n nVar) {
        int iK = nVar.k();
        int i10 = this.f41888b;
        int i11 = iK + i10;
        if (((iK ^ i11) & (i10 ^ i11)) < 0) {
            i11 = nVar.i();
        }
        nVar.c(nVar.k(), Math.min(i11, nVar.i()));
        int iL = nVar.l();
        int i12 = this.f41887a;
        int i13 = iL - i12;
        if (((i12 ^ iL) & (iL ^ i13)) < 0) {
            i13 = 0;
        }
        nVar.c(Math.max(0, i13), nVar.l());
    }

    public final int b() {
        return this.f41888b;
    }

    public final int c() {
        return this.f41887a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f41887a == hVar.f41887a && this.f41888b == hVar.f41888b;
    }

    public int hashCode() {
        return (this.f41887a * 31) + this.f41888b;
    }

    @NotNull
    public String toString() {
        return "DeleteSurroundingTextCommand(lengthBeforeCursor=" + this.f41887a + ", lengthAfterCursor=" + this.f41888b + ')';
    }
}
