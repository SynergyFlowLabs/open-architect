package w;

import android.net.Uri;
import android.os.Bundle;
import androidx.compose.foundation.b2;
import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
@b2
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f385801c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Uri f385802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Bundle f385803b;

    public b(@Nullable Uri uri, @NotNull Bundle bundle) {
        this.f385802a = uri;
        this.f385803b = bundle;
    }

    @NotNull
    public final Bundle a() {
        return this.f385803b;
    }

    @Nullable
    public final Uri b() {
        return this.f385802a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f385802a, bVar.f385802a) && Intrinsics.areEqual(this.f385803b, bVar.f385803b);
    }

    public int hashCode() {
        Uri uri = this.f385802a;
        return ((uri != null ? uri.hashCode() : 0) * 31) + this.f385803b.hashCode();
    }

    @NotNull
    public String toString() {
        return "PlatformTransferableContent(linkUri=" + this.f385802a + ", extras=" + this.f385803b + ')';
    }
}
