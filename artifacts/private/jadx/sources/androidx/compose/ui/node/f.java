package androidx.compose.ui.node;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@oj.g
final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final int[] f39736a;

    private /* synthetic */ f(int[] iArr) {
        this.f39736a = iArr;
    }

    public static final /* synthetic */ f a(int[] iArr) {
        return new f(iArr);
    }

    @NotNull
    public static int[] b(@NotNull int[] iArr) {
        return iArr;
    }

    public static boolean c(int[] iArr, Object obj) {
        if ((obj instanceof f) && Intrinsics.areEqual(iArr, ((f) obj).j())) {
            return true;
        }
        return false;
    }

    public static final boolean d(int[] iArr, int[] iArr2) {
        return Intrinsics.areEqual(iArr, iArr2);
    }

    public static final int e(int[] iArr, int i10) {
        return iArr[i10 + f(iArr)];
    }

    private static final int f(int[] iArr) {
        return iArr.length / 2;
    }

    public static int g(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    public static final void h(int[] iArr, int i10, int i11) {
        iArr[i10 + f(iArr)] = i11;
    }

    public static String i(int[] iArr) {
        return "CenteredArray(data=" + Arrays.toString(iArr) + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f39736a, obj);
    }

    public int hashCode() {
        return g(this.f39736a);
    }

    public final /* synthetic */ int[] j() {
        return this.f39736a;
    }

    public String toString() {
        return i(this.f39736a);
    }
}
