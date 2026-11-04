package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 1)
public final class l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f41137d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function0<Float> f41138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function0<Float> f41139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f41140c;

    public l(@NotNull Function0<Float> function0, @NotNull Function0<Float> function1, boolean z10) {
        this.f41138a = function0;
        this.f41139b = function1;
        this.f41140c = z10;
    }

    @NotNull
    public final Function0<Float> a() {
        return this.f41139b;
    }

    public final boolean b() {
        return this.f41140c;
    }

    @NotNull
    public final Function0<Float> c() {
        return this.f41138a;
    }

    @NotNull
    public String toString() {
        return "ScrollAxisRange(value=" + this.f41138a.invoke().floatValue() + ", maxValue=" + this.f41139b.invoke().floatValue() + ", reverseScrolling=" + this.f41140c + ')';
    }

    public /* synthetic */ l(Function0 function0, Function0 function1, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, function1, (i10 & 4) != 0 ? false : z10);
    }
}
