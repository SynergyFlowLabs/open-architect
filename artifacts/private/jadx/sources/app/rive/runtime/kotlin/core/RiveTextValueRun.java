package app.rive.runtime.kotlin.core;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public class RiveTextValueRun extends NativeObject {
    public RiveTextValueRun(long j10) {
        super(j10);
    }

    private final native void cppSetText(long j10, String str);

    private final native String cppText(long j10);

    @NotNull
    public final String getText() {
        return cppText(getCppPointer());
    }

    public final void setText(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        cppSetText(getCppPointer(), name);
    }

    @NotNull
    public String toString() {
        return "TextValueRun: " + getText() + '\n';
    }
}
