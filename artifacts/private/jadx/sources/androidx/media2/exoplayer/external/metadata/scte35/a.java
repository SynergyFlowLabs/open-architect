package androidx.media2.exoplayer.external.metadata.scte35;

import androidx.annotation.b1;
import androidx.media2.exoplayer.external.metadata.Metadata;
import androidx.media2.exoplayer.external.metadata.b;
import androidx.media2.exoplayer.external.metadata.d;
import androidx.media2.exoplayer.external.util.k0;
import androidx.media2.exoplayer.external.util.w;
import androidx.media2.exoplayer.external.util.x;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class a implements b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f55582d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f55583e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f55584f = 5;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f55585g = 6;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f55586h = 255;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x f55587a = new x();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w f55588b = new w();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private k0 f55589c;

    @Override // androidx.media2.exoplayer.external.metadata.b
    public Metadata a(d inputBuffer) {
        Metadata.Entry spliceNullCommand;
        k0 k0Var = this.f55589c;
        if (k0Var == null || inputBuffer.f55424j != k0Var.e()) {
            k0 k0Var2 = new k0(inputBuffer.f53790d);
            this.f55589c = k0Var2;
            k0Var2.a(inputBuffer.f53790d - inputBuffer.f55424j);
        }
        ByteBuffer byteBuffer = inputBuffer.f53789c;
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        this.f55587a.O(bArrArray, iLimit);
        this.f55588b.m(bArrArray, iLimit);
        this.f55588b.p(39);
        long jH = (((long) this.f55588b.h(1)) << 32) | ((long) this.f55588b.h(32));
        this.f55588b.p(20);
        int iH = this.f55588b.h(12);
        int iH2 = this.f55588b.h(8);
        this.f55587a.R(14);
        if (iH2 == 0) {
            spliceNullCommand = new SpliceNullCommand();
        } else if (iH2 == 255) {
            spliceNullCommand = PrivateCommand.a(this.f55587a, iH, jH);
        } else if (iH2 == 4) {
            spliceNullCommand = SpliceScheduleCommand.a(this.f55587a);
        } else if (iH2 != 5) {
            int i10 = 1 ^ 6;
            spliceNullCommand = iH2 != 6 ? null : TimeSignalCommand.a(this.f55587a, jH, this.f55589c);
        } else {
            spliceNullCommand = SpliceInsertCommand.a(this.f55587a, jH, this.f55589c);
        }
        return spliceNullCommand == null ? new Metadata(new Metadata.Entry[0]) : new Metadata(spliceNullCommand);
    }
}
