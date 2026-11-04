package androidx.compose.ui.text.android;

import android.text.Layout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final d1 f41362a = new d1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Layout.Alignment f41363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final Layout.Alignment f41364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f41365d = 0;

    static {
        Layout.Alignment[] alignmentArrValues = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : alignmentArrValues) {
            if (Intrinsics.areEqual(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (Intrinsics.areEqual(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        f41363b = alignment;
        f41364c = alignment2;
    }

    private d1() {
    }

    @NotNull
    public final Layout.Alignment a(int i10) {
        if (i10 == 0) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        if (i10 == 1) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        if (i10 == 2) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        if (i10 != 3) {
            return i10 != 4 ? Layout.Alignment.ALIGN_NORMAL : f41364c;
        }
        return f41363b;
    }
}
