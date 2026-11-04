package org.apache.commons.lang3;

import java.io.Serializable;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes14.dex */
final class g implements Iterable<Character>, Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f337168e = 8270183163158333422L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final char f337169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final char f337170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f337171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private transient String f337172d;

    private static class b implements Iterator<Character> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private char f337173a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final g f337174b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f337175c;

        private void c() {
            if (!this.f337174b.f337171c) {
                if (this.f337173a < this.f337174b.f337170b) {
                    this.f337173a = (char) (this.f337173a + 1);
                    return;
                } else {
                    this.f337175c = false;
                    return;
                }
            }
            char c10 = this.f337173a;
            if (c10 == 65535) {
                this.f337175c = false;
                return;
            }
            if (c10 + 1 != this.f337174b.f337169a) {
                this.f337173a = (char) (this.f337173a + 1);
            } else if (this.f337174b.f337170b == 65535) {
                this.f337175c = false;
            } else {
                this.f337173a = (char) (this.f337174b.f337170b + 1);
            }
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Character next() {
            if (!this.f337175c) {
                throw new NoSuchElementException();
            }
            char c10 = this.f337173a;
            c();
            return Character.valueOf(c10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f337175c;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private b(g gVar) {
            this.f337174b = gVar;
            this.f337175c = true;
            if (!gVar.f337171c) {
                this.f337173a = gVar.f337169a;
                return;
            }
            if (gVar.f337169a != 0) {
                this.f337173a = (char) 0;
            } else if (gVar.f337170b == 65535) {
                this.f337175c = false;
            } else {
                this.f337173a = (char) (gVar.f337170b + 1);
            }
        }
    }

    private g(char c10, char c11, boolean z10) {
        if (c10 > c11) {
            c11 = c10;
            c10 = c11;
        }
        this.f337169a = c10;
        this.f337170b = c11;
        this.f337171c = z10;
    }

    public static g p(char c10) {
        return new g(c10, c10, false);
    }

    public static g r(char c10, char c11) {
        return new g(c10, c11, false);
    }

    public static g t(char c10) {
        return new g(c10, c10, true);
    }

    public static g u(char c10, char c11) {
        return new g(c10, c11, true);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f337169a == gVar.f337169a && this.f337170b == gVar.f337170b && this.f337171c == gVar.f337171c;
    }

    public int hashCode() {
        return this.f337169a + 'S' + (this.f337170b * 7) + (this.f337171c ? 1 : 0);
    }

    @Override // java.lang.Iterable
    public Iterator<Character> iterator() {
        return new b();
    }

    public boolean k(char c10) {
        return (c10 >= this.f337169a && c10 <= this.f337170b) != this.f337171c;
    }

    public boolean l(g gVar) {
        c0.v(gVar != null, "The Range must not be null", new Object[0]);
        if (this.f337171c) {
            if (gVar.f337171c) {
                return this.f337169a >= gVar.f337169a && this.f337170b <= gVar.f337170b;
            }
            return gVar.f337170b < this.f337169a || gVar.f337169a > this.f337170b;
        }
        if (gVar.f337171c) {
            return this.f337169a == 0 && this.f337170b == 65535;
        }
        return this.f337169a <= gVar.f337169a && this.f337170b >= gVar.f337170b;
    }

    public char m() {
        return this.f337170b;
    }

    public char n() {
        return this.f337169a;
    }

    public boolean s() {
        return this.f337171c;
    }

    public String toString() {
        if (this.f337172d == null) {
            StringBuilder sb2 = new StringBuilder(4);
            if (s()) {
                sb2.append('^');
            }
            sb2.append(this.f337169a);
            if (this.f337169a != this.f337170b) {
                sb2.append(org.apache.commons.codec.language.l.f335457d);
                sb2.append(this.f337170b);
            }
            this.f337172d = sb2.toString();
        }
        return this.f337172d;
    }
}
