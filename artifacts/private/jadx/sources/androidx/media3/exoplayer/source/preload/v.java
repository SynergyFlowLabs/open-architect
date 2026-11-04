package androidx.media3.exoplayer.source.preload;

import androidx.annotation.p0;
import androidx.media3.common.k0;
import androidx.media3.common.util.b1;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class v extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k0 f65383a;

    public v(k0 k0Var, @p0 String str, @p0 Throwable th2) {
        super(str, th2);
        this.f65383a = k0Var;
    }

    public boolean a(@p0 v vVar) {
        if (this == vVar) {
            return true;
        }
        if (vVar != null) {
            Throwable cause = getCause();
            Throwable cause2 = vVar.getCause();
            if (cause == null || cause2 == null) {
                if (cause == null && cause2 == null) {
                }
            } else {
                if (!Objects.equals(cause.getMessage(), cause2.getMessage())) {
                    return false;
                }
                if (!cause.getClass().equals(cause2.getClass())) {
                    return false;
                }
            }
            if (Objects.equals(this.f65383a, vVar.f65383a) && Objects.equals(getMessage(), vVar.getMessage())) {
                return true;
            }
        }
        return false;
    }
}
