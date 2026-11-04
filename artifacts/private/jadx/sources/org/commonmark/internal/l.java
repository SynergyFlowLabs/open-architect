package org.commonmark.internal;

import java.util.ArrayList;
import java.util.List;
import org.commonmark.node.x;

/* JADX INFO: loaded from: classes14.dex */
public class l extends org.commonmark.parser.block.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final org.commonmark.node.q f337623a = new org.commonmark.node.q();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<CharSequence> f337624b = new ArrayList();

    public static class a extends org.commonmark.parser.block.b {
        @Override // org.commonmark.parser.block.e
        public org.commonmark.parser.block.f a(org.commonmark.parser.block.h hVar, org.commonmark.parser.block.g gVar) {
            return (hVar.a() < org.commonmark.internal.util.d.f337718k || hVar.b() || (hVar.e().e() instanceof x)) ? org.commonmark.parser.block.f.c() : org.commonmark.parser.block.f.d(new l()).a(hVar.f() + org.commonmark.internal.util.d.f337718k);
        }
    }

    @Override // org.commonmark.parser.block.d
    public org.commonmark.parser.block.c c(org.commonmark.parser.block.h hVar) {
        if (hVar.a() >= org.commonmark.internal.util.d.f337718k) {
            return org.commonmark.parser.block.c.a(hVar.f() + org.commonmark.internal.util.d.f337718k);
        }
        return hVar.b() ? org.commonmark.parser.block.c.b(hVar.d()) : org.commonmark.parser.block.c.d();
    }

    @Override // org.commonmark.parser.block.d
    public org.commonmark.node.b e() {
        return this.f337623a;
    }

    @Override // org.commonmark.parser.block.a, org.commonmark.parser.block.d
    public void f(CharSequence charSequence) {
        this.f337624b.add(charSequence);
    }

    @Override // org.commonmark.parser.block.a, org.commonmark.parser.block.d
    public void h() {
        int size = this.f337624b.size() - 1;
        while (size >= 0 && org.commonmark.internal.util.d.f(this.f337624b.get(size))) {
            size--;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < size + 1; i10++) {
            sb2.append(this.f337624b.get(i10));
            sb2.append('\n');
        }
        this.f337623a.r(sb2.toString());
    }
}
