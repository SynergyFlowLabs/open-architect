package kotlinx.atomicfu;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public class n {
    @NotNull
    public String a(int i10, @NotNull Object event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return i10 + ": " + event;
    }
}
