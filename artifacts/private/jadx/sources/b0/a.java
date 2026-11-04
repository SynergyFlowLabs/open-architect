package b0;

import androidx.compose.runtime.internal.w0;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 1)
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f77478b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f77479a;

    public a(int i10) {
        this.f77479a = i10;
    }

    public final int a() {
        return this.f77479a;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof a) && this.f77479a == ((a) obj).f77479a;
    }

    public int hashCode() {
        return this.f77479a;
    }
}
