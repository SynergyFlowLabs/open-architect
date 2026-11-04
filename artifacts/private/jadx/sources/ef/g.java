package ef;

import androidx.compose.runtime.internal.w0;
import androidx.core.view.g3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 1)
public final class g extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f274877d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f274878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final Integer f274879c;

    /* JADX WARN: Multi-variable type inference failed */
    public g() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    @Override // ef.c
    @Nullable
    public Integer c(@NotNull g3 insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        return this.f274879c;
    }

    @Override // ef.c
    @NotNull
    public Integer e(@NotNull g3 insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        return Integer.valueOf(this.f274878b + insets.f(g3.m.h()).f47824b);
    }

    public /* synthetic */ g(int i10, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10, (i11 & 2) != 0 ? null : num);
    }

    public g(int i10, @Nullable Integer num) {
        this.f274878b = i10;
        this.f274879c = num;
    }

    public g(int i10) {
        this(i10, null);
    }

    public /* synthetic */ g(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10);
    }
}
