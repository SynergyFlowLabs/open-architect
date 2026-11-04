package androidx.compose.ui.draganddrop;

import android.content.ClipData;
import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
public final class k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f37212d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ClipData f37213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Object f37214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f37215c;

    public k(@NotNull ClipData clipData, @Nullable Object obj, int i10) {
        this.f37213a = clipData;
        this.f37214b = obj;
        this.f37215c = i10;
    }

    @NotNull
    public final ClipData a() {
        return this.f37213a;
    }

    public final int b() {
        return this.f37215c;
    }

    @Nullable
    public final Object c() {
        return this.f37214b;
    }

    public /* synthetic */ k(ClipData clipData, Object obj, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(clipData, (i11 & 2) != 0 ? null : obj, (i11 & 4) != 0 ? 0 : i10);
    }
}
