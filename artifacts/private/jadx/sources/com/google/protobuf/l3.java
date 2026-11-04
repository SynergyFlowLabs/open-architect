package com.google.protobuf;

/* JADX INFO: loaded from: classes5.dex */
@y
final class l3 implements l2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f126065e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f126066f = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n2 f126067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f126068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f126069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f126070d;

    l3(n2 defaultInstance, String info, Object[] objects) {
        this.f126067a = defaultInstance;
        this.f126068b = info;
        this.f126069c = objects;
        char cCharAt = info.charAt(0);
        if (cCharAt < 55296) {
            this.f126070d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char cCharAt2 = info.charAt(i12);
            if (cCharAt2 < 55296) {
                this.f126070d = i10 | (cCharAt2 << i11);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i11;
                i11 += 13;
                i12 = i13;
            }
        }
    }

    @Override // com.google.protobuf.l2
    public boolean a() {
        return (this.f126070d & 2) == 2;
    }

    @Override // com.google.protobuf.l2
    public n2 b() {
        return this.f126067a;
    }

    Object[] c() {
        return this.f126069c;
    }

    String d() {
        return this.f126068b;
    }

    @Override // com.google.protobuf.l2
    public h3 p() {
        int i10 = this.f126070d;
        if ((i10 & 1) != 0) {
            return h3.PROTO2;
        }
        return (i10 & 4) == 4 ? h3.EDITIONS : h3.PROTO3;
    }
}
