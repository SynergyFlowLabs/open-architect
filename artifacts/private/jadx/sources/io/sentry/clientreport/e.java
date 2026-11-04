package io.sentry.clientreport;

import io.sentry.g6;
import io.sentry.m7;
import io.sentry.n8;
import io.sentry.o;
import io.sentry.p;
import io.sentry.protocol.c0;
import io.sentry.protocol.y;
import io.sentry.x7;
import io.sentry.y7;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final i f305279a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final n8 f305280b;

    public e(@NotNull n8 n8Var) {
        this.f305280b = n8Var;
    }

    private o f(x7 x7Var) {
        if (x7.Event.equals(x7Var)) {
            return o.Error;
        }
        if (x7.Session.equals(x7Var)) {
            return o.Session;
        }
        if (x7.Transaction.equals(x7Var)) {
            return o.Transaction;
        }
        if (x7.UserFeedback.equals(x7Var)) {
            return o.UserReport;
        }
        if (x7.Feedback.equals(x7Var)) {
            return o.Feedback;
        }
        if (x7.Profile.equals(x7Var)) {
            return o.Profile;
        }
        if (x7.ProfileChunk.equals(x7Var)) {
            return o.ProfileChunkUi;
        }
        if (x7.Attachment.equals(x7Var)) {
            return o.Attachment;
        }
        if (x7.CheckIn.equals(x7Var)) {
            return o.Monitor;
        }
        if (x7.ReplayVideo.equals(x7Var)) {
            return o.Replay;
        }
        return x7.Log.equals(x7Var) ? o.LogItem : o.Default;
    }

    private void g(@NotNull f fVar, @NotNull o oVar, @NotNull Long l10) {
        if (this.f305280b.getOnDiscard() != null) {
            try {
                this.f305280b.getOnDiscard().a(fVar, oVar, l10);
            } catch (Throwable th2) {
                this.f305280b.getLogger().a(y7.ERROR, "The onDiscard callback threw an exception.", th2);
            }
        }
    }

    private void h(@NotNull String str, @NotNull String str2, @NotNull Long l10) {
        this.f305279a.a(new d(str, str2), l10);
    }

    private void j(@Nullable c cVar) {
        if (cVar != null) {
            for (g gVar : cVar.a()) {
                h(gVar.c(), gVar.a(), gVar.b());
            }
        }
    }

    @Override // io.sentry.clientreport.h
    public void a(@NotNull f fVar, @NotNull o oVar) {
        b(fVar, oVar, 1L);
    }

    @Override // io.sentry.clientreport.h
    public void b(@NotNull f fVar, @NotNull o oVar, long j10) {
        try {
            h(fVar.getReason(), oVar.getCategory(), Long.valueOf(j10));
            g(fVar, oVar, Long.valueOf(j10));
        } catch (Throwable th2) {
            this.f305280b.getLogger().b(y7.ERROR, th2, "Unable to record lost event.", new Object[0]);
        }
    }

    @Override // io.sentry.clientreport.h
    public void c(@NotNull f fVar, @Nullable m7 m7Var) {
        c0 c0VarU;
        if (m7Var == null) {
            return;
        }
        try {
            x7 x7VarF = m7Var.S().f();
            if (x7.ClientReport.equals(x7VarF)) {
                try {
                    j(m7Var.P(this.f305280b.getSerializer()));
                    return;
                } catch (Exception unused) {
                    this.f305280b.getLogger().c(y7.ERROR, "Unable to restore counts from previous client report.", new Object[0]);
                    return;
                }
            }
            o oVarF = f(x7VarF);
            if (oVarF.equals(o.Transaction) && (c0VarU = m7Var.U(this.f305280b.getSerializer())) != null) {
                List<y> listV0 = c0VarU.v0();
                String reason = fVar.getReason();
                o oVar = o.Span;
                h(reason, oVar.getCategory(), Long.valueOf(((long) listV0.size()) + 1));
                g(fVar, oVar, Long.valueOf(((long) listV0.size()) + 1));
            }
            h(fVar.getReason(), oVarF.getCategory(), 1L);
            g(fVar, oVarF, 1L);
        } catch (Throwable th2) {
            this.f305280b.getLogger().b(y7.ERROR, th2, "Unable to record lost envelope item.", new Object[0]);
        }
    }

    @Override // io.sentry.clientreport.h
    public void d(@NotNull f fVar, @Nullable g6 g6Var) {
        if (g6Var == null) {
            return;
        }
        try {
            Iterator<m7> it = g6Var.e().iterator();
            while (it.hasNext()) {
                c(fVar, it.next());
            }
        } catch (Throwable th2) {
            this.f305280b.getLogger().b(y7.ERROR, th2, "Unable to record lost envelope.", new Object[0]);
        }
    }

    @Override // io.sentry.clientreport.h
    @NotNull
    public g6 e(@NotNull g6 g6Var) {
        c cVarI = i();
        if (cVarI == null) {
            return g6Var;
        }
        try {
            this.f305280b.getLogger().c(y7.DEBUG, "Attaching client report to envelope.", new Object[0]);
            ArrayList arrayList = new ArrayList();
            Iterator<m7> it = g6Var.e().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            arrayList.add(m7.H(this.f305280b.getSerializer(), cVarI));
            return new g6(g6Var.d(), arrayList);
        } catch (Throwable th2) {
            this.f305280b.getLogger().b(y7.ERROR, th2, "Unable to attach client report to envelope.", new Object[0]);
            return g6Var;
        }
    }

    @Nullable
    c i() {
        Date dateD = p.d();
        List<g> listB = this.f305279a.b();
        if (listB.isEmpty()) {
            return null;
        }
        return new c(dateD, listB);
    }
}
