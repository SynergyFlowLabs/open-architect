package org.msgpack.core;

import org.msgpack.value.z;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'b' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes14.dex */
public final class c {
    public static final c H1;
    public static final c X;
    public static final c Y;
    public static final c Z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f339226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f339227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f339228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f339229e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f339230f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f339231g;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    public static final c f339232g3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f339233h;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    public static final c f339234h3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f339235i;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    public static final c f339236i3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c f339237j;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    public static final c f339238j3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final c f339239k;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    public static final c f339240k3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final c f339241l;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    public static final c f339242l3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final c f339243m;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    public static final c f339244m3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final c f339245n;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    public static final c f339246n3;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final c f339247o;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    public static final c f339248o3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final c f339249p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final c f339250p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public static final c f339251p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    public static final c f339252p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    public static final c f339253q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    private static final c[] f339254r3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final c f339255s;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    private static final /* synthetic */ c[] f339256s3;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final c f339257t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final c f339258v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final c f339259w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z f339260a;

    static {
        z zVar = z.INTEGER;
        c cVar = new c("POSFIXINT", 0, zVar);
        f339226b = cVar;
        z zVar2 = z.MAP;
        c cVar2 = new c("FIXMAP", 1, zVar2);
        f339227c = cVar2;
        z zVar3 = z.ARRAY;
        c cVar3 = new c("FIXARRAY", 2, zVar3);
        f339228d = cVar3;
        z zVar4 = z.STRING;
        c cVar4 = new c("FIXSTR", 3, zVar4);
        f339229e = cVar4;
        c cVar5 = new c("NIL", 4, z.NIL);
        f339230f = cVar5;
        c cVar6 = new c("NEVER_USED", 5, null);
        f339231g = cVar6;
        c cVar7 = new c("BOOLEAN", 6, z.BOOLEAN);
        f339233h = cVar7;
        z zVar5 = z.BINARY;
        c cVar8 = new c("BIN8", 7, zVar5);
        f339235i = cVar8;
        c cVar9 = new c("BIN16", 8, zVar5);
        f339237j = cVar9;
        c cVar10 = new c("BIN32", 9, zVar5);
        f339239k = cVar10;
        z zVar6 = z.EXTENSION;
        c cVar11 = new c("EXT8", 10, zVar6);
        f339241l = cVar11;
        c cVar12 = new c("EXT16", 11, zVar6);
        f339243m = cVar12;
        c cVar13 = new c("EXT32", 12, zVar6);
        f339245n = cVar13;
        z zVar7 = z.FLOAT;
        c cVar14 = new c("FLOAT32", 13, zVar7);
        f339247o = cVar14;
        c cVar15 = new c("FLOAT64", 14, zVar7);
        f339255s = cVar15;
        c cVar16 = new c("UINT8", 15, zVar);
        f339257t = cVar16;
        c cVar17 = new c("UINT16", 16, zVar);
        f339258v = cVar17;
        c cVar18 = new c("UINT32", 17, zVar);
        f339259w = cVar18;
        c cVar19 = new c("UINT64", 18, zVar);
        X = cVar19;
        c cVar20 = new c("INT8", 19, zVar);
        Y = cVar20;
        c cVar21 = new c("INT16", 20, zVar);
        Z = cVar21;
        c cVar22 = new c("INT32", 21, zVar);
        f339249p0 = cVar22;
        c cVar23 = new c("INT64", 22, zVar);
        f339250p1 = cVar23;
        c cVar24 = new c("FIXEXT1", 23, zVar6);
        H1 = cVar24;
        c cVar25 = new c("FIXEXT2", 24, zVar6);
        f339251p2 = cVar25;
        c cVar26 = new c("FIXEXT4", 25, zVar6);
        f339232g3 = cVar26;
        c cVar27 = new c("FIXEXT8", 26, zVar6);
        f339234h3 = cVar27;
        c cVar28 = new c("FIXEXT16", 27, zVar6);
        f339236i3 = cVar28;
        c cVar29 = new c("STR8", 28, zVar4);
        f339238j3 = cVar29;
        c cVar30 = new c("STR16", 29, zVar4);
        f339240k3 = cVar30;
        c cVar31 = new c("STR32", 30, zVar4);
        f339242l3 = cVar31;
        c cVar32 = new c("ARRAY16", 31, zVar3);
        f339244m3 = cVar32;
        c cVar33 = new c("ARRAY32", 32, zVar3);
        f339246n3 = cVar33;
        c cVar34 = new c("MAP16", 33, zVar2);
        f339248o3 = cVar34;
        c cVar35 = new c("MAP32", 34, zVar2);
        f339252p3 = cVar35;
        c cVar36 = new c("NEGFIXINT", 35, zVar);
        f339253q3 = cVar36;
        f339256s3 = new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, cVar12, cVar13, cVar14, cVar15, cVar16, cVar17, cVar18, cVar19, cVar20, cVar21, cVar22, cVar23, cVar24, cVar25, cVar26, cVar27, cVar28, cVar29, cVar30, cVar31, cVar32, cVar33, cVar34, cVar35, cVar36};
        f339254r3 = new c[256];
        for (int i10 = 0; i10 <= 255; i10++) {
            f339254r3[i10] = l((byte) i10);
        }
    }

    private c(String str, int i10, z zVar) {
        super(str, i10);
        this.f339260a = zVar;
    }

    @ym.b
    static c l(byte b10) {
        if (h.a.g(b10)) {
            return f339226b;
        }
        if (h.a.f(b10)) {
            return f339253q3;
        }
        if (h.a.b(b10)) {
            return f339229e;
        }
        if (h.a.c(b10)) {
            return f339228d;
        }
        if (h.a.d(b10)) {
            return f339227c;
        }
        switch (b10) {
            case -64:
                return f339230f;
            case -63:
            default:
                return f339231g;
            case -62:
            case -61:
                return f339233h;
            case -60:
                return f339235i;
            case -59:
                return f339237j;
            case -58:
                return f339239k;
            case -57:
                return f339241l;
            case -56:
                return f339243m;
            case -55:
                return f339245n;
            case -54:
                return f339247o;
            case -53:
                return f339255s;
            case -52:
                return f339257t;
            case -51:
                return f339258v;
            case org.locationtech.jts.index.quadtree.b.f338427a /* -50 */:
                return f339259w;
            case -49:
                return X;
            case -48:
                return Y;
            case -47:
                return Z;
            case -46:
                return f339249p0;
            case -45:
                return f339250p1;
            case -44:
                return H1;
            case -43:
                return f339251p2;
            case -42:
                return f339232g3;
            case -41:
                return f339234h3;
            case -40:
                return f339236i3;
            case -39:
                return f339238j3;
            case -38:
                return f339240k3;
            case -37:
                return f339242l3;
            case -36:
                return f339244m3;
            case -35:
                return f339246n3;
            case -34:
                return f339248o3;
            case -33:
                return f339252p3;
        }
    }

    public static c n(byte b10) {
        return f339254r3[b10 & 255];
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f339256s3.clone();
    }

    public z k() throws d {
        if (this != f339231g) {
            return this.f339260a;
        }
        throw new d("Cannot convert NEVER_USED to ValueType");
    }
}
