package app.rive.runtime.kotlin.core;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public class SMIInput extends NativeObject {
    public SMIInput(long j10) {
        super(j10);
    }

    private final native boolean cppIsBoolean(long j10);

    private final native boolean cppIsNumber(long j10);

    private final native boolean cppIsTrigger(long j10);

    private final native String cppName(long j10);

    @NotNull
    public final String getName() {
        return cppName(getCppPointer());
    }

    public final boolean isBoolean() {
        return cppIsBoolean(getCppPointer());
    }

    public final boolean isNumber() {
        return cppIsNumber(getCppPointer());
    }

    public final boolean isTrigger() {
        return cppIsTrigger(getCppPointer());
    }

    @NotNull
    public String toString() {
        return "SMIInput " + getName() + '\n';
    }
}
