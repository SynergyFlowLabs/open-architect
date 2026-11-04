package androidx.compose.ui.node;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@oj.g
@SourceDebugExtension({"SMAP\nMyersDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyersDiff.kt\nandroidx/compose/ui/node/Snake\n+ 2 MyersDiff.kt\nandroidx/compose/ui/node/MyersDiffKt\n*L\n1#1,488:1\n297#1:489\n289#1:490\n301#1:491\n293#1:492\n301#1:493\n293#1,5:494\n289#1:499\n301#1:500\n293#1,5:501\n289#1:506\n289#1:507\n293#1:508\n308#1:509\n297#1:510\n289#1:511\n301#1:512\n293#1:513\n305#1:514\n305#1:516\n297#1:518\n289#1:519\n289#1,17:520\n354#2:515\n354#2:517\n*S KotlinDebug\n*F\n+ 1 MyersDiff.kt\nandroidx/compose/ui/node/Snake\n*L\n308#1:489\n308#1:490\n308#1:491\n308#1:492\n311#1:493\n311#1:494,5\n311#1:499\n314#1:500\n314#1:501,5\n314#1:506\n339#1:507\n340#1:508\n342#1:509\n342#1:510\n342#1:511\n342#1:512\n342#1:513\n343#1:514\n344#1:516\n346#1:518\n346#1:519\n351#1:520,17\n343#1:515\n344#1:517\n*E\n"})
final class k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final int[] f39844a;

    private /* synthetic */ k2(int[] iArr) {
        this.f39844a = iArr;
    }

    public static final void a(int[] iArr, @NotNull z zVar) {
        int iMin;
        int i10 = iArr[0];
        int i11 = iArr[1];
        if (j(iArr)) {
            iMin = Math.min(iArr[2] - iArr[0], iArr[3] - iArr[1]);
            i10 += ((iArr[4] != 0 ? 1 : 0) | (o(iArr) ? 1 : 0)) ^ 1;
            i11 += ((!o(iArr) ? 1 : 0) | (iArr[4] != 0 ? 1 : 0)) ^ 1;
        } else {
            iMin = iArr[2] - iArr[0];
        }
        zVar.g(i10, i11, iMin);
    }

    public static final /* synthetic */ k2 b(int[] iArr) {
        return new k2(iArr);
    }

    @NotNull
    public static int[] c(@NotNull int[] iArr) {
        return iArr;
    }

    public static boolean d(int[] iArr, Object obj) {
        return (obj instanceof k2) && Intrinsics.areEqual(iArr, ((k2) obj).q());
    }

    public static final boolean e(int[] iArr, int[] iArr2) {
        return Intrinsics.areEqual(iArr, iArr2);
    }

    public static final int g(int[] iArr) {
        return Math.min(iArr[2] - iArr[0], iArr[3] - iArr[1]);
    }

    public static final int h(int[] iArr) {
        return iArr[2];
    }

    public static final int i(int[] iArr) {
        return iArr[3];
    }

    private static final boolean j(int[] iArr) {
        return iArr[3] - iArr[1] != iArr[2] - iArr[0];
    }

    public static final boolean k(int[] iArr) {
        return iArr[4] != 0;
    }

    public static final int l(int[] iArr) {
        return iArr[0];
    }

    public static final int m(int[] iArr) {
        return iArr[1];
    }

    public static int n(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    private static final boolean o(int[] iArr) {
        return iArr[3] - iArr[1] > iArr[2] - iArr[0];
    }

    @NotNull
    public static String p(int[] iArr) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Snake(");
        sb2.append(iArr[0]);
        sb2.append(AbstractJsonLexerKt.COMMA);
        sb2.append(iArr[1]);
        sb2.append(AbstractJsonLexerKt.COMMA);
        sb2.append(iArr[2]);
        sb2.append(AbstractJsonLexerKt.COMMA);
        sb2.append(iArr[3]);
        sb2.append(AbstractJsonLexerKt.COMMA);
        int i10 = 7 << 4;
        sb2.append(iArr[4] != 0);
        sb2.append(')');
        return sb2.toString();
    }

    public boolean equals(Object obj) {
        return d(this.f39844a, obj);
    }

    @NotNull
    public final int[] f() {
        return this.f39844a;
    }

    public int hashCode() {
        return n(this.f39844a);
    }

    public final /* synthetic */ int[] q() {
        return this.f39844a;
    }

    @NotNull
    public String toString() {
        return p(this.f39844a);
    }
}
