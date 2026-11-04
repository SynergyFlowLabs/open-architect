package com.badlogic.gdx.graphics.g3d;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements Comparable<a> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final com.badlogic.gdx.utils.b<String> f94296c = new com.badlogic.gdx.utils.b<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f94297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f94298b;

    protected a(long j10) {
        this.f94297a = j10;
        this.f94298b = Long.numberOfTrailingZeros(j10);
    }

    public static final String n(long j10) {
        int i10 = -1;
        while (j10 != 0 && (i10 = i10 + 1) < 63 && ((j10 >> i10) & 1) == 0) {
        }
        if (i10 < 0) {
            return null;
        }
        com.badlogic.gdx.utils.b<String> bVar = f94296c;
        if (i10 < bVar.f95174b) {
            return bVar.get(i10);
        }
        return null;
    }

    public static final long o(String str) {
        int i10 = 0;
        while (true) {
            com.badlogic.gdx.utils.b<String> bVar = f94296c;
            if (i10 >= bVar.f95174b) {
                return 0L;
            }
            if (bVar.get(i10).compareTo(str) == 0) {
                return 1 << i10;
            }
            i10++;
        }
    }

    protected static final long p(String str) {
        long jO = o(str);
        if (jO > 0) {
            return jO;
        }
        com.badlogic.gdx.utils.b<String> bVar = f94296c;
        bVar.c(str);
        return 1 << (bVar.f95174b - 1);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f94297a != aVar.f94297a) {
            return false;
        }
        return l(aVar);
    }

    public int hashCode() {
        return this.f94298b * 7489;
    }

    public abstract a k();

    protected boolean l(a aVar) {
        return aVar.hashCode() == hashCode();
    }

    public String toString() {
        return n(this.f94297a);
    }
}
