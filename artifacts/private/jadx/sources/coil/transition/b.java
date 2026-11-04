package coil.transition;

import coil.request.f;
import coil.request.j;
import coil.request.r;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final d f87801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final j f87802b;

    public static final class a implements c.a {
        @Override // coil.transition.c.a
        @NotNull
        public c a(@NotNull d dVar, @NotNull j jVar) {
            return new b(dVar, jVar);
        }

        public boolean equals(@Nullable Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return a.class.hashCode();
        }
    }

    public b(@NotNull d dVar, @NotNull j jVar) {
        this.f87801a = dVar;
        this.f87802b = jVar;
    }

    @Override // coil.transition.c
    public void a() {
        j jVar = this.f87802b;
        if (jVar instanceof r) {
            this.f87801a.onSuccess(((r) jVar).a());
        } else {
            if (!(jVar instanceof f)) {
                throw new k0();
            }
            this.f87801a.onError(((f) jVar).a());
        }
    }
}
