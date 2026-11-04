package io.noties.markwon;

import android.content.Context;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
class f implements e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f297589a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private e.b f297592d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<i> f297590b = new ArrayList(3);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TextView.BufferType f297591c = TextView.BufferType.SPANNABLE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f297593e = true;

    f(@NonNull Context context) {
        this.f297589a = context;
    }

    @NonNull
    private static List<i> f(@NonNull List<i> list) {
        return new t(list).f();
    }

    @Override // io.noties.markwon.e.a
    @NonNull
    public e.a a(@NonNull i iVar) {
        this.f297590b.add(iVar);
        return this;
    }

    @Override // io.noties.markwon.e.a
    @NonNull
    public e.a b(@NonNull Iterable<? extends i> iterable) {
        for (i iVar : iterable) {
            iVar.getClass();
            this.f297590b.add(iVar);
        }
        return this;
    }

    @Override // io.noties.markwon.e.a
    @NonNull
    public e build() {
        if (this.f297590b.isEmpty()) {
            throw new IllegalStateException("No plugins were added to this builder. Use #usePlugin method to add them");
        }
        List<i> listF = f(this.f297590b);
        org.commonmark.parser.d.b bVar = new org.commonmark.parser.d.b();
        io.noties.markwon.core.c.a aVarK = io.noties.markwon.core.c.k(this.f297589a);
        g.b bVar2 = new g.b();
        o.a aVar = new o.a();
        l.a aVar2 = new l.a();
        for (i iVar : listF) {
            iVar.f(bVar);
            iVar.j(aVarK);
            iVar.g(bVar2);
            iVar.d(aVar);
            iVar.e(aVar2);
        }
        g gVarI = bVar2.i(aVarK.A(), aVar2.build());
        return new h(this.f297591c, this.f297592d, bVar.f(), n.b(aVar, gVarI), gVarI, Collections.unmodifiableList(listF), this.f297593e);
    }

    @Override // io.noties.markwon.e.a
    @NonNull
    public e.a c(@NonNull TextView.BufferType bufferType) {
        this.f297591c = bufferType;
        return this;
    }

    @Override // io.noties.markwon.e.a
    @NonNull
    public e.a d(@NonNull e.b bVar) {
        this.f297592d = bVar;
        return this;
    }

    @Override // io.noties.markwon.e.a
    @NonNull
    public e.a e(boolean z10) {
        this.f297593e = z10;
        return this;
    }
}
