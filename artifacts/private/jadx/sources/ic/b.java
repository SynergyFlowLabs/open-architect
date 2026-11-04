package ic;

import com.planner5d.library.feed.data.d;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.r;
import dagger.internal.s;
import ij.c;

/* JADX INFO: loaded from: classes7.dex */
@r
@e
@s
public final class b implements h<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c<d> f287073a;

    public b(c<d> cVar) {
        this.f287073a = cVar;
    }

    public static b a(c<d> cVar) {
        return new b(cVar);
    }

    public static a c(d dVar) {
        return new a(dVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c(this.f287073a.get());
    }
}
