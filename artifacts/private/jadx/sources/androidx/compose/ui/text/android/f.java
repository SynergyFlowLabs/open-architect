package androidx.compose.ui.text.android;

import android.graphics.RectF;
import android.text.Layout;
import android.text.SegmentFinder;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@androidx.annotation.w0(34)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f f41370a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f41371b = 0;

    private f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(Function2 function2, RectF rectF, RectF rectF2) {
        return ((Boolean) function2.invoke(rectF, rectF2)).booleanValue();
    }

    @Nullable
    public final int[] c(@NotNull f1 f1Var, @NotNull RectF rectF, int i10, @NotNull final Function2<? super RectF, ? super RectF, Boolean> function2) {
        SegmentFinder segmentFinderA;
        if (i10 == 1) {
            segmentFinderA = androidx.compose.ui.text.android.selection.a.f41416a.a(new androidx.compose.ui.text.android.selection.i(f1Var.P(), f1Var.T()));
        } else {
            d.a();
            segmentFinderA = a.a(c.a(f1Var.P(), f1Var.Q()));
        }
        return f1Var.k().getRangeForRect(rectF, segmentFinderA, new Layout.TextInclusionStrategy() { // from class: androidx.compose.ui.text.android.e
            @Override // android.text.Layout.TextInclusionStrategy
            public final boolean isSegmentInside(RectF rectF2, RectF rectF3) {
                return f.b(function2, rectF2, rectF3);
            }
        });
    }
}
