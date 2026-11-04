package io.noties.markwon;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes8.dex */
abstract class n {

    class a extends n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ m.b f297662a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ g f297663b;

        a(m.b bVar, g gVar) {
            this.f297662a = bVar;
            this.f297663b = gVar;
        }

        @Override // io.noties.markwon.n
        @NonNull
        m a() {
            return this.f297662a.b(this.f297663b, new v());
        }
    }

    n() {
    }

    @NonNull
    static n b(@NonNull m.b bVar, @NonNull g gVar) {
        return new a(bVar, gVar);
    }

    @NonNull
    abstract m a();
}
