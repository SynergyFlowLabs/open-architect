package we;

import android.view.View;
import androidx.compose.runtime.internal.w0;
import com.google.android.material.bottomsheet.AdvancedBottomSheetBehavior;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
public final class e extends AdvancedBottomSheetBehavior.e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f390580d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final View f390581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f390582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final int[] f390583c;

    public e(@NotNull View viewToUpdate, int i10) {
        Intrinsics.checkNotNullParameter(viewToUpdate, "viewToUpdate");
        this.f390581a = viewToUpdate;
        this.f390582b = i10;
        this.f390583c = new int[2];
    }

    @Override // com.google.android.material.bottomsheet.AdvancedBottomSheetBehavior.e
    public void b(@NotNull View bottomSheet, float f10) {
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        int[] iArr = this.f390583c;
        iArr[0] = 0;
        iArr[1] = 0;
        bottomSheet.getLocationOnScreen(iArr);
        if (f10 < 0.5d) {
            this.f390581a.setY(this.f390583c[1] - this.f390582b);
        }
    }

    @Override // com.google.android.material.bottomsheet.AdvancedBottomSheetBehavior.e
    public void c(@NotNull View bottomSheet, int i10) {
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
    }

    public final int d() {
        return this.f390582b;
    }
}
