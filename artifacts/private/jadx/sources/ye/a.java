package ye;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.compose.runtime.internal.w0;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.github.danielnilsson9.colorpickerview.view.b;
import com.planner5d.library.databinding.o7;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oj.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
public final class a extends ConstraintLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f399780b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final o7 f399781a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public a(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @NotNull
    public final o7 getBinding() {
        return this.f399781a;
    }

    public final void setColor(int i10) {
        this.f399781a.f159467b.setColor(i10);
    }

    public final void setOnColorChangeListener(@NotNull b.InterfaceC0931b onColorChangeListener) {
        Intrinsics.checkNotNullParameter(onColorChangeListener, "onColorChangeListener");
        this.f399781a.f159467b.setOnColorChangedListener(onColorChangeListener);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public a(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
        int i10 = 7 & 0;
    }

    public /* synthetic */ a(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @j
    public a(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        o7 o7VarB = o7.b(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(o7VarB, "inflate(...)");
        this.f399781a = o7VarB;
    }
}
