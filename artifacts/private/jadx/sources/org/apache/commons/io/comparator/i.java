package org.apache.commons.io.comparator;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes14.dex */
class i extends a implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f336473b = -4808255005272229056L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Comparator<File> f336474a;

    public i(Comparator<File> comparator) {
        if (comparator == null) {
            throw new IllegalArgumentException("Delegate comparator is missing");
        }
        this.f336474a = comparator;
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compare(File file, File file2) {
        return this.f336474a.compare(file2, file);
    }

    @Override // org.apache.commons.io.comparator.a
    public String toString() {
        return super.toString() + "[" + this.f336474a.toString() + "]";
    }
}
