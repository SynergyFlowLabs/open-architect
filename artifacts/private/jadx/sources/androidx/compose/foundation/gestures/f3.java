package androidx.compose.foundation.gestures;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class f3 extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f14563a = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public f3() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public f3(@Nullable String str) {
        super(str);
    }

    public /* synthetic */ f3(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str);
    }
}
