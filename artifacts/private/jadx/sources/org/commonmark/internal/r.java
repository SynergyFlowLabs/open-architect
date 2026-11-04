package org.commonmark.internal;

import java.util.List;
import org.commonmark.node.x;

/* JADX INFO: loaded from: classes14.dex */
public class r extends org.commonmark.parser.block.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x f337683a = new x();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private o f337684b = new o();

    @Override // org.commonmark.parser.block.a, org.commonmark.parser.block.d
    public void a(org.commonmark.parser.a aVar) {
        CharSequence charSequenceD = this.f337684b.d();
        if (charSequenceD.length() > 0) {
            aVar.a(charSequenceD.toString(), this.f337683a);
        }
    }

    @Override // org.commonmark.parser.block.d
    public org.commonmark.parser.block.c c(org.commonmark.parser.block.h hVar) {
        return !hVar.b() ? org.commonmark.parser.block.c.b(hVar.getIndex()) : org.commonmark.parser.block.c.d();
    }

    @Override // org.commonmark.parser.block.a, org.commonmark.parser.block.d
    public boolean d() {
        return true;
    }

    @Override // org.commonmark.parser.block.d
    public org.commonmark.node.b e() {
        return this.f337683a;
    }

    @Override // org.commonmark.parser.block.a, org.commonmark.parser.block.d
    public void f(CharSequence charSequence) {
        this.f337684b.g(charSequence);
    }

    @Override // org.commonmark.parser.block.a, org.commonmark.parser.block.d
    public void h() {
        if (this.f337684b.d().length() == 0) {
            this.f337683a.o();
        }
    }

    public CharSequence i() {
        return this.f337684b.d();
    }

    public List<org.commonmark.node.s> j() {
        return this.f337684b.c();
    }
}
