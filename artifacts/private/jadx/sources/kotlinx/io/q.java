package kotlinx.io;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.EOFException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nRealSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealSink.kt\nkotlinx/io/RealSink\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 -Util.kt\nkotlinx/io/_UtilKt\n*L\n1#1,158:1\n155#1:159\n156#1:161\n155#1:163\n156#1:165\n155#1:167\n156#1:169\n155#1:170\n156#1:172\n155#1:174\n156#1:176\n155#1:177\n156#1:179\n155#1:180\n156#1:182\n155#1:183\n156#1:185\n155#1:186\n156#1:188\n155#1:189\n156#1:191\n155#1:192\n156#1:194\n1#2:160\n1#2:162\n1#2:164\n1#2:168\n1#2:171\n1#2:173\n1#2:175\n1#2:178\n1#2:181\n1#2:184\n1#2:187\n1#2:190\n1#2:193\n1#2:195\n38#3:166\n*S KotlinDebug\n*F\n+ 1 RealSink.kt\nkotlinx/io/RealSink\n*L\n39#1:159\n39#1:161\n46#1:163\n46#1:165\n53#1:167\n53#1:169\n65#1:170\n65#1:172\n82#1:174\n82#1:176\n88#1:177\n88#1:179\n94#1:180\n94#1:182\n100#1:183\n100#1:185\n107#1:186\n107#1:188\n113#1:189\n113#1:191\n119#1:192\n119#1:194\n39#1:160\n46#1:164\n53#1:168\n65#1:171\n82#1:175\n88#1:178\n94#1:181\n100#1:184\n107#1:187\n113#1:190\n119#1:193\n47#1:166\n*E\n"})
public final class q implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final o f315780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    public boolean f315781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final b f315782c;

    public q(@NotNull o sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f315780a = sink;
        this.f315782c = new b();
    }

    @h
    public static /* synthetic */ void K1() {
    }

    private final void a() {
        if (this.f315781b) {
            throw new IllegalStateException("Sink is closed.");
        }
    }

    @Override // kotlinx.io.x
    public void Rd(@NotNull p source, long j10) throws EOFException {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f315781b) {
            throw new IllegalStateException("Sink is closed.");
        }
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        }
        long j11 = j10;
        while (j11 > 0) {
            long jHd = source.hd(this.f315782c, j11);
            if (jHd == -1) {
                throw new EOFException("Source exhausted before reading " + j10 + " bytes from it (number of bytes read: " + (j10 - j11) + ").");
            }
            j11 -= jHd;
            Z3();
        }
    }

    @Override // kotlinx.io.o
    public void V5(@NotNull b source, long j10) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f315781b) {
            throw new IllegalStateException("Sink is closed.");
        }
        if (j10 >= 0) {
            this.f315782c.V5(source, j10);
            Z3();
        } else {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        }
    }

    @Override // kotlinx.io.x
    @k
    public void Z3() {
        if (this.f315781b) {
            throw new IllegalStateException("Sink is closed.");
        }
        long jB = this.f315782c.b();
        if (jB > 0) {
            this.f315780a.V5(this.f315782c, jB);
        }
    }

    @NotNull
    public final o b() {
        return this.f315780a;
    }

    @Override // kotlinx.io.o, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (!this.f315781b) {
            if (this.f315782c.j() > 0) {
                o oVar = this.f315780a;
                b bVar = this.f315782c;
                oVar.V5(bVar, bVar.j());
            }
            th = null;
            try {
                this.f315780a.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            this.f315781b = true;
            if (th != null) {
                throw th;
            }
        }
    }

    @Override // kotlinx.io.x
    public void f1() {
        if (this.f315781b) {
            throw new IllegalStateException("Sink is closed.");
        }
        long j10 = this.f315782c.j();
        if (j10 > 0) {
            this.f315780a.V5(this.f315782c, j10);
        }
    }

    @Override // kotlinx.io.x, kotlinx.io.o, java.io.Flushable
    public void flush() {
        if (this.f315781b) {
            throw new IllegalStateException("Sink is closed.");
        }
        if (this.f315782c.j() > 0) {
            o oVar = this.f315780a;
            b bVar = this.f315782c;
            oVar.V5(bVar, bVar.j());
        }
        this.f315780a.flush();
    }

    @Override // kotlinx.io.x
    public long la(@NotNull p source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f315781b) {
            throw new IllegalStateException("Sink is closed.");
        }
        long j10 = 0;
        while (true) {
            long jHd = source.hd(this.f315782c, PlaybackStateCompat.f9665p2);
            if (jHd == -1) {
                return j10;
            }
            j10 += jHd;
            Z3();
        }
    }

    @Override // kotlinx.io.x
    public void m6(byte b10) {
        if (this.f315781b) {
            throw new IllegalStateException("Sink is closed.");
        }
        this.f315782c.m6(b10);
        Z3();
    }

    @Override // kotlinx.io.x
    @NotNull
    public b n() {
        return this.f315782c;
    }

    @Override // kotlinx.io.x
    public void oc(short s10) {
        if (this.f315781b) {
            throw new IllegalStateException("Sink is closed.");
        }
        this.f315782c.oc(s10);
        Z3();
    }

    @NotNull
    public String toString() {
        return "buffered(" + this.f315780a + ')';
    }

    @Override // kotlinx.io.x
    public void write(@NotNull byte[] source, int i10, int i11) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f315781b) {
            throw new IllegalStateException("Sink is closed.");
        }
        k0.e(source.length, i10, i11);
        this.f315782c.write(source, i10, i11);
        Z3();
    }

    @Override // kotlinx.io.x
    public void writeInt(int i10) {
        if (this.f315781b) {
            throw new IllegalStateException("Sink is closed.");
        }
        this.f315782c.writeInt(i10);
        Z3();
    }

    @Override // kotlinx.io.x
    public void writeLong(long j10) {
        if (this.f315781b) {
            throw new IllegalStateException("Sink is closed.");
        }
        this.f315782c.writeLong(j10);
        Z3();
    }
}
