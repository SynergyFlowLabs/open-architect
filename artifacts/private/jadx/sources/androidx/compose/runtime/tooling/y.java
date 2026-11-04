package androidx.compose.runtime.tooling;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 1)
@e
public final class y {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f36706d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f36707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f36708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f36709c;

    public y(int i10, @Nullable String str, @Nullable String str2) {
        this.f36707a = i10;
        this.f36708b = str;
        this.f36709c = str2;
    }

    @Nullable
    public final String a() {
        return this.f36709c;
    }

    @Nullable
    public final String b() {
        return this.f36708b;
    }

    public final int c() {
        return this.f36707a;
    }

    public /* synthetic */ y(int i10, String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2);
    }
}
