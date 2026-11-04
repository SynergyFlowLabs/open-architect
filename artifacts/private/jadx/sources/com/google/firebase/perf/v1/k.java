package com.google.firebase.perf.v1;

import com.google.protobuf.f3;
import com.google.protobuf.l1;
import com.google.protobuf.t1;
import com.google.protobuf.v0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class k extends l1<k, b> implements l {
    public static final int CPU_CLOCK_RATE_KHZ_FIELD_NUMBER = 2;
    public static final int CPU_PROCESSOR_COUNT_FIELD_NUMBER = 6;
    private static final k DEFAULT_INSTANCE;
    public static final int DEVICE_RAM_SIZE_KB_FIELD_NUMBER = 3;
    public static final int MAX_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 4;
    public static final int MAX_ENCOURAGED_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 5;
    private static volatile f3<k> PARSER = null;
    public static final int PROCESS_NAME_FIELD_NUMBER = 1;
    private int bitField0_;
    private int cpuClockRateKhz_;
    private int cpuProcessorCount_;
    private int deviceRamSizeKb_;
    private int maxAppJavaHeapMemoryKb_;
    private int maxEncouragedAppJavaHeapMemoryKb_;
    private String processName_ = "";

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f124271a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f124271a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f124271a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f124271a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f124271a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f124271a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f124271a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f124271a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<k, b> implements l {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.firebase.perf.v1.l
        public int Ac() {
            return ((k) this.f126038b).Ac();
        }

        @Override // com.google.firebase.perf.v1.l
        public boolean C8() {
            return ((k) this.f126038b).C8();
        }

        @Override // com.google.firebase.perf.v1.l
        public boolean Dg() {
            return ((k) this.f126038b).Dg();
        }

        @Override // com.google.firebase.perf.v1.l
        @Deprecated
        public boolean Fd() {
            return ((k) this.f126038b).Fd();
        }

        @Override // com.google.firebase.perf.v1.l
        @Deprecated
        public com.google.protobuf.u Fk() {
            return ((k) this.f126038b).Fk();
        }

        @Override // com.google.firebase.perf.v1.l
        public boolean Oe() {
            return ((k) this.f126038b).Oe();
        }

        public b Ol() {
            El();
            ((k) this.f126038b).nm();
            return this;
        }

        public b Pl() {
            El();
            ((k) this.f126038b).om();
            return this;
        }

        public b Ql() {
            El();
            ((k) this.f126038b).pm();
            return this;
        }

        public b Rl() {
            El();
            ((k) this.f126038b).qm();
            return this;
        }

        public b Sl() {
            El();
            ((k) this.f126038b).rm();
            return this;
        }

        @Deprecated
        public b Tl() {
            El();
            ((k) this.f126038b).sm();
            return this;
        }

        @Override // com.google.firebase.perf.v1.l
        public int U8() {
            return ((k) this.f126038b).U8();
        }

        public b Ul(int i10) {
            El();
            ((k) this.f126038b).Jm(i10);
            return this;
        }

        public b Vl(int i10) {
            El();
            ((k) this.f126038b).Km(i10);
            return this;
        }

        public b Wl(int i10) {
            El();
            ((k) this.f126038b).Lm(i10);
            return this;
        }

        public b Xl(int i10) {
            El();
            ((k) this.f126038b).Mm(i10);
            return this;
        }

        public b Yl(int i10) {
            El();
            ((k) this.f126038b).Nm(i10);
            return this;
        }

        @Deprecated
        public b Zl(String str) {
            El();
            ((k) this.f126038b).Om(str);
            return this;
        }

        @Deprecated
        public b am(com.google.protobuf.u uVar) {
            El();
            ((k) this.f126038b).Pm(uVar);
            return this;
        }

        @Override // com.google.firebase.perf.v1.l
        public int eg() {
            return ((k) this.f126038b).eg();
        }

        @Override // com.google.firebase.perf.v1.l
        @Deprecated
        public String gd() {
            return ((k) this.f126038b).gd();
        }

        @Override // com.google.firebase.perf.v1.l
        public boolean ii() {
            return ((k) this.f126038b).ii();
        }

        @Override // com.google.firebase.perf.v1.l
        public int jj() {
            return ((k) this.f126038b).jj();
        }

        @Override // com.google.firebase.perf.v1.l
        public boolean sb() {
            return ((k) this.f126038b).sb();
        }

        @Override // com.google.firebase.perf.v1.l
        public int zj() {
            return ((k) this.f126038b).zj();
        }

        private b() {
            super(k.DEFAULT_INSTANCE);
        }
    }

    static {
        k kVar = new k();
        DEFAULT_INSTANCE = kVar;
        l1.Wl(k.class, kVar);
    }

    private k() {
    }

    public static k Am(com.google.protobuf.z zVar) throws IOException {
        return (k) l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static k Bm(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
        return (k) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static k Cm(InputStream inputStream) throws IOException {
        return (k) l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static k Dm(InputStream inputStream, v0 v0Var) throws IOException {
        return (k) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static k Em(ByteBuffer byteBuffer) throws t1 {
        return (k) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static k Fm(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
        return (k) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static k Gm(byte[] bArr) throws t1 {
        return (k) l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static k Hm(byte[] bArr, v0 v0Var) throws t1 {
        return (k) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static f3<k> Im() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Jm(int i10) {
        this.bitField0_ |= 2;
        this.cpuClockRateKhz_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Km(int i10) {
        this.bitField0_ |= 4;
        this.cpuProcessorCount_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lm(int i10) {
        this.bitField0_ |= 8;
        this.deviceRamSizeKb_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Mm(int i10) {
        this.bitField0_ |= 16;
        this.maxAppJavaHeapMemoryKb_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Nm(int i10) {
        this.bitField0_ |= 32;
        this.maxEncouragedAppJavaHeapMemoryKb_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Om(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.processName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Pm(com.google.protobuf.u uVar) {
        this.processName_ = uVar.z0();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void nm() {
        this.bitField0_ &= -3;
        this.cpuClockRateKhz_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void om() {
        this.bitField0_ &= -5;
        this.cpuProcessorCount_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pm() {
        this.bitField0_ &= -9;
        this.deviceRamSizeKb_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qm() {
        this.bitField0_ &= -17;
        this.maxAppJavaHeapMemoryKb_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rm() {
        this.bitField0_ &= -33;
        this.maxEncouragedAppJavaHeapMemoryKb_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sm() {
        this.bitField0_ &= -2;
        this.processName_ = tm().gd();
    }

    public static k tm() {
        return DEFAULT_INSTANCE;
    }

    public static b um() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b vm(k kVar) {
        return DEFAULT_INSTANCE.Uf(kVar);
    }

    public static k wm(InputStream inputStream) throws IOException {
        return (k) l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static k xm(InputStream inputStream, v0 v0Var) throws IOException {
        return (k) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static k ym(com.google.protobuf.u uVar) throws t1 {
        return (k) l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static k zm(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
        return (k) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    @Override // com.google.firebase.perf.v1.l
    public int Ac() {
        return this.cpuProcessorCount_;
    }

    @Override // com.google.firebase.perf.v1.l
    public boolean C8() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.google.firebase.perf.v1.l
    public boolean Dg() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.firebase.perf.v1.l
    @Deprecated
    public boolean Fd() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.firebase.perf.v1.l
    @Deprecated
    public com.google.protobuf.u Fk() {
        return com.google.protobuf.u.C(this.processName_);
    }

    @Override // com.google.firebase.perf.v1.l
    public boolean Oe() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
        f3 cVar;
        int i10 = a.f124271a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new k();
            case 2:
                return new b(aVar);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0003\u0004င\u0004\u0005င\u0005\u0006င\u0002", new Object[]{"bitField0_", "processName_", "cpuClockRateKhz_", "deviceRamSizeKb_", "maxAppJavaHeapMemoryKb_", "maxEncouragedAppJavaHeapMemoryKb_", "cpuProcessorCount_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f3<k> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (k.class) {
                    try {
                        cVar = PARSER;
                        if (cVar == null) {
                            cVar = new l1.c(DEFAULT_INSTANCE);
                            PARSER = cVar;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return cVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.firebase.perf.v1.l
    public int U8() {
        return this.maxEncouragedAppJavaHeapMemoryKb_;
    }

    @Override // com.google.firebase.perf.v1.l
    public int eg() {
        return this.deviceRamSizeKb_;
    }

    @Override // com.google.firebase.perf.v1.l
    @Deprecated
    public String gd() {
        return this.processName_;
    }

    @Override // com.google.firebase.perf.v1.l
    public boolean ii() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.firebase.perf.v1.l
    public int jj() {
        return this.cpuClockRateKhz_;
    }

    @Override // com.google.firebase.perf.v1.l
    public boolean sb() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.google.firebase.perf.v1.l
    public int zj() {
        return this.maxAppJavaHeapMemoryKb_;
    }
}
