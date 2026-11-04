package ef;

import androidx.compose.runtime.internal.w0;
import androidx.core.view.g3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 1)
public final class f extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f274874d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f274875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final Integer f274876c;

    /* JADX WARN: Multi-variable type inference failed */
    public f() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    @Override // ef.c
    @NotNull
    public Integer a(@NotNull g3 insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        return Integer.valueOf(this.f274875b + insets.f(g3.m.g()).f47826d);
    }

    @Override // ef.c
    @Nullable
    public Integer c(@NotNull g3 insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        return this.f274876c;
    }

    public /* synthetic */ f(int i10, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10, (i11 & 2) != 0 ? null : num);
    }

    public f(int i10, @Nullable Integer num) {
        this.f274875b = i10;
        this.f274876c = num;
    }
}
