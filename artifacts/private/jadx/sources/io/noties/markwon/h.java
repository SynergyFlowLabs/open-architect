package io.noties.markwon;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes8.dex */
class h extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextView.BufferType f297608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final org.commonmark.parser.d f297609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n f297610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g f297611d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<i> f297612e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    private final e.b f297613f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f297614g;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextView f297615a;

        a(TextView textView) {
            this.f297615a = textView;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = h.this.f297612e.iterator();
            while (it.hasNext()) {
                ((i) it.next()).c(this.f297615a);
            }
        }
    }

    h(@NonNull TextView.BufferType bufferType, @p0 e.b bVar, @NonNull org.commonmark.parser.d dVar, @NonNull n nVar, @NonNull g gVar, @NonNull List<i> list, boolean z10) {
        this.f297608a = bufferType;
        this.f297613f = bVar;
        this.f297609b = dVar;
        this.f297610c = nVar;
        this.f297611d = gVar;
        this.f297612e = list;
        this.f297614g = z10;
    }

    @Override // io.noties.markwon.e
    @NonNull
    public g c() {
        return this.f297611d;
    }

    @Override // io.noties.markwon.e
    @p0
    public <P extends i> P e(@NonNull Class<P> cls) {
        P p10 = null;
        for (i iVar : this.f297612e) {
            if (cls.isAssignableFrom(iVar.getClass())) {
                p10 = (P) iVar;
            }
        }
        return p10;
    }

    @Override // io.noties.markwon.e
    @NonNull
    public List<? extends i> f() {
        return Collections.unmodifiableList(this.f297612e);
    }

    @Override // io.noties.markwon.e
    public boolean g(@NonNull Class<? extends i> cls) {
        return e(cls) != null;
    }

    @Override // io.noties.markwon.e
    @NonNull
    public org.commonmark.node.v h(@NonNull String str) {
        Iterator<i> it = this.f297612e.iterator();
        while (it.hasNext()) {
            str = it.next().i(str);
        }
        return this.f297609b.c(str);
    }

    @Override // io.noties.markwon.e
    @NonNull
    public Spanned i(@NonNull org.commonmark.node.v vVar) {
        Iterator<i> it = this.f297612e.iterator();
        while (it.hasNext()) {
            it.next().b(vVar);
        }
        m mVarA = this.f297610c.a();
        vVar.c(mVarA);
        Iterator<i> it2 = this.f297612e.iterator();
        while (it2.hasNext()) {
            it2.next().h(vVar, mVarA);
        }
        return mVarA.builder().q();
    }

    @Override // io.noties.markwon.e
    @NonNull
    public <P extends i> P j(@NonNull Class<P> cls) {
        P p10 = (P) e(cls);
        if (p10 != null) {
            return p10;
        }
        throw new IllegalStateException(String.format(Locale.US, "Requested plugin `%s` is not registered with this Markwon instance", cls.getName()));
    }

    @Override // io.noties.markwon.e
    public void k(@NonNull TextView textView, @NonNull String str) {
        l(textView, m(str));
    }

    @Override // io.noties.markwon.e
    public void l(@NonNull TextView textView, @NonNull Spanned spanned) {
        Iterator<i> it = this.f297612e.iterator();
        while (it.hasNext()) {
            it.next().k(textView, spanned);
        }
        e.b bVar = this.f297613f;
        if (bVar != null) {
            bVar.a(textView, spanned, this.f297608a, new a(textView));
            return;
        }
        textView.setText(spanned, this.f297608a);
        Iterator<i> it2 = this.f297612e.iterator();
        while (it2.hasNext()) {
            it2.next().c(textView);
        }
    }

    @Override // io.noties.markwon.e
    @NonNull
    public Spanned m(@NonNull String str) {
        Spanned spannedI = i(h(str));
        return (TextUtils.isEmpty(spannedI) && this.f297614g && !TextUtils.isEmpty(str)) ? new SpannableStringBuilder(str) : spannedI;
    }
}
