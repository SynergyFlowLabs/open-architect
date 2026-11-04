package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ArrayAsSequence implements CharSequence {

    @NotNull
    private final char[] buffer;
    private int length;

    public ArrayAsSequence(@NotNull char[] buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.buffer = buffer;
        this.length = buffer.length;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i10) {
        return get(i10);
    }

    public char get(int i10) {
        return this.buffer[i10];
    }

    @NotNull
    public final char[] getBuffer$kotlinx_serialization_json() {
        return this.buffer;
    }

    public int getLength() {
        return this.length;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return getLength();
    }

    public void setLength(int i10) {
        this.length = i10;
    }

    @Override // java.lang.CharSequence
    @NotNull
    public CharSequence subSequence(int i10, int i11) {
        return StringsKt.x1(this.buffer, i10, Math.min(i11, length()));
    }

    @NotNull
    public final String substring(int i10, int i11) {
        return StringsKt.x1(this.buffer, i10, Math.min(i11, length()));
    }

    @Override // java.lang.CharSequence
    @NotNull
    public String toString() {
        return substring(0, length());
    }

    public final void trim(int i10) {
        setLength(Math.min(this.buffer.length, i10));
    }
}
