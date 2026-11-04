package com.google.zxing.qrcode.decoder;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f130884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f130885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f130886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f130887d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f130888e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f130889f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f130890g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f130891h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ c[] f130892i;

    static enum a extends c {
        a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // com.google.zxing.qrcode.decoder.c
        boolean b(int i10, int i11) {
            return ((i10 + i11) & 1) == 0;
        }
    }

    static {
        a aVar = new a("DATA_MASK_000", 0);
        f130884a = aVar;
        c cVar = new c("DATA_MASK_001", 1) { // from class: com.google.zxing.qrcode.decoder.c.b
            {
                a aVar2 = null;
            }

            @Override // com.google.zxing.qrcode.decoder.c
            boolean b(int i10, int i11) {
                return (i10 & 1) == 0;
            }
        };
        f130885b = cVar;
        c cVar2 = new c("DATA_MASK_010", 2) { // from class: com.google.zxing.qrcode.decoder.c.c
            {
                a aVar2 = null;
            }

            @Override // com.google.zxing.qrcode.decoder.c
            boolean b(int i10, int i11) {
                return i11 % 3 == 0;
            }
        };
        f130886c = cVar2;
        c cVar3 = new c("DATA_MASK_011", 3) { // from class: com.google.zxing.qrcode.decoder.c.d
            {
                a aVar2 = null;
            }

            @Override // com.google.zxing.qrcode.decoder.c
            boolean b(int i10, int i11) {
                if ((i10 + i11) % 3 != 0) {
                    return false;
                }
                boolean z10 = !true;
                return true;
            }
        };
        f130887d = cVar3;
        c cVar4 = new c("DATA_MASK_100", 4) { // from class: com.google.zxing.qrcode.decoder.c.e
            {
                a aVar2 = null;
            }

            @Override // com.google.zxing.qrcode.decoder.c
            boolean b(int i10, int i11) {
                return (((i10 / 2) + (i11 / 3)) & 1) == 0;
            }
        };
        f130888e = cVar4;
        c cVar5 = new c("DATA_MASK_101", 5) { // from class: com.google.zxing.qrcode.decoder.c.f
            {
                a aVar2 = null;
            }

            @Override // com.google.zxing.qrcode.decoder.c
            boolean b(int i10, int i11) {
                return (i10 * i11) % 6 == 0;
            }
        };
        f130889f = cVar5;
        c cVar6 = new c("DATA_MASK_110", 6) { // from class: com.google.zxing.qrcode.decoder.c.g
            {
                a aVar2 = null;
            }

            @Override // com.google.zxing.qrcode.decoder.c
            boolean b(int i10, int i11) {
                return (i10 * i11) % 6 < 3;
            }
        };
        f130890g = cVar6;
        c cVar7 = new c("DATA_MASK_111", 7) { // from class: com.google.zxing.qrcode.decoder.c.h
            {
                a aVar2 = null;
            }

            @Override // com.google.zxing.qrcode.decoder.c
            boolean b(int i10, int i11) {
                return (((i10 + i11) + ((i10 * i11) % 3)) & 1) == 0;
            }
        };
        f130891h = cVar7;
        f130892i = new c[]{aVar, cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7};
    }

    private c(String str, int i10) {
        super(str, i10);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f130892i.clone();
    }

    abstract boolean b(int i10, int i11);

    final void c(com.google.zxing.common.b bVar, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            for (int i12 = 0; i12 < i10; i12++) {
                if (b(i11, i12)) {
                    bVar.d(i12, i11);
                }
            }
        }
    }

    /* synthetic */ c(String str, int i10, a aVar) {
        this(str, i10);
    }
}
