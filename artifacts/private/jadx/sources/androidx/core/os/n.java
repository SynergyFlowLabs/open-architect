package androidx.core.os;

import android.os.Bundle;
import androidx.annotation.b1;
import androidx.annotation.w0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@w0(api = 35)
public final class n extends n0<n> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Bundle f48066c = new Bundle();

    @Override // androidx.core.os.n0
    @b1({b1.a.SUBCLASSES})
    @NotNull
    protected Bundle b() {
        return this.f48066c;
    }

    @Override // androidx.core.os.n0
    @b1({b1.a.SUBCLASSES})
    protected int c() {
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.core.os.n0
    @b1({b1.a.SUBCLASSES})
    @NotNull
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public n d() {
        return this;
    }

    @NotNull
    public final n h(int i10) {
        this.f48066c.putInt("KEY_SIZE_KB", i10);
        return this;
    }
}
