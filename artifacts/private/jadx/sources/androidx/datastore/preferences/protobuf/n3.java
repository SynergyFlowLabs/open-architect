package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes2.dex */
@y
final class n3 implements o2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f50495e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f50496f = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q2 f50497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f50498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f50499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f50500d;

    n3(q2 defaultInstance, String info, Object[] objects) {
        this.f50497a = defaultInstance;
        this.f50498b = info;
        this.f50499c = objects;
        char cCharAt = info.charAt(0);
        if (cCharAt < 55296) {
            this.f50500d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char cCharAt2 = info.charAt(i12);
            if (cCharAt2 < 55296) {
                this.f50500d = i10 | (cCharAt2 << i11);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i11;
                i11 += 13;
                i12 = i13;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.o2
    public boolean a() {
        return (this.f50500d & 2) == 2;
    }

    @Override // androidx.datastore.preferences.protobuf.o2
    public q2 b() {
        return this.f50497a;
    }

    Object[] c() {
        return this.f50499c;
    }

    String d() {
        return this.f50498b;
    }

    @Override // androidx.datastore.preferences.protobuf.o2
    public j3 p() {
        int i10 = this.f50500d;
        if ((i10 & 1) != 0) {
            return j3.PROTO2;
        }
        return (i10 & 4) == 4 ? j3.EDITIONS : j3.PROTO3;
    }
}
