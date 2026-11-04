package com.google.api.client.repackaged.com.google.common.base;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
@r7.b
abstract class b<T> implements Iterator<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private EnumC1027b f115797a = EnumC1027b.NOT_READY;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private T f115798b;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f115799a;

        static {
            int[] iArr = new int[EnumC1027b.values().length];
            f115799a = iArr;
            try {
                iArr[EnumC1027b.READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f115799a[EnumC1027b.DONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: com.google.api.client.repackaged.com.google.common.base.b$b, reason: collision with other inner class name */
    private enum EnumC1027b {
        READY,
        NOT_READY,
        DONE,
        FAILED;

        static {
            int i10 = 3 << 2;
            int i11 = 6 << 3;
        }
    }

    protected b() {
    }

    private boolean d() {
        this.f115797a = EnumC1027b.FAILED;
        this.f115798b = b();
        if (this.f115797a == EnumC1027b.DONE) {
            return false;
        }
        this.f115797a = EnumC1027b.READY;
        return true;
    }

    protected abstract T b();

    @fj.h
    @z7.a
    protected final T c() {
        this.f115797a = EnumC1027b.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        q.g0(this.f115797a != EnumC1027b.FAILED);
        int i10 = a.f115799a[this.f115797a.ordinal()];
        if (i10 == 1) {
            return true;
        }
        if (i10 != 2) {
            return d();
        }
        return false;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f115797a = EnumC1027b.NOT_READY;
        T t10 = this.f115798b;
        this.f115798b = null;
        return t10;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
