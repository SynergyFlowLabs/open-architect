package androidx.compose.runtime.changelist;

import androidx.compose.runtime.internal.w0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 1)
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f35546a = 0;

    public static /* synthetic */ String b(l lVar, String str, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toDebugString");
        }
        if ((i10 & 1) != 0) {
            str = "  ";
        }
        return lVar.a(str);
    }

    @NotNull
    public abstract String a(@NotNull String str);
}
