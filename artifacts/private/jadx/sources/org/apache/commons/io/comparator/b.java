package org.apache.commons.io.comparator;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes14.dex */
public class b extends a implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f336437b = -2224170307287243428L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Comparator<?>[] f336438c = new Comparator[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Comparator<File>[] f336439a;

    /* JADX WARN: Multi-variable type inference failed */
    public b(Comparator<File>... comparatorArr) {
        if (comparatorArr == null) {
            this.f336439a = f336438c;
            return;
        }
        Comparator<File>[] comparatorArr2 = new Comparator[comparatorArr.length];
        this.f336439a = comparatorArr2;
        System.arraycopy(comparatorArr, 0, comparatorArr2, 0, comparatorArr.length);
    }

    @Override // org.apache.commons.io.comparator.a
    public /* bridge */ /* synthetic */ List a(List list) {
        return super.a(list);
    }

    @Override // org.apache.commons.io.comparator.a
    public /* bridge */ /* synthetic */ File[] b(File[] fileArr) {
        return super.b(fileArr);
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compare(File file, File file2) {
        int iCompare = 0;
        for (Comparator<File> comparator : this.f336439a) {
            iCompare = comparator.compare(file, file2);
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return iCompare;
    }

    @Override // org.apache.commons.io.comparator.a
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(AbstractJsonLexerKt.BEGIN_OBJ);
        boolean z10 = true | false;
        for (int i10 = 0; i10 < this.f336439a.length; i10++) {
            if (i10 > 0) {
                sb2.append(AbstractJsonLexerKt.COMMA);
            }
            sb2.append(this.f336439a[i10]);
        }
        sb2.append(AbstractJsonLexerKt.END_OBJ);
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(Iterable<Comparator<File>> iterable) {
        if (iterable == null) {
            this.f336439a = f336438c;
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Comparator<File>> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        this.f336439a = (Comparator[]) arrayList.toArray(new Comparator[arrayList.size()]);
    }
}
