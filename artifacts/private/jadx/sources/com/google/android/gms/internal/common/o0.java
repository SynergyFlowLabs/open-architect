package com.google.android.gms.internal.common;

import java.io.IOException;
import java.util.Iterator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
final class o0 implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ CharSequence f107986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ b f107987b;

    o0(b bVar, CharSequence charSequence) {
        this.f107986a = charSequence;
        this.f107987b = bVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f107987b.h(this.f107986a);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
        Iterator it = iterator();
        try {
            if (it.hasNext()) {
                sb2.append(j0.a(it.next(), ", "));
                while (it.hasNext()) {
                    sb2.append((CharSequence) ", ");
                    sb2.append(j0.a(it.next(), ", "));
                }
            }
            sb2.append(AbstractJsonLexerKt.END_LIST);
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
