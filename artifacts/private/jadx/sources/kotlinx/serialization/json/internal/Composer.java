package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.Intrinsics;
import oj.f;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class Composer {

    @f
    @NotNull
    public final InternalJsonWriter writer;
    private boolean writingFirst;

    public Composer(@NotNull InternalJsonWriter writer) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.writer = writer;
        this.writingFirst = true;
    }

    public final boolean getWritingFirst() {
        return this.writingFirst;
    }

    public void indent() {
        this.writingFirst = true;
    }

    public void nextItem() {
        this.writingFirst = false;
    }

    public void nextItemIfNotFirst() {
        this.writingFirst = false;
    }

    public final void print(char c10) {
        this.writer.writeChar(c10);
    }

    public void printQuoted(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.writer.writeQuoted(value);
    }

    protected final void setWritingFirst(boolean z10) {
        this.writingFirst = z10;
    }

    public void space() {
    }

    public void unIndent() {
    }

    public final void print(@NotNull String v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        this.writer.write(v10);
    }

    public void print(float f10) {
        this.writer.write(String.valueOf(f10));
    }

    public void print(double d10) {
        this.writer.write(String.valueOf(d10));
    }

    public void print(byte b10) {
        this.writer.writeLong(b10);
    }

    public void print(short s10) {
        this.writer.writeLong(s10);
    }

    public void print(int i10) {
        this.writer.writeLong(i10);
    }

    public void print(long j10) {
        this.writer.writeLong(j10);
    }

    public void print(boolean z10) {
        this.writer.write(String.valueOf(z10));
    }
}
