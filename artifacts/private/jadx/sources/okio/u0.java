package okio;

import android.support.v4.media.session.PlaybackStateCompat;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nRealBufferedSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealBufferedSink.kt\nokio/RealBufferedSink\n+ 2 RealBufferedSink.kt\nokio/internal/-RealBufferedSink\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,142:1\n51#1:146\n51#1:152\n51#1:157\n51#1:162\n51#1:167\n51#1:172\n51#1:175\n51#1:176\n51#1:180\n51#1:185\n51#1:188\n51#1:192\n51#1:201\n51#1:210\n51#1:215\n51#1:220\n51#1:225\n51#1:230\n51#1:235\n51#1:240\n51#1:245\n51#1:250\n51#1:255\n51#1:261\n51#1:267\n51#1:279\n34#2:143\n35#2:145\n36#2,2:147\n40#2:149\n41#2:151\n42#2:153\n50#2:154\n51#2:156\n52#2:158\n56#2:159\n57#2:161\n58#2:163\n66#2:164\n67#2:166\n68#2:168\n72#2:169\n73#2:171\n74#2:173\n78#2:177\n79#2:179\n80#2:181\n88#2:182\n89#2:184\n90#2:186\n94#2,3:189\n97#2,5:193\n105#2,3:198\n108#2,5:202\n116#2:207\n117#2:209\n118#2:211\n122#2:212\n123#2:214\n124#2:216\n128#2:217\n129#2:219\n130#2:221\n134#2:222\n135#2:224\n136#2:226\n140#2:227\n141#2:229\n142#2:231\n146#2:232\n147#2:234\n148#2:236\n152#2:237\n153#2:239\n154#2:241\n158#2:242\n159#2:244\n160#2:246\n164#2:247\n165#2:249\n166#2:251\n170#2:252\n171#2:254\n172#2,2:256\n177#2:258\n178#2:260\n179#2,2:262\n184#2:264\n185#2:266\n186#2,4:268\n192#2,7:272\n199#2,16:280\n216#2:296\n218#2:297\n1#3:144\n1#3:150\n1#3:155\n1#3:160\n1#3:165\n1#3:170\n1#3:174\n1#3:178\n1#3:183\n1#3:187\n1#3:208\n1#3:213\n1#3:218\n1#3:223\n1#3:228\n1#3:233\n1#3:238\n1#3:243\n1#3:248\n1#3:253\n1#3:259\n1#3:265\n*S KotlinDebug\n*F\n+ 1 RealBufferedSink.kt\nokio/RealBufferedSink\n*L\n55#1:146\n56#1:152\n58#1:157\n59#1:162\n61#1:167\n63#1:172\n67#1:175\n78#1:176\n82#1:180\n84#1:185\n88#1:188\n93#1:192\n94#1:201\n95#1:210\n96#1:215\n97#1:220\n98#1:225\n99#1:230\n100#1:235\n101#1:240\n102#1:245\n103#1:250\n104#1:255\n105#1:261\n134#1:267\n138#1:279\n55#1:143\n55#1:145\n55#1:147,2\n56#1:149\n56#1:151\n56#1:153\n58#1:154\n58#1:156\n58#1:158\n59#1:159\n59#1:161\n59#1:163\n61#1:164\n61#1:166\n61#1:168\n63#1:169\n63#1:171\n63#1:173\n82#1:177\n82#1:179\n82#1:181\n84#1:182\n84#1:184\n84#1:186\n93#1:189,3\n93#1:193,5\n94#1:198,3\n94#1:202,5\n95#1:207\n95#1:209\n95#1:211\n96#1:212\n96#1:214\n96#1:216\n97#1:217\n97#1:219\n97#1:221\n98#1:222\n98#1:224\n98#1:226\n99#1:227\n99#1:229\n99#1:231\n100#1:232\n100#1:234\n100#1:236\n101#1:237\n101#1:239\n101#1:241\n102#1:242\n102#1:244\n102#1:246\n103#1:247\n103#1:249\n103#1:251\n104#1:252\n104#1:254\n104#1:256,2\n105#1:258\n105#1:260\n105#1:262,2\n134#1:264\n134#1:266\n134#1:268,4\n138#1:272,7\n138#1:280,16\n139#1:296\n140#1:297\n55#1:144\n56#1:150\n58#1:155\n59#1:160\n61#1:165\n63#1:170\n82#1:178\n84#1:183\n95#1:208\n96#1:213\n97#1:218\n98#1:223\n99#1:228\n100#1:233\n101#1:238\n102#1:243\n103#1:248\n104#1:253\n105#1:259\n134#1:265\n*E\n"})
public final class u0 implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oj.f
    @NotNull
    public final z0 f335111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    @NotNull
    public final l f335112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oj.f
    public boolean f335113c;

    public u0(@NotNull z0 sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f335111a = sink;
        this.f335112b = new l();
    }

    public static /* synthetic */ void K1() {
    }

    @Override // okio.m
    @NotNull
    public m C7(@NotNull b1 source, long j10) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        while (j10 > 0) {
            long j11 = source.read(this.f335112b, j10);
            if (j11 == -1) {
                throw new EOFException();
            }
            j10 -= j11;
            L9();
        }
        return this;
    }

    @Override // okio.z0
    public void Ga(@NotNull l source, long j10) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f335113c) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        this.f335112b.Ga(source, j10);
        L9();
    }

    @Override // okio.m
    @NotNull
    public m K3(@NotNull String string, int i10, int i11) {
        Intrinsics.checkNotNullParameter(string, "string");
        if (this.f335113c) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        this.f335112b.K3(string, i10, i11);
        return L9();
    }

    @Override // okio.m
    @NotNull
    public m L9() throws IOException {
        if (this.f335113c) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        long jE = this.f335112b.e();
        if (jE > 0) {
            this.f335111a.Ga(this.f335112b, jE);
        }
        return this;
    }

    @Override // okio.m
    public long Ma(@NotNull b1 source) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        long j10 = 0;
        while (true) {
            long j11 = source.read(this.f335112b, PlaybackStateCompat.f9665p2);
            if (j11 == -1) {
                return j10;
            }
            j10 += j11;
            L9();
        }
    }

    @Override // okio.m
    @NotNull
    public m Md(@NotNull String string, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (this.f335113c) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        this.f335112b.Md(string, charset);
        return L9();
    }

    @Override // okio.m
    @NotNull
    public m O6(int i10) {
        if (this.f335113c) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        this.f335112b.O6(i10);
        return L9();
    }

    @Override // okio.m
    @NotNull
    public m P5(@NotNull o byteString, int i10, int i11) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        if (this.f335113c) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        this.f335112b.P5(byteString, i10, i11);
        return L9();
    }

    @Override // okio.m
    @NotNull
    public m U7(@NotNull o byteString) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        if (this.f335113c) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        this.f335112b.U7(byteString);
        return L9();
    }

    @Override // okio.m
    @NotNull
    public l c1() {
        return this.f335112b;
    }

    @Override // okio.m
    @NotNull
    public m c5(@NotNull String string, int i10, int i11, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (this.f335113c) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        this.f335112b.c5(string, i10, i11, charset);
        return L9();
    }

    @Override // okio.z0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f335113c) {
            return;
        }
        if (this.f335112b.size() > 0) {
            z0 z0Var = this.f335111a;
            l lVar = this.f335112b;
            z0Var.Ga(lVar, lVar.size());
        }
        th = null;
        try {
            this.f335111a.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f335113c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // okio.m
    @NotNull
    public m d9(int i10) {
        if (this.f335113c) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        this.f335112b.d9(i10);
        return L9();
    }

    @Override // okio.m
    @NotNull
    public m f1() throws IOException {
        if (this.f335113c) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        long size = this.f335112b.size();
        if (size > 0) {
            this.f335111a.Ga(this.f335112b, size);
        }
        return this;
    }

    @Override // okio.m
    @NotNull
    public m f6(int i10) {
        if (this.f335113c) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        this.f335112b.f6(i10);
        return L9();
    }

    @Override // okio.m, okio.z0, java.io.Flushable
    public void flush() throws IOException {
        if (this.f335113c) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        if (this.f335112b.size() > 0) {
            z0 z0Var = this.f335111a;
            l lVar = this.f335112b;
            z0Var.Ga(lVar, lVar.size());
        }
        this.f335111a.flush();
    }

    @Override // okio.m
    @NotNull
    public m h5(long j10) {
        if (this.f335113c) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        this.f335112b.h5(j10);
        return L9();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f335113c;
    }

    @Override // okio.m
    @NotNull
    public m m2(long j10) {
        if (this.f335113c) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        this.f335112b.m2(j10);
        return L9();
    }

    @Override // okio.m
    @NotNull
    public l n() {
        return this.f335112b;
    }

    @Override // okio.m
    @NotNull
    public OutputStream nf() {
        return new a();
    }

    @Override // okio.m
    @NotNull
    public m pa(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        if (this.f335113c) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        this.f335112b.pa(string);
        return L9();
    }

    @Override // okio.m
    @NotNull
    public m q7(long j10) {
        if (this.f335113c) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        this.f335112b.q7(j10);
        return L9();
    }

    @Override // okio.z0
    @NotNull
    public e1 timeout() {
        return this.f335111a.timeout();
    }

    @NotNull
    public String toString() {
        return "buffer(" + this.f335111a + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(@NotNull ByteBuffer source) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f335113c) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        int iWrite = this.f335112b.write(source);
        L9();
        return iWrite;
    }

    @Override // okio.m
    @NotNull
    public m writeByte(int i10) {
        if (this.f335113c) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        this.f335112b.writeByte(i10);
        return L9();
    }

    @Override // okio.m
    @NotNull
    public m writeInt(int i10) {
        if (this.f335113c) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        this.f335112b.writeInt(i10);
        return L9();
    }

    @Override // okio.m
    @NotNull
    public m writeLong(long j10) {
        if (this.f335113c) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        this.f335112b.writeLong(j10);
        return L9();
    }

    @Override // okio.m
    @NotNull
    public m writeShort(int i10) {
        if (this.f335113c) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        this.f335112b.writeShort(i10);
        return L9();
    }

    @SourceDebugExtension({"SMAP\nRealBufferedSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealBufferedSink.kt\nokio/RealBufferedSink$outputStream$1\n+ 2 RealBufferedSink.kt\nokio/RealBufferedSink\n*L\n1#1,142:1\n51#2:143\n51#2:144\n*S KotlinDebug\n*F\n+ 1 RealBufferedSink.kt\nokio/RealBufferedSink$outputStream$1\n*L\n111#1:143\n117#1:144\n*E\n"})
    public static final class a extends OutputStream {
        a() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws Throwable {
            u0.this.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            u0 u0Var = u0.this;
            if (!u0Var.f335113c) {
                u0Var.flush();
            }
        }

        @NotNull
        public String toString() {
            return u0.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i10) throws IOException {
            u0 u0Var = u0.this;
            if (u0Var.f335113c) {
                throw new IOException(MetricTracker.Action.CLOSED);
            }
            u0Var.f335112b.writeByte((byte) i10);
            u0.this.L9();
        }

        @Override // java.io.OutputStream
        public void write(@NotNull byte[] data, int i10, int i11) throws IOException {
            Intrinsics.checkNotNullParameter(data, "data");
            u0 u0Var = u0.this;
            if (!u0Var.f335113c) {
                u0Var.f335112b.write(data, i10, i11);
                u0.this.L9();
                return;
            }
            throw new IOException(MetricTracker.Action.CLOSED);
        }
    }

    @Override // okio.m
    @NotNull
    public m write(@NotNull byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!this.f335113c) {
            this.f335112b.write(source);
            return L9();
        }
        throw new IllegalStateException(MetricTracker.Action.CLOSED);
    }

    @Override // okio.m
    @NotNull
    public m write(@NotNull byte[] source, int i10, int i11) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f335113c) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        this.f335112b.write(source, i10, i11);
        return L9();
    }
}
