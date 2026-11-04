package androidx.profileinstaller;

/* JADX INFO: loaded from: classes3.dex */
enum f {
    DEX_FILES(0),
    EXTRA_DESCRIPTORS(1),
    CLASSES(2),
    METHODS(3),
    AGGREGATION_COUNT(4);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f73746a;

    f(long j10) {
        this.f73746a = j10;
    }

    static f l(long j10) {
        f[] fVarArrValues = values();
        for (int i10 = 0; i10 < fVarArrValues.length; i10++) {
            if (fVarArrValues[i10].n() == j10) {
                return fVarArrValues[i10];
            }
        }
        throw new IllegalArgumentException("Unsupported FileSection Type " + j10);
    }

    public long n() {
        return this.f73746a;
    }
}
