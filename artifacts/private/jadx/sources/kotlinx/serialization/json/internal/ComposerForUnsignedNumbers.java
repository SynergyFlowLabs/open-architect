package kotlinx.serialization.json.internal;

import kotlin.e2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.q1;
import kotlin.u1;
import kotlin.y1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SuppressAnimalSniffer
public final class ComposerForUnsignedNumbers extends Composer {
    private final boolean forceQuoting;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposerForUnsignedNumbers(@NotNull InternalJsonWriter writer, boolean z10) {
        super(writer);
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.forceQuoting = z10;
    }

    @Override // kotlinx.serialization.json.internal.Composer
    public void print(int i10) {
        boolean z10 = this.forceQuoting;
        String unsignedString = Integer.toUnsignedString(u1.n(i10));
        if (z10) {
            printQuoted(unsignedString);
        } else {
            print(unsignedString);
        }
    }

    @Override // kotlinx.serialization.json.internal.Composer
    public void print(long j10) {
        boolean z10 = this.forceQuoting;
        String unsignedString = Long.toUnsignedString(y1.n(j10));
        if (z10) {
            printQuoted(unsignedString);
        } else {
            print(unsignedString);
        }
    }

    @Override // kotlinx.serialization.json.internal.Composer
    public void print(byte b10) {
        boolean z10 = this.forceQuoting;
        String strS0 = q1.s0(q1.n(b10));
        if (z10) {
            printQuoted(strS0);
        } else {
            print(strS0);
        }
    }

    @Override // kotlinx.serialization.json.internal.Composer
    public void print(short s10) {
        boolean z10 = this.forceQuoting;
        String strS0 = e2.s0(e2.n(s10));
        if (z10) {
            printQuoted(strS0);
        } else {
            print(strS0);
        }
    }
}
