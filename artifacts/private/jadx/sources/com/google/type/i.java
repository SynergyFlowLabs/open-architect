package com.google.type;

import com.google.protobuf.f3;
import com.google.protobuf.l1;
import com.google.protobuf.t1;
import com.google.protobuf.v0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends l1<i, b> implements j {
    public static final int DAY_FIELD_NUMBER = 3;
    private static final i DEFAULT_INSTANCE;
    public static final int HOURS_FIELD_NUMBER = 4;
    public static final int MINUTES_FIELD_NUMBER = 5;
    public static final int MONTH_FIELD_NUMBER = 2;
    public static final int NANOS_FIELD_NUMBER = 7;
    private static volatile f3<i> PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 6;
    public static final int TIME_ZONE_FIELD_NUMBER = 9;
    public static final int UTC_OFFSET_FIELD_NUMBER = 8;
    public static final int YEAR_FIELD_NUMBER = 1;
    private int day_;
    private int hours_;
    private int minutes_;
    private int month_;
    private int nanos_;
    private int seconds_;
    private int timeOffsetCase_ = 0;
    private Object timeOffset_;
    private int year_;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f126725a;

        static {
            int[] iArr = new int[l1.i.values().length];
            f126725a = iArr;
            try {
                iArr[l1.i.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f126725a[l1.i.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f126725a[l1.i.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f126725a[l1.i.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f126725a[l1.i.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f126725a[l1.i.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f126725a[l1.i.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends l1.b<i, b> implements j {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.type.j
        public c Ba() {
            return ((i) this.f126038b).Ba();
        }

        @Override // com.google.type.j
        public int D() {
            return ((i) this.f126038b).D();
        }

        @Override // com.google.type.j
        public boolean Gb() {
            return ((i) this.f126038b).Gb();
        }

        @Override // com.google.type.j
        public int I() {
            return ((i) this.f126038b).I();
        }

        @Override // com.google.type.j
        public int I5() {
            return ((i) this.f126038b).I5();
        }

        @Override // com.google.type.j
        public int K6() {
            return ((i) this.f126038b).K6();
        }

        @Override // com.google.type.j
        public int M3() {
            return ((i) this.f126038b).M3();
        }

        public b Ol() {
            El();
            ((i) this.f126038b).vm();
            return this;
        }

        @Override // com.google.type.j
        public com.google.protobuf.i0 P9() {
            return ((i) this.f126038b).P9();
        }

        public b Pl() {
            El();
            ((i) this.f126038b).wm();
            return this;
        }

        public b Ql() {
            El();
            ((i) this.f126038b).xm();
            return this;
        }

        public b Rl() {
            El();
            ((i) this.f126038b).ym();
            return this;
        }

        public b Sl() {
            El();
            ((i) this.f126038b).zm();
            return this;
        }

        public b Tl() {
            El();
            ((i) this.f126038b).Am();
            return this;
        }

        @Override // com.google.type.j
        public i0 U() {
            return ((i) this.f126038b).U();
        }

        public b Ul() {
            El();
            ((i) this.f126038b).Bm();
            return this;
        }

        @Override // com.google.type.j
        public int V3() {
            return ((i) this.f126038b).V3();
        }

        public b Vl() {
            El();
            ((i) this.f126038b).Cm();
            return this;
        }

        public b Wl() {
            El();
            ((i) this.f126038b).Dm();
            return this;
        }

        public b Xl() {
            El();
            ((i) this.f126038b).Em();
            return this;
        }

        public b Yl(i0 i0Var) {
            El();
            ((i) this.f126038b).Gm(i0Var);
            return this;
        }

        @Override // com.google.type.j
        public boolean Zb() {
            return ((i) this.f126038b).Zb();
        }

        public b Zl(com.google.protobuf.i0 i0Var) {
            El();
            ((i) this.f126038b).Hm(i0Var);
            return this;
        }

        public b am(int i10) {
            El();
            ((i) this.f126038b).Xm(i10);
            return this;
        }

        public b bm(int i10) {
            El();
            ((i) this.f126038b).Ym(i10);
            return this;
        }

        public b cm(int i10) {
            El();
            ((i) this.f126038b).Zm(i10);
            return this;
        }

        public b dm(int i10) {
            El();
            ((i) this.f126038b).an(i10);
            return this;
        }

        public b em(int i10) {
            El();
            ((i) this.f126038b).bn(i10);
            return this;
        }

        public b fm(int i10) {
            El();
            ((i) this.f126038b).cn(i10);
            return this;
        }

        public b gm(i0.b bVar) {
            El();
            ((i) this.f126038b).dn(bVar.build());
            return this;
        }

        public b hm(i0 i0Var) {
            El();
            ((i) this.f126038b).dn(i0Var);
            return this;
        }

        public b im(com.google.protobuf.i0.b bVar) {
            El();
            ((i) this.f126038b).en(bVar.build());
            return this;
        }

        public b jm(com.google.protobuf.i0 i0Var) {
            El();
            ((i) this.f126038b).en(i0Var);
            return this;
        }

        public b km(int i10) {
            El();
            ((i) this.f126038b).fn(i10);
            return this;
        }

        @Override // com.google.type.j
        public int v3() {
            return ((i) this.f126038b).v3();
        }

        private b() {
            super(i.DEFAULT_INSTANCE);
        }
    }

    public enum c {
        UTC_OFFSET(8),
        TIME_ZONE(9),
        TIMEOFFSET_NOT_SET(0);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f126730a;

        c(int i10) {
            this.f126730a = i10;
        }

        public static c l(int i10) {
            if (i10 == 0) {
                return TIMEOFFSET_NOT_SET;
            }
            if (i10 == 8) {
                return UTC_OFFSET;
            }
            if (i10 != 9) {
                return null;
            }
            return TIME_ZONE;
        }

        @Deprecated
        public static c n(int i10) {
            return l(i10);
        }

        public int i() {
            return this.f126730a;
        }
    }

    static {
        i iVar = new i();
        DEFAULT_INSTANCE = iVar;
        l1.Wl(i.class, iVar);
    }

    private i() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Am() {
        this.seconds_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Bm() {
        this.timeOffsetCase_ = 0;
        this.timeOffset_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Cm() {
        if (this.timeOffsetCase_ == 9) {
            this.timeOffsetCase_ = 0;
            this.timeOffset_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Dm() {
        if (this.timeOffsetCase_ == 8) {
            this.timeOffsetCase_ = 0;
            this.timeOffset_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Em() {
        this.year_ = 0;
    }

    public static i Fm() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Gm(i0 i0Var) {
        i0Var.getClass();
        if (this.timeOffsetCase_ != 9 || this.timeOffset_ == i0.im()) {
            this.timeOffset_ = i0Var;
        } else {
            this.timeOffset_ = i0.km((i0) this.timeOffset_).Jl(i0Var).B1();
        }
        this.timeOffsetCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Hm(com.google.protobuf.i0 i0Var) {
        i0Var.getClass();
        if (this.timeOffsetCase_ != 8 || this.timeOffset_ == com.google.protobuf.i0.gm()) {
            this.timeOffset_ = i0Var;
        } else {
            this.timeOffset_ = com.google.protobuf.i0.im((com.google.protobuf.i0) this.timeOffset_).Jl(i0Var).B1();
        }
        this.timeOffsetCase_ = 8;
    }

    public static b Im() {
        return DEFAULT_INSTANCE.jf();
    }

    public static b Jm(i iVar) {
        return DEFAULT_INSTANCE.Uf(iVar);
    }

    public static i Km(InputStream inputStream) throws IOException {
        return (i) l1.El(DEFAULT_INSTANCE, inputStream);
    }

    public static i Lm(InputStream inputStream, v0 v0Var) throws IOException {
        return (i) l1.Fl(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static i Mm(com.google.protobuf.u uVar) throws t1 {
        return (i) l1.Gl(DEFAULT_INSTANCE, uVar);
    }

    public static i Nm(com.google.protobuf.u uVar, v0 v0Var) throws t1 {
        return (i) l1.Hl(DEFAULT_INSTANCE, uVar, v0Var);
    }

    public static i Om(com.google.protobuf.z zVar) throws IOException {
        return (i) l1.Il(DEFAULT_INSTANCE, zVar);
    }

    public static i Pm(com.google.protobuf.z zVar, v0 v0Var) throws IOException {
        return (i) l1.Jl(DEFAULT_INSTANCE, zVar, v0Var);
    }

    public static i Qm(InputStream inputStream) throws IOException {
        return (i) l1.Kl(DEFAULT_INSTANCE, inputStream);
    }

    public static i Rm(InputStream inputStream, v0 v0Var) throws IOException {
        return (i) l1.Ll(DEFAULT_INSTANCE, inputStream, v0Var);
    }

    public static i Sm(ByteBuffer byteBuffer) throws t1 {
        return (i) l1.Ml(DEFAULT_INSTANCE, byteBuffer);
    }

    public static i Tm(ByteBuffer byteBuffer, v0 v0Var) throws t1 {
        return (i) l1.Nl(DEFAULT_INSTANCE, byteBuffer, v0Var);
    }

    public static i Um(byte[] bArr) throws t1 {
        return (i) l1.Ol(DEFAULT_INSTANCE, bArr);
    }

    public static i Vm(byte[] bArr, v0 v0Var) throws t1 {
        return (i) l1.Pl(DEFAULT_INSTANCE, bArr, v0Var);
    }

    public static f3<i> Wm() {
        return DEFAULT_INSTANCE.W7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Xm(int i10) {
        this.day_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Ym(int i10) {
        this.hours_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Zm(int i10) {
        this.minutes_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void an(int i10) {
        this.month_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bn(int i10) {
        this.nanos_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cn(int i10) {
        this.seconds_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dn(i0 i0Var) {
        i0Var.getClass();
        this.timeOffset_ = i0Var;
        this.timeOffsetCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void en(com.google.protobuf.i0 i0Var) {
        i0Var.getClass();
        this.timeOffset_ = i0Var;
        this.timeOffsetCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fn(int i10) {
        this.year_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vm() {
        this.day_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wm() {
        this.hours_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xm() {
        this.minutes_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ym() {
        this.month_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zm() {
        this.nanos_ = 0;
    }

    @Override // com.google.type.j
    public c Ba() {
        return c.l(this.timeOffsetCase_);
    }

    @Override // com.google.type.j
    public int D() {
        return this.nanos_;
    }

    @Override // com.google.type.j
    public boolean Gb() {
        return this.timeOffsetCase_ == 9;
    }

    @Override // com.google.type.j
    public int I() {
        return this.seconds_;
    }

    @Override // com.google.type.j
    public int I5() {
        return this.minutes_;
    }

    @Override // com.google.type.j
    public int K6() {
        return this.month_;
    }

    @Override // com.google.type.j
    public int M3() {
        return this.year_;
    }

    @Override // com.google.type.j
    public com.google.protobuf.i0 P9() {
        return this.timeOffsetCase_ == 8 ? (com.google.protobuf.i0) this.timeOffset_ : com.google.protobuf.i0.gm();
    }

    @Override // com.google.protobuf.l1
    protected final Object Rg(l1.i iVar, Object obj, Object obj2) {
        f3 cVar;
        int i10 = a.f126725a[iVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new i();
            case 2:
                return new b(aVar);
            case 3:
                return l1.Al(DEFAULT_INSTANCE, "\u0000\t\u0001\u0000\u0001\t\t\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004\u0005\u0004\u0006\u0004\u0007\u0004\b<\u0000\t<\u0000", new Object[]{"timeOffset_", "timeOffsetCase_", "year_", "month_", "day_", "hours_", "minutes_", "seconds_", "nanos_", com.google.protobuf.i0.class, i0.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f3<i> f3Var = PARSER;
                if (f3Var != null) {
                    return f3Var;
                }
                synchronized (i.class) {
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

    @Override // com.google.type.j
    public i0 U() {
        return this.timeOffsetCase_ == 9 ? (i0) this.timeOffset_ : i0.im();
    }

    @Override // com.google.type.j
    public int V3() {
        return this.day_;
    }

    @Override // com.google.type.j
    public boolean Zb() {
        return this.timeOffsetCase_ == 8;
    }

    @Override // com.google.type.j
    public int v3() {
        return this.hours_;
    }
}
