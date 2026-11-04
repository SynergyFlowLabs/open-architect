package androidx.work.impl;

import android.content.Context;
import androidx.room.a2;
import androidx.room.b2;
import androidx.room.t2;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@androidx.room.m(autoMigrations = {@androidx.room.g(from = 13, to = 14), @androidx.room.g(from = 14, spec = b.class, to = 15), @androidx.room.g(from = 16, to = 17), @androidx.room.g(from = 17, to = 18), @androidx.room.g(from = 18, to = 19), @androidx.room.g(from = 19, spec = c.class, to = 20)}, entities = {androidx.work.impl.model.a.class, androidx.work.impl.model.v.class, androidx.work.impl.model.a0.class, androidx.work.impl.model.j.class, androidx.work.impl.model.o.class, androidx.work.impl.model.r.class, androidx.work.impl.model.d.class}, version = 20)
@t2({androidx.work.h.class, androidx.work.impl.model.d0.class})
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
public abstract class WorkDatabase extends b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f76566a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final w3.e c(Context context, w3.e.b configuration) {
            Intrinsics.checkNotNullParameter(context, "$context");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            w3.e.b.a aVarA = w3.e.b.f385895f.a(context);
            aVarA.d(configuration.f385897b).c(configuration.f385898c).e(true).a(true);
            return new androidx.sqlite.db.framework.f().a(aVarA.b());
        }

        @oj.n
        @NotNull
        public final WorkDatabase b(@NotNull final Context context, @NotNull Executor queryExecutor, @NotNull androidx.work.b clock, boolean z10) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
            Intrinsics.checkNotNullParameter(clock, "clock");
            return (WorkDatabase) (z10 ? a2.c(context, WorkDatabase.class).e() : a2.a(context, WorkDatabase.class, h0.f76875b).q(new w3.e.c() { // from class: androidx.work.impl.d0
                @Override // w3.e.c
                public final w3.e a(w3.e.b bVar) {
                    return WorkDatabase.a.c(context, bVar);
                }
            })).v(queryExecutor).b(new d(clock)).c(k.f76900c).c(new v(context, 2, 3)).c(l.f76902c).c(m.f76903c).c(new v(context, 5, 6)).c(n.f77093c).c(o.f77094c).c(p.f77096c).c(new t0(context)).c(new v(context, 10, 11)).c(g.f76871c).c(h.f76873c).c(i.f76877c).c(j.f76899c).n().f();
        }

        private a() {
        }
    }

    @oj.n
    @NotNull
    public static final WorkDatabase d(@NotNull Context context, @NotNull Executor executor, @NotNull androidx.work.b bVar, boolean z10) {
        return f76566a.b(context, executor, bVar, z10);
    }

    @NotNull
    public abstract androidx.work.impl.model.b e();

    @NotNull
    public abstract androidx.work.impl.model.e f();

    @NotNull
    public abstract androidx.work.impl.model.g g();

    @NotNull
    public abstract androidx.work.impl.model.k h();

    @NotNull
    public abstract androidx.work.impl.model.p i();

    @NotNull
    public abstract androidx.work.impl.model.s j();

    @NotNull
    public abstract androidx.work.impl.model.w k();

    @NotNull
    public abstract androidx.work.impl.model.b0 l();
}
